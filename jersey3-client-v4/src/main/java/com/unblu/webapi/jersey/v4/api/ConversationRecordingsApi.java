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
import com.unblu.webapi.model.v4.ConversationRecordingData;
import com.unblu.webapi.model.v4.ConversationRecordingQuery;
import com.unblu.webapi.model.v4.ConversationRecordingResult;
import com.unblu.webapi.model.v4.ConversationRecordingState;
import com.unblu.webapi.model.v4.ConversationRecordingsGetRecordingStateBody;
import com.unblu.webapi.model.v4.ConversationRecordingsStartBody;
import com.unblu.webapi.model.v4.ConversationRecordingsStopBody;

import jakarta.ws.rs.core.GenericType;

public class ConversationRecordingsApi {
	private ApiClient apiClient;

	public ConversationRecordingsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ConversationRecordingsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * getRecordingState Returns the current recording state of the conversation&lt;br&gt;
	 * 
	 * @param conversationRecordingsGetRecordingStateBody (required)
	 * @return ConversationRecordingState
	 * @throws ApiException if fails to make API call
	 */
	public ConversationRecordingState conversationRecordingsGetRecordingState(ConversationRecordingsGetRecordingStateBody conversationRecordingsGetRecordingStateBody) throws ApiException {
		return conversationRecordingsGetRecordingStateWithHttpInfo(conversationRecordingsGetRecordingStateBody).getData();
	}

	/**
	 * getRecordingState Returns the current recording state of the conversation&lt;br&gt;
	 * 
	 * @param conversationRecordingsGetRecordingStateBody (required)
	 * @return ApiResponse&lt;ConversationRecordingState&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationRecordingState> conversationRecordingsGetRecordingStateWithHttpInfo(ConversationRecordingsGetRecordingStateBody conversationRecordingsGetRecordingStateBody) throws ApiException {
		Object localVarPostBody = conversationRecordingsGetRecordingStateBody;

		// verify the required parameter 'conversationRecordingsGetRecordingStateBody' is set
		if (conversationRecordingsGetRecordingStateBody == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationRecordingsGetRecordingStateBody' when calling conversationRecordingsGetRecordingState");
		}

		// create path and map variables
		String localVarPath = "/conversationrecordings/getRecordingState";

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

		GenericType<ConversationRecordingState> localVarReturnType = new GenericType<ConversationRecordingState>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the recording with the given ID&lt;br&gt;
	 * 
	 * @param conversationRecordingId ID of the recording to return (required)
	 * @return ConversationRecordingData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationRecordingData conversationRecordingsRead(String conversationRecordingId) throws ApiException {
		return conversationRecordingsReadWithHttpInfo(conversationRecordingId).getData();
	}

	/**
	 * read Returns the recording with the given ID&lt;br&gt;
	 * 
	 * @param conversationRecordingId ID of the recording to return (required)
	 * @return ApiResponse&lt;ConversationRecordingData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationRecordingData> conversationRecordingsReadWithHttpInfo(String conversationRecordingId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'conversationRecordingId' is set
		if (conversationRecordingId == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationRecordingId' when calling conversationRecordingsRead");
		}

		// create path and map variables
		String localVarPath = "/conversationrecordings/{conversationRecordingId}/read"
				.replaceAll("\\{" + "conversationRecordingId" + "\\}", apiClient.escapeString(conversationRecordingId.toString()));

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<ConversationRecordingData> localVarReturnType = new GenericType<ConversationRecordingData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Searches the recordings of the current account. Without an order, the results are sorted by start timestamp, oldest first.&lt;br&gt;
	 * 
	 * @param conversationRecordingQuery the search query (required)
	 * @return ConversationRecordingResult
	 * @throws ApiException if fails to make API call
	 */
	public ConversationRecordingResult conversationRecordingsSearch(ConversationRecordingQuery conversationRecordingQuery) throws ApiException {
		return conversationRecordingsSearchWithHttpInfo(conversationRecordingQuery).getData();
	}

