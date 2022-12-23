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
import com.unblu.webapi.model.v3.ConversationInvitationData;
import com.unblu.webapi.model.v3.ConversationInvitationQuery;
import com.unblu.webapi.model.v3.ConversationInvitationResult;
import com.unblu.webapi.model.v3.InvitationsAddSecondaryInvitationTargetBody;
import com.unblu.webapi.model.v3.InvitationsCancelSecondaryInvitationTargetBody;
import com.unblu.webapi.model.v3.InvitationsForwardConversationToAgentBody;
import com.unblu.webapi.model.v3.InvitationsForwardConversationToTeamBody;
import com.unblu.webapi.model.v3.InvitationsInviteAgentToConversationBody;
import com.unblu.webapi.model.v3.InvitationsInviteAnonymousVisitorToConversationWithEmailBody;
import com.unblu.webapi.model.v3.InvitationsInviteAnonymousVisitorToConversationWithLinkBody;
import com.unblu.webapi.model.v3.InvitationsInviteAnonymousVisitorToConversationWithPinBody;
import com.unblu.webapi.model.v3.InvitationsInviteTeamToConversationBody;
import com.unblu.webapi.model.v3.InvitationsRequeueConversationBody;

public class InvitationsApi {
	private ApiClient apiClient;

	public InvitationsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public InvitationsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * addSecondaryInvitationTarget Add a secondary invitation target to the given invitation. This target agent is informed additionally to the main target agent
	 * and can accept the invitation in their place. &lt;ul&gt; &lt;li&gt;The endpoint may only be called for conversation requests directed at a specific agent.
	 * &lt;li&gt;The secondary target must be different from the main target of the invitation. &lt;li&gt;Each secondary invitation target may only added to an
	 * invitation to a particular conversation once. The same secondary invitation target can, however, be added to invitations to multiple conversations.
	 * &lt;/ul&gt; If any of these prerequisites are violated, the call to the endpoint returns an error response code. To cancel a secondary invitation,
	 * see&#x60;cancelSecondaryInvitationTarget&#x60;&lt;br&gt;
	 * 
	 * @param invitationId The invitation that the secondary target should be added to (required)
	 * @param invitationsAddSecondaryInvitationTargetBody (required)
	 * @return ConversationInvitationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationInvitationData invitationsAddSecondaryInvitationTarget(String invitationId, InvitationsAddSecondaryInvitationTargetBody invitationsAddSecondaryInvitationTargetBody) throws ApiException {
		return invitationsAddSecondaryInvitationTargetWithHttpInfo(invitationId, invitationsAddSecondaryInvitationTargetBody).getData();
	}

