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
import com.unblu.webapi.model.v3.ConversationTemplate;
import com.unblu.webapi.model.v3.ConversationTemplateQuery;
import com.unblu.webapi.model.v3.ConversationTemplateResult;
import com.unblu.webapi.model.v3.EInitialEngagementType;

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
	 * create Creates the given entity in the system. The ID of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
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
	 * create Creates the given entity in the system. The ID of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
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
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void conversationTemplatesDelete(String id) throws ApiException {

		conversationTemplatesDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> conversationTemplatesDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/conversationtemplates/delete";

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
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void conversationTemplatesDeleteLegacyGet(String id) throws ApiException {

		conversationTemplatesDeleteLegacyGetWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> conversationTemplatesDeleteLegacyGetWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/conversationtemplates/delete";

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

		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
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
	 * read Returns the entity for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the entity which should be returned (optional)
	 * @param expand (optional)
	 * @return ConversationTemplate
	 * @throws ApiException if fails to make API call
	 */
	public ConversationTemplate conversationTemplatesRead(String id, String expand) throws ApiException {
		return conversationTemplatesReadWithHttpInfo(id, expand).getData();
	}

	/**
	 * read Returns the entity for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the entity which should be returned (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationTemplate&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationTemplate> conversationTemplatesReadWithHttpInfo(String id, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/conversationtemplates/read";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
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
	 * readMultiple Gets a list of entities for the given ID&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The ID&#39;s for which the entities should be fetched (required)
	 * @param expand (optional)
	 * @return List&lt;ConversationTemplate&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<ConversationTemplate> conversationTemplatesReadMultiple(List<String> requestBody, String expand) throws ApiException {
		return conversationTemplatesReadMultipleWithHttpInfo(requestBody, expand).getData();
	}

	/**
	 * readMultiple Gets a list of entities for the given ID&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The ID&#39;s for which the entities should be fetched (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;List&lt;ConversationTemplate&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<ConversationTemplate>> conversationTemplatesReadMultipleWithHttpInfo(List<String> requestBody, String expand) throws ApiException {
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

		GenericType<List<ConversationTemplate>> localVarReturnType = new GenericType<List<ConversationTemplate>>() {
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
