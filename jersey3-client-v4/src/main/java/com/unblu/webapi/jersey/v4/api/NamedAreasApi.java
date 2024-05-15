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
import com.unblu.webapi.model.v4.NamedArea;
import com.unblu.webapi.model.v4.NamedAreaList;
import com.unblu.webapi.model.v4.NamedAreaQuery;
import com.unblu.webapi.model.v4.NamedAreaResult;

import jakarta.ws.rs.core.GenericType;

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
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
	 * 
	 * @param namedArea The entity to create (required)
	 * @param expand (optional)
	 * @return NamedArea
	 * @throws ApiException if fails to make API call
	 */
	public NamedArea namedAreasCreate(NamedArea namedArea, List<ExpandFields> expand) throws ApiException {
		return namedAreasCreateWithHttpInfo(namedArea, expand).getData();
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
	 * 
	 * @param namedArea The entity to create (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;NamedArea&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<NamedArea> namedAreasCreateWithHttpInfo(NamedArea namedArea, List<ExpandFields> expand) throws ApiException {
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

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

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
	 * delete Deletes the named area with the given ID&lt;br&gt;
	 * 
	 * @param namedAreaId The ID of the named area which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void namedAreasDelete(String namedAreaId) throws ApiException {

		namedAreasDeleteWithHttpInfo(namedAreaId);
	}

	/**
	 * delete Deletes the named area with the given ID&lt;br&gt;
	 * 
	 * @param namedAreaId The ID of the named area which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> namedAreasDeleteWithHttpInfo(String namedAreaId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'namedAreaId' is set
		if (namedAreaId == null) {
			throw new ApiException(400, "Missing the required parameter 'namedAreaId' when calling namedAreasDelete");
		}

		// create path and map variables
		String localVarPath = "/namedareas/{namedAreaId}/delete"
				.replaceAll("\\{" + "namedAreaId" + "\\}", apiClient.escapeString(namedAreaId.toString()));

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
	 * read Returns the named area with the given ID&lt;br&gt;
	 * 
	 * @param namedAreaId ID of the named area which should be returned (required)
	 * @param expand (optional)
	 * @return NamedArea
	 * @throws ApiException if fails to make API call
	 */
	public NamedArea namedAreasRead(String namedAreaId, List<ExpandFields> expand) throws ApiException {
		return namedAreasReadWithHttpInfo(namedAreaId, expand).getData();
	}

	/**
	 * read Returns the named area with the given ID&lt;br&gt;
	 * 
	 * @param namedAreaId ID of the named area which should be returned (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;NamedArea&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<NamedArea> namedAreasReadWithHttpInfo(String namedAreaId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'namedAreaId' is set
		if (namedAreaId == null) {
			throw new ApiException(400, "Missing the required parameter 'namedAreaId' when calling namedAreasRead");
		}

		// create path and map variables
		String localVarPath = "/namedareas/{namedAreaId}/read"
				.replaceAll("\\{" + "namedAreaId" + "\\}", apiClient.escapeString(namedAreaId.toString()));

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
	 * @return NamedAreaList
	 * @throws ApiException if fails to make API call
	 */
	public NamedAreaList namedAreasReadMultiple(List<String> requestBody, List<ExpandFields> expand) throws ApiException {
		return namedAreasReadMultipleWithHttpInfo(requestBody, expand).getData();
	}

	/**
	 * readMultiple Gets a list of named areas for the given id&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The id&#39;s for which the named areas should be fetched (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;NamedAreaList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<NamedAreaList> namedAreasReadMultipleWithHttpInfo(List<String> requestBody, List<ExpandFields> expand) throws ApiException {
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

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<NamedAreaList> localVarReturnType = new GenericType<NamedAreaList>() {
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
	public NamedAreaResult namedAreasSearch(NamedAreaQuery namedAreaQuery, List<ExpandFields> expand) throws ApiException {
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
	public ApiResponse<NamedAreaResult> namedAreasSearchWithHttpInfo(NamedAreaQuery namedAreaQuery, List<ExpandFields> expand) throws ApiException {
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

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

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
	public NamedArea namedAreasUpdate(NamedArea namedArea, List<ExpandFields> expand) throws ApiException {
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
	public ApiResponse<NamedArea> namedAreasUpdateWithHttpInfo(NamedArea namedArea, List<ExpandFields> expand) throws ApiException {
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

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

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
