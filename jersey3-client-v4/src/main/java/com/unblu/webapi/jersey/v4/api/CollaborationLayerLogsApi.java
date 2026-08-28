package com.unblu.webapi.jersey.v4.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unblu.webapi.jersey.v4.invoker.ApiClient;
import com.unblu.webapi.jersey.v4.invoker.ApiException;
import com.unblu.webapi.jersey.v4.invoker.ApiResponse;
import com.unblu.webapi.jersey.v4.invoker.Configuration;
import com.unblu.webapi.jersey.v4.invoker.Pair;
import com.unblu.webapi.model.v4.CollaborationLayerLogEntryQuery;
import com.unblu.webapi.model.v4.CollaborationLayerLogEntryResult;
import com.unblu.webapi.model.v4.ExpandFields;

import jakarta.ws.rs.core.GenericType;

public class CollaborationLayerLogsApi {
	private ApiClient apiClient;

	public CollaborationLayerLogsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public CollaborationLayerLogsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * search Search for CollaborationLayerLogEntry in the current account&lt;br&gt;
	 * 
	 * @param collaborationLayerLogEntryQuery (required)
	 * @param expand (optional)
	 * @return CollaborationLayerLogEntryResult
	 * @throws ApiException if fails to make API call
	 */
	public CollaborationLayerLogEntryResult collaborationLayerLogsSearch(CollaborationLayerLogEntryQuery collaborationLayerLogEntryQuery, List<ExpandFields> expand) throws ApiException {
		return collaborationLayerLogsSearchWithHttpInfo(collaborationLayerLogEntryQuery, expand).getData();
	}

	/**
	 * search Search for CollaborationLayerLogEntry in the current account&lt;br&gt;
	 * 
	 * @param collaborationLayerLogEntryQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;CollaborationLayerLogEntryResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CollaborationLayerLogEntryResult> collaborationLayerLogsSearchWithHttpInfo(CollaborationLayerLogEntryQuery collaborationLayerLogEntryQuery, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = collaborationLayerLogEntryQuery;

		// verify the required parameter 'collaborationLayerLogEntryQuery' is set
		if (collaborationLayerLogEntryQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'collaborationLayerLogEntryQuery' when calling collaborationLayerLogsSearch");
		}

		// create path and map variables
		String localVarPath = "/collaborationlayerlogs/search";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<CollaborationLayerLogEntryResult> localVarReturnType = new GenericType<CollaborationLayerLogEntryResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
