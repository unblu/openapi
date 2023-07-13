package com.unblu.webapi.jersey.v3.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.ws.rs.core.GenericType;

import com.unblu.webapi.jersey.v3.invoker.ApiClient;
import com.unblu.webapi.jersey.v3.invoker.ApiException;
import com.unblu.webapi.jersey.v3.invoker.ApiResponse;
import com.unblu.webapi.jersey.v3.invoker.Configuration;
import com.unblu.webapi.jersey.v3.invoker.Pair;
import com.unblu.webapi.model.v3.Address;
import com.unblu.webapi.model.v3.AddressQuery;
import com.unblu.webapi.model.v3.AddressResult;

public class AddressesApi {
	private ApiClient apiClient;

	public AddressesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AddressesApi(ApiClient apiClient) {
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
	 * @param address The entity to create (required)
	 * @return Address
	 * @throws ApiException if fails to make API call
	 */
	public Address addressesCreate(Address address) throws ApiException {
		return addressesCreateWithHttpInfo(address).getData();
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
	 * 
	 * @param address The entity to create (required)
	 * @return ApiResponse&lt;Address&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Address> addressesCreateWithHttpInfo(Address address) throws ApiException {
		Object localVarPostBody = address;

		// verify the required parameter 'address' is set
		if (address == null) {
			throw new ApiException(400, "Missing the required parameter 'address' when calling addressesCreate");
		}

		// create path and map variables
		String localVarPath = "/addresses/create";

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

		GenericType<Address> localVarReturnType = new GenericType<Address>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void addressesDelete(String id) throws ApiException {

		addressesDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> addressesDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/addresses/delete";

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
	public void addressesDeleteLegacyGet(String id) throws ApiException {

		addressesDeleteLegacyGetWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> addressesDeleteLegacyGetWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/addresses/delete";

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
	 * read Returns the entity for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the entity which should be returned (optional)
	 * @return Address
	 * @throws ApiException if fails to make API call
	 */
	public Address addressesRead(String id) throws ApiException {
		return addressesReadWithHttpInfo(id).getData();
	}

	/**
	 * read Returns the entity for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the entity which should be returned (optional)
	 * @return ApiResponse&lt;Address&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Address> addressesReadWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/addresses/read";

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

		GenericType<Address> localVarReturnType = new GenericType<Address>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of entities for the given ID&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The ID&#39;s for which the entities should be fetched (required)
	 * @return List&lt;Address&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<Address> addressesReadMultiple(List<String> requestBody) throws ApiException {
		return addressesReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple Gets a list of entities for the given ID&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The ID&#39;s for which the entities should be fetched (required)
	 * @return ApiResponse&lt;List&lt;Address&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<Address>> addressesReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling addressesReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/addresses/readMultiple";

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

		GenericType<List<Address>> localVarReturnType = new GenericType<List<Address>>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for addresses in the current account&lt;br&gt;
	 * 
	 * @param addressQuery (required)
	 * @return AddressResult
	 * @throws ApiException if fails to make API call
	 */
	public AddressResult addressesSearch(AddressQuery addressQuery) throws ApiException {
		return addressesSearchWithHttpInfo(addressQuery).getData();
	}

	/**
	 * search Search for addresses in the current account&lt;br&gt;
	 * 
	 * @param addressQuery (required)
	 * @return ApiResponse&lt;AddressResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AddressResult> addressesSearchWithHttpInfo(AddressQuery addressQuery) throws ApiException {
		Object localVarPostBody = addressQuery;

		// verify the required parameter 'addressQuery' is set
		if (addressQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'addressQuery' when calling addressesSearch");
		}

		// create path and map variables
		String localVarPath = "/addresses/search";

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

		GenericType<AddressResult> localVarReturnType = new GenericType<AddressResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param address The entity to update (required)
	 * @return Address
	 * @throws ApiException if fails to make API call
	 */
	public Address addressesUpdate(Address address) throws ApiException {
		return addressesUpdateWithHttpInfo(address).getData();
	}

	/**
	 * update Updates the entity in the system with the given entity.&lt;br&gt;
	 * 
	 * @param address The entity to update (required)
	 * @return ApiResponse&lt;Address&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Address> addressesUpdateWithHttpInfo(Address address) throws ApiException {
		Object localVarPostBody = address;

		// verify the required parameter 'address' is set
		if (address == null) {
			throw new ApiException(400, "Missing the required parameter 'address' when calling addressesUpdate");
		}

		// create path and map variables
		String localVarPath = "/addresses/update";

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

		GenericType<Address> localVarReturnType = new GenericType<Address>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
