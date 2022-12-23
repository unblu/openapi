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
import com.unblu.webapi.model.v3.ConversationHistoryQuery;
import com.unblu.webapi.model.v3.ConversationRecordingHistoryData;
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
	 * getConversationRecordings Gets the list of conversation recordings belonging to a specific conversation&lt;br&gt;
	 * 
	 * @param conversationId ID of the conversation (optional)
	 * @return List&lt;ConversationRecordingHistoryData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<ConversationRecordingHistoryData> conversationHistoryGetConversationRecordings(String conversationId) throws ApiException {
		return conversationHistoryGetConversationRecordingsWithHttpInfo(conversationId).getData();
	}

	/**
	 * getConversationRecordings Gets the list of conversation recordings belonging to a specific conversation&lt;br&gt;
	 * 
	 * @param conversationId ID of the conversation (optional)
	 * @return ApiResponse&lt;List&lt;ConversationRecordingHistoryData&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<ConversationRecordingHistoryData>> conversationHistoryGetConversationRecordingsWithHttpInfo(String conversationId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/conversationhistory/getConversationRecordings";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "conversationId", conversationId));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<List<ConversationRecordingHistoryData>> localVarReturnType = new GenericType<List<ConversationRecordingHistoryData>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getRecordedMinutes Returns the length of conversation recording done between the given dates. If account id is specified, the result is restricted to the
	 * given account. If there were no recordings done in the given time for the account (if specified), zero is returned. &lt;/br&gt; Dates are rounded to the
	 * beginning/end of day.&lt;br&gt;
	 * 
	 * @param fromTime date from which to count the conversation recording length. Value is rounded to the beginning of the day. (optional)
	 * @param toTime date to which to count the conversation recording length. Value is rounded to the end of the day. (optional)
	 * @param accountId optional (optional)
	 * @return Long
	 * @throws ApiException if fails to make API call
	 */
	public Long conversationHistoryGetRecordedMinutes(Long fromTime, Long toTime, String accountId) throws ApiException {
		return conversationHistoryGetRecordedMinutesWithHttpInfo(fromTime, toTime, accountId).getData();
	}

	/**
	 * getRecordedMinutes Returns the length of conversation recording done between the given dates. If account id is specified, the result is restricted to the
	 * given account. If there were no recordings done in the given time for the account (if specified), zero is returned. &lt;/br&gt; Dates are rounded to the
	 * beginning/end of day.&lt;br&gt;
	 * 
	 * @param fromTime date from which to count the conversation recording length. Value is rounded to the beginning of the day. (optional)
	 * @param toTime date to which to count the conversation recording length. Value is rounded to the end of the day. (optional)
	 * @param accountId optional (optional)
	 * @return ApiResponse&lt;Long&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Long> conversationHistoryGetRecordedMinutesWithHttpInfo(Long fromTime, Long toTime, String accountId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/conversationhistory/getRecordedMinutes";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromTime", fromTime));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "toTime", toTime));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountId", accountId));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<Long> localVarReturnType = new GenericType<Long>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
	 * @param conversationHistoryQuery The Conversation history query. (required)
	 * @param expand (optional)
	 * @return List&lt;ConversationHistoryData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<ConversationHistoryData> conversationHistorySearch(ConversationHistoryQuery conversationHistoryQuery, String expand) throws ApiException {
		return conversationHistorySearchWithHttpInfo(conversationHistoryQuery, expand).getData();
	}

	/**
	 * search Generic conversation history search.&lt;br&gt;
	 * 
	 * @param conversationHistoryQuery The Conversation history query. (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;List&lt;ConversationHistoryData&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<ConversationHistoryData>> conversationHistorySearchWithHttpInfo(ConversationHistoryQuery conversationHistoryQuery, String expand) throws ApiException {
		Object localVarPostBody = conversationHistoryQuery;

		// verify the required parameter 'conversationHistoryQuery' is set
		if (conversationHistoryQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationHistoryQuery' when calling conversationHistorySearch");
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
