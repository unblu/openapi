package com.unblu.webapi.jersey.v3.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.ws.rs.core.GenericType;

import com.unblu.webapi.jersey.v3.invoker.ApiClient;
import com.unblu.webapi.jersey.v3.invoker.ApiException;
import com.unblu.webapi.jersey.v3.invoker.ApiResponse;
import com.unblu.webapi.jersey.v3.invoker.Configuration;
import com.unblu.webapi.jersey.v3.invoker.Pair;
import com.unblu.webapi.model.v3.Contact;
import com.unblu.webapi.model.v3.ContactQuery;
import com.unblu.webapi.model.v3.ContactResult;

public class ContactsApi {
	private ApiClient apiClient;

	public ContactsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ContactsApi(ApiClient apiClient) {
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
	 * @param contact The entity to create (required)
	 * @return Contact
	 * @throws ApiException if fails to make API call
	 */
	public Contact contactsCreate(Contact contact) throws ApiException {
		return contactsCreateWithHttpInfo(contact).getData();
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
	 * 
	 * @param contact The entity to create (required)
	 * @return ApiResponse&lt;Contact&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Contact> contactsCreateWithHttpInfo(Contact contact) throws ApiException {
		Object localVarPostBody = contact;

		// verify the required parameter 'contact' is set
		if (contact == null) {
			throw new ApiException(400, "Missing the required parameter 'contact' when calling contactsCreate");
		}

		// create path and map variables
		String localVarPath = "/contacts/create";

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

		GenericType<Contact> localVarReturnType = new GenericType<Contact>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void contactsDelete(String id) throws ApiException {

		contactsDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> contactsDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/contacts/delete";

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
	public void contactsDeleteLegacyGet(String id) throws ApiException {

		contactsDeleteLegacyGetWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> contactsDeleteLegacyGetWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/contacts/delete";

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
	 * read Returns the entity for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the entity which should be returned (optional)
	 * @return Contact
	 * @throws ApiException if fails to make API call
	 */
	public Contact contactsRead(String id) throws ApiException {
		return contactsReadWithHttpInfo(id).getData();
	}

	/**
	 * read Returns the entity for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the entity which should be returned (optional)
	 * @return ApiResponse&lt;Contact&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Contact> contactsReadWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/contacts/read";

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

		GenericType<Contact> localVarReturnType = new GenericType<Contact>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of entities for the given ID&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The ID&#39;s for which the entities should be fetched (required)
	 * @return List&lt;Contact&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<Contact> contactsReadMultiple(List<String> requestBody) throws ApiException {
		return contactsReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple Gets a list of entities for the given ID&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The ID&#39;s for which the entities should be fetched (required)
	 * @return ApiResponse&lt;List&lt;Contact&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<Contact>> contactsReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling contactsReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/contacts/readMultiple";

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

		GenericType<List<Contact>> localVarReturnType = new GenericType<List<Contact>>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for contacts in the current account&lt;br&gt;
	 * 
	 * @param contactQuery (required)
	 * @return ContactResult
	 * @throws ApiException if fails to make API call
	 */
	public ContactResult contactsSearch(ContactQuery contactQuery) throws ApiException {
		return contactsSearchWithHttpInfo(contactQuery).getData();
	}

	/**
	 * search Search for contacts in the current account&lt;br&gt;
	 * 
	 * @param contactQuery (required)
	 * @return ApiResponse&lt;ContactResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ContactResult> contactsSearchWithHttpInfo(ContactQuery contactQuery) throws ApiException {
		Object localVarPostBody = contactQuery;

		// verify the required parameter 'contactQuery' is set
		if (contactQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'contactQuery' when calling contactsSearch");
		}

		// create path and map variables
		String localVarPath = "/contacts/search";

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

		GenericType<ContactResult> localVarReturnType = new GenericType<ContactResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param contact The entity to update (required)
	 * @return Contact
	 * @throws ApiException if fails to make API call
	 */
	public Contact contactsUpdate(Contact contact) throws ApiException {
		return contactsUpdateWithHttpInfo(contact).getData();
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param contact The entity to update (required)
	 * @return ApiResponse&lt;Contact&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Contact> contactsUpdateWithHttpInfo(Contact contact) throws ApiException {
		Object localVarPostBody = contact;

		// verify the required parameter 'contact' is set
		if (contact == null) {
			throw new ApiException(400, "Missing the required parameter 'contact' when calling contactsUpdate");
		}

		// create path and map variables
		String localVarPath = "/contacts/update";

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

		GenericType<Contact> localVarReturnType = new GenericType<Contact>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
