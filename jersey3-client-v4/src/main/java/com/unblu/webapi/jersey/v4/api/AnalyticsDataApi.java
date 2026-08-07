package com.unblu.webapi.jersey.v4.api;

import com.unblu.webapi.jersey.v4.invoker.ApiException;
import com.unblu.webapi.jersey.v4.invoker.ApiClient;
import com.unblu.webapi.jersey.v4.invoker.ApiResponse;
import com.unblu.webapi.jersey.v4.invoker.Configuration;
import com.unblu.webapi.jersey.v4.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.unblu.webapi.model.v4.AnalyticsKpiDataQuery;
import com.unblu.webapi.model.v4.CallsAnalyticsKpiDataResult;
import com.unblu.webapi.model.v4.CollaborationLayersAnalyticsKpiDataResult;
import com.unblu.webapi.model.v4.ConversationsEndedAnalyticsKpiDataResult;
import com.unblu.webapi.model.v4.HandlingTimeAnalyticsKpiDataResult;
import com.unblu.webapi.model.v4.MessagesAnalyticsKpiDataResult;
import com.unblu.webapi.model.v4.QueueInteractionAnalyticsKpiDataResult;
import com.unblu.webapi.model.v4.WaitingTimeAnalyticsKpiDataResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsDataApi {
	private ApiClient apiClient;

	public AnalyticsDataApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AnalyticsDataApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * searchCalls &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the audio and video calls that have ended, one entry per call. &lt;p&gt; Each entry
	 * describes a single call: its timing, type, participants, who started it, why it ended, and the conversation it belonged to.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the time range, ordering, and paging options for the search (required)
	 * @return CallsAnalyticsKpiDataResult
	 * @throws ApiException if fails to make API call
	 */
	public CallsAnalyticsKpiDataResult analyticsDataSearchCalls(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		return analyticsDataSearchCallsWithHttpInfo(analyticsKpiDataQuery).getData();
	}

	/**
	 * searchCalls &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the audio and video calls that have ended, one entry per call. &lt;p&gt; Each entry
	 * describes a single call: its timing, type, participants, who started it, why it ended, and the conversation it belonged to.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the time range, ordering, and paging options for the search (required)
	 * @return ApiResponse&lt;CallsAnalyticsKpiDataResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CallsAnalyticsKpiDataResult> analyticsDataSearchCallsWithHttpInfo(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		Object localVarPostBody = analyticsKpiDataQuery;

		// verify the required parameter 'analyticsKpiDataQuery' is set
		if (analyticsKpiDataQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsKpiDataQuery' when calling analyticsDataSearchCalls");
		}

		// create path and map variables
		String localVarPath = "/analytics/data/searchCalls";

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

		GenericType<CallsAnalyticsKpiDataResult> localVarReturnType = new GenericType<CallsAnalyticsKpiDataResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * searchCollaborationLayers &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the collaboration sessions (such as co-browsing or screen sharing) that
	 * have finished, one entry per session. &lt;p&gt; Each entry describes a single session: its type, how long it was active, who started and stopped it, and the
	 * conversation it belonged to.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the time range, ordering, and paging options for the search (required)
	 * @return CollaborationLayersAnalyticsKpiDataResult
	 * @throws ApiException if fails to make API call
	 */
	public CollaborationLayersAnalyticsKpiDataResult analyticsDataSearchCollaborationLayers(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		return analyticsDataSearchCollaborationLayersWithHttpInfo(analyticsKpiDataQuery).getData();
	}

	/**
	 * searchCollaborationLayers &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the collaboration sessions (such as co-browsing or screen sharing) that
	 * have finished, one entry per session. &lt;p&gt; Each entry describes a single session: its type, how long it was active, who started and stopped it, and the
	 * conversation it belonged to.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the time range, ordering, and paging options for the search (required)
	 * @return ApiResponse&lt;CollaborationLayersAnalyticsKpiDataResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CollaborationLayersAnalyticsKpiDataResult> analyticsDataSearchCollaborationLayersWithHttpInfo(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		Object localVarPostBody = analyticsKpiDataQuery;

		// verify the required parameter 'analyticsKpiDataQuery' is set
		if (analyticsKpiDataQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsKpiDataQuery' when calling analyticsDataSearchCollaborationLayers");
		}

		// create path and map variables
		String localVarPath = "/analytics/data/searchCollaborationLayers";

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

		GenericType<CollaborationLayersAnalyticsKpiDataResult> localVarReturnType = new GenericType<CollaborationLayersAnalyticsKpiDataResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * searchConversationsEnded &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the conversations that have ended, one entry per conversation. &lt;p&gt;
	 * Each entry summarizes the whole conversation: its lifecycle timestamps (creation, onboarding, queued, active, offboarding, end), why it ended, and totals
	 * such as message, call, and collaboration session counts and durations.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the time range, ordering, and paging options for the search (required)
	 * @return ConversationsEndedAnalyticsKpiDataResult
	 * @throws ApiException if fails to make API call
	 */
	public ConversationsEndedAnalyticsKpiDataResult analyticsDataSearchConversationsEnded(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		return analyticsDataSearchConversationsEndedWithHttpInfo(analyticsKpiDataQuery).getData();
	}

	/**
	 * searchConversationsEnded &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the conversations that have ended, one entry per conversation. &lt;p&gt;
	 * Each entry summarizes the whole conversation: its lifecycle timestamps (creation, onboarding, queued, active, offboarding, end), why it ended, and totals
	 * such as message, call, and collaboration session counts and durations.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the time range, ordering, and paging options for the search (required)
	 * @return ApiResponse&lt;ConversationsEndedAnalyticsKpiDataResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationsEndedAnalyticsKpiDataResult> analyticsDataSearchConversationsEndedWithHttpInfo(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		Object localVarPostBody = analyticsKpiDataQuery;

		// verify the required parameter 'analyticsKpiDataQuery' is set
		if (analyticsKpiDataQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsKpiDataQuery' when calling analyticsDataSearchConversationsEnded");
		}

		// create path and map variables
		String localVarPath = "/analytics/data/searchConversationsEnded";

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

		GenericType<ConversationsEndedAnalyticsKpiDataResult> localVarReturnType = new GenericType<ConversationsEndedAnalyticsKpiDataResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * searchHandlingTime &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns how long agents spent handling conversations, one entry per handling period.
	 * &lt;p&gt; Each entry covers a single handling period: its duration, how it ended (for example forwarded, pushed back to a queue, or conversation ended), and
	 * the conversation it belonged to. A conversation handled by several agents produces several entries.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the time range, ordering, and paging options for the search (required)
	 * @return HandlingTimeAnalyticsKpiDataResult
	 * @throws ApiException if fails to make API call
	 */
	public HandlingTimeAnalyticsKpiDataResult analyticsDataSearchHandlingTime(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		return analyticsDataSearchHandlingTimeWithHttpInfo(analyticsKpiDataQuery).getData();
	}

	/**
	 * searchHandlingTime &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns how long agents spent handling conversations, one entry per handling period.
	 * &lt;p&gt; Each entry covers a single handling period: its duration, how it ended (for example forwarded, pushed back to a queue, or conversation ended), and
	 * the conversation it belonged to. A conversation handled by several agents produces several entries.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the time range, ordering, and paging options for the search (required)
	 * @return ApiResponse&lt;HandlingTimeAnalyticsKpiDataResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<HandlingTimeAnalyticsKpiDataResult> analyticsDataSearchHandlingTimeWithHttpInfo(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		Object localVarPostBody = analyticsKpiDataQuery;

		// verify the required parameter 'analyticsKpiDataQuery' is set
		if (analyticsKpiDataQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsKpiDataQuery' when calling analyticsDataSearchHandlingTime");
		}

		// create path and map variables
		String localVarPath = "/analytics/data/searchHandlingTime";

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

		GenericType<HandlingTimeAnalyticsKpiDataResult> localVarReturnType = new GenericType<HandlingTimeAnalyticsKpiDataResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * searchMessages &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the messages exchanged in conversations, one entry per message. &lt;p&gt; Each
	 * entry describes a single message: its sender, type, length, timestamps, and the conversation it belonged to.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the time range, ordering, and paging options for the search (required)
	 * @return MessagesAnalyticsKpiDataResult
	 * @throws ApiException if fails to make API call
	 */
	public MessagesAnalyticsKpiDataResult analyticsDataSearchMessages(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		return analyticsDataSearchMessagesWithHttpInfo(analyticsKpiDataQuery).getData();
	}

	/**
	 * searchMessages &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the messages exchanged in conversations, one entry per message. &lt;p&gt; Each
	 * entry describes a single message: its sender, type, length, timestamps, and the conversation it belonged to.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the time range, ordering, and paging options for the search (required)
	 * @return ApiResponse&lt;MessagesAnalyticsKpiDataResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<MessagesAnalyticsKpiDataResult> analyticsDataSearchMessagesWithHttpInfo(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		Object localVarPostBody = analyticsKpiDataQuery;

		// verify the required parameter 'analyticsKpiDataQuery' is set
		if (analyticsKpiDataQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsKpiDataQuery' when calling analyticsDataSearchMessages");
		}

		// create path and map variables
		String localVarPath = "/analytics/data/searchMessages";

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

		GenericType<MessagesAnalyticsKpiDataResult> localVarReturnType = new GenericType<MessagesAnalyticsKpiDataResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * searchQueueInteraction &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the outcomes of queued invitations and reservations, one entry per
	 * resolved interaction. &lt;p&gt; Each entry describes a single interaction and how it ended (redeemed, revoked, cancelled, declined, timed out, or visitor
	 * left), how long it took to resolve, who it was offered to, and the conversation it belonged to.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the time range, ordering, and paging options for the search (required)
	 * @return QueueInteractionAnalyticsKpiDataResult
	 * @throws ApiException if fails to make API call
	 */
	public QueueInteractionAnalyticsKpiDataResult analyticsDataSearchQueueInteraction(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		return analyticsDataSearchQueueInteractionWithHttpInfo(analyticsKpiDataQuery).getData();
	}

	/**
	 * searchQueueInteraction &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the outcomes of queued invitations and reservations, one entry per
	 * resolved interaction. &lt;p&gt; Each entry describes a single interaction and how it ended (redeemed, revoked, cancelled, declined, timed out, or visitor
	 * left), how long it took to resolve, who it was offered to, and the conversation it belonged to.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the time range, ordering, and paging options for the search (required)
	 * @return ApiResponse&lt;QueueInteractionAnalyticsKpiDataResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<QueueInteractionAnalyticsKpiDataResult> analyticsDataSearchQueueInteractionWithHttpInfo(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		Object localVarPostBody = analyticsKpiDataQuery;

		// verify the required parameter 'analyticsKpiDataQuery' is set
		if (analyticsKpiDataQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsKpiDataQuery' when calling analyticsDataSearchQueueInteraction");
		}

		// create path and map variables
		String localVarPath = "/analytics/data/searchQueueInteraction";

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

		GenericType<QueueInteractionAnalyticsKpiDataResult> localVarReturnType = new GenericType<QueueInteractionAnalyticsKpiDataResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * searchWaitingTime &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns how long visitors waited for an agent, one entry per waiting period. &lt;p&gt;
	 * Each entry covers a single waiting period (while queued or while being forwarded): its duration, outcome, who the visitor was waiting for, and the
	 * conversation it belonged to. A conversation that waited several times produces several entries.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the time range, ordering, and paging options for the search (required)
	 * @return WaitingTimeAnalyticsKpiDataResult
	 * @throws ApiException if fails to make API call
	 */
	public WaitingTimeAnalyticsKpiDataResult analyticsDataSearchWaitingTime(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		return analyticsDataSearchWaitingTimeWithHttpInfo(analyticsKpiDataQuery).getData();
	}

	/**
	 * searchWaitingTime &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns how long visitors waited for an agent, one entry per waiting period. &lt;p&gt;
	 * Each entry covers a single waiting period (while queued or while being forwarded): its duration, outcome, who the visitor was waiting for, and the
	 * conversation it belonged to. A conversation that waited several times produces several entries.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the time range, ordering, and paging options for the search (required)
	 * @return ApiResponse&lt;WaitingTimeAnalyticsKpiDataResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WaitingTimeAnalyticsKpiDataResult> analyticsDataSearchWaitingTimeWithHttpInfo(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		Object localVarPostBody = analyticsKpiDataQuery;

		// verify the required parameter 'analyticsKpiDataQuery' is set
		if (analyticsKpiDataQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsKpiDataQuery' when calling analyticsDataSearchWaitingTime");
		}

		// create path and map variables
		String localVarPath = "/analytics/data/searchWaitingTime";

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

		GenericType<WaitingTimeAnalyticsKpiDataResult> localVarReturnType = new GenericType<WaitingTimeAnalyticsKpiDataResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
