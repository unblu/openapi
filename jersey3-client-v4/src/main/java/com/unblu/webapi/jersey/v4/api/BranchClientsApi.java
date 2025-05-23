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
import com.unblu.webapi.model.v4.BranchClientData;
import com.unblu.webapi.model.v4.BranchClientDataList;
import com.unblu.webapi.model.v4.BranchClientQuery;
import com.unblu.webapi.model.v4.BranchClientResult;
import com.unblu.webapi.model.v4.BranchClientTokenResult;
import com.unblu.webapi.model.v4.BranchClientsGenerateTokenBody;
import com.unblu.webapi.model.v4.BranchClientsGetByBranchIdBody;

import jakarta.ws.rs.core.GenericType;

public class BranchClientsApi {
	private ApiClient apiClient;

	public BranchClientsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public BranchClientsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates a new branch client&lt;br&gt;
	 * 
	 * @param branchClientData The branch client to create (required)
	 * @return BranchClientData
	 * @throws ApiException if fails to make API call
	 */
	public BranchClientData branchClientsCreate(BranchClientData branchClientData) throws ApiException {
		return branchClientsCreateWithHttpInfo(branchClientData).getData();
	}

	/**
	 * create Creates a new branch client&lt;br&gt;
	 * 
	 * @param branchClientData The branch client to create (required)
	 * @return ApiResponse&lt;BranchClientData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<BranchClientData> branchClientsCreateWithHttpInfo(BranchClientData branchClientData) throws ApiException {
		Object localVarPostBody = branchClientData;

		// verify the required parameter 'branchClientData' is set
		if (branchClientData == null) {
			throw new ApiException(400, "Missing the required parameter 'branchClientData' when calling branchClientsCreate");
		}

		// create path and map variables
		String localVarPath = "/branchclients/create";

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

		GenericType<BranchClientData> localVarReturnType = new GenericType<BranchClientData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes a branch client&lt;br&gt;
	 * 
	 * @param branchClientId The ID of the branch client to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public void branchClientsDelete(String branchClientId) throws ApiException {

		branchClientsDeleteWithHttpInfo(branchClientId);
	}

	/**
	 * delete Deletes a branch client&lt;br&gt;
	 * 
	 * @param branchClientId The ID of the branch client to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> branchClientsDeleteWithHttpInfo(String branchClientId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'branchClientId' is set
		if (branchClientId == null) {
			throw new ApiException(400, "Missing the required parameter 'branchClientId' when calling branchClientsDelete");
		}

		// create path and map variables
		String localVarPath = "/branchclients/{branchClientId}/delete"
				.replaceAll("\\{" + "branchClientId" + "\\}", apiClient.escapeString(branchClientId.toString()));

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
	 * generateToken Generates a new branch client token&lt;br&gt;
	 * 
	 * @param branchClientId The ID of the branch client (required)
	 * @param branchClientsGenerateTokenBody (required)
	 * @return BranchClientTokenResult
	 * @throws ApiException if fails to make API call
	 */
	public BranchClientTokenResult branchClientsGenerateToken(String branchClientId, BranchClientsGenerateTokenBody branchClientsGenerateTokenBody) throws ApiException {
		return branchClientsGenerateTokenWithHttpInfo(branchClientId, branchClientsGenerateTokenBody).getData();
	}

	/**
	 * generateToken Generates a new branch client token&lt;br&gt;
	 * 
	 * @param branchClientId The ID of the branch client (required)
	 * @param branchClientsGenerateTokenBody (required)
	 * @return ApiResponse&lt;BranchClientTokenResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<BranchClientTokenResult> branchClientsGenerateTokenWithHttpInfo(String branchClientId, BranchClientsGenerateTokenBody branchClientsGenerateTokenBody) throws ApiException {
		Object localVarPostBody = branchClientsGenerateTokenBody;

		// verify the required parameter 'branchClientId' is set
		if (branchClientId == null) {
			throw new ApiException(400, "Missing the required parameter 'branchClientId' when calling branchClientsGenerateToken");
		}

		// verify the required parameter 'branchClientsGenerateTokenBody' is set
		if (branchClientsGenerateTokenBody == null) {
			throw new ApiException(400, "Missing the required parameter 'branchClientsGenerateTokenBody' when calling branchClientsGenerateToken");
		}

		// create path and map variables
		String localVarPath = "/branchclients/{branchClientId}/generateToken"
				.replaceAll("\\{" + "branchClientId" + "\\}", apiClient.escapeString(branchClientId.toString()));

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

		GenericType<BranchClientTokenResult> localVarReturnType = new GenericType<BranchClientTokenResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getByBranchId Gets all the branch clients currently assigned to the given branch&lt;br&gt;
	 * 
	 * @param branchClientsGetByBranchIdBody (required)
	 * @return BranchClientDataList
	 * @throws ApiException if fails to make API call
	 */
	public BranchClientDataList branchClientsGetByBranchId(BranchClientsGetByBranchIdBody branchClientsGetByBranchIdBody) throws ApiException {
		return branchClientsGetByBranchIdWithHttpInfo(branchClientsGetByBranchIdBody).getData();
	}

