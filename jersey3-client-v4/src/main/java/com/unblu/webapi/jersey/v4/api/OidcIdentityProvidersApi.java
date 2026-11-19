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
import com.unblu.webapi.model.v4.OidcIdentityProviderKeyData;
import com.unblu.webapi.model.v4.OidcIdentityProviderKeyList;
import com.unblu.webapi.model.v4.OidcIdentityProviderKeySettings;
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
	 * activateKey &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Makes the key pair with the specified ID the one the token requests of the OIDC identity
	 * provider are signed with. The key pair that was active before becomes inactive and can be activated again as long as it isn&#39;t deleted. Activating the key
	 * pair that is already active changes nothing. The identity provider must authenticate with &#x60;PRIVATE_KEY_JWT&#x60;.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @param keyId The ID of the key pair to activate. (required)
	 * @return OidcIdentityProviderKeyData
	 * @throws ApiException if fails to make API call
	 */
	public OidcIdentityProviderKeyData oidcIdentityProvidersActivateKey(String oidcIdentityProviderId, String keyId) throws ApiException {
		return oidcIdentityProvidersActivateKeyWithHttpInfo(oidcIdentityProviderId, keyId).getData();
	}

	/**
	 * activateKey &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Makes the key pair with the specified ID the one the token requests of the OIDC identity
	 * provider are signed with. The key pair that was active before becomes inactive and can be activated again as long as it isn&#39;t deleted. Activating the key
	 * pair that is already active changes nothing. The identity provider must authenticate with &#x60;PRIVATE_KEY_JWT&#x60;.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @param keyId The ID of the key pair to activate. (required)
	 * @return ApiResponse&lt;OidcIdentityProviderKeyData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<OidcIdentityProviderKeyData> oidcIdentityProvidersActivateKeyWithHttpInfo(String oidcIdentityProviderId, String keyId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'oidcIdentityProviderId' is set
		if (oidcIdentityProviderId == null) {
			throw new ApiException(400, "Missing the required parameter 'oidcIdentityProviderId' when calling oidcIdentityProvidersActivateKey");
		}

		// verify the required parameter 'keyId' is set
		if (keyId == null) {
			throw new ApiException(400, "Missing the required parameter 'keyId' when calling oidcIdentityProvidersActivateKey");
		}

		// create path and map variables
		String localVarPath = "/oidcidentityproviders/{oidcIdentityProviderId}/activateKey/{keyId}"
				.replaceAll("\\{" + "oidcIdentityProviderId" + "\\}", apiClient.escapeString(oidcIdentityProviderId.toString()))
				.replaceAll("\\{" + "keyId" + "\\}", apiClient.escapeString(keyId.toString()));

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

		GenericType<OidcIdentityProviderKeyData> localVarReturnType = new GenericType<OidcIdentityProviderKeyData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates the specified OIDC identity provider. The provider&#39;s ID is generated automatically,
	 * therefore any ID provided in the entity is ignored.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderData The OIDC identity provider data to create. (required)
	 * @param expand Names the expandable properties to return in full. Also names which of the request body&#39;s expandable properties to store; an expandable
	 * property not named here is ignored. Expandable in this operation: &#x60;logoImage&#x60;. (optional)
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
	 * @param expand Names the expandable properties to return in full. Also names which of the request body&#39;s expandable properties to store; an expandable
	 * property not named here is ignored. Expandable in this operation: &#x60;logoImage&#x60;. (optional)
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
	 * @param expand Names the expandable properties to return in full. Expandable in this operation: &#x60;logoImage&#x60;. (optional)
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
	 * @param expand Names the expandable properties to return in full. Expandable in this operation: &#x60;logoImage&#x60;. (optional)
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
	 * deleteKey &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes the key pair with the specified ID. The active key pair can&#39;t be deleted; activate
	 * another key pair first. The identity provider must authenticate with &#x60;PRIVATE_KEY_JWT&#x60;.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @param keyId The ID of the key pair to delete. (required)
	 * @throws ApiException if fails to make API call
	 */
	public void oidcIdentityProvidersDeleteKey(String oidcIdentityProviderId, String keyId) throws ApiException {

		oidcIdentityProvidersDeleteKeyWithHttpInfo(oidcIdentityProviderId, keyId);
	}

	/**
	 * deleteKey &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes the key pair with the specified ID. The active key pair can&#39;t be deleted; activate
	 * another key pair first. The identity provider must authenticate with &#x60;PRIVATE_KEY_JWT&#x60;.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @param keyId The ID of the key pair to delete. (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> oidcIdentityProvidersDeleteKeyWithHttpInfo(String oidcIdentityProviderId, String keyId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'oidcIdentityProviderId' is set
		if (oidcIdentityProviderId == null) {
			throw new ApiException(400, "Missing the required parameter 'oidcIdentityProviderId' when calling oidcIdentityProvidersDeleteKey");
		}

		// verify the required parameter 'keyId' is set
		if (keyId == null) {
			throw new ApiException(400, "Missing the required parameter 'keyId' when calling oidcIdentityProvidersDeleteKey");
		}

		// create path and map variables
		String localVarPath = "/oidcidentityproviders/{oidcIdentityProviderId}/deleteKey/{keyId}"
				.replaceAll("\\{" + "oidcIdentityProviderId" + "\\}", apiClient.escapeString(oidcIdentityProviderId.toString()))
				.replaceAll("\\{" + "keyId" + "\\}", apiClient.escapeString(keyId.toString()));

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
	 * generateKey &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Generates a new key pair with a self-signed certificate for the OIDC identity provider with
	 * the specified ID. The first key pair of an identity provider is active right away; a later one stays inactive until it is activated with
	 * &#x60;activateKey&#x60;, so its certificate can be registered at the identity provider first. An identity provider holds at most two key pairs; delete the
	 * inactive one before generating another. The identity provider must authenticate with &#x60;PRIVATE_KEY_JWT&#x60;.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @param oidcIdentityProviderKeySettings The settings of the new key pair. Omitted values fall back to the defaults. (required)
	 * @return OidcIdentityProviderKeyData
	 * @throws ApiException if fails to make API call
	 */
	public OidcIdentityProviderKeyData oidcIdentityProvidersGenerateKey(String oidcIdentityProviderId, OidcIdentityProviderKeySettings oidcIdentityProviderKeySettings) throws ApiException {
		return oidcIdentityProvidersGenerateKeyWithHttpInfo(oidcIdentityProviderId, oidcIdentityProviderKeySettings).getData();
	}

	/**
	 * generateKey &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Generates a new key pair with a self-signed certificate for the OIDC identity provider with
	 * the specified ID. The first key pair of an identity provider is active right away; a later one stays inactive until it is activated with
	 * &#x60;activateKey&#x60;, so its certificate can be registered at the identity provider first. An identity provider holds at most two key pairs; delete the
	 * inactive one before generating another. The identity provider must authenticate with &#x60;PRIVATE_KEY_JWT&#x60;.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @param oidcIdentityProviderKeySettings The settings of the new key pair. Omitted values fall back to the defaults. (required)
	 * @return ApiResponse&lt;OidcIdentityProviderKeyData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<OidcIdentityProviderKeyData> oidcIdentityProvidersGenerateKeyWithHttpInfo(String oidcIdentityProviderId, OidcIdentityProviderKeySettings oidcIdentityProviderKeySettings) throws ApiException {
		Object localVarPostBody = oidcIdentityProviderKeySettings;

		// verify the required parameter 'oidcIdentityProviderId' is set
		if (oidcIdentityProviderId == null) {
			throw new ApiException(400, "Missing the required parameter 'oidcIdentityProviderId' when calling oidcIdentityProvidersGenerateKey");
		}

		// verify the required parameter 'oidcIdentityProviderKeySettings' is set
		if (oidcIdentityProviderKeySettings == null) {
			throw new ApiException(400, "Missing the required parameter 'oidcIdentityProviderKeySettings' when calling oidcIdentityProvidersGenerateKey");
		}

		// create path and map variables
		String localVarPath = "/oidcidentityproviders/{oidcIdentityProviderId}/generateKey"
				.replaceAll("\\{" + "oidcIdentityProviderId" + "\\}", apiClient.escapeString(oidcIdentityProviderId.toString()));

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

		GenericType<OidcIdentityProviderKeyData> localVarReturnType = new GenericType<OidcIdentityProviderKeyData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getKeys &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the key pairs of the OIDC identity provider with the specified ID, oldest first. Token
	 * requests are signed with the active key pair when the identity provider authenticates with &#x60;PRIVATE_KEY_JWT&#x60;; the call fails for any other client
	 * authentication method.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @return OidcIdentityProviderKeyList
	 * @throws ApiException if fails to make API call
	 */
	public OidcIdentityProviderKeyList oidcIdentityProvidersGetKeys(String oidcIdentityProviderId) throws ApiException {
		return oidcIdentityProvidersGetKeysWithHttpInfo(oidcIdentityProviderId).getData();
	}

	/**
	 * getKeys &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the key pairs of the OIDC identity provider with the specified ID, oldest first. Token
	 * requests are signed with the active key pair when the identity provider authenticates with &#x60;PRIVATE_KEY_JWT&#x60;; the call fails for any other client
	 * authentication method.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @return ApiResponse&lt;OidcIdentityProviderKeyList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<OidcIdentityProviderKeyList> oidcIdentityProvidersGetKeysWithHttpInfo(String oidcIdentityProviderId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'oidcIdentityProviderId' is set
		if (oidcIdentityProviderId == null) {
			throw new ApiException(400, "Missing the required parameter 'oidcIdentityProviderId' when calling oidcIdentityProvidersGetKeys");
		}

		// create path and map variables
		String localVarPath = "/oidcidentityproviders/{oidcIdentityProviderId}/getKeys"
				.replaceAll("\\{" + "oidcIdentityProviderId" + "\\}", apiClient.escapeString(oidcIdentityProviderId.toString()));

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

		GenericType<OidcIdentityProviderKeyList> localVarReturnType = new GenericType<OidcIdentityProviderKeyList>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the OIDC identity provider with the specified ID.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider to return. (required)
	 * @param expand Names the expandable properties to return in full. Expandable in this operation: &#x60;logoImage&#x60;. (optional)
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
	 * @param expand Names the expandable properties to return in full. Expandable in this operation: &#x60;logoImage&#x60;. (optional)
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
	 * removeSecret &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Removes the client secret from the OIDC identity provider with the specified ID, which then
	 * authenticates without credentials. The identity provider must authenticate with a client secret; the call fails for any other client authentication
	 * method.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @param expand Names the expandable properties to return in full. Expandable in this operation: &#x60;logoImage&#x60;. (optional)
	 * @return OidcIdentityProviderData
	 * @throws ApiException if fails to make API call
	 */
	public OidcIdentityProviderData oidcIdentityProvidersRemoveSecret(String oidcIdentityProviderId, List<ExpandFields> expand) throws ApiException {
		return oidcIdentityProvidersRemoveSecretWithHttpInfo(oidcIdentityProviderId, expand).getData();
	}

	/**
	 * removeSecret &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Removes the client secret from the OIDC identity provider with the specified ID, which then
	 * authenticates without credentials. The identity provider must authenticate with a client secret; the call fails for any other client authentication
	 * method.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @param expand Names the expandable properties to return in full. Expandable in this operation: &#x60;logoImage&#x60;. (optional)
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
	 * @param expand Names the expandable properties to return in full. Expandable in this operation: &#x60;logoImage&#x60;. (optional)
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
	 * @param expand Names the expandable properties to return in full. Expandable in this operation: &#x60;logoImage&#x60;. (optional)
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
	 * @param expand Names the expandable properties to return in full. Also names which of the request body&#39;s expandable properties to store; an expandable
	 * property not named here is ignored. Expandable in this operation: &#x60;logoImage&#x60;. (optional)
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
	 * @param expand Names the expandable properties to return in full. Also names which of the request body&#39;s expandable properties to store; an expandable
	 * property not named here is ignored. Expandable in this operation: &#x60;logoImage&#x60;. (optional)
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

	/**
	 * updateKeySettings &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Changes the settings of the key pair with the specified ID. Only the warning period can
	 * change; the algorithm and the validity are fixed once the key pair is generated, so &#x60;algorithm&#x60; and &#x60;certificateValidityDays&#x60; must be
	 * omitted. The identity provider must authenticate with &#x60;PRIVATE_KEY_JWT&#x60;.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @param keyId The ID of the key pair. (required)
	 * @param oidcIdentityProviderKeySettings The settings to apply. (required)
	 * @return OidcIdentityProviderKeyData
	 * @throws ApiException if fails to make API call
	 */
	public OidcIdentityProviderKeyData oidcIdentityProvidersUpdateKeySettings(String oidcIdentityProviderId, String keyId, OidcIdentityProviderKeySettings oidcIdentityProviderKeySettings) throws ApiException {
		return oidcIdentityProvidersUpdateKeySettingsWithHttpInfo(oidcIdentityProviderId, keyId, oidcIdentityProviderKeySettings).getData();
	}

	/**
	 * updateKeySettings &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Changes the settings of the key pair with the specified ID. Only the warning period can
	 * change; the algorithm and the validity are fixed once the key pair is generated, so &#x60;algorithm&#x60; and &#x60;certificateValidityDays&#x60; must be
	 * omitted. The identity provider must authenticate with &#x60;PRIVATE_KEY_JWT&#x60;.&lt;br&gt;
	 * 
	 * @param oidcIdentityProviderId The ID of the OIDC identity provider. (required)
	 * @param keyId The ID of the key pair. (required)
	 * @param oidcIdentityProviderKeySettings The settings to apply. (required)
	 * @return ApiResponse&lt;OidcIdentityProviderKeyData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<OidcIdentityProviderKeyData> oidcIdentityProvidersUpdateKeySettingsWithHttpInfo(String oidcIdentityProviderId, String keyId, OidcIdentityProviderKeySettings oidcIdentityProviderKeySettings) throws ApiException {
		Object localVarPostBody = oidcIdentityProviderKeySettings;

		// verify the required parameter 'oidcIdentityProviderId' is set
		if (oidcIdentityProviderId == null) {
			throw new ApiException(400, "Missing the required parameter 'oidcIdentityProviderId' when calling oidcIdentityProvidersUpdateKeySettings");
		}

		// verify the required parameter 'keyId' is set
		if (keyId == null) {
			throw new ApiException(400, "Missing the required parameter 'keyId' when calling oidcIdentityProvidersUpdateKeySettings");
		}

		// verify the required parameter 'oidcIdentityProviderKeySettings' is set
		if (oidcIdentityProviderKeySettings == null) {
			throw new ApiException(400, "Missing the required parameter 'oidcIdentityProviderKeySettings' when calling oidcIdentityProvidersUpdateKeySettings");
		}

		// create path and map variables
		String localVarPath = "/oidcidentityproviders/{oidcIdentityProviderId}/updateKeySettings/{keyId}"
				.replaceAll("\\{" + "oidcIdentityProviderId" + "\\}", apiClient.escapeString(oidcIdentityProviderId.toString()))
				.replaceAll("\\{" + "keyId" + "\\}", apiClient.escapeString(keyId.toString()));

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

		GenericType<OidcIdentityProviderKeyData> localVarReturnType = new GenericType<OidcIdentityProviderKeyData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
