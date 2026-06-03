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
import com.unblu.webapi.model.v4.AnalyticsKpiDataQuery;
import com.unblu.webapi.model.v4.CallsAnalyticsKpiDataResult;
import com.unblu.webapi.model.v4.CollaborationLayersAnalyticsKpiDataResult;
import com.unblu.webapi.model.v4.ConversationsEndedAnalyticsKpiDataResult;
import com.unblu.webapi.model.v4.HandlingTimeAnalyticsKpiDataResult;
import com.unblu.webapi.model.v4.MessagesAnalyticsKpiDataResult;
import com.unblu.webapi.model.v4.QueueInteractionAnalyticsKpiDataResult;
import com.unblu.webapi.model.v4.WaitingTimeAnalyticsKpiDataResult;

import jakarta.ws.rs.core.GenericType;

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
	 * searchCalls &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for individual call KPI records. &lt;p&gt; Returns data from the gold_calls view,
	 * with one entry per ended call. Each entry includes call timing, participants, service provider, end reason, and the parent conversation details.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the query defining time range filter, ordering, and pagination (required)
	 * @return CallsAnalyticsKpiDataResult
	 * @throws ApiException if fails to make API call
	 */
	public CallsAnalyticsKpiDataResult analyticsDataSearchCalls(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		return analyticsDataSearchCallsWithHttpInfo(analyticsKpiDataQuery).getData();
	}

	/**
	 * searchCalls &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for individual call KPI records. &lt;p&gt; Returns data from the gold_calls view,
	 * with one entry per ended call. Each entry includes call timing, participants, service provider, end reason, and the parent conversation details.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the query defining time range filter, ordering, and pagination (required)
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
	 * searchCollaborationLayers &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for individual collaboration layer KPI records. &lt;p&gt; Returns data
	 * from the gold_collaboration_layers view, with one entry per stopped or aborted collaboration layer. Each entry includes layer type, duration, start/stop
	 * persons, and the parent conversation details.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the query defining time range filter, ordering, and pagination (required)
	 * @return CollaborationLayersAnalyticsKpiDataResult
	 * @throws ApiException if fails to make API call
	 */
	public CollaborationLayersAnalyticsKpiDataResult analyticsDataSearchCollaborationLayers(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		return analyticsDataSearchCollaborationLayersWithHttpInfo(analyticsKpiDataQuery).getData();
	}

	/**
	 * searchCollaborationLayers &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for individual collaboration layer KPI records. &lt;p&gt; Returns data
	 * from the gold_collaboration_layers view, with one entry per stopped or aborted collaboration layer. Each entry includes layer type, duration, start/stop
	 * persons, and the parent conversation details.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the query defining time range filter, ordering, and pagination (required)
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
	 * searchConversationsEnded &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for individual conversation-ended KPI records. &lt;p&gt; Returns data
	 * from the gold_conversations_ended view, with one entry per ended conversation. Each entry includes lifecycle timestamps (creation, onboarding, queued,
	 * active, offboarding, end), end reason, conversation details, and aggregate metrics (message counts, call counts, collaboration layer counts and
	 * durations).&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the query defining time range filter, ordering, and pagination (required)
	 * @return ConversationsEndedAnalyticsKpiDataResult
	 * @throws ApiException if fails to make API call
	 */
	public ConversationsEndedAnalyticsKpiDataResult analyticsDataSearchConversationsEnded(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		return analyticsDataSearchConversationsEndedWithHttpInfo(analyticsKpiDataQuery).getData();
	}

	/**
	 * searchConversationsEnded &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for individual conversation-ended KPI records. &lt;p&gt; Returns data
	 * from the gold_conversations_ended view, with one entry per ended conversation. Each entry includes lifecycle timestamps (creation, onboarding, queued,
	 * active, offboarding, end), end reason, conversation details, and aggregate metrics (message counts, call counts, collaboration layer counts and
	 * durations).&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the query defining time range filter, ordering, and pagination (required)
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
	 * searchHandlingTime &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for individual handling time KPI records. &lt;p&gt; Returns data from the
	 * gold_handling_time view, with one entry per agent handling time period. Each entry includes the handling time duration, resolution type, and the parent
	 * conversation details with metrics collected during the handling period.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the query defining time range filter, ordering, and pagination (required)
	 * @return HandlingTimeAnalyticsKpiDataResult
	 * @throws ApiException if fails to make API call
	 */
	public HandlingTimeAnalyticsKpiDataResult analyticsDataSearchHandlingTime(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		return analyticsDataSearchHandlingTimeWithHttpInfo(analyticsKpiDataQuery).getData();
	}

	/**
	 * searchHandlingTime &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for individual handling time KPI records. &lt;p&gt; Returns data from the
	 * gold_handling_time view, with one entry per agent handling time period. Each entry includes the handling time duration, resolution type, and the parent
	 * conversation details with metrics collected during the handling period.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the query defining time range filter, ordering, and pagination (required)
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
	 * searchMessages &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for individual message KPI records. &lt;p&gt; Returns data from the gold_messages
	 * view, with one entry per message. Each entry includes the sender, message type, character count, timestamps, and the parent conversation details.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the query defining time range filter, ordering, and pagination (required)
	 * @return MessagesAnalyticsKpiDataResult
	 * @throws ApiException if fails to make API call
	 */
	public MessagesAnalyticsKpiDataResult analyticsDataSearchMessages(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		return analyticsDataSearchMessagesWithHttpInfo(analyticsKpiDataQuery).getData();
	}

	/**
	 * searchMessages &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for individual message KPI records. &lt;p&gt; Returns data from the gold_messages
	 * view, with one entry per message. Each entry includes the sender, message type, character count, timestamps, and the parent conversation details.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the query defining time range filter, ordering, and pagination (required)
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
	 * searchQueueInteraction &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for individual queue interaction KPI records. &lt;p&gt; Returns data from
	 * the gold_queue_interaction view, with one entry per resolved invitation or reservation (redeemed, revoked, declined, or timed out). Each entry includes the
	 * reservation/invitation creation timestamps, the resolution timestamp, the response duration, the resolution type, the invitation target, and the parent
	 * conversation details.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the query defining time range filter, ordering, and pagination (required)
	 * @return QueueInteractionAnalyticsKpiDataResult
	 * @throws ApiException if fails to make API call
	 */
	public QueueInteractionAnalyticsKpiDataResult analyticsDataSearchQueueInteraction(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		return analyticsDataSearchQueueInteractionWithHttpInfo(analyticsKpiDataQuery).getData();
	}

	/**
	 * searchQueueInteraction &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for individual queue interaction KPI records. &lt;p&gt; Returns data from
	 * the gold_queue_interaction view, with one entry per resolved invitation or reservation (redeemed, revoked, declined, or timed out). Each entry includes the
	 * reservation/invitation creation timestamps, the resolution timestamp, the response duration, the resolution type, the invitation target, and the parent
	 * conversation details.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the query defining time range filter, ordering, and pagination (required)
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
	 * searchWaitingTime &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for individual waiting time KPI records. &lt;p&gt; Returns data from the
	 * gold_waiting_time view, with one entry per waiting time period (assignment request or agent forwarding). Each entry includes the waiting time duration,
	 * outcome, type, target recipient, and the parent conversation details.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the query defining time range filter, ordering, and pagination (required)
	 * @return WaitingTimeAnalyticsKpiDataResult
	 * @throws ApiException if fails to make API call
	 */
	public WaitingTimeAnalyticsKpiDataResult analyticsDataSearchWaitingTime(AnalyticsKpiDataQuery analyticsKpiDataQuery) throws ApiException {
		return analyticsDataSearchWaitingTimeWithHttpInfo(analyticsKpiDataQuery).getData();
	}

	/**
	 * searchWaitingTime &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for individual waiting time KPI records. &lt;p&gt; Returns data from the
	 * gold_waiting_time view, with one entry per waiting time period (assignment request or agent forwarding). Each entry includes the waiting time duration,
	 * outcome, type, target recipient, and the parent conversation details.&lt;br&gt;
	 * 
	 * @param analyticsKpiDataQuery the query defining time range filter, ordering, and pagination (required)
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
