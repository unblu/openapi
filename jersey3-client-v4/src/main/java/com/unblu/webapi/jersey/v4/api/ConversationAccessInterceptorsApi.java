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
import com.unblu.webapi.model.v4.ConversationAccessInterceptorData;
import com.unblu.webapi.model.v4.ConversationAccessInterceptorQuery;
import com.unblu.webapi.model.v4.ConversationAccessInterceptorResult;
import com.unblu.webapi.model.v4.PingResponse;

import jakarta.ws.rs.core.GenericType;

public class ConversationAccessInterceptorsApi {
	private ApiClient apiClient;

	public ConversationAccessInterceptorsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ConversationAccessInterceptorsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates a new conversation access interceptor&lt;br&gt;
	 * 
	 * @param conversationAccessInterceptorData (required)
	 * @return ConversationAccessInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationAccessInterceptorData conversationAccessInterceptorsCreate(ConversationAccessInterceptorData conversationAccessInterceptorData) throws ApiException {
		return conversationAccessInterceptorsCreateWithHttpInfo(conversationAccessInterceptorData).getData();
	}

	/**
	 * create Creates a new conversation access interceptor&lt;br&gt;
	 * 
	 * @param conversationAccessInterceptorData (required)
	 * @return ApiResponse&lt;ConversationAccessInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationAccessInterceptorData> conversationAccessInterceptorsCreateWithHttpInfo(ConversationAccessInterceptorData conversationAccessInterceptorData) throws ApiException {
		Object localVarPostBody = conversationAccessInterceptorData;

		// verify the required parameter 'conversationAccessInterceptorData' is set
		if (conversationAccessInterceptorData == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationAccessInterceptorData' when calling conversationAccessInterceptorsCreate");
		}

		// create path and map variables
		String localVarPath = "/conversationaccessinterceptors/create";

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

		GenericType<ConversationAccessInterceptorData> localVarReturnType = new GenericType<ConversationAccessInterceptorData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes an existing conversation access interceptor. If the interceptor to be deleted can&#39;t be found, the HTTP status code 204 is
	 * returned.&lt;br&gt;
	 * 
	 * @param interceptorId The ID of the conversation access interceptor which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void conversationAccessInterceptorsDelete(String interceptorId) throws ApiException {

		conversationAccessInterceptorsDeleteWithHttpInfo(interceptorId);
	}

	/**
	 * delete Deletes an existing conversation access interceptor. If the interceptor to be deleted can&#39;t be found, the HTTP status code 204 is
	 * returned.&lt;br&gt;
	 * 
	 * @param interceptorId The ID of the conversation access interceptor which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> conversationAccessInterceptorsDeleteWithHttpInfo(String interceptorId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'interceptorId' is set
		if (interceptorId == null) {
			throw new ApiException(400, "Missing the required parameter 'interceptorId' when calling conversationAccessInterceptorsDelete");
		}

		// create path and map variables
		String localVarPath = "/conversationaccessinterceptors/{interceptorId}/delete"
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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * getByName Searches for a conversation access interceptor with the given name&lt;br&gt;
	 * 
	 * @param name The name of the conversation access interceptor (optional)
	 * @return ConversationAccessInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationAccessInterceptorData conversationAccessInterceptorsGetByName(String name) throws ApiException {
		return conversationAccessInterceptorsGetByNameWithHttpInfo(name).getData();
	}

	/**
	 * getByName Searches for a conversation access interceptor with the given name&lt;br&gt;
	 * 
	 * @param name The name of the conversation access interceptor (optional)
	 * @return ApiResponse&lt;ConversationAccessInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationAccessInterceptorData> conversationAccessInterceptorsGetByNameWithHttpInfo(String name) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/conversationaccessinterceptors/getByName";

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<ConversationAccessInterceptorData> localVarReturnType = new GenericType<ConversationAccessInterceptorData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Reads an existing conversation access interceptor&lt;br&gt;
	 * 
	 * @param interceptorId The ID of the conversation access interceptor to read (required)
	 * @return ConversationAccessInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationAccessInterceptorData conversationAccessInterceptorsRead(String interceptorId) throws ApiException {
		return conversationAccessInterceptorsReadWithHttpInfo(interceptorId).getData();
	}

	/**
	 * read Reads an existing conversation access interceptor&lt;br&gt;
	 * 
	 * @param interceptorId The ID of the conversation access interceptor to read (required)
	 * @return ApiResponse&lt;ConversationAccessInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationAccessInterceptorData> conversationAccessInterceptorsReadWithHttpInfo(String interceptorId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'interceptorId' is set
		if (interceptorId == null) {
			throw new ApiException(400, "Missing the required parameter 'interceptorId' when calling conversationAccessInterceptorsRead");
		}

		// create path and map variables
		String localVarPath = "/conversationaccessinterceptors/{interceptorId}/read"
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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<ConversationAccessInterceptorData> localVarReturnType = new GenericType<ConversationAccessInterceptorData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Searches for conversation access interceptor in the current account&lt;br&gt;
	 * 
	 * @param conversationAccessInterceptorQuery (required)
	 * @return ConversationAccessInterceptorResult
	 * @throws ApiException if fails to make API call
	 */
	public ConversationAccessInterceptorResult conversationAccessInterceptorsSearch(ConversationAccessInterceptorQuery conversationAccessInterceptorQuery) throws ApiException {
		return conversationAccessInterceptorsSearchWithHttpInfo(conversationAccessInterceptorQuery).getData();
	}

