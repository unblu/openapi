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
import com.unblu.webapi.model.v4.KeyEncryptionKeyActivationBody;
import com.unblu.webapi.model.v4.KeyEncryptionKeyData;
import com.unblu.webapi.model.v4.KeyEncryptionKeyList;
import com.unblu.webapi.model.v4.KeyEncryptionKeyUsageStatistics;
import com.unblu.webapi.model.v4.KeyEncryptionKeyVersionList;

import jakarta.ws.rs.core.GenericType;

public class KeyEncryptionKeysApi {
	private ApiClient apiClient;

	public KeyEncryptionKeysApi() {
		this(Configuration.getDefaultApiClient());
	}

	public KeyEncryptionKeysApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Removes the key encryption key with the specified ID. Only key encryption keys with status
	 * &#x60;DECOMMISSIONED&#x60; can be removed; the request fails for a key encryption key with status &#x60;ACTIVE&#x60; or &#x60;DRAINING&#x60;.&lt;br&gt;
	 * 
	 * @param keyEncryptionKeyId The ID of the key encryption key to remove. (required)
	 * @throws ApiException if fails to make API call
	 */
	public void keyEncryptionKeysDelete(String keyEncryptionKeyId) throws ApiException {

		keyEncryptionKeysDeleteWithHttpInfo(keyEncryptionKeyId);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Removes the key encryption key with the specified ID. Only key encryption keys with status
	 * &#x60;DECOMMISSIONED&#x60; can be removed; the request fails for a key encryption key with status &#x60;ACTIVE&#x60; or &#x60;DRAINING&#x60;.&lt;br&gt;
	 * 
	 * @param keyEncryptionKeyId The ID of the key encryption key to remove. (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> keyEncryptionKeysDeleteWithHttpInfo(String keyEncryptionKeyId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'keyEncryptionKeyId' is set
		if (keyEncryptionKeyId == null) {
			throw new ApiException(400, "Missing the required parameter 'keyEncryptionKeyId' when calling keyEncryptionKeysDelete");
		}

		// create path and map variables
		String localVarPath = "/keyencryptionkeys/{keyEncryptionKeyId}/delete"
				.replaceAll("\\{" + "keyEncryptionKeyId" + "\\}", apiClient.escapeString(keyEncryptionKeyId.toString()));

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
	 * getAll &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Lists all key encryption keys of the current account.&lt;br&gt;
	 * 
	 * @return KeyEncryptionKeyList
	 * @throws ApiException if fails to make API call
	 */
	public KeyEncryptionKeyList keyEncryptionKeysGetAll() throws ApiException {
		return keyEncryptionKeysGetAllWithHttpInfo().getData();
	}

	/**
	 * getAll &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Lists all key encryption keys of the current account.&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;KeyEncryptionKeyList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<KeyEncryptionKeyList> keyEncryptionKeysGetAllWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/keyencryptionkeys/getAll";

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

		GenericType<KeyEncryptionKeyList> localVarReturnType = new GenericType<KeyEncryptionKeyList>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getUsageStatistics &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns how much the specified version of the specified key encryption key is used
	 * overall, broken down by encryption consumer. &lt;p&gt; The usage of a consumer is the number of its stored entities whose data encryption key is wrapped by
	 * that key encryption key version, counted across all of its entities. Determining the usage doubles as the consumer&#39;s availability check: a consumer that
	 * can&#39;t be reached is reported as &#x60;UNAVAILABLE&#x60; with no &#x60;usage&#x60; and the failure reason in &#x60;unavailabilityReason&#x60;, rather than
	 * failing the whole request. Every consumer that the deployment expects is part of the report: one that isn&#39;t registered, for example because it is still
	 * starting up, is reported as &#x60;UNAVAILABLE&#x60; rather than being left out. The total usage is therefore &#x60;null&#x60; while any consumer is
	 * unavailable, because it can&#39;t be determined then. Consumers that the server configuration excludes from the statistics are the exception: they are left
	 * out of the report and don&#39;t count towards the total usage, whether they are available or not.&lt;br&gt;
	 * 
	 * @param keyEncryptionKeyId The ID of the key encryption key. Mandatory. (required)
	 * @param version The identifier of the key encryption key version. Mandatory. (optional)
	 * @return KeyEncryptionKeyUsageStatistics
	 * @throws ApiException if fails to make API call
	 */
	public KeyEncryptionKeyUsageStatistics keyEncryptionKeysGetUsageStatistics(String keyEncryptionKeyId, String version) throws ApiException {
		return keyEncryptionKeysGetUsageStatisticsWithHttpInfo(keyEncryptionKeyId, version).getData();
	}

	/**
	 * getUsageStatistics &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns how much the specified version of the specified key encryption key is used
	 * overall, broken down by encryption consumer. &lt;p&gt; The usage of a consumer is the number of its stored entities whose data encryption key is wrapped by
	 * that key encryption key version, counted across all of its entities. Determining the usage doubles as the consumer&#39;s availability check: a consumer that
	 * can&#39;t be reached is reported as &#x60;UNAVAILABLE&#x60; with no &#x60;usage&#x60; and the failure reason in &#x60;unavailabilityReason&#x60;, rather than
	 * failing the whole request. Every consumer that the deployment expects is part of the report: one that isn&#39;t registered, for example because it is still
	 * starting up, is reported as &#x60;UNAVAILABLE&#x60; rather than being left out. The total usage is therefore &#x60;null&#x60; while any consumer is
	 * unavailable, because it can&#39;t be determined then. Consumers that the server configuration excludes from the statistics are the exception: they are left
	 * out of the report and don&#39;t count towards the total usage, whether they are available or not.&lt;br&gt;
	 * 
	 * @param keyEncryptionKeyId The ID of the key encryption key. Mandatory. (required)
	 * @param version The identifier of the key encryption key version. Mandatory. (optional)
	 * @return ApiResponse&lt;KeyEncryptionKeyUsageStatistics&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<KeyEncryptionKeyUsageStatistics> keyEncryptionKeysGetUsageStatisticsWithHttpInfo(String keyEncryptionKeyId, String version) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'keyEncryptionKeyId' is set
		if (keyEncryptionKeyId == null) {
			throw new ApiException(400, "Missing the required parameter 'keyEncryptionKeyId' when calling keyEncryptionKeysGetUsageStatistics");
		}

		// create path and map variables
		String localVarPath = "/keyencryptionkeys/{keyEncryptionKeyId}/getUsageStatistics"
				.replaceAll("\\{" + "keyEncryptionKeyId" + "\\}", apiClient.escapeString(keyEncryptionKeyId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<KeyEncryptionKeyUsageStatistics> localVarReturnType = new GenericType<KeyEncryptionKeyUsageStatistics>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getVersions &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Lists all versions of the key encryption key with the specified ID, ordered by age, oldest
	 * first.&lt;br&gt;
	 * 
	 * @param keyEncryptionKeyId The ID of the key encryption key whose versions should be returned. (required)
	 * @return KeyEncryptionKeyVersionList
	 * @throws ApiException if fails to make API call
	 */
	public KeyEncryptionKeyVersionList keyEncryptionKeysGetVersions(String keyEncryptionKeyId) throws ApiException {
		return keyEncryptionKeysGetVersionsWithHttpInfo(keyEncryptionKeyId).getData();
	}

	/**
	 * getVersions &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Lists all versions of the key encryption key with the specified ID, ordered by age, oldest
	 * first.&lt;br&gt;
	 * 
	 * @param keyEncryptionKeyId The ID of the key encryption key whose versions should be returned. (required)
	 * @return ApiResponse&lt;KeyEncryptionKeyVersionList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<KeyEncryptionKeyVersionList> keyEncryptionKeysGetVersionsWithHttpInfo(String keyEncryptionKeyId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'keyEncryptionKeyId' is set
		if (keyEncryptionKeyId == null) {
			throw new ApiException(400, "Missing the required parameter 'keyEncryptionKeyId' when calling keyEncryptionKeysGetVersions");
		}

		// create path and map variables
		String localVarPath = "/keyencryptionkeys/{keyEncryptionKeyId}/getVersions"
				.replaceAll("\\{" + "keyEncryptionKeyId" + "\\}", apiClient.escapeString(keyEncryptionKeyId.toString()));

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

		GenericType<KeyEncryptionKeyVersionList> localVarReturnType = new GenericType<KeyEncryptionKeyVersionList>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the key encryption key with the specified ID.&lt;br&gt;
	 * 
	 * @param keyEncryptionKeyId The ID of the key encryption key to return. (required)
	 * @return KeyEncryptionKeyData
	 * @throws ApiException if fails to make API call
	 */
	public KeyEncryptionKeyData keyEncryptionKeysRead(String keyEncryptionKeyId) throws ApiException {
		return keyEncryptionKeysReadWithHttpInfo(keyEncryptionKeyId).getData();
	}

	/**
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the key encryption key with the specified ID.&lt;br&gt;
	 * 
	 * @param keyEncryptionKeyId The ID of the key encryption key to return. (required)
	 * @return ApiResponse&lt;KeyEncryptionKeyData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<KeyEncryptionKeyData> keyEncryptionKeysReadWithHttpInfo(String keyEncryptionKeyId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'keyEncryptionKeyId' is set
		if (keyEncryptionKeyId == null) {
			throw new ApiException(400, "Missing the required parameter 'keyEncryptionKeyId' when calling keyEncryptionKeysRead");
		}

		// create path and map variables
		String localVarPath = "/keyencryptionkeys/{keyEncryptionKeyId}/read"
				.replaceAll("\\{" + "keyEncryptionKeyId" + "\\}", apiClient.escapeString(keyEncryptionKeyId.toString()));

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

		GenericType<KeyEncryptionKeyData> localVarReturnType = new GenericType<KeyEncryptionKeyData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setActive &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Sets the active key encryption key of the current account. &lt;ul&gt; &lt;li&gt;If the
	 * specified key encryption key is already the active key of the account, no change is made and the existing key encryption key is returned.&lt;/li&gt;
	 * &lt;li&gt;If the account already has a key encryption key with the specified type and endpoint that isn&#39;t active, that key becomes the active key
	 * again.&lt;/li&gt; &lt;li&gt;In all other cases, a new key encryption key with status &#x60;ACTIVE&#x60; is created.&lt;/li&gt; &lt;/ul&gt; Whenever the
	 * active key changes, the previously active key encryption key transitions to status &#x60;DRAINING&#x60;. &lt;p&gt; The name is only applied when the key
	 * encryption key is created or reactivated, not when the key is already the active key of the account. It therefore only renames an existing key that isn&#39;t
	 * active. &lt;p&gt; The key encryption key is tested before it&#39;s persisted.&lt;br&gt;
	 * 
	 * @param keyEncryptionKeyActivationBody The name, type, and endpoint of the key encryption key to activate. (required)
	 * @return KeyEncryptionKeyData
	 * @throws ApiException if fails to make API call
	 */
	public KeyEncryptionKeyData keyEncryptionKeysSetActive(KeyEncryptionKeyActivationBody keyEncryptionKeyActivationBody) throws ApiException {
		return keyEncryptionKeysSetActiveWithHttpInfo(keyEncryptionKeyActivationBody).getData();
	}

	/**
	 * setActive &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Sets the active key encryption key of the current account. &lt;ul&gt; &lt;li&gt;If the
	 * specified key encryption key is already the active key of the account, no change is made and the existing key encryption key is returned.&lt;/li&gt;
	 * &lt;li&gt;If the account already has a key encryption key with the specified type and endpoint that isn&#39;t active, that key becomes the active key
	 * again.&lt;/li&gt; &lt;li&gt;In all other cases, a new key encryption key with status &#x60;ACTIVE&#x60; is created.&lt;/li&gt; &lt;/ul&gt; Whenever the
	 * active key changes, the previously active key encryption key transitions to status &#x60;DRAINING&#x60;. &lt;p&gt; The name is only applied when the key
	 * encryption key is created or reactivated, not when the key is already the active key of the account. It therefore only renames an existing key that isn&#39;t
	 * active. &lt;p&gt; The key encryption key is tested before it&#39;s persisted.&lt;br&gt;
	 * 
	 * @param keyEncryptionKeyActivationBody The name, type, and endpoint of the key encryption key to activate. (required)
	 * @return ApiResponse&lt;KeyEncryptionKeyData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<KeyEncryptionKeyData> keyEncryptionKeysSetActiveWithHttpInfo(KeyEncryptionKeyActivationBody keyEncryptionKeyActivationBody) throws ApiException {
		Object localVarPostBody = keyEncryptionKeyActivationBody;

		// verify the required parameter 'keyEncryptionKeyActivationBody' is set
		if (keyEncryptionKeyActivationBody == null) {
			throw new ApiException(400, "Missing the required parameter 'keyEncryptionKeyActivationBody' when calling keyEncryptionKeysSetActive");
		}

		// create path and map variables
		String localVarPath = "/keyencryptionkeys/setActive";

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

		GenericType<KeyEncryptionKeyData> localVarReturnType = new GenericType<KeyEncryptionKeyData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * test &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Tests whether the key encryption key with the specified ID is usable. The request succeeds if the
	 * test passed and fails with an error describing the problem otherwise.&lt;br&gt;
	 * 
	 * @param keyEncryptionKeyId The ID of the key encryption key to test. (required)
	 * @throws ApiException if fails to make API call
	 */
	public void keyEncryptionKeysTest(String keyEncryptionKeyId) throws ApiException {

		keyEncryptionKeysTestWithHttpInfo(keyEncryptionKeyId);
	}

	/**
	 * test &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Tests whether the key encryption key with the specified ID is usable. The request succeeds if the
	 * test passed and fails with an error describing the problem otherwise.&lt;br&gt;
	 * 
	 * @param keyEncryptionKeyId The ID of the key encryption key to test. (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> keyEncryptionKeysTestWithHttpInfo(String keyEncryptionKeyId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'keyEncryptionKeyId' is set
		if (keyEncryptionKeyId == null) {
			throw new ApiException(400, "Missing the required parameter 'keyEncryptionKeyId' when calling keyEncryptionKeysTest");
		}

		// create path and map variables
		String localVarPath = "/keyencryptionkeys/{keyEncryptionKeyId}/test"
				.replaceAll("\\{" + "keyEncryptionKeyId" + "\\}", apiClient.escapeString(keyEncryptionKeyId.toString()));

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

		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}
}
