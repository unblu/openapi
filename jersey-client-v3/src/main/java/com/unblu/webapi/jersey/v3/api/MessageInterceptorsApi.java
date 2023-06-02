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
import com.unblu.webapi.model.v3.ApproveMessageAction;
import com.unblu.webapi.model.v3.MessageInterceptorData;
import com.unblu.webapi.model.v3.MessageInterceptorQuery;
import com.unblu.webapi.model.v3.MessageInterceptorResult;
import com.unblu.webapi.model.v3.MessageInterceptorsPingWebhookBody;
import com.unblu.webapi.model.v3.RejectMessageAction;

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
	 * approveMessage Approves a message for which approval was requested through a &lt;code&gt;message_interceptor.new_message&lt;/code&gt; webhook. &lt;p&gt; This
	 * operation is only available for ExternalMessageInterceptor entities. Messages sent to InternalMessageInterceptor entities are approved
	 * automatically.&lt;br&gt;
	 * 
	 * @param approveMessageAction The action to approve a message (required)
	 * @throws ApiException if fails to make API call
	 */
	public void messageInterceptorsApproveMessage(ApproveMessageAction approveMessageAction) throws ApiException {

		messageInterceptorsApproveMessageWithHttpInfo(approveMessageAction);
	}

	/**
	 * approveMessage Approves a message for which approval was requested through a &lt;code&gt;message_interceptor.new_message&lt;/code&gt; webhook. &lt;p&gt; This
	 * operation is only available for ExternalMessageInterceptor entities. Messages sent to InternalMessageInterceptor entities are approved
	 * automatically.&lt;br&gt;
	 * 
	 * @param approveMessageAction The action to approve a message (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> messageInterceptorsApproveMessageWithHttpInfo(ApproveMessageAction approveMessageAction) throws ApiException {
		Object localVarPostBody = approveMessageAction;

		// verify the required parameter 'approveMessageAction' is set
		if (approveMessageAction == null) {
			throw new ApiException(400, "Missing the required parameter 'approveMessageAction' when calling messageInterceptorsApproveMessage");
		}

		// create path and map variables
		String localVarPath = "/messageinterceptors/approveMessage";

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
	 * @param id The ID of the message interceptor which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void messageInterceptorsDelete(String id) throws ApiException {

		messageInterceptorsDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes an existing message interceptor&lt;br&gt;
	 * 
	 * @param id The ID of the message interceptor which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> messageInterceptorsDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/messageinterceptors/delete";

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
	 * pingWebhook Emits a &#x60;WebhookPingEvent&#x60; on the configured webhook for the specified external message interceptor. &lt;p&gt; This operation is only
	 * available for ExternalMessageInterceptor entities.&lt;br&gt;
	 * 
	 * @param messageInterceptorsPingWebhookBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void messageInterceptorsPingWebhook(MessageInterceptorsPingWebhookBody messageInterceptorsPingWebhookBody) throws ApiException {

		messageInterceptorsPingWebhookWithHttpInfo(messageInterceptorsPingWebhookBody);
	}

	/**
	 * pingWebhook Emits a &#x60;WebhookPingEvent&#x60; on the configured webhook for the specified external message interceptor. &lt;p&gt; This operation is only
	 * available for ExternalMessageInterceptor entities.&lt;br&gt;
	 * 
	 * @param messageInterceptorsPingWebhookBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> messageInterceptorsPingWebhookWithHttpInfo(MessageInterceptorsPingWebhookBody messageInterceptorsPingWebhookBody) throws ApiException {
		Object localVarPostBody = messageInterceptorsPingWebhookBody;

		// verify the required parameter 'messageInterceptorsPingWebhookBody' is set
		if (messageInterceptorsPingWebhookBody == null) {
			throw new ApiException(400, "Missing the required parameter 'messageInterceptorsPingWebhookBody' when calling messageInterceptorsPingWebhook");
		}

		// create path and map variables
		String localVarPath = "/messageinterceptors/pingWebhook";

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
	 * read Reads an existing message interceptor&lt;br&gt;
	 * 
	 * @param id The ID of the message interceptor (optional)
	 * @return MessageInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public MessageInterceptorData messageInterceptorsRead(String id) throws ApiException {
		return messageInterceptorsReadWithHttpInfo(id).getData();
	}

	/**
	 * read Reads an existing message interceptor&lt;br&gt;
	 * 
	 * @param id The ID of the message interceptor (optional)
	 * @return ApiResponse&lt;MessageInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<MessageInterceptorData> messageInterceptorsReadWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/messageinterceptors/read";

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

		GenericType<MessageInterceptorData> localVarReturnType = new GenericType<MessageInterceptorData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * rejectMessage Rejects a message for which approval was requested through a &lt;code&gt;message_interceptor.new_message&lt;/code&gt; webhook. &lt;p&gt; This
	 * operation is only available for ExternalMessageInterceptor entities. Messages sent to InternalMessageInterceptor entities are rejected
	 * automatically.&lt;br&gt;
	 * 
	 * @param rejectMessageAction The action to reject a message (required)
	 * @throws ApiException if fails to make API call
	 */
	public void messageInterceptorsRejectMessage(RejectMessageAction rejectMessageAction) throws ApiException {

		messageInterceptorsRejectMessageWithHttpInfo(rejectMessageAction);
	}

	/**
	 * rejectMessage Rejects a message for which approval was requested through a &lt;code&gt;message_interceptor.new_message&lt;/code&gt; webhook. &lt;p&gt; This
	 * operation is only available for ExternalMessageInterceptor entities. Messages sent to InternalMessageInterceptor entities are rejected
	 * automatically.&lt;br&gt;
	 * 
	 * @param rejectMessageAction The action to reject a message (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> messageInterceptorsRejectMessageWithHttpInfo(RejectMessageAction rejectMessageAction) throws ApiException {
		Object localVarPostBody = rejectMessageAction;

		// verify the required parameter 'rejectMessageAction' is set
		if (rejectMessageAction == null) {
			throw new ApiException(400, "Missing the required parameter 'rejectMessageAction' when calling messageInterceptorsRejectMessage");
		}

		// create path and map variables
		String localVarPath = "/messageinterceptors/rejectMessage";

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
