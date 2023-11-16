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
import com.unblu.webapi.model.v3.Call;
import com.unblu.webapi.model.v3.CallQuery;
import com.unblu.webapi.model.v3.CallResult;

public class CallApi {
	private ApiClient apiClient;

	public CallApi() {
		this(Configuration.getDefaultApiClient());
	}

	public CallApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * read read operation
	 * 
	 * @param id (optional)
	 * @return Call
	 * @throws ApiException if fails to make API call
	 */
	public Call callRead(String id) throws ApiException {
		return callReadWithHttpInfo(id).getData();
	}

	/**
	 * read read operation
	 * 
	 * @param id (optional)
	 * @return ApiResponse&lt;Call&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Call> callReadWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/call/read";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<Call> localVarReturnType = new GenericType<Call>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for call logs in the current account
	 * 
	 * @param callQuery (required)
	 * @return CallResult
	 * @throws ApiException if fails to make API call
	 */
	public CallResult callSearch(CallQuery callQuery) throws ApiException {
		return callSearchWithHttpInfo(callQuery).getData();
	}

	/**
	 * search Search for call logs in the current account
	 * 
	 * @param callQuery (required)
	 * @return ApiResponse&lt;CallResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CallResult> callSearchWithHttpInfo(CallQuery callQuery) throws ApiException {
		Object localVarPostBody = callQuery;

		// verify the required parameter 'callQuery' is set
		if (callQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'callQuery' when calling callSearch");
		}

		// create path and map variables
		String localVarPath = "/call/search";

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

		GenericType<CallResult> localVarReturnType = new GenericType<CallResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
