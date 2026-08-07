package com.unblu.webapi.jersey.v4.api;

import com.unblu.webapi.jersey.v4.invoker.ApiException;
import com.unblu.webapi.jersey.v4.invoker.ApiClient;
import com.unblu.webapi.jersey.v4.invoker.ApiResponse;
import com.unblu.webapi.jersey.v4.invoker.Configuration;
import com.unblu.webapi.jersey.v4.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.unblu.webapi.model.v4.ConversationSummaryAvailableTranslations;
import com.unblu.webapi.model.v4.ConversationSummaryData;
import com.unblu.webapi.model.v4.ConversationSummaryQuery;
import com.unblu.webapi.model.v4.ConversationSummaryResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConversationSummariesApi {
	private ApiClient apiClient;

	public ConversationSummariesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ConversationSummariesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * getAvailableTranslations getAvailableTranslations operation
	 * 
	 * @param conversationSummaryId The ID of the conversation summary used for the research (required)
	 * @return ConversationSummaryAvailableTranslations
	 * @throws ApiException if fails to make API call
	 */
	public ConversationSummaryAvailableTranslations conversationSummariesGetAvailableTranslations(String conversationSummaryId) throws ApiException {
		return conversationSummariesGetAvailableTranslationsWithHttpInfo(conversationSummaryId).getData();
	}

	/**
	 * getAvailableTranslations getAvailableTranslations operation
	 * 
	 * @param conversationSummaryId The ID of the conversation summary used for the research (required)
	 * @return ApiResponse&lt;ConversationSummaryAvailableTranslations&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationSummaryAvailableTranslations> conversationSummariesGetAvailableTranslationsWithHttpInfo(String conversationSummaryId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'conversationSummaryId' is set
		if (conversationSummaryId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationSummaryId' when calling conversationSummariesGetAvailableTranslations");
		}

		// create path and map variables
		String localVarPath = "/conversationsummaries/{conversationSummaryId}/getAvailableTranslations"
				.replaceAll("\\{" + "conversationSummaryId" + "\\}", apiClient.escapeString(conversationSummaryId.toString()));

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

		GenericType<ConversationSummaryAvailableTranslations> localVarReturnType = new GenericType<ConversationSummaryAvailableTranslations>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getByConversationId Searches for a conversation summary with the given conversationId&lt;br&gt;
	 * 
	 * @param conversationId The conversationId of the conversation (optional)
	 * @return ConversationSummaryResult
	 * @throws ApiException if fails to make API call
	 */
	public ConversationSummaryResult conversationSummariesGetByConversationId(String conversationId) throws ApiException {
		return conversationSummariesGetByConversationIdWithHttpInfo(conversationId).getData();
	}

	/**
	 * getByConversationId Searches for a conversation summary with the given conversationId&lt;br&gt;
	 * 
	 * @param conversationId The conversationId of the conversation (optional)
	 * @return ApiResponse&lt;ConversationSummaryResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationSummaryResult> conversationSummariesGetByConversationIdWithHttpInfo(String conversationId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/conversationsummaries/getByConversationId";

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<ConversationSummaryResult> localVarReturnType = new GenericType<ConversationSummaryResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Reads an existing conversation summary.&lt;br&gt;
	 * 
	 * @param conversationSummaryId The ID of the conversation summary to read (required)
	 * @return ConversationSummaryData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationSummaryData conversationSummariesRead(String conversationSummaryId) throws ApiException {
		return conversationSummariesReadWithHttpInfo(conversationSummaryId).getData();
	}

	/**
	 * read Reads an existing conversation summary.&lt;br&gt;
	 * 
	 * @param conversationSummaryId The ID of the conversation summary to read (required)
	 * @return ApiResponse&lt;ConversationSummaryData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationSummaryData> conversationSummariesReadWithHttpInfo(String conversationSummaryId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'conversationSummaryId' is set
		if (conversationSummaryId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationSummaryId' when calling conversationSummariesRead");
		}

		// create path and map variables
		String localVarPath = "/conversationsummaries/{conversationSummaryId}/read"
				.replaceAll("\\{" + "conversationSummaryId" + "\\}", apiClient.escapeString(conversationSummaryId.toString()));

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

		GenericType<ConversationSummaryData> localVarReturnType = new GenericType<ConversationSummaryData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Searches for conversation summaries in the current account&lt;br&gt;
	 * 
	 * @param conversationSummaryQuery (required)
	 * @return ConversationSummaryResult
	 * @throws ApiException if fails to make API call
	 */
	public ConversationSummaryResult conversationSummariesSearch(ConversationSummaryQuery conversationSummaryQuery) throws ApiException {
		return conversationSummariesSearchWithHttpInfo(conversationSummaryQuery).getData();
	}

	/**
	 * search Searches for conversation summaries in the current account&lt;br&gt;
	 * 
	 * @param conversationSummaryQuery (required)
	 * @return ApiResponse&lt;ConversationSummaryResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationSummaryResult> conversationSummariesSearchWithHttpInfo(ConversationSummaryQuery conversationSummaryQuery) throws ApiException {
		Object localVarPostBody = conversationSummaryQuery;

		// verify the required parameter 'conversationSummaryQuery' is set
		if (conversationSummaryQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationSummaryQuery' when calling conversationSummariesSearch");
		}

		// create path and map variables
		String localVarPath = "/conversationsummaries/search";

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

		GenericType<ConversationSummaryResult> localVarReturnType = new GenericType<ConversationSummaryResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
