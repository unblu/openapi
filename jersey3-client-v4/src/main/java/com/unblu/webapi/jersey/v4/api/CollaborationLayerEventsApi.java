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
import com.unblu.webapi.model.v4.CollaborationLayerEventQuery;
import com.unblu.webapi.model.v4.CollaborationLayerEventResult;

import jakarta.ws.rs.core.GenericType;

public class CollaborationLayerEventsApi {
	private ApiClient apiClient;

	public CollaborationLayerEventsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public CollaborationLayerEventsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * search Search for collaboration layer events in the current account&lt;br&gt;
	 * 
	 * @param collaborationLayerEventQuery (required)
	 * @return CollaborationLayerEventResult
	 * @throws ApiException if fails to make API call
	 */
	public CollaborationLayerEventResult collaborationLayerEventsSearch(CollaborationLayerEventQuery collaborationLayerEventQuery) throws ApiException {
		return collaborationLayerEventsSearchWithHttpInfo(collaborationLayerEventQuery).getData();
	}

	/**
	 * search Search for collaboration layer events in the current account&lt;br&gt;
	 * 
	 * @param collaborationLayerEventQuery (required)
	 * @return ApiResponse&lt;CollaborationLayerEventResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CollaborationLayerEventResult> collaborationLayerEventsSearchWithHttpInfo(CollaborationLayerEventQuery collaborationLayerEventQuery) throws ApiException {
		Object localVarPostBody = collaborationLayerEventQuery;

		// verify the required parameter 'collaborationLayerEventQuery' is set
		if (collaborationLayerEventQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'collaborationLayerEventQuery' when calling collaborationLayerEventsSearch");
		}

		// create path and map variables
		String localVarPath = "/collaborationlayerevents/search";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<CollaborationLayerEventResult> localVarReturnType = new GenericType<CollaborationLayerEventResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
