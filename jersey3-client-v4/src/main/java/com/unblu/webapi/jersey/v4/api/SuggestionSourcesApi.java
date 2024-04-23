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
import com.unblu.webapi.model.v4.PingResponse;
import com.unblu.webapi.model.v4.SuggestionSourceData;
import com.unblu.webapi.model.v4.SuggestionSourceQuery;
import com.unblu.webapi.model.v4.SuggestionSourceResult;

import jakarta.ws.rs.core.GenericType;

public class SuggestionSourcesApi {
	private ApiClient apiClient;

	public SuggestionSourcesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public SuggestionSourcesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates a new suggestion source&lt;br&gt;
	 * 
	 * @param suggestionSourceData The suggestion source to create. (required)
	 * @return SuggestionSourceData
	 * @throws ApiException if fails to make API call
	 */
	public SuggestionSourceData suggestionSourcesCreate(SuggestionSourceData suggestionSourceData) throws ApiException {
		return suggestionSourcesCreateWithHttpInfo(suggestionSourceData).getData();
	}

	/**
	 * create Creates a new suggestion source&lt;br&gt;
	 * 
	 * @param suggestionSourceData The suggestion source to create. (required)
	 * @return ApiResponse&lt;SuggestionSourceData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<SuggestionSourceData> suggestionSourcesCreateWithHttpInfo(SuggestionSourceData suggestionSourceData) throws ApiException {
		Object localVarPostBody = suggestionSourceData;

		// verify the required parameter 'suggestionSourceData' is set
		if (suggestionSourceData == null) {
			throw new ApiException(400, "Missing the required parameter 'suggestionSourceData' when calling suggestionSourcesCreate");
		}

		// create path and map variables
		String localVarPath = "/suggestionsources/create";

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

		GenericType<SuggestionSourceData> localVarReturnType = new GenericType<SuggestionSourceData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes an existing suggestion source&lt;br&gt;
	 * 
	 * @param suggestionSourceId The ID of the suggestion source which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void suggestionSourcesDelete(String suggestionSourceId) throws ApiException {

		suggestionSourcesDeleteWithHttpInfo(suggestionSourceId);
	}

	/**
	 * delete Deletes an existing suggestion source&lt;br&gt;
	 * 
	 * @param suggestionSourceId The ID of the suggestion source which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> suggestionSourcesDeleteWithHttpInfo(String suggestionSourceId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'suggestionSourceId' is set
		if (suggestionSourceId == null) {
			throw new ApiException(400, "Missing the required parameter 'suggestionSourceId' when calling suggestionSourcesDelete");
		}

		// create path and map variables
		String localVarPath = "/suggestionsources/{suggestionSourceId}/delete"
				.replaceAll("\\{" + "suggestionSourceId" + "\\}", apiClient.escapeString(suggestionSourceId.toString()));

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
	 * getByName Searches for an existing suggestion source with the given name.&lt;br&gt;
	 * 
	 * @param name Name of the suggestion source. (optional)
	 * @return SuggestionSourceData
	 * @throws ApiException if fails to make API call
	 */
	public SuggestionSourceData suggestionSourcesGetByName(String name) throws ApiException {
		return suggestionSourcesGetByNameWithHttpInfo(name).getData();
	}

	/**
	 * getByName Searches for an existing suggestion source with the given name.&lt;br&gt;
	 * 
	 * @param name Name of the suggestion source. (optional)
	 * @return ApiResponse&lt;SuggestionSourceData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<SuggestionSourceData> suggestionSourcesGetByNameWithHttpInfo(String name) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/suggestionsources/getByName";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<SuggestionSourceData> localVarReturnType = new GenericType<SuggestionSourceData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Reads an existing suggestion source.&lt;br&gt;
	 * 
	 * @param suggestionSourceId The ID of the suggestion source. (required)
	 * @return SuggestionSourceData
	 * @throws ApiException if fails to make API call
	 */
	public SuggestionSourceData suggestionSourcesRead(String suggestionSourceId) throws ApiException {
		return suggestionSourcesReadWithHttpInfo(suggestionSourceId).getData();
	}

