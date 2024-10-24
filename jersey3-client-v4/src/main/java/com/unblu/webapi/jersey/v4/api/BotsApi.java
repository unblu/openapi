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
import com.unblu.webapi.model.v4.BotDialogPostMessage;
import com.unblu.webapi.model.v4.BotPostMessage;
import com.unblu.webapi.model.v4.BotsCancelDialogBotTypingIndicatorBody;
import com.unblu.webapi.model.v4.BotsCancelPendingDialogQuestionsBody;
import com.unblu.webapi.model.v4.BotsCancelPendingQuestionBody;
import com.unblu.webapi.model.v4.BotsDialogMessageDeliveredBody;
import com.unblu.webapi.model.v4.BotsDialogMessageReadBody;
import com.unblu.webapi.model.v4.BotsFinishDialogBody;
import com.unblu.webapi.model.v4.BotsRestrictDialogCounterpartBody;
import com.unblu.webapi.model.v4.BotsStartDialogBotTypingIndicatorBody;
import com.unblu.webapi.model.v4.DialogBotData;
import com.unblu.webapi.model.v4.DialogBotQuery;
import com.unblu.webapi.model.v4.DialogBotResult;
import com.unblu.webapi.model.v4.PingResponse;
import com.unblu.webapi.model.v4.SendMessageResult;

import jakarta.ws.rs.core.GenericType;

public class BotsApi {
	private ApiClient apiClient;

	public BotsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public BotsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * cancelDialogBotTypingIndicator Hides the typing indicator for the dialog bot.&lt;br&gt; If the typing indicator wasn&#39;t displayed, calling the endpoint
	 * has no effect.&lt;br&gt;
	 * 
	 * @param botsCancelDialogBotTypingIndicatorBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void botsCancelDialogBotTypingIndicator(BotsCancelDialogBotTypingIndicatorBody botsCancelDialogBotTypingIndicatorBody) throws ApiException {

		botsCancelDialogBotTypingIndicatorWithHttpInfo(botsCancelDialogBotTypingIndicatorBody);
	}

	/**
	 * cancelDialogBotTypingIndicator Hides the typing indicator for the dialog bot.&lt;br&gt; If the typing indicator wasn&#39;t displayed, calling the endpoint
	 * has no effect.&lt;br&gt;
	 * 
	 * @param botsCancelDialogBotTypingIndicatorBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> botsCancelDialogBotTypingIndicatorWithHttpInfo(BotsCancelDialogBotTypingIndicatorBody botsCancelDialogBotTypingIndicatorBody) throws ApiException {
		Object localVarPostBody = botsCancelDialogBotTypingIndicatorBody;

		// verify the required parameter 'botsCancelDialogBotTypingIndicatorBody' is set
		if (botsCancelDialogBotTypingIndicatorBody == null) {
			throw new ApiException(400, "Missing the required parameter 'botsCancelDialogBotTypingIndicatorBody' when calling botsCancelDialogBotTypingIndicator");
		}

		// create path and map variables
		String localVarPath = "/bots/cancelDialogBotTypingIndicator";

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
	 * cancelPendingDialogQuestions Cancels all pending questions in a bot dialog.&lt;br&gt;
	 * 
	 * @param botsCancelPendingDialogQuestionsBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void botsCancelPendingDialogQuestions(BotsCancelPendingDialogQuestionsBody botsCancelPendingDialogQuestionsBody) throws ApiException {

		botsCancelPendingDialogQuestionsWithHttpInfo(botsCancelPendingDialogQuestionsBody);
	}

	/**
	 * cancelPendingDialogQuestions Cancels all pending questions in a bot dialog.&lt;br&gt;
	 * 
	 * @param botsCancelPendingDialogQuestionsBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> botsCancelPendingDialogQuestionsWithHttpInfo(BotsCancelPendingDialogQuestionsBody botsCancelPendingDialogQuestionsBody) throws ApiException {
		Object localVarPostBody = botsCancelPendingDialogQuestionsBody;

		// verify the required parameter 'botsCancelPendingDialogQuestionsBody' is set
		if (botsCancelPendingDialogQuestionsBody == null) {
			throw new ApiException(400, "Missing the required parameter 'botsCancelPendingDialogQuestionsBody' when calling botsCancelPendingDialogQuestions");
		}

		// create path and map variables
		String localVarPath = "/bots/cancelPendingDialogQuestions";

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
	 * cancelPendingQuestion Cancels a bot&#39;s question message. If the message is not from a bot, the call will throw an error.&lt;br&gt;
	 * 
	 * @param botsCancelPendingQuestionBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void botsCancelPendingQuestion(BotsCancelPendingQuestionBody botsCancelPendingQuestionBody) throws ApiException {

		botsCancelPendingQuestionWithHttpInfo(botsCancelPendingQuestionBody);
	}

	/**
	 * cancelPendingQuestion Cancels a bot&#39;s question message. If the message is not from a bot, the call will throw an error.&lt;br&gt;
	 * 
	 * @param botsCancelPendingQuestionBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> botsCancelPendingQuestionWithHttpInfo(BotsCancelPendingQuestionBody botsCancelPendingQuestionBody) throws ApiException {
		Object localVarPostBody = botsCancelPendingQuestionBody;

		// verify the required parameter 'botsCancelPendingQuestionBody' is set
		if (botsCancelPendingQuestionBody == null) {
			throw new ApiException(400, "Missing the required parameter 'botsCancelPendingQuestionBody' when calling botsCancelPendingQuestion");
		}

		// create path and map variables
		String localVarPath = "/bots/cancelPendingQuestion";

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
	 * create Creates a new dialog bot that can be used for conversation onboarding, reboarding and offboarding.&lt;br&gt;
	 * 
	 * @param dialogBotData The dialog bot to create. (required)
	 * @return DialogBotData
	 * @throws ApiException if fails to make API call
	 */
	public DialogBotData botsCreate(DialogBotData dialogBotData) throws ApiException {
		return botsCreateWithHttpInfo(dialogBotData).getData();
	}

