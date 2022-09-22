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
import com.unblu.webapi.model.v3.ExternalMessengerChannel;
import com.unblu.webapi.model.v3.ExternalMessengerChannelQuery;
import com.unblu.webapi.model.v3.ExternalMessengerChannelResult;
import com.unblu.webapi.model.v3.ExternalMessengerPostMessage;
import com.unblu.webapi.model.v3.ExternalMessengersMessageDeliveredBody;
import com.unblu.webapi.model.v3.ExternalMessengersMessageReadBody;
import com.unblu.webapi.model.v3.ExternalMessengersMessageSendFailedBody;
import com.unblu.webapi.model.v3.ExternalMessengersMessageSentSuccessfullyBody;
import com.unblu.webapi.model.v3.ExternalMessengersPingCustomChannelBody;

public class ExternalMessengersApi {
	private ApiClient apiClient;

	public ExternalMessengersApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ExternalMessengersApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates a new external messenger channel&lt;br&gt;
	 * 
	 * @param externalMessengerChannel The channel which should be created (required)
	 * @param expand (optional)
	 * @return ExternalMessengerChannel
	 * @throws ApiException if fails to make API call
	 */
	public ExternalMessengerChannel externalMessengersCreate(ExternalMessengerChannel externalMessengerChannel, String expand) throws ApiException {
		return externalMessengersCreateWithHttpInfo(externalMessengerChannel, expand).getData();
	}

	/**
	 * create Creates a new external messenger channel&lt;br&gt;
	 * 
	 * @param externalMessengerChannel The channel which should be created (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ExternalMessengerChannel&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ExternalMessengerChannel> externalMessengersCreateWithHttpInfo(ExternalMessengerChannel externalMessengerChannel, String expand) throws ApiException {
		Object localVarPostBody = externalMessengerChannel;

		// verify the required parameter 'externalMessengerChannel' is set
		if (externalMessengerChannel == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengerChannel' when calling externalMessengersCreate");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/create";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ExternalMessengerChannel> localVarReturnType = new GenericType<ExternalMessengerChannel>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes an external messenger channel. All conversations connected to this channel will be ended as soon as they activated again&lt;br&gt;
	 * 
	 * @param id The ID of the channel which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void externalMessengersDelete(String id) throws ApiException {

		externalMessengersDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes an external messenger channel. All conversations connected to this channel will be ended as soon as they activated again&lt;br&gt;
	 * 
	 * @param id The ID of the channel which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> externalMessengersDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/externalmessengers/delete";

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
	 * delete Deletes an external messenger channel. All conversations connected to this channel will be ended as soon as they activated again&lt;br&gt;
	 * 
	 * @param id The ID of the channel which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void externalMessengersDeleteLegacyGet(String id) throws ApiException {

		externalMessengersDeleteLegacyGetWithHttpInfo(id);
	}

	/**
	 * delete Deletes an external messenger channel. All conversations connected to this channel will be ended as soon as they activated again&lt;br&gt;
	 * 
	 * @param id The ID of the channel which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> externalMessengersDeleteLegacyGetWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/externalmessengers/delete";

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
	 * getByName Returns the channel for the given name&lt;br&gt;
	 * 
	 * @param name The name of the external messenger channel (optional)
	 * @param expand (optional)
	 * @return ExternalMessengerChannel
	 * @throws ApiException if fails to make API call
	 */
	public ExternalMessengerChannel externalMessengersGetByName(String name, String expand) throws ApiException {
		return externalMessengersGetByNameWithHttpInfo(name, expand).getData();
	}

