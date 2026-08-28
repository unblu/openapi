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
import com.unblu.webapi.model.v4.DictionaryData;
import com.unblu.webapi.model.v4.ExpandFields;

import jakarta.ws.rs.core.GenericType;

public class DictionariesApi {
	private ApiClient apiClient;

	public DictionariesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public DictionariesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates a new dictionary.&lt;br&gt;
	 * 
	 * @param dictionaryData the dictionary to create (required)
	 * @param expand (optional)
	 * @return DictionaryData
	 * @throws ApiException if fails to make API call
	 */
	public DictionaryData dictionariesCreate(DictionaryData dictionaryData, List<ExpandFields> expand) throws ApiException {
		return dictionariesCreateWithHttpInfo(dictionaryData, expand).getData();
	}

	/**
	 * create Creates a new dictionary.&lt;br&gt;
	 * 
	 * @param dictionaryData the dictionary to create (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;DictionaryData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DictionaryData> dictionariesCreateWithHttpInfo(DictionaryData dictionaryData, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = dictionaryData;

		// verify the required parameter 'dictionaryData' is set
		if (dictionaryData == null) {
			throw new ApiException(400, "Missing the required parameter 'dictionaryData' when calling dictionariesCreate");
		}

		// create path and map variables
		String localVarPath = "/dictionaries/create";

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

		GenericType<DictionaryData> localVarReturnType = new GenericType<DictionaryData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes an existing dictionary.&lt;br&gt;
	 * 
	 * @param dictionaryId the ID of the dictionary to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public void dictionariesDelete(String dictionaryId) throws ApiException {

		dictionariesDeleteWithHttpInfo(dictionaryId);
	}

	/**
	 * delete Deletes an existing dictionary.&lt;br&gt;
	 * 
	 * @param dictionaryId the ID of the dictionary to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> dictionariesDeleteWithHttpInfo(String dictionaryId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'dictionaryId' is set
		if (dictionaryId == null) {
			throw new ApiException(400, "Missing the required parameter 'dictionaryId' when calling dictionariesDelete");
		}

		// create path and map variables
		String localVarPath = "/dictionaries/{dictionaryId}/delete"
				.replaceAll("\\{" + "dictionaryId" + "\\}", apiClient.escapeString(dictionaryId.toString()));

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
	 * getByLanguage Searches for an existing dictionary with the specified language.&lt;br&gt;
	 * 
	 * @param language the language of the dictionary (optional)
	 * @param expand (optional)
	 * @return DictionaryData
	 * @throws ApiException if fails to make API call
	 */
	public DictionaryData dictionariesGetByLanguage(String language, List<ExpandFields> expand) throws ApiException {
		return dictionariesGetByLanguageWithHttpInfo(language, expand).getData();
	}

	/**
	 * getByLanguage Searches for an existing dictionary with the specified language.&lt;br&gt;
	 * 
	 * @param language the language of the dictionary (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;DictionaryData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DictionaryData> dictionariesGetByLanguageWithHttpInfo(String language, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/dictionaries/getByLanguage";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<DictionaryData> localVarReturnType = new GenericType<DictionaryData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Reads an existing dictionary.&lt;br&gt;
	 * 
	 * @param dictionaryId the ID of the dictionary (required)
	 * @param expand (optional)
	 * @return DictionaryData
	 * @throws ApiException if fails to make API call
	 */
	public DictionaryData dictionariesRead(String dictionaryId, List<ExpandFields> expand) throws ApiException {
		return dictionariesReadWithHttpInfo(dictionaryId, expand).getData();
	}

	/**
	 * read Reads an existing dictionary.&lt;br&gt;
	 * 
	 * @param dictionaryId the ID of the dictionary (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;DictionaryData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DictionaryData> dictionariesReadWithHttpInfo(String dictionaryId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'dictionaryId' is set
		if (dictionaryId == null) {
			throw new ApiException(400, "Missing the required parameter 'dictionaryId' when calling dictionariesRead");
		}

		// create path and map variables
		String localVarPath = "/dictionaries/{dictionaryId}/read"
				.replaceAll("\\{" + "dictionaryId" + "\\}", apiClient.escapeString(dictionaryId.toString()));

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

		GenericType<DictionaryData> localVarReturnType = new GenericType<DictionaryData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates an existing dictionary.&lt;br&gt;
	 * 
	 * @param dictionaryData the dictionary to update (required)
	 * @param expand (optional)
	 * @return DictionaryData
	 * @throws ApiException if fails to make API call
	 */
	public DictionaryData dictionariesUpdate(DictionaryData dictionaryData, List<ExpandFields> expand) throws ApiException {
		return dictionariesUpdateWithHttpInfo(dictionaryData, expand).getData();
	}

	/**
	 * update Updates an existing dictionary.&lt;br&gt;
	 * 
	 * @param dictionaryData the dictionary to update (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;DictionaryData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DictionaryData> dictionariesUpdateWithHttpInfo(DictionaryData dictionaryData, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = dictionaryData;

		// verify the required parameter 'dictionaryData' is set
		if (dictionaryData == null) {
			throw new ApiException(400, "Missing the required parameter 'dictionaryData' when calling dictionariesUpdate");
		}

		// create path and map variables
		String localVarPath = "/dictionaries/update";

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

		GenericType<DictionaryData> localVarReturnType = new GenericType<DictionaryData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