	/**
	 * create Creates a new dialog bot that can be used for conversation onboarding, reboarding and offboarding.&lt;br&gt;
	 * 
	 * @param dialogBotData The dialog bot to create. (required)
	 * @return ApiResponse&lt;DialogBotData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DialogBotData> botsCreateWithHttpInfo(DialogBotData dialogBotData) throws ApiException {
		Object localVarPostBody = dialogBotData;

		// verify the required parameter 'dialogBotData' is set
		if (dialogBotData == null) {
			throw new ApiException(400, "Missing the required parameter 'dialogBotData' when calling botsCreate");
		}

		// create path and map variables
		String localVarPath = "/bots/create";

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

		GenericType<DialogBotData> localVarReturnType = new GenericType<DialogBotData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes an existing dialog bot&lt;br&gt;
	 * 
	 * @param dialogBotId The ID of the dialog bot which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void botsDelete(String dialogBotId) throws ApiException {

		botsDeleteWithHttpInfo(dialogBotId);
	}

	/**
	 * delete Deletes an existing dialog bot&lt;br&gt;
	 * 
	 * @param dialogBotId The ID of the dialog bot which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> botsDeleteWithHttpInfo(String dialogBotId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'dialogBotId' is set
		if (dialogBotId == null) {
			throw new ApiException(400, "Missing the required parameter 'dialogBotId' when calling botsDelete");
		}

		// create path and map variables
		String localVarPath = "/bots/{dialogBotId}/delete"
				.replaceAll("\\{" + "dialogBotId" + "\\}", apiClient.escapeString(dialogBotId.toString()));

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
	 * dialogMessageDelivered Marks a message as delivered to the bot.&lt;br&gt; &lt;br&gt; &lt;b&gt;Note:&lt;/b&gt; If the message is also read use the
	 * &#x60;dialogMessageRead&#x60; end point directly as it will also mark the message as delivered.&lt;br&gt;
	 * 
	 * @param botsDialogMessageDeliveredBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void botsDialogMessageDelivered(BotsDialogMessageDeliveredBody botsDialogMessageDeliveredBody) throws ApiException {

		botsDialogMessageDeliveredWithHttpInfo(botsDialogMessageDeliveredBody);
	}

	/**
	 * dialogMessageDelivered Marks a message as delivered to the bot.&lt;br&gt; &lt;br&gt; &lt;b&gt;Note:&lt;/b&gt; If the message is also read use the
	 * &#x60;dialogMessageRead&#x60; end point directly as it will also mark the message as delivered.&lt;br&gt;
	 * 
	 * @param botsDialogMessageDeliveredBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> botsDialogMessageDeliveredWithHttpInfo(BotsDialogMessageDeliveredBody botsDialogMessageDeliveredBody) throws ApiException {
		Object localVarPostBody = botsDialogMessageDeliveredBody;

		// verify the required parameter 'botsDialogMessageDeliveredBody' is set
		if (botsDialogMessageDeliveredBody == null) {
			throw new ApiException(400, "Missing the required parameter 'botsDialogMessageDeliveredBody' when calling botsDialogMessageDelivered");
		}

		// create path and map variables
		String localVarPath = "/bots/dialogMessageDelivered";

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
	 * dialogMessageRead Marks a message as read to the bot.&lt;br&gt; &lt;br&gt; &lt;b&gt;Note:&lt;/b&gt; This will also mark the message as delivered, if this
	 * hasn&#39;t happened yet.&lt;br&gt;
	 * 
	 * @param botsDialogMessageReadBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void botsDialogMessageRead(BotsDialogMessageReadBody botsDialogMessageReadBody) throws ApiException {

		botsDialogMessageReadWithHttpInfo(botsDialogMessageReadBody);
	}

	/**
	 * dialogMessageRead Marks a message as read to the bot.&lt;br&gt; &lt;br&gt; &lt;b&gt;Note:&lt;/b&gt; This will also mark the message as delivered, if this
	 * hasn&#39;t happened yet.&lt;br&gt;
	 * 
	 * @param botsDialogMessageReadBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> botsDialogMessageReadWithHttpInfo(BotsDialogMessageReadBody botsDialogMessageReadBody) throws ApiException {
		Object localVarPostBody = botsDialogMessageReadBody;

		// verify the required parameter 'botsDialogMessageReadBody' is set
		if (botsDialogMessageReadBody == null) {
			throw new ApiException(400, "Missing the required parameter 'botsDialogMessageReadBody' when calling botsDialogMessageRead");
		}

		// create path and map variables
		String localVarPath = "/bots/dialogMessageRead";

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
	 * finishDialog Ends the dialog. Depending on the reason given and whether the dialog takes place during onboarding, reboarding, or offboarding, this will have
	 * specific effects. See the list below. &lt;p&gt; &lt;b&gt;Reason: &#x60;EBotDialogFinishReason.HAND_OFF&#x60;:&lt;/b&gt;&lt;br&gt; &lt;ul&gt;
	 * &lt;li&gt;&lt;b&gt;Onboarding:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;Next Bot:&lt;/b&gt; a further bot takes over the onboarding.
	 * &lt;li&gt;&lt;b&gt;Activate Participation:&lt;/b&gt; If no further bots are in the queue the participation is activated. For inbound requests this is the
	 * point where the conversation is added to the queue. For PIN conversation and invitations the person is simply placed into the conversation and can actively
	 * participate. &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Reboarding:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;Next Bot:&lt;/b&gt; a further bot takes over the reboarding.
	 * &lt;li&gt;&lt;b&gt;Requeue Conversation:&lt;/b&gt; If no further bots are in the queue the conversation is put back into the queue. &lt;/ul&gt;
	 * &lt;li&gt;&lt;b&gt;Offboarding:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;Next Bot:&lt;/b&gt; a further bot takes over the offboarding. &lt;li&gt;&lt;b&gt;End
	 * Participation:&lt;/b&gt; If no further bots are in the queue the participation is ended and the offboarding person can no longer access it. &lt;/ul&gt;
	 * &lt;/ul&gt; &lt;b&gt;Reason: &#x60;EBotDialogFinishReason.SOLVED&#x60;:&lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;Onboarding:&lt;/b&gt; &lt;ul&gt;
	 * &lt;li&gt;&lt;b&gt;Unassign Conversation:&lt;/b&gt; The conversation will be put in unassigned state and therefore will not be added to the queue as the
	 * problem is solved. New messages to the conversation will start reboarding. &lt;/ul&gt; &lt;b&gt;Reboarding:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;Unassign
	 * Conversation:&lt;/b&gt; The conversation will be put in unassigned state and therefore will not be added to the queue as the problem is solved. New messages
	 * to the conversation will start reboarding again. &lt;/ul&gt; &lt;b&gt;Offboarding:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;End Participation:&lt;/b&gt;
	 * Independent if there are further bots in the queue the participation is ended and the offboarding person can no longer access it. &lt;/ul&gt; &lt;/ul&gt;
	 * &lt;b&gt;Reason: &#x60;EBotDialogFinishReason.ABORTED&#x60;:&lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;Onboarding:&lt;/b&gt; &lt;ul&gt;
	 * &lt;li&gt;&lt;b&gt;Offboard Participant:&lt;/b&gt; The participant is directly moved to the offboarding phase and won&#39;t be allowed to enter the
	 * conversation. &lt;/ul&gt; &lt;b&gt;Reboarding:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;Unassign Conversation:&lt;/b&gt; The participant is directly moved to
	 * the offboarding phase and won&#39;t be allowed to enter the conversation. &lt;/ul&gt; &lt;b&gt;Offboarding:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;End
	 * Participation:&lt;/b&gt; Independent if there are further bots in the queue the participation is ended and the offboarding person can no longer access the
	 * conversation. &lt;/ul&gt; &lt;/ul&gt;&lt;br&gt;
	 * 
	 * @param botsFinishDialogBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void botsFinishDialog(BotsFinishDialogBody botsFinishDialogBody) throws ApiException {

		botsFinishDialogWithHttpInfo(botsFinishDialogBody);
	}

	/**
	 * finishDialog Ends the dialog. Depending on the reason given and whether the dialog takes place during onboarding, reboarding, or offboarding, this will have
	 * specific effects. See the list below. &lt;p&gt; &lt;b&gt;Reason: &#x60;EBotDialogFinishReason.HAND_OFF&#x60;:&lt;/b&gt;&lt;br&gt; &lt;ul&gt;
	 * &lt;li&gt;&lt;b&gt;Onboarding:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;Next Bot:&lt;/b&gt; a further bot takes over the onboarding.
	 * &lt;li&gt;&lt;b&gt;Activate Participation:&lt;/b&gt; If no further bots are in the queue the participation is activated. For inbound requests this is the
	 * point where the conversation is added to the queue. For PIN conversation and invitations the person is simply placed into the conversation and can actively
	 * participate. &lt;/ul&gt; &lt;li&gt;&lt;b&gt;Reboarding:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;Next Bot:&lt;/b&gt; a further bot takes over the reboarding.
	 * &lt;li&gt;&lt;b&gt;Requeue Conversation:&lt;/b&gt; If no further bots are in the queue the conversation is put back into the queue. &lt;/ul&gt;
	 * &lt;li&gt;&lt;b&gt;Offboarding:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;Next Bot:&lt;/b&gt; a further bot takes over the offboarding. &lt;li&gt;&lt;b&gt;End
	 * Participation:&lt;/b&gt; If no further bots are in the queue the participation is ended and the offboarding person can no longer access it. &lt;/ul&gt;
	 * &lt;/ul&gt; &lt;b&gt;Reason: &#x60;EBotDialogFinishReason.SOLVED&#x60;:&lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;Onboarding:&lt;/b&gt; &lt;ul&gt;
	 * &lt;li&gt;&lt;b&gt;Unassign Conversation:&lt;/b&gt; The conversation will be put in unassigned state and therefore will not be added to the queue as the
	 * problem is solved. New messages to the conversation will start reboarding. &lt;/ul&gt; &lt;b&gt;Reboarding:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;Unassign
	 * Conversation:&lt;/b&gt; The conversation will be put in unassigned state and therefore will not be added to the queue as the problem is solved. New messages
	 * to the conversation will start reboarding again. &lt;/ul&gt; &lt;b&gt;Offboarding:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;End Participation:&lt;/b&gt;
	 * Independent if there are further bots in the queue the participation is ended and the offboarding person can no longer access it. &lt;/ul&gt; &lt;/ul&gt;
	 * &lt;b&gt;Reason: &#x60;EBotDialogFinishReason.ABORTED&#x60;:&lt;/b&gt;&lt;br&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;Onboarding:&lt;/b&gt; &lt;ul&gt;
	 * &lt;li&gt;&lt;b&gt;Offboard Participant:&lt;/b&gt; The participant is directly moved to the offboarding phase and won&#39;t be allowed to enter the
	 * conversation. &lt;/ul&gt; &lt;b&gt;Reboarding:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;Unassign Conversation:&lt;/b&gt; The participant is directly moved to
	 * the offboarding phase and won&#39;t be allowed to enter the conversation. &lt;/ul&gt; &lt;b&gt;Offboarding:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;&lt;b&gt;End
	 * Participation:&lt;/b&gt; Independent if there are further bots in the queue the participation is ended and the offboarding person can no longer access the
	 * conversation. &lt;/ul&gt; &lt;/ul&gt;&lt;br&gt;
	 * 
	 * @param botsFinishDialogBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> botsFinishDialogWithHttpInfo(BotsFinishDialogBody botsFinishDialogBody) throws ApiException {
		Object localVarPostBody = botsFinishDialogBody;

		// verify the required parameter 'botsFinishDialogBody' is set
		if (botsFinishDialogBody == null) {
			throw new ApiException(400, "Missing the required parameter 'botsFinishDialogBody' when calling botsFinishDialog");
		}

		// create path and map variables
		String localVarPath = "/bots/finishDialog";

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
	 * getByName Searches for an existing dialog bot with the given name.&lt;br&gt;
	 * 
	 * @param name Name of the dialog bot. (optional)
	 * @return DialogBotData
	 * @throws ApiException if fails to make API call
	 */
	public DialogBotData botsGetByName(String name) throws ApiException {
		return botsGetByNameWithHttpInfo(name).getData();
	}

