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
import com.unblu.webapi.model.v4.BranchData;
import com.unblu.webapi.model.v4.BranchDataList;
import com.unblu.webapi.model.v4.BranchQuery;
import com.unblu.webapi.model.v4.BranchResult;
import com.unblu.webapi.model.v4.ExpandFields;

import jakarta.ws.rs.core.GenericType;

public class BranchesApi {
	private ApiClient apiClient;

	public BranchesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public BranchesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates a new branch&lt;br&gt;
	 * 
	 * @param branchData The branch to create (required)
	 * @param expand (optional)
	 * @return BranchData
	 * @throws ApiException if fails to make API call
	 */
	public BranchData branchesCreate(BranchData branchData, List<ExpandFields> expand) throws ApiException {
		return branchesCreateWithHttpInfo(branchData, expand).getData();
	}

	/**
	 * create Creates a new branch&lt;br&gt;
	 * 
	 * @param branchData The branch to create (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;BranchData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<BranchData> branchesCreateWithHttpInfo(BranchData branchData, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = branchData;

		// verify the required parameter 'branchData' is set
		if (branchData == null) {
			throw new ApiException(400, "Missing the required parameter 'branchData' when calling branchesCreate");
		}

		// create path and map variables
		String localVarPath = "/branches/create";

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<BranchData> localVarReturnType = new GenericType<BranchData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes a branch. This will also delete all related branch clients.&lt;br&gt;
	 * 
	 * @param branchId The ID of the branch to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public void branchesDelete(String branchId) throws ApiException {

		branchesDeleteWithHttpInfo(branchId);
	}

	/**
	 * delete Deletes a branch. This will also delete all related branch clients.&lt;br&gt;
	 * 
	 * @param branchId The ID of the branch to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> branchesDeleteWithHttpInfo(String branchId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'branchId' is set
		if (branchId == null) {
			throw new ApiException(400, "Missing the required parameter 'branchId' when calling branchesDelete");
		}

		// create path and map variables
		String localVarPath = "/branches/{branchId}/delete"
				.replaceAll("\\{" + "branchId" + "\\}", apiClient.escapeString(branchId.toString()));

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
	 * read Returns the branch for the given branch ID&lt;br&gt;
	 * 
	 * @param branchId ID of the branch (required)
	 * @param expand (optional)
	 * @return BranchData
	 * @throws ApiException if fails to make API call
	 */
	public BranchData branchesRead(String branchId, List<ExpandFields> expand) throws ApiException {
		return branchesReadWithHttpInfo(branchId, expand).getData();
	}

	/**
	 * read Returns the branch for the given branch ID&lt;br&gt;
	 * 
	 * @param branchId ID of the branch (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;BranchData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<BranchData> branchesReadWithHttpInfo(String branchId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'branchId' is set
		if (branchId == null) {
			throw new ApiException(400, "Missing the required parameter 'branchId' when calling branchesRead");
		}

		// create path and map variables
		String localVarPath = "/branches/{branchId}/read"
				.replaceAll("\\{" + "branchId" + "\\}", apiClient.escapeString(branchId.toString()));

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<BranchData> localVarReturnType = new GenericType<BranchData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of branches for the given IDs&lt;br&gt;
	 * 
	 * @param requestBody The IDs to fetch the branches for (required)
	 * @return BranchDataList
	 * @throws ApiException if fails to make API call
	 */
	public BranchDataList branchesReadMultiple(List<String> requestBody) throws ApiException {
		return branchesReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple Gets a list of branches for the given IDs&lt;br&gt;
	 * 
	 * @param requestBody The IDs to fetch the branches for (required)
	 * @return ApiResponse&lt;BranchDataList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<BranchDataList> branchesReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling branchesReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/branches/readMultiple";

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

		GenericType<BranchDataList> localVarReturnType = new GenericType<BranchDataList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Searches for branches in the current account&lt;br&gt;
	 * 
	 * @param branchQuery (required)
	 * @return BranchResult
	 * @throws ApiException if fails to make API call
	 */
	public BranchResult branchesSearch(BranchQuery branchQuery) throws ApiException {
		return branchesSearchWithHttpInfo(branchQuery).getData();
	}

	/**
	 * search Searches for branches in the current account&lt;br&gt;
	 * 
	 * @param branchQuery (required)
	 * @return ApiResponse&lt;BranchResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<BranchResult> branchesSearchWithHttpInfo(BranchQuery branchQuery) throws ApiException {
		Object localVarPostBody = branchQuery;

		// verify the required parameter 'branchQuery' is set
		if (branchQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'branchQuery' when calling branchesSearch");
		}

		// create path and map variables
		String localVarPath = "/branches/search";

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

		GenericType<BranchResult> localVarReturnType = new GenericType<BranchResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates a branch&lt;br&gt;
	 * 
	 * @param branchData The branch to update (required)
	 * @param expand (optional)
	 * @return BranchData
	 * @throws ApiException if fails to make API call
	 */
	public BranchData branchesUpdate(BranchData branchData, List<ExpandFields> expand) throws ApiException {
		return branchesUpdateWithHttpInfo(branchData, expand).getData();
	}

	/**
	 * update Updates a branch&lt;br&gt;
	 * 
	 * @param branchData The branch to update (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;BranchData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<BranchData> branchesUpdateWithHttpInfo(BranchData branchData, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = branchData;

		// verify the required parameter 'branchData' is set
		if (branchData == null) {
			throw new ApiException(400, "Missing the required parameter 'branchData' when calling branchesUpdate");
		}

		// create path and map variables
		String localVarPath = "/branches/update";

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<BranchData> localVarReturnType = new GenericType<BranchData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
