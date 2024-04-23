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
import com.unblu.webapi.model.v4.MessageInterceptorData;
import com.unblu.webapi.model.v4.MessageInterceptorQuery;
import com.unblu.webapi.model.v4.MessageInterceptorResult;
import com.unblu.webapi.model.v4.PingResponse;

import jakarta.ws.rs.core.GenericType;

public class MessageInterceptorsApi {
	private ApiClient apiClient;

	public MessageInterceptorsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public MessageInterceptorsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates a new message interceptor&lt;br&gt;
	 * 
	 * @param messageInterceptorData The message interceptor to create (required)
	 * @return MessageInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public MessageInterceptorData messageInterceptorsCreate(MessageInterceptorData messageInterceptorData) throws ApiException {
		return messageInterceptorsCreateWithHttpInfo(messageInterceptorData).getData();
	}

	/**
	 * create Creates a new message interceptor&lt;br&gt;
	 * 
	 * @param messageInterceptorData The message interceptor to create (required)
	 * @return ApiResponse&lt;MessageInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<MessageInterceptorData> messageInterceptorsCreateWithHttpInfo(MessageInterceptorData messageInterceptorData) throws ApiException {
		Object localVarPostBody = messageInterceptorData;

		// verify the required parameter 'messageInterceptorData' is set
		if (messageInterceptorData == null) {
			throw new ApiException(400, "Missing the required parameter 'messageInterceptorData' when calling messageInterceptorsCreate");
		}

		// create path and map variables
		String localVarPath = "/messageinterceptors/create";

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

		GenericType<MessageInterceptorData> localVarReturnType = new GenericType<MessageInterceptorData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes an existing message interceptor&lt;br&gt;
	 * 
	 * @param interceptorId The ID of the message interceptor which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void messageInterceptorsDelete(String interceptorId) throws ApiException {

		messageInterceptorsDeleteWithHttpInfo(interceptorId);
	}

	/**
	 * delete Deletes an existing message interceptor&lt;br&gt;
	 * 
	 * @param interceptorId The ID of the message interceptor which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> messageInterceptorsDeleteWithHttpInfo(String interceptorId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'interceptorId' is set
		if (interceptorId == null) {
			throw new ApiException(400, "Missing the required parameter 'interceptorId' when calling messageInterceptorsDelete");
		}

		// create path and map variables
		String localVarPath = "/messageinterceptors/{interceptorId}/delete"
				.replaceAll("\\{" + "interceptorId" + "\\}", apiClient.escapeString(interceptorId.toString()));

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
	 * getByName Searches for an existing message interceptor with the given name&lt;br&gt;
	 * 
	 * @param name The name of the message interceptor (optional)
	 * @return MessageInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public MessageInterceptorData messageInterceptorsGetByName(String name) throws ApiException {
		return messageInterceptorsGetByNameWithHttpInfo(name).getData();
	}

	/**
	 * getByName Searches for an existing message interceptor with the given name&lt;br&gt;
	 * 
	 * @param name The name of the message interceptor (optional)
	 * @return ApiResponse&lt;MessageInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<MessageInterceptorData> messageInterceptorsGetByNameWithHttpInfo(String name) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/messageinterceptors/getByName";

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

		GenericType<MessageInterceptorData> localVarReturnType = new GenericType<MessageInterceptorData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Reads an existing message interceptor&lt;br&gt;
	 * 
	 * @param interceptorId The ID of the message interceptor (required)
	 * @return MessageInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public MessageInterceptorData messageInterceptorsRead(String interceptorId) throws ApiException {
		return messageInterceptorsReadWithHttpInfo(interceptorId).getData();
	}

	/**
	 * read Reads an existing message interceptor&lt;br&gt;
	 * 
	 * @param interceptorId The ID of the message interceptor (required)
	 * @return ApiResponse&lt;MessageInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<MessageInterceptorData> messageInterceptorsReadWithHttpInfo(String interceptorId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'interceptorId' is set
		if (interceptorId == null) {
			throw new ApiException(400, "Missing the required parameter 'interceptorId' when calling messageInterceptorsRead");
		}

		// create path and map variables
		String localVarPath = "/messageinterceptors/{interceptorId}/read"
				.replaceAll("\\{" + "interceptorId" + "\\}", apiClient.escapeString(interceptorId.toString()));

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

		GenericType<MessageInterceptorData> localVarReturnType = new GenericType<MessageInterceptorData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Searches for message interceptors in the current account&lt;br&gt;
	 * 
	 * @param messageInterceptorQuery (required)
	 * @return MessageInterceptorResult
	 * @throws ApiException if fails to make API call
	 */
	public MessageInterceptorResult messageInterceptorsSearch(MessageInterceptorQuery messageInterceptorQuery) throws ApiException {
		return messageInterceptorsSearchWithHttpInfo(messageInterceptorQuery).getData();
	}