	/**
	 * search Searches the recordings of the current account. Without an order, the results are sorted by start timestamp, oldest first.&lt;br&gt;
	 * 
	 * @param conversationRecordingQuery the search query (required)
	 * @return ApiResponse&lt;ConversationRecordingResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationRecordingResult> conversationRecordingsSearchWithHttpInfo(ConversationRecordingQuery conversationRecordingQuery) throws ApiException {
		Object localVarPostBody = conversationRecordingQuery;

		// verify the required parameter 'conversationRecordingQuery' is set
		if (conversationRecordingQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationRecordingQuery' when calling conversationRecordingsSearch");
		}

		// create path and map variables
		String localVarPath = "/conversationrecordings/search";

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

		GenericType<ConversationRecordingResult> localVarReturnType = new GenericType<ConversationRecordingResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * start Manually starts a recording of the conversation, in the recording system configured for it. The recording is only started if: &lt;ul&gt;
	 * &lt;li&gt;Manually starting and stopping a recording is allowed &lt;li&gt;There is an active call or, for a built-in conversation recording, an active
	 * collaboration layer &lt;li&gt;There isn&#39;t already a conversation recording running &lt;li&gt;For a built-in conversation recording, a compatible blob
	 * store is configured &lt;/ul&gt; The recording is started asynchronously, and there may be a brief delay before it starts. The type of the recording (audio
	 * only or audio and video) is determined by the configuration. If an error occurs, a &lt;code&gt;conversation.recording_failed&lt;/code&gt; webhook is
	 * triggered.&lt;br&gt;
	 * 
	 * @param conversationRecordingsStartBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void conversationRecordingsStart(ConversationRecordingsStartBody conversationRecordingsStartBody) throws ApiException {

		conversationRecordingsStartWithHttpInfo(conversationRecordingsStartBody);
	}

	/**
	 * start Manually starts a recording of the conversation, in the recording system configured for it. The recording is only started if: &lt;ul&gt;
	 * &lt;li&gt;Manually starting and stopping a recording is allowed &lt;li&gt;There is an active call or, for a built-in conversation recording, an active
	 * collaboration layer &lt;li&gt;There isn&#39;t already a conversation recording running &lt;li&gt;For a built-in conversation recording, a compatible blob
	 * store is configured &lt;/ul&gt; The recording is started asynchronously, and there may be a brief delay before it starts. The type of the recording (audio
	 * only or audio and video) is determined by the configuration. If an error occurs, a &lt;code&gt;conversation.recording_failed&lt;/code&gt; webhook is
	 * triggered.&lt;br&gt;
	 * 
	 * @param conversationRecordingsStartBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> conversationRecordingsStartWithHttpInfo(ConversationRecordingsStartBody conversationRecordingsStartBody) throws ApiException {
		Object localVarPostBody = conversationRecordingsStartBody;

		// verify the required parameter 'conversationRecordingsStartBody' is set
		if (conversationRecordingsStartBody == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationRecordingsStartBody' when calling conversationRecordingsStart");
		}

		// create path and map variables
		String localVarPath = "/conversationrecordings/start";

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * stop Manually stops the running recording of the conversation. The recording is stopped if: &lt;ul&gt; &lt;li&gt;There is a running conversation recording
	 * &lt;li&gt;Manually starting and stopping the recording is allowed &lt;/ul&gt;&lt;br&gt;
	 * 
	 * @param conversationRecordingsStopBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void conversationRecordingsStop(ConversationRecordingsStopBody conversationRecordingsStopBody) throws ApiException {

		conversationRecordingsStopWithHttpInfo(conversationRecordingsStopBody);
	}

	/**
	 * stop Manually stops the running recording of the conversation. The recording is stopped if: &lt;ul&gt; &lt;li&gt;There is a running conversation recording
	 * &lt;li&gt;Manually starting and stopping the recording is allowed &lt;/ul&gt;&lt;br&gt;
	 * 
	 * @param conversationRecordingsStopBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> conversationRecordingsStopWithHttpInfo(ConversationRecordingsStopBody conversationRecordingsStopBody) throws ApiException {
		Object localVarPostBody = conversationRecordingsStopBody;

		// verify the required parameter 'conversationRecordingsStopBody' is set
		if (conversationRecordingsStopBody == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationRecordingsStopBody' when calling conversationRecordingsStop");
		}

		// create path and map variables
		String localVarPath = "/conversationrecordings/stop";

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}
}
