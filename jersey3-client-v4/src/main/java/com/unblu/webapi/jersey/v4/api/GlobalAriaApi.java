package com.unblu.webapi.jersey.v4.api;

import com.unblu.webapi.jersey.v4.invoker.ApiException;
import com.unblu.webapi.jersey.v4.invoker.ApiClient;
import com.unblu.webapi.jersey.v4.invoker.ApiResponse;
import com.unblu.webapi.jersey.v4.invoker.Configuration;
import com.unblu.webapi.jersey.v4.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.unblu.webapi.model.v4.ProductVersion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlobalAriaApi {
	private ApiClient apiClient;

	public GlobalAriaApi() {
		this(Configuration.getDefaultApiClient());
	}

	public GlobalAriaApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * productVersion Returns the Aria product information
	 * 
	 * @return ProductVersion
	 * @throws ApiException if fails to make API call
	 */
	public ProductVersion globalAriaProductVersion() throws ApiException {
		return globalAriaProductVersionWithHttpInfo().getData();
	}

	/**
	 * productVersion Returns the Aria product information
	 * 
	 * @return ApiResponse&lt;ProductVersion&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ProductVersion> globalAriaProductVersionWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/global/aria/productVersion";

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

		GenericType<ProductVersion> localVarReturnType = new GenericType<ProductVersion>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
