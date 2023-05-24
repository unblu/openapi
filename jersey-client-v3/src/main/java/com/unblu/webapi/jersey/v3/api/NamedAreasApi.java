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
import com.unblu.webapi.model.v3.NamedArea;
import com.unblu.webapi.model.v3.NamedAreaQuery;
import com.unblu.webapi.model.v3.NamedAreaResult;

public class NamedAreasApi {
	private ApiClient apiClient;

	public NamedAreasApi() {
		this(Configuration.getDefaultApiClient());
	}

	public NamedAreasApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates the given entity in the system. The id of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
	 * 
	 * @param namedArea The entity to create (required)
	 * @param expand (optional)
	 * @return NamedArea
	 * @throws ApiException if fails to make API call
	 */
	public NamedArea namedAreasCreate(NamedArea namedArea, String expand) throws ApiException {
		return namedAreasCreateWithHttpInfo(namedArea, expand).getData();
	}

	/**
	 * create Creates the given entity in the system. The id of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
	 * 
	 * @param namedArea The entity to create (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;NamedArea&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<NamedArea> namedAreasCreateWithHttpInfo(NamedArea namedArea, String expand) throws ApiException {
		Object localVarPostBody = namedArea;

		// verify the required parameter 'namedArea' is set
		if (namedArea == null) {
			throw new ApiException(400, "Missing the required parameter 'namedArea' when calling namedAreasCreate");
		}

		// create path and map variables
		String localVarPath = "/namedareas/create";

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

		GenericType<NamedArea> localVarReturnType = new GenericType<NamedArea>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the entity for the given id&lt;br&gt;
	 * 
	 * @param id The id of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void namedAreasDelete(String id) throws ApiException {

		namedAreasDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given id&lt;br&gt;
	 * 
	 * @param id The id of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> namedAreasDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/namedareas/delete";

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
	 * delete Deletes the entity for the given id&lt;br&gt;
	 * 
	 * @param id The id of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void namedAreasDeleteLegacyGet(String id) throws ApiException {

		namedAreasDeleteLegacyGetWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given id&lt;br&gt;
	 * 
	 * @param id The id of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> namedAreasDeleteLegacyGetWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/namedareas/delete";

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
	 * getQuotaUsage Returns the number of entities already existing (for the current account)&lt;br&gt;
	 * 
	 * @return Integer
	 * @throws ApiException if fails to make API call
	 */
	public Integer namedAreasGetQuotaUsage() throws ApiException {
		return namedAreasGetQuotaUsageWithHttpInfo().getData();
	}

	/**
	 * getQuotaUsage Returns the number of entities already existing (for the current account)&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;Integer&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Integer> namedAreasGetQuotaUsageWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/namedareas/getQuotaUsage";

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
	 * read Returns the named area for the given id&lt;br&gt;
	 * 
	 * @param id Id of the named area which should be returned (optional)
	 * @param expand (optional)
	 * @return NamedArea
	 * @throws ApiException if fails to make API call
	 */
	public NamedArea namedAreasRead(String id, String expand) throws ApiException {
		return namedAreasReadWithHttpInfo(id, expand).getData();
	}

	/**
	 * read Returns the named area for the given id&lt;br&gt;
	 * 
	 * @param id Id of the named area which should be returned (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;NamedArea&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<NamedArea> namedAreasReadWithHttpInfo(String id, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/namedareas/read";

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

		GenericType<NamedArea> localVarReturnType = new GenericType<NamedArea>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of named areas for the given id&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The id&#39;s for which the named areas should be fetched (required)
	 * @param expand (optional)
	 * @return List&lt;NamedArea&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<NamedArea> namedAreasReadMultiple(List<String> requestBody, String expand) throws ApiException {
		return namedAreasReadMultipleWithHttpInfo(requestBody, expand).getData();
	}

	/**
	 * readMultiple Gets a list of named areas for the given id&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The id&#39;s for which the named areas should be fetched (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;List&lt;NamedArea&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<NamedArea>> namedAreasReadMultipleWithHttpInfo(List<String> requestBody, String expand) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling namedAreasReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/namedareas/readMultiple";

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

		GenericType<List<NamedArea>> localVarReturnType = new GenericType<List<NamedArea>>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for named areas in the current account&lt;br&gt;
	 * 
	 * @param namedAreaQuery (required)
	 * @param expand (optional)
	 * @return NamedAreaResult
	 * @throws ApiException if fails to make API call
	 */
	public NamedAreaResult namedAreasSearch(NamedAreaQuery namedAreaQuery, String expand) throws ApiException {
		return namedAreasSearchWithHttpInfo(namedAreaQuery, expand).getData();
	}

	/**
	 * search Search for named areas in the current account&lt;br&gt;
	 * 
	 * @param namedAreaQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;NamedAreaResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<NamedAreaResult> namedAreasSearchWithHttpInfo(NamedAreaQuery namedAreaQuery, String expand) throws ApiException {
		Object localVarPostBody = namedAreaQuery;

		// verify the required parameter 'namedAreaQuery' is set
		if (namedAreaQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'namedAreaQuery' when calling namedAreasSearch");
		}

		// create path and map variables
		String localVarPath = "/namedareas/search";

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

		GenericType<NamedAreaResult> localVarReturnType = new GenericType<NamedAreaResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param namedArea The entity to update (required)
	 * @param expand (optional)
	 * @return NamedArea
	 * @throws ApiException if fails to make API call
	 */
	public NamedArea namedAreasUpdate(NamedArea namedArea, String expand) throws ApiException {
		return namedAreasUpdateWithHttpInfo(namedArea, expand).getData();
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param namedArea The entity to update (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;NamedArea&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<NamedArea> namedAreasUpdateWithHttpInfo(NamedArea namedArea, String expand) throws ApiException {
		Object localVarPostBody = namedArea;

		// verify the required parameter 'namedArea' is set
		if (namedArea == null) {
			throw new ApiException(400, "Missing the required parameter 'namedArea' when calling namedAreasUpdate");
		}

		// create path and map variables
		String localVarPath = "/namedareas/update";

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

		GenericType<NamedArea> localVarReturnType = new GenericType<NamedArea>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
