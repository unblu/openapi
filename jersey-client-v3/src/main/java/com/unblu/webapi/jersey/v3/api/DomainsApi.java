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
import com.unblu.webapi.model.v3.Domain;
import com.unblu.webapi.model.v3.DomainQuery;
import com.unblu.webapi.model.v3.DomainResult;

public class DomainsApi {
	private ApiClient apiClient;

	public DomainsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public DomainsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
	 * 
	 * @param domain The entity to create (required)
	 * @return Domain
	 * @throws ApiException if fails to make API call
	 */
	public Domain domainsCreate(Domain domain) throws ApiException {
		return domainsCreateWithHttpInfo(domain).getData();
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
	 * 
	 * @param domain The entity to create (required)
	 * @return ApiResponse&lt;Domain&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Domain> domainsCreateWithHttpInfo(Domain domain) throws ApiException {
		Object localVarPostBody = domain;

		// verify the required parameter 'domain' is set
		if (domain == null) {
			throw new ApiException(400, "Missing the required parameter 'domain' when calling domainsCreate");
		}

		// create path and map variables
		String localVarPath = "/domains/create";

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

		GenericType<Domain> localVarReturnType = new GenericType<Domain>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void domainsDelete(String id) throws ApiException {

		domainsDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> domainsDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/domains/delete";

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
	public void domainsDeleteLegacyGet(String id) throws ApiException {

		domainsDeleteLegacyGetWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> domainsDeleteLegacyGetWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/domains/delete";

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
	 * getAccountDomainsAsString Returns all configured domains for the current account as strings&lt;br&gt;
	 * 
	 * @return List&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<String> domainsGetAccountDomainsAsString() throws ApiException {
		return domainsGetAccountDomainsAsStringWithHttpInfo().getData();
	}

	/**
	 * getAccountDomainsAsString Returns all configured domains for the current account as strings&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;List&lt;String&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<String>> domainsGetAccountDomainsAsStringWithHttpInfo() throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/domains/getAccountDomainsAsString";

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

		GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getQuotaUsage Returns the number of entities already existing (for the current account)&lt;br&gt;
	 * 
	 * @return Integer
	 * @throws ApiException if fails to make API call
	 */
	public Integer domainsGetQuotaUsage() throws ApiException {
		return domainsGetQuotaUsageWithHttpInfo().getData();
	}

	/**
	 * getQuotaUsage Returns the number of entities already existing (for the current account)&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;Integer&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Integer> domainsGetQuotaUsageWithHttpInfo() throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/domains/getQuotaUsage";

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
	 * @return Domain
	 * @throws ApiException if fails to make API call
	 */
	public Domain domainsRead(String id) throws ApiException {
		return domainsReadWithHttpInfo(id).getData();
	}

	/**
	 * read Returns the entity for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the entity which should be returned (optional)
	 * @return ApiResponse&lt;Domain&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Domain> domainsReadWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/domains/read";

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

		GenericType<Domain> localVarReturnType = new GenericType<Domain>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of entities for the given ID&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The ID&#39;s for which the entities should be fetched (required)
	 * @return List&lt;Domain&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<Domain> domainsReadMultiple(List<String> requestBody) throws ApiException {
		return domainsReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple Gets a list of entities for the given ID&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The ID&#39;s for which the entities should be fetched (required)
	 * @return ApiResponse&lt;List&lt;Domain&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<Domain>> domainsReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling domainsReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/domains/readMultiple";

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

		GenericType<List<Domain>> localVarReturnType = new GenericType<List<Domain>>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for domains in the current account&lt;br&gt;
	 * 
	 * @param domainQuery (required)
	 * @return DomainResult
	 * @throws ApiException if fails to make API call
	 */
	public DomainResult domainsSearch(DomainQuery domainQuery) throws ApiException {
		return domainsSearchWithHttpInfo(domainQuery).getData();
	}

	/**
	 * search Search for domains in the current account&lt;br&gt;
	 * 
	 * @param domainQuery (required)
	 * @return ApiResponse&lt;DomainResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DomainResult> domainsSearchWithHttpInfo(DomainQuery domainQuery) throws ApiException {
		Object localVarPostBody = domainQuery;

		// verify the required parameter 'domainQuery' is set
		if (domainQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'domainQuery' when calling domainsSearch");
		}

		// create path and map variables
		String localVarPath = "/domains/search";

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

		GenericType<DomainResult> localVarReturnType = new GenericType<DomainResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param domain The entity to update (required)
	 * @return Domain
	 * @throws ApiException if fails to make API call
	 */
	public Domain domainsUpdate(Domain domain) throws ApiException {
		return domainsUpdateWithHttpInfo(domain).getData();
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param domain The entity to update (required)
	 * @return ApiResponse&lt;Domain&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Domain> domainsUpdateWithHttpInfo(Domain domain) throws ApiException {
		Object localVarPostBody = domain;

		// verify the required parameter 'domain' is set
		if (domain == null) {
			throw new ApiException(400, "Missing the required parameter 'domain' when calling domainsUpdate");
		}

		// create path and map variables
		String localVarPath = "/domains/update";

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

		GenericType<Domain> localVarReturnType = new GenericType<Domain>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
