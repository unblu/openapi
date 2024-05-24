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
import com.unblu.webapi.model.v4.ExternalMessengerContact;
import com.unblu.webapi.model.v4.ExternalMessengerContactList;
import com.unblu.webapi.model.v4.ExternalMessengerContactQuery;
import com.unblu.webapi.model.v4.ExternalMessengerContactResult;
import com.unblu.webapi.model.v4.ExternalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody;

import jakarta.ws.rs.core.GenericType;

public class ExternalMessengerContactsApi {
	private ApiClient apiClient;

	public ExternalMessengerContactsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ExternalMessengerContactsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates an external messenger contact. &lt;p&gt; The configuration property
	 * &#x60;com.unblu.permission.roleAllowed.manageExternalMessengerContacts&#x60; defines which user roles the endpoint is available to.&lt;br&gt;
	 * 
	 * @param externalMessengerContact to create (required)
	 * @return ExternalMessengerContact
	 * @throws ApiException if fails to make API call
	 */
	public ExternalMessengerContact externalMessengerContactsCreate(ExternalMessengerContact externalMessengerContact) throws ApiException {
		return externalMessengerContactsCreateWithHttpInfo(externalMessengerContact).getData();
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates an external messenger contact. &lt;p&gt; The configuration property
	 * &#x60;com.unblu.permission.roleAllowed.manageExternalMessengerContacts&#x60; defines which user roles the endpoint is available to.&lt;br&gt;
	 * 
	 * @param externalMessengerContact to create (required)
	 * @return ApiResponse&lt;ExternalMessengerContact&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ExternalMessengerContact> externalMessengerContactsCreateWithHttpInfo(ExternalMessengerContact externalMessengerContact) throws ApiException {
		Object localVarPostBody = externalMessengerContact;

		// verify the required parameter 'externalMessengerContact' is set
		if (externalMessengerContact == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengerContact' when calling externalMessengerContactsCreate");
		}

		// create path and map variables
		String localVarPath = "/externalmessengercontacts/create";

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

		GenericType<ExternalMessengerContact> localVarReturnType = new GenericType<ExternalMessengerContact>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes an external messenger contact. This ends all the contact&#39;s participations in
	 * conversations. &lt;p&gt; The configuration property &#x60;com.unblu.permission.roleAllowed.manageExternalMessengerContacts&#x60; defines which user roles
	 * this endpoint is available to.&lt;br&gt;
	 * 
	 * @param externalMessengerContactId The ID of the external messenger contact to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public void externalMessengerContactsDelete(String externalMessengerContactId) throws ApiException {

		externalMessengerContactsDeleteWithHttpInfo(externalMessengerContactId);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes an external messenger contact. This ends all the contact&#39;s participations in
	 * conversations. &lt;p&gt; The configuration property &#x60;com.unblu.permission.roleAllowed.manageExternalMessengerContacts&#x60; defines which user roles
	 * this endpoint is available to.&lt;br&gt;
	 * 
	 * @param externalMessengerContactId The ID of the external messenger contact to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> externalMessengerContactsDeleteWithHttpInfo(String externalMessengerContactId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'externalMessengerContactId' is set
		if (externalMessengerContactId == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengerContactId' when calling externalMessengerContactsDelete");
		}

		// create path and map variables
		String localVarPath = "/externalmessengercontacts/{externalMessengerContactId}/delete"
				.replaceAll("\\{" + "externalMessengerContactId" + "\\}", apiClient.escapeString(externalMessengerContactId.toString()));

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
	 * migrateContactPersonWithAllConnectedConversations &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Changes the linked person of the external messenger
	 * contact. All conversations the external messenger contact participated in are migrated to the new person, provided the conversation allows a user change.
	 * Allowing it means the configuration property &#x60;com.unblu.conversation.lifecycle.allowMigrationOnExternalMessengerContactMigration&#x60; isn&#39;t set to
	 * &#x60;EConversationReplaceUserOnLoginMode.NEVER&#x60; on the conversation. Other conversations not linked to the external messenger contact and just having
	 * the same person used, e.g. direct conversations without an external messenger, will not be migrated. &lt;p&gt; If the new person ID matches the current
	 * person ID, calling this endpoint doesn&#39;t do anything. &lt;p&gt; The configuration property
	 * &#x60;com.unblu.permission.roleAllowed.manageExternalMessengerContacts&#x60; defines which user roles the endpoint is available to.&lt;br&gt;
	 * 
	 * @param externalMessengerContactId The ID of the external messenger contact to update (required)
	 * @param externalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody (required)
	 * @return ExternalMessengerContact
	 * @throws ApiException if fails to make API call
	 */
	public ExternalMessengerContact externalMessengerContactsMigrateContactPersonWithAllConnectedConversations(String externalMessengerContactId, ExternalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody externalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody) throws ApiException {
		return externalMessengerContactsMigrateContactPersonWithAllConnectedConversationsWithHttpInfo(externalMessengerContactId, externalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody).getData();
	}

	/**
	 * migrateContactPersonWithAllConnectedConversations &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Changes the linked person of the external messenger
	 * contact. All conversations the external messenger contact participated in are migrated to the new person, provided the conversation allows a user change.
	 * Allowing it means the configuration property &#x60;com.unblu.conversation.lifecycle.allowMigrationOnExternalMessengerContactMigration&#x60; isn&#39;t set to
	 * &#x60;EConversationReplaceUserOnLoginMode.NEVER&#x60; on the conversation. Other conversations not linked to the external messenger contact and just having
	 * the same person used, e.g. direct conversations without an external messenger, will not be migrated. &lt;p&gt; If the new person ID matches the current
	 * person ID, calling this endpoint doesn&#39;t do anything. &lt;p&gt; The configuration property
	 * &#x60;com.unblu.permission.roleAllowed.manageExternalMessengerContacts&#x60; defines which user roles the endpoint is available to.&lt;br&gt;
	 * 
	 * @param externalMessengerContactId The ID of the external messenger contact to update (required)
	 * @param externalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody (required)
	 * @return ApiResponse&lt;ExternalMessengerContact&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ExternalMessengerContact> externalMessengerContactsMigrateContactPersonWithAllConnectedConversationsWithHttpInfo(String externalMessengerContactId, ExternalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody externalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody) throws ApiException {
		Object localVarPostBody = externalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody;

		// verify the required parameter 'externalMessengerContactId' is set
		if (externalMessengerContactId == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengerContactId' when calling externalMessengerContactsMigrateContactPersonWithAllConnectedConversations");
		}

		// verify the required parameter 'externalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody' is set
		if (externalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody' when calling externalMessengerContactsMigrateContactPersonWithAllConnectedConversations");
		}

		// create path and map variables
		String localVarPath = "/externalmessengercontacts/{externalMessengerContactId}/migrateContactPersonWithAllConnectedConversations"
				.replaceAll("\\{" + "externalMessengerContactId" + "\\}", apiClient.escapeString(externalMessengerContactId.toString()));

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

		GenericType<ExternalMessengerContact> localVarReturnType = new GenericType<ExternalMessengerContact>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * migrateContactPersonWithGivenConversations &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Changes the linked person of the external messenger contact
	 * and migrates the list of conversations passed in to the new person, provided the conversation allows a user change. Allowing it means the configuration
	 * property &#x60;com.unblu.conversation.lifecycle.allowMigrationOnExternalMessengerContactMigration&#x60; isn&#39;t set to
	 * &#x60;EConversationReplaceUserOnLoginMode.NEVER&#x60;. &lt;p&gt; For all other conversations the contact is part of, their participation is removed.
	 * &lt;p&gt; If the new person ID matches the current person ID, calling this endpoint doesn&#39;t do anything. &lt;p&gt; The given conversation Ids have to be
	 * in the list of none ended conversation where the external messenger contact is a participant. If not, an error will be returned before doing any migration.
	 * &lt;p&gt; The configuration property &#x60;com.unblu.permission.roleAllowed.migrateExternalMessengerContacts&#x60; defines which user roles the endpoint is
	 * available to.&lt;br&gt;
	 * 
	 * @param externalMessengerContactId The ID of the external messenger contact to update (required)
	 * @param requestBody The conversations that should be migrated. The conversations must not be ended and the passed in external messenger contact must be a
	 * participant. (required)
	 * @param newPersonId The new person ID to set on the external messenger contact (optional)
	 * @return ExternalMessengerContact
	 * @throws ApiException if fails to make API call
	 */
	public ExternalMessengerContact externalMessengerContactsMigrateContactPersonWithGivenConversations(String externalMessengerContactId, List<String> requestBody, String newPersonId) throws ApiException {
		return externalMessengerContactsMigrateContactPersonWithGivenConversationsWithHttpInfo(externalMessengerContactId, requestBody, newPersonId).getData();
	}

	/**
	 * migrateContactPersonWithGivenConversations &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Changes the linked person of the external messenger contact
	 * and migrates the list of conversations passed in to the new person, provided the conversation allows a user change. Allowing it means the configuration
	 * property &#x60;com.unblu.conversation.lifecycle.allowMigrationOnExternalMessengerContactMigration&#x60; isn&#39;t set to
	 * &#x60;EConversationReplaceUserOnLoginMode.NEVER&#x60;. &lt;p&gt; For all other conversations the contact is part of, their participation is removed.
	 * &lt;p&gt; If the new person ID matches the current person ID, calling this endpoint doesn&#39;t do anything. &lt;p&gt; The given conversation Ids have to be
	 * in the list of none ended conversation where the external messenger contact is a participant. If not, an error will be returned before doing any migration.
	 * &lt;p&gt; The configuration property &#x60;com.unblu.permission.roleAllowed.migrateExternalMessengerContacts&#x60; defines which user roles the endpoint is
	 * available to.&lt;br&gt;
	 * 
	 * @param externalMessengerContactId The ID of the external messenger contact to update (required)
	 * @param requestBody The conversations that should be migrated. The conversations must not be ended and the passed in external messenger contact must be a
	 * participant. (required)
	 * @param newPersonId The new person ID to set on the external messenger contact (optional)
	 * @return ApiResponse&lt;ExternalMessengerContact&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ExternalMessengerContact> externalMessengerContactsMigrateContactPersonWithGivenConversationsWithHttpInfo(String externalMessengerContactId, List<String> requestBody, String newPersonId) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'externalMessengerContactId' is set
		if (externalMessengerContactId == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengerContactId' when calling externalMessengerContactsMigrateContactPersonWithGivenConversations");
		}

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling externalMessengerContactsMigrateContactPersonWithGivenConversations");
		}

		// create path and map variables
		String localVarPath = "/externalmessengercontacts/{externalMessengerContactId}/migrateContactPersonWithGivenConversations"
				.replaceAll("\\{" + "externalMessengerContactId" + "\\}", apiClient.escapeString(externalMessengerContactId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "newPersonId", newPersonId));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ExternalMessengerContact> localVarReturnType = new GenericType<ExternalMessengerContact>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the external messenger contact with the given ID. &lt;p&gt; The configuration property
	 * &#x60;com.unblu.permission.roleAllowed.manageExternalMessengerContacts&#x60; defines which user roles the endpoint is available to.&lt;br&gt;
	 * 
	 * @param externalMessengerContactId The ID of the external messenger contact to retrieve (required)
	 * @return ExternalMessengerContact
	 * @throws ApiException if fails to make API call
	 */
	public ExternalMessengerContact externalMessengerContactsRead(String externalMessengerContactId) throws ApiException {
		return externalMessengerContactsReadWithHttpInfo(externalMessengerContactId).getData();
	}

	/**
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the external messenger contact with the given ID. &lt;p&gt; The configuration property
	 * &#x60;com.unblu.permission.roleAllowed.manageExternalMessengerContacts&#x60; defines which user roles the endpoint is available to.&lt;br&gt;
	 * 
	 * @param externalMessengerContactId The ID of the external messenger contact to retrieve (required)
	 * @return ApiResponse&lt;ExternalMessengerContact&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ExternalMessengerContact> externalMessengerContactsReadWithHttpInfo(String externalMessengerContactId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'externalMessengerContactId' is set
		if (externalMessengerContactId == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengerContactId' when calling externalMessengerContactsRead");
		}

		// create path and map variables
		String localVarPath = "/externalmessengercontacts/{externalMessengerContactId}/read"
				.replaceAll("\\{" + "externalMessengerContactId" + "\\}", apiClient.escapeString(externalMessengerContactId.toString()));

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

		GenericType<ExternalMessengerContact> localVarReturnType = new GenericType<ExternalMessengerContact>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;readMultiple operation
	 * 
	 * @param requestBody (required)
	 * @return ExternalMessengerContactList
	 * @throws ApiException if fails to make API call
	 */
	public ExternalMessengerContactList externalMessengerContactsReadMultiple(List<String> requestBody) throws ApiException {
		return externalMessengerContactsReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;readMultiple operation
	 * 
	 * @param requestBody (required)
	 * @return ApiResponse&lt;ExternalMessengerContactList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ExternalMessengerContactList> externalMessengerContactsReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling externalMessengerContactsReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/externalmessengercontacts/readMultiple";

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

		GenericType<ExternalMessengerContactList> localVarReturnType = new GenericType<ExternalMessengerContactList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Search for &#x60;ExternalMessengerContact&#x60;s in the current account&lt;br&gt;
	 * 
	 * @param externalMessengerContactQuery (required)
	 * @return ExternalMessengerContactResult
	 * @throws ApiException if fails to make API call
	 */
	public ExternalMessengerContactResult externalMessengerContactsSearch(ExternalMessengerContactQuery externalMessengerContactQuery) throws ApiException {
		return externalMessengerContactsSearchWithHttpInfo(externalMessengerContactQuery).getData();
	}

	/**
	 * search &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Search for &#x60;ExternalMessengerContact&#x60;s in the current account&lt;br&gt;
	 * 
	 * @param externalMessengerContactQuery (required)
	 * @return ApiResponse&lt;ExternalMessengerContactResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ExternalMessengerContactResult> externalMessengerContactsSearchWithHttpInfo(ExternalMessengerContactQuery externalMessengerContactQuery) throws ApiException {
		Object localVarPostBody = externalMessengerContactQuery;

		// verify the required parameter 'externalMessengerContactQuery' is set
		if (externalMessengerContactQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengerContactQuery' when calling externalMessengerContactsSearch");
		}

		// create path and map variables
		String localVarPath = "/externalmessengercontacts/search";

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

		GenericType<ExternalMessengerContactResult> localVarReturnType = new GenericType<ExternalMessengerContactResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates an external messenger contact. &lt;p&gt; The configuration property
	 * &#x60;com.unblu.permission.roleAllowed.manageExternalMessengerContacts&#x60; defines which user roles the endpoint is available to. &lt;p&gt;
	 * &lt;b&gt;Note:&lt;/b&gt; This can&#39;t be used to update the personId. To update the link to a person, use the
	 * endpoint&#x60;migrateContactPersonWithAllConnectedConversations&#x60; or &#x60;migrateContactPersonWithGivenConversations&#x60;.&lt;br&gt;
	 * 
	 * @param externalMessengerContact to update (required)
	 * @return ExternalMessengerContact
	 * @throws ApiException if fails to make API call
	 */
	public ExternalMessengerContact externalMessengerContactsUpdate(ExternalMessengerContact externalMessengerContact) throws ApiException {
		return externalMessengerContactsUpdateWithHttpInfo(externalMessengerContact).getData();
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates an external messenger contact. &lt;p&gt; The configuration property
	 * &#x60;com.unblu.permission.roleAllowed.manageExternalMessengerContacts&#x60; defines which user roles the endpoint is available to. &lt;p&gt;
	 * &lt;b&gt;Note:&lt;/b&gt; This can&#39;t be used to update the personId. To update the link to a person, use the
	 * endpoint&#x60;migrateContactPersonWithAllConnectedConversations&#x60; or &#x60;migrateContactPersonWithGivenConversations&#x60;.&lt;br&gt;
	 * 
	 * @param externalMessengerContact to update (required)
	 * @return ApiResponse&lt;ExternalMessengerContact&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ExternalMessengerContact> externalMessengerContactsUpdateWithHttpInfo(ExternalMessengerContact externalMessengerContact) throws ApiException {
		Object localVarPostBody = externalMessengerContact;

		// verify the required parameter 'externalMessengerContact' is set
		if (externalMessengerContact == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengerContact' when calling externalMessengerContactsUpdate");
		}

		// create path and map variables
		String localVarPath = "/externalmessengercontacts/update";

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

		GenericType<ExternalMessengerContact> localVarReturnType = new GenericType<ExternalMessengerContact>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
