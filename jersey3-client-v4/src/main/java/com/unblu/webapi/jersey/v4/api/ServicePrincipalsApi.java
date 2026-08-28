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
import com.unblu.webapi.model.v4.ApiSecretCreateBody;
import com.unblu.webapi.model.v4.ApiSecretCreateResult;
import com.unblu.webapi.model.v4.ServicePrincipalCreateBody;
import com.unblu.webapi.model.v4.ServicePrincipalData;
import com.unblu.webapi.model.v4.ServicePrincipalUpdateBody;
import com.unblu.webapi.model.v4.ServicePrincipalsRevokeApiSecretBody;

import jakarta.ws.rs.core.GenericType;

public class ServicePrincipalsApi {
	private ApiClient apiClient;

	public ServicePrincipalsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ServicePrincipalsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates a new service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalCreateBody The service principal to create (required)
	 * @return ServicePrincipalData
	 * @throws ApiException if fails to make API call
	 */
	public ServicePrincipalData servicePrincipalsCreate(ServicePrincipalCreateBody servicePrincipalCreateBody) throws ApiException {
		return servicePrincipalsCreateWithHttpInfo(servicePrincipalCreateBody).getData();
	}

	/**
	 * create Creates a new service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalCreateBody The service principal to create (required)
	 * @return ApiResponse&lt;ServicePrincipalData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ServicePrincipalData> servicePrincipalsCreateWithHttpInfo(ServicePrincipalCreateBody servicePrincipalCreateBody) throws ApiException {
		Object localVarPostBody = servicePrincipalCreateBody;

		// verify the required parameter 'servicePrincipalCreateBody' is set
		if (servicePrincipalCreateBody == null) {
			throw new ApiException(400, "Missing the required parameter 'servicePrincipalCreateBody' when calling servicePrincipalsCreate");
		}

		// create path and map variables
		String localVarPath = "/serviceprincipals/create";

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
	 * createApiSecret Creates a new API Secret for the service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal for which to create an API secret (required)
	 * @param apiSecretCreateBody The API secret to be created (required)
	 * @return ApiSecretCreateResult
	 * @throws ApiException if fails to make API call
	 */
	public ApiSecretCreateResult servicePrincipalsCreateApiSecret(String servicePrincipalId, ApiSecretCreateBody apiSecretCreateBody) throws ApiException {
		return servicePrincipalsCreateApiSecretWithHttpInfo(servicePrincipalId, apiSecretCreateBody).getData();
	}

	/**
	 * createApiSecret Creates a new API Secret for the service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal for which to create an API secret (required)
	 * @param apiSecretCreateBody The API secret to be created (required)
	 * @return ApiResponse&lt;ApiSecretCreateResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ApiSecretCreateResult> servicePrincipalsCreateApiSecretWithHttpInfo(String servicePrincipalId, ApiSecretCreateBody apiSecretCreateBody) throws ApiException {
		Object localVarPostBody = apiSecretCreateBody;

		// verify the required parameter 'servicePrincipalId' is set
		if (servicePrincipalId == null) {
			throw new ApiException(400, "Missing the required parameter 'servicePrincipalId' when calling servicePrincipalsCreateApiSecret");
		}

		// verify the required parameter 'apiSecretCreateBody' is set
		if (apiSecretCreateBody == null) {
			throw new ApiException(400, "Missing the required parameter 'apiSecretCreateBody' when calling servicePrincipalsCreateApiSecret");
		}

		// create path and map variables
		String localVarPath = "/serviceprincipals/{servicePrincipalId}/createApiSecret"
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
	 * delete Deletes the service principal with the specified ID&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal to be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void servicePrincipalsDelete(String servicePrincipalId) throws ApiException {

		servicePrincipalsDeleteWithHttpInfo(servicePrincipalId);
	}

	/**
	 * delete Deletes the service principal with the specified ID&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal to be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> servicePrincipalsDeleteWithHttpInfo(String servicePrincipalId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'servicePrincipalId' is set
		if (servicePrincipalId == null) {
			throw new ApiException(400, "Missing the required parameter 'servicePrincipalId' when calling servicePrincipalsDelete");
		}

		// create path and map variables
		String localVarPath = "/serviceprincipals/{servicePrincipalId}/delete"
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
	 * read Reads the existing service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal to read (required)
	 * @return ServicePrincipalData
	 * @throws ApiException if fails to make API call
	 */
	public ServicePrincipalData servicePrincipalsRead(String servicePrincipalId) throws ApiException {
		return servicePrincipalsReadWithHttpInfo(servicePrincipalId).getData();
	}

