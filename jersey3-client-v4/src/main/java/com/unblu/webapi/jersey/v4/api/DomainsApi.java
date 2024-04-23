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
import com.unblu.webapi.model.v4.Domain;
import com.unblu.webapi.model.v4.DomainList;
import com.unblu.webapi.model.v4.DomainQuery;
import com.unblu.webapi.model.v4.DomainResult;

import jakarta.ws.rs.core.GenericType;

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
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
	 * 
	 * @param domain The entity to create (required)
	 * @return Domain
	 * @throws ApiException if fails to make API call
	 */
	public Domain domainsCreate(Domain domain) throws ApiException {
		return domainsCreateWithHttpInfo(domain).getData();
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
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
	 * delete Deletes the domain with the given ID&lt;br&gt;
	 * 
	 * @param domainId The ID of the domain which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void domainsDelete(String domainId) throws ApiException {

		domainsDeleteWithHttpInfo(domainId);
	}

	/**
	 * delete Deletes the domain with the given ID&lt;br&gt;
	 * 
	 * @param domainId The ID of the domain which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> domainsDeleteWithHttpInfo(String domainId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'domainId' is set
		if (domainId == null) {
			throw new ApiException(400, "Missing the required parameter 'domainId' when calling domainsDelete");
		}

		// create path and map variables
		String localVarPath = "/domains/{domainId}/delete"
				.replaceAll("\\{" + "domainId" + "\\}", apiClient.escapeString(domainId.toString()));

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
	 * read Returns the domain with the given ID&lt;br&gt;
	 * 
	 * @param domainId ID of the domain which should be returned (required)
	 * @return Domain
	 * @throws ApiException if fails to make API call
	 */
	public Domain domainsRead(String domainId) throws ApiException {
		return domainsReadWithHttpInfo(domainId).getData();
	}

	/**
	 * read Returns the domain with the given ID&lt;br&gt;
	 * 
	 * @param domainId ID of the domain which should be returned (required)
	 * @return ApiResponse&lt;Domain&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Domain> domainsReadWithHttpInfo(String domainId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'domainId' is set
		if (domainId == null) {
			throw new ApiException(400, "Missing the required parameter 'domainId' when calling domainsRead");
		}

		// create path and map variables
		String localVarPath = "/domains/{domainId}/read"
				.replaceAll("\\{" + "domainId" + "\\}", apiClient.escapeString(domainId.toString()));

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

		GenericType<Domain> localVarReturnType = new GenericType<Domain>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of domains with the given IDs. IDs that can&#39;t be found are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the domains to fetch (required)
	 * @return DomainList
	 * @throws ApiException if fails to make API call
	 */
	public DomainList domainsReadMultiple(List<String> requestBody) throws ApiException {
		return domainsReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple Gets a list of domains with the given IDs. IDs that can&#39;t be found are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the domains to fetch (required)
	 * @return ApiResponse&lt;DomainList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DomainList> domainsReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
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

		GenericType<DomainList> localVarReturnType = new GenericType<DomainList>() {
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
