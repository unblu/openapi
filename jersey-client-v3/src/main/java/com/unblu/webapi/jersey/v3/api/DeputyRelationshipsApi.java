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
import com.unblu.webapi.model.v3.DeputyRelationship;
import com.unblu.webapi.model.v3.DeputyRelationshipQuery;
import com.unblu.webapi.model.v3.DeputyRelationshipResult;
import com.unblu.webapi.model.v3.WriteAgentDeputyRelationshipsBody;

public class DeputyRelationshipsApi {
	private ApiClient apiClient;

	public DeputyRelationshipsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public DeputyRelationshipsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates the given deputy relationship in the system. The id of the deputy relationship can not be set for create operation, a new one is
	 * generated.&lt;br&gt;
	 * 
	 * @param deputyRelationship The deputy relationship to create (required)
	 * @return DeputyRelationship
	 * @throws ApiException if fails to make API call
	 */
	public DeputyRelationship deputyRelationshipsCreate(DeputyRelationship deputyRelationship) throws ApiException {
		return deputyRelationshipsCreateWithHttpInfo(deputyRelationship).getData();
	}

	/**
	 * create Creates the given deputy relationship in the system. The id of the deputy relationship can not be set for create operation, a new one is
	 * generated.&lt;br&gt;
	 * 
	 * @param deputyRelationship The deputy relationship to create (required)
	 * @return ApiResponse&lt;DeputyRelationship&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DeputyRelationship> deputyRelationshipsCreateWithHttpInfo(DeputyRelationship deputyRelationship) throws ApiException {
		Object localVarPostBody = deputyRelationship;

		// verify the required parameter 'deputyRelationship' is set
		if (deputyRelationship == null) {
			throw new ApiException(400, "Missing the required parameter 'deputyRelationship' when calling deputyRelationshipsCreate");
		}

		// create path and map variables
		String localVarPath = "/deputyrelationships/create";

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

		GenericType<DeputyRelationship> localVarReturnType = new GenericType<DeputyRelationship>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the deputy relationship for the given id&lt;br&gt;
	 * 
	 * @param id The id of the deputy relationship which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void deputyRelationshipsDelete(String id) throws ApiException {

		deputyRelationshipsDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes the deputy relationship for the given id&lt;br&gt;
	 * 
	 * @param id The id of the deputy relationship which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> deputyRelationshipsDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/deputyrelationships/delete";

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
	 * read Returns the deputy relationship for the given id&lt;br&gt;
	 * 
	 * @param id Id of the deputy relationship which should be returned (optional)
	 * @return DeputyRelationship
	 * @throws ApiException if fails to make API call
	 */
	public DeputyRelationship deputyRelationshipsRead(String id) throws ApiException {
		return deputyRelationshipsReadWithHttpInfo(id).getData();
	}

	/**
	 * read Returns the deputy relationship for the given id&lt;br&gt;
	 * 
	 * @param id Id of the deputy relationship which should be returned (optional)
	 * @return ApiResponse&lt;DeputyRelationship&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DeputyRelationship> deputyRelationshipsReadWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/deputyrelationships/read";

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

		GenericType<DeputyRelationship> localVarReturnType = new GenericType<DeputyRelationship>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of deputy relationships for the given id&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The id&#39;s for which the deputy relationships should be fetched (required)
	 * @return List&lt;DeputyRelationship&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<DeputyRelationship> deputyRelationshipsReadMultiple(List<String> requestBody) throws ApiException {
		return deputyRelationshipsReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple Gets a list of deputy relationships for the given id&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The id&#39;s for which the deputy relationships should be fetched (required)
	 * @return ApiResponse&lt;List&lt;DeputyRelationship&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<DeputyRelationship>> deputyRelationshipsReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling deputyRelationshipsReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/deputyrelationships/readMultiple";

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

		GenericType<List<DeputyRelationship>> localVarReturnType = new GenericType<List<DeputyRelationship>>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for deputy relationships in the current account&lt;br&gt;
	 * 
	 * @param deputyRelationshipQuery (required)
	 * @return DeputyRelationshipResult
	 * @throws ApiException if fails to make API call
	 */
	public DeputyRelationshipResult deputyRelationshipsSearch(DeputyRelationshipQuery deputyRelationshipQuery) throws ApiException {
		return deputyRelationshipsSearchWithHttpInfo(deputyRelationshipQuery).getData();
	}

