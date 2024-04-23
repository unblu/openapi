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
import com.unblu.webapi.model.v4.CannedResponse;
import com.unblu.webapi.model.v4.CannedResponseList;
import com.unblu.webapi.model.v4.CannedResponseQuery;
import com.unblu.webapi.model.v4.CannedResponseResult;

import jakarta.ws.rs.core.GenericType;

public class CannedResponsesApi {
	private ApiClient apiClient;

	public CannedResponsesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public CannedResponsesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
	 * 
	 * @param cannedResponse The entity to create (required)
	 * @return CannedResponse
	 * @throws ApiException if fails to make API call
	 */
	public CannedResponse cannedResponsesCreate(CannedResponse cannedResponse) throws ApiException {
		return cannedResponsesCreateWithHttpInfo(cannedResponse).getData();
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
	 * 
	 * @param cannedResponse The entity to create (required)
	 * @return ApiResponse&lt;CannedResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CannedResponse> cannedResponsesCreateWithHttpInfo(CannedResponse cannedResponse) throws ApiException {
		Object localVarPostBody = cannedResponse;

		// verify the required parameter 'cannedResponse' is set
		if (cannedResponse == null) {
			throw new ApiException(400, "Missing the required parameter 'cannedResponse' when calling cannedResponsesCreate");
		}

		// create path and map variables
		String localVarPath = "/cannedresponses/create";

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

		GenericType<CannedResponse> localVarReturnType = new GenericType<CannedResponse>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the canned response with the given ID&lt;br&gt;
	 * 
	 * @param cannedResponseId The ID of the canned response to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public void cannedResponsesDelete(String cannedResponseId) throws ApiException {

		cannedResponsesDeleteWithHttpInfo(cannedResponseId);
	}

	/**
	 * delete Deletes the canned response with the given ID&lt;br&gt;
	 * 
	 * @param cannedResponseId The ID of the canned response to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> cannedResponsesDeleteWithHttpInfo(String cannedResponseId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'cannedResponseId' is set
		if (cannedResponseId == null) {
			throw new ApiException(400, "Missing the required parameter 'cannedResponseId' when calling cannedResponsesDelete");
		}

		// create path and map variables
		String localVarPath = "/cannedresponses/{cannedResponseId}/delete"
				.replaceAll("\\{" + "cannedResponseId" + "\\}", apiClient.escapeString(cannedResponseId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = {

		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * read Returns the canned response with the given ID&lt;br&gt;
	 * 
	 * @param cannedResponseId ID of the canned response to return (required)
	 * @return CannedResponse
	 * @throws ApiException if fails to make API call
	 */
	public CannedResponse cannedResponsesRead(String cannedResponseId) throws ApiException {
		return cannedResponsesReadWithHttpInfo(cannedResponseId).getData();
	}

	/**
	 * read Returns the canned response with the given ID&lt;br&gt;
	 * 
	 * @param cannedResponseId ID of the canned response to return (required)
	 * @return ApiResponse&lt;CannedResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CannedResponse> cannedResponsesReadWithHttpInfo(String cannedResponseId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'cannedResponseId' is set
		if (cannedResponseId == null) {
			throw new ApiException(400, "Missing the required parameter 'cannedResponseId' when calling cannedResponsesRead");
		}

		// create path and map variables
		String localVarPath = "/cannedresponses/{cannedResponseId}/read"
				.replaceAll("\\{" + "cannedResponseId" + "\\}", apiClient.escapeString(cannedResponseId.toString()));

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

		GenericType<CannedResponse> localVarReturnType = new GenericType<CannedResponse>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of canned responses for the given IDs&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which the canned responses should be fetched (required)
	 * @return CannedResponseList
	 * @throws ApiException if fails to make API call
	 */
	public CannedResponseList cannedResponsesReadMultiple(List<String> requestBody) throws ApiException {
		return cannedResponsesReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple Gets a list of canned responses for the given IDs&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which the canned responses should be fetched (required)
	 * @return ApiResponse&lt;CannedResponseList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CannedResponseList> cannedResponsesReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling cannedResponsesReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/cannedresponses/readMultiple";

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

		GenericType<CannedResponseList> localVarReturnType = new GenericType<CannedResponseList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for canned responses according to the policy that applies to the user making the API call&lt;br&gt;
	 * 
	 * @param cannedResponseQuery (required)
	 * @return CannedResponseResult
	 * @throws ApiException if fails to make API call
	 */
	public CannedResponseResult cannedResponsesSearch(CannedResponseQuery cannedResponseQuery) throws ApiException {
		return cannedResponsesSearchWithHttpInfo(cannedResponseQuery).getData();
	}

	/**
	 * search Search for canned responses according to the policy that applies to the user making the API call&lt;br&gt;
	 * 
	 * @param cannedResponseQuery (required)
	 * @return ApiResponse&lt;CannedResponseResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CannedResponseResult> cannedResponsesSearchWithHttpInfo(CannedResponseQuery cannedResponseQuery) throws ApiException {
		Object localVarPostBody = cannedResponseQuery;

		// verify the required parameter 'cannedResponseQuery' is set
		if (cannedResponseQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'cannedResponseQuery' when calling cannedResponsesSearch");
		}

		// create path and map variables
		String localVarPath = "/cannedresponses/search";

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

		GenericType<CannedResponseResult> localVarReturnType = new GenericType<CannedResponseResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param cannedResponse The entity to update (required)
	 * @return CannedResponse
	 * @throws ApiException if fails to make API call
	 */
	public CannedResponse cannedResponsesUpdate(CannedResponse cannedResponse) throws ApiException {
		return cannedResponsesUpdateWithHttpInfo(cannedResponse).getData();
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param cannedResponse The entity to update (required)
	 * @return ApiResponse&lt;CannedResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CannedResponse> cannedResponsesUpdateWithHttpInfo(CannedResponse cannedResponse) throws ApiException {
		Object localVarPostBody = cannedResponse;

		// verify the required parameter 'cannedResponse' is set
		if (cannedResponse == null) {
			throw new ApiException(400, "Missing the required parameter 'cannedResponse' when calling cannedResponsesUpdate");
		}

		// create path and map variables
		String localVarPath = "/cannedresponses/update";

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

		GenericType<CannedResponse> localVarReturnType = new GenericType<CannedResponse>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
