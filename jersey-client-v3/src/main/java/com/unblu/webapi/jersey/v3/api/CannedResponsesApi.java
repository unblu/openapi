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
import com.unblu.webapi.model.v3.CannedResponse;
import com.unblu.webapi.model.v3.CannedResponseConfigurationScope;
import com.unblu.webapi.model.v3.CannedResponseQuery;
import com.unblu.webapi.model.v3.CannedResponseResult;

public class CannedResponsesApi {
	private ApiClient apiClient;

	public CannedResponsesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public CannedResponsesApi(ApiClient apiClient) {
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
	 * @param cannedResponse The entity to create (required)
	 * @return CannedResponse
	 * @throws ApiException if fails to make API call
	 */
	public CannedResponse cannedResponsesCreate(CannedResponse cannedResponse) throws ApiException {
		return cannedResponsesCreateWithHttpInfo(cannedResponse).getData();
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
	 * 
	 * @param cannedResponse The entity to create (required)
	 * @return ApiResponse&lt;CannedResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CannedResponse> cannedResponsesCreateWithHttpInfo(CannedResponse cannedResponse) throws ApiException {
		Object localVarPostBody = cannedResponse;

		// verify the required parameter 'cannedResponse' is set
		if (cannedResponse == null) {
			throw new ApiException(400, "Missing the required parameter 'cannedResponse' when calling cannedResponsesCreate");
		}

		// create path and map variables
		String localVarPath = "/cannedresponses/create";

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

		GenericType<CannedResponse> localVarReturnType = new GenericType<CannedResponse>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void cannedResponsesDelete(String id) throws ApiException {

		cannedResponsesDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> cannedResponsesDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/cannedresponses/delete";

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
	public void cannedResponsesDeleteLegacyGet(String id) throws ApiException {

		cannedResponsesDeleteLegacyGetWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> cannedResponsesDeleteLegacyGetWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/cannedresponses/delete";

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
	 * getCannedResponsesAvailableForChat Returns all CannedResponses that are available inside chat sessions for the calling user.&lt;br&gt; The user may be
	 * allowed to edit more than the returned canned responses if he has the rights. &lt;p&gt; &lt;b&gt;Note&lt;/b&gt;: For editing use the
	 * &#x60;getByOwnerTypeAndId&#x60; or &#x60;getAll&#x60; service. &lt;/p&gt;&lt;br&gt;
	 * 
	 * @return List&lt;CannedResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<CannedResponse> cannedResponsesGetCannedResponsesAvailableForChat() throws ApiException {
		return cannedResponsesGetCannedResponsesAvailableForChatWithHttpInfo().getData();
	}

	/**
	 * getCannedResponsesAvailableForChat Returns all CannedResponses that are available inside chat sessions for the calling user.&lt;br&gt; The user may be
	 * allowed to edit more than the returned canned responses if he has the rights. &lt;p&gt; &lt;b&gt;Note&lt;/b&gt;: For editing use the
	 * &#x60;getByOwnerTypeAndId&#x60; or &#x60;getAll&#x60; service. &lt;/p&gt;&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;List&lt;CannedResponse&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<CannedResponse>> cannedResponsesGetCannedResponsesAvailableForChatWithHttpInfo() throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/cannedresponses/getCannedResponsesAvailableForChat";

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

		GenericType<List<CannedResponse>> localVarReturnType = new GenericType<List<CannedResponse>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getWritableConfigurationScopes Returns a list of all configuration scopes for which the calling user may add, delete or edit canned responses. Depending on
	 * the permissions of the users, these configuration scopes can be more than the ones which are available for the user in a chat.&lt;br&gt;
	 * 
	 * @return List&lt;CannedResponseConfigurationScope&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<CannedResponseConfigurationScope> cannedResponsesGetWritableConfigurationScopes() throws ApiException {
		return cannedResponsesGetWritableConfigurationScopesWithHttpInfo().getData();
	}

	/**
	 * getWritableConfigurationScopes Returns a list of all configuration scopes for which the calling user may add, delete or edit canned responses. Depending on
	 * the permissions of the users, these configuration scopes can be more than the ones which are available for the user in a chat.&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;List&lt;CannedResponseConfigurationScope&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<CannedResponseConfigurationScope>> cannedResponsesGetWritableConfigurationScopesWithHttpInfo() throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/cannedresponses/getWritableConfigurationScopes";

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

		GenericType<List<CannedResponseConfigurationScope>> localVarReturnType = new GenericType<List<CannedResponseConfigurationScope>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getWritableConfigurationScopesAvailableForChat Returns all configurations scopes available for chat to the calling user that the calling user may add, delete
	 * and edit canned responses for. &lt;p&gt; &lt;b&gt;Note&lt;/b&gt;: The returned scopes may be equal to or be a subset of the the scopes returned by
	 * &#x60;getWritableConfigurationScopes&#x60; depending on the user role.&lt;br&gt; &lt;/p&gt;
	 * 
	 * @return List&lt;CannedResponseConfigurationScope&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<CannedResponseConfigurationScope> cannedResponsesGetWritableConfigurationScopesAvailableForChat() throws ApiException {
		return cannedResponsesGetWritableConfigurationScopesAvailableForChatWithHttpInfo().getData();
	}

	/**
	 * getWritableConfigurationScopesAvailableForChat Returns all configurations scopes available for chat to the calling user that the calling user may add, delete
	 * and edit canned responses for. &lt;p&gt; &lt;b&gt;Note&lt;/b&gt;: The returned scopes may be equal to or be a subset of the the scopes returned by
	 * &#x60;getWritableConfigurationScopes&#x60; depending on the user role.&lt;br&gt; &lt;/p&gt;
	 * 
	 * @return ApiResponse&lt;List&lt;CannedResponseConfigurationScope&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<CannedResponseConfigurationScope>> cannedResponsesGetWritableConfigurationScopesAvailableForChatWithHttpInfo() throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/cannedresponses/getWritableConfigurationScopesAvailableForChat";

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

		GenericType<List<CannedResponseConfigurationScope>> localVarReturnType = new GenericType<List<CannedResponseConfigurationScope>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the canned response for the given id&lt;br&gt;
	 * 
	 * @param id Id of the canned response which should be returned (optional)
	 * @return CannedResponse
	 * @throws ApiException if fails to make API call
	 */
	public CannedResponse cannedResponsesRead(String id) throws ApiException {
		return cannedResponsesReadWithHttpInfo(id).getData();
	}

	/**
	 * read Returns the canned response for the given id&lt;br&gt;
	 * 
	 * @param id Id of the canned response which should be returned (optional)
	 * @return ApiResponse&lt;CannedResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CannedResponse> cannedResponsesReadWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/cannedresponses/read";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<CannedResponse> localVarReturnType = new GenericType<CannedResponse>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of canned responses for the given id&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The id&#39;s for which the canned responses should be fetched (required)
	 * @return List&lt;CannedResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<CannedResponse> cannedResponsesReadMultiple(List<String> requestBody) throws ApiException {
		return cannedResponsesReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple Gets a list of canned responses for the given id&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The id&#39;s for which the canned responses should be fetched (required)
	 * @return ApiResponse&lt;List&lt;CannedResponse&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<CannedResponse>> cannedResponsesReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling cannedResponsesReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/cannedresponses/readMultiple";

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

		GenericType<List<CannedResponse>> localVarReturnType = new GenericType<List<CannedResponse>>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for domains in the current account&lt;br&gt;
	 * 
	 * @param cannedResponseQuery (required)
	 * @return CannedResponseResult
	 * @throws ApiException if fails to make API call
	 */
	public CannedResponseResult cannedResponsesSearch(CannedResponseQuery cannedResponseQuery) throws ApiException {
		return cannedResponsesSearchWithHttpInfo(cannedResponseQuery).getData();
	}

	/**
	 * search Search for domains in the current account&lt;br&gt;
	 * 
	 * @param cannedResponseQuery (required)
	 * @return ApiResponse&lt;CannedResponseResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CannedResponseResult> cannedResponsesSearchWithHttpInfo(CannedResponseQuery cannedResponseQuery) throws ApiException {
		Object localVarPostBody = cannedResponseQuery;

		// verify the required parameter 'cannedResponseQuery' is set
		if (cannedResponseQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'cannedResponseQuery' when calling cannedResponsesSearch");
		}

		// create path and map variables
		String localVarPath = "/cannedresponses/search";

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

		GenericType<CannedResponseResult> localVarReturnType = new GenericType<CannedResponseResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param cannedResponse The entity to update (required)
	 * @return CannedResponse
	 * @throws ApiException if fails to make API call
	 */
	public CannedResponse cannedResponsesUpdate(CannedResponse cannedResponse) throws ApiException {
		return cannedResponsesUpdateWithHttpInfo(cannedResponse).getData();
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param cannedResponse The entity to update (required)
	 * @return ApiResponse&lt;CannedResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CannedResponse> cannedResponsesUpdateWithHttpInfo(CannedResponse cannedResponse) throws ApiException {
		Object localVarPostBody = cannedResponse;

		// verify the required parameter 'cannedResponse' is set
		if (cannedResponse == null) {
			throw new ApiException(400, "Missing the required parameter 'cannedResponse' when calling cannedResponsesUpdate");
		}

		// create path and map variables
		String localVarPath = "/cannedresponses/update";

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

		GenericType<CannedResponse> localVarReturnType = new GenericType<CannedResponse>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
