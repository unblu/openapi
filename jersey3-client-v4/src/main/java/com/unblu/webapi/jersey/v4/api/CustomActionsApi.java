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
import com.unblu.webapi.model.v4.CustomActionData;
import com.unblu.webapi.model.v4.CustomActionQuery;
import com.unblu.webapi.model.v4.CustomActionResult;
import com.unblu.webapi.model.v4.ExpandFields;
import com.unblu.webapi.model.v4.PingResponse;

import jakarta.ws.rs.core.GenericType;

public class CustomActionsApi {
	private ApiClient apiClient;

	public CustomActionsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public CustomActionsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates a new custom action. You must specify the expanded parameter \&quot;actionIcon\&quot;.&lt;br&gt;
	 * 
	 * @param customActionData The custom action to create (required)
	 * @param expand (optional)
	 * @return CustomActionData
	 * @throws ApiException if fails to make API call
	 */
	public CustomActionData customActionsCreate(CustomActionData customActionData, List<ExpandFields> expand) throws ApiException {
		return customActionsCreateWithHttpInfo(customActionData, expand).getData();
	}

	/**
	 * create Creates a new custom action. You must specify the expanded parameter \&quot;actionIcon\&quot;.&lt;br&gt;
	 * 
	 * @param customActionData The custom action to create (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;CustomActionData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CustomActionData> customActionsCreateWithHttpInfo(CustomActionData customActionData, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = customActionData;

		// verify the required parameter 'customActionData' is set
		if (customActionData == null) {
			throw new ApiException(400, "Missing the required parameter 'customActionData' when calling customActionsCreate");
		}

		// create path and map variables
		String localVarPath = "/customactions/create";

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

		GenericType<CustomActionData> localVarReturnType = new GenericType<CustomActionData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes a custom action. If there&#39;s a webhook registration connected to the action, the webhook is also deleted.&lt;br&gt;
	 * 
	 * @param customActionId (required)
	 * @throws ApiException if fails to make API call
	 */
	public void customActionsDelete(String customActionId) throws ApiException {

		customActionsDeleteWithHttpInfo(customActionId);
	}

	/**
	 * delete Deletes a custom action. If there&#39;s a webhook registration connected to the action, the webhook is also deleted.&lt;br&gt;
	 * 
	 * @param customActionId (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> customActionsDeleteWithHttpInfo(String customActionId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'customActionId' is set
		if (customActionId == null) {
			throw new ApiException(400, "Missing the required parameter 'customActionId' when calling customActionsDelete");
		}

		// create path and map variables
		String localVarPath = "/customactions/{customActionId}/delete"
				.replaceAll("\\{" + "customActionId" + "\\}", apiClient.escapeString(customActionId.toString()));

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
	 * read Returns a &#x60;CustomActionData&#x60; by ID&lt;br&gt;
	 * 
	 * @param customActionId (required)
	 * @param expand (optional)
	 * @return CustomActionData
	 * @throws ApiException if fails to make API call
	 */
	public CustomActionData customActionsRead(String customActionId, List<ExpandFields> expand) throws ApiException {
		return customActionsReadWithHttpInfo(customActionId, expand).getData();
	}

	/**
	 * read Returns a &#x60;CustomActionData&#x60; by ID&lt;br&gt;
	 * 
	 * @param customActionId (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;CustomActionData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CustomActionData> customActionsReadWithHttpInfo(String customActionId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'customActionId' is set
		if (customActionId == null) {
			throw new ApiException(400, "Missing the required parameter 'customActionId' when calling customActionsRead");
		}

		// create path and map variables
		String localVarPath = "/customactions/{customActionId}/read"
				.replaceAll("\\{" + "customActionId" + "\\}", apiClient.escapeString(customActionId.toString()));

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

		GenericType<CustomActionData> localVarReturnType = new GenericType<CustomActionData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for custom actions&lt;br&gt;
	 * 
	 * @param customActionQuery The query to use for the search (required)
	 * @return CustomActionResult
	 * @throws ApiException if fails to make API call
	 */
	public CustomActionResult customActionsSearch(CustomActionQuery customActionQuery) throws ApiException {
		return customActionsSearchWithHttpInfo(customActionQuery).getData();
	}

	/**
	 * search Search for custom actions&lt;br&gt;
	 * 
	 * @param customActionQuery The query to use for the search (required)
	 * @return ApiResponse&lt;CustomActionResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CustomActionResult> customActionsSearchWithHttpInfo(CustomActionQuery customActionQuery) throws ApiException {
		Object localVarPostBody = customActionQuery;

		// verify the required parameter 'customActionQuery' is set
		if (customActionQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'customActionQuery' when calling customActionsSearch");
		}

		// create path and map variables
		String localVarPath = "/customactions/search";

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

		GenericType<CustomActionResult> localVarReturnType = new GenericType<CustomActionResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * sendPing Emits a &#x60;WebhookPingEvent&#x60; or &#x60;PingRequest&#x60; on the configured webhook/outbound endpoint for the custom action.&lt;br&gt;
	 * 
	 * @param customActionId The ID of the custom action (required)
	 * @return PingResponse
	 * @throws ApiException if fails to make API call
	 */
	public PingResponse customActionsSendPing(String customActionId) throws ApiException {
		return customActionsSendPingWithHttpInfo(customActionId).getData();
	}

	/**
	 * sendPing Emits a &#x60;WebhookPingEvent&#x60; or &#x60;PingRequest&#x60; on the configured webhook/outbound endpoint for the custom action.&lt;br&gt;
	 * 
	 * @param customActionId The ID of the custom action (required)
	 * @return ApiResponse&lt;PingResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PingResponse> customActionsSendPingWithHttpInfo(String customActionId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'customActionId' is set
		if (customActionId == null) {
			throw new ApiException(400, "Missing the required parameter 'customActionId' when calling customActionsSendPing");
		}

		// create path and map variables
		String localVarPath = "/customactions/{customActionId}/sendPing"
				.replaceAll("\\{" + "customActionId" + "\\}", apiClient.escapeString(customActionId.toString()));

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
	 * update Updates a custom action. The parameter \&quot;actionIcon\&quot; may not be null.&lt;br&gt;
	 * 
	 * @param customActionData The custom action to update (required)
	 * @param expand (optional)
	 * @return CustomActionData
	 * @throws ApiException if fails to make API call
	 */
	public CustomActionData customActionsUpdate(CustomActionData customActionData, List<ExpandFields> expand) throws ApiException {
		return customActionsUpdateWithHttpInfo(customActionData, expand).getData();
	}

	/**
	 * update Updates a custom action. The parameter \&quot;actionIcon\&quot; may not be null.&lt;br&gt;
	 * 
	 * @param customActionData The custom action to update (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;CustomActionData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CustomActionData> customActionsUpdateWithHttpInfo(CustomActionData customActionData, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = customActionData;

		// verify the required parameter 'customActionData' is set
		if (customActionData == null) {
			throw new ApiException(400, "Missing the required parameter 'customActionData' when calling customActionsUpdate");
		}

		// create path and map variables
		String localVarPath = "/customactions/update";

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

		GenericType<CustomActionData> localVarReturnType = new GenericType<CustomActionData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
