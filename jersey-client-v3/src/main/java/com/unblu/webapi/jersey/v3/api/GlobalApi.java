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
import com.unblu.webapi.model.v3.GlobalData;
import com.unblu.webapi.model.v3.ProductVersion;

public class GlobalApi {
	private ApiClient apiClient;

	public GlobalApi() {
		this(Configuration.getDefaultApiClient());
	}

	public GlobalApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * installLicense Install a new license in the global server.&lt;br&gt;
	 * 
	 * @param body licenseContent (required)
	 * @param expand (optional)
	 * @return GlobalData
	 * @throws ApiException if fails to make API call
	 */
	public GlobalData globalInstallLicense(String body, String expand) throws ApiException {
		return globalInstallLicenseWithHttpInfo(body, expand).getData();
	}

	/**
	 * installLicense Install a new license in the global server.&lt;br&gt;
	 * 
	 * @param body licenseContent (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;GlobalData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<GlobalData> globalInstallLicenseWithHttpInfo(String body, String expand) throws ApiException {
		Object localVarPostBody = body;

		// verify the required parameter 'body' is set
		if (body == null) {
			throw new ApiException(400, "Missing the required parameter 'body' when calling globalInstallLicense");
		}

		// create path and map variables
		String localVarPath = "/global/installLicense";

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
			"text/plain"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<GlobalData> localVarReturnType = new GenericType<GlobalData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * ping Checks whether the system is ready to receive requests. It returns a 2xx HTTP status if the system is ready or a 503 status otherwise.
	 * 
	 * @throws ApiException if fails to make API call
	 */
	public void globalPing() throws ApiException {

		globalPingWithHttpInfo();
	}

	/**
	 * ping Checks whether the system is ready to receive requests. It returns a 2xx HTTP status if the system is ready or a 503 status otherwise.
	 * 
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> globalPingWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/global/ping";

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

		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * productVersion productVersion operation
	 * 
	 * @return ProductVersion
	 * @throws ApiException if fails to make API call
	 */
	public ProductVersion globalProductVersion() throws ApiException {
		return globalProductVersionWithHttpInfo().getData();
	}

	/**
	 * productVersion productVersion operation
	 * 
	 * @return ApiResponse&lt;ProductVersion&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ProductVersion> globalProductVersionWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/global/productVersion";

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

		GenericType<ProductVersion> localVarReturnType = new GenericType<ProductVersion>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the GlobalData object containing information about the system (license, settings).&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return GlobalData
	 * @throws ApiException if fails to make API call
	 */
	public GlobalData globalRead(String expand) throws ApiException {
		return globalReadWithHttpInfo(expand).getData();
	}

	/**
	 * read Returns the GlobalData object containing information about the system (license, settings).&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return ApiResponse&lt;GlobalData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<GlobalData> globalReadWithHttpInfo(String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/global/read";

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

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<GlobalData> localVarReturnType = new GenericType<GlobalData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * removeLicense Remove a license from the global server if it was previously added via the UI or the installLicense WebAPI call.&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return GlobalData
	 * @throws ApiException if fails to make API call
	 */
	public GlobalData globalRemoveLicense(String expand) throws ApiException {
		return globalRemoveLicenseWithHttpInfo(expand).getData();
	}

	/**
	 * removeLicense Remove a license from the global server if it was previously added via the UI or the installLicense WebAPI call.&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return ApiResponse&lt;GlobalData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<GlobalData> globalRemoveLicenseWithHttpInfo(String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/global/removeLicense";

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

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<GlobalData> localVarReturnType = new GenericType<GlobalData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the GlobalData object. Since the properties of the Global object are read-only, this methods only make sense when used with the expand
	 * parameter.&lt;br&gt;
	 * 
	 * @param globalData (required)
	 * @param expand (optional)
	 * @return GlobalData
	 * @throws ApiException if fails to make API call
	 */
	public GlobalData globalUpdate(GlobalData globalData, String expand) throws ApiException {
		return globalUpdateWithHttpInfo(globalData, expand).getData();
	}

	/**
	 * update Updates the GlobalData object. Since the properties of the Global object are read-only, this methods only make sense when used with the expand
	 * parameter.&lt;br&gt;
	 * 
	 * @param globalData (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;GlobalData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<GlobalData> globalUpdateWithHttpInfo(GlobalData globalData, String expand) throws ApiException {
		Object localVarPostBody = globalData;

		// verify the required parameter 'globalData' is set
		if (globalData == null) {
			throw new ApiException(400, "Missing the required parameter 'globalData' when calling globalUpdate");
		}

		// create path and map variables
		String localVarPath = "/global/update";

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

		GenericType<GlobalData> localVarReturnType = new GenericType<GlobalData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
