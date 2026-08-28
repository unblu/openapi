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
import com.unblu.webapi.model.v4.ConversationPresenceData;
import com.unblu.webapi.model.v4.ConversationPresenceQuery;
import com.unblu.webapi.model.v4.ConversationPresenceResult;

import jakarta.ws.rs.core.GenericType;

public class ConversationPresencesApi {
	private ApiClient apiClient;

	public ConversationPresencesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ConversationPresencesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * read Read a &#x60;ConversationPresenceData&#x60; by its ID.&lt;br&gt;
	 * 
	 * @param conversationPresenceId the ID of the conversation presence to read (required)
	 * @return ConversationPresenceData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationPresenceData conversationPresencesRead(String conversationPresenceId) throws ApiException {
		return conversationPresencesReadWithHttpInfo(conversationPresenceId).getData();
	}

	/**
	 * read Read a &#x60;ConversationPresenceData&#x60; by its ID.&lt;br&gt;
	 * 
	 * @param conversationPresenceId the ID of the conversation presence to read (required)
	 * @return ApiResponse&lt;ConversationPresenceData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationPresenceData> conversationPresencesReadWithHttpInfo(String conversationPresenceId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'conversationPresenceId' is set
		if (conversationPresenceId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationPresenceId' when calling conversationPresencesRead");
		}

		// create path and map variables
		String localVarPath = "/conversationpresences/{conversationPresenceId}/read"
				.replaceAll("\\{" + "conversationPresenceId" + "\\}", apiClient.escapeString(conversationPresenceId.toString()));

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<ConversationPresenceData> localVarReturnType = new GenericType<ConversationPresenceData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for conversation presences in the current account.&lt;br&gt;
	 * 
	 * @param conversationPresenceQuery the search query, supporting filters by conversationId, personId, joinedTimestamp and leftTimestamp (required)
	 * @return ConversationPresenceResult
	 * @throws ApiException if fails to make API call
	 */
	public ConversationPresenceResult conversationPresencesSearch(ConversationPresenceQuery conversationPresenceQuery) throws ApiException {
		return conversationPresencesSearchWithHttpInfo(conversationPresenceQuery).getData();
	}

	/**
	 * search Search for conversation presences in the current account.&lt;br&gt;
	 * 
	 * @param conversationPresenceQuery the search query, supporting filters by conversationId, personId, joinedTimestamp and leftTimestamp (required)
	 * @return ApiResponse&lt;ConversationPresenceResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationPresenceResult> conversationPresencesSearchWithHttpInfo(ConversationPresenceQuery conversationPresenceQuery) throws ApiException {
		Object localVarPostBody = conversationPresenceQuery;

		// verify the required parameter 'conversationPresenceQuery' is set
		if (conversationPresenceQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationPresenceQuery' when calling conversationPresencesSearch");
		}

		// create path and map variables
		String localVarPath = "/conversationpresences/search";

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

		GenericType<ConversationPresenceResult> localVarReturnType = new GenericType<ConversationPresenceResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