	/**
	 * getByName Returns the channel for the given name&lt;br&gt;
	 * 
	 * @param name The name of the external messenger channel (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ExternalMessengerChannel&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ExternalMessengerChannel> externalMessengersGetByNameWithHttpInfo(String name, String expand) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/externalmessengers/getByName";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ExternalMessengerChannel> localVarReturnType = new GenericType<ExternalMessengerChannel>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * messageDelivered Marks a message as delivered to the given person. If no person is specified, it will be marked as delivered to all persons which are
	 * connected via the external messenger.&lt;br&gt; If the message is also read, use directly the end point &#x60;messageRead&#x60; as it will mark it as
	 * delivered too.&lt;br&gt;
	 * 
	 * @param externalMessengersMessageDeliveredBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void externalMessengersMessageDelivered(ExternalMessengersMessageDeliveredBody externalMessengersMessageDeliveredBody) throws ApiException {

		externalMessengersMessageDeliveredWithHttpInfo(externalMessengersMessageDeliveredBody);
	}

	/**
	 * messageDelivered Marks a message as delivered to the given person. If no person is specified, it will be marked as delivered to all persons which are
	 * connected via the external messenger.&lt;br&gt; If the message is also read, use directly the end point &#x60;messageRead&#x60; as it will mark it as
	 * delivered too.&lt;br&gt;
	 * 
	 * @param externalMessengersMessageDeliveredBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> externalMessengersMessageDeliveredWithHttpInfo(ExternalMessengersMessageDeliveredBody externalMessengersMessageDeliveredBody) throws ApiException {
		Object localVarPostBody = externalMessengersMessageDeliveredBody;

		// verify the required parameter 'externalMessengersMessageDeliveredBody' is set
		if (externalMessengersMessageDeliveredBody == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengersMessageDeliveredBody' when calling externalMessengersMessageDelivered");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/messageDelivered";

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
	 * messageDelivered Marks a message as delivered to the given person. If no person is specified, it will be marked as delivered to all persons which are
	 * connected via the external messenger.&lt;br&gt; If the message is also read, use directly the end point &#x60;messageRead&#x60; as it will mark it as
	 * delivered too.&lt;br&gt;
	 * 
	 * @param conversationId (optional)
	 * @param externalMessengerChannelId (optional)
	 * @param messageId (optional)
	 * @param personId (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void externalMessengersMessageDeliveredLegacyGet(String conversationId, String externalMessengerChannelId, String messageId, String personId) throws ApiException {

		externalMessengersMessageDeliveredLegacyGetWithHttpInfo(conversationId, externalMessengerChannelId, messageId, personId);
	}

	/**
	 * messageDelivered Marks a message as delivered to the given person. If no person is specified, it will be marked as delivered to all persons which are
	 * connected via the external messenger.&lt;br&gt; If the message is also read, use directly the end point &#x60;messageRead&#x60; as it will mark it as
	 * delivered too.&lt;br&gt;
	 * 
	 * @param conversationId (optional)
	 * @param externalMessengerChannelId (optional)
	 * @param messageId (optional)
	 * @param personId (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> externalMessengersMessageDeliveredLegacyGetWithHttpInfo(String conversationId, String externalMessengerChannelId, String messageId, String personId) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/externalmessengers/messageDelivered";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "conversationId", conversationId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "externalMessengerChannelId", externalMessengerChannelId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "messageId", messageId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "personId", personId));

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
	 * messageRead Marks a message as read by the given person. If no person is specified, it will be marked as read by all persons which are connected via the
	 * external messenger.&lt;br&gt; This will also mark the message as delivered, if it was not already.&lt;br&gt;
	 * 
	 * @param externalMessengersMessageReadBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void externalMessengersMessageRead(ExternalMessengersMessageReadBody externalMessengersMessageReadBody) throws ApiException {

		externalMessengersMessageReadWithHttpInfo(externalMessengersMessageReadBody);
	}

	/**
	 * messageRead Marks a message as read by the given person. If no person is specified, it will be marked as read by all persons which are connected via the
	 * external messenger.&lt;br&gt; This will also mark the message as delivered, if it was not already.&lt;br&gt;
	 * 
	 * @param externalMessengersMessageReadBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> externalMessengersMessageReadWithHttpInfo(ExternalMessengersMessageReadBody externalMessengersMessageReadBody) throws ApiException {
		Object localVarPostBody = externalMessengersMessageReadBody;

		// verify the required parameter 'externalMessengersMessageReadBody' is set
		if (externalMessengersMessageReadBody == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengersMessageReadBody' when calling externalMessengersMessageRead");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/messageRead";

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
	 * messageRead Marks a message as read by the given person. If no person is specified, it will be marked as read by all persons which are connected via the
	 * external messenger.&lt;br&gt; This will also mark the message as delivered, if it was not already.&lt;br&gt;
	 * 
	 * @param conversationId (optional)
	 * @param externalMessengerChannelId (optional)
	 * @param messageId (optional)
	 * @param personId (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void externalMessengersMessageReadLegacyGet(String conversationId, String externalMessengerChannelId, String messageId, String personId) throws ApiException {

		externalMessengersMessageReadLegacyGetWithHttpInfo(conversationId, externalMessengerChannelId, messageId, personId);
	}

	/**
	 * messageRead Marks a message as read by the given person. If no person is specified, it will be marked as read by all persons which are connected via the
	 * external messenger.&lt;br&gt; This will also mark the message as delivered, if it was not already.&lt;br&gt;
	 * 
	 * @param conversationId (optional)
	 * @param externalMessengerChannelId (optional)
	 * @param messageId (optional)
	 * @param personId (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> externalMessengersMessageReadLegacyGetWithHttpInfo(String conversationId, String externalMessengerChannelId, String messageId, String personId) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/externalmessengers/messageRead";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "conversationId", conversationId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "externalMessengerChannelId", externalMessengerChannelId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "messageId", messageId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "personId", personId));

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
	 * messageSendFailed Indicates that the message could not be sent to the external messenger. There are the following fail state which can be set: &lt;ul&gt;
	 * &lt;li&gt;&#x60;ESendFailState.RETRYABLE&#x60;: if a retry of sending in the future may solve the problem. (e.g. temporary connection failure). In this case
	 * the user will be provided with a UI to retry sending the message&lt;/li&gt; &lt;li&gt;&#x60;ESendFailState.TERMINAL&#x60;: if no amount of retries would
	 * solve the problem. (e.g. the underlying conversation no longer exists in the external messenger.)&lt;/li&gt; &lt;/ul&gt;&lt;br&gt;
	 * 
	 * @param externalMessengersMessageSendFailedBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void externalMessengersMessageSendFailed(ExternalMessengersMessageSendFailedBody externalMessengersMessageSendFailedBody) throws ApiException {

		externalMessengersMessageSendFailedWithHttpInfo(externalMessengersMessageSendFailedBody);
	}

	/**
	 * messageSendFailed Indicates that the message could not be sent to the external messenger. There are the following fail state which can be set: &lt;ul&gt;
	 * &lt;li&gt;&#x60;ESendFailState.RETRYABLE&#x60;: if a retry of sending in the future may solve the problem. (e.g. temporary connection failure). In this case
	 * the user will be provided with a UI to retry sending the message&lt;/li&gt; &lt;li&gt;&#x60;ESendFailState.TERMINAL&#x60;: if no amount of retries would
	 * solve the problem. (e.g. the underlying conversation no longer exists in the external messenger.)&lt;/li&gt; &lt;/ul&gt;&lt;br&gt;
	 * 
	 * @param externalMessengersMessageSendFailedBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> externalMessengersMessageSendFailedWithHttpInfo(ExternalMessengersMessageSendFailedBody externalMessengersMessageSendFailedBody) throws ApiException {
		Object localVarPostBody = externalMessengersMessageSendFailedBody;

		// verify the required parameter 'externalMessengersMessageSendFailedBody' is set
		if (externalMessengersMessageSendFailedBody == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengersMessageSendFailedBody' when calling externalMessengersMessageSendFailed");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/messageSendFailed";

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
	 * messageSentSuccessfully Indication that a message was successfully sent to the external messenger.&lt;br&gt; &lt;br&gt; This will be visualized in the Unblu
	 * UI.&lt;br&gt; &lt;br&gt; &lt;b&gt;Note:&lt;/b&gt; This does not mean the message has been delivered to or read by the recipient. These states can be updated
	 * using the&#x60;messageDelivered&#x60; and &#x60;messageRead&#x60; services.&lt;br&gt;
	 * 
	 * @param externalMessengersMessageSentSuccessfullyBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void externalMessengersMessageSentSuccessfully(ExternalMessengersMessageSentSuccessfullyBody externalMessengersMessageSentSuccessfullyBody) throws ApiException {

		externalMessengersMessageSentSuccessfullyWithHttpInfo(externalMessengersMessageSentSuccessfullyBody);
	}

	/**
	 * messageSentSuccessfully Indication that a message was successfully sent to the external messenger.&lt;br&gt; &lt;br&gt; This will be visualized in the Unblu
	 * UI.&lt;br&gt; &lt;br&gt; &lt;b&gt;Note:&lt;/b&gt; This does not mean the message has been delivered to or read by the recipient. These states can be updated
	 * using the&#x60;messageDelivered&#x60; and &#x60;messageRead&#x60; services.&lt;br&gt;
	 * 
	 * @param externalMessengersMessageSentSuccessfullyBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> externalMessengersMessageSentSuccessfullyWithHttpInfo(ExternalMessengersMessageSentSuccessfullyBody externalMessengersMessageSentSuccessfullyBody) throws ApiException {
		Object localVarPostBody = externalMessengersMessageSentSuccessfullyBody;

		// verify the required parameter 'externalMessengersMessageSentSuccessfullyBody' is set
		if (externalMessengersMessageSentSuccessfullyBody == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengersMessageSentSuccessfullyBody' when calling externalMessengersMessageSentSuccessfully");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/messageSentSuccessfully";

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
	 * pingCustomChannel Emits a &#x60;WebhookPingEvent&#x60; on the configured webhook for the custom channel.&lt;br&gt;
	 * 
	 * @param externalMessengersPingCustomChannelBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void externalMessengersPingCustomChannel(ExternalMessengersPingCustomChannelBody externalMessengersPingCustomChannelBody) throws ApiException {

		externalMessengersPingCustomChannelWithHttpInfo(externalMessengersPingCustomChannelBody);
	}

	/**
	 * pingCustomChannel Emits a &#x60;WebhookPingEvent&#x60; on the configured webhook for the custom channel.&lt;br&gt;
	 * 
	 * @param externalMessengersPingCustomChannelBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> externalMessengersPingCustomChannelWithHttpInfo(ExternalMessengersPingCustomChannelBody externalMessengersPingCustomChannelBody) throws ApiException {
		Object localVarPostBody = externalMessengersPingCustomChannelBody;

		// verify the required parameter 'externalMessengersPingCustomChannelBody' is set
		if (externalMessengersPingCustomChannelBody == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengersPingCustomChannelBody' when calling externalMessengersPingCustomChannel");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/pingCustomChannel";

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
	 * pingCustomChannel Emits a &#x60;WebhookPingEvent&#x60; on the configured webhook for the custom channel.&lt;br&gt;
	 * 
	 * @param externalMessengerChannelId (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void externalMessengersPingCustomChannelLegacyGet(String externalMessengerChannelId) throws ApiException {

		externalMessengersPingCustomChannelLegacyGetWithHttpInfo(externalMessengerChannelId);
	}

	/**
	 * pingCustomChannel Emits a &#x60;WebhookPingEvent&#x60; on the configured webhook for the custom channel.&lt;br&gt;
	 * 
	 * @param externalMessengerChannelId (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> externalMessengersPingCustomChannelLegacyGetWithHttpInfo(String externalMessengerChannelId) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/externalmessengers/pingCustomChannel";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "externalMessengerChannelId", externalMessengerChannelId));

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
	 * read Returns the channel for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the external messenger channel (optional)
	 * @param expand (optional)
	 * @return ExternalMessengerChannel
	 * @throws ApiException if fails to make API call
	 */
	public ExternalMessengerChannel externalMessengersRead(String id, String expand) throws ApiException {
		return externalMessengersReadWithHttpInfo(id, expand).getData();
	}