	/**
	 * getByBranchId Gets all the branch clients currently assigned to the given branch&lt;br&gt;
	 * 
	 * @param branchClientsGetByBranchIdBody (required)
	 * @return ApiResponse&lt;BranchClientDataList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<BranchClientDataList> branchClientsGetByBranchIdWithHttpInfo(BranchClientsGetByBranchIdBody branchClientsGetByBranchIdBody) throws ApiException {
		Object localVarPostBody = branchClientsGetByBranchIdBody;

		// verify the required parameter 'branchClientsGetByBranchIdBody' is set
		if (branchClientsGetByBranchIdBody == null) {
			throw new ApiException(400, "Missing the required parameter 'branchClientsGetByBranchIdBody' when calling branchClientsGetByBranchId");
		}

		// create path and map variables
		String localVarPath = "/branchclients/getByBranchId";

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

		GenericType<BranchClientDataList> localVarReturnType = new GenericType<BranchClientDataList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * invalidateTokens Invalidates all tokens that were generated for the given Branch client&lt;br&gt;
	 * 
	 * @param branchClientId The branch client ID for which the tokens should be invalidated (required)
	 * @return BranchClientData
	 * @throws ApiException if fails to make API call
	 */
	public BranchClientData branchClientsInvalidateTokens(String branchClientId) throws ApiException {
		return branchClientsInvalidateTokensWithHttpInfo(branchClientId).getData();
	}

	/**
	 * invalidateTokens Invalidates all tokens that were generated for the given Branch client&lt;br&gt;
	 * 
	 * @param branchClientId The branch client ID for which the tokens should be invalidated (required)
	 * @return ApiResponse&lt;BranchClientData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<BranchClientData> branchClientsInvalidateTokensWithHttpInfo(String branchClientId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'branchClientId' is set
		if (branchClientId == null) {
			throw new ApiException(400, "Missing the required parameter 'branchClientId' when calling branchClientsInvalidateTokens");
		}

		// create path and map variables
		String localVarPath = "/branchclients/{branchClientId}/invalidateTokens"
				.replaceAll("\\{" + "branchClientId" + "\\}", apiClient.escapeString(branchClientId.toString()));

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

		GenericType<BranchClientData> localVarReturnType = new GenericType<BranchClientData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the branch client for the given ID&lt;br&gt;
	 * 
	 * @param branchClientId ID of the branch client (required)
	 * @return BranchClientData
	 * @throws ApiException if fails to make API call
	 */
	public BranchClientData branchClientsRead(String branchClientId) throws ApiException {
		return branchClientsReadWithHttpInfo(branchClientId).getData();
	}

	/**
	 * read Returns the branch client for the given ID&lt;br&gt;
	 * 
	 * @param branchClientId ID of the branch client (required)
	 * @return ApiResponse&lt;BranchClientData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<BranchClientData> branchClientsReadWithHttpInfo(String branchClientId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'branchClientId' is set
		if (branchClientId == null) {
			throw new ApiException(400, "Missing the required parameter 'branchClientId' when calling branchClientsRead");
		}

		// create path and map variables
		String localVarPath = "/branchclients/{branchClientId}/read"
				.replaceAll("\\{" + "branchClientId" + "\\}", apiClient.escapeString(branchClientId.toString()));

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

		GenericType<BranchClientData> localVarReturnType = new GenericType<BranchClientData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Returns a list of branch clients for the given branch IDs&lt;br&gt;
	 * 
	 * @param requestBody The branch IDs to fetch the branch clients for (required)
	 * @return BranchClientDataList
	 * @throws ApiException if fails to make API call
	 */
	public BranchClientDataList branchClientsReadMultiple(List<String> requestBody) throws ApiException {
		return branchClientsReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple Returns a list of branch clients for the given branch IDs&lt;br&gt;
	 * 
	 * @param requestBody The branch IDs to fetch the branch clients for (required)
	 * @return ApiResponse&lt;BranchClientDataList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<BranchClientDataList> branchClientsReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling branchClientsReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/branchclients/readMultiple";

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

		GenericType<BranchClientDataList> localVarReturnType = new GenericType<BranchClientDataList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Searches for branch clients in the current account&lt;br&gt;
	 * 
	 * @param branchClientQuery (required)
	 * @return BranchClientResult
	 * @throws ApiException if fails to make API call
	 */
	public BranchClientResult branchClientsSearch(BranchClientQuery branchClientQuery) throws ApiException {
		return branchClientsSearchWithHttpInfo(branchClientQuery).getData();
	}

	/**
	 * search Searches for branch clients in the current account&lt;br&gt;
	 * 
	 * @param branchClientQuery (required)
	 * @return ApiResponse&lt;BranchClientResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<BranchClientResult> branchClientsSearchWithHttpInfo(BranchClientQuery branchClientQuery) throws ApiException {
		Object localVarPostBody = branchClientQuery;

		// verify the required parameter 'branchClientQuery' is set
		if (branchClientQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'branchClientQuery' when calling branchClientsSearch");
		}

		// create path and map variables
		String localVarPath = "/branchclients/search";

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

		GenericType<BranchClientResult> localVarReturnType = new GenericType<BranchClientResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates a branch client&lt;br&gt;
	 * 
	 * @param branchClientData The branch client to update (required)
	 * @return BranchClientData
	 * @throws ApiException if fails to make API call
	 */
	public BranchClientData branchClientsUpdate(BranchClientData branchClientData) throws ApiException {
		return branchClientsUpdateWithHttpInfo(branchClientData).getData();
	}

	/**
	 * update Updates a branch client&lt;br&gt;
	 * 
	 * @param branchClientData The branch client to update (required)
	 * @return ApiResponse&lt;BranchClientData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<BranchClientData> branchClientsUpdateWithHttpInfo(BranchClientData branchClientData) throws ApiException {
		Object localVarPostBody = branchClientData;

		// verify the required parameter 'branchClientData' is set
		if (branchClientData == null) {
			throw new ApiException(400, "Missing the required parameter 'branchClientData' when calling branchClientsUpdate");
		}

		// create path and map variables
		String localVarPath = "/branchclients/update";

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

		GenericType<BranchClientData> localVarReturnType = new GenericType<BranchClientData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
