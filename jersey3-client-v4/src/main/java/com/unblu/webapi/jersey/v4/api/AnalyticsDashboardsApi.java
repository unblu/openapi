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
import com.unblu.webapi.model.v4.AnalyticsDashboard;
import com.unblu.webapi.model.v4.AnalyticsDashboardFromTemplateRequest;
import com.unblu.webapi.model.v4.AnalyticsDashboardQuery;
import com.unblu.webapi.model.v4.AnalyticsDashboardResult;

import jakarta.ws.rs.core.GenericType;

public class AnalyticsDashboardsApi {
	private ApiClient apiClient;

	public AnalyticsDashboardsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AnalyticsDashboardsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates the specified analytics dashboard. The dashboard&#39;s ID is generated automatically,
	 * therefore any ID provided in the analytics dashboard entity is ignored.&lt;br&gt;
	 * 
	 * @param analyticsDashboard The analytics dashboard to create. (required)
	 * @return AnalyticsDashboard
	 * @throws ApiException if fails to make API call
	 */
	public AnalyticsDashboard analyticsDashboardsCreate(AnalyticsDashboard analyticsDashboard) throws ApiException {
		return analyticsDashboardsCreateWithHttpInfo(analyticsDashboard).getData();
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates the specified analytics dashboard. The dashboard&#39;s ID is generated automatically,
	 * therefore any ID provided in the analytics dashboard entity is ignored.&lt;br&gt;
	 * 
	 * @param analyticsDashboard The analytics dashboard to create. (required)
	 * @return ApiResponse&lt;AnalyticsDashboard&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AnalyticsDashboard> analyticsDashboardsCreateWithHttpInfo(AnalyticsDashboard analyticsDashboard) throws ApiException {
		Object localVarPostBody = analyticsDashboard;

		// verify the required parameter 'analyticsDashboard' is set
		if (analyticsDashboard == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsDashboard' when calling analyticsDashboardsCreate");
		}

		// create path and map variables
		String localVarPath = "/analytics/dashboards/create";

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

		GenericType<AnalyticsDashboard> localVarReturnType = new GenericType<AnalyticsDashboard>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * createFromTemplate &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates a new dashboard using the specified template.&lt;br&gt;
	 * 
	 * @param analyticsDashboardFromTemplateRequest The analytics dashboard from template request. (required)
	 * @return AnalyticsDashboard
	 * @throws ApiException if fails to make API call
	 */
	public AnalyticsDashboard analyticsDashboardsCreateFromTemplate(AnalyticsDashboardFromTemplateRequest analyticsDashboardFromTemplateRequest) throws ApiException {
		return analyticsDashboardsCreateFromTemplateWithHttpInfo(analyticsDashboardFromTemplateRequest).getData();
	}

	/**
	 * createFromTemplate &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates a new dashboard using the specified template.&lt;br&gt;
	 * 
	 * @param analyticsDashboardFromTemplateRequest The analytics dashboard from template request. (required)
	 * @return ApiResponse&lt;AnalyticsDashboard&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AnalyticsDashboard> analyticsDashboardsCreateFromTemplateWithHttpInfo(AnalyticsDashboardFromTemplateRequest analyticsDashboardFromTemplateRequest) throws ApiException {
		Object localVarPostBody = analyticsDashboardFromTemplateRequest;

		// verify the required parameter 'analyticsDashboardFromTemplateRequest' is set
		if (analyticsDashboardFromTemplateRequest == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsDashboardFromTemplateRequest' when calling analyticsDashboardsCreateFromTemplate");
		}

		// create path and map variables
		String localVarPath = "/analytics/dashboards/createFromTemplate";

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

		GenericType<AnalyticsDashboard> localVarReturnType = new GenericType<AnalyticsDashboard>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes the analytics dashboard with the specified ID.&lt;br&gt;
	 * 
	 * @param analyticsDashboardId The ID of the analytics dashboard to delete. (required)
	 * @throws ApiException if fails to make API call
	 */
	public void analyticsDashboardsDelete(String analyticsDashboardId) throws ApiException {

		analyticsDashboardsDeleteWithHttpInfo(analyticsDashboardId);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes the analytics dashboard with the specified ID.&lt;br&gt;
	 * 
	 * @param analyticsDashboardId The ID of the analytics dashboard to delete. (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> analyticsDashboardsDeleteWithHttpInfo(String analyticsDashboardId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'analyticsDashboardId' is set
		if (analyticsDashboardId == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsDashboardId' when calling analyticsDashboardsDelete");
		}

		// create path and map variables
		String localVarPath = "/analytics/dashboards/{analyticsDashboardId}/delete"
				.replaceAll("\\{" + "analyticsDashboardId" + "\\}", apiClient.escapeString(analyticsDashboardId.toString()));

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
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the analytics dashboard with the specified ID.&lt;br&gt;
	 * 
	 * @param analyticsDashboardId The ID of the analytics dashboard to return. (required)
	 * @return AnalyticsDashboard
	 * @throws ApiException if fails to make API call
	 */
	public AnalyticsDashboard analyticsDashboardsRead(String analyticsDashboardId) throws ApiException {
		return analyticsDashboardsReadWithHttpInfo(analyticsDashboardId).getData();
	}

	/**
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the analytics dashboard with the specified ID.&lt;br&gt;
	 * 
	 * @param analyticsDashboardId The ID of the analytics dashboard to return. (required)
	 * @return ApiResponse&lt;AnalyticsDashboard&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AnalyticsDashboard> analyticsDashboardsReadWithHttpInfo(String analyticsDashboardId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'analyticsDashboardId' is set
		if (analyticsDashboardId == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsDashboardId' when calling analyticsDashboardsRead");
		}

		// create path and map variables
		String localVarPath = "/analytics/dashboards/{analyticsDashboardId}/read"
				.replaceAll("\\{" + "analyticsDashboardId" + "\\}", apiClient.escapeString(analyticsDashboardId.toString()));

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

		GenericType<AnalyticsDashboard> localVarReturnType = new GenericType<AnalyticsDashboard>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for analytics dashboards matching the specified query.&lt;br&gt;
	 * 
	 * @param analyticsDashboardQuery The query used for the search. (required)
	 * @return AnalyticsDashboardResult
	 * @throws ApiException if fails to make API call
	 */
	public AnalyticsDashboardResult analyticsDashboardsSearch(AnalyticsDashboardQuery analyticsDashboardQuery) throws ApiException {
		return analyticsDashboardsSearchWithHttpInfo(analyticsDashboardQuery).getData();
	}

	/**
	 * search &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for analytics dashboards matching the specified query.&lt;br&gt;
	 * 
	 * @param analyticsDashboardQuery The query used for the search. (required)
	 * @return ApiResponse&lt;AnalyticsDashboardResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AnalyticsDashboardResult> analyticsDashboardsSearchWithHttpInfo(AnalyticsDashboardQuery analyticsDashboardQuery) throws ApiException {
		Object localVarPostBody = analyticsDashboardQuery;

		// verify the required parameter 'analyticsDashboardQuery' is set
		if (analyticsDashboardQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsDashboardQuery' when calling analyticsDashboardsSearch");
		}

		// create path and map variables
		String localVarPath = "/analytics/dashboards/search";

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

		GenericType<AnalyticsDashboardResult> localVarReturnType = new GenericType<AnalyticsDashboardResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates the analytics dashboard in the system with the provided entity. The update fails if no
	 * analytics dashboard exists with the specified ID.&lt;br&gt;
	 * 
	 * @param analyticsDashboard The details to update the analytics dashboard with. (required)
	 * @return AnalyticsDashboard
	 * @throws ApiException if fails to make API call
	 */
	public AnalyticsDashboard analyticsDashboardsUpdate(AnalyticsDashboard analyticsDashboard) throws ApiException {
		return analyticsDashboardsUpdateWithHttpInfo(analyticsDashboard).getData();
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates the analytics dashboard in the system with the provided entity. The update fails if no
	 * analytics dashboard exists with the specified ID.&lt;br&gt;
	 * 
	 * @param analyticsDashboard The details to update the analytics dashboard with. (required)
	 * @return ApiResponse&lt;AnalyticsDashboard&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AnalyticsDashboard> analyticsDashboardsUpdateWithHttpInfo(AnalyticsDashboard analyticsDashboard) throws ApiException {
		Object localVarPostBody = analyticsDashboard;

		// verify the required parameter 'analyticsDashboard' is set
		if (analyticsDashboard == null) {
			throw new ApiException(400, "Missing the required parameter 'analyticsDashboard' when calling analyticsDashboardsUpdate");
		}

		// create path and map variables
		String localVarPath = "/analytics/dashboards/update";

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

		GenericType<AnalyticsDashboard> localVarReturnType = new GenericType<AnalyticsDashboard>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
