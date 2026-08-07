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
import com.unblu.webapi.model.v4.ExpandFields;
import com.unblu.webapi.model.v4.OidcIdentityProviderData;
import com.unblu.webapi.model.v4.OidcIdentityProviderSecretContainer;
import com.unblu.webapi.model.v4.OidcIdentityProvidersSetSecretBody;

import jakarta.ws.rs.core.GenericType;

public class OidcIdentityProvidersApi {
	private ApiClient apiClient;

	public OidcIdentityProvidersApi() {
		this(Configuration.getDefaultApiClient());
	}

	public OidcIdentityProvidersApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates the specified OIDC identity provider. The provider&#39;s ID is generated automatically,
	 * therefore any ID provided in the entity is ignored.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderData The OIDC identity provider data to create. (required)
	 * @param expand (optional)
	 * @return OidcIdentityProviderData
	 * @throws ApiException if fails to make API call
	 */
	public OidcIdentityProviderData oidcIdentityProvidersCreate(OidcIdentityProviderData oidcIdentityProviderData, List<ExpandFields> expand) throws ApiException {
		return oidcIdentityProvidersCreateWithHttpInfo(oidcIdentityProviderData, expand).getData();
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates the specified OIDC identity provider. The provider&#39;s ID is generated automatically,
	 * therefore any ID provided in the entity is ignored.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderData The OIDC identity provider data to create. (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;OidcIdentityProviderData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<OidcIdentityProviderData> oidcIdentityProvidersCreateWithHttpInfo(OidcIdentityProviderData oidcIdentityProviderData, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = oidcIdentityProviderData;

		// verify the required parameter 'oidcIdentityProviderData' is set
		if (oidcIdentityProviderData == null) {
			throw new ApiException(400, "Missing the required parameter 'oidcIdentityProviderData' when calling oidcIdentityProvidersCreate");
		}

		// create path and map variables
		String localVarPath = "/oidcidentityproviders/create";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<OidcIdentityProviderData> localVarReturnType = new GenericType<OidcIdentityProviderData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * createWithSecret &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates a new OIDC identity provider with the specified client secret. Use this instead
	 * of &#x60;create&#x60; when the provider needs a client secret from the start.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderSecretContainer The OIDC identity provider data and its client secret. (required)
	 * @param expand (optional)
	 * @return OidcIdentityProviderData
	 * @throws ApiException if fails to make API call
	 */
	public OidcIdentityProviderData oidcIdentityProvidersCreateWithSecret(OidcIdentityProviderSecretContainer oidcIdentityProviderSecretContainer, List<ExpandFields> expand) throws ApiException {
		return oidcIdentityProvidersCreateWithSecretWithHttpInfo(oidcIdentityProviderSecretContainer, expand).getData();
	}

	/**
	 * createWithSecret &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates a new OIDC identity provider with the specified client secret. Use this instead
	 * of &#x60;create&#x60; when the provider needs a client secret from the start.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderSecretContainer The OIDC identity provider data and its client secret. (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;OidcIdentityProviderData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<OidcIdentityProviderData> oidcIdentityProvidersCreateWithSecretWithHttpInfo(OidcIdentityProviderSecretContainer oidcIdentityProviderSecretContainer, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = oidcIdentityProviderSecretContainer;

		// verify the required parameter 'oidcIdentityProviderSecretContainer' is set
		if (oidcIdentityProviderSecretContainer == null) {
			throw new ApiException(400, "Missing the required parameter 'oidcIdentityProviderSecretContainer' when calling oidcIdentityProvidersCreateWithSecret");
		}

		// create path and map variables
		String localVarPath = "/oidcidentityproviders/createWithSecret";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<OidcIdentityProviderData> localVarReturnType = new GenericType<OidcIdentityProviderData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes the OIDC identity provider with the specified ID.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider to delete. (required)
	 * @throws ApiException if fails to make API call
	 */
	public void oidcIdentityProvidersDelete(String oidcIdentityProviderId) throws ApiException {

		oidcIdentityProvidersDeleteWithHttpInfo(oidcIdentityProviderId);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes the OIDC identity provider with the specified ID.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider to delete. (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> oidcIdentityProvidersDeleteWithHttpInfo(String oidcIdentityProviderId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'oidcIdentityProviderId' is set
		if (oidcIdentityProviderId == null) {
			throw new ApiException(400, "Missing the required parameter 'oidcIdentityProviderId' when calling oidcIdentityProvidersDelete");
		}

		// create path and map variables
		String localVarPath = "/oidcidentityproviders/{oidcIdentityProviderId}/delete"
				.replaceAll("\\{" + "oidcIdentityProviderId" + "\\}", apiClient.escapeString(oidcIdentityProviderId.toString()));

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
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the OIDC identity provider with the specified ID.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider to return. (required)
	 * @param expand (optional)
	 * @return OidcIdentityProviderData
	 * @throws ApiException if fails to make API call
	 */
	public OidcIdentityProviderData oidcIdentityProvidersRead(String oidcIdentityProviderId, List<ExpandFields> expand) throws ApiException {
		return oidcIdentityProvidersReadWithHttpInfo(oidcIdentityProviderId, expand).getData();
	}

	/**
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the OIDC identity provider with the specified ID.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider to return. (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;OidcIdentityProviderData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<OidcIdentityProviderData> oidcIdentityProvidersReadWithHttpInfo(String oidcIdentityProviderId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'oidcIdentityProviderId' is set
		if (oidcIdentityProviderId == null) {
			throw new ApiException(400, "Missing the required parameter 'oidcIdentityProviderId' when calling oidcIdentityProvidersRead");
		}

		// create path and map variables
		String localVarPath = "/oidcidentityproviders/{oidcIdentityProviderId}/read"
				.replaceAll("\\{" + "oidcIdentityProviderId" + "\\}", apiClient.escapeString(oidcIdentityProviderId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<OidcIdentityProviderData> localVarReturnType = new GenericType<OidcIdentityProviderData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * removeSecret &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Removes the client secret from the OIDC identity provider with the specified ID.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @param expand (optional)
	 * @return OidcIdentityProviderData
	 * @throws ApiException if fails to make API call
	 */
	public OidcIdentityProviderData oidcIdentityProvidersRemoveSecret(String oidcIdentityProviderId, List<ExpandFields> expand) throws ApiException {
		return oidcIdentityProvidersRemoveSecretWithHttpInfo(oidcIdentityProviderId, expand).getData();
	}

	/**
	 * removeSecret &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Removes the client secret from the OIDC identity provider with the specified ID.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;OidcIdentityProviderData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<OidcIdentityProviderData> oidcIdentityProvidersRemoveSecretWithHttpInfo(String oidcIdentityProviderId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'oidcIdentityProviderId' is set
		if (oidcIdentityProviderId == null) {
			throw new ApiException(400, "Missing the required parameter 'oidcIdentityProviderId' when calling oidcIdentityProvidersRemoveSecret");
		}

		// create path and map variables
		String localVarPath = "/oidcidentityproviders/{oidcIdentityProviderId}/removeSecret"
				.replaceAll("\\{" + "oidcIdentityProviderId" + "\\}", apiClient.escapeString(oidcIdentityProviderId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<OidcIdentityProviderData> localVarReturnType = new GenericType<OidcIdentityProviderData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setSecret &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Sets the client secret on the OIDC identity provider with the specified ID.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @param oidcIdentityProvidersSetSecretBody (required)
	 * @param expand (optional)
	 * @return OidcIdentityProviderData
	 * @throws ApiException if fails to make API call
	 */
	public OidcIdentityProviderData oidcIdentityProvidersSetSecret(String oidcIdentityProviderId, OidcIdentityProvidersSetSecretBody oidcIdentityProvidersSetSecretBody, List<ExpandFields> expand) throws ApiException {
		return oidcIdentityProvidersSetSecretWithHttpInfo(oidcIdentityProviderId, oidcIdentityProvidersSetSecretBody, expand).getData();
	}

	/**
	 * setSecret &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Sets the client secret on the OIDC identity provider with the specified ID.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @param oidcIdentityProvidersSetSecretBody (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;OidcIdentityProviderData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<OidcIdentityProviderData> oidcIdentityProvidersSetSecretWithHttpInfo(String oidcIdentityProviderId, OidcIdentityProvidersSetSecretBody oidcIdentityProvidersSetSecretBody, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = oidcIdentityProvidersSetSecretBody;

		// verify the required parameter 'oidcIdentityProviderId' is set
		if (oidcIdentityProviderId == null) {
			throw new ApiException(400, "Missing the required parameter 'oidcIdentityProviderId' when calling oidcIdentityProvidersSetSecret");
		}

		// verify the required parameter 'oidcIdentityProvidersSetSecretBody' is set
		if (oidcIdentityProvidersSetSecretBody == null) {
			throw new ApiException(400, "Missing the required parameter 'oidcIdentityProvidersSetSecretBody' when calling oidcIdentityProvidersSetSecret");
		}

		// create path and map variables
		String localVarPath = "/oidcidentityproviders/{oidcIdentityProviderId}/setSecret"
				.replaceAll("\\{" + "oidcIdentityProviderId" + "\\}", apiClient.escapeString(oidcIdentityProviderId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<OidcIdentityProviderData> localVarReturnType = new GenericType<OidcIdentityProviderData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates the OIDC identity provider in the system with the provided data. The update fails if no
	 * OIDC identity provider exists with the specified ID.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderData The details to update the OIDC identity provider with. (required)
	 * @param expand (optional)
	 * @return OidcIdentityProviderData
	 * @throws ApiException if fails to make API call
	 */
	public OidcIdentityProviderData oidcIdentityProvidersUpdate(OidcIdentityProviderData oidcIdentityProviderData, List<ExpandFields> expand) throws ApiException {
		return oidcIdentityProvidersUpdateWithHttpInfo(oidcIdentityProviderData, expand).getData();
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates the OIDC identity provider in the system with the provided data. The update fails if no
	 * OIDC identity provider exists with the specified ID.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderData The details to update the OIDC identity provider with. (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;OidcIdentityProviderData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<OidcIdentityProviderData> oidcIdentityProvidersUpdateWithHttpInfo(OidcIdentityProviderData oidcIdentityProviderData, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = oidcIdentityProviderData;

		// verify the required parameter 'oidcIdentityProviderData' is set
		if (oidcIdentityProviderData == null) {
			throw new ApiException(400, "Missing the required parameter 'oidcIdentityProviderData' when calling oidcIdentityProvidersUpdate");
		}

		// create path and map variables
		String localVarPath = "/oidcidentityproviders/update";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<OidcIdentityProviderData> localVarReturnType = new GenericType<OidcIdentityProviderData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
