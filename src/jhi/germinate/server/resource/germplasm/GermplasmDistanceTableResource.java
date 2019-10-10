package jhi.germinate.server.resource.germplasm;

import org.jooq.*;
import org.jooq.impl.DSL;
import org.restlet.data.Status;
import org.restlet.resource.*;

import java.sql.*;
import java.util.List;

import jhi.gatekeeper.resource.PaginatedResult;
import jhi.germinate.resource.*;
import jhi.germinate.server.Database;
import jhi.germinate.server.resource.*;

import static jhi.germinate.server.database.tables.ViewTableGermplasm.*;
import static jhi.germinate.server.database.tables.ViewTableLocations.*;

/**
 * @author Sebastian Raubach
 */
public class GermplasmDistanceTableResource extends PaginatedServerResource implements FilteredResource
{
	@Post("json")
	public PaginatedResult<List<GermplasmDistance>> getJson(PaginatedLocationRequest request)
	{
		if (request.getLatitude() == null || request.getLongitude() == null)
			throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);

		processRequest(request);
		try (Connection conn = Database.getConnection();
			 DSLContext context = Database.getContext(conn))
		{
			SelectSelectStep<? extends Record> select = context.select(
				DSL.asterisk(),
				DSL.cast(
					DSL.acos(
						DSL.sin(
							DSL.rad(VIEW_TABLE_GERMPLASM.LATITUDE))
						   .times(
							   DSL.sin(
								   DSL.rad(request.getLatitude())))
						   .plus(
							   DSL.cos(
								   DSL.rad(VIEW_TABLE_GERMPLASM.LATITUDE))
								  .times(
									  DSL.cos(
										  DSL.rad(request.getLatitude())))
								  .times(
									  DSL.cos(
										  DSL.rad(request.getLongitude())
											 .minus(
												 DSL.rad(VIEW_TABLE_GERMPLASM.LONGITUDE))))))
					   .times(6378.7), Double.class).as("distance")
			);

			if (previousCount == -1)
				select.hint("SQL_CALC_FOUND_ROWS");

			SelectJoinStep<? extends Record> from = select.from(VIEW_TABLE_GERMPLASM);

			from.where(VIEW_TABLE_GERMPLASM.LONGITUDE.isNotNull()
															  .and(VIEW_TABLE_GERMPLASM.LATITUDE.isNotNull()));

			// Filter here!
			filter(from, filters);

			List<GermplasmDistance> result = setPaginationAndOrderBy(from)
				.fetch()
				.into(GermplasmDistance.class);

			long count = previousCount == -1 ? context.fetchOne("SELECT FOUND_ROWS()").into(Long.class) : previousCount;

			return new PaginatedResult<>(result, count);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}
}