	/**
	 * search Search for deputy relationships in the current account&lt;br&gt;
	 * 
	 * @param deputyRelationshipQuery (required)
	 * @return ApiResponse&lt;DeputyRelationshipResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DeputyRelationshipResult> deputyRelationshipsSearchWithHttpInfo(DeputyRelationshipQuery deputyRelationshipQuery) throws ApiException {
		Object localVarPostBody = deputyRelationshipQuery;

		// verify the required parameter 'deputyRelationshipQuery' is set
		if (deputyRelationshipQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'deputyRelationshipQuery' when calling deputyRelationshipsSearch");
		}

		// create path and map variables
		String localVarPath = "/deputyrelationships/search";

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

		GenericType<DeputyRelationshipResult> localVarReturnType = new GenericType<DeputyRelationshipResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the deputy relationship in the system with the given entity.&lt;br&gt;
	 * 
	 * @param deputyRelationship The deputy relationship to update (required)
	 * @return DeputyRelationship
	 * @throws ApiException if fails to make API call
	 */
	public DeputyRelationship deputyRelationshipsUpdate(DeputyRelationship deputyRelationship) throws ApiException {
		return deputyRelationshipsUpdateWithHttpInfo(deputyRelationship).getData();
	}

	/**
	 * update Updates the deputy relationship in the system with the given entity.&lt;br&gt;
	 * 
	 * @param deputyRelationship The deputy relationship to update (required)
	 * @return ApiResponse&lt;DeputyRelationship&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DeputyRelationship> deputyRelationshipsUpdateWithHttpInfo(DeputyRelationship deputyRelationship) throws ApiException {
		Object localVarPostBody = deputyRelationship;

		// verify the required parameter 'deputyRelationship' is set
		if (deputyRelationship == null) {
			throw new ApiException(400, "Missing the required parameter 'deputyRelationship' when calling deputyRelationshipsUpdate");
		}

		// create path and map variables
		String localVarPath = "/deputyrelationships/update";

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

		GenericType<DeputyRelationship> localVarReturnType = new GenericType<DeputyRelationship>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * writeAgentDeputies Batch writes the deputies of an agent. All previous existing deputies of that agent will be replaced.&lt;br&gt;
	 * 
	 * @param writeAgentDeputyRelationshipsBody The deputy relationships for that an agent with each escalation level. (required)
	 * @throws ApiException if fails to make API call
	 */
	public void deputyRelationshipsWriteAgentDeputies(WriteAgentDeputyRelationshipsBody writeAgentDeputyRelationshipsBody) throws ApiException {

		deputyRelationshipsWriteAgentDeputiesWithHttpInfo(writeAgentDeputyRelationshipsBody);
	}

	/**
	 * writeAgentDeputies Batch writes the deputies of an agent. All previous existing deputies of that agent will be replaced.&lt;br&gt;
	 * 
	 * @param writeAgentDeputyRelationshipsBody The deputy relationships for that an agent with each escalation level. (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> deputyRelationshipsWriteAgentDeputiesWithHttpInfo(WriteAgentDeputyRelationshipsBody writeAgentDeputyRelationshipsBody) throws ApiException {
		Object localVarPostBody = writeAgentDeputyRelationshipsBody;

		// verify the required parameter 'writeAgentDeputyRelationshipsBody' is set
		if (writeAgentDeputyRelationshipsBody == null) {
			throw new ApiException(400, "Missing the required parameter 'writeAgentDeputyRelationshipsBody' when calling deputyRelationshipsWriteAgentDeputies");
		}

		// create path and map variables
		String localVarPath = "/deputyrelationships/writeAgentDeputies";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = {

		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}
}