	/**
	 * read Reads the existing service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal to read (required)
	 * @return ApiResponse&lt;ServicePrincipalData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ServicePrincipalData> servicePrincipalsReadWithHttpInfo(String servicePrincipalId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'servicePrincipalId' is set
		if (servicePrincipalId == null) {
			throw new ApiException(400, "Missing the required parameter 'servicePrincipalId' when calling servicePrincipalsRead");
		}

		// create path and map variables
		String localVarPath = "/serviceprincipals/{servicePrincipalId}/read"
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
	 * revokeApiSecret Revokes the API secret for the service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal (required)
	 * @param servicePrincipalsRevokeApiSecretBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void servicePrincipalsRevokeApiSecret(String servicePrincipalId, ServicePrincipalsRevokeApiSecretBody servicePrincipalsRevokeApiSecretBody) throws ApiException {

		servicePrincipalsRevokeApiSecretWithHttpInfo(servicePrincipalId, servicePrincipalsRevokeApiSecretBody);
	}

	/**
	 * revokeApiSecret Revokes the API secret for the service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal (required)
	 * @param servicePrincipalsRevokeApiSecretBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> servicePrincipalsRevokeApiSecretWithHttpInfo(String servicePrincipalId, ServicePrincipalsRevokeApiSecretBody servicePrincipalsRevokeApiSecretBody) throws ApiException {
		Object localVarPostBody = servicePrincipalsRevokeApiSecretBody;

		// verify the required parameter 'servicePrincipalId' is set
		if (servicePrincipalId == null) {
			throw new ApiException(400, "Missing the required parameter 'servicePrincipalId' when calling servicePrincipalsRevokeApiSecret");
		}

		// verify the required parameter 'servicePrincipalsRevokeApiSecretBody' is set
		if (servicePrincipalsRevokeApiSecretBody == null) {
			throw new ApiException(400, "Missing the required parameter 'servicePrincipalsRevokeApiSecretBody' when calling servicePrincipalsRevokeApiSecret");
		}

		// create path and map variables
		String localVarPath = "/serviceprincipals/{servicePrincipalId}/revokeApiSecret"
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
	 * update Updates the existing service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal to be updated (required)
	 * @param servicePrincipalUpdateBody The entity with the updated values (required)
	 * @return ServicePrincipalData
	 * @throws ApiException if fails to make API call
	 */
	public ServicePrincipalData servicePrincipalsUpdate(String servicePrincipalId, ServicePrincipalUpdateBody servicePrincipalUpdateBody) throws ApiException {
		return servicePrincipalsUpdateWithHttpInfo(servicePrincipalId, servicePrincipalUpdateBody).getData();
	}

	/**
	 * update Updates the existing service principal&lt;br&gt;
	 * 
	 * @param servicePrincipalId The ID of the service principal to be updated (required)
	 * @param servicePrincipalUpdateBody The entity with the updated values (required)
	 * @return ApiResponse&lt;ServicePrincipalData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ServicePrincipalData> servicePrincipalsUpdateWithHttpInfo(String servicePrincipalId, ServicePrincipalUpdateBody servicePrincipalUpdateBody) throws ApiException {
		Object localVarPostBody = servicePrincipalUpdateBody;

		// verify the required parameter 'servicePrincipalId' is set
		if (servicePrincipalId == null) {
			throw new ApiException(400, "Missing the required parameter 'servicePrincipalId' when calling servicePrincipalsUpdate");
		}

		// verify the required parameter 'servicePrincipalUpdateBody' is set
		if (servicePrincipalUpdateBody == null) {
			throw new ApiException(400, "Missing the required parameter 'servicePrincipalUpdateBody' when calling servicePrincipalsUpdate");
		}

		// create path and map variables
		String localVarPath = "/serviceprincipals/{servicePrincipalId}/update"
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
