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
import com.unblu.webapi.model.v4.WebhookRegistration;
import com.unblu.webapi.model.v4.WebhookRegistrationList;
import com.unblu.webapi.model.v4.WebhookRegistrationQuery;
import com.unblu.webapi.model.v4.WebhookRegistrationResult;

import jakarta.ws.rs.core.GenericType;

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
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
	 * 
	 * @param webhookRegistration The entity to create (required)
	 * @return WebhookRegistration
	 * @throws ApiException if fails to make API call
	 */
	public WebhookRegistration webhookRegistrationsCreate(WebhookRegistration webhookRegistration) throws ApiException {
		return webhookRegistrationsCreateWithHttpInfo(webhookRegistration).getData();
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
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
	 * delete Deletes the webhook registration with the given ID&lt;br&gt;
	 * 
	 * @param registrationId The ID of the webhook registration which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void webhookRegistrationsDelete(String registrationId) throws ApiException {

		webhookRegistrationsDeleteWithHttpInfo(registrationId);
	}

	/**
	 * delete Deletes the webhook registration with the given ID&lt;br&gt;
	 * 
	 * @param registrationId The ID of the webhook registration which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> webhookRegistrationsDeleteWithHttpInfo(String registrationId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'registrationId' is set
		if (registrationId == null) {
			throw new ApiException(400, "Missing the required parameter 'registrationId' when calling webhookRegistrationsDelete");
		}

		// create path and map variables
		String localVarPath = "/webhookregistrations/{registrationId}/delete"
				.replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

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
	 * read Returns the webhook registration with the given ID&lt;br&gt;
	 * 
	 * @param registrationId ID of the webhook registration which should be returned (required)
	 * @return WebhookRegistration
	 * @throws ApiException if fails to make API call
	 */
	public WebhookRegistration webhookRegistrationsRead(String registrationId) throws ApiException {
		return webhookRegistrationsReadWithHttpInfo(registrationId).getData();
	}

	/**
	 * read Returns the webhook registration with the given ID&lt;br&gt;
	 * 
	 * @param registrationId ID of the webhook registration which should be returned (required)
	 * @return ApiResponse&lt;WebhookRegistration&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebhookRegistration> webhookRegistrationsReadWithHttpInfo(String registrationId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'registrationId' is set
		if (registrationId == null) {
			throw new ApiException(400, "Missing the required parameter 'registrationId' when calling webhookRegistrationsRead");
		}

		// create path and map variables
		String localVarPath = "/webhookregistrations/{registrationId}/read"
				.replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

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

		GenericType<WebhookRegistration> localVarReturnType = new GenericType<WebhookRegistration>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of webhook registrations with the given IDs. IDs that can&#39;t be found are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the webhook registrations to fetch (required)
	 * @return WebhookRegistrationList
	 * @throws ApiException if fails to make API call
	 */
	public WebhookRegistrationList webhookRegistrationsReadMultiple(List<String> requestBody) throws ApiException {
		return webhookRegistrationsReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple Gets a list of webhook registrations with the given IDs. IDs that can&#39;t be found are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the webhook registrations to fetch (required)
	 * @return ApiResponse&lt;WebhookRegistrationList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebhookRegistrationList> webhookRegistrationsReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
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

		GenericType<WebhookRegistrationList> localVarReturnType = new GenericType<WebhookRegistrationList>() {
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
	 * sendPing Sends a \&quot;ping\&quot; webhook to the endpoint of the given registration.&lt;br&gt;
	 * 
	 * @param registrationId Id of the registration to send the ping webhook to. (required)
	 * @throws ApiException if fails to make API call
	 */
	public void webhookRegistrationsSendPing(String registrationId) throws ApiException {

		webhookRegistrationsSendPingWithHttpInfo(registrationId);
	}

	/**
	 * sendPing Sends a \&quot;ping\&quot; webhook to the endpoint of the given registration.&lt;br&gt;
	 * 
	 * @param registrationId Id of the registration to send the ping webhook to. (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> webhookRegistrationsSendPingWithHttpInfo(String registrationId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'registrationId' is set
		if (registrationId == null) {
			throw new ApiException(400, "Missing the required parameter 'registrationId' when calling webhookRegistrationsSendPing");
		}

		// create path and map variables
		String localVarPath = "/webhookregistrations/{registrationId}/sendPing"
				.replaceAll("\\{" + "registrationId" + "\\}", apiClient.escapeString(registrationId.toString()));

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

		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
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
