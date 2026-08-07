package com.unblu.webapi.jersey.v4.api;

import com.unblu.webapi.jersey.v4.invoker.ApiException;
import com.unblu.webapi.jersey.v4.invoker.ApiClient;
import com.unblu.webapi.jersey.v4.invoker.ApiResponse;
import com.unblu.webapi.jersey.v4.invoker.Configuration;
import com.unblu.webapi.jersey.v4.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.unblu.webapi.model.v4.ApiSecretCreateBody;
import com.unblu.webapi.model.v4.ApiSecretCreateResult;
import com.unblu.webapi.model.v4.GlobalServicePrincipalsRevokeApiSecretBody;
import com.unblu.webapi.model.v4.ServicePrincipalCreateBody;
import com.unblu.webapi.model.v4.ServicePrincipalData;
import com.unblu.webapi.model.v4.ServicePrincipalUpdateBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlobalServicePrincipalsApi {
	private ApiClient apiClient;

	public GlobalServicePrincipalsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public GlobalServicePrincipalsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates a new global service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalCreateBody The service principal to create (required)
	 * @return ServicePrincipalData
	 * @throws ApiException if fails to make API call
	 */
	public ServicePrincipalData globalServicePrincipalsCreate(ServicePrincipalCreateBody servicePrincipalCreateBody) throws ApiException {
		return globalServicePrincipalsCreateWithHttpInfo(servicePrincipalCreateBody).getData();
	}

	/**
	 * create Creates a new global service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalCreateBody The service principal to create (required)
	 * @return ApiResponse&lt;ServicePrincipalData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ServicePrincipalData> globalServicePrincipalsCreateWithHttpInfo(ServicePrincipalCreateBody servicePrincipalCreateBody) throws ApiException {
		Object localVarPostBody = servicePrincipalCreateBody;

		// verify the required parameter 'servicePrincipalCreateBody' is set
		if (servicePrincipalCreateBody == null) {
			throw new ApiException(400, "Missing the required parameter 'servicePrincipalCreateBody' when calling globalServicePrincipalsCreate");
		}

		// create path and map variables
		String localVarPath = "/globalserviceprincipals/create";

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

		GenericType<ServicePrincipalData> localVarReturnType = new GenericType<ServicePrincipalData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * createApiSecret Creates a new API secret for the global service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal for which to create an API secret (required)
	 * @param apiSecretCreateBody The secret to be created (required)
	 * @return ApiSecretCreateResult
	 * @throws ApiException if fails to make API call
	 */
	public ApiSecretCreateResult globalServicePrincipalsCreateApiSecret(String servicePrincipalId, ApiSecretCreateBody apiSecretCreateBody) throws ApiException {
		return globalServicePrincipalsCreateApiSecretWithHttpInfo(servicePrincipalId, apiSecretCreateBody).getData();
	}

	/**
	 * createApiSecret Creates a new API secret for the global service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal for which to create an API secret (required)
	 * @param apiSecretCreateBody The secret to be created (required)
	 * @return ApiResponse&lt;ApiSecretCreateResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ApiSecretCreateResult> globalServicePrincipalsCreateApiSecretWithHttpInfo(String servicePrincipalId, ApiSecretCreateBody apiSecretCreateBody) throws ApiException {
		Object localVarPostBody = apiSecretCreateBody;

		// verify the required parameter 'servicePrincipalId' is set
		if (servicePrincipalId == null) {
			throw new ApiException(400, "Missing the required parameter 'servicePrincipalId' when calling globalServicePrincipalsCreateApiSecret");
		}

		// verify the required parameter 'apiSecretCreateBody' is set
		if (apiSecretCreateBody == null) {
			throw new ApiException(400, "Missing the required parameter 'apiSecretCreateBody' when calling globalServicePrincipalsCreateApiSecret");
		}

		// create path and map variables
		String localVarPath = "/globalserviceprincipals/{servicePrincipalId}/createApiSecret"
				.replaceAll("\\{" + "servicePrincipalId" + "\\}", apiClient.escapeString(servicePrincipalId.toString()));

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

		GenericType<ApiSecretCreateResult> localVarReturnType = new GenericType<ApiSecretCreateResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the global service principal with the specified ID&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal to be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void globalServicePrincipalsDelete(String servicePrincipalId) throws ApiException {

		globalServicePrincipalsDeleteWithHttpInfo(servicePrincipalId);
	}

	/**
	 * delete Deletes the global service principal with the specified ID&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal to be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> globalServicePrincipalsDeleteWithHttpInfo(String servicePrincipalId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'servicePrincipalId' is set
		if (servicePrincipalId == null) {
			throw new ApiException(400, "Missing the required parameter 'servicePrincipalId' when calling globalServicePrincipalsDelete");
		}

		// create path and map variables
		String localVarPath = "/globalserviceprincipals/{servicePrincipalId}/delete"
				.replaceAll("\\{" + "servicePrincipalId" + "\\}", apiClient.escapeString(servicePrincipalId.toString()));

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
	 * read Reads the existing global service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal to read (required)
	 * @return ServicePrincipalData
	 * @throws ApiException if fails to make API call
	 */
	public ServicePrincipalData globalServicePrincipalsRead(String servicePrincipalId) throws ApiException {
		return globalServicePrincipalsReadWithHttpInfo(servicePrincipalId).getData();
	}

	/**
	 * read Reads the existing global service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal to read (required)
	 * @return ApiResponse&lt;ServicePrincipalData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ServicePrincipalData> globalServicePrincipalsReadWithHttpInfo(String servicePrincipalId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'servicePrincipalId' is set
		if (servicePrincipalId == null) {
			throw new ApiException(400, "Missing the required parameter 'servicePrincipalId' when calling globalServicePrincipalsRead");
		}

		// create path and map variables
		String localVarPath = "/globalserviceprincipals/{servicePrincipalId}/read"
				.replaceAll("\\{" + "servicePrincipalId" + "\\}", apiClient.escapeString(servicePrincipalId.toString()));

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

		GenericType<ServicePrincipalData> localVarReturnType = new GenericType<ServicePrincipalData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * revokeApiSecret Revokes the API secret for the global service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal (required)
	 * @param globalServicePrincipalsRevokeApiSecretBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void globalServicePrincipalsRevokeApiSecret(String servicePrincipalId, GlobalServicePrincipalsRevokeApiSecretBody globalServicePrincipalsRevokeApiSecretBody) throws ApiException {

		globalServicePrincipalsRevokeApiSecretWithHttpInfo(servicePrincipalId, globalServicePrincipalsRevokeApiSecretBody);
	}

	/**
	 * revokeApiSecret Revokes the API secret for the global service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal (required)
	 * @param globalServicePrincipalsRevokeApiSecretBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> globalServicePrincipalsRevokeApiSecretWithHttpInfo(String servicePrincipalId, GlobalServicePrincipalsRevokeApiSecretBody globalServicePrincipalsRevokeApiSecretBody) throws ApiException {
		Object localVarPostBody = globalServicePrincipalsRevokeApiSecretBody;

		// verify the required parameter 'servicePrincipalId' is set
		if (servicePrincipalId == null) {
			throw new ApiException(400, "Missing the required parameter 'servicePrincipalId' when calling globalServicePrincipalsRevokeApiSecret");
		}

		// verify the required parameter 'globalServicePrincipalsRevokeApiSecretBody' is set
		if (globalServicePrincipalsRevokeApiSecretBody == null) {
			throw new ApiException(400, "Missing the required parameter 'globalServicePrincipalsRevokeApiSecretBody' when calling globalServicePrincipalsRevokeApiSecret");
		}

		// create path and map variables
		String localVarPath = "/globalserviceprincipals/{servicePrincipalId}/revokeApiSecret"
				.replaceAll("\\{" + "servicePrincipalId" + "\\}", apiClient.escapeString(servicePrincipalId.toString()));

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * update Updates the existing global service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the global service principal to be updated (required)
	 * @param servicePrincipalUpdateBody The entity with the updated values (required)
	 * @return ServicePrincipalData
	 * @throws ApiException if fails to make API call
	 */
	public ServicePrincipalData globalServicePrincipalsUpdate(String servicePrincipalId, ServicePrincipalUpdateBody servicePrincipalUpdateBody) throws ApiException {
		return globalServicePrincipalsUpdateWithHttpInfo(servicePrincipalId, servicePrincipalUpdateBody).getData();
	}

	/**
	 * update Updates the existing global service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the global service principal to be updated (required)
	 * @param servicePrincipalUpdateBody The entity with the updated values (required)
	 * @return ApiResponse&lt;ServicePrincipalData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ServicePrincipalData> globalServicePrincipalsUpdateWithHttpInfo(String servicePrincipalId, ServicePrincipalUpdateBody servicePrincipalUpdateBody) throws ApiException {
		Object localVarPostBody = servicePrincipalUpdateBody;

		// verify the required parameter 'servicePrincipalId' is set
		if (servicePrincipalId == null) {
			throw new ApiException(400, "Missing the required parameter 'servicePrincipalId' when calling globalServicePrincipalsUpdate");
		}

		// verify the required parameter 'servicePrincipalUpdateBody' is set
		if (servicePrincipalUpdateBody == null) {
			throw new ApiException(400, "Missing the required parameter 'servicePrincipalUpdateBody' when calling globalServicePrincipalsUpdate");
		}

		// create path and map variables
		String localVarPath = "/globalserviceprincipals/{servicePrincipalId}/update"
				.replaceAll("\\{" + "servicePrincipalId" + "\\}", apiClient.escapeString(servicePrincipalId.toString()));

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

		GenericType<ServicePrincipalData> localVarReturnType = new GenericType<ServicePrincipalData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