	/**
	 * getByName Searches for an existing dialog bot with the given name.&lt;br&gt;
	 * 
	 * @param name Name of the dialog bot. (optional)
	 * @return ApiResponse&lt;DialogBotData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DialogBotData> botsGetByNameWithHttpInfo(String name) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/bots/getByName";

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

		GenericType<DialogBotData> localVarReturnType = new GenericType<DialogBotData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Reads an existing dialog bot.&lt;br&gt;
	 * 
	 * @param dialogBotId The ID of the dialog bot. (required)
	 * @return DialogBotData
	 * @throws ApiException if fails to make API call
	 */
	public DialogBotData botsRead(String dialogBotId) throws ApiException {
		return botsReadWithHttpInfo(dialogBotId).getData();
	}

	/**
	 * read Reads an existing dialog bot.&lt;br&gt;
	 * 
	 * @param dialogBotId The ID of the dialog bot. (required)
	 * @return ApiResponse&lt;DialogBotData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DialogBotData> botsReadWithHttpInfo(String dialogBotId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'dialogBotId' is set
		if (dialogBotId == null) {
			throw new ApiException(400, "Missing the required parameter 'dialogBotId' when calling botsRead");
		}

		// create path and map variables
		String localVarPath = "/bots/{dialogBotId}/read"
				.replaceAll("\\{" + "dialogBotId" + "\\}", apiClient.escapeString(dialogBotId.toString()));

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

		GenericType<DialogBotData> localVarReturnType = new GenericType<DialogBotData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * restrictDialogCounterpart Limits the length of a message the counterpart can send to the bot in a dialog. &lt;p&gt; The value is reset automatically when the
	 * bot hands off the dialog.&lt;br&gt;
	 * 
	 * @param botsRestrictDialogCounterpartBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void botsRestrictDialogCounterpart(BotsRestrictDialogCounterpartBody botsRestrictDialogCounterpartBody) throws ApiException {

		botsRestrictDialogCounterpartWithHttpInfo(botsRestrictDialogCounterpartBody);
	}

	/**
	 * restrictDialogCounterpart Limits the length of a message the counterpart can send to the bot in a dialog. &lt;p&gt; The value is reset automatically when the
	 * bot hands off the dialog.&lt;br&gt;
	 * 
	 * @param botsRestrictDialogCounterpartBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> botsRestrictDialogCounterpartWithHttpInfo(BotsRestrictDialogCounterpartBody botsRestrictDialogCounterpartBody) throws ApiException {
		Object localVarPostBody = botsRestrictDialogCounterpartBody;

		// verify the required parameter 'botsRestrictDialogCounterpartBody' is set
		if (botsRestrictDialogCounterpartBody == null) {
			throw new ApiException(400, "Missing the required parameter 'botsRestrictDialogCounterpartBody' when calling botsRestrictDialogCounterpart");
		}

		// create path and map variables
		String localVarPath = "/bots/restrictDialogCounterpart";

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
	 * search Search for dialog bots in the current account&lt;br&gt;
	 * 
	 * @param dialogBotQuery (required)
	 * @return DialogBotResult
	 * @throws ApiException if fails to make API call
	 */
	public DialogBotResult botsSearch(DialogBotQuery dialogBotQuery) throws ApiException {
		return botsSearchWithHttpInfo(dialogBotQuery).getData();
	}