	/**
	 * read Returns the channel for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the external messenger channel (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ExternalMessengerChannel&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ExternalMessengerChannel> externalMessengersReadWithHttpInfo(String id, String expand) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/externalmessengers/read";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ExternalMessengerChannel> localVarReturnType = new GenericType<ExternalMessengerChannel>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for external messenger channels in the current account&lt;br&gt;
	 * 
	 * @param externalMessengerChannelQuery (required)
	 * @param expand (optional)
	 * @return ExternalMessengerChannelResult
	 * @throws ApiException if fails to make API call
	 */
	public ExternalMessengerChannelResult externalMessengersSearch(ExternalMessengerChannelQuery externalMessengerChannelQuery, String expand) throws ApiException {
		return externalMessengersSearchWithHttpInfo(externalMessengerChannelQuery, expand).getData();
	}

	/**
	 * search Search for external messenger channels in the current account&lt;br&gt;
	 * 
	 * @param externalMessengerChannelQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ExternalMessengerChannelResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ExternalMessengerChannelResult> externalMessengersSearchWithHttpInfo(ExternalMessengerChannelQuery externalMessengerChannelQuery, String expand) throws ApiException {
		Object localVarPostBody = externalMessengerChannelQuery;

		// verify the required parameter 'externalMessengerChannelQuery' is set
		if (externalMessengerChannelQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengerChannelQuery' when calling externalMessengersSearch");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/search";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ExternalMessengerChannelResult> localVarReturnType = new GenericType<ExternalMessengerChannelResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * sendMessage Send a message to a conversation. The corresponding conversation has to be connected to the same custom channel.&lt;br&gt;
	 * 
	 * @param externalMessengerPostMessage The message to send into the conversation. (required)
	 * @return String
	 * @throws ApiException if fails to make API call
	 */
	public String externalMessengersSendMessage(ExternalMessengerPostMessage externalMessengerPostMessage) throws ApiException {
		return externalMessengersSendMessageWithHttpInfo(externalMessengerPostMessage).getData();
	}

