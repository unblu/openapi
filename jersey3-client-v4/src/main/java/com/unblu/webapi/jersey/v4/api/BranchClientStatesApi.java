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
import com.unblu.webapi.model.v4.BranchClientStateData;
import com.unblu.webapi.model.v4.BranchClientStateDataQuery;
import com.unblu.webapi.model.v4.BranchClientStateDataResult;

import jakarta.ws.rs.core.GenericType;

public class BranchClientStatesApi {
	private ApiClient apiClient;

	public BranchClientStatesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public BranchClientStatesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * read Returns the branch client state for the given branch client ID&lt;br&gt;
	 * 
	 * @param branchClientId (required)
	 * @return BranchClientStateData
	 * @throws ApiException if fails to make API call
	 */
	public BranchClientStateData branchClientStatesRead(String branchClientId) throws ApiException {
		return branchClientStatesReadWithHttpInfo(branchClientId).getData();
	}

	/**
	 * read Returns the branch client state for the given branch client ID&lt;br&gt;
	 * 
	 * @param branchClientId (required)
	 * @return ApiResponse&lt;BranchClientStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<BranchClientStateData> branchClientStatesReadWithHttpInfo(String branchClientId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'branchClientId' is set
		if (branchClientId == null) {
			throw new ApiException(400, "Missing the required parameter 'branchClientId' when calling branchClientStatesRead");
		}

		// create path and map variables
		String localVarPath = "/branchclientstates/{branchClientId}/read"
				.replaceAll("\\{" + "branchClientId" + "\\}", apiClient.escapeString(branchClientId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<BranchClientStateData> localVarReturnType = new GenericType<BranchClientStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for branch client states in the current account&lt;br&gt;
	 * 
	 * @param branchClientStateDataQuery (required)
	 * @return BranchClientStateDataResult
	 * @throws ApiException if fails to make API call
	 */
	public BranchClientStateDataResult branchClientStatesSearch(BranchClientStateDataQuery branchClientStateDataQuery) throws ApiException {
		return branchClientStatesSearchWithHttpInfo(branchClientStateDataQuery).getData();
	}

	/**
	 * search Search for branch client states in the current account&lt;br&gt;
	 * 
	 * @param branchClientStateDataQuery (required)
	 * @return ApiResponse&lt;BranchClientStateDataResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<BranchClientStateDataResult> branchClientStatesSearchWithHttpInfo(BranchClientStateDataQuery branchClientStateDataQuery) throws ApiException {
		Object localVarPostBody = branchClientStateDataQuery;

		// verify the required parameter 'branchClientStateDataQuery' is set
		if (branchClientStateDataQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'branchClientStateDataQuery' when calling branchClientStatesSearch");
		}

		// create path and map variables
		String localVarPath = "/branchclientstates/search";

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

		GenericType<BranchClientStateDataResult> localVarReturnType = new GenericType<BranchClientStateDataResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