	/**
	 * search Searches for conversation access interceptor in the current account&lt;br&gt;
	 * 
	 * @param conversationAccessInterceptorQuery (required)
	 * @return ApiResponse&lt;ConversationAccessInterceptorResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationAccessInterceptorResult> conversationAccessInterceptorsSearchWithHttpInfo(ConversationAccessInterceptorQuery conversationAccessInterceptorQuery) throws ApiException {
		Object localVarPostBody = conversationAccessInterceptorQuery;

		// verify the required parameter 'conversationAccessInterceptorQuery' is set
		if (conversationAccessInterceptorQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationAccessInterceptorQuery' when calling conversationAccessInterceptorsSearch");
		}

		// create path and map variables
		String localVarPath = "/conversationaccessinterceptors/search";

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

		GenericType<ConversationAccessInterceptorResult> localVarReturnType = new GenericType<ConversationAccessInterceptorResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * sendPing Emits a &#x60;PingRequest&#x60; on the configured outbound endpoint for the conversation access interceptor. &lt;p&gt;&lt;br&gt;
	 * 
	 * @param interceptorId The ID of a conversation access interceptor (required)
	 * @return PingResponse
	 * @throws ApiException if fails to make API call
	 */
	public PingResponse conversationAccessInterceptorsSendPing(String interceptorId) throws ApiException {
		return conversationAccessInterceptorsSendPingWithHttpInfo(interceptorId).getData();
	}

	/**
	 * sendPing Emits a &#x60;PingRequest&#x60; on the configured outbound endpoint for the conversation access interceptor. &lt;p&gt;&lt;br&gt;
	 * 
	 * @param interceptorId The ID of a conversation access interceptor (required)
	 * @return ApiResponse&lt;PingResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PingResponse> conversationAccessInterceptorsSendPingWithHttpInfo(String interceptorId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'interceptorId' is set
		if (interceptorId == null) {
			throw new ApiException(400, "Missing the required parameter 'interceptorId' when calling conversationAccessInterceptorsSendPing");
		}

		// create path and map variables
		String localVarPath = "/conversationaccessinterceptors/{interceptorId}/sendPing"
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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<PingResponse> localVarReturnType = new GenericType<PingResponse>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates an existing conversation access interceptor&lt;br&gt;
	 * 
	 * @param conversationAccessInterceptorData The conversation access interceptor to update (required)
	 * @return ConversationAccessInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public ConversationAccessInterceptorData conversationAccessInterceptorsUpdate(ConversationAccessInterceptorData conversationAccessInterceptorData) throws ApiException {
		return conversationAccessInterceptorsUpdateWithHttpInfo(conversationAccessInterceptorData).getData();
	}

	/**
	 * update Updates an existing conversation access interceptor&lt;br&gt;
	 * 
	 * @param conversationAccessInterceptorData The conversation access interceptor to update (required)
	 * @return ApiResponse&lt;ConversationAccessInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ConversationAccessInterceptorData> conversationAccessInterceptorsUpdateWithHttpInfo(ConversationAccessInterceptorData conversationAccessInterceptorData) throws ApiException {
		Object localVarPostBody = conversationAccessInterceptorData;

		// verify the required parameter 'conversationAccessInterceptorData' is set
		if (conversationAccessInterceptorData == null) {
			throw new ApiException(400, "Missing the required parameter 'conversationAccessInterceptorData' when calling conversationAccessInterceptorsUpdate");
		}

		// create path and map variables
		String localVarPath = "/conversationaccessinterceptors/update";

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

		GenericType<ConversationAccessInterceptorData> localVarReturnType = new GenericType<ConversationAccessInterceptorData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
