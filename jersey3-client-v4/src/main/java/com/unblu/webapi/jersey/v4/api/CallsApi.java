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
import com.unblu.webapi.model.v4.Call;
import com.unblu.webapi.model.v4.CallQuery;
import com.unblu.webapi.model.v4.CallResult;

import jakarta.ws.rs.core.GenericType;

public class CallsApi {
	private ApiClient apiClient;

	public CallsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public CallsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * read Returns the call with the given ID&lt;br&gt;
	 * 
	 * @param callId (required)
	 * @return Call
	 * @throws ApiException if fails to make API call
	 */
	public Call callsRead(String callId) throws ApiException {
		return callsReadWithHttpInfo(callId).getData();
	}

	/**
	 * read Returns the call with the given ID&lt;br&gt;
	 * 
	 * @param callId (required)
	 * @return ApiResponse&lt;Call&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Call> callsReadWithHttpInfo(String callId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'callId' is set
		if (callId == null) {
			throw new ApiException(400, "Missing the required parameter 'callId' when calling callsRead");
		}

		// create path and map variables
		String localVarPath = "/calls/{callId}/read"
				.replaceAll("\\{" + "callId" + "\\}", apiClient.escapeString(callId.toString()));

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
	public CallResult callsSearch(CallQuery callQuery) throws ApiException {
		return callsSearchWithHttpInfo(callQuery).getData();
	}

	/**
	 * search Search for call logs in the current account
	 * 
	 * @param callQuery (required)
	 * @return ApiResponse&lt;CallResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CallResult> callsSearchWithHttpInfo(CallQuery callQuery) throws ApiException {
		Object localVarPostBody = callQuery;

		// verify the required parameter 'callQuery' is set
		if (callQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'callQuery' when calling callsSearch");
		}

		// create path and map variables
		String localVarPath = "/calls/search";

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
