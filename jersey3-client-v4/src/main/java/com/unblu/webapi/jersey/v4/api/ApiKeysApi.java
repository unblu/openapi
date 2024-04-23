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
import com.unblu.webapi.model.v4.ApiKey;
import com.unblu.webapi.model.v4.ApiKeyList;
import com.unblu.webapi.model.v4.ApiKeyQuery;
import com.unblu.webapi.model.v4.ApiKeyResult;

import jakarta.ws.rs.core.GenericType;

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
	 * delete Deletes the API key with the given ID&lt;br&gt;
	 * 
	 * @param apiKeyId The ID of the API key which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void apiKeysDelete(String apiKeyId) throws ApiException {

		apiKeysDeleteWithHttpInfo(apiKeyId);
	}

	/**
	 * delete Deletes the API key with the given ID&lt;br&gt;
	 * 
	 * @param apiKeyId The ID of the API key which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> apiKeysDeleteWithHttpInfo(String apiKeyId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'apiKeyId' is set
		if (apiKeyId == null) {
			throw new ApiException(400, "Missing the required parameter 'apiKeyId' when calling apiKeysDelete");
		}

		// create path and map variables
		String localVarPath = "/apikeys/{apiKeyId}/delete"
				.replaceAll("\\{" + "apiKeyId" + "\\}", apiClient.escapeString(apiKeyId.toString()));

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
	 * getDefault Returns the default API key for the current account&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return ApiKey
	 * @throws ApiException if fails to make API call
	 */
	public ApiKey apiKeysGetDefault(String expand) throws ApiException {
		return apiKeysGetDefaultWithHttpInfo(expand).getData();
	}

	/**
	 * getDefault Returns the default API key for the current account&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return ApiResponse&lt;ApiKey&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ApiKey> apiKeysGetDefaultWithHttpInfo(String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/apikeys/getDefault";

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
	 * read Returns the API key with the given ID&lt;br&gt;
	 * 
	 * @param apiKeyId ID of the API key which should be returned (required)
	 * @param expand (optional)
	 * @return ApiKey
	 * @throws ApiException if fails to make API call
	 */
	public ApiKey apiKeysRead(String apiKeyId, String expand) throws ApiException {
		return apiKeysReadWithHttpInfo(apiKeyId, expand).getData();
	}

	/**
	 * read Returns the API key with the given ID&lt;br&gt;
	 * 
	 * @param apiKeyId ID of the API key which should be returned (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ApiKey&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ApiKey> apiKeysReadWithHttpInfo(String apiKeyId, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'apiKeyId' is set
		if (apiKeyId == null) {
			throw new ApiException(400, "Missing the required parameter 'apiKeyId' when calling apiKeysRead");
		}

		// create path and map variables
		String localVarPath = "/apikeys/{apiKeyId}/read"
				.replaceAll("\\{" + "apiKeyId" + "\\}", apiClient.escapeString(apiKeyId.toString()));

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
	 * readMultiple Gets a list of API keys with the given IDs. IDs that can&#39;t be found are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the API keys to fetch (required)
	 * @param expand (optional)
	 * @return ApiKeyList
	 * @throws ApiException if fails to make API call
	 */
	public ApiKeyList apiKeysReadMultiple(List<String> requestBody, String expand) throws ApiException {
		return apiKeysReadMultipleWithHttpInfo(requestBody, expand).getData();
	}

	/**
	 * readMultiple Gets a list of API keys with the given IDs. IDs that can&#39;t be found are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the API keys to fetch (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;ApiKeyList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ApiKeyList> apiKeysReadMultipleWithHttpInfo(List<String> requestBody, String expand) throws ApiException {
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

		GenericType<ApiKeyList> localVarReturnType = new GenericType<ApiKeyList>() {
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
