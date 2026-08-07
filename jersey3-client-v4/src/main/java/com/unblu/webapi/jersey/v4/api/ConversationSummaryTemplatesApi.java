package com.unblu.webapi.jersey.v4.api;

import com.unblu.webapi.jersey.v4.invoker.ApiException;
import com.unblu.webapi.jersey.v4.invoker.ApiClient;
import com.unblu.webapi.jersey.v4.invoker.ApiResponse;
import com.unblu.webapi.jersey.v4.invoker.Configuration;
import com.unblu.webapi.jersey.v4.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.unblu.webapi.model.v4.ConversationSummaryTemplateData;
import com.unblu.webapi.model.v4.ConversationSummaryTemplateQuery;
import com.unblu.webapi.model.v4.ConversationSummaryTemplateResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConversationSummaryTemplatesApi {
	private ApiClient apiClient;

	public ConversationSummaryTemplatesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ConversationSummaryTemplatesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates a new conversation summary template&lt;br&gt;
	 * 
	 * @param conversationSummaryTemplateData The conversation summary template to create (required)
	 * @return ConversationSummaryTemplateData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationSummaryTemplateData conversationSummaryTemplatesCreate(ConversationSummaryTemplateData conversationSummaryTemplateData) throws ApiException {
		return conversationSummaryTemplatesCreateWithHttpInfo(conversationSummaryTemplateData).getData();
	}

	/**
	 * create Creates a new conversation summary template&lt;br&gt;
	 * 
	 * @param conversationSummaryTemplateData The conversation summary template to create (required)
	 * @return ApiResponse&lt;ConversationSummaryTemplateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationSummaryTemplateData> conversationSummaryTemplatesCreateWithHttpInfo(ConversationSummaryTemplateData conversationSummaryTemplateData) throws ApiException {
		Object localVarPostBody = conversationSummaryTemplateData;

		// verify the required parameter 'conversationSummaryTemplateData' is set
		if (conversationSummaryTemplateData == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationSummaryTemplateData' when calling conversationSummaryTemplatesCreate");
		}

		// create path and map variables
		String localVarPath = "/conversationsummarytemplates/create";

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

		GenericType<ConversationSummaryTemplateData> localVarReturnType = new GenericType<ConversationSummaryTemplateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes an existing conversation summary template&lt;br&gt;
	 * 
	 * @param conversationSummaryTemplateId The ID of the conversation summary template which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void conversationSummaryTemplatesDelete(String conversationSummaryTemplateId) throws ApiException {

		conversationSummaryTemplatesDeleteWithHttpInfo(conversationSummaryTemplateId);
	}

	/**
	 * delete Deletes an existing conversation summary template&lt;br&gt;
	 * 
	 * @param conversationSummaryTemplateId The ID of the conversation summary template which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> conversationSummaryTemplatesDeleteWithHttpInfo(String conversationSummaryTemplateId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'conversationSummaryTemplateId' is set
		if (conversationSummaryTemplateId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationSummaryTemplateId' when calling conversationSummaryTemplatesDelete");
		}

		// create path and map variables
		String localVarPath = "/conversationsummarytemplates/{conversationSummaryTemplateId}/delete"
				.replaceAll("\\{" + "conversationSummaryTemplateId" + "\\}", apiClient.escapeString(conversationSummaryTemplateId.toString()));

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * findByName Searches for a conversation summary template with the given name&lt;br&gt;
	 * 
	 * @param name The name of the conversation summary template (optional)
	 * @return ConversationSummaryTemplateData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationSummaryTemplateData conversationSummaryTemplatesFindByName(String name) throws ApiException {
		return conversationSummaryTemplatesFindByNameWithHttpInfo(name).getData();
	}

	/**
	 * findByName Searches for a conversation summary template with the given name&lt;br&gt;
	 * 
	 * @param name The name of the conversation summary template (optional)
	 * @return ApiResponse&lt;ConversationSummaryTemplateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationSummaryTemplateData> conversationSummaryTemplatesFindByNameWithHttpInfo(String name) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/conversationsummarytemplates/findByName";

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<ConversationSummaryTemplateData> localVarReturnType = new GenericType<ConversationSummaryTemplateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Reads an existing conversation summary template.&lt;br&gt;
	 * 
	 * @param conversationSummaryTemplateId The ID of the conversation summary template to read (required)
	 * @return ConversationSummaryTemplateData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationSummaryTemplateData conversationSummaryTemplatesRead(String conversationSummaryTemplateId) throws ApiException {
		return conversationSummaryTemplatesReadWithHttpInfo(conversationSummaryTemplateId).getData();
	}

	/**
	 * read Reads an existing conversation summary template.&lt;br&gt;
	 * 
	 * @param conversationSummaryTemplateId The ID of the conversation summary template to read (required)
	 * @return ApiResponse&lt;ConversationSummaryTemplateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationSummaryTemplateData> conversationSummaryTemplatesReadWithHttpInfo(String conversationSummaryTemplateId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'conversationSummaryTemplateId' is set
		if (conversationSummaryTemplateId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationSummaryTemplateId' when calling conversationSummaryTemplatesRead");
		}

		// create path and map variables
		String localVarPath = "/conversationsummarytemplates/{conversationSummaryTemplateId}/read"
				.replaceAll("\\{" + "conversationSummaryTemplateId" + "\\}", apiClient.escapeString(conversationSummaryTemplateId.toString()));

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

		GenericType<ConversationSummaryTemplateData> localVarReturnType = new GenericType<ConversationSummaryTemplateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Searches for conversation summary templates in the current account&lt;br&gt;
	 * 
	 * @param conversationSummaryTemplateQuery (required)
	 * @return ConversationSummaryTemplateResult
	 * @throws ApiException if fails to make API call
	 */
	public ConversationSummaryTemplateResult conversationSummaryTemplatesSearch(ConversationSummaryTemplateQuery conversationSummaryTemplateQuery) throws ApiException {
		return conversationSummaryTemplatesSearchWithHttpInfo(conversationSummaryTemplateQuery).getData();
	}

	/**
	 * search Searches for conversation summary templates in the current account&lt;br&gt;
	 * 
	 * @param conversationSummaryTemplateQuery (required)
	 * @return ApiResponse&lt;ConversationSummaryTemplateResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationSummaryTemplateResult> conversationSummaryTemplatesSearchWithHttpInfo(ConversationSummaryTemplateQuery conversationSummaryTemplateQuery) throws ApiException {
		Object localVarPostBody = conversationSummaryTemplateQuery;

		// verify the required parameter 'conversationSummaryTemplateQuery' is set
		if (conversationSummaryTemplateQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationSummaryTemplateQuery' when calling conversationSummaryTemplatesSearch");
		}

		// create path and map variables
		String localVarPath = "/conversationsummarytemplates/search";

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

		GenericType<ConversationSummaryTemplateResult> localVarReturnType = new GenericType<ConversationSummaryTemplateResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates an existing conversation summary template&lt;br&gt;
	 * 
	 * @param conversationSummaryTemplateData The conversation summary template to update (required)
	 * @return ConversationSummaryTemplateData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationSummaryTemplateData conversationSummaryTemplatesUpdate(ConversationSummaryTemplateData conversationSummaryTemplateData) throws ApiException {
		return conversationSummaryTemplatesUpdateWithHttpInfo(conversationSummaryTemplateData).getData();
	}

	/**
	 * update Updates an existing conversation summary template&lt;br&gt;
	 * 
	 * @param conversationSummaryTemplateData The conversation summary template to update (required)
	 * @return ApiResponse&lt;ConversationSummaryTemplateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationSummaryTemplateData> conversationSummaryTemplatesUpdateWithHttpInfo(ConversationSummaryTemplateData conversationSummaryTemplateData) throws ApiException {
		Object localVarPostBody = conversationSummaryTemplateData;

		// verify the required parameter 'conversationSummaryTemplateData' is set
		if (conversationSummaryTemplateData == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationSummaryTemplateData' when calling conversationSummaryTemplatesUpdate");
		}

		// create path and map variables
		String localVarPath = "/conversationsummarytemplates/update";

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

		GenericType<ConversationSummaryTemplateData> localVarReturnType = new GenericType<ConversationSummaryTemplateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
