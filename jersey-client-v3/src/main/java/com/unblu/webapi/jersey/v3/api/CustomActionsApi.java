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
import com.unblu.webapi.model.v3.CustomActionData;
import com.unblu.webapi.model.v3.CustomActionQuery;
import com.unblu.webapi.model.v3.CustomActionResult;
import com.unblu.webapi.model.v3.CustomActionsPingWebhookBody;

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
	public CustomActionData customActionsCreate(CustomActionData customActionData, String expand) throws ApiException {
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
	public ApiResponse<CustomActionData> customActionsCreateWithHttpInfo(CustomActionData customActionData, String expand) throws ApiException {
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

		GenericType<CustomActionData> localVarReturnType = new GenericType<CustomActionData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes a custom action. If there&#39;s a webhook registration connected to the action, the webhook is also deleted.&lt;br&gt;
	 * 
	 * @param id The ID of the custom action to delete (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void customActionsDelete(String id) throws ApiException {

		customActionsDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes a custom action. If there&#39;s a webhook registration connected to the action, the webhook is also deleted.&lt;br&gt;
	 * 
	 * @param id The ID of the custom action to delete (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> customActionsDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/customactions/delete";

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
	 * pingWebhook Emits a &#x60;WebhookPingEvent&#x60; on the webhook for the custom action&lt;br&gt;
	 * 
	 * @param customActionsPingWebhookBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void customActionsPingWebhook(CustomActionsPingWebhookBody customActionsPingWebhookBody) throws ApiException {

		customActionsPingWebhookWithHttpInfo(customActionsPingWebhookBody);
	}

	/**
	 * pingWebhook Emits a &#x60;WebhookPingEvent&#x60; on the webhook for the custom action&lt;br&gt;
	 * 
	 * @param customActionsPingWebhookBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> customActionsPingWebhookWithHttpInfo(CustomActionsPingWebhookBody customActionsPingWebhookBody) throws ApiException {
		Object localVarPostBody = customActionsPingWebhookBody;

		// verify the required parameter 'customActionsPingWebhookBody' is set
		if (customActionsPingWebhookBody == null) {
			throw new ApiException(400, "Missing the required parameter 'customActionsPingWebhookBody' when calling customActionsPingWebhook");
		}

		// create path and map variables
		String localVarPath = "/customactions/pingWebhook";

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
	 * read Returns a &#x60;CustomActionData&#x60; by ID&lt;br&gt;
	 * 
	 * @param id (optional)
	 * @param expand (optional)
	 * @return CustomActionData
	 * @throws ApiException if fails to make API call
	 */
	public CustomActionData customActionsRead(String id, String expand) throws ApiException {
		return customActionsReadWithHttpInfo(id, expand).getData();
	}

	/**
	 * read Returns a &#x60;CustomActionData&#x60; by ID&lt;br&gt;
	 * 
	 * @param id (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;CustomActionData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CustomActionData> customActionsReadWithHttpInfo(String id, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/customactions/read";

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
	 * update Updates a custom action. The parameter \&quot;actionIcon\&quot; may not be null.&lt;br&gt;
	 * 
	 * @param customActionData The custom action to update (required)
	 * @param expand (optional)
	 * @return CustomActionData
	 * @throws ApiException if fails to make API call
	 */
	public CustomActionData customActionsUpdate(CustomActionData customActionData, String expand) throws ApiException {
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
	public ApiResponse<CustomActionData> customActionsUpdateWithHttpInfo(CustomActionData customActionData, String expand) throws ApiException {
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

		GenericType<CustomActionData> localVarReturnType = new GenericType<CustomActionData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
