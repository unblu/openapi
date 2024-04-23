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
import com.unblu.webapi.model.v4.RecordRetentionData;

import jakarta.ws.rs.core.GenericType;

public class RecordRetentionApi {
	private ApiClient apiClient;

	public RecordRetentionApi() {
		this(Configuration.getDefaultApiClient());
	}

	public RecordRetentionApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * read Returns the records retention configuration for the account of the calling user&lt;br&gt;
	 * 
	 * @return RecordRetentionData
	 * @throws ApiException if fails to make API call
	 */
	public RecordRetentionData recordRetentionRead() throws ApiException {
		return recordRetentionReadWithHttpInfo().getData();
	}

	/**
	 * read Returns the records retention configuration for the account of the calling user&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;RecordRetentionData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<RecordRetentionData> recordRetentionReadWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/recordretention/read";

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

		GenericType<RecordRetentionData> localVarReturnType = new GenericType<RecordRetentionData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates and returns an account&#39;s records retention configuration with the settings in &#x60;RecordRetentionData&#x60;&lt;br&gt;
	 * 
	 * @param recordRetentionData The new records retention configuration (required)
	 * @return RecordRetentionData
	 * @throws ApiException if fails to make API call
	 */
	public RecordRetentionData recordRetentionUpdate(RecordRetentionData recordRetentionData) throws ApiException {
		return recordRetentionUpdateWithHttpInfo(recordRetentionData).getData();
	}

	/**
	 * update Updates and returns an account&#39;s records retention configuration with the settings in &#x60;RecordRetentionData&#x60;&lt;br&gt;
	 * 
	 * @param recordRetentionData The new records retention configuration (required)
	 * @return ApiResponse&lt;RecordRetentionData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<RecordRetentionData> recordRetentionUpdateWithHttpInfo(RecordRetentionData recordRetentionData) throws ApiException {
		Object localVarPostBody = recordRetentionData;

		// verify the required parameter 'recordRetentionData' is set
		if (recordRetentionData == null) {
			throw new ApiException(400, "Missing the required parameter 'recordRetentionData' when calling recordRetentionUpdate");
		}

		// create path and map variables
		String localVarPath = "/recordretention/update";

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

		GenericType<RecordRetentionData> localVarReturnType = new GenericType<RecordRetentionData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
