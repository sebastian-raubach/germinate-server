package jhi.germinate.server.resource.traits;

import org.jooq.Condition;
import org.restlet.data.Status;
import org.restlet.representation.FileRepresentation;
import org.restlet.resource.*;

import java.util.*;

import jhi.germinate.resource.PaginatedDatasetRequest;
import jhi.germinate.server.resource.PaginatedServerResource;
import jhi.germinate.server.resource.datasets.DatasetTableResource;
import jhi.germinate.server.util.CollectionUtils;

import static jhi.germinate.server.database.tables.ViewTableDatasetAttributes.*;
import static jhi.germinate.server.database.tables.ViewTableGermplasm.*;
import static jhi.germinate.server.database.tables.ViewTableTrialsData.*;

/**
 * @author Sebastian Raubach
 */
public class TrialsDataTableExportResource extends PaginatedServerResource
{
	@Post("json")
	public FileRepresentation getJson(PaginatedDatasetRequest request)
	{
		List<Integer> datasets = DatasetTableResource.getDatasetIdsForUser(getRequest(), getResponse());
		List<Integer> requestedIds = request.getDatasetIds() == null ? null : new ArrayList<>(Arrays.asList(request.getDatasetIds()));

		// If nothing specific was requested, just return everything, else restrict to available datasets
		if (CollectionUtils.isEmpty(requestedIds))
			requestedIds = datasets;
		else
			requestedIds.retainAll(datasets);

		if (CollectionUtils.isEmpty(requestedIds))
			throw new ResourceException(Status.CLIENT_ERROR_NOT_FOUND);

		processRequest(request);

		ExportSettings settings = new ExportSettings();
		settings.conditions = new Condition[] {VIEW_TABLE_TRIALS_DATA.DATASET_ID.in(requestedIds)};
		return export(VIEW_TABLE_TRIALS_DATA, "trials-data-table-", settings);
	}
}