	/**
	 * sendMessage Send a message to a conversation. The corresponding conversation has to be connected to the same custom channel.&lt;br&gt;
	 * 
	 * @param externalMessengerPostMessage The message to send into the conversation. (required)
	 * @return ApiResponse&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<String> externalMessengersSendMessageWithHttpInfo(ExternalMessengerPostMessage externalMessengerPostMessage) throws ApiException {
		Object localVarPostBody = externalMessengerPostMessage;

		// verify the required parameter 'externalMessengerPostMessage' is set
		if (externalMessengerPostMessage == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengerPostMessage' when calling externalMessengersSendMessage");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/sendMessage";

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

		GenericType<String> localVarReturnType = new GenericType<String>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates an external messenger channel&lt;br&gt;
	 * 
	 * @param externalMessengerChannel The channel which should be updated (required)
	 * @param expand (optional)
	 * @return ExternalMessengerChannel
	 * @throws ApiException if fails to make API call
	 */
	public ExternalMessengerChannel externalMessengersUpdate(ExternalMessengerChannel externalMessengerChannel, String expand) throws ApiException {
		return externalMessengersUpdateWithHttpInfo(externalMessengerChannel, expand).getData();
	}

	/**
	 * update Updates an external messenger channel&lt;br&gt;
	 * 
	 * @param externalMessengerChannel The channel which should be updated (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ExternalMessengerChannel&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ExternalMessengerChannel> externalMessengersUpdateWithHttpInfo(ExternalMessengerChannel externalMessengerChannel, String expand) throws ApiException {
		Object localVarPostBody = externalMessengerChannel;

		// verify the required parameter 'externalMessengerChannel' is set
		if (externalMessengerChannel == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengerChannel' when calling externalMessengersUpdate");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/update";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ExternalMessengerChannel> localVarReturnType = new GenericType<ExternalMessengerChannel>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
