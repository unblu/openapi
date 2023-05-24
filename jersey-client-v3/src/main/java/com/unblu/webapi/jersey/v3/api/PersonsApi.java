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
import com.unblu.webapi.model.v3.EPersonSource;
import com.unblu.webapi.model.v3.PersonData;
import com.unblu.webapi.model.v3.PersonQuery;
import com.unblu.webapi.model.v3.PersonResult;

public class PersonsApi {
	private ApiClient apiClient;

	public PersonsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public PersonsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * createOrUpdateBot Updates and returns an existing bot person or creates and returns a bot person if absent.&lt;br&gt;
	 * 
	 * @param personData person data (required)
	 * @param expand (optional)
	 * @return PersonData
	 * @throws ApiException if fails to make API call
	 */
	public PersonData personsCreateOrUpdateBot(PersonData personData, String expand) throws ApiException {
		return personsCreateOrUpdateBotWithHttpInfo(personData, expand).getData();
	}

	/**
	 * createOrUpdateBot Updates and returns an existing bot person or creates and returns a bot person if absent.&lt;br&gt;
	 * 
	 * @param personData person data (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonData> personsCreateOrUpdateBotWithHttpInfo(PersonData personData, String expand) throws ApiException {
		Object localVarPostBody = personData;

		// verify the required parameter 'personData' is set
		if (personData == null) {
			throw new ApiException(400, "Missing the required parameter 'personData' when calling personsCreateOrUpdateBot");
		}

		// create path and map variables
		String localVarPath = "/persons/createOrUpdateBot";

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

		GenericType<PersonData> localVarReturnType = new GenericType<PersonData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * createOrUpdateVirtual Updates and returns an existing virtual person or creates and returns a virtual person if absent.&lt;br&gt;
	 * 
	 * @param personData person data (required)
	 * @param expand (optional)
	 * @return PersonData
	 * @throws ApiException if fails to make API call
	 */
	public PersonData personsCreateOrUpdateVirtual(PersonData personData, String expand) throws ApiException {
		return personsCreateOrUpdateVirtualWithHttpInfo(personData, expand).getData();
	}

	/**
	 * createOrUpdateVirtual Updates and returns an existing virtual person or creates and returns a virtual person if absent.&lt;br&gt;
	 * 
	 * @param personData person data (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonData> personsCreateOrUpdateVirtualWithHttpInfo(PersonData personData, String expand) throws ApiException {
		Object localVarPostBody = personData;

		// verify the required parameter 'personData' is set
		if (personData == null) {
			throw new ApiException(400, "Missing the required parameter 'personData' when calling personsCreateOrUpdateVirtual");
		}

		// create path and map variables
		String localVarPath = "/persons/createOrUpdateVirtual";

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

		GenericType<PersonData> localVarReturnType = new GenericType<PersonData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getBySource Returns a person by source&lt;br&gt;
	 * 
	 * @param personSource Source of the of the person (optional)
	 * @param sourceId Identifier of the person in its source (optional)
	 * @param expand (optional)
	 * @return PersonData
	 * @throws ApiException if fails to make API call
	 */
	public PersonData personsGetBySource(EPersonSource personSource, String sourceId, String expand) throws ApiException {
		return personsGetBySourceWithHttpInfo(personSource, sourceId, expand).getData();
	}

	/**
	 * getBySource Returns a person by source&lt;br&gt;
	 * 
	 * @param personSource Source of the of the person (optional)
	 * @param sourceId Identifier of the person in its source (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonData> personsGetBySourceWithHttpInfo(EPersonSource personSource, String sourceId, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/persons/getBySource";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "personSource", personSource));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceId", sourceId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<PersonData> localVarReturnType = new GenericType<PersonData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Method to read a &#x60;PersonData&#x60; by id&lt;br&gt;
	 * 
	 * @param id the personId (optional)
	 * @param expand (optional)
	 * @return PersonData
	 * @throws ApiException if fails to make API call
	 */
	public PersonData personsRead(String id, String expand) throws ApiException {
		return personsReadWithHttpInfo(id, expand).getData();
	}

	/**
	 * read Method to read a &#x60;PersonData&#x60; by id&lt;br&gt;
	 * 
	 * @param id the personId (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonData> personsReadWithHttpInfo(String id, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/persons/read";

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

		GenericType<PersonData> localVarReturnType = new GenericType<PersonData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for persons in the current account&lt;br&gt;
	 * 
	 * @param personQuery (required)
	 * @param expand (optional)
	 * @return PersonResult
	 * @throws ApiException if fails to make API call
	 */
	public PersonResult personsSearch(PersonQuery personQuery, String expand) throws ApiException {
		return personsSearchWithHttpInfo(personQuery, expand).getData();
	}

	/**
	 * search Search for persons in the current account&lt;br&gt;
	 * 
	 * @param personQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonResult> personsSearchWithHttpInfo(PersonQuery personQuery, String expand) throws ApiException {
		Object localVarPostBody = personQuery;

		// verify the required parameter 'personQuery' is set
		if (personQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'personQuery' when calling personsSearch");
		}

		// create path and map variables
		String localVarPath = "/persons/search";

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

		GenericType<PersonResult> localVarReturnType = new GenericType<PersonResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
