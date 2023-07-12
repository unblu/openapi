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
import com.unblu.webapi.model.v3.WebhookRegistration;
import com.unblu.webapi.model.v3.WebhookRegistrationQuery;
import com.unblu.webapi.model.v3.WebhookRegistrationResult;
import com.unblu.webapi.model.v3.WebhookRegistrationsPingBody;

public class WebhookRegistrationsApi {
	private ApiClient apiClient;

	public WebhookRegistrationsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public WebhookRegistrationsApi(ApiClient apiClient) {
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
	 * @param webhookRegistration The entity to create (required)
	 * @return WebhookRegistration
	 * @throws ApiException if fails to make API call
	 */
	public WebhookRegistration webhookRegistrationsCreate(WebhookRegistration webhookRegistration) throws ApiException {
		return webhookRegistrationsCreateWithHttpInfo(webhookRegistration).getData();
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
	 * 
	 * @param webhookRegistration The entity to create (required)
	 * @return ApiResponse&lt;WebhookRegistration&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebhookRegistration> webhookRegistrationsCreateWithHttpInfo(WebhookRegistration webhookRegistration) throws ApiException {
		Object localVarPostBody = webhookRegistration;

		// verify the required parameter 'webhookRegistration' is set
		if (webhookRegistration == null) {
			throw new ApiException(400, "Missing the required parameter 'webhookRegistration' when calling webhookRegistrationsCreate");
		}

		// create path and map variables
		String localVarPath = "/webhookregistrations/create";

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

		GenericType<WebhookRegistration> localVarReturnType = new GenericType<WebhookRegistration>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void webhookRegistrationsDelete(String id) throws ApiException {

		webhookRegistrationsDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> webhookRegistrationsDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/webhookregistrations/delete";

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
	public void webhookRegistrationsDeleteLegacyGet(String id) throws ApiException {

		webhookRegistrationsDeleteLegacyGetWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> webhookRegistrationsDeleteLegacyGetWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/webhookregistrations/delete";

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
	 * getByName Returns the webhook registration for the given name.&lt;br&gt;
	 * 
	 * @param name The name of the requested webhook registration (optional)
	 * @return WebhookRegistration
	 * @throws ApiException if fails to make API call
	 */
	public WebhookRegistration webhookRegistrationsGetByName(String name) throws ApiException {
		return webhookRegistrationsGetByNameWithHttpInfo(name).getData();
	}

	/**
	 * getByName Returns the webhook registration for the given name.&lt;br&gt;
	 * 
	 * @param name The name of the requested webhook registration (optional)
	 * @return ApiResponse&lt;WebhookRegistration&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebhookRegistration> webhookRegistrationsGetByNameWithHttpInfo(String name) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/webhookregistrations/getByName";

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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<WebhookRegistration> localVarReturnType = new GenericType<WebhookRegistration>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * ping Sends a \&quot;ping\&quot; webhook to the endpoint of the given registration.&lt;br&gt;
	 * 
	 * @param webhookRegistrationsPingBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void webhookRegistrationsPing(WebhookRegistrationsPingBody webhookRegistrationsPingBody) throws ApiException {

		webhookRegistrationsPingWithHttpInfo(webhookRegistrationsPingBody);
	}

	/**
	 * ping Sends a \&quot;ping\&quot; webhook to the endpoint of the given registration.&lt;br&gt;
	 * 
	 * @param webhookRegistrationsPingBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> webhookRegistrationsPingWithHttpInfo(WebhookRegistrationsPingBody webhookRegistrationsPingBody) throws ApiException {
		Object localVarPostBody = webhookRegistrationsPingBody;

		// verify the required parameter 'webhookRegistrationsPingBody' is set
		if (webhookRegistrationsPingBody == null) {
			throw new ApiException(400, "Missing the required parameter 'webhookRegistrationsPingBody' when calling webhookRegistrationsPing");
		}

		// create path and map variables
		String localVarPath = "/webhookregistrations/ping";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = {

		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * ping Sends a \&quot;ping\&quot; webhook to the endpoint of the given registration.&lt;br&gt;
	 * 
	 * @param id (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void webhookRegistrationsPingLegacyGet(String id) throws ApiException {

		webhookRegistrationsPingLegacyGetWithHttpInfo(id);
	}

	/**
	 * ping Sends a \&quot;ping\&quot; webhook to the endpoint of the given registration.&lt;br&gt;
	 * 
	 * @param id (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> webhookRegistrationsPingLegacyGetWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/webhookregistrations/ping";

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
	 * @return WebhookRegistration
	 * @throws ApiException if fails to make API call
	 */
	public WebhookRegistration webhookRegistrationsRead(String id) throws ApiException {
		return webhookRegistrationsReadWithHttpInfo(id).getData();
	}

	/**
	 * read Returns the entity for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the entity which should be returned (optional)
	 * @return ApiResponse&lt;WebhookRegistration&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebhookRegistration> webhookRegistrationsReadWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/webhookregistrations/read";

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

		GenericType<WebhookRegistration> localVarReturnType = new GenericType<WebhookRegistration>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of entities for the given ID&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The ID&#39;s for which the entities should be fetched (required)
	 * @return List&lt;WebhookRegistration&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<WebhookRegistration> webhookRegistrationsReadMultiple(List<String> requestBody) throws ApiException {
		return webhookRegistrationsReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple Gets a list of entities for the given ID&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The ID&#39;s for which the entities should be fetched (required)
	 * @return ApiResponse&lt;List&lt;WebhookRegistration&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<WebhookRegistration>> webhookRegistrationsReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling webhookRegistrationsReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/webhookregistrations/readMultiple";

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

		GenericType<List<WebhookRegistration>> localVarReturnType = new GenericType<List<WebhookRegistration>>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for webhook registrations in the current account&lt;br&gt;
	 * 
	 * @param webhookRegistrationQuery (required)
	 * @return WebhookRegistrationResult
	 * @throws ApiException if fails to make API call
	 */
	public WebhookRegistrationResult webhookRegistrationsSearch(WebhookRegistrationQuery webhookRegistrationQuery) throws ApiException {
		return webhookRegistrationsSearchWithHttpInfo(webhookRegistrationQuery).getData();
	}

	/**
	 * search Search for webhook registrations in the current account&lt;br&gt;
	 * 
	 * @param webhookRegistrationQuery (required)
	 * @return ApiResponse&lt;WebhookRegistrationResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebhookRegistrationResult> webhookRegistrationsSearchWithHttpInfo(WebhookRegistrationQuery webhookRegistrationQuery) throws ApiException {
		Object localVarPostBody = webhookRegistrationQuery;

		// verify the required parameter 'webhookRegistrationQuery' is set
		if (webhookRegistrationQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'webhookRegistrationQuery' when calling webhookRegistrationsSearch");
		}

		// create path and map variables
		String localVarPath = "/webhookregistrations/search";

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

		GenericType<WebhookRegistrationResult> localVarReturnType = new GenericType<WebhookRegistrationResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param webhookRegistration The entity to update (required)
	 * @return WebhookRegistration
	 * @throws ApiException if fails to make API call
	 */
	public WebhookRegistration webhookRegistrationsUpdate(WebhookRegistration webhookRegistration) throws ApiException {
		return webhookRegistrationsUpdateWithHttpInfo(webhookRegistration).getData();
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param webhookRegistration The entity to update (required)
	 * @return ApiResponse&lt;WebhookRegistration&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebhookRegistration> webhookRegistrationsUpdateWithHttpInfo(WebhookRegistration webhookRegistration) throws ApiException {
		Object localVarPostBody = webhookRegistration;

		// verify the required parameter 'webhookRegistration' is set
		if (webhookRegistration == null) {
			throw new ApiException(400, "Missing the required parameter 'webhookRegistration' when calling webhookRegistrationsUpdate");
		}

		// create path and map variables
		String localVarPath = "/webhookregistrations/update";

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

		GenericType<WebhookRegistration> localVarReturnType = new GenericType<WebhookRegistration>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