	/**
	 * addSecondaryInvitationTarget Add a secondary invitation target to the given invitation. This target agent is informed additionally to the main target agent
	 * and can accept the invitation in their place. &lt;ul&gt; &lt;li&gt;The endpoint may only be called for conversation requests directed at a specific agent.
	 * &lt;li&gt;The secondary target must be different from the main target of the invitation. &lt;li&gt;Each secondary invitation target may only added to an
	 * invitation to a particular conversation once. The same secondary invitation target can, however, be added to invitations to multiple conversations.
	 * &lt;/ul&gt; If any of these prerequisites are violated, the call to the endpoint returns an error response code. To cancel a secondary invitation,
	 * see&#x60;cancelSecondaryInvitationTarget&#x60;&lt;br&gt;
	 * 
	 * @param invitationId The invitation that the secondary target should be added to (required)
	 * @param invitationsAddSecondaryInvitationTargetBody (required)
	 * @return ApiResponse&lt;ConversationInvitationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationInvitationData> invitationsAddSecondaryInvitationTargetWithHttpInfo(String invitationId, InvitationsAddSecondaryInvitationTargetBody invitationsAddSecondaryInvitationTargetBody) throws ApiException {
		Object localVarPostBody = invitationsAddSecondaryInvitationTargetBody;

		// verify the required parameter 'invitationId' is set
		if (invitationId == null) {
			throw new ApiException(400, "Missing the required parameter 'invitationId' when calling invitationsAddSecondaryInvitationTarget");
		}

		// verify the required parameter 'invitationsAddSecondaryInvitationTargetBody' is set
		if (invitationsAddSecondaryInvitationTargetBody == null) {
			throw new ApiException(400, "Missing the required parameter 'invitationsAddSecondaryInvitationTargetBody' when calling invitationsAddSecondaryInvitationTarget");
		}

		// create path and map variables
		String localVarPath = "/invitations/{invitationId}/addSecondaryInvitationTarget"
				.replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

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

		GenericType<ConversationInvitationData> localVarReturnType = new GenericType<ConversationInvitationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * cancelSecondaryInvitationTarget Cancels the invitation sent to a secondary target. The secondary target agent will no longer be able to accept the
	 * invitation.&lt;br&gt; See also &#x60;addSecondaryInvitationTarget&#x60;&lt;br&gt;
	 * 
	 * @param invitationId The invitation the secondary target belongs to (required)
	 * @param invitationsCancelSecondaryInvitationTargetBody (required)
	 * @return ConversationInvitationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationInvitationData invitationsCancelSecondaryInvitationTarget(String invitationId, InvitationsCancelSecondaryInvitationTargetBody invitationsCancelSecondaryInvitationTargetBody) throws ApiException {
		return invitationsCancelSecondaryInvitationTargetWithHttpInfo(invitationId, invitationsCancelSecondaryInvitationTargetBody).getData();
	}

	/**
	 * cancelSecondaryInvitationTarget Cancels the invitation sent to a secondary target. The secondary target agent will no longer be able to accept the
	 * invitation.&lt;br&gt; See also &#x60;addSecondaryInvitationTarget&#x60;&lt;br&gt;
	 * 
	 * @param invitationId The invitation the secondary target belongs to (required)
	 * @param invitationsCancelSecondaryInvitationTargetBody (required)
	 * @return ApiResponse&lt;ConversationInvitationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationInvitationData> invitationsCancelSecondaryInvitationTargetWithHttpInfo(String invitationId, InvitationsCancelSecondaryInvitationTargetBody invitationsCancelSecondaryInvitationTargetBody) throws ApiException {
		Object localVarPostBody = invitationsCancelSecondaryInvitationTargetBody;

		// verify the required parameter 'invitationId' is set
		if (invitationId == null) {
			throw new ApiException(400, "Missing the required parameter 'invitationId' when calling invitationsCancelSecondaryInvitationTarget");
		}

		// verify the required parameter 'invitationsCancelSecondaryInvitationTargetBody' is set
		if (invitationsCancelSecondaryInvitationTargetBody == null) {
			throw new ApiException(400, "Missing the required parameter 'invitationsCancelSecondaryInvitationTargetBody' when calling invitationsCancelSecondaryInvitationTarget");
		}

		// create path and map variables
		String localVarPath = "/invitations/{invitationId}/cancelSecondaryInvitationTarget"
				.replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

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

		GenericType<ConversationInvitationData> localVarReturnType = new GenericType<ConversationInvitationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * forwardConversationToAgent Forwards a conversation to an agent. The current assigned agent stays in the conversation until the invitation is accepted. Once
	 * the invited agent accepts the invitation, they join the conversation as the assigned agent, and the previous assigned agent is removed from the conversation.
	 * &lt;p&gt; If there is already a forwarding invitation for the conversation, that invitation is revoked.&lt;br&gt; If the conversation is in the queue, the
	 * assignment request invitation is revoked.&lt;br&gt;
	 * 
	 * @param invitationsForwardConversationToAgentBody (required)
	 * @return ConversationInvitationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationInvitationData invitationsForwardConversationToAgent(InvitationsForwardConversationToAgentBody invitationsForwardConversationToAgentBody) throws ApiException {
		return invitationsForwardConversationToAgentWithHttpInfo(invitationsForwardConversationToAgentBody).getData();
	}

	/**
	 * forwardConversationToAgent Forwards a conversation to an agent. The current assigned agent stays in the conversation until the invitation is accepted. Once
	 * the invited agent accepts the invitation, they join the conversation as the assigned agent, and the previous assigned agent is removed from the conversation.
	 * &lt;p&gt; If there is already a forwarding invitation for the conversation, that invitation is revoked.&lt;br&gt; If the conversation is in the queue, the
	 * assignment request invitation is revoked.&lt;br&gt;
	 * 
	 * @param invitationsForwardConversationToAgentBody (required)
	 * @return ApiResponse&lt;ConversationInvitationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationInvitationData> invitationsForwardConversationToAgentWithHttpInfo(InvitationsForwardConversationToAgentBody invitationsForwardConversationToAgentBody) throws ApiException {
		Object localVarPostBody = invitationsForwardConversationToAgentBody;

		// verify the required parameter 'invitationsForwardConversationToAgentBody' is set
		if (invitationsForwardConversationToAgentBody == null) {
			throw new ApiException(400, "Missing the required parameter 'invitationsForwardConversationToAgentBody' when calling invitationsForwardConversationToAgent");
		}

		// create path and map variables
		String localVarPath = "/invitations/forwardConversationToAgent";

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

		GenericType<ConversationInvitationData> localVarReturnType = new GenericType<ConversationInvitationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * forwardConversationToTeam Forwards a conversation to a team. The current assigned agent remains in the conversation until the invitation is accepted. Once an
	 * agent of the invited team or its parent teams accepts the invitation, they join the conversation as its assigned agent, and the previous assigned agent is
	 * removed from the conversation. &lt;p&gt; If there is already a forwarding invitation for the conversation, that invitation is revoked.&lt;br&gt; If the
	 * conversation is in the queue, the assignment request invitation is revoked.&lt;br&gt;
	 * 
	 * @param invitationsForwardConversationToTeamBody (required)
	 * @return ConversationInvitationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationInvitationData invitationsForwardConversationToTeam(InvitationsForwardConversationToTeamBody invitationsForwardConversationToTeamBody) throws ApiException {
		return invitationsForwardConversationToTeamWithHttpInfo(invitationsForwardConversationToTeamBody).getData();
	}

	/**
	 * forwardConversationToTeam Forwards a conversation to a team. The current assigned agent remains in the conversation until the invitation is accepted. Once an
	 * agent of the invited team or its parent teams accepts the invitation, they join the conversation as its assigned agent, and the previous assigned agent is
	 * removed from the conversation. &lt;p&gt; If there is already a forwarding invitation for the conversation, that invitation is revoked.&lt;br&gt; If the
	 * conversation is in the queue, the assignment request invitation is revoked.&lt;br&gt;
	 * 
	 * @param invitationsForwardConversationToTeamBody (required)
	 * @return ApiResponse&lt;ConversationInvitationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationInvitationData> invitationsForwardConversationToTeamWithHttpInfo(InvitationsForwardConversationToTeamBody invitationsForwardConversationToTeamBody) throws ApiException {
		Object localVarPostBody = invitationsForwardConversationToTeamBody;

		// verify the required parameter 'invitationsForwardConversationToTeamBody' is set
		if (invitationsForwardConversationToTeamBody == null) {
			throw new ApiException(400, "Missing the required parameter 'invitationsForwardConversationToTeamBody' when calling invitationsForwardConversationToTeam");
		}

		// create path and map variables
		String localVarPath = "/invitations/forwardConversationToTeam";

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

		GenericType<ConversationInvitationData> localVarReturnType = new GenericType<ConversationInvitationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * inviteAgentToConversation Creates an invitation to the given conversation for an agent. If the agent accepts the invitation, they join the conversation as a
	 * secondary agent. If a conflicting invitation already exists, an error is returned.&lt;br&gt;
	 * 
	 * @param invitationsInviteAgentToConversationBody (required)
	 * @return ConversationInvitationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationInvitationData invitationsInviteAgentToConversation(InvitationsInviteAgentToConversationBody invitationsInviteAgentToConversationBody) throws ApiException {
		return invitationsInviteAgentToConversationWithHttpInfo(invitationsInviteAgentToConversationBody).getData();
	}

	/**
	 * inviteAgentToConversation Creates an invitation to the given conversation for an agent. If the agent accepts the invitation, they join the conversation as a
	 * secondary agent. If a conflicting invitation already exists, an error is returned.&lt;br&gt;
	 * 
	 * @param invitationsInviteAgentToConversationBody (required)
	 * @return ApiResponse&lt;ConversationInvitationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationInvitationData> invitationsInviteAgentToConversationWithHttpInfo(InvitationsInviteAgentToConversationBody invitationsInviteAgentToConversationBody) throws ApiException {
		Object localVarPostBody = invitationsInviteAgentToConversationBody;

		// verify the required parameter 'invitationsInviteAgentToConversationBody' is set
		if (invitationsInviteAgentToConversationBody == null) {
			throw new ApiException(400, "Missing the required parameter 'invitationsInviteAgentToConversationBody' when calling invitationsInviteAgentToConversation");
		}

		// create path and map variables
		String localVarPath = "/invitations/inviteAgentToConversation";

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

		GenericType<ConversationInvitationData> localVarReturnType = new GenericType<ConversationInvitationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * inviteAnonymousVisitorToConversationWithEmail Invites a visitor to join a conversation by email. Calling this method sends an email to the email address
	 * provided containing a link that opens the conversation in the Visitor Desk.&lt;br&gt;
	 * 
	 * @param invitationsInviteAnonymousVisitorToConversationWithEmailBody (required)
	 * @return ConversationInvitationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationInvitationData invitationsInviteAnonymousVisitorToConversationWithEmail(InvitationsInviteAnonymousVisitorToConversationWithEmailBody invitationsInviteAnonymousVisitorToConversationWithEmailBody) throws ApiException {
		return invitationsInviteAnonymousVisitorToConversationWithEmailWithHttpInfo(invitationsInviteAnonymousVisitorToConversationWithEmailBody).getData();
	}

	/**
	 * inviteAnonymousVisitorToConversationWithEmail Invites a visitor to join a conversation by email. Calling this method sends an email to the email address
	 * provided containing a link that opens the conversation in the Visitor Desk.&lt;br&gt;
	 * 
	 * @param invitationsInviteAnonymousVisitorToConversationWithEmailBody (required)
	 * @return ApiResponse&lt;ConversationInvitationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationInvitationData> invitationsInviteAnonymousVisitorToConversationWithEmailWithHttpInfo(InvitationsInviteAnonymousVisitorToConversationWithEmailBody invitationsInviteAnonymousVisitorToConversationWithEmailBody) throws ApiException {
		Object localVarPostBody = invitationsInviteAnonymousVisitorToConversationWithEmailBody;

		// verify the required parameter 'invitationsInviteAnonymousVisitorToConversationWithEmailBody' is set
		if (invitationsInviteAnonymousVisitorToConversationWithEmailBody == null) {
			throw new ApiException(400, "Missing the required parameter 'invitationsInviteAnonymousVisitorToConversationWithEmailBody' when calling invitationsInviteAnonymousVisitorToConversationWithEmail");
		}

		// create path and map variables
		String localVarPath = "/invitations/inviteAnonymousVisitorToConversationWithEmail";

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

		GenericType<ConversationInvitationData> localVarReturnType = new GenericType<ConversationInvitationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * inviteAnonymousVisitorToConversationWithLink Invites a visitor to a join conversation using a link. The returned invitation data contains a link of the type
	 * \&quot;ACCEPT_IN_VISITOR_DESK\&quot; which can be passed on to the invited visitor.&lt;br&gt;
	 * 
	 * @param invitationsInviteAnonymousVisitorToConversationWithLinkBody (required)
	 * @return ConversationInvitationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationInvitationData invitationsInviteAnonymousVisitorToConversationWithLink(InvitationsInviteAnonymousVisitorToConversationWithLinkBody invitationsInviteAnonymousVisitorToConversationWithLinkBody) throws ApiException {
		return invitationsInviteAnonymousVisitorToConversationWithLinkWithHttpInfo(invitationsInviteAnonymousVisitorToConversationWithLinkBody).getData();
	}

	/**
	 * inviteAnonymousVisitorToConversationWithLink Invites a visitor to a join conversation using a link. The returned invitation data contains a link of the type
	 * \&quot;ACCEPT_IN_VISITOR_DESK\&quot; which can be passed on to the invited visitor.&lt;br&gt;
	 * 
	 * @param invitationsInviteAnonymousVisitorToConversationWithLinkBody (required)
	 * @return ApiResponse&lt;ConversationInvitationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationInvitationData> invitationsInviteAnonymousVisitorToConversationWithLinkWithHttpInfo(InvitationsInviteAnonymousVisitorToConversationWithLinkBody invitationsInviteAnonymousVisitorToConversationWithLinkBody) throws ApiException {
		Object localVarPostBody = invitationsInviteAnonymousVisitorToConversationWithLinkBody;

		// verify the required parameter 'invitationsInviteAnonymousVisitorToConversationWithLinkBody' is set
		if (invitationsInviteAnonymousVisitorToConversationWithLinkBody == null) {
			throw new ApiException(400, "Missing the required parameter 'invitationsInviteAnonymousVisitorToConversationWithLinkBody' when calling invitationsInviteAnonymousVisitorToConversationWithLink");
		}

		// create path and map variables
		String localVarPath = "/invitations/inviteAnonymousVisitorToConversationWithLink";

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

		GenericType<ConversationInvitationData> localVarReturnType = new GenericType<ConversationInvitationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * inviteAnonymousVisitorToConversationWithPin Invites a visitor to join a conversation using a PIN. The PIN can be found in the \&quot;token\&quot; field of
	 * the returned invitation. It can be redeemed by entering it in the embedded or floating site integration UI.&lt;br&gt;
	 * 
	 * @param invitationsInviteAnonymousVisitorToConversationWithPinBody (required)
	 * @return ConversationInvitationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationInvitationData invitationsInviteAnonymousVisitorToConversationWithPin(InvitationsInviteAnonymousVisitorToConversationWithPinBody invitationsInviteAnonymousVisitorToConversationWithPinBody) throws ApiException {
		return invitationsInviteAnonymousVisitorToConversationWithPinWithHttpInfo(invitationsInviteAnonymousVisitorToConversationWithPinBody).getData();
	}

	/**
	 * inviteAnonymousVisitorToConversationWithPin Invites a visitor to join a conversation using a PIN. The PIN can be found in the \&quot;token\&quot; field of
	 * the returned invitation. It can be redeemed by entering it in the embedded or floating site integration UI.&lt;br&gt;
	 * 
	 * @param invitationsInviteAnonymousVisitorToConversationWithPinBody (required)
	 * @return ApiResponse&lt;ConversationInvitationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationInvitationData> invitationsInviteAnonymousVisitorToConversationWithPinWithHttpInfo(InvitationsInviteAnonymousVisitorToConversationWithPinBody invitationsInviteAnonymousVisitorToConversationWithPinBody) throws ApiException {
		Object localVarPostBody = invitationsInviteAnonymousVisitorToConversationWithPinBody;

		// verify the required parameter 'invitationsInviteAnonymousVisitorToConversationWithPinBody' is set
		if (invitationsInviteAnonymousVisitorToConversationWithPinBody == null) {
			throw new ApiException(400, "Missing the required parameter 'invitationsInviteAnonymousVisitorToConversationWithPinBody' when calling invitationsInviteAnonymousVisitorToConversationWithPin");
		}

		// create path and map variables
		String localVarPath = "/invitations/inviteAnonymousVisitorToConversationWithPin";

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

		GenericType<ConversationInvitationData> localVarReturnType = new GenericType<ConversationInvitationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * inviteTeamToConversation Creates an invitation for a team for the given conversation. The invitation can be redeemed once by any agent in either the invited
	 * team or one of its parent teams. The agent who redeeems the invitation joins the conversation as a secondary agent. If a conflicting invitation already
	 * exists, an error is returned.&lt;br&gt;
	 * 
	 * @param invitationsInviteTeamToConversationBody (required)
	 * @return ConversationInvitationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationInvitationData invitationsInviteTeamToConversation(InvitationsInviteTeamToConversationBody invitationsInviteTeamToConversationBody) throws ApiException {
		return invitationsInviteTeamToConversationWithHttpInfo(invitationsInviteTeamToConversationBody).getData();
	}

	/**
	 * inviteTeamToConversation Creates an invitation for a team for the given conversation. The invitation can be redeemed once by any agent in either the invited
	 * team or one of its parent teams. The agent who redeeems the invitation joins the conversation as a secondary agent. If a conflicting invitation already
	 * exists, an error is returned.&lt;br&gt;
	 * 
	 * @param invitationsInviteTeamToConversationBody (required)
	 * @return ApiResponse&lt;ConversationInvitationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationInvitationData> invitationsInviteTeamToConversationWithHttpInfo(InvitationsInviteTeamToConversationBody invitationsInviteTeamToConversationBody) throws ApiException {
		Object localVarPostBody = invitationsInviteTeamToConversationBody;

		// verify the required parameter 'invitationsInviteTeamToConversationBody' is set
		if (invitationsInviteTeamToConversationBody == null) {
			throw new ApiException(400, "Missing the required parameter 'invitationsInviteTeamToConversationBody' when calling invitationsInviteTeamToConversation");
		}

		// create path and map variables
		String localVarPath = "/invitations/inviteTeamToConversation";

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

		GenericType<ConversationInvitationData> localVarReturnType = new GenericType<ConversationInvitationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the invitation with the given ID.&lt;br&gt;
	 * 
	 * @param id The ID of the invitation to return (optional)
	 * @return ConversationInvitationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationInvitationData invitationsRead(String id) throws ApiException {
		return invitationsReadWithHttpInfo(id).getData();
	}

	/**
	 * read Returns the invitation with the given ID.&lt;br&gt;
	 * 
	 * @param id The ID of the invitation to return (optional)
	 * @return ApiResponse&lt;ConversationInvitationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationInvitationData> invitationsReadWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/invitations/read";

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

		GenericType<ConversationInvitationData> localVarReturnType = new GenericType<ConversationInvitationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * renewPin Renews the PIN of an anonymous visitor PIN invitation. An error is returned if the method is called for any other type of invitation.&lt;br&gt;
	 * 
	 * @param invitationId Invitation id. (required)
	 * @return ConversationInvitationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationInvitationData invitationsRenewPin(String invitationId) throws ApiException {
		return invitationsRenewPinWithHttpInfo(invitationId).getData();
	}

	/**
	 * renewPin Renews the PIN of an anonymous visitor PIN invitation. An error is returned if the method is called for any other type of invitation.&lt;br&gt;
	 * 
	 * @param invitationId Invitation id. (required)
	 * @return ApiResponse&lt;ConversationInvitationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationInvitationData> invitationsRenewPinWithHttpInfo(String invitationId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'invitationId' is set
		if (invitationId == null) {
			throw new ApiException(400, "Missing the required parameter 'invitationId' when calling invitationsRenewPin");
		}

		// create path and map variables
		String localVarPath = "/invitations/{invitationId}/renewPin"
				.replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

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

		GenericType<ConversationInvitationData> localVarReturnType = new GenericType<ConversationInvitationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * requeueConversation Return the given conversation to the queue by creating an assignment request invitation.&lt;br&gt; This is only possible for
	 * conversations that were initiated by the visitor, that is, the conversation&#39;s initial engagement type must be a request. &lt;p&gt; Optionally, existing
	 * agent participants can be removed from the conversation.&lt;br&gt;
	 * 
	 * @param invitationsRequeueConversationBody (required)
	 * @return ConversationInvitationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationInvitationData invitationsRequeueConversation(InvitationsRequeueConversationBody invitationsRequeueConversationBody) throws ApiException {
		return invitationsRequeueConversationWithHttpInfo(invitationsRequeueConversationBody).getData();
	}

	/**
	 * requeueConversation Return the given conversation to the queue by creating an assignment request invitation.&lt;br&gt; This is only possible for
	 * conversations that were initiated by the visitor, that is, the conversation&#39;s initial engagement type must be a request. &lt;p&gt; Optionally, existing
	 * agent participants can be removed from the conversation.&lt;br&gt;
	 * 
	 * @param invitationsRequeueConversationBody (required)
	 * @return ApiResponse&lt;ConversationInvitationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationInvitationData> invitationsRequeueConversationWithHttpInfo(InvitationsRequeueConversationBody invitationsRequeueConversationBody) throws ApiException {
		Object localVarPostBody = invitationsRequeueConversationBody;

		// verify the required parameter 'invitationsRequeueConversationBody' is set
		if (invitationsRequeueConversationBody == null) {
			throw new ApiException(400, "Missing the required parameter 'invitationsRequeueConversationBody' when calling invitationsRequeueConversation");
		}

		// create path and map variables
		String localVarPath = "/invitations/requeueConversation";

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

		GenericType<ConversationInvitationData> localVarReturnType = new GenericType<ConversationInvitationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * revoke Revokes the invitation making it impossible to accept it anymore.&lt;br&gt;
	 * 
	 * @param invitationId Invitation id. (required)
	 * @return ConversationInvitationData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationInvitationData invitationsRevoke(String invitationId) throws ApiException {
		return invitationsRevokeWithHttpInfo(invitationId).getData();
	}

	/**
	 * revoke Revokes the invitation making it impossible to accept it anymore.&lt;br&gt;
	 * 
	 * @param invitationId Invitation id. (required)
	 * @return ApiResponse&lt;ConversationInvitationData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationInvitationData> invitationsRevokeWithHttpInfo(String invitationId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'invitationId' is set
		if (invitationId == null) {
			throw new ApiException(400, "Missing the required parameter 'invitationId' when calling invitationsRevoke");
		}

		// create path and map variables
		String localVarPath = "/invitations/{invitationId}/revoke"
				.replaceAll("\\{" + "invitationId" + "\\}", apiClient.escapeString(invitationId.toString()));

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

		GenericType<ConversationInvitationData> localVarReturnType = new GenericType<ConversationInvitationData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for invitations in the current account&lt;br&gt;
	 * 
	 * @param conversationInvitationQuery (required)
	 * @return ConversationInvitationResult
	 * @throws ApiException if fails to make API call
	 */
	public ConversationInvitationResult invitationsSearch(ConversationInvitationQuery conversationInvitationQuery) throws ApiException {
		return invitationsSearchWithHttpInfo(conversationInvitationQuery).getData();
	}

	/**
	 * search Search for invitations in the current account&lt;br&gt;
	 * 
	 * @param conversationInvitationQuery (required)
	 * @return ApiResponse&lt;ConversationInvitationResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationInvitationResult> invitationsSearchWithHttpInfo(ConversationInvitationQuery conversationInvitationQuery) throws ApiException {
		Object localVarPostBody = conversationInvitationQuery;

		// verify the required parameter 'conversationInvitationQuery' is set
		if (conversationInvitationQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationInvitationQuery' when calling invitationsSearch");
		}

		// create path and map variables
		String localVarPath = "/invitations/search";

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

		GenericType<ConversationInvitationResult> localVarReturnType = new GenericType<ConversationInvitationResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