	/**
	 * search Search for dialog bots in the current account&lt;br&gt;
	 * 
	 * @param dialogBotQuery (required)
	 * @return ApiResponse&lt;DialogBotResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DialogBotResult> botsSearchWithHttpInfo(DialogBotQuery dialogBotQuery) throws ApiException {
		Object localVarPostBody = dialogBotQuery;

		// verify the required parameter 'dialogBotQuery' is set
		if (dialogBotQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'dialogBotQuery' when calling botsSearch");
		}

		// create path and map variables
		String localVarPath = "/bots/search";

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

		GenericType<DialogBotResult> localVarReturnType = new GenericType<DialogBotResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * sendDialogMessage Sends a message as a bot into an ongoing dialog. &lt;p&gt; It can only be used after the bot received the &#x60;BotDialogOpenEvent&#x60;
	 * webhook for this dialog.&lt;br&gt;
	 * 
	 * @param botDialogPostMessage The message to send (required)
	 * @return SendMessageResult
	 * @throws ApiException if fails to make API call
	 */
	public SendMessageResult botsSendDialogMessage(BotDialogPostMessage botDialogPostMessage) throws ApiException {
		return botsSendDialogMessageWithHttpInfo(botDialogPostMessage).getData();
	}

	/**
	 * sendDialogMessage Sends a message as a bot into an ongoing dialog. &lt;p&gt; It can only be used after the bot received the &#x60;BotDialogOpenEvent&#x60;
	 * webhook for this dialog.&lt;br&gt;
	 * 
	 * @param botDialogPostMessage The message to send (required)
	 * @return ApiResponse&lt;SendMessageResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<SendMessageResult> botsSendDialogMessageWithHttpInfo(BotDialogPostMessage botDialogPostMessage) throws ApiException {
		Object localVarPostBody = botDialogPostMessage;

		// verify the required parameter 'botDialogPostMessage' is set
		if (botDialogPostMessage == null) {
			throw new ApiException(400, "Missing the required parameter 'botDialogPostMessage' when calling botsSendDialogMessage");
		}

		// create path and map variables
		String localVarPath = "/bots/sendDialogMessage";

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
	 * sendMessage Sends a message to a conversation as a bot. &lt;p&gt; This can be used at any time during a conversation. It is not related to bot
	 * dialogs.&lt;br&gt;
	 * 
	 * @param botPostMessage The message to send (required)
	 * @return SendMessageResult
	 * @throws ApiException if fails to make API call
	 */
	public SendMessageResult botsSendMessage(BotPostMessage botPostMessage) throws ApiException {
		return botsSendMessageWithHttpInfo(botPostMessage).getData();
	}

