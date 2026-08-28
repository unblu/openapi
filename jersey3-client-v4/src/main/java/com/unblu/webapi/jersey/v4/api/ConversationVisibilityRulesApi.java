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
import com.unblu.webapi.model.v4.ConversationVisibilityRuleData;
import com.unblu.webapi.model.v4.ConversationVisibilityRuleDataList;
import com.unblu.webapi.model.v4.ConversationVisibilityRuleQuery;
import com.unblu.webapi.model.v4.ConversationVisibilityRuleResult;
import com.unblu.webapi.model.v4.ConversationVisibilityRulesGetByUsedLabelNameBody;

import jakarta.ws.rs.core.GenericType;

public class ConversationVisibilityRulesApi {
	private ApiClient apiClient;

	public ConversationVisibilityRulesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ConversationVisibilityRulesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates the given conversation visibility rule. The ID of the conversation visibility rule is
	 * generated automatically. Any ID provided in the conversation visibility rule entity is ignored.&lt;br&gt;
	 * 
	 * @param conversationVisibilityRuleData The conversation visibility rule to create (required)
	 * @return ConversationVisibilityRuleData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationVisibilityRuleData conversationVisibilityRulesCreate(ConversationVisibilityRuleData conversationVisibilityRuleData) throws ApiException {
		return conversationVisibilityRulesCreateWithHttpInfo(conversationVisibilityRuleData).getData();
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates the given conversation visibility rule. The ID of the conversation visibility rule is
	 * generated automatically. Any ID provided in the conversation visibility rule entity is ignored.&lt;br&gt;
	 * 
	 * @param conversationVisibilityRuleData The conversation visibility rule to create (required)
	 * @return ApiResponse&lt;ConversationVisibilityRuleData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationVisibilityRuleData> conversationVisibilityRulesCreateWithHttpInfo(ConversationVisibilityRuleData conversationVisibilityRuleData) throws ApiException {
		Object localVarPostBody = conversationVisibilityRuleData;

		// verify the required parameter 'conversationVisibilityRuleData' is set
		if (conversationVisibilityRuleData == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationVisibilityRuleData' when calling conversationVisibilityRulesCreate");
		}

		// create path and map variables
		String localVarPath = "/conversationvisibilityrules/create";

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

		GenericType<ConversationVisibilityRuleData> localVarReturnType = new GenericType<ConversationVisibilityRuleData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes the conversation visibility rule with the given ID&lt;br&gt;
	 * 
	 * @param conversationVisibilityRuleId The ID of the conversation visibility rule to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public void conversationVisibilityRulesDelete(String conversationVisibilityRuleId) throws ApiException {

		conversationVisibilityRulesDeleteWithHttpInfo(conversationVisibilityRuleId);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes the conversation visibility rule with the given ID&lt;br&gt;
	 * 
	 * @param conversationVisibilityRuleId The ID of the conversation visibility rule to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> conversationVisibilityRulesDeleteWithHttpInfo(String conversationVisibilityRuleId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'conversationVisibilityRuleId' is set
		if (conversationVisibilityRuleId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationVisibilityRuleId' when calling conversationVisibilityRulesDelete");
		}

		// create path and map variables
		String localVarPath = "/conversationvisibilityrules/{conversationVisibilityRuleId}/delete"
				.replaceAll("\\{" + "conversationVisibilityRuleId" + "\\}", apiClient.escapeString(conversationVisibilityRuleId.toString()));

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
	 * getByNames &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves a list of the conversation visibility rules with the names provided. Names that
	 * don&#39;t match any conversation visibility rules are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The names of the conversation visibility rules to fetch (required)
	 * @return ConversationVisibilityRuleDataList
	 * @throws ApiException if fails to make API call
	 */
	public ConversationVisibilityRuleDataList conversationVisibilityRulesGetByNames(List<String> requestBody) throws ApiException {
		return conversationVisibilityRulesGetByNamesWithHttpInfo(requestBody).getData();
	}

	/**
	 * getByNames &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves a list of the conversation visibility rules with the names provided. Names that
	 * don&#39;t match any conversation visibility rules are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The names of the conversation visibility rules to fetch (required)
	 * @return ApiResponse&lt;ConversationVisibilityRuleDataList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationVisibilityRuleDataList> conversationVisibilityRulesGetByNamesWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling conversationVisibilityRulesGetByNames");
		}

		// create path and map variables
		String localVarPath = "/conversationvisibilityrules/getByNames";

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

		GenericType<ConversationVisibilityRuleDataList> localVarReturnType = new GenericType<ConversationVisibilityRuleDataList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getByUsedLabelName &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the conversation visibility rules which use the provided label name in their
	 * selection, or an empty list if none are found&lt;br&gt;
	 * 
	 * @param conversationVisibilityRulesGetByUsedLabelNameBody (required)
	 * @return ConversationVisibilityRuleDataList
	 * @throws ApiException if fails to make API call
	 */
	public ConversationVisibilityRuleDataList conversationVisibilityRulesGetByUsedLabelName(ConversationVisibilityRulesGetByUsedLabelNameBody conversationVisibilityRulesGetByUsedLabelNameBody) throws ApiException {
		return conversationVisibilityRulesGetByUsedLabelNameWithHttpInfo(conversationVisibilityRulesGetByUsedLabelNameBody).getData();
	}

	/**
	 * getByUsedLabelName &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the conversation visibility rules which use the provided label name in their
	 * selection, or an empty list if none are found&lt;br&gt;
	 * 
	 * @param conversationVisibilityRulesGetByUsedLabelNameBody (required)
	 * @return ApiResponse&lt;ConversationVisibilityRuleDataList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationVisibilityRuleDataList> conversationVisibilityRulesGetByUsedLabelNameWithHttpInfo(ConversationVisibilityRulesGetByUsedLabelNameBody conversationVisibilityRulesGetByUsedLabelNameBody) throws ApiException {
		Object localVarPostBody = conversationVisibilityRulesGetByUsedLabelNameBody;

		// verify the required parameter 'conversationVisibilityRulesGetByUsedLabelNameBody' is set
		if (conversationVisibilityRulesGetByUsedLabelNameBody == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationVisibilityRulesGetByUsedLabelNameBody' when calling conversationVisibilityRulesGetByUsedLabelName");
		}

		// create path and map variables
		String localVarPath = "/conversationvisibilityrules/getByUsedLabelName";

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

		GenericType<ConversationVisibilityRuleDataList> localVarReturnType = new GenericType<ConversationVisibilityRuleDataList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the conversation visibility rule with the given ID&lt;br&gt;
	 * 
	 * @param conversationVisibilityRuleId The ID of the conversation visibility rule to return (required)
	 * @return ConversationVisibilityRuleData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationVisibilityRuleData conversationVisibilityRulesRead(String conversationVisibilityRuleId) throws ApiException {
		return conversationVisibilityRulesReadWithHttpInfo(conversationVisibilityRuleId).getData();
	}

	/**
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the conversation visibility rule with the given ID&lt;br&gt;
	 * 
	 * @param conversationVisibilityRuleId The ID of the conversation visibility rule to return (required)
	 * @return ApiResponse&lt;ConversationVisibilityRuleData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationVisibilityRuleData> conversationVisibilityRulesReadWithHttpInfo(String conversationVisibilityRuleId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'conversationVisibilityRuleId' is set
		if (conversationVisibilityRuleId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationVisibilityRuleId' when calling conversationVisibilityRulesRead");
		}

		// create path and map variables
		String localVarPath = "/conversationvisibilityrules/{conversationVisibilityRuleId}/read"
				.replaceAll("\\{" + "conversationVisibilityRuleId" + "\\}", apiClient.escapeString(conversationVisibilityRuleId.toString()));

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

		GenericType<ConversationVisibilityRuleData> localVarReturnType = new GenericType<ConversationVisibilityRuleData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves a list of conversation visibility rules for the given IDs. IDs that don&#39;t
	 * match any conversation visibility rules are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the conversation visibility rules (required)
	 * @return ConversationVisibilityRuleDataList
	 * @throws ApiException if fails to make API call
	 */
	public ConversationVisibilityRuleDataList conversationVisibilityRulesReadMultiple(List<String> requestBody) throws ApiException {
		return conversationVisibilityRulesReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves a list of conversation visibility rules for the given IDs. IDs that don&#39;t
	 * match any conversation visibility rules are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the conversation visibility rules (required)
	 * @return ApiResponse&lt;ConversationVisibilityRuleDataList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationVisibilityRuleDataList> conversationVisibilityRulesReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling conversationVisibilityRulesReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/conversationvisibilityrules/readMultiple";

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

		GenericType<ConversationVisibilityRuleDataList> localVarReturnType = new GenericType<ConversationVisibilityRuleDataList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for conversation visibility rules&lt;br&gt;
	 * 
	 * @param conversationVisibilityRuleQuery The query to use for the search (required)
	 * @return ConversationVisibilityRuleResult
	 * @throws ApiException if fails to make API call
	 */
	public ConversationVisibilityRuleResult conversationVisibilityRulesSearch(ConversationVisibilityRuleQuery conversationVisibilityRuleQuery) throws ApiException {
		return conversationVisibilityRulesSearchWithHttpInfo(conversationVisibilityRuleQuery).getData();
	}

	/**
	 * search &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for conversation visibility rules&lt;br&gt;
	 * 
	 * @param conversationVisibilityRuleQuery The query to use for the search (required)
	 * @return ApiResponse&lt;ConversationVisibilityRuleResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationVisibilityRuleResult> conversationVisibilityRulesSearchWithHttpInfo(ConversationVisibilityRuleQuery conversationVisibilityRuleQuery) throws ApiException {
		Object localVarPostBody = conversationVisibilityRuleQuery;

		// verify the required parameter 'conversationVisibilityRuleQuery' is set
		if (conversationVisibilityRuleQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationVisibilityRuleQuery' when calling conversationVisibilityRulesSearch");
		}

		// create path and map variables
		String localVarPath = "/conversationvisibilityrules/search";

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

		GenericType<ConversationVisibilityRuleResult> localVarReturnType = new GenericType<ConversationVisibilityRuleResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates the conversation visibility rule. The update fails if no conversation visibility rule
	 * exists with the ID provided.&lt;br&gt;
	 * 
	 * @param conversationVisibilityRuleData The details to update the conversation visibility rule with (required)
	 * @return ConversationVisibilityRuleData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationVisibilityRuleData conversationVisibilityRulesUpdate(ConversationVisibilityRuleData conversationVisibilityRuleData) throws ApiException {
		return conversationVisibilityRulesUpdateWithHttpInfo(conversationVisibilityRuleData).getData();
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates the conversation visibility rule. The update fails if no conversation visibility rule
	 * exists with the ID provided.&lt;br&gt;
	 * 
	 * @param conversationVisibilityRuleData The details to update the conversation visibility rule with (required)
	 * @return ApiResponse&lt;ConversationVisibilityRuleData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationVisibilityRuleData> conversationVisibilityRulesUpdateWithHttpInfo(ConversationVisibilityRuleData conversationVisibilityRuleData) throws ApiException {
		Object localVarPostBody = conversationVisibilityRuleData;

		// verify the required parameter 'conversationVisibilityRuleData' is set
		if (conversationVisibilityRuleData == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationVisibilityRuleData' when calling conversationVisibilityRulesUpdate");
		}

		// create path and map variables
		String localVarPath = "/conversationvisibilityrules/update";

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

		GenericType<ConversationVisibilityRuleData> localVarReturnType = new GenericType<ConversationVisibilityRuleData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
