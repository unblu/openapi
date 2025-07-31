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
import com.unblu.webapi.model.v4.CancelIndexingOperationRequest;
import com.unblu.webapi.model.v4.ESearchIndexType;
import com.unblu.webapi.model.v4.MultiSearchIndexIndexingOperationStateData;
import com.unblu.webapi.model.v4.SearchIndexIndexingOperationStateData;
import com.unblu.webapi.model.v4.SearchIndexStateData;
import com.unblu.webapi.model.v4.TriggerIndexingOperationRequest;

import jakarta.ws.rs.core.GenericType;

public class SearchIndexApi {
	private ApiClient apiClient;

	public SearchIndexApi() {
		this(Configuration.getDefaultApiClient());
	}

	public SearchIndexApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * cancelReindexingOperation Cancels a complete indexing operation
	 * 
	 * @param cancelIndexingOperationRequest (required)
	 * @return SearchIndexIndexingOperationStateData
	 * @throws ApiException if fails to make API call
	 */
	public SearchIndexIndexingOperationStateData searchIndexCancelReindexingOperation(CancelIndexingOperationRequest cancelIndexingOperationRequest) throws ApiException {
		return searchIndexCancelReindexingOperationWithHttpInfo(cancelIndexingOperationRequest).getData();
	}

	/**
	 * cancelReindexingOperation Cancels a complete indexing operation
	 * 
	 * @param cancelIndexingOperationRequest (required)
	 * @return ApiResponse&lt;SearchIndexIndexingOperationStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<SearchIndexIndexingOperationStateData> searchIndexCancelReindexingOperationWithHttpInfo(CancelIndexingOperationRequest cancelIndexingOperationRequest) throws ApiException {
		Object localVarPostBody = cancelIndexingOperationRequest;

		// verify the required parameter 'cancelIndexingOperationRequest' is set
		if (cancelIndexingOperationRequest == null) {
			throw new ApiException(400, "Missing the required parameter 'cancelIndexingOperationRequest' when calling searchIndexCancelReindexingOperation");
		}

		// create path and map variables
		String localVarPath = "/searchindex/cancelReindexingOperation";

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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<SearchIndexIndexingOperationStateData> localVarReturnType = new GenericType<SearchIndexIndexingOperationStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getIndexState Returns the status of a search index
	 * 
	 * @param indexType (optional)
	 * @return SearchIndexStateData
	 * @throws ApiException if fails to make API call
	 */
	public SearchIndexStateData searchIndexGetIndexState(ESearchIndexType indexType) throws ApiException {
		return searchIndexGetIndexStateWithHttpInfo(indexType).getData();
	}

	/**
	 * getIndexState Returns the status of a search index
	 * 
	 * @param indexType (optional)
	 * @return ApiResponse&lt;SearchIndexStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<SearchIndexStateData> searchIndexGetIndexStateWithHttpInfo(ESearchIndexType indexType) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/searchindex/getIndexState";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "indexType", indexType));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<SearchIndexStateData> localVarReturnType = new GenericType<SearchIndexStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getIndexingOperationState Returns the status of a complete indexing operation&lt;br&gt;
	 * 
	 * @param indexType (optional)
	 * @return SearchIndexIndexingOperationStateData
	 * @throws ApiException if fails to make API call
	 */
	public SearchIndexIndexingOperationStateData searchIndexGetIndexingOperationState(ESearchIndexType indexType) throws ApiException {
		return searchIndexGetIndexingOperationStateWithHttpInfo(indexType).getData();
	}

	/**
	 * getIndexingOperationState Returns the status of a complete indexing operation&lt;br&gt;
	 * 
	 * @param indexType (optional)
	 * @return ApiResponse&lt;SearchIndexIndexingOperationStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<SearchIndexIndexingOperationStateData> searchIndexGetIndexingOperationStateWithHttpInfo(ESearchIndexType indexType) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/searchindex/getIndexingOperationState";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "indexType", indexType));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<SearchIndexIndexingOperationStateData> localVarReturnType = new GenericType<SearchIndexIndexingOperationStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * triggerReindexingOperation Triggers a complete indexing operation
	 * 
	 * @param triggerIndexingOperationRequest (required)
	 * @return SearchIndexIndexingOperationStateData
	 * @throws ApiException if fails to make API call
	 */
	public SearchIndexIndexingOperationStateData searchIndexTriggerReindexingOperation(TriggerIndexingOperationRequest triggerIndexingOperationRequest) throws ApiException {
		return searchIndexTriggerReindexingOperationWithHttpInfo(triggerIndexingOperationRequest).getData();
	}

	/**
	 * triggerReindexingOperation Triggers a complete indexing operation
	 * 
	 * @param triggerIndexingOperationRequest (required)
	 * @return ApiResponse&lt;SearchIndexIndexingOperationStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<SearchIndexIndexingOperationStateData> searchIndexTriggerReindexingOperationWithHttpInfo(TriggerIndexingOperationRequest triggerIndexingOperationRequest) throws ApiException {
		Object localVarPostBody = triggerIndexingOperationRequest;

		// verify the required parameter 'triggerIndexingOperationRequest' is set
		if (triggerIndexingOperationRequest == null) {
			throw new ApiException(400, "Missing the required parameter 'triggerIndexingOperationRequest' when calling searchIndexTriggerReindexingOperation");
		}

		// create path and map variables
		String localVarPath = "/searchindex/triggerReindexingOperation";

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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<SearchIndexIndexingOperationStateData> localVarReturnType = new GenericType<SearchIndexIndexingOperationStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * triggerReindexingOperations Triggers a complete indexing operation for all the accounts in the system
	 * 
	 * @param triggerIndexingOperationRequest (required)
	 * @return MultiSearchIndexIndexingOperationStateData
	 * @throws ApiException if fails to make API call
	 */
	public MultiSearchIndexIndexingOperationStateData searchIndexTriggerReindexingOperations(TriggerIndexingOperationRequest triggerIndexingOperationRequest) throws ApiException {
		return searchIndexTriggerReindexingOperationsWithHttpInfo(triggerIndexingOperationRequest).getData();
	}

	/**
	 * triggerReindexingOperations Triggers a complete indexing operation for all the accounts in the system
	 * 
	 * @param triggerIndexingOperationRequest (required)
	 * @return ApiResponse&lt;MultiSearchIndexIndexingOperationStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<MultiSearchIndexIndexingOperationStateData> searchIndexTriggerReindexingOperationsWithHttpInfo(TriggerIndexingOperationRequest triggerIndexingOperationRequest) throws ApiException {
		Object localVarPostBody = triggerIndexingOperationRequest;

		// verify the required parameter 'triggerIndexingOperationRequest' is set
		if (triggerIndexingOperationRequest == null) {
			throw new ApiException(400, "Missing the required parameter 'triggerIndexingOperationRequest' when calling searchIndexTriggerReindexingOperations");
		}

		// create path and map variables
		String localVarPath = "/searchindex/triggerReindexingOperations";

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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<MultiSearchIndexIndexingOperationStateData> localVarReturnType = new GenericType<MultiSearchIndexIndexingOperationStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
