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
import com.unblu.webapi.model.v4.ExpandFields;
import com.unblu.webapi.model.v4.WebhookRegistrationData;
import com.unblu.webapi.model.v4.WebhookRegistrationDataList;
import com.unblu.webapi.model.v4.WebhookRegistrationDataResult;
import com.unblu.webapi.model.v4.WebhookRegistrationQuery;

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
	 * create Creates a new webhook registration. For registrations that trigger an Aria agentic flow, the flow is created in the Aria orchestrator as part of this
	 * operation.&lt;br&gt;
	 * 
	 * @param webhookRegistrationData The webhook registration to create (required)
	 * @param expand (optional)
	 * @return WebhookRegistrationData
	 * @throws ApiException if fails to make API call
	 */
	public WebhookRegistrationData webhookRegistrationsCreate(WebhookRegistrationData webhookRegistrationData, List<ExpandFields> expand) throws ApiException {
		return webhookRegistrationsCreateWithHttpInfo(webhookRegistrationData, expand).getData();
	}

	/**
	 * create Creates a new webhook registration. For registrations that trigger an Aria agentic flow, the flow is created in the Aria orchestrator as part of this
	 * operation.&lt;br&gt;
	 * 
	 * @param webhookRegistrationData The webhook registration to create (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;WebhookRegistrationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebhookRegistrationData> webhookRegistrationsCreateWithHttpInfo(WebhookRegistrationData webhookRegistrationData, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = webhookRegistrationData;

		// verify the required parameter 'webhookRegistrationData' is set
		if (webhookRegistrationData == null) {
			throw new ApiException(400, "Missing the required parameter 'webhookRegistrationData' when calling webhookRegistrationsCreate");
		}

		// create path and map variables
		String localVarPath = "/webhookregistrations/create";

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

		GenericType<WebhookRegistrationData> localVarReturnType = new GenericType<WebhookRegistrationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the webhook registration with the given ID&lt;br&gt;
	 * 
	 * @param registrationId The ID of the webhook registration to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public void webhookRegistrationsDelete(String registrationId) throws ApiException {

		webhookRegistrationsDeleteWithHttpInfo(registrationId);
	}

	/**
	 * delete Deletes the webhook registration with the given ID&lt;br&gt;
	 * 
	 * @param registrationId The ID of the webhook registration to delete (required)
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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * getByName Returns the webhook registration with the name provided.&lt;br&gt;
	 * 
	 * @param name The name of the requested webhook registration (optional)
	 * @param expand (optional)
	 * @return WebhookRegistrationData
	 * @throws ApiException if fails to make API call
	 */
	public WebhookRegistrationData webhookRegistrationsGetByName(String name, List<ExpandFields> expand) throws ApiException {
		return webhookRegistrationsGetByNameWithHttpInfo(name, expand).getData();
	}

	/**
	 * getByName Returns the webhook registration with the name provided.&lt;br&gt;
	 * 
	 * @param name The name of the requested webhook registration (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;WebhookRegistrationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebhookRegistrationData> webhookRegistrationsGetByNameWithHttpInfo(String name, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/webhookregistrations/getByName";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<WebhookRegistrationData> localVarReturnType = new GenericType<WebhookRegistrationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the webhook registration with the given ID&lt;br&gt;
	 * 
	 * @param registrationId ID of the webhook registration to return (required)
	 * @param expand (optional)
	 * @return WebhookRegistrationData
	 * @throws ApiException if fails to make API call
	 */
	public WebhookRegistrationData webhookRegistrationsRead(String registrationId, List<ExpandFields> expand) throws ApiException {
		return webhookRegistrationsReadWithHttpInfo(registrationId, expand).getData();
	}

	/**
	 * read Returns the webhook registration with the given ID&lt;br&gt;
	 * 
	 * @param registrationId ID of the webhook registration to return (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;WebhookRegistrationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebhookRegistrationData> webhookRegistrationsReadWithHttpInfo(String registrationId, List<ExpandFields> expand) throws ApiException {
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

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<WebhookRegistrationData> localVarReturnType = new GenericType<WebhookRegistrationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of the webhook registrations with the given IDs. IDs that can&#39;t be found are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the webhook registrations to fetch (required)
	 * @return WebhookRegistrationDataList
	 * @throws ApiException if fails to make API call
	 */
	public WebhookRegistrationDataList webhookRegistrationsReadMultiple(List<String> requestBody) throws ApiException {
		return webhookRegistrationsReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple Gets a list of the webhook registrations with the given IDs. IDs that can&#39;t be found are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the webhook registrations to fetch (required)
	 * @return ApiResponse&lt;WebhookRegistrationDataList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebhookRegistrationDataList> webhookRegistrationsReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<WebhookRegistrationDataList> localVarReturnType = new GenericType<WebhookRegistrationDataList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * resetDeliveryBackoff Resets the retry backoff of the webhook registration. &lt;p&gt; The waiting time between delivery retries grows exponentially with every
	 * failure. Call this once the endpoint is available again to deliver the pending events immediately instead of at the next scheduled retry. &lt;p&gt;
	 * &lt;b&gt;Note:&lt;/b&gt; The status isn&#39;t changed, and only an &#x60;ACTIVE&#x60; registration delivers. After reactivating a registration that was set
	 * to &#x60;INACTIVE&#x60;, call this operation to drop any backoff it still has. A registration that Unblu deactivated (&#x60;INACTIVE_UNAVAILABLE&#x60;) has
	 * no backoff left, so calling this operation isn&#39;t needed.&lt;br&gt;
	 * 
	 * @param registrationId The ID of the webhook registration to reset the backoff for (required)
	 * @throws ApiException if fails to make API call
	 */
	public void webhookRegistrationsResetDeliveryBackoff(String registrationId) throws ApiException {

		webhookRegistrationsResetDeliveryBackoffWithHttpInfo(registrationId);
	}

	/**
	 * resetDeliveryBackoff Resets the retry backoff of the webhook registration. &lt;p&gt; The waiting time between delivery retries grows exponentially with every
	 * failure. Call this once the endpoint is available again to deliver the pending events immediately instead of at the next scheduled retry. &lt;p&gt;
	 * &lt;b&gt;Note:&lt;/b&gt; The status isn&#39;t changed, and only an &#x60;ACTIVE&#x60; registration delivers. After reactivating a registration that was set
	 * to &#x60;INACTIVE&#x60;, call this operation to drop any backoff it still has. A registration that Unblu deactivated (&#x60;INACTIVE_UNAVAILABLE&#x60;) has
	 * no backoff left, so calling this operation isn&#39;t needed.&lt;br&gt;
	 * 
	 * @param registrationId The ID of the webhook registration to reset the backoff for (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> webhookRegistrationsResetDeliveryBackoffWithHttpInfo(String registrationId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'registrationId' is set
		if (registrationId == null) {
			throw new ApiException(400, "Missing the required parameter 'registrationId' when calling webhookRegistrationsResetDeliveryBackoff");
		}

		// create path and map variables
		String localVarPath = "/webhookregistrations/{registrationId}/resetDeliveryBackoff"
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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * search Search for webhook registrations in the current account&lt;br&gt;
	 * 
	 * @param webhookRegistrationQuery (required)
	 * @return WebhookRegistrationDataResult
	 * @throws ApiException if fails to make API call
	 */
	public WebhookRegistrationDataResult webhookRegistrationsSearch(WebhookRegistrationQuery webhookRegistrationQuery) throws ApiException {
		return webhookRegistrationsSearchWithHttpInfo(webhookRegistrationQuery).getData();
	}

	/**
	 * search Search for webhook registrations in the current account&lt;br&gt;
	 * 
	 * @param webhookRegistrationQuery (required)
	 * @return ApiResponse&lt;WebhookRegistrationDataResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebhookRegistrationDataResult> webhookRegistrationsSearchWithHttpInfo(WebhookRegistrationQuery webhookRegistrationQuery) throws ApiException {
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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<WebhookRegistrationDataResult> localVarReturnType = new GenericType<WebhookRegistrationDataResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * sendPing Sends a \&quot;ping\&quot; webhook to the endpoint of the given registration.&lt;br&gt;
	 * 
	 * @param registrationId ID of the registration to send the ping webhook to. (required)
	 * @throws ApiException if fails to make API call
	 */
	public void webhookRegistrationsSendPing(String registrationId) throws ApiException {

		webhookRegistrationsSendPingWithHttpInfo(registrationId);
	}

	/**
	 * sendPing Sends a \&quot;ping\&quot; webhook to the endpoint of the given registration.&lt;br&gt;
	 * 
	 * @param registrationId ID of the registration to send the ping webhook to. (required)
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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * update Updates a webhook registration. Whether the registration triggers an Aria agentic flow cannot be changed.&lt;br&gt;
	 * 
	 * @param webhookRegistrationData The webhook registration to update (required)
	 * @param expand (optional)
	 * @return WebhookRegistrationData
	 * @throws ApiException if fails to make API call
	 */
	public WebhookRegistrationData webhookRegistrationsUpdate(WebhookRegistrationData webhookRegistrationData, List<ExpandFields> expand) throws ApiException {
		return webhookRegistrationsUpdateWithHttpInfo(webhookRegistrationData, expand).getData();
	}

	/**
	 * update Updates a webhook registration. Whether the registration triggers an Aria agentic flow cannot be changed.&lt;br&gt;
	 * 
	 * @param webhookRegistrationData The webhook registration to update (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;WebhookRegistrationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebhookRegistrationData> webhookRegistrationsUpdateWithHttpInfo(WebhookRegistrationData webhookRegistrationData, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = webhookRegistrationData;

		// verify the required parameter 'webhookRegistrationData' is set
		if (webhookRegistrationData == null) {
			throw new ApiException(400, "Missing the required parameter 'webhookRegistrationData' when calling webhookRegistrationsUpdate");
		}

		// create path and map variables
		String localVarPath = "/webhookregistrations/update";

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

		GenericType<WebhookRegistrationData> localVarReturnType = new GenericType<WebhookRegistrationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
