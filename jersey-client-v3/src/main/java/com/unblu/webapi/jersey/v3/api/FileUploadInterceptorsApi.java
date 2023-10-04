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
import com.unblu.webapi.model.v3.FileUploadInterceptorData;
import com.unblu.webapi.model.v3.FileUploadInterceptorQuery;
import com.unblu.webapi.model.v3.FileUploadInterceptorResult;
import com.unblu.webapi.model.v3.FileUploadInterceptorsApproveFileUploadBody;
import com.unblu.webapi.model.v3.FileUploadInterceptorsPingWebhookBody;
import com.unblu.webapi.model.v3.FileUploadInterceptorsRejectFileUploadBody;
import com.unblu.webapi.model.v3.FileUploadInterceptorsValidateMimeTypeRegexBody;

public class FileUploadInterceptorsApi {
	private ApiClient apiClient;

	public FileUploadInterceptorsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public FileUploadInterceptorsApi(ApiClient apiClient) {
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
	 * @param fileUploadInterceptorsApproveFileUploadBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void fileUploadInterceptorsApproveFileUpload(FileUploadInterceptorsApproveFileUploadBody fileUploadInterceptorsApproveFileUploadBody) throws ApiException {

		fileUploadInterceptorsApproveFileUploadWithHttpInfo(fileUploadInterceptorsApproveFileUploadBody);
	}

	/**
	 * approveFileUpload Approves a file upload for which approval was requested through a &lt;code&gt;file_upload_interceptor.new_file&lt;/code&gt;
	 * webhook.&lt;br&gt;
	 * 
	 * @param fileUploadInterceptorsApproveFileUploadBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> fileUploadInterceptorsApproveFileUploadWithHttpInfo(FileUploadInterceptorsApproveFileUploadBody fileUploadInterceptorsApproveFileUploadBody) throws ApiException {
		Object localVarPostBody = fileUploadInterceptorsApproveFileUploadBody;

		// verify the required parameter 'fileUploadInterceptorsApproveFileUploadBody' is set
		if (fileUploadInterceptorsApproveFileUploadBody == null) {
			throw new ApiException(400, "Missing the required parameter 'fileUploadInterceptorsApproveFileUploadBody' when calling fileUploadInterceptorsApproveFileUpload");
		}

		// create path and map variables
		String localVarPath = "/fileuploadinterceptors/approveFileUpload";

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
	public FileUploadInterceptorData fileUploadInterceptorsCreate(FileUploadInterceptorData fileUploadInterceptorData) throws ApiException {
		return fileUploadInterceptorsCreateWithHttpInfo(fileUploadInterceptorData).getData();
	}

	/**
	 * create Creates a new file upload interceptor&lt;br&gt;
	 * 
	 * @param fileUploadInterceptorData The file upload interceptor to create (required)
	 * @return ApiResponse&lt;FileUploadInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<FileUploadInterceptorData> fileUploadInterceptorsCreateWithHttpInfo(FileUploadInterceptorData fileUploadInterceptorData) throws ApiException {
		Object localVarPostBody = fileUploadInterceptorData;

		// verify the required parameter 'fileUploadInterceptorData' is set
		if (fileUploadInterceptorData == null) {
			throw new ApiException(400, "Missing the required parameter 'fileUploadInterceptorData' when calling fileUploadInterceptorsCreate");
		}

		// create path and map variables
		String localVarPath = "/fileuploadinterceptors/create";

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
	 * @param id The ID of the file upload interceptor which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void fileUploadInterceptorsDelete(String id) throws ApiException {

		fileUploadInterceptorsDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes an existing file upload interceptor&lt;br&gt;
	 * 
	 * @param id The ID of the file upload interceptor which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> fileUploadInterceptorsDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/fileuploadinterceptors/delete";

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
	 * getByName Searches for a file upload interceptor with the given name&lt;br&gt;
	 * 
	 * @param name The name of the file upload interceptor (optional)
	 * @return FileUploadInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public FileUploadInterceptorData fileUploadInterceptorsGetByName(String name) throws ApiException {
		return fileUploadInterceptorsGetByNameWithHttpInfo(name).getData();
	}

	/**
	 * getByName Searches for a file upload interceptor with the given name&lt;br&gt;
	 * 
	 * @param name The name of the file upload interceptor (optional)
	 * @return ApiResponse&lt;FileUploadInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<FileUploadInterceptorData> fileUploadInterceptorsGetByNameWithHttpInfo(String name) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/fileuploadinterceptors/getByName";

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
	 * pingWebhook Emits a &#x60;WebhookPingEvent&#x60; on the configured webhook for the given file upload interceptor&lt;br&gt;
	 * 
	 * @param fileUploadInterceptorsPingWebhookBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void fileUploadInterceptorsPingWebhook(FileUploadInterceptorsPingWebhookBody fileUploadInterceptorsPingWebhookBody) throws ApiException {

		fileUploadInterceptorsPingWebhookWithHttpInfo(fileUploadInterceptorsPingWebhookBody);
	}

	/**
	 * pingWebhook Emits a &#x60;WebhookPingEvent&#x60; on the configured webhook for the given file upload interceptor&lt;br&gt;
	 * 
	 * @param fileUploadInterceptorsPingWebhookBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> fileUploadInterceptorsPingWebhookWithHttpInfo(FileUploadInterceptorsPingWebhookBody fileUploadInterceptorsPingWebhookBody) throws ApiException {
		Object localVarPostBody = fileUploadInterceptorsPingWebhookBody;

		// verify the required parameter 'fileUploadInterceptorsPingWebhookBody' is set
		if (fileUploadInterceptorsPingWebhookBody == null) {
			throw new ApiException(400, "Missing the required parameter 'fileUploadInterceptorsPingWebhookBody' when calling fileUploadInterceptorsPingWebhook");
		}

		// create path and map variables
		String localVarPath = "/fileuploadinterceptors/pingWebhook";

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
	 * read Reads an existing file upload interceptor.&lt;br&gt;
	 * 
	 * @param id The ID of the file upload interceptor to read (optional)
	 * @return FileUploadInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public FileUploadInterceptorData fileUploadInterceptorsRead(String id) throws ApiException {
		return fileUploadInterceptorsReadWithHttpInfo(id).getData();
	}

	/**
	 * read Reads an existing file upload interceptor.&lt;br&gt;
	 * 
	 * @param id The ID of the file upload interceptor to read (optional)
	 * @return ApiResponse&lt;FileUploadInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<FileUploadInterceptorData> fileUploadInterceptorsReadWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/fileuploadinterceptors/read";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

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
	 * @param fileUploadInterceptorsRejectFileUploadBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void fileUploadInterceptorsRejectFileUpload(FileUploadInterceptorsRejectFileUploadBody fileUploadInterceptorsRejectFileUploadBody) throws ApiException {

		fileUploadInterceptorsRejectFileUploadWithHttpInfo(fileUploadInterceptorsRejectFileUploadBody);
	}

	/**
	 * rejectFileUpload Rejects a file upload for which approval was requested through a &lt;code&gt;file_upload_interceptor.new_file&lt;/code&gt;
	 * webhook.&lt;br&gt;
	 * 
	 * @param fileUploadInterceptorsRejectFileUploadBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> fileUploadInterceptorsRejectFileUploadWithHttpInfo(FileUploadInterceptorsRejectFileUploadBody fileUploadInterceptorsRejectFileUploadBody) throws ApiException {
		Object localVarPostBody = fileUploadInterceptorsRejectFileUploadBody;

		// verify the required parameter 'fileUploadInterceptorsRejectFileUploadBody' is set
		if (fileUploadInterceptorsRejectFileUploadBody == null) {
			throw new ApiException(400, "Missing the required parameter 'fileUploadInterceptorsRejectFileUploadBody' when calling fileUploadInterceptorsRejectFileUpload");
		}

		// create path and map variables
		String localVarPath = "/fileuploadinterceptors/rejectFileUpload";

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
	public FileUploadInterceptorResult fileUploadInterceptorsSearch(FileUploadInterceptorQuery fileUploadInterceptorQuery) throws ApiException {
		return fileUploadInterceptorsSearchWithHttpInfo(fileUploadInterceptorQuery).getData();
	}

	/**
	 * search Searches for file upload interceptors in the current account&lt;br&gt;
	 * 
	 * @param fileUploadInterceptorQuery (required)
	 * @return ApiResponse&lt;FileUploadInterceptorResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<FileUploadInterceptorResult> fileUploadInterceptorsSearchWithHttpInfo(FileUploadInterceptorQuery fileUploadInterceptorQuery) throws ApiException {
		Object localVarPostBody = fileUploadInterceptorQuery;

		// verify the required parameter 'fileUploadInterceptorQuery' is set
		if (fileUploadInterceptorQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'fileUploadInterceptorQuery' when calling fileUploadInterceptorsSearch");
		}

		// create path and map variables
		String localVarPath = "/fileuploadinterceptors/search";

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
	 * update Updates an existing file upload interceptor&lt;br&gt;
	 * 
	 * @param fileUploadInterceptorData (required)
	 * @return FileUploadInterceptorData
	 * @throws ApiException if fails to make API call
	 */
	public FileUploadInterceptorData fileUploadInterceptorsUpdate(FileUploadInterceptorData fileUploadInterceptorData) throws ApiException {
		return fileUploadInterceptorsUpdateWithHttpInfo(fileUploadInterceptorData).getData();
	}

	/**
	 * update Updates an existing file upload interceptor&lt;br&gt;
	 * 
	 * @param fileUploadInterceptorData (required)
	 * @return ApiResponse&lt;FileUploadInterceptorData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<FileUploadInterceptorData> fileUploadInterceptorsUpdateWithHttpInfo(FileUploadInterceptorData fileUploadInterceptorData) throws ApiException {
		Object localVarPostBody = fileUploadInterceptorData;

		// verify the required parameter 'fileUploadInterceptorData' is set
		if (fileUploadInterceptorData == null) {
			throw new ApiException(400, "Missing the required parameter 'fileUploadInterceptorData' when calling fileUploadInterceptorsUpdate");
		}

		// create path and map variables
		String localVarPath = "/fileuploadinterceptors/update";

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
	 * validateMimeTypeRegex validateMimeTypeRegex operation
	 * 
	 * @param fileUploadInterceptorsValidateMimeTypeRegexBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void fileUploadInterceptorsValidateMimeTypeRegex(FileUploadInterceptorsValidateMimeTypeRegexBody fileUploadInterceptorsValidateMimeTypeRegexBody) throws ApiException {

		fileUploadInterceptorsValidateMimeTypeRegexWithHttpInfo(fileUploadInterceptorsValidateMimeTypeRegexBody);
	}

	/**
	 * validateMimeTypeRegex validateMimeTypeRegex operation
	 * 
	 * @param fileUploadInterceptorsValidateMimeTypeRegexBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> fileUploadInterceptorsValidateMimeTypeRegexWithHttpInfo(FileUploadInterceptorsValidateMimeTypeRegexBody fileUploadInterceptorsValidateMimeTypeRegexBody) throws ApiException {
		Object localVarPostBody = fileUploadInterceptorsValidateMimeTypeRegexBody;

		// verify the required parameter 'fileUploadInterceptorsValidateMimeTypeRegexBody' is set
		if (fileUploadInterceptorsValidateMimeTypeRegexBody == null) {
			throw new ApiException(400, "Missing the required parameter 'fileUploadInterceptorsValidateMimeTypeRegexBody' when calling fileUploadInterceptorsValidateMimeTypeRegex");
		}

		// create path and map variables
		String localVarPath = "/fileuploadinterceptors/validateMimeTypeRegex";

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
}
