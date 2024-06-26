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
import com.unblu.webapi.model.v4.FileUploadGlobalInterceptorsApproveFileUploadBody;
import com.unblu.webapi.model.v4.FileUploadGlobalInterceptorsRejectFileUploadBody;
import com.unblu.webapi.model.v4.FileUploadInterceptorData;
import com.unblu.webapi.model.v4.FileUploadInterceptorQuery;
import com.unblu.webapi.model.v4.FileUploadInterceptorResult;

import jakarta.ws.rs.core.GenericType;

public class FileUploadGlobalInterceptorsApi {
	private ApiClient apiClient;

	public FileUploadGlobalInterceptorsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public FileUploadGlobalInterceptorsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * approveFileUpload Approves a file upload for which approval was requested through a &lt;code&gt;file_upload_interceptor.new_file&lt;/code&gt;
	 * webhook.&lt;br&gt;
	 * 
	 * @param fileUploadGlobalInterceptorsApproveFileUploadBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void fileUploadGlobalInterceptorsApproveFileUpload(FileUploadGlobalInterceptorsApproveFileUploadBody fileUploadGlobalInterceptorsApproveFileUploadBody) throws ApiException {

		fileUploadGlobalInterceptorsApproveFileUploadWithHttpInfo(fileUploadGlobalInterceptorsApproveFileUploadBody);
	}

