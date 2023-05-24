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
import com.unblu.webapi.model.v3.ConversationHistoryData;
import com.unblu.webapi.model.v3.ConversationQuery;
import com.unblu.webapi.model.v3.MessageQuery;
import com.unblu.webapi.model.v3.MessageResult;

public class ConversationHistoryApi {
	private ApiClient apiClient;

	public ConversationHistoryApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ConversationHistoryApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * read Returns the conversation history data for a given conversation.&lt;br&gt;
	 * 
	 * @param conversationId id of the conversation (optional)
	 * @param expand (optional)
	 * @return ConversationHistoryData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationHistoryData conversationHistoryRead(String conversationId, String expand) throws ApiException {
		return conversationHistoryReadWithHttpInfo(conversationId, expand).getData();
	}

	/**
	 * read Returns the conversation history data for a given conversation.&lt;br&gt;
	 * 
	 * @param conversationId id of the conversation (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationHistoryData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationHistoryData> conversationHistoryReadWithHttpInfo(String conversationId, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/conversationhistory/read";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "conversationId", conversationId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ConversationHistoryData> localVarReturnType = new GenericType<ConversationHistoryData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Generic conversation history search.&lt;br&gt;
	 * 
	 * @param conversationQuery The Conversation history query. (required)
	 * @param expand (optional)
	 * @return List&lt;ConversationHistoryData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<ConversationHistoryData> conversationHistorySearch(ConversationQuery conversationQuery, String expand) throws ApiException {
		return conversationHistorySearchWithHttpInfo(conversationQuery, expand).getData();
	}

	/**
	 * search Generic conversation history search.&lt;br&gt;
	 * 
	 * @param conversationQuery The Conversation history query. (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;List&lt;ConversationHistoryData&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<ConversationHistoryData>> conversationHistorySearchWithHttpInfo(ConversationQuery conversationQuery, String expand) throws ApiException {
		Object localVarPostBody = conversationQuery;

		// verify the required parameter 'conversationQuery' is set
		if (conversationQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationQuery' when calling conversationHistorySearch");
		}

		// create path and map variables
		String localVarPath = "/conversationhistory/search";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<List<ConversationHistoryData>> localVarReturnType = new GenericType<List<ConversationHistoryData>>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * searchMessages Search messages belonging to a specific conversation&lt;br&gt;
	 * 
	 * @param conversationId id of the conversation (required)
	 * @param messageQuery (required)
	 * @return MessageResult
	 * @throws ApiException if fails to make API call
	 */
	public MessageResult conversationHistorySearchMessages(String conversationId, MessageQuery messageQuery) throws ApiException {
		return conversationHistorySearchMessagesWithHttpInfo(conversationId, messageQuery).getData();
	}

	/**
	 * searchMessages Search messages belonging to a specific conversation&lt;br&gt;
	 * 
	 * @param conversationId id of the conversation (required)
	 * @param messageQuery (required)
	 * @return ApiResponse&lt;MessageResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<MessageResult> conversationHistorySearchMessagesWithHttpInfo(String conversationId, MessageQuery messageQuery) throws ApiException {
		Object localVarPostBody = messageQuery;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationHistorySearchMessages");
		}

		// verify the required parameter 'messageQuery' is set
		if (messageQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'messageQuery' when calling conversationHistorySearchMessages");
		}

		// create path and map variables
		String localVarPath = "/conversationhistory/{conversationId}/searchMessages"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

		GenericType<MessageResult> localVarReturnType = new GenericType<MessageResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