	/**
	 * search Searches for message interceptors in the current account&lt;br&gt;
	 * 
	 * @param messageInterceptorQuery (required)
	 * @return ApiResponse&lt;MessageInterceptorResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<MessageInterceptorResult> messageInterceptorsSearchWithHttpInfo(MessageInterceptorQuery messageInterceptorQuery) throws ApiException {
		Object localVarPostBody = messageInterceptorQuery;

		// verify the required parameter 'messageInterceptorQuery' is set
		if (messageInterceptorQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'messageInterceptorQuery' when calling messageInterceptorsSearch");
		}

		// create path and map variables
		String localVarPath = "/messageinterceptors/search";

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

		GenericType<MessageInterceptorResult> localVarReturnType = new GenericType<MessageInterceptorResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * sendPing Emits a &#x60;WebhookPingEvent&#x60; or &#x60;PingRequest&#x60; on the configured webhook/outbound endpoint for the external message interceptor.
	 * &lt;p&gt; This operation is only available for ExternalMessageInterceptor entities.&lt;br&gt;
	 * 
	 * @param interceptorId The ID of an external message interceptor (required)
	 * @return PingResponse
	 * @throws ApiException if fails to make API call
	 */
	public PingResponse messageInterceptorsSendPing(String interceptorId) throws ApiException {
		return messageInterceptorsSendPingWithHttpInfo(interceptorId).getData();
	}

	/**
	 * sendPing Emits a &#x60;WebhookPingEvent&#x60; or &#x60;PingRequest&#x60; on the configured webhook/outbound endpoint for the external message interceptor.
	 * &lt;p&gt; This operation is only available for ExternalMessageInterceptor entities.&lt;br&gt;
	 * 
	 * @param interceptorId The ID of an external message interceptor (required)
	 * @return ApiResponse&lt;PingResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PingResponse> messageInterceptorsSendPingWithHttpInfo(String interceptorId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'interceptorId' is set
		if (interceptorId == null) {
			throw new ApiException(400, "Missing the required parameter 'interceptorId' when calling messageInterceptorsSendPing");
		}

		// create path and map variables
		String localVarPath = "/messageinterceptors/{interceptorId}/sendPing"
				.replaceAll("\\{" + "interceptorId" + "\\}", apiClient.escapeString(interceptorId.toString()));

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

		GenericType<PingResponse> localVarReturnType = new GenericType<PingResponse>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates an existing message interceptor&lt;br&gt;
	 * 
	 * @param messageInterceptorData The message interceptor to update (required)
	 * @return MessageInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public MessageInterceptorData messageInterceptorsUpdate(MessageInterceptorData messageInterceptorData) throws ApiException {
		return messageInterceptorsUpdateWithHttpInfo(messageInterceptorData).getData();
	}

	/**
	 * update Updates an existing message interceptor&lt;br&gt;
	 * 
	 * @param messageInterceptorData The message interceptor to update (required)
	 * @return ApiResponse&lt;MessageInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<MessageInterceptorData> messageInterceptorsUpdateWithHttpInfo(MessageInterceptorData messageInterceptorData) throws ApiException {
		Object localVarPostBody = messageInterceptorData;

		// verify the required parameter 'messageInterceptorData' is set
		if (messageInterceptorData == null) {
			throw new ApiException(400, "Missing the required parameter 'messageInterceptorData' when calling messageInterceptorsUpdate");
		}

		// create path and map variables
		String localVarPath = "/messageinterceptors/update";

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

		GenericType<MessageInterceptorData> localVarReturnType = new GenericType<MessageInterceptorData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
