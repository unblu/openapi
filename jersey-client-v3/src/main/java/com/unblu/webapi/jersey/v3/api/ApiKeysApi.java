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
import com.unblu.webapi.model.v3.ApiKey;
import com.unblu.webapi.model.v3.ApiKeyQuery;
import com.unblu.webapi.model.v3.ApiKeyResult;

public class ApiKeysApi {
	private ApiClient apiClient;

	public ApiKeysApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ApiKeysApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
	 * 
	 * @param apiKey The entity to create (required)
	 * @param expand (optional)
	 * @return ApiKey
	 * @throws ApiException if fails to make API call
	 */
	public ApiKey apiKeysCreate(ApiKey apiKey, String expand) throws ApiException {
		return apiKeysCreateWithHttpInfo(apiKey, expand).getData();
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
	 * 
	 * @param apiKey The entity to create (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ApiKey&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ApiKey> apiKeysCreateWithHttpInfo(ApiKey apiKey, String expand) throws ApiException {
		Object localVarPostBody = apiKey;

		// verify the required parameter 'apiKey' is set
		if (apiKey == null) {
			throw new ApiException(400, "Missing the required parameter 'apiKey' when calling apiKeysCreate");
		}

		// create path and map variables
		String localVarPath = "/apikeys/create";

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

		GenericType<ApiKey> localVarReturnType = new GenericType<ApiKey>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void apiKeysDelete(String id) throws ApiException {

		apiKeysDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> apiKeysDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/apikeys/delete";

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
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void apiKeysDeleteLegacyGet(String id) throws ApiException {

		apiKeysDeleteLegacyGetWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> apiKeysDeleteLegacyGetWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/apikeys/delete";

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

		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * getByKey Returns the api key object for the given api key string in the current account&lt;br&gt;
	 * 
	 * @param apiKey The api key for which the object should be returned (optional)
	 * @param expand (optional)
	 * @return ApiKey
	 * @throws ApiException if fails to make API call
	 */
	public ApiKey apiKeysGetByKey(String apiKey, String expand) throws ApiException {
		return apiKeysGetByKeyWithHttpInfo(apiKey, expand).getData();
	}

	/**
	 * getByKey Returns the api key object for the given api key string in the current account&lt;br&gt;
	 * 
	 * @param apiKey The api key for which the object should be returned (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ApiKey&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ApiKey> apiKeysGetByKeyWithHttpInfo(String apiKey, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/apikeys/getByKey";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "apiKey", apiKey));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ApiKey> localVarReturnType = new GenericType<ApiKey>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getDefaultForAccountId Returns the default api key for the given account id. If the id of the account does not match with the one from the current user, null
	 * is returned&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return ApiKey
	 * @throws ApiException if fails to make API call
	 */
	public ApiKey apiKeysGetDefaultForAccountId(String expand) throws ApiException {
		return apiKeysGetDefaultForAccountIdWithHttpInfo(expand).getData();
	}

	/**
	 * getDefaultForAccountId Returns the default api key for the given account id. If the id of the account does not match with the one from the current user, null
	 * is returned&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return ApiResponse&lt;ApiKey&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ApiKey> apiKeysGetDefaultForAccountIdWithHttpInfo(String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/apikeys/getDefaultForAccountId";

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

		GenericType<ApiKey> localVarReturnType = new GenericType<ApiKey>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getQuotaUsage Returns the number of entities already existing (for the current account)&lt;br&gt;
	 * 
	 * @return Integer
	 * @throws ApiException if fails to make API call
	 */
	public Integer apiKeysGetQuotaUsage() throws ApiException {
		return apiKeysGetQuotaUsageWithHttpInfo().getData();
	}

	/**
	 * getQuotaUsage Returns the number of entities already existing (for the current account)&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;Integer&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Integer> apiKeysGetQuotaUsageWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/apikeys/getQuotaUsage";

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

		GenericType<Integer> localVarReturnType = new GenericType<Integer>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the entity for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the entity which should be returned (optional)
	 * @param expand (optional)
	 * @return ApiKey
	 * @throws ApiException if fails to make API call
	 */
	public ApiKey apiKeysRead(String id, String expand) throws ApiException {
		return apiKeysReadWithHttpInfo(id, expand).getData();
	}

	/**
	 * read Returns the entity for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the entity which should be returned (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ApiKey&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ApiKey> apiKeysReadWithHttpInfo(String id, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/apikeys/read";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<ApiKey> localVarReturnType = new GenericType<ApiKey>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of the entities with the given IDs. IDs that can&#39;t be found are ignored&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the entities (required)
	 * @param expand (optional)
	 * @return List&lt;ApiKey&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<ApiKey> apiKeysReadMultiple(List<String> requestBody, String expand) throws ApiException {
		return apiKeysReadMultipleWithHttpInfo(requestBody, expand).getData();
	}

	/**
	 * readMultiple Gets a list of the entities with the given IDs. IDs that can&#39;t be found are ignored&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the entities (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;List&lt;ApiKey&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<ApiKey>> apiKeysReadMultipleWithHttpInfo(List<String> requestBody, String expand) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling apiKeysReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/apikeys/readMultiple";

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

		GenericType<List<ApiKey>> localVarReturnType = new GenericType<List<ApiKey>>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for api keys in the current account&lt;br&gt;
	 * 
	 * @param apiKeyQuery (required)
	 * @param expand (optional)
	 * @return ApiKeyResult
	 * @throws ApiException if fails to make API call
	 */
	public ApiKeyResult apiKeysSearch(ApiKeyQuery apiKeyQuery, String expand) throws ApiException {
		return apiKeysSearchWithHttpInfo(apiKeyQuery, expand).getData();
	}

	/**
	 * search Search for api keys in the current account&lt;br&gt;
	 * 
	 * @param apiKeyQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ApiKeyResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ApiKeyResult> apiKeysSearchWithHttpInfo(ApiKeyQuery apiKeyQuery, String expand) throws ApiException {
		Object localVarPostBody = apiKeyQuery;

		// verify the required parameter 'apiKeyQuery' is set
		if (apiKeyQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'apiKeyQuery' when calling apiKeysSearch");
		}

		// create path and map variables
		String localVarPath = "/apikeys/search";

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

		GenericType<ApiKeyResult> localVarReturnType = new GenericType<ApiKeyResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param apiKey The entity to update (required)
	 * @param expand (optional)
	 * @return ApiKey
	 * @throws ApiException if fails to make API call
	 */
	public ApiKey apiKeysUpdate(ApiKey apiKey, String expand) throws ApiException {
		return apiKeysUpdateWithHttpInfo(apiKey, expand).getData();
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param apiKey The entity to update (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ApiKey&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ApiKey> apiKeysUpdateWithHttpInfo(ApiKey apiKey, String expand) throws ApiException {
		Object localVarPostBody = apiKey;

		// verify the required parameter 'apiKey' is set
		if (apiKey == null) {
			throw new ApiException(400, "Missing the required parameter 'apiKey' when calling apiKeysUpdate");
		}

		// create path and map variables
		String localVarPath = "/apikeys/update";

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

		GenericType<ApiKey> localVarReturnType = new GenericType<ApiKey>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
