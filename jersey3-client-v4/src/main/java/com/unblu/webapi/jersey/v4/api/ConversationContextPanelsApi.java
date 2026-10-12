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
import com.unblu.webapi.model.v4.ConversationContextPanelData;
import com.unblu.webapi.model.v4.ConversationContextPanelQuery;
import com.unblu.webapi.model.v4.ConversationContextPanelSearchResult;
import com.unblu.webapi.model.v4.ExpandFields;

import jakarta.ws.rs.core.GenericType;

public class ConversationContextPanelsApi {
	private ApiClient apiClient;

	public ConversationContextPanelsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ConversationContextPanelsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates a new conversation context panel. &lt;p&gt; The icon is mandatory. To set it, send the
	 * name &#39;icon&#39; and the expanded &#x60;icon&#x60; in the &#x60;expand&#x60; parameter. Without it the icon is not read from the body and the create is
	 * rejected. The icon ID cannot be set directly.&lt;br&gt;
	 * 
	 * @param conversationContextPanelData The conversation context panel to create (required)
	 * @param expand (optional)
	 * @return ConversationContextPanelData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationContextPanelData conversationContextPanelsCreate(ConversationContextPanelData conversationContextPanelData, List<ExpandFields> expand) throws ApiException {
		return conversationContextPanelsCreateWithHttpInfo(conversationContextPanelData, expand).getData();
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates a new conversation context panel. &lt;p&gt; The icon is mandatory. To set it, send the
	 * name &#39;icon&#39; and the expanded &#x60;icon&#x60; in the &#x60;expand&#x60; parameter. Without it the icon is not read from the body and the create is
	 * rejected. The icon ID cannot be set directly.&lt;br&gt;
	 * 
	 * @param conversationContextPanelData The conversation context panel to create (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationContextPanelData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationContextPanelData> conversationContextPanelsCreateWithHttpInfo(ConversationContextPanelData conversationContextPanelData, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = conversationContextPanelData;

		// verify the required parameter 'conversationContextPanelData' is set
		if (conversationContextPanelData == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationContextPanelData' when calling conversationContextPanelsCreate");
		}

		// create path and map variables
		String localVarPath = "/conversationcontextpanels/create";

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<ConversationContextPanelData> localVarReturnType = new GenericType<ConversationContextPanelData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes an existing conversation context panel.&lt;br&gt;
	 * 
	 * @param conversationContextPanelId The ID of the conversation context panel to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public void conversationContextPanelsDelete(String conversationContextPanelId) throws ApiException {

		conversationContextPanelsDeleteWithHttpInfo(conversationContextPanelId);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes an existing conversation context panel.&lt;br&gt;
	 * 
	 * @param conversationContextPanelId The ID of the conversation context panel to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> conversationContextPanelsDeleteWithHttpInfo(String conversationContextPanelId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'conversationContextPanelId' is set
		if (conversationContextPanelId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationContextPanelId' when calling conversationContextPanelsDelete");
		}

		// create path and map variables
		String localVarPath = "/conversationcontextpanels/{conversationContextPanelId}/delete"
				.replaceAll("\\{" + "conversationContextPanelId" + "\\}", apiClient.escapeString(conversationContextPanelId.toString()));

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
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Reads an existing conversation context panel.&lt;br&gt;
	 * 
	 * @param conversationContextPanelId The ID of the conversation context panel to read (required)
	 * @param expand (optional)
	 * @return ConversationContextPanelData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationContextPanelData conversationContextPanelsRead(String conversationContextPanelId, List<ExpandFields> expand) throws ApiException {
		return conversationContextPanelsReadWithHttpInfo(conversationContextPanelId, expand).getData();
	}

	/**
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Reads an existing conversation context panel.&lt;br&gt;
	 * 
	 * @param conversationContextPanelId The ID of the conversation context panel to read (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationContextPanelData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationContextPanelData> conversationContextPanelsReadWithHttpInfo(String conversationContextPanelId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'conversationContextPanelId' is set
		if (conversationContextPanelId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationContextPanelId' when calling conversationContextPanelsRead");
		}

		// create path and map variables
		String localVarPath = "/conversationcontextpanels/{conversationContextPanelId}/read"
				.replaceAll("\\{" + "conversationContextPanelId" + "\\}", apiClient.escapeString(conversationContextPanelId.toString()));

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<ConversationContextPanelData> localVarReturnType = new GenericType<ConversationContextPanelData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for conversation context panels in the current account.&lt;br&gt;
	 * 
	 * @param conversationContextPanelQuery The search query (required)
	 * @return ConversationContextPanelSearchResult
	 * @throws ApiException if fails to make API call
	 */
	public ConversationContextPanelSearchResult conversationContextPanelsSearch(ConversationContextPanelQuery conversationContextPanelQuery) throws ApiException {
		return conversationContextPanelsSearchWithHttpInfo(conversationContextPanelQuery).getData();
	}

	/**
	 * search &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for conversation context panels in the current account.&lt;br&gt;
	 * 
	 * @param conversationContextPanelQuery The search query (required)
	 * @return ApiResponse&lt;ConversationContextPanelSearchResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationContextPanelSearchResult> conversationContextPanelsSearchWithHttpInfo(ConversationContextPanelQuery conversationContextPanelQuery) throws ApiException {
		Object localVarPostBody = conversationContextPanelQuery;

		// verify the required parameter 'conversationContextPanelQuery' is set
		if (conversationContextPanelQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationContextPanelQuery' when calling conversationContextPanelsSearch");
		}

		// create path and map variables
		String localVarPath = "/conversationcontextpanels/search";

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

		GenericType<ConversationContextPanelSearchResult> localVarReturnType = new GenericType<ConversationContextPanelSearchResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates an existing conversation context panel. The ID and version are carried in the body.
	 * &lt;p&gt; To replace the panel icon, send the name &#39;icon&#39; and the expanded &#x60;icon&#x60; in the &#x60;expand&#x60; parameter. Without it the icon
	 * is not read from the body: the existing icon is kept when the body carries its unchanged icon ID, and the update is rejected when it does not, as the icon is
	 * mandatory. The icon ID cannot be changed directly.&lt;br&gt;
	 * 
	 * @param conversationContextPanelData The conversation context panel to update (required)
	 * @param expand (optional)
	 * @return ConversationContextPanelData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationContextPanelData conversationContextPanelsUpdate(ConversationContextPanelData conversationContextPanelData, List<ExpandFields> expand) throws ApiException {
		return conversationContextPanelsUpdateWithHttpInfo(conversationContextPanelData, expand).getData();
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates an existing conversation context panel. The ID and version are carried in the body.
	 * &lt;p&gt; To replace the panel icon, send the name &#39;icon&#39; and the expanded &#x60;icon&#x60; in the &#x60;expand&#x60; parameter. Without it the icon
	 * is not read from the body: the existing icon is kept when the body carries its unchanged icon ID, and the update is rejected when it does not, as the icon is
	 * mandatory. The icon ID cannot be changed directly.&lt;br&gt;
	 * 
	 * @param conversationContextPanelData The conversation context panel to update (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationContextPanelData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationContextPanelData> conversationContextPanelsUpdateWithHttpInfo(ConversationContextPanelData conversationContextPanelData, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = conversationContextPanelData;

		// verify the required parameter 'conversationContextPanelData' is set
		if (conversationContextPanelData == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationContextPanelData' when calling conversationContextPanelsUpdate");
		}

		// create path and map variables
		String localVarPath = "/conversationcontextpanels/update";

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<ConversationContextPanelData> localVarReturnType = new GenericType<ConversationContextPanelData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
