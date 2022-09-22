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
import com.unblu.webapi.model.v3.ConversationData;
import com.unblu.webapi.model.v3.ConversationFileData;
import com.unblu.webapi.model.v3.ConversationQuery;
import com.unblu.webapi.model.v3.ConversationRecipientData;
import com.unblu.webapi.model.v3.ConversationResult;
import com.unblu.webapi.model.v3.ConversationsAddParticipantBody;
import com.unblu.webapi.model.v3.ConversationsChangeParticipantVisibilityBody;
import com.unblu.webapi.model.v3.ConversationsEndBody;
import com.unblu.webapi.model.v3.ConversationsOffboardParticipantBody;
import com.unblu.webapi.model.v3.ConversationsSetAssigneePersonBody;
import com.unblu.webapi.model.v3.ConversationsSetContextPersonBody;
import com.unblu.webapi.model.v3.ConversationsSetLocaleBody;
import com.unblu.webapi.model.v3.ConversationsSetStarredBody;
import com.unblu.webapi.model.v3.ConversationsSetVisitorDataBody;
import com.unblu.webapi.model.v3.EConversationEndReason;
import com.unblu.webapi.model.v3.EConversationLeftReason;

public class ConversationsApi {
	private ApiClient apiClient;

	public ConversationsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ConversationsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * addParticipant Add a participant to a conversation.&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param conversationsAddParticipantBody (required)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsAddParticipant(String conversationId, ConversationsAddParticipantBody conversationsAddParticipantBody, String expand) throws ApiException {
		return conversationsAddParticipantWithHttpInfo(conversationId, conversationsAddParticipantBody, expand).getData();
	}

