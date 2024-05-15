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
import com.unblu.webapi.model.v4.CustomExternalMessengerChannelQuery;
import com.unblu.webapi.model.v4.CustomExternalMessengerChannelResult;
import com.unblu.webapi.model.v4.ExpandFields;
import com.unblu.webapi.model.v4.ExternalMessengerChannel;
import com.unblu.webapi.model.v4.ExternalMessengerChannelQuery;
import com.unblu.webapi.model.v4.ExternalMessengerChannelResult;
import com.unblu.webapi.model.v4.ExternalMessengerPostMessage;
import com.unblu.webapi.model.v4.ExternalMessengersMessageDeliveredBody;
import com.unblu.webapi.model.v4.ExternalMessengersMessageReadBody;
import com.unblu.webapi.model.v4.ExternalMessengersMessageSendFailedBody;
import com.unblu.webapi.model.v4.ExternalMessengersMessageSentSuccessfullyBody;
import com.unblu.webapi.model.v4.PingResponse;
import com.unblu.webapi.model.v4.SendMessageResult;
import com.unblu.webapi.model.v4.SmsExternalMessengerChannelQuery;
import com.unblu.webapi.model.v4.SmsExternalMessengerChannelResult;

import jakarta.ws.rs.core.GenericType;

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
	public ExternalMessengerChannel externalMessengersCreate(ExternalMessengerChannel externalMessengerChannel, List<ExpandFields> expand) throws ApiException {
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
	public ApiResponse<ExternalMessengerChannel> externalMessengersCreateWithHttpInfo(ExternalMessengerChannel externalMessengerChannel, List<ExpandFields> expand) throws ApiException {
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

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

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
	 * @param channelId The ID of the channel which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void externalMessengersDelete(String channelId) throws ApiException {

		externalMessengersDeleteWithHttpInfo(channelId);
	}

	/**
	 * delete Deletes an external messenger channel. All conversations connected to this channel will be ended as soon as they activated again&lt;br&gt;
	 * 
	 * @param channelId The ID of the channel which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> externalMessengersDeleteWithHttpInfo(String channelId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'channelId' is set
		if (channelId == null) {
			throw new ApiException(400, "Missing the required parameter 'channelId' when calling externalMessengersDelete");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/{channelId}/delete"
				.replaceAll("\\{" + "channelId" + "\\}", apiClient.escapeString(channelId.toString()));

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
	 * getByName Returns the channel for the given name&lt;br&gt;
	 * 
	 * @param name The name of the external messenger channel (optional)
	 * @param expand (optional)
	 * @return ExternalMessengerChannel
	 * @throws ApiException if fails to make API call
	 */
	public ExternalMessengerChannel externalMessengersGetByName(String name, List<ExpandFields> expand) throws ApiException {
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
	public ApiResponse<ExternalMessengerChannel> externalMessengersGetByNameWithHttpInfo(String name, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/externalmessengers/getByName";

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
	 * @param channelId The ID of the custom external messenger channel (required)
	 * @param externalMessengersMessageDeliveredBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void externalMessengersMessageDelivered(String channelId, ExternalMessengersMessageDeliveredBody externalMessengersMessageDeliveredBody) throws ApiException {

		externalMessengersMessageDeliveredWithHttpInfo(channelId, externalMessengersMessageDeliveredBody);
	}

	/**
	 * messageDelivered Marks a message as delivered to the given person. If no person is specified, it will be marked as delivered to all persons which are
	 * connected via the external messenger.&lt;br&gt; If the message is also read, use directly the end point &#x60;messageRead&#x60; as it will mark it as
	 * delivered too.&lt;br&gt;
	 * 
	 * @param channelId The ID of the custom external messenger channel (required)
	 * @param externalMessengersMessageDeliveredBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> externalMessengersMessageDeliveredWithHttpInfo(String channelId, ExternalMessengersMessageDeliveredBody externalMessengersMessageDeliveredBody) throws ApiException {
		Object localVarPostBody = externalMessengersMessageDeliveredBody;

		// verify the required parameter 'channelId' is set
		if (channelId == null) {
			throw new ApiException(400, "Missing the required parameter 'channelId' when calling externalMessengersMessageDelivered");
		}

		// verify the required parameter 'externalMessengersMessageDeliveredBody' is set
		if (externalMessengersMessageDeliveredBody == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengersMessageDeliveredBody' when calling externalMessengersMessageDelivered");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/{channelId}/messageDelivered"
				.replaceAll("\\{" + "channelId" + "\\}", apiClient.escapeString(channelId.toString()));

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
	 * @param channelId The ID of the custom external messenger channel (required)
	 * @param externalMessengersMessageReadBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void externalMessengersMessageRead(String channelId, ExternalMessengersMessageReadBody externalMessengersMessageReadBody) throws ApiException {

		externalMessengersMessageReadWithHttpInfo(channelId, externalMessengersMessageReadBody);
	}

	/**
	 * messageRead Marks a message as read by the given person. If no person is specified, it will be marked as read by all persons which are connected via the
	 * external messenger.&lt;br&gt; This will also mark the message as delivered, if it was not already.&lt;br&gt;
	 * 
	 * @param channelId The ID of the custom external messenger channel (required)
	 * @param externalMessengersMessageReadBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> externalMessengersMessageReadWithHttpInfo(String channelId, ExternalMessengersMessageReadBody externalMessengersMessageReadBody) throws ApiException {
		Object localVarPostBody = externalMessengersMessageReadBody;

		// verify the required parameter 'channelId' is set
		if (channelId == null) {
			throw new ApiException(400, "Missing the required parameter 'channelId' when calling externalMessengersMessageRead");
		}

		// verify the required parameter 'externalMessengersMessageReadBody' is set
		if (externalMessengersMessageReadBody == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengersMessageReadBody' when calling externalMessengersMessageRead");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/{channelId}/messageRead"
				.replaceAll("\\{" + "channelId" + "\\}", apiClient.escapeString(channelId.toString()));

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
	 * messageSendFailed Indicates that the message couldn&#39;t be sent to the external messenger. The following fail states may be set: &lt;ul&gt;
	 * &lt;li&gt;&#x60;ESendFailState.RETRYABLE&#x60;: If retrying to send the message in the future may resolve the issue, for example, because there was a
	 * temporary connection failure. In such cases, the user will be provided with a UI to retry sending the message&lt;/li&gt;
	 * &lt;li&gt;&#x60;ESendFailState.TERMINAL&#x60;: If no number of retries would resolve the issue, for example because the underlying conversation no longer
	 * exists in the external messenger.&lt;/li&gt; &lt;/ul&gt;&lt;br&gt;
	 * 
	 * @param channelId The ID of the custom external messenger channel (required)
	 * @param externalMessengersMessageSendFailedBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void externalMessengersMessageSendFailed(String channelId, ExternalMessengersMessageSendFailedBody externalMessengersMessageSendFailedBody) throws ApiException {

		externalMessengersMessageSendFailedWithHttpInfo(channelId, externalMessengersMessageSendFailedBody);
	}

	/**
	 * messageSendFailed Indicates that the message couldn&#39;t be sent to the external messenger. The following fail states may be set: &lt;ul&gt;
	 * &lt;li&gt;&#x60;ESendFailState.RETRYABLE&#x60;: If retrying to send the message in the future may resolve the issue, for example, because there was a
	 * temporary connection failure. In such cases, the user will be provided with a UI to retry sending the message&lt;/li&gt;
	 * &lt;li&gt;&#x60;ESendFailState.TERMINAL&#x60;: If no number of retries would resolve the issue, for example because the underlying conversation no longer
	 * exists in the external messenger.&lt;/li&gt; &lt;/ul&gt;&lt;br&gt;
	 * 
	 * @param channelId The ID of the custom external messenger channel (required)
	 * @param externalMessengersMessageSendFailedBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> externalMessengersMessageSendFailedWithHttpInfo(String channelId, ExternalMessengersMessageSendFailedBody externalMessengersMessageSendFailedBody) throws ApiException {
		Object localVarPostBody = externalMessengersMessageSendFailedBody;

		// verify the required parameter 'channelId' is set
		if (channelId == null) {
			throw new ApiException(400, "Missing the required parameter 'channelId' when calling externalMessengersMessageSendFailed");
		}

		// verify the required parameter 'externalMessengersMessageSendFailedBody' is set
		if (externalMessengersMessageSendFailedBody == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengersMessageSendFailedBody' when calling externalMessengersMessageSendFailed");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/{channelId}/messageSendFailed"
				.replaceAll("\\{" + "channelId" + "\\}", apiClient.escapeString(channelId.toString()));

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
	 * @param channelId The ID of the custom external messenger channel (required)
	 * @param externalMessengersMessageSentSuccessfullyBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void externalMessengersMessageSentSuccessfully(String channelId, ExternalMessengersMessageSentSuccessfullyBody externalMessengersMessageSentSuccessfullyBody) throws ApiException {

		externalMessengersMessageSentSuccessfullyWithHttpInfo(channelId, externalMessengersMessageSentSuccessfullyBody);
	}

	/**
	 * messageSentSuccessfully Indication that a message was successfully sent to the external messenger.&lt;br&gt; &lt;br&gt; This will be visualized in the Unblu
	 * UI.&lt;br&gt; &lt;br&gt; &lt;b&gt;Note:&lt;/b&gt; This does not mean the message has been delivered to or read by the recipient. These states can be updated
	 * using the&#x60;messageDelivered&#x60; and &#x60;messageRead&#x60; services.&lt;br&gt;
	 * 
	 * @param channelId The ID of the custom external messenger channel (required)
	 * @param externalMessengersMessageSentSuccessfullyBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> externalMessengersMessageSentSuccessfullyWithHttpInfo(String channelId, ExternalMessengersMessageSentSuccessfullyBody externalMessengersMessageSentSuccessfullyBody) throws ApiException {
		Object localVarPostBody = externalMessengersMessageSentSuccessfullyBody;

		// verify the required parameter 'channelId' is set
		if (channelId == null) {
			throw new ApiException(400, "Missing the required parameter 'channelId' when calling externalMessengersMessageSentSuccessfully");
		}

		// verify the required parameter 'externalMessengersMessageSentSuccessfullyBody' is set
		if (externalMessengersMessageSentSuccessfullyBody == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengersMessageSentSuccessfullyBody' when calling externalMessengersMessageSentSuccessfully");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/{channelId}/messageSentSuccessfully"
				.replaceAll("\\{" + "channelId" + "\\}", apiClient.escapeString(channelId.toString()));

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
	 * read Returns the channel with the given ID&lt;br&gt;
	 * 
	 * @param channelId The ID of the external messenger channel (required)
	 * @param expand (optional)
	 * @return ExternalMessengerChannel
	 * @throws ApiException if fails to make API call
	 */
	public ExternalMessengerChannel externalMessengersRead(String channelId, List<ExpandFields> expand) throws ApiException {
		return externalMessengersReadWithHttpInfo(channelId, expand).getData();
	}

	/**
	 * read Returns the channel with the given ID&lt;br&gt;
	 * 
	 * @param channelId The ID of the external messenger channel (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ExternalMessengerChannel&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ExternalMessengerChannel> externalMessengersReadWithHttpInfo(String channelId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'channelId' is set
		if (channelId == null) {
			throw new ApiException(400, "Missing the required parameter 'channelId' when calling externalMessengersRead");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/{channelId}/read"
				.replaceAll("\\{" + "channelId" + "\\}", apiClient.escapeString(channelId.toString()));

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
	public ExternalMessengerChannelResult externalMessengersSearch(ExternalMessengerChannelQuery externalMessengerChannelQuery, List<ExpandFields> expand) throws ApiException {
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
	public ApiResponse<ExternalMessengerChannelResult> externalMessengersSearchWithHttpInfo(ExternalMessengerChannelQuery externalMessengerChannelQuery, List<ExpandFields> expand) throws ApiException {
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

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

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
	 * searchCustom Search for custom external messenger channels in the current account&lt;br&gt;
	 * 
	 * @param customExternalMessengerChannelQuery (required)
	 * @param expand (optional)
	 * @return CustomExternalMessengerChannelResult
	 * @throws ApiException if fails to make API call
	 */
	public CustomExternalMessengerChannelResult externalMessengersSearchCustom(CustomExternalMessengerChannelQuery customExternalMessengerChannelQuery, List<ExpandFields> expand) throws ApiException {
		return externalMessengersSearchCustomWithHttpInfo(customExternalMessengerChannelQuery, expand).getData();
	}

	/**
	 * searchCustom Search for custom external messenger channels in the current account&lt;br&gt;
	 * 
	 * @param customExternalMessengerChannelQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;CustomExternalMessengerChannelResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CustomExternalMessengerChannelResult> externalMessengersSearchCustomWithHttpInfo(CustomExternalMessengerChannelQuery customExternalMessengerChannelQuery, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = customExternalMessengerChannelQuery;

		// verify the required parameter 'customExternalMessengerChannelQuery' is set
		if (customExternalMessengerChannelQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'customExternalMessengerChannelQuery' when calling externalMessengersSearchCustom");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/searchCustom";

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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<CustomExternalMessengerChannelResult> localVarReturnType = new GenericType<CustomExternalMessengerChannelResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * searchSms Search for SMS external messenger channels in the current account&lt;br&gt;
	 * 
	 * @param smsExternalMessengerChannelQuery (required)
	 * @param expand (optional)
	 * @return SmsExternalMessengerChannelResult
	 * @throws ApiException if fails to make API call
	 */
	public SmsExternalMessengerChannelResult externalMessengersSearchSms(SmsExternalMessengerChannelQuery smsExternalMessengerChannelQuery, List<ExpandFields> expand) throws ApiException {
		return externalMessengersSearchSmsWithHttpInfo(smsExternalMessengerChannelQuery, expand).getData();
	}

	/**
	 * searchSms Search for SMS external messenger channels in the current account&lt;br&gt;
	 * 
	 * @param smsExternalMessengerChannelQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;SmsExternalMessengerChannelResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<SmsExternalMessengerChannelResult> externalMessengersSearchSmsWithHttpInfo(SmsExternalMessengerChannelQuery smsExternalMessengerChannelQuery, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = smsExternalMessengerChannelQuery;

		// verify the required parameter 'smsExternalMessengerChannelQuery' is set
		if (smsExternalMessengerChannelQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'smsExternalMessengerChannelQuery' when calling externalMessengersSearchSms");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/searchSms";

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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<SmsExternalMessengerChannelResult> localVarReturnType = new GenericType<SmsExternalMessengerChannelResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * sendMessage Send a message to a conversation. The corresponding conversation has to be connected to the custom channel that the message is being sent
	 * to.&lt;br&gt;
	 * 
	 * @param channelId (required)
	 * @param externalMessengerPostMessage The message to send to the conversation. (required)
	 * @return SendMessageResult
	 * @throws ApiException if fails to make API call
	 */
	public SendMessageResult externalMessengersSendMessage(String channelId, ExternalMessengerPostMessage externalMessengerPostMessage) throws ApiException {
		return externalMessengersSendMessageWithHttpInfo(channelId, externalMessengerPostMessage).getData();
	}

	/**
	 * sendMessage Send a message to a conversation. The corresponding conversation has to be connected to the custom channel that the message is being sent
	 * to.&lt;br&gt;
	 * 
	 * @param channelId (required)
	 * @param externalMessengerPostMessage The message to send to the conversation. (required)
	 * @return ApiResponse&lt;SendMessageResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<SendMessageResult> externalMessengersSendMessageWithHttpInfo(String channelId, ExternalMessengerPostMessage externalMessengerPostMessage) throws ApiException {
		Object localVarPostBody = externalMessengerPostMessage;

		// verify the required parameter 'channelId' is set
		if (channelId == null) {
			throw new ApiException(400, "Missing the required parameter 'channelId' when calling externalMessengersSendMessage");
		}

		// verify the required parameter 'externalMessengerPostMessage' is set
		if (externalMessengerPostMessage == null) {
			throw new ApiException(400, "Missing the required parameter 'externalMessengerPostMessage' when calling externalMessengersSendMessage");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/{channelId}/sendMessage"
				.replaceAll("\\{" + "channelId" + "\\}", apiClient.escapeString(channelId.toString()));

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

		GenericType<SendMessageResult> localVarReturnType = new GenericType<SendMessageResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * sendPing Emits a &#x60;PingRequest&#x60; on the configured outbound endpoint for the custom channel.&lt;br&gt;
	 * 
	 * @param channelId The ID of an external messenger channel of type &#x60;EExternalMessengerChannelType.CUSTOM&#x60; (required)
	 * @return PingResponse
	 * @throws ApiException if fails to make API call
	 */
	public PingResponse externalMessengersSendPing(String channelId) throws ApiException {
		return externalMessengersSendPingWithHttpInfo(channelId).getData();
	}

	/**
	 * sendPing Emits a &#x60;PingRequest&#x60; on the configured outbound endpoint for the custom channel.&lt;br&gt;
	 * 
	 * @param channelId The ID of an external messenger channel of type &#x60;EExternalMessengerChannelType.CUSTOM&#x60; (required)
	 * @return ApiResponse&lt;PingResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PingResponse> externalMessengersSendPingWithHttpInfo(String channelId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'channelId' is set
		if (channelId == null) {
			throw new ApiException(400, "Missing the required parameter 'channelId' when calling externalMessengersSendPing");
		}

		// create path and map variables
		String localVarPath = "/externalmessengers/{channelId}/sendPing"
				.replaceAll("\\{" + "channelId" + "\\}", apiClient.escapeString(channelId.toString()));

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
	 * update Updates an external messenger channel&lt;br&gt;
	 * 
	 * @param externalMessengerChannel The channel which should be updated (required)
	 * @param expand (optional)
	 * @return ExternalMessengerChannel
	 * @throws ApiException if fails to make API call
	 */
	public ExternalMessengerChannel externalMessengersUpdate(ExternalMessengerChannel externalMessengerChannel, List<ExpandFields> expand) throws ApiException {
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
	public ApiResponse<ExternalMessengerChannel> externalMessengersUpdateWithHttpInfo(ExternalMessengerChannel externalMessengerChannel, List<ExpandFields> expand) throws ApiException {
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

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

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