	/**
	 * approveFileUpload Approves a file upload for which approval was requested through a &lt;code&gt;file_upload_interceptor.new_file&lt;/code&gt;
	 * webhook.&lt;br&gt;
	 * 
	 * @param fileUploadGlobalInterceptorsApproveFileUploadBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> fileUploadGlobalInterceptorsApproveFileUploadWithHttpInfo(FileUploadGlobalInterceptorsApproveFileUploadBody fileUploadGlobalInterceptorsApproveFileUploadBody) throws ApiException {
		Object localVarPostBody = fileUploadGlobalInterceptorsApproveFileUploadBody;

		// verify the required parameter 'fileUploadGlobalInterceptorsApproveFileUploadBody' is set
		if (fileUploadGlobalInterceptorsApproveFileUploadBody == null) {
			throw new ApiException(400, "Missing the required parameter 'fileUploadGlobalInterceptorsApproveFileUploadBody' when calling fileUploadGlobalInterceptorsApproveFileUpload");
		}

		// create path and map variables
		String localVarPath = "/fileuploadglobalinterceptors/approveFileUpload";

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
	 * create Creates a new file upload interceptor&lt;br&gt;
	 * 
	 * @param fileUploadInterceptorData The file upload interceptor to create (required)
	 * @return FileUploadInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public FileUploadInterceptorData fileUploadGlobalInterceptorsCreate(FileUploadInterceptorData fileUploadInterceptorData) throws ApiException {
		return fileUploadGlobalInterceptorsCreateWithHttpInfo(fileUploadInterceptorData).getData();
	}

	/**
	 * create Creates a new file upload interceptor&lt;br&gt;
	 * 
	 * @param fileUploadInterceptorData The file upload interceptor to create (required)
	 * @return ApiResponse&lt;FileUploadInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<FileUploadInterceptorData> fileUploadGlobalInterceptorsCreateWithHttpInfo(FileUploadInterceptorData fileUploadInterceptorData) throws ApiException {
		Object localVarPostBody = fileUploadInterceptorData;

		// verify the required parameter 'fileUploadInterceptorData' is set
		if (fileUploadInterceptorData == null) {
			throw new ApiException(400, "Missing the required parameter 'fileUploadInterceptorData' when calling fileUploadGlobalInterceptorsCreate");
		}

		// create path and map variables
		String localVarPath = "/fileuploadglobalinterceptors/create";

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

		GenericType<FileUploadInterceptorData> localVarReturnType = new GenericType<FileUploadInterceptorData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes an existing file upload interceptor&lt;br&gt;
	 * 
	 * @param interceptorId The ID of the file upload interceptor which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void fileUploadGlobalInterceptorsDelete(String interceptorId) throws ApiException {

		fileUploadGlobalInterceptorsDeleteWithHttpInfo(interceptorId);
	}

	/**
	 * delete Deletes an existing file upload interceptor&lt;br&gt;
	 * 
	 * @param interceptorId The ID of the file upload interceptor which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> fileUploadGlobalInterceptorsDeleteWithHttpInfo(String interceptorId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'interceptorId' is set
		if (interceptorId == null) {
			throw new ApiException(400, "Missing the required parameter 'interceptorId' when calling fileUploadGlobalInterceptorsDelete");
		}

		// create path and map variables
		String localVarPath = "/fileuploadglobalinterceptors/{interceptorId}/delete"
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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * getByName Searches for a file upload interceptor with the given name&lt;br&gt;
	 * 
	 * @param name The name of the file upload interceptor (optional)
	 * @return FileUploadInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public FileUploadInterceptorData fileUploadGlobalInterceptorsGetByName(String name) throws ApiException {
		return fileUploadGlobalInterceptorsGetByNameWithHttpInfo(name).getData();
	}

	/**
	 * getByName Searches for a file upload interceptor with the given name&lt;br&gt;
	 * 
	 * @param name The name of the file upload interceptor (optional)
	 * @return ApiResponse&lt;FileUploadInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<FileUploadInterceptorData> fileUploadGlobalInterceptorsGetByNameWithHttpInfo(String name) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/fileuploadglobalinterceptors/getByName";

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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<FileUploadInterceptorData> localVarReturnType = new GenericType<FileUploadInterceptorData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Reads an existing file upload interceptor.&lt;br&gt;
	 * 
	 * @param interceptorId The ID of the file upload interceptor to read (required)
	 * @return FileUploadInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public FileUploadInterceptorData fileUploadGlobalInterceptorsRead(String interceptorId) throws ApiException {
		return fileUploadGlobalInterceptorsReadWithHttpInfo(interceptorId).getData();
	}

	/**
	 * read Reads an existing file upload interceptor.&lt;br&gt;
	 * 
	 * @param interceptorId The ID of the file upload interceptor to read (required)
	 * @return ApiResponse&lt;FileUploadInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<FileUploadInterceptorData> fileUploadGlobalInterceptorsReadWithHttpInfo(String interceptorId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'interceptorId' is set
		if (interceptorId == null) {
			throw new ApiException(400, "Missing the required parameter 'interceptorId' when calling fileUploadGlobalInterceptorsRead");
		}

		// create path and map variables
		String localVarPath = "/fileuploadglobalinterceptors/{interceptorId}/read"
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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<FileUploadInterceptorData> localVarReturnType = new GenericType<FileUploadInterceptorData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * rejectFileUpload Rejects a file upload for which approval was requested through a &lt;code&gt;file_upload_interceptor.new_file&lt;/code&gt;
	 * webhook.&lt;br&gt;
	 * 
	 * @param fileUploadGlobalInterceptorsRejectFileUploadBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void fileUploadGlobalInterceptorsRejectFileUpload(FileUploadGlobalInterceptorsRejectFileUploadBody fileUploadGlobalInterceptorsRejectFileUploadBody) throws ApiException {

		fileUploadGlobalInterceptorsRejectFileUploadWithHttpInfo(fileUploadGlobalInterceptorsRejectFileUploadBody);
	}

	/**
	 * rejectFileUpload Rejects a file upload for which approval was requested through a &lt;code&gt;file_upload_interceptor.new_file&lt;/code&gt;
	 * webhook.&lt;br&gt;
	 * 
	 * @param fileUploadGlobalInterceptorsRejectFileUploadBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> fileUploadGlobalInterceptorsRejectFileUploadWithHttpInfo(FileUploadGlobalInterceptorsRejectFileUploadBody fileUploadGlobalInterceptorsRejectFileUploadBody) throws ApiException {
		Object localVarPostBody = fileUploadGlobalInterceptorsRejectFileUploadBody;

		// verify the required parameter 'fileUploadGlobalInterceptorsRejectFileUploadBody' is set
		if (fileUploadGlobalInterceptorsRejectFileUploadBody == null) {
			throw new ApiException(400, "Missing the required parameter 'fileUploadGlobalInterceptorsRejectFileUploadBody' when calling fileUploadGlobalInterceptorsRejectFileUpload");
		}

		// create path and map variables
		String localVarPath = "/fileuploadglobalinterceptors/rejectFileUpload";

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
	 * search Searches for file upload interceptors in the current account&lt;br&gt;
	 * 
	 * @param fileUploadInterceptorQuery (required)
	 * @return FileUploadInterceptorResult
	 * @throws ApiException if fails to make API call
	 */
	public FileUploadInterceptorResult fileUploadGlobalInterceptorsSearch(FileUploadInterceptorQuery fileUploadInterceptorQuery) throws ApiException {
		return fileUploadGlobalInterceptorsSearchWithHttpInfo(fileUploadInterceptorQuery).getData();
	}

