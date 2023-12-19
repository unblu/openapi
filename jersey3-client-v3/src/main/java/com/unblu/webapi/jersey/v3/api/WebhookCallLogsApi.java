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
import com.unblu.webapi.model.v3.WebhookCallLog;
import com.unblu.webapi.model.v3.WebhookCallLogQuery;
import com.unblu.webapi.model.v3.WebhookCallLogResult;

public class WebhookCallLogsApi {
	private ApiClient apiClient;

	public WebhookCallLogsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public WebhookCallLogsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * read Returns the entity for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the entity which should be returned (optional)
	 * @return WebhookCallLog
	 * @throws ApiException if fails to make API call
	 */
	public WebhookCallLog webhookCallLogsRead(String id) throws ApiException {
		return webhookCallLogsReadWithHttpInfo(id).getData();
	}

	/**
	 * read Returns the entity for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the entity which should be returned (optional)
	 * @return ApiResponse&lt;WebhookCallLog&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebhookCallLog> webhookCallLogsReadWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/webhookcalllogs/read";

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

		GenericType<WebhookCallLog> localVarReturnType = new GenericType<WebhookCallLog>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of the entities with the given IDs. IDs that can&#39;t be found are ignored&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the entities (required)
	 * @return List&lt;WebhookCallLog&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<WebhookCallLog> webhookCallLogsReadMultiple(List<String> requestBody) throws ApiException {
		return webhookCallLogsReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple Gets a list of the entities with the given IDs. IDs that can&#39;t be found are ignored&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the entities (required)
	 * @return ApiResponse&lt;List&lt;WebhookCallLog&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<WebhookCallLog>> webhookCallLogsReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling webhookCallLogsReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/webhookcalllogs/readMultiple";

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

		GenericType<List<WebhookCallLog>> localVarReturnType = new GenericType<List<WebhookCallLog>>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for call logs in the current account&lt;br&gt;
	 * 
	 * @param webhookCallLogQuery (required)
	 * @return WebhookCallLogResult
	 * @throws ApiException if fails to make API call
	 */
	public WebhookCallLogResult webhookCallLogsSearch(WebhookCallLogQuery webhookCallLogQuery) throws ApiException {
		return webhookCallLogsSearchWithHttpInfo(webhookCallLogQuery).getData();
	}

	/**
	 * search Search for call logs in the current account&lt;br&gt;
	 * 
	 * @param webhookCallLogQuery (required)
	 * @return ApiResponse&lt;WebhookCallLogResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebhookCallLogResult> webhookCallLogsSearchWithHttpInfo(WebhookCallLogQuery webhookCallLogQuery) throws ApiException {
		Object localVarPostBody = webhookCallLogQuery;

		// verify the required parameter 'webhookCallLogQuery' is set
		if (webhookCallLogQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'webhookCallLogQuery' when calling webhookCallLogsSearch");
		}

		// create path and map variables
		String localVarPath = "/webhookcalllogs/search";

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

		GenericType<WebhookCallLogResult> localVarReturnType = new GenericType<WebhookCallLogResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
