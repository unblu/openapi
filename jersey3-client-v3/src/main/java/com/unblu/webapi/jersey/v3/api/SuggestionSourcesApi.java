package com.unblu.webapi.jersey.v3.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.ws.rs.core.GenericType;

import com.unblu.webapi.jersey.v3.invoker.ApiClient;
import com.unblu.webapi.jersey.v3.invoker.ApiException;
import com.unblu.webapi.jersey.v3.invoker.ApiResponse;
import com.unblu.webapi.jersey.v3.invoker.Configuration;
import com.unblu.webapi.jersey.v3.invoker.Pair;
import com.unblu.webapi.model.v3.OutboundPingResponse;
import com.unblu.webapi.model.v3.SuggestionSourceData;
import com.unblu.webapi.model.v3.SuggestionSourceQuery;
import com.unblu.webapi.model.v3.SuggestionSourceResult;
import com.unblu.webapi.model.v3.SuggestionSourcesPingOutboundEndpointBody;

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
	 * @param id The ID of the suggestion source which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void suggestionSourcesDelete(String id) throws ApiException {

		suggestionSourcesDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes an existing suggestion source&lt;br&gt;
	 * 
	 * @param id The ID of the suggestion source which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> suggestionSourcesDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/suggestionsources/delete";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

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
	 * pingOutboundEndpoint Emits a &#x60;OutboundPingRequest&#x60; on the endpoint of the suggestion source. &lt;p&gt; The endpoint is expected to return a
	 * OutboundPingResponse&lt;br&gt;
	 * 
	 * @param suggestionSourcesPingOutboundEndpointBody (required)
	 * @return OutboundPingResponse
	 * @throws ApiException if fails to make API call
	 */
	public OutboundPingResponse suggestionSourcesPingOutboundEndpoint(SuggestionSourcesPingOutboundEndpointBody suggestionSourcesPingOutboundEndpointBody) throws ApiException {
		return suggestionSourcesPingOutboundEndpointWithHttpInfo(suggestionSourcesPingOutboundEndpointBody).getData();
	}

	/**
	 * pingOutboundEndpoint Emits a &#x60;OutboundPingRequest&#x60; on the endpoint of the suggestion source. &lt;p&gt; The endpoint is expected to return a
	 * OutboundPingResponse&lt;br&gt;
	 * 
	 * @param suggestionSourcesPingOutboundEndpointBody (required)
	 * @return ApiResponse&lt;OutboundPingResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<OutboundPingResponse> suggestionSourcesPingOutboundEndpointWithHttpInfo(SuggestionSourcesPingOutboundEndpointBody suggestionSourcesPingOutboundEndpointBody) throws ApiException {
		Object localVarPostBody = suggestionSourcesPingOutboundEndpointBody;

		// verify the required parameter 'suggestionSourcesPingOutboundEndpointBody' is set
		if (suggestionSourcesPingOutboundEndpointBody == null) {
			throw new ApiException(400, "Missing the required parameter 'suggestionSourcesPingOutboundEndpointBody' when calling suggestionSourcesPingOutboundEndpoint");
		}

		// create path and map variables
		String localVarPath = "/suggestionsources/pingOutboundEndpoint";

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

		GenericType<OutboundPingResponse> localVarReturnType = new GenericType<OutboundPingResponse>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Reads an existing suggestion source.&lt;br&gt;
	 * 
	 * @param id The ID of the suggestion source. (optional)
	 * @return SuggestionSourceData
	 * @throws ApiException if fails to make API call
	 */
	public SuggestionSourceData suggestionSourcesRead(String id) throws ApiException {
		return suggestionSourcesReadWithHttpInfo(id).getData();
	}

	/**
	 * read Reads an existing suggestion source.&lt;br&gt;
	 * 
	 * @param id The ID of the suggestion source. (optional)
	 * @return ApiResponse&lt;SuggestionSourceData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<SuggestionSourceData> suggestionSourcesReadWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/suggestionsources/read";

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
