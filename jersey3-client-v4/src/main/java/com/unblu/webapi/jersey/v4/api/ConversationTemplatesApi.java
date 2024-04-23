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
import com.unblu.webapi.model.v4.ConversationTemplate;
import com.unblu.webapi.model.v4.ConversationTemplateList;
import com.unblu.webapi.model.v4.ConversationTemplateQuery;
import com.unblu.webapi.model.v4.ConversationTemplateResult;
import com.unblu.webapi.model.v4.EInitialEngagementType;

import jakarta.ws.rs.core.GenericType;

public class ConversationTemplatesApi {
	private ApiClient apiClient;

	public ConversationTemplatesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ConversationTemplatesApi(ApiClient apiClient) {
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
	 * @param conversationTemplate The entity to create (required)
	 * @param expand (optional)
	 * @return ConversationTemplate
	 * @throws ApiException if fails to make API call
	 */
	public ConversationTemplate conversationTemplatesCreate(ConversationTemplate conversationTemplate, String expand) throws ApiException {
		return conversationTemplatesCreateWithHttpInfo(conversationTemplate, expand).getData();
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
	 * 
	 * @param conversationTemplate The entity to create (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationTemplate&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationTemplate> conversationTemplatesCreateWithHttpInfo(ConversationTemplate conversationTemplate, String expand) throws ApiException {
		Object localVarPostBody = conversationTemplate;

		// verify the required parameter 'conversationTemplate' is set
		if (conversationTemplate == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationTemplate' when calling conversationTemplatesCreate");
		}

		// create path and map variables
		String localVarPath = "/conversationtemplates/create";

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

		GenericType<ConversationTemplate> localVarReturnType = new GenericType<ConversationTemplate>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the template with the given ID&lt;br&gt;
	 * 
	 * @param templateId The ID of the template which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void conversationTemplatesDelete(String templateId) throws ApiException {

		conversationTemplatesDeleteWithHttpInfo(templateId);
	}

	/**
	 * delete Deletes the template with the given ID&lt;br&gt;
	 * 
	 * @param templateId The ID of the template which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> conversationTemplatesDeleteWithHttpInfo(String templateId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'templateId' is set
		if (templateId == null) {
			throw new ApiException(400, "Missing the required parameter 'templateId' when calling conversationTemplatesDelete");
		}

		// create path and map variables
		String localVarPath = "/conversationtemplates/{templateId}/delete"
				.replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
	 * getDefaultTemplateByEngagementType Gets the default conversation template for a given initial engagement type
	 * 
	 * @param initialEngagementType (optional)
	 * @param expand (optional)
	 * @return ConversationTemplate
	 * @throws ApiException if fails to make API call
	 */
	public ConversationTemplate conversationTemplatesGetDefaultTemplateByEngagementType(EInitialEngagementType initialEngagementType, String expand) throws ApiException {
		return conversationTemplatesGetDefaultTemplateByEngagementTypeWithHttpInfo(initialEngagementType, expand).getData();
	}

	/**
	 * getDefaultTemplateByEngagementType Gets the default conversation template for a given initial engagement type
	 * 
	 * @param initialEngagementType (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationTemplate&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationTemplate> conversationTemplatesGetDefaultTemplateByEngagementTypeWithHttpInfo(EInitialEngagementType initialEngagementType, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/conversationtemplates/getDefaultTemplateByEngagementType";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "initialEngagementType", initialEngagementType));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ConversationTemplate> localVarReturnType = new GenericType<ConversationTemplate>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the template with the given ID&lt;br&gt;
	 * 
	 * @param templateId ID of the template which should be returned (required)
	 * @param expand (optional)
	 * @return ConversationTemplate
	 * @throws ApiException if fails to make API call
	 */
	public ConversationTemplate conversationTemplatesRead(String templateId, String expand) throws ApiException {
		return conversationTemplatesReadWithHttpInfo(templateId, expand).getData();
	}

	/**
	 * read Returns the template with the given ID&lt;br&gt;
	 * 
	 * @param templateId ID of the template which should be returned (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationTemplate&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationTemplate> conversationTemplatesReadWithHttpInfo(String templateId, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'templateId' is set
		if (templateId == null) {
			throw new ApiException(400, "Missing the required parameter 'templateId' when calling conversationTemplatesRead");
		}

		// create path and map variables
		String localVarPath = "/conversationtemplates/{templateId}/read"
				.replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ConversationTemplate> localVarReturnType = new GenericType<ConversationTemplate>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of conversation templates with the given IDs. IDs that can&#39;t be found are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the conversation templates to fetch (required)
	 * @param expand (optional)
	 * @return ConversationTemplateList
	 * @throws ApiException if fails to make API call
	 */
	public ConversationTemplateList conversationTemplatesReadMultiple(List<String> requestBody, String expand) throws ApiException {
		return conversationTemplatesReadMultipleWithHttpInfo(requestBody, expand).getData();
	}

	/**
	 * readMultiple Gets a list of conversation templates with the given IDs. IDs that can&#39;t be found are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the conversation templates to fetch (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationTemplateList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationTemplateList> conversationTemplatesReadMultipleWithHttpInfo(List<String> requestBody, String expand) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling conversationTemplatesReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/conversationtemplates/readMultiple";

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

		GenericType<ConversationTemplateList> localVarReturnType = new GenericType<ConversationTemplateList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for conversation-templates in the current account&lt;br&gt;
	 * 
	 * @param conversationTemplateQuery (required)
	 * @param expand (optional)
	 * @return ConversationTemplateResult
	 * @throws ApiException if fails to make API call
	 */
	public ConversationTemplateResult conversationTemplatesSearch(ConversationTemplateQuery conversationTemplateQuery, String expand) throws ApiException {
		return conversationTemplatesSearchWithHttpInfo(conversationTemplateQuery, expand).getData();
	}

	/**
	 * search Search for conversation-templates in the current account&lt;br&gt;
	 * 
	 * @param conversationTemplateQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationTemplateResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationTemplateResult> conversationTemplatesSearchWithHttpInfo(ConversationTemplateQuery conversationTemplateQuery, String expand) throws ApiException {
		Object localVarPostBody = conversationTemplateQuery;

		// verify the required parameter 'conversationTemplateQuery' is set
		if (conversationTemplateQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationTemplateQuery' when calling conversationTemplatesSearch");
		}

		// create path and map variables
		String localVarPath = "/conversationtemplates/search";

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

		GenericType<ConversationTemplateResult> localVarReturnType = new GenericType<ConversationTemplateResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param conversationTemplate The entity to update (required)
	 * @param expand (optional)
	 * @return ConversationTemplate
	 * @throws ApiException if fails to make API call
	 */
	public ConversationTemplate conversationTemplatesUpdate(ConversationTemplate conversationTemplate, String expand) throws ApiException {
		return conversationTemplatesUpdateWithHttpInfo(conversationTemplate, expand).getData();
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param conversationTemplate The entity to update (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationTemplate&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationTemplate> conversationTemplatesUpdateWithHttpInfo(ConversationTemplate conversationTemplate, String expand) throws ApiException {
		Object localVarPostBody = conversationTemplate;

		// verify the required parameter 'conversationTemplate' is set
		if (conversationTemplate == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationTemplate' when calling conversationTemplatesUpdate");
		}

		// create path and map variables
		String localVarPath = "/conversationtemplates/update";

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

		GenericType<ConversationTemplate> localVarReturnType = new GenericType<ConversationTemplate>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
