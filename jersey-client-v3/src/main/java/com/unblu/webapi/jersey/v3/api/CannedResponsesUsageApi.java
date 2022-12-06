package com.unblu.webapi.jersey.v3.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.GenericType;

import com.unblu.webapi.jersey.v3.invoker.ApiClient;
import com.unblu.webapi.jersey.v3.invoker.ApiException;
import com.unblu.webapi.jersey.v3.invoker.ApiResponse;
import com.unblu.webapi.jersey.v3.invoker.Configuration;
import com.unblu.webapi.jersey.v3.invoker.Pair;
import com.unblu.webapi.model.v3.CannedResponseUsageCountQuery;
import com.unblu.webapi.model.v3.CannedResponseUsageQuery;
import com.unblu.webapi.model.v3.CannedResponseUsageResult;
import com.unblu.webapi.model.v3.CountResult;

public class CannedResponsesUsageApi {
	private ApiClient apiClient;

	public CannedResponsesUsageApi() {
		this(Configuration.getDefaultApiClient());
	}

	public CannedResponsesUsageApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * count Retrieve the number of canned response usages according to the search filter provided&lt;br&gt;
	 * 
	 * @param cannedResponseUsageCountQuery to use for the search (required)
	 * @return CountResult
	 * @throws ApiException if fails to make API call
	 */
	public CountResult cannedResponsesUsageCount(CannedResponseUsageCountQuery cannedResponseUsageCountQuery) throws ApiException {
		return cannedResponsesUsageCountWithHttpInfo(cannedResponseUsageCountQuery).getData();
	}

	/**
	 * count Retrieve the number of canned response usages according to the search filter provided&lt;br&gt;
	 * 
	 * @param cannedResponseUsageCountQuery to use for the search (required)
	 * @return ApiResponse&lt;CountResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CountResult> cannedResponsesUsageCountWithHttpInfo(CannedResponseUsageCountQuery cannedResponseUsageCountQuery) throws ApiException {
		Object localVarPostBody = cannedResponseUsageCountQuery;

		// verify the required parameter 'cannedResponseUsageCountQuery' is set
		if (cannedResponseUsageCountQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'cannedResponseUsageCountQuery' when calling cannedResponsesUsageCount");
		}

		// create path and map variables
		String localVarPath = "/cannedresponses/usage/count";

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

		GenericType<CountResult> localVarReturnType = new GenericType<CountResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for usages of canned responses&lt;br&gt;
	 * 
	 * @param cannedResponseUsageQuery to use for the search (required)
	 * @return CannedResponseUsageResult
	 * @throws ApiException if fails to make API call
	 */
	public CannedResponseUsageResult cannedResponsesUsageSearch(CannedResponseUsageQuery cannedResponseUsageQuery) throws ApiException {
		return cannedResponsesUsageSearchWithHttpInfo(cannedResponseUsageQuery).getData();
	}

	/**
	 * search Search for usages of canned responses&lt;br&gt;
	 * 
	 * @param cannedResponseUsageQuery to use for the search (required)
	 * @return ApiResponse&lt;CannedResponseUsageResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CannedResponseUsageResult> cannedResponsesUsageSearchWithHttpInfo(CannedResponseUsageQuery cannedResponseUsageQuery) throws ApiException {
		Object localVarPostBody = cannedResponseUsageQuery;

		// verify the required parameter 'cannedResponseUsageQuery' is set
		if (cannedResponseUsageQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'cannedResponseUsageQuery' when calling cannedResponsesUsageSearch");
		}

		// create path and map variables
		String localVarPath = "/cannedresponses/usage/search";

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

		GenericType<CannedResponseUsageResult> localVarReturnType = new GenericType<CannedResponseUsageResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