	/**
	 * search Searches for file upload interceptors in the current account&lt;br&gt;
	 * 
	 * @param fileUploadInterceptorQuery (required)
	 * @return ApiResponse&lt;FileUploadInterceptorResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<FileUploadInterceptorResult> fileUploadGlobalInterceptorsSearchWithHttpInfo(FileUploadInterceptorQuery fileUploadInterceptorQuery) throws ApiException {
		Object localVarPostBody = fileUploadInterceptorQuery;

		// verify the required parameter 'fileUploadInterceptorQuery' is set
		if (fileUploadInterceptorQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'fileUploadInterceptorQuery' when calling fileUploadGlobalInterceptorsSearch");
		}

		// create path and map variables
		String localVarPath = "/fileuploadglobalinterceptors/search";

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

		GenericType<FileUploadInterceptorResult> localVarReturnType = new GenericType<FileUploadInterceptorResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * sendPing Emits a &#x60;WebhookPingEvent&#x60; on the configured webhook for the given file upload interceptor&lt;br&gt;
	 * 
	 * @param interceptorId The ID of the file upload interceptor (required)
	 * @throws ApiException if fails to make API call
	 */
	public void fileUploadGlobalInterceptorsSendPing(String interceptorId) throws ApiException {

		fileUploadGlobalInterceptorsSendPingWithHttpInfo(interceptorId);
	}

	/**
	 * sendPing Emits a &#x60;WebhookPingEvent&#x60; on the configured webhook for the given file upload interceptor&lt;br&gt;
	 * 
	 * @param interceptorId The ID of the file upload interceptor (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> fileUploadGlobalInterceptorsSendPingWithHttpInfo(String interceptorId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'interceptorId' is set
		if (interceptorId == null) {
			throw new ApiException(400, "Missing the required parameter 'interceptorId' when calling fileUploadGlobalInterceptorsSendPing");
		}

		// create path and map variables
		String localVarPath = "/fileuploadglobalinterceptors/{interceptorId}/sendPing"
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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * update Updates an existing file upload interceptor&lt;br&gt;
	 * 
	 * @param fileUploadInterceptorData (required)
	 * @return FileUploadInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public FileUploadInterceptorData fileUploadGlobalInterceptorsUpdate(FileUploadInterceptorData fileUploadInterceptorData) throws ApiException {
		return fileUploadGlobalInterceptorsUpdateWithHttpInfo(fileUploadInterceptorData).getData();
	}

	/**
	 * update Updates an existing file upload interceptor&lt;br&gt;
	 * 
	 * @param fileUploadInterceptorData (required)
	 * @return ApiResponse&lt;FileUploadInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<FileUploadInterceptorData> fileUploadGlobalInterceptorsUpdateWithHttpInfo(FileUploadInterceptorData fileUploadInterceptorData) throws ApiException {
		Object localVarPostBody = fileUploadInterceptorData;

		// verify the required parameter 'fileUploadInterceptorData' is set
		if (fileUploadInterceptorData == null) {
			throw new ApiException(400, "Missing the required parameter 'fileUploadInterceptorData' when calling fileUploadGlobalInterceptorsUpdate");
		}

		// create path and map variables
		String localVarPath = "/fileuploadglobalinterceptors/update";

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

		GenericType<FileUploadInterceptorData> localVarReturnType = new GenericType<FileUploadInterceptorData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