	/**
	 * addParticipant Add a participant to a conversation.&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param conversationsAddParticipantBody (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsAddParticipantWithHttpInfo(String conversationId, ConversationsAddParticipantBody conversationsAddParticipantBody, String expand) throws ApiException {
		Object localVarPostBody = conversationsAddParticipantBody;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsAddParticipant");
		}

		// verify the required parameter 'conversationsAddParticipantBody' is set
		if (conversationsAddParticipantBody == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationsAddParticipantBody' when calling conversationsAddParticipant");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/addParticipant"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * addParticipant Add a participant to a conversation.&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param expand (optional)
	 * @param personId (optional)
	 * @param connectedViaExternalMessenger (optional)
	 * @param hidden (optional)
	 * @param conversationStarred (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ConversationData conversationsAddParticipantLegacyGet(String conversationId, String expand, String personId, Boolean connectedViaExternalMessenger, Boolean hidden, Boolean conversationStarred) throws ApiException {
		return conversationsAddParticipantLegacyGetWithHttpInfo(conversationId, expand, personId, connectedViaExternalMessenger, hidden, conversationStarred).getData();
	}

	/**
	 * addParticipant Add a participant to a conversation.&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param expand (optional)
	 * @param personId (optional)
	 * @param connectedViaExternalMessenger (optional)
	 * @param hidden (optional)
	 * @param conversationStarred (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<ConversationData> conversationsAddParticipantLegacyGetWithHttpInfo(String conversationId, String expand, String personId, Boolean connectedViaExternalMessenger, Boolean hidden, Boolean conversationStarred) throws ApiException {
		Object localVarPostBody = new Object();

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsAddParticipantLegacyGet");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/addParticipant"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "personId", personId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "connectedViaExternalMessenger", connectedViaExternalMessenger));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "hidden", hidden));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "conversationStarred", conversationStarred));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * changeParticipantVisibility Changes the visibility of a conversation&#39;s participant.&lt;br&gt;
	 * 
	 * @param conversationId (required)
	 * @param conversationsChangeParticipantVisibilityBody (required)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsChangeParticipantVisibility(String conversationId, ConversationsChangeParticipantVisibilityBody conversationsChangeParticipantVisibilityBody, String expand) throws ApiException {
		return conversationsChangeParticipantVisibilityWithHttpInfo(conversationId, conversationsChangeParticipantVisibilityBody, expand).getData();
	}

	/**
	 * changeParticipantVisibility Changes the visibility of a conversation&#39;s participant.&lt;br&gt;
	 * 
	 * @param conversationId (required)
	 * @param conversationsChangeParticipantVisibilityBody (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsChangeParticipantVisibilityWithHttpInfo(String conversationId, ConversationsChangeParticipantVisibilityBody conversationsChangeParticipantVisibilityBody, String expand) throws ApiException {
		Object localVarPostBody = conversationsChangeParticipantVisibilityBody;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsChangeParticipantVisibility");
		}

		// verify the required parameter 'conversationsChangeParticipantVisibilityBody' is set
		if (conversationsChangeParticipantVisibilityBody == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationsChangeParticipantVisibilityBody' when calling conversationsChangeParticipantVisibility");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/changeParticipantVisibility"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * changeParticipantVisibility Changes the visibility of a conversation&#39;s participant.&lt;br&gt;
	 * 
	 * @param conversationId (required)
	 * @param expand (optional)
	 * @param personId (optional)
	 * @param hidden (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ConversationData conversationsChangeParticipantVisibilityLegacyGet(String conversationId, String expand, String personId, Boolean hidden) throws ApiException {
		return conversationsChangeParticipantVisibilityLegacyGetWithHttpInfo(conversationId, expand, personId, hidden).getData();
	}

	/**
	 * changeParticipantVisibility Changes the visibility of a conversation&#39;s participant.&lt;br&gt;
	 * 
	 * @param conversationId (required)
	 * @param expand (optional)
	 * @param personId (optional)
	 * @param hidden (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<ConversationData> conversationsChangeParticipantVisibilityLegacyGetWithHttpInfo(String conversationId, String expand, String personId, Boolean hidden) throws ApiException {
		Object localVarPostBody = new Object();

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsChangeParticipantVisibilityLegacyGet");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/changeParticipantVisibility"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "personId", personId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "hidden", hidden));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * create Creates the conversation in the system. The id of the conversation must not be set for the &#39;create&#39; operation as a new one will be
	 * generated.&lt;br&gt;
	 * 
	 * @param conversationData (required)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsCreate(ConversationData conversationData, String expand) throws ApiException {
		return conversationsCreateWithHttpInfo(conversationData, expand).getData();
	}

	/**
	 * create Creates the conversation in the system. The id of the conversation must not be set for the &#39;create&#39; operation as a new one will be
	 * generated.&lt;br&gt;
	 * 
	 * @param conversationData (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsCreateWithHttpInfo(ConversationData conversationData, String expand) throws ApiException {
		Object localVarPostBody = conversationData;

		// verify the required parameter 'conversationData' is set
		if (conversationData == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationData' when calling conversationsCreate");
		}

		// create path and map variables
		String localVarPath = "/conversations/create";

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

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the conversation for the given id&lt;br&gt;
	 * 
	 * @param id The id of the conversation which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void conversationsDelete(String id) throws ApiException {

		conversationsDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes the conversation for the given id&lt;br&gt;
	 * 
	 * @param id The id of the conversation which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> conversationsDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/conversations/delete";

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
	 * delete Deletes the conversation for the given id&lt;br&gt;
	 * 
	 * @param id The id of the conversation which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void conversationsDeleteLegacyGet(String id) throws ApiException {

		conversationsDeleteLegacyGetWithHttpInfo(id);
	}

	/**
	 * delete Deletes the conversation for the given id&lt;br&gt;
	 * 
	 * @param id The id of the conversation which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> conversationsDeleteLegacyGetWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/conversations/delete";

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
	 * end End a conversation.&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param conversationsEndBody (required)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsEnd(String conversationId, ConversationsEndBody conversationsEndBody, String expand) throws ApiException {
		return conversationsEndWithHttpInfo(conversationId, conversationsEndBody, expand).getData();
	}

	/**
	 * end End a conversation.&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param conversationsEndBody (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsEndWithHttpInfo(String conversationId, ConversationsEndBody conversationsEndBody, String expand) throws ApiException {
		Object localVarPostBody = conversationsEndBody;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsEnd");
		}

		// verify the required parameter 'conversationsEndBody' is set
		if (conversationsEndBody == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationsEndBody' when calling conversationsEnd");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/end"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * end End a conversation.&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param expand (optional)
	 * @param reason (optional)
	 * @param comment (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ConversationData conversationsEndLegacyGet(String conversationId, String expand, EConversationEndReason reason, String comment) throws ApiException {
		return conversationsEndLegacyGetWithHttpInfo(conversationId, expand, reason, comment).getData();
	}

	/**
	 * end End a conversation.&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param expand (optional)
	 * @param reason (optional)
	 * @param comment (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<ConversationData> conversationsEndLegacyGetWithHttpInfo(String conversationId, String expand, EConversationEndReason reason, String comment) throws ApiException {
		Object localVarPostBody = new Object();

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsEndLegacyGet");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/end"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "reason", reason));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "comment", comment));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getBySourceIdAndChannelId Returns the conversation for the given source and channel id&lt;br&gt;
	 * 
	 * @param sourceId The sourceId with which the conversation was created (optional)
	 * @param externalMessengerChannelId The messenger channel id to which the conversation is connected. Can be null for internal conversations. (optional)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsGetBySourceIdAndChannelId(String sourceId, String externalMessengerChannelId, String expand) throws ApiException {
		return conversationsGetBySourceIdAndChannelIdWithHttpInfo(sourceId, externalMessengerChannelId, expand).getData();
	}

	/**
	 * getBySourceIdAndChannelId Returns the conversation for the given source and channel id&lt;br&gt;
	 * 
	 * @param sourceId The sourceId with which the conversation was created (optional)
	 * @param externalMessengerChannelId The messenger channel id to which the conversation is connected. Can be null for internal conversations. (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsGetBySourceIdAndChannelIdWithHttpInfo(String sourceId, String externalMessengerChannelId, String expand) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/conversations/getBySourceIdAndChannelId";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceId", sourceId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "externalMessengerChannelId", externalMessengerChannelId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getConversationFiles Returns a list of all files that have been shared/sent within the specified conversation.&lt;br&gt;
	 * 
	 * @param conversationId the id of conversation, for which the file list should be retrieved (required)
	 * @return List&lt;ConversationFileData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<ConversationFileData> conversationsGetConversationFiles(String conversationId) throws ApiException {
		return conversationsGetConversationFilesWithHttpInfo(conversationId).getData();
	}

	/**
	 * getConversationFiles Returns a list of all files that have been shared/sent within the specified conversation.&lt;br&gt;
	 * 
	 * @param conversationId the id of conversation, for which the file list should be retrieved (required)
	 * @return ApiResponse&lt;List&lt;ConversationFileData&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<ConversationFileData>> conversationsGetConversationFilesWithHttpInfo(String conversationId) throws ApiException {
		Object localVarPostBody = new Object();

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsGetConversationFiles");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/getConversationFiles"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

		GenericType<List<ConversationFileData>> localVarReturnType = new GenericType<List<ConversationFileData>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * offboardParticipant Offboard a participant from a conversation.&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param conversationsOffboardParticipantBody (required)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsOffboardParticipant(String conversationId, ConversationsOffboardParticipantBody conversationsOffboardParticipantBody, String expand) throws ApiException {
		return conversationsOffboardParticipantWithHttpInfo(conversationId, conversationsOffboardParticipantBody, expand).getData();
	}

	/**
	 * offboardParticipant Offboard a participant from a conversation.&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param conversationsOffboardParticipantBody (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsOffboardParticipantWithHttpInfo(String conversationId, ConversationsOffboardParticipantBody conversationsOffboardParticipantBody, String expand) throws ApiException {
		Object localVarPostBody = conversationsOffboardParticipantBody;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsOffboardParticipant");
		}

		// verify the required parameter 'conversationsOffboardParticipantBody' is set
		if (conversationsOffboardParticipantBody == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationsOffboardParticipantBody' when calling conversationsOffboardParticipant");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/offboardParticipant"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * offboardParticipant Offboard a participant from a conversation.&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param expand (optional)
	 * @param personId (optional)
	 * @param reason (optional)
	 * @param comment (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ConversationData conversationsOffboardParticipantLegacyGet(String conversationId, String expand, String personId, EConversationLeftReason reason, String comment) throws ApiException {
		return conversationsOffboardParticipantLegacyGetWithHttpInfo(conversationId, expand, personId, reason, comment).getData();
	}

	/**
	 * offboardParticipant Offboard a participant from a conversation.&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param expand (optional)
	 * @param personId (optional)
	 * @param reason (optional)
	 * @param comment (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<ConversationData> conversationsOffboardParticipantLegacyGetWithHttpInfo(String conversationId, String expand, String personId, EConversationLeftReason reason, String comment) throws ApiException {
		Object localVarPostBody = new Object();

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsOffboardParticipantLegacyGet");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/offboardParticipant"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "personId", personId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "reason", reason));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "comment", comment));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the conversation for the given id&lt;br&gt;
	 * 
	 * @param id Id of the conversation which should be returned (optional)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsRead(String id, String expand) throws ApiException {
		return conversationsReadWithHttpInfo(id, expand).getData();
	}

	/**
	 * read Returns the conversation for the given id&lt;br&gt;
	 * 
	 * @param id Id of the conversation which should be returned (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsReadWithHttpInfo(String id, String expand) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/conversations/read";

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

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for conversations in the current account&lt;br&gt;
	 * 
	 * @param conversationQuery (required)
	 * @param expand (optional)
	 * @return ConversationResult
	 * @throws ApiException if fails to make API call
	 */
	public ConversationResult conversationsSearch(ConversationQuery conversationQuery, String expand) throws ApiException {
		return conversationsSearchWithHttpInfo(conversationQuery, expand).getData();
	}

