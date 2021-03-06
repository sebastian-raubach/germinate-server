package jhi.germinate.server.resource.maps;

import jhi.germinate.resource.DatasetRequest;
import jhi.germinate.server.Database;
import jhi.germinate.server.auth.CustomVerifier;
import jhi.germinate.server.database.codegen.tables.pojos.ViewTableMaps;
import jhi.germinate.server.resource.BaseServerResource;
import jhi.germinate.server.resource.datasets.DatasetTableResource;
import jhi.germinate.server.util.CollectionUtils;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.restlet.data.Status;
import org.restlet.resource.*;

import java.util.*;

import static jhi.germinate.server.database.codegen.tables.Datasetmembers.*;
import static jhi.germinate.server.database.codegen.tables.Mapdefinitions.*;
import static jhi.germinate.server.database.codegen.tables.Maps.*;

/**
 * @author Sebastian Raubach
 */
public class DatasetMapResource extends BaseServerResource
{
	@Post("json")
	public List<ViewTableMaps> getJson(DatasetRequest request)
	{
		if (request == null || CollectionUtils.isEmpty(request.getDatasetIds()))
			throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);

		CustomVerifier.UserDetails userDetails = CustomVerifier.getFromSession(getRequest(), getResponse());

		List<Integer> datasets = DatasetTableResource.getDatasetIdsForUser(getRequest(), getResponse());
		List<Integer> requestedIds = new ArrayList<>(Arrays.asList(request.getDatasetIds()));

		requestedIds.retainAll(datasets);

		if (CollectionUtils.isEmpty(requestedIds))
			return new ArrayList<>();

		try (DSLContext context = Database.getContext())
		{
			return context.selectDistinct(
				MAPS.ID.as("map_id"),
				MAPS.NAME.as("map_name"),
				MAPS.DESCRIPTION.as("map_description"),
				MAPS.USER_ID.as("user_id"),
				MAPS.VISIBILITY.as("visibility"),
				DSL.countDistinct(MAPDEFINITIONS.MARKER_ID).as("marker_count")
			)
						  .from(MAPS)
						  .leftJoin(MAPDEFINITIONS).on(MAPDEFINITIONS.MAP_ID.eq(MAPS.ID))
						  .leftJoin(DATASETMEMBERS).on(DATASETMEMBERS.FOREIGN_ID.eq(MAPDEFINITIONS.MARKER_ID))
						  .where(MAPS.VISIBILITY.eq(true).or(MAPS.USER_ID.eq(userDetails.getId())))
						  .and(DATASETMEMBERS.DATASET_ID.in(requestedIds))
						  .and(DATASETMEMBERS.DATASETMEMBERTYPE_ID.eq(1))
						  .groupBy(MAPS.ID)
						  .fetch()
						  .into(ViewTableMaps.class);
		}
	}
}
