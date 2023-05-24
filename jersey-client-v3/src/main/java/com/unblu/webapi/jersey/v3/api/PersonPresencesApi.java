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
import com.unblu.webapi.model.v3.PersonPresenceData;
import com.unblu.webapi.model.v3.PersonPresenceQuery;
import com.unblu.webapi.model.v3.PersonPresenceResult;

public class PersonPresencesApi {
	private ApiClient apiClient;

	public PersonPresencesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public PersonPresencesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * read Helper method read a &#x60;PersonPresenceData&#x60; by id&lt;br&gt;
	 * 
	 * @param id (optional)
	 * @return PersonPresenceData
	 * @throws ApiException if fails to make API call
	 */
	public PersonPresenceData personPresencesRead(String id) throws ApiException {
		return personPresencesReadWithHttpInfo(id).getData();
	}

	/**
	 * read Helper method read a &#x60;PersonPresenceData&#x60; by id&lt;br&gt;
	 * 
	 * @param id (optional)
	 * @return ApiResponse&lt;PersonPresenceData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonPresenceData> personPresencesReadWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/personpresences/read";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<PersonPresenceData> localVarReturnType = new GenericType<PersonPresenceData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for person presences in the current account&lt;br&gt;
	 * 
	 * @param personPresenceQuery (required)
	 * @return PersonPresenceResult
	 * @throws ApiException if fails to make API call
	 */
	public PersonPresenceResult personPresencesSearch(PersonPresenceQuery personPresenceQuery) throws ApiException {
		return personPresencesSearchWithHttpInfo(personPresenceQuery).getData();
	}

	/**
	 * search Search for person presences in the current account&lt;br&gt;
	 * 
	 * @param personPresenceQuery (required)
	 * @return ApiResponse&lt;PersonPresenceResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonPresenceResult> personPresencesSearchWithHttpInfo(PersonPresenceQuery personPresenceQuery) throws ApiException {
		Object localVarPostBody = personPresenceQuery;

		// verify the required parameter 'personPresenceQuery' is set
		if (personPresenceQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'personPresenceQuery' when calling personPresencesSearch");
		}

		// create path and map variables
		String localVarPath = "/personpresences/search";

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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<PersonPresenceResult> localVarReturnType = new GenericType<PersonPresenceResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