	/**
	 * sendMessage Sends a message to a conversation as a bot. &lt;p&gt; This can be used at any time during a conversation. It is not related to bot
	 * dialogs.&lt;br&gt;
	 * 
	 * @param botPostMessage The message to send (required)
	 * @return ApiResponse&lt;SendMessageResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<SendMessageResult> botsSendMessageWithHttpInfo(BotPostMessage botPostMessage) throws ApiException {
		Object localVarPostBody = botPostMessage;

		// verify the required parameter 'botPostMessage' is set
		if (botPostMessage == null) {
			throw new ApiException(400, "Missing the required parameter 'botPostMessage' when calling botsSendMessage");
		}

		// create path and map variables
		String localVarPath = "/bots/sendMessage";

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
	 * sendPing Emits a &#x60;WebhookPingEvent&#x60; or &#x60;PingRequest&#x60; on the configured webhook/outbound endpoint for the dialog bot.&lt;br&gt;
	 * 
	 * @param dialogBotId The ID of the dialog bot (required)
	 * @return PingResponse
	 * @throws ApiException if fails to make API call
	 */
	public PingResponse botsSendPing(String dialogBotId) throws ApiException {
		return botsSendPingWithHttpInfo(dialogBotId).getData();
	}

	/**
	 * sendPing Emits a &#x60;WebhookPingEvent&#x60; or &#x60;PingRequest&#x60; on the configured webhook/outbound endpoint for the dialog bot.&lt;br&gt;
	 * 
	 * @param dialogBotId The ID of the dialog bot (required)
	 * @return ApiResponse&lt;PingResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PingResponse> botsSendPingWithHttpInfo(String dialogBotId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'dialogBotId' is set
		if (dialogBotId == null) {
			throw new ApiException(400, "Missing the required parameter 'dialogBotId' when calling botsSendPing");
		}

		// create path and map variables
		String localVarPath = "/bots/{dialogBotId}/sendPing"
				.replaceAll("\\{" + "dialogBotId" + "\\}", apiClient.escapeString(dialogBotId.toString()));

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
	 * startDialogBotTypingIndicator Displays a typing indicator for the dialog bot, to show the counterpart person that something is happening.&lt;br&gt; The
	 * typing indicator is removed automatically after four seconds or when the bot sends a message, whichever occurs sooner. If the typing indicator is already
	 * displayed, calling this endpoint resets the four second timer.&lt;br&gt;
	 * 
	 * @param botsStartDialogBotTypingIndicatorBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void botsStartDialogBotTypingIndicator(BotsStartDialogBotTypingIndicatorBody botsStartDialogBotTypingIndicatorBody) throws ApiException {

		botsStartDialogBotTypingIndicatorWithHttpInfo(botsStartDialogBotTypingIndicatorBody);
	}

	/**
	 * startDialogBotTypingIndicator Displays a typing indicator for the dialog bot, to show the counterpart person that something is happening.&lt;br&gt; The
	 * typing indicator is removed automatically after four seconds or when the bot sends a message, whichever occurs sooner. If the typing indicator is already
	 * displayed, calling this endpoint resets the four second timer.&lt;br&gt;
	 * 
	 * @param botsStartDialogBotTypingIndicatorBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> botsStartDialogBotTypingIndicatorWithHttpInfo(BotsStartDialogBotTypingIndicatorBody botsStartDialogBotTypingIndicatorBody) throws ApiException {
		Object localVarPostBody = botsStartDialogBotTypingIndicatorBody;

		// verify the required parameter 'botsStartDialogBotTypingIndicatorBody' is set
		if (botsStartDialogBotTypingIndicatorBody == null) {
			throw new ApiException(400, "Missing the required parameter 'botsStartDialogBotTypingIndicatorBody' when calling botsStartDialogBotTypingIndicator");
		}

		// create path and map variables
		String localVarPath = "/bots/startDialogBotTypingIndicator";

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
	 * update Updates an existing dialog bot.&lt;br&gt;
	 * 
	 * @param dialogBotData (required)
	 * @return DialogBotData
	 * @throws ApiException if fails to make API call
	 */
	public DialogBotData botsUpdate(DialogBotData dialogBotData) throws ApiException {
		return botsUpdateWithHttpInfo(dialogBotData).getData();
	}

	/**
	 * update Updates an existing dialog bot.&lt;br&gt;
	 * 
	 * @param dialogBotData (required)
	 * @return ApiResponse&lt;DialogBotData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DialogBotData> botsUpdateWithHttpInfo(DialogBotData dialogBotData) throws ApiException {
		Object localVarPostBody = dialogBotData;

		// verify the required parameter 'dialogBotData' is set
		if (dialogBotData == null) {
			throw new ApiException(400, "Missing the required parameter 'dialogBotData' when calling botsUpdate");
		}

		// create path and map variables
		String localVarPath = "/bots/update";

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

		GenericType<DialogBotData> localVarReturnType = new GenericType<DialogBotData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
