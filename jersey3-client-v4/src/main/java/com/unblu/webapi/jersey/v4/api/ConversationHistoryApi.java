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
import com.unblu.webapi.model.v4.ConversationHistoryData;
import com.unblu.webapi.model.v4.ConversationHistoryDataResult;
import com.unblu.webapi.model.v4.ConversationHistoryQuery;
import com.unblu.webapi.model.v4.ConversationRecordingHistoryDataList;
import com.unblu.webapi.model.v4.ExpandFields;
import com.unblu.webapi.model.v4.MessageExportQuery;
import com.unblu.webapi.model.v4.MessageExportResult;

import jakarta.ws.rs.core.GenericType;

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
	 * exportMessageLog Export messages belonging to a specific conversation&lt;br&gt;
	 * 
	 * @param conversationId id of the conversation (required)
	 * @param messageExportQuery (required)
	 * @return MessageExportResult
	 * @throws ApiException if fails to make API call
	 */
	public MessageExportResult conversationHistoryExportMessageLog(String conversationId, MessageExportQuery messageExportQuery) throws ApiException {
		return conversationHistoryExportMessageLogWithHttpInfo(conversationId, messageExportQuery).getData();
	}

	/**
	 * exportMessageLog Export messages belonging to a specific conversation&lt;br&gt;
	 * 
	 * @param conversationId id of the conversation (required)
	 * @param messageExportQuery (required)
	 * @return ApiResponse&lt;MessageExportResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<MessageExportResult> conversationHistoryExportMessageLogWithHttpInfo(String conversationId, MessageExportQuery messageExportQuery) throws ApiException {
		Object localVarPostBody = messageExportQuery;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationHistoryExportMessageLog");
		}

		// verify the required parameter 'messageExportQuery' is set
		if (messageExportQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'messageExportQuery' when calling conversationHistoryExportMessageLog");
		}

		// create path and map variables
		String localVarPath = "/conversationhistory/{conversationId}/exportMessageLog"
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

		GenericType<MessageExportResult> localVarReturnType = new GenericType<MessageExportResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getConversationRecordings Gets the list of conversation recordings belonging to a specific conversation&lt;br&gt;
	 * 
	 * @param conversationId ID of the conversation (required)
	 * @return ConversationRecordingHistoryDataList
	 * @throws ApiException if fails to make API call
	 */
	public ConversationRecordingHistoryDataList conversationHistoryGetConversationRecordings(String conversationId) throws ApiException {
		return conversationHistoryGetConversationRecordingsWithHttpInfo(conversationId).getData();
	}

	/**
	 * getConversationRecordings Gets the list of conversation recordings belonging to a specific conversation&lt;br&gt;
	 * 
	 * @param conversationId ID of the conversation (required)
	 * @return ApiResponse&lt;ConversationRecordingHistoryDataList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationRecordingHistoryDataList> conversationHistoryGetConversationRecordingsWithHttpInfo(String conversationId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationHistoryGetConversationRecordings");
		}

		// create path and map variables
		String localVarPath = "/conversationhistory/{conversationId}/getConversationRecordings"
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

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ConversationRecordingHistoryDataList> localVarReturnType = new GenericType<ConversationRecordingHistoryDataList>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the conversation history data for a given conversation.&lt;br&gt;
	 * 
	 * @param conversationId id of the conversation (required)
	 * @param expand (optional)
	 * @return ConversationHistoryData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationHistoryData conversationHistoryRead(String conversationId, List<ExpandFields> expand) throws ApiException {
		return conversationHistoryReadWithHttpInfo(conversationId, expand).getData();
	}

	/**
	 * read Returns the conversation history data for a given conversation.&lt;br&gt;
	 * 
	 * @param conversationId id of the conversation (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationHistoryData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationHistoryData> conversationHistoryReadWithHttpInfo(String conversationId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationHistoryRead");
		}

		// create path and map variables
		String localVarPath = "/conversationhistory/{conversationId}/read"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

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
	 * @return ConversationHistoryDataResult
	 * @throws ApiException if fails to make API call
	 */
	public ConversationHistoryDataResult conversationHistorySearch(ConversationHistoryQuery conversationHistoryQuery, List<ExpandFields> expand) throws ApiException {
		return conversationHistorySearchWithHttpInfo(conversationHistoryQuery, expand).getData();
	}

	/**
	 * search Generic conversation history search.&lt;br&gt;
	 * 
	 * @param conversationHistoryQuery The Conversation history query. (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationHistoryDataResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationHistoryDataResult> conversationHistorySearchWithHttpInfo(ConversationHistoryQuery conversationHistoryQuery, List<ExpandFields> expand) throws ApiException {
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

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ConversationHistoryDataResult> localVarReturnType = new GenericType<ConversationHistoryDataResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
