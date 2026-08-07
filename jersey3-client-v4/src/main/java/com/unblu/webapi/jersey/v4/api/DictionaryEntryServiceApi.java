package com.unblu.webapi.jersey.v4.api;

import com.unblu.webapi.jersey.v4.invoker.ApiException;
import com.unblu.webapi.jersey.v4.invoker.ApiClient;
import com.unblu.webapi.jersey.v4.invoker.ApiResponse;
import com.unblu.webapi.jersey.v4.invoker.Configuration;
import com.unblu.webapi.jersey.v4.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.unblu.webapi.model.v4.DictionaryEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryEntryServiceApi {
	private ApiClient apiClient;

	public DictionaryEntryServiceApi() {
		this(Configuration.getDefaultApiClient());
	}

	public DictionaryEntryServiceApi(ApiClient apiClient) {
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
	 * @param dictionaryEntry The entity to create (required)
	 * @return DictionaryEntry
	 * @throws ApiException if fails to make API call
	 */
	public DictionaryEntry dictionaryEntryServiceCreate(DictionaryEntry dictionaryEntry) throws ApiException {
		return dictionaryEntryServiceCreateWithHttpInfo(dictionaryEntry).getData();
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
	 * 
	 * @param dictionaryEntry The entity to create (required)
	 * @return ApiResponse&lt;DictionaryEntry&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DictionaryEntry> dictionaryEntryServiceCreateWithHttpInfo(DictionaryEntry dictionaryEntry) throws ApiException {
		Object localVarPostBody = dictionaryEntry;

		// verify the required parameter 'dictionaryEntry' is set
		if (dictionaryEntry == null) {
			throw new ApiException(400, "Missing the required parameter 'dictionaryEntry' when calling dictionaryEntryServiceCreate");
		}

		// create path and map variables
		String localVarPath = "/dictionaryentryservice/create";

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

		GenericType<DictionaryEntry> localVarReturnType = new GenericType<DictionaryEntry>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the dictionary entry with the given ID&lt;br&gt;
	 * 
	 * @param dictionaryEntryId The ID of the dictionary entry to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public void dictionaryEntryServiceDelete(String dictionaryEntryId) throws ApiException {

		dictionaryEntryServiceDeleteWithHttpInfo(dictionaryEntryId);
	}

	/**
	 * delete Deletes the dictionary entry with the given ID&lt;br&gt;
	 * 
	 * @param dictionaryEntryId The ID of the dictionary entry to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> dictionaryEntryServiceDeleteWithHttpInfo(String dictionaryEntryId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'dictionaryEntryId' is set
		if (dictionaryEntryId == null) {
			throw new ApiException(400, "Missing the required parameter 'dictionaryEntryId' when calling dictionaryEntryServiceDelete");
		}

		// create path and map variables
		String localVarPath = "/dictionaryentryservice/{dictionaryEntryId}/delete"
				.replaceAll("\\{" + "dictionaryEntryId" + "\\}", apiClient.escapeString(dictionaryEntryId.toString()));

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
	 * read Returns the dictionary entry with the given ID&lt;br&gt;
	 * 
	 * @param dictionaryEntryId ID of the dictionary entry to return (required)
	 * @return DictionaryEntry
	 * @throws ApiException if fails to make API call
	 */
	public DictionaryEntry dictionaryEntryServiceRead(String dictionaryEntryId) throws ApiException {
		return dictionaryEntryServiceReadWithHttpInfo(dictionaryEntryId).getData();
	}

	/**
	 * read Returns the dictionary entry with the given ID&lt;br&gt;
	 * 
	 * @param dictionaryEntryId ID of the dictionary entry to return (required)
	 * @return ApiResponse&lt;DictionaryEntry&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DictionaryEntry> dictionaryEntryServiceReadWithHttpInfo(String dictionaryEntryId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'dictionaryEntryId' is set
		if (dictionaryEntryId == null) {
			throw new ApiException(400, "Missing the required parameter 'dictionaryEntryId' when calling dictionaryEntryServiceRead");
		}

		// create path and map variables
		String localVarPath = "/dictionaryentryservice/{dictionaryEntryId}/read"
				.replaceAll("\\{" + "dictionaryEntryId" + "\\}", apiClient.escapeString(dictionaryEntryId.toString()));

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

		GenericType<DictionaryEntry> localVarReturnType = new GenericType<DictionaryEntry>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param dictionaryEntry The entity to update (required)
	 * @return DictionaryEntry
	 * @throws ApiException if fails to make API call
	 */
	public DictionaryEntry dictionaryEntryServiceUpdate(DictionaryEntry dictionaryEntry) throws ApiException {
		return dictionaryEntryServiceUpdateWithHttpInfo(dictionaryEntry).getData();
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param dictionaryEntry The entity to update (required)
	 * @return ApiResponse&lt;DictionaryEntry&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DictionaryEntry> dictionaryEntryServiceUpdateWithHttpInfo(DictionaryEntry dictionaryEntry) throws ApiException {
		Object localVarPostBody = dictionaryEntry;

		// verify the required parameter 'dictionaryEntry' is set
		if (dictionaryEntry == null) {
			throw new ApiException(400, "Missing the required parameter 'dictionaryEntry' when calling dictionaryEntryServiceUpdate");
		}

		// create path and map variables
		String localVarPath = "/dictionaryentryservice/update";

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

		GenericType<DictionaryEntry> localVarReturnType = new GenericType<DictionaryEntry>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