	/**
	 * search Search for conversations in the current account&lt;br&gt;
	 * 
	 * @param conversationQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationResult> conversationsSearchWithHttpInfo(ConversationQuery conversationQuery, String expand) throws ApiException {
		Object localVarPostBody = conversationQuery;

		// verify the required parameter 'conversationQuery' is set
		if (conversationQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationQuery' when calling conversationsSearch");
		}

		// create path and map variables
		String localVarPath = "/conversations/search";

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

		GenericType<ConversationResult> localVarReturnType = new GenericType<ConversationResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setAssigneePerson Set an agent as assignee to a conversation. &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; The person has to have an active participation in the
	 * conversation&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param conversationsSetAssigneePersonBody (required)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsSetAssigneePerson(String conversationId, ConversationsSetAssigneePersonBody conversationsSetAssigneePersonBody, String expand) throws ApiException {
		return conversationsSetAssigneePersonWithHttpInfo(conversationId, conversationsSetAssigneePersonBody, expand).getData();
	}

	/**
	 * setAssigneePerson Set an agent as assignee to a conversation. &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; The person has to have an active participation in the
	 * conversation&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param conversationsSetAssigneePersonBody (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsSetAssigneePersonWithHttpInfo(String conversationId, ConversationsSetAssigneePersonBody conversationsSetAssigneePersonBody, String expand) throws ApiException {
		Object localVarPostBody = conversationsSetAssigneePersonBody;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsSetAssigneePerson");
		}

		// verify the required parameter 'conversationsSetAssigneePersonBody' is set
		if (conversationsSetAssigneePersonBody == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationsSetAssigneePersonBody' when calling conversationsSetAssigneePerson");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/setAssigneePerson"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setAssigneePerson Set an agent as assignee to a conversation. &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; The person has to have an active participation in the
	 * conversation&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param expand (optional)
	 * @param personId (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ConversationData conversationsSetAssigneePersonLegacyGet(String conversationId, String expand, String personId) throws ApiException {
		return conversationsSetAssigneePersonLegacyGetWithHttpInfo(conversationId, expand, personId).getData();
	}

	/**
	 * setAssigneePerson Set an agent as assignee to a conversation. &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; The person has to have an active participation in the
	 * conversation&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param expand (optional)
	 * @param personId (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<ConversationData> conversationsSetAssigneePersonLegacyGetWithHttpInfo(String conversationId, String expand, String personId) throws ApiException {
		Object localVarPostBody = new Object();

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsSetAssigneePersonLegacyGet");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/setAssigneePerson"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "personId", personId));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setContextPerson Set a visitor as context person of a conversation. &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; The person has to have an active participation in the
	 * conversation&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param conversationsSetContextPersonBody (required)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsSetContextPerson(String conversationId, ConversationsSetContextPersonBody conversationsSetContextPersonBody, String expand) throws ApiException {
		return conversationsSetContextPersonWithHttpInfo(conversationId, conversationsSetContextPersonBody, expand).getData();
	}

	/**
	 * setContextPerson Set a visitor as context person of a conversation. &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; The person has to have an active participation in the
	 * conversation&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param conversationsSetContextPersonBody (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsSetContextPersonWithHttpInfo(String conversationId, ConversationsSetContextPersonBody conversationsSetContextPersonBody, String expand) throws ApiException {
		Object localVarPostBody = conversationsSetContextPersonBody;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsSetContextPerson");
		}

		// verify the required parameter 'conversationsSetContextPersonBody' is set
		if (conversationsSetContextPersonBody == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationsSetContextPersonBody' when calling conversationsSetContextPerson");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/setContextPerson"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setContextPerson Set a visitor as context person of a conversation. &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; The person has to have an active participation in the
	 * conversation&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param expand (optional)
	 * @param personId (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ConversationData conversationsSetContextPersonLegacyGet(String conversationId, String expand, String personId) throws ApiException {
		return conversationsSetContextPersonLegacyGetWithHttpInfo(conversationId, expand, personId).getData();
	}

	/**
	 * setContextPerson Set a visitor as context person of a conversation. &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; The person has to have an active participation in the
	 * conversation&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param expand (optional)
	 * @param personId (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<ConversationData> conversationsSetContextPersonLegacyGetWithHttpInfo(String conversationId, String expand, String personId) throws ApiException {
		Object localVarPostBody = new Object();

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsSetContextPersonLegacyGet");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/setContextPerson"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "personId", personId));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setLocale Set the the locale of the conversation language (as BCP 47 language tag form including region if available).&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param conversationsSetLocaleBody (required)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsSetLocale(String conversationId, ConversationsSetLocaleBody conversationsSetLocaleBody, String expand) throws ApiException {
		return conversationsSetLocaleWithHttpInfo(conversationId, conversationsSetLocaleBody, expand).getData();
	}

	/**
	 * setLocale Set the the locale of the conversation language (as BCP 47 language tag form including region if available).&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param conversationsSetLocaleBody (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsSetLocaleWithHttpInfo(String conversationId, ConversationsSetLocaleBody conversationsSetLocaleBody, String expand) throws ApiException {
		Object localVarPostBody = conversationsSetLocaleBody;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsSetLocale");
		}

		// verify the required parameter 'conversationsSetLocaleBody' is set
		if (conversationsSetLocaleBody == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationsSetLocaleBody' when calling conversationsSetLocale");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/setLocale"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setLocale Set the the locale of the conversation language (as BCP 47 language tag form including region if available).&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param expand (optional)
	 * @param locale (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ConversationData conversationsSetLocaleLegacyGet(String conversationId, String expand, String locale) throws ApiException {
		return conversationsSetLocaleLegacyGetWithHttpInfo(conversationId, expand, locale).getData();
	}

	/**
	 * setLocale Set the the locale of the conversation language (as BCP 47 language tag form including region if available).&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param expand (optional)
	 * @param locale (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<ConversationData> conversationsSetLocaleLegacyGetWithHttpInfo(String conversationId, String expand, String locale) throws ApiException {
		Object localVarPostBody = new Object();

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsSetLocaleLegacyGet");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/setLocale"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setRecipient Set a person, named area, team or account as the recipient of a conversation.&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param conversationRecipientData (required)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsSetRecipient(String conversationId, ConversationRecipientData conversationRecipientData, String expand) throws ApiException {
		return conversationsSetRecipientWithHttpInfo(conversationId, conversationRecipientData, expand).getData();
	}

	/**
	 * setRecipient Set a person, named area, team or account as the recipient of a conversation.&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param conversationRecipientData (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsSetRecipientWithHttpInfo(String conversationId, ConversationRecipientData conversationRecipientData, String expand) throws ApiException {
		Object localVarPostBody = conversationRecipientData;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsSetRecipient");
		}

		// verify the required parameter 'conversationRecipientData' is set
		if (conversationRecipientData == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationRecipientData' when calling conversationsSetRecipient");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/setRecipient"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setStarred Set the starred status of a conversation for a particular person&lt;br&gt;
	 * 
	 * @param conversationId the conversation to be starred/unstarred (required)
	 * @param conversationsSetStarredBody (required)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsSetStarred(String conversationId, ConversationsSetStarredBody conversationsSetStarredBody, String expand) throws ApiException {
		return conversationsSetStarredWithHttpInfo(conversationId, conversationsSetStarredBody, expand).getData();
	}

	/**
	 * setStarred Set the starred status of a conversation for a particular person&lt;br&gt;
	 * 
	 * @param conversationId the conversation to be starred/unstarred (required)
	 * @param conversationsSetStarredBody (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsSetStarredWithHttpInfo(String conversationId, ConversationsSetStarredBody conversationsSetStarredBody, String expand) throws ApiException {
		Object localVarPostBody = conversationsSetStarredBody;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsSetStarred");
		}

		// verify the required parameter 'conversationsSetStarredBody' is set
		if (conversationsSetStarredBody == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationsSetStarredBody' when calling conversationsSetStarred");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/setStarred"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setVisitorData Set custom visitor data.&lt;br&gt;
	 * 
	 * @param conversationId the conversation where the custom data should be added (required)
	 * @param conversationsSetVisitorDataBody the custom visitor data (required)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsSetVisitorData(String conversationId, ConversationsSetVisitorDataBody conversationsSetVisitorDataBody, String expand) throws ApiException {
		return conversationsSetVisitorDataWithHttpInfo(conversationId, conversationsSetVisitorDataBody, expand).getData();
	}

	/**
	 * setVisitorData Set custom visitor data.&lt;br&gt;
	 * 
	 * @param conversationId the conversation where the custom data should be added (required)
	 * @param conversationsSetVisitorDataBody the custom visitor data (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsSetVisitorDataWithHttpInfo(String conversationId, ConversationsSetVisitorDataBody conversationsSetVisitorDataBody, String expand) throws ApiException {
		Object localVarPostBody = conversationsSetVisitorDataBody;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsSetVisitorData");
		}

		// verify the required parameter 'conversationsSetVisitorDataBody' is set
		if (conversationsSetVisitorDataBody == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationsSetVisitorDataBody' when calling conversationsSetVisitorData");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/setVisitorData"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * updateConfiguration Update the configuration map for a specific conversation&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param requestBody the key-value map of settings that will be updated. The source for this map has to be the &lt;code&gt;configuration&lt;/code&gt; attribute
	 * when you read the conversation using &lt;code&gt;configuration&lt;/code&gt; in the &lt;code&gt;expand&lt;/code&gt; query parameter. (required)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsUpdateConfiguration(String conversationId, Map<String, String> requestBody, String expand) throws ApiException {
		return conversationsUpdateConfigurationWithHttpInfo(conversationId, requestBody, expand).getData();
	}

	/**
	 * updateConfiguration Update the configuration map for a specific conversation&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param requestBody the key-value map of settings that will be updated. The source for this map has to be the &lt;code&gt;configuration&lt;/code&gt; attribute
	 * when you read the conversation using &lt;code&gt;configuration&lt;/code&gt; in the &lt;code&gt;expand&lt;/code&gt; query parameter. (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsUpdateConfigurationWithHttpInfo(String conversationId, Map<String, String> requestBody, String expand) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsUpdateConfiguration");
		}

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling conversationsUpdateConfiguration");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/updateConfiguration"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * updateMetadata Update the metadata map for a specific conversation&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param requestBody the key-value map of metadata that will be updated. The source for this map has to be the &lt;code&gt;metadata&lt;/code&gt; attribute when
	 * you read the conversation using &lt;code&gt;metadata&lt;/code&gt; in the &lt;code&gt;expand&lt;/code&gt; query parameter. (required)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsUpdateMetadata(String conversationId, Map<String, String> requestBody, String expand) throws ApiException {
		return conversationsUpdateMetadataWithHttpInfo(conversationId, requestBody, expand).getData();
	}

	/**
	 * updateMetadata Update the metadata map for a specific conversation&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param requestBody the key-value map of metadata that will be updated. The source for this map has to be the &lt;code&gt;metadata&lt;/code&gt; attribute when
	 * you read the conversation using &lt;code&gt;metadata&lt;/code&gt; in the &lt;code&gt;expand&lt;/code&gt; query parameter. (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsUpdateMetadataWithHttpInfo(String conversationId, Map<String, String> requestBody, String expand) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsUpdateMetadata");
		}

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling conversationsUpdateMetadata");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/updateMetadata"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * updateText Update the text map for a specific conversation&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param requestBody the key-value map of translations that will be updated. The source for this map has to be the &lt;code&gt;text&lt;/code&gt; attribute when
	 * you read the conversation using &lt;code&gt;text&lt;/code&gt; in the &lt;code&gt;expand&lt;/code&gt; query parameter. (required)
	 * @param expand (optional)
	 * @return ConversationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationData conversationsUpdateText(String conversationId, Map<String, Map<String, String>> requestBody, String expand) throws ApiException {
		return conversationsUpdateTextWithHttpInfo(conversationId, requestBody, expand).getData();
	}

	/**
	 * updateText Update the text map for a specific conversation&lt;br&gt;
	 * 
	 * @param conversationId the conversation that is updated (required)
	 * @param requestBody the key-value map of translations that will be updated. The source for this map has to be the &lt;code&gt;text&lt;/code&gt; attribute when
	 * you read the conversation using &lt;code&gt;text&lt;/code&gt; in the &lt;code&gt;expand&lt;/code&gt; query parameter. (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ConversationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationData> conversationsUpdateTextWithHttpInfo(String conversationId, Map<String, Map<String, String>> requestBody, String expand) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationId' when calling conversationsUpdateText");
		}

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling conversationsUpdateText");
		}

		// create path and map variables
		String localVarPath = "/conversations/{conversationId}/updateText"
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

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

		GenericType<ConversationData> localVarReturnType = new GenericType<ConversationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
