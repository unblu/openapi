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
import com.unblu.webapi.model.v4.AnalyticsWidgetData;
import com.unblu.webapi.model.v4.AnalyticsWidgetList;
import com.unblu.webapi.model.v4.AnalyticsWidgetQuery;
import com.unblu.webapi.model.v4.AnalyticsWidgetResult;

import jakarta.ws.rs.core.GenericType;

public class AnalyticsWidgetsApi {
	private ApiClient apiClient;

	public AnalyticsWidgetsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AnalyticsWidgetsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates the specified analytics widget. The widget&#39;s ID is generated automatically, therefore
	 * any ID provided in the analytics widget entity is ignored.&lt;br&gt;
	 * 
	 * @param analyticsWidgetData The analytics widget to create. (required)
	 * @return AnalyticsWidgetData
	 * @throws ApiException if fails to make API call
	 */
	public AnalyticsWidgetData analyticsWidgetsCreate(AnalyticsWidgetData analyticsWidgetData) throws ApiException {
		return analyticsWidgetsCreateWithHttpInfo(analyticsWidgetData).getData();
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates the specified analytics widget. The widget&#39;s ID is generated automatically, therefore
	 * any ID provided in the analytics widget entity is ignored.&lt;br&gt;
	 * 
	 * @param analyticsWidgetData The analytics widget to create. (required)
	 * @return ApiResponse&lt;AnalyticsWidgetData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AnalyticsWidgetData> analyticsWidgetsCreateWithHttpInfo(AnalyticsWidgetData analyticsWidgetData) throws ApiException {
		Object localVarPostBody = analyticsWidgetData;

		// verify the required parameter 'analyticsWidgetData' is set
		if (analyticsWidgetData == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsWidgetData' when calling analyticsWidgetsCreate");
		}

		// create path and map variables
		String localVarPath = "/analytics/widgets/create";

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

		GenericType<AnalyticsWidgetData> localVarReturnType = new GenericType<AnalyticsWidgetData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes the analytics widget with the specified ID.&lt;br&gt;
	 * 
	 * @param id The ID of the analytics widget to delete. (required)
	 * @throws ApiException if fails to make API call
	 */
	public void analyticsWidgetsDelete(String id) throws ApiException {

		analyticsWidgetsDeleteWithHttpInfo(id);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes the analytics widget with the specified ID.&lt;br&gt;
	 * 
	 * @param id The ID of the analytics widget to delete. (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> analyticsWidgetsDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling analyticsWidgetsDelete");
		}

		// create path and map variables
		String localVarPath = "/analytics/widgets/{id}/delete"
				.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the analytics widget with the specified ID.&lt;br&gt;
	 * 
	 * @param id The ID of the analytics widget to return. (required)
	 * @return AnalyticsWidgetData
	 * @throws ApiException if fails to make API call
	 */
	public AnalyticsWidgetData analyticsWidgetsRead(String id) throws ApiException {
		return analyticsWidgetsReadWithHttpInfo(id).getData();
	}

	/**
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the analytics widget with the specified ID.&lt;br&gt;
	 * 
	 * @param id The ID of the analytics widget to return. (required)
	 * @return ApiResponse&lt;AnalyticsWidgetData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AnalyticsWidgetData> analyticsWidgetsReadWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException(400, "Missing the required parameter 'id' when calling analyticsWidgetsRead");
		}

		// create path and map variables
		String localVarPath = "/analytics/widgets/{id}/read"
				.replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

		GenericType<AnalyticsWidgetData> localVarReturnType = new GenericType<AnalyticsWidgetData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns multiple analytics widgets matching the specified IDs.&lt;br&gt;
	 * 
	 * @param requestBody The list of IDs of the analytics widgets to return. (required)
	 * @return AnalyticsWidgetList
	 * @throws ApiException if fails to make API call
	 */
	public AnalyticsWidgetList analyticsWidgetsReadMultiple(List<String> requestBody) throws ApiException {
		return analyticsWidgetsReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns multiple analytics widgets matching the specified IDs.&lt;br&gt;
	 * 
	 * @param requestBody The list of IDs of the analytics widgets to return. (required)
	 * @return ApiResponse&lt;AnalyticsWidgetList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AnalyticsWidgetList> analyticsWidgetsReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling analyticsWidgetsReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/analytics/widgets/readMultiple";

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

		GenericType<AnalyticsWidgetList> localVarReturnType = new GenericType<AnalyticsWidgetList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for analytics widgets matching the specified query.&lt;br&gt;
	 * 
	 * @param analyticsWidgetQuery The query used for the search. (required)
	 * @return AnalyticsWidgetResult
	 * @throws ApiException if fails to make API call
	 */
	public AnalyticsWidgetResult analyticsWidgetsSearch(AnalyticsWidgetQuery analyticsWidgetQuery) throws ApiException {
		return analyticsWidgetsSearchWithHttpInfo(analyticsWidgetQuery).getData();
	}

	/**
	 * search &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for analytics widgets matching the specified query.&lt;br&gt;
	 * 
	 * @param analyticsWidgetQuery The query used for the search. (required)
	 * @return ApiResponse&lt;AnalyticsWidgetResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AnalyticsWidgetResult> analyticsWidgetsSearchWithHttpInfo(AnalyticsWidgetQuery analyticsWidgetQuery) throws ApiException {
		Object localVarPostBody = analyticsWidgetQuery;

		// verify the required parameter 'analyticsWidgetQuery' is set
		if (analyticsWidgetQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsWidgetQuery' when calling analyticsWidgetsSearch");
		}

		// create path and map variables
		String localVarPath = "/analytics/widgets/search";

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

		GenericType<AnalyticsWidgetResult> localVarReturnType = new GenericType<AnalyticsWidgetResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates the analytics widget in the system with the provided entity. The update fails if no
	 * analytics widget exists with the specified ID.&lt;br&gt;
	 * 
	 * @param analyticsWidgetData The details to update the analytics widget with. (required)
	 * @return AnalyticsWidgetData
	 * @throws ApiException if fails to make API call
	 */
	public AnalyticsWidgetData analyticsWidgetsUpdate(AnalyticsWidgetData analyticsWidgetData) throws ApiException {
		return analyticsWidgetsUpdateWithHttpInfo(analyticsWidgetData).getData();
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates the analytics widget in the system with the provided entity. The update fails if no
	 * analytics widget exists with the specified ID.&lt;br&gt;
	 * 
	 * @param analyticsWidgetData The details to update the analytics widget with. (required)
	 * @return ApiResponse&lt;AnalyticsWidgetData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AnalyticsWidgetData> analyticsWidgetsUpdateWithHttpInfo(AnalyticsWidgetData analyticsWidgetData) throws ApiException {
		Object localVarPostBody = analyticsWidgetData;

		// verify the required parameter 'analyticsWidgetData' is set
		if (analyticsWidgetData == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsWidgetData' when calling analyticsWidgetsUpdate");
		}

		// create path and map variables
		String localVarPath = "/analytics/widgets/update";

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

		GenericType<AnalyticsWidgetData> localVarReturnType = new GenericType<AnalyticsWidgetData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