	/**
	 * read Reads an existing suggestion source.&lt;br&gt;
	 * 
	 * @param suggestionSourceId The ID of the suggestion source. (required)
	 * @return ApiResponse&lt;SuggestionSourceData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<SuggestionSourceData> suggestionSourcesReadWithHttpInfo(String suggestionSourceId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'suggestionSourceId' is set
		if (suggestionSourceId == null) {
			throw new ApiException(400, "Missing the required parameter 'suggestionSourceId' when calling suggestionSourcesRead");
		}

		// create path and map variables
		String localVarPath = "/suggestionsources/{suggestionSourceId}/read"
				.replaceAll("\\{" + "suggestionSourceId" + "\\}", apiClient.escapeString(suggestionSourceId.toString()));

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

		GenericType<SuggestionSourceData> localVarReturnType = new GenericType<SuggestionSourceData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for suggestion sources in the current account&lt;br&gt;
	 * 
	 * @param suggestionSourceQuery (required)
	 * @return SuggestionSourceResult
	 * @throws ApiException if fails to make API call
	 */
	public SuggestionSourceResult suggestionSourcesSearch(SuggestionSourceQuery suggestionSourceQuery) throws ApiException {
		return suggestionSourcesSearchWithHttpInfo(suggestionSourceQuery).getData();
	}

	/**
	 * search Search for suggestion sources in the current account&lt;br&gt;
	 * 
	 * @param suggestionSourceQuery (required)
	 * @return ApiResponse&lt;SuggestionSourceResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<SuggestionSourceResult> suggestionSourcesSearchWithHttpInfo(SuggestionSourceQuery suggestionSourceQuery) throws ApiException {
		Object localVarPostBody = suggestionSourceQuery;

		// verify the required parameter 'suggestionSourceQuery' is set
		if (suggestionSourceQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'suggestionSourceQuery' when calling suggestionSourcesSearch");
		}

		// create path and map variables
		String localVarPath = "/suggestionsources/search";

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

		GenericType<SuggestionSourceResult> localVarReturnType = new GenericType<SuggestionSourceResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * sendPing Emits a &#x60;PingRequest&#x60; on the endpoint of the suggestion source. &lt;p&gt; The endpoint is expected to return a
	 * OutboundPingResponse&lt;br&gt;
	 * 
	 * @param suggestionSourceId The ID of the suggestion source (required)
	 * @return PingResponse
	 * @throws ApiException if fails to make API call
	 */
	public PingResponse suggestionSourcesSendPing(String suggestionSourceId) throws ApiException {
		return suggestionSourcesSendPingWithHttpInfo(suggestionSourceId).getData();
	}

	/**
	 * sendPing Emits a &#x60;PingRequest&#x60; on the endpoint of the suggestion source. &lt;p&gt; The endpoint is expected to return a
	 * OutboundPingResponse&lt;br&gt;
	 * 
	 * @param suggestionSourceId The ID of the suggestion source (required)
	 * @return ApiResponse&lt;PingResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PingResponse> suggestionSourcesSendPingWithHttpInfo(String suggestionSourceId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'suggestionSourceId' is set
		if (suggestionSourceId == null) {
			throw new ApiException(400, "Missing the required parameter 'suggestionSourceId' when calling suggestionSourcesSendPing");
		}

		// create path and map variables
		String localVarPath = "/suggestionsources/{suggestionSourceId}/sendPing"
				.replaceAll("\\{" + "suggestionSourceId" + "\\}", apiClient.escapeString(suggestionSourceId.toString()));

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

		GenericType<PingResponse> localVarReturnType = new GenericType<PingResponse>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates an existing suggestion source.&lt;br&gt;
	 * 
	 * @param suggestionSourceData (required)
	 * @return SuggestionSourceData
	 * @throws ApiException if fails to make API call
	 */
	public SuggestionSourceData suggestionSourcesUpdate(SuggestionSourceData suggestionSourceData) throws ApiException {
		return suggestionSourcesUpdateWithHttpInfo(suggestionSourceData).getData();
	}

	/**
	 * update Updates an existing suggestion source.&lt;br&gt;
	 * 
	 * @param suggestionSourceData (required)
	 * @return ApiResponse&lt;SuggestionSourceData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<SuggestionSourceData> suggestionSourcesUpdateWithHttpInfo(SuggestionSourceData suggestionSourceData) throws ApiException {
		Object localVarPostBody = suggestionSourceData;

		// verify the required parameter 'suggestionSourceData' is set
		if (suggestionSourceData == null) {
			throw new ApiException(400, "Missing the required parameter 'suggestionSourceData' when calling suggestionSourcesUpdate");
		}

		// create path and map variables
		String localVarPath = "/suggestionsources/update";

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

		GenericType<SuggestionSourceData> localVarReturnType = new GenericType<SuggestionSourceData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
