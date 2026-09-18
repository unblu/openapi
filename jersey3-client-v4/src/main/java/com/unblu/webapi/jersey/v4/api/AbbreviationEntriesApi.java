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
import com.unblu.webapi.model.v4.AbbreviationEntryCreateBody;
import com.unblu.webapi.model.v4.AbbreviationEntryData;
import com.unblu.webapi.model.v4.AbbreviationEntryDataResult;
import com.unblu.webapi.model.v4.AbbreviationEntryQuery;
import com.unblu.webapi.model.v4.AbbreviationEntryUpdateBody;

import jakarta.ws.rs.core.GenericType;

public class AbbreviationEntriesApi {
	private ApiClient apiClient;

	public AbbreviationEntriesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AbbreviationEntriesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates a new abbreviation entry. The owner type is mandatory. If the body doesn&#39;t name an owner, the entry belongs to the current account or to
	 * the current user, depending on the owner type. Creating an entry owned by another user requires the supervisor role.&lt;br&gt;
	 * 
	 * @param abbreviationEntryCreateBody the abbreviation entry to create (required)
	 * @return AbbreviationEntryData
	 * @throws ApiException if fails to make API call
	 */
	public AbbreviationEntryData abbreviationEntriesCreate(AbbreviationEntryCreateBody abbreviationEntryCreateBody) throws ApiException {
		return abbreviationEntriesCreateWithHttpInfo(abbreviationEntryCreateBody).getData();
	}

	/**
	 * create Creates a new abbreviation entry. The owner type is mandatory. If the body doesn&#39;t name an owner, the entry belongs to the current account or to
	 * the current user, depending on the owner type. Creating an entry owned by another user requires the supervisor role.&lt;br&gt;
	 * 
	 * @param abbreviationEntryCreateBody the abbreviation entry to create (required)
	 * @return ApiResponse&lt;AbbreviationEntryData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AbbreviationEntryData> abbreviationEntriesCreateWithHttpInfo(AbbreviationEntryCreateBody abbreviationEntryCreateBody) throws ApiException {
		Object localVarPostBody = abbreviationEntryCreateBody;

		// verify the required parameter 'abbreviationEntryCreateBody' is set
		if (abbreviationEntryCreateBody == null) {
			throw new ApiException(400, "Missing the required parameter 'abbreviationEntryCreateBody' when calling abbreviationEntriesCreate");
		}

		// create path and map variables
		String localVarPath = "/abbreviationentries/create";

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

		GenericType<AbbreviationEntryData> localVarReturnType = new GenericType<AbbreviationEntryData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the abbreviation entry with the specified ID&lt;br&gt;
	 * 
	 * @param abbreviationEntryId the ID of the abbreviation entry to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public void abbreviationEntriesDelete(String abbreviationEntryId) throws ApiException {

		abbreviationEntriesDeleteWithHttpInfo(abbreviationEntryId);
	}

	/**
	 * delete Deletes the abbreviation entry with the specified ID&lt;br&gt;
	 * 
	 * @param abbreviationEntryId the ID of the abbreviation entry to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> abbreviationEntriesDeleteWithHttpInfo(String abbreviationEntryId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'abbreviationEntryId' is set
		if (abbreviationEntryId == null) {
			throw new ApiException(400, "Missing the required parameter 'abbreviationEntryId' when calling abbreviationEntriesDelete");
		}

		// create path and map variables
		String localVarPath = "/abbreviationentries/{abbreviationEntryId}/delete"
				.replaceAll("\\{" + "abbreviationEntryId" + "\\}", apiClient.escapeString(abbreviationEntryId.toString()));

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
	 * read Reads an existing abbreviation entry&lt;br&gt;
	 * 
	 * @param abbreviationEntryId the ID of the abbreviation entry to read (required)
	 * @return AbbreviationEntryData
	 * @throws ApiException if fails to make API call
	 */
	public AbbreviationEntryData abbreviationEntriesRead(String abbreviationEntryId) throws ApiException {
		return abbreviationEntriesReadWithHttpInfo(abbreviationEntryId).getData();
	}

	/**
	 * read Reads an existing abbreviation entry&lt;br&gt;
	 * 
	 * @param abbreviationEntryId the ID of the abbreviation entry to read (required)
	 * @return ApiResponse&lt;AbbreviationEntryData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AbbreviationEntryData> abbreviationEntriesReadWithHttpInfo(String abbreviationEntryId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'abbreviationEntryId' is set
		if (abbreviationEntryId == null) {
			throw new ApiException(400, "Missing the required parameter 'abbreviationEntryId' when calling abbreviationEntriesRead");
		}

		// create path and map variables
		String localVarPath = "/abbreviationentries/{abbreviationEntryId}/read"
				.replaceAll("\\{" + "abbreviationEntryId" + "\\}", apiClient.escapeString(abbreviationEntryId.toString()));

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

		GenericType<AbbreviationEntryData> localVarReturnType = new GenericType<AbbreviationEntryData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Searches the abbreviation entries the current user can see: the entries owned by the current account, and their own personal entries. A user with the
	 * supervisor role also sees the personal entries of the other users of the account. Entries the current user can&#39;t see are never part of the result,
	 * whatever the query asks for.&lt;br&gt;
	 * 
	 * @param abbreviationEntryQuery the query to narrow the search (required)
	 * @return AbbreviationEntryDataResult
	 * @throws ApiException if fails to make API call
	 */
	public AbbreviationEntryDataResult abbreviationEntriesSearch(AbbreviationEntryQuery abbreviationEntryQuery) throws ApiException {
		return abbreviationEntriesSearchWithHttpInfo(abbreviationEntryQuery).getData();
	}

	/**
	 * search Searches the abbreviation entries the current user can see: the entries owned by the current account, and their own personal entries. A user with the
	 * supervisor role also sees the personal entries of the other users of the account. Entries the current user can&#39;t see are never part of the result,
	 * whatever the query asks for.&lt;br&gt;
	 * 
	 * @param abbreviationEntryQuery the query to narrow the search (required)
	 * @return ApiResponse&lt;AbbreviationEntryDataResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AbbreviationEntryDataResult> abbreviationEntriesSearchWithHttpInfo(AbbreviationEntryQuery abbreviationEntryQuery) throws ApiException {
		Object localVarPostBody = abbreviationEntryQuery;

		// verify the required parameter 'abbreviationEntryQuery' is set
		if (abbreviationEntryQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'abbreviationEntryQuery' when calling abbreviationEntriesSearch");
		}

		// create path and map variables
		String localVarPath = "/abbreviationentries/search";

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

		GenericType<AbbreviationEntryDataResult> localVarReturnType = new GenericType<AbbreviationEntryDataResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates an abbreviation entry. The update replaces every mutable value, so unchanged values have to be sent along. The owner of an entry can&#39;t be
	 * changed after creation.&lt;br&gt;
	 * 
	 * @param abbreviationEntryId the ID of the abbreviation entry to update (required)
	 * @param abbreviationEntryUpdateBody the abbreviation entry with the updated values (required)
	 * @return AbbreviationEntryData
	 * @throws ApiException if fails to make API call
	 */
	public AbbreviationEntryData abbreviationEntriesUpdate(String abbreviationEntryId, AbbreviationEntryUpdateBody abbreviationEntryUpdateBody) throws ApiException {
		return abbreviationEntriesUpdateWithHttpInfo(abbreviationEntryId, abbreviationEntryUpdateBody).getData();
	}

	/**
	 * update Updates an abbreviation entry. The update replaces every mutable value, so unchanged values have to be sent along. The owner of an entry can&#39;t be
	 * changed after creation.&lt;br&gt;
	 * 
	 * @param abbreviationEntryId the ID of the abbreviation entry to update (required)
	 * @param abbreviationEntryUpdateBody the abbreviation entry with the updated values (required)
	 * @return ApiResponse&lt;AbbreviationEntryData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AbbreviationEntryData> abbreviationEntriesUpdateWithHttpInfo(String abbreviationEntryId, AbbreviationEntryUpdateBody abbreviationEntryUpdateBody) throws ApiException {
		Object localVarPostBody = abbreviationEntryUpdateBody;

		// verify the required parameter 'abbreviationEntryId' is set
		if (abbreviationEntryId == null) {
			throw new ApiException(400, "Missing the required parameter 'abbreviationEntryId' when calling abbreviationEntriesUpdate");
		}

		// verify the required parameter 'abbreviationEntryUpdateBody' is set
		if (abbreviationEntryUpdateBody == null) {
			throw new ApiException(400, "Missing the required parameter 'abbreviationEntryUpdateBody' when calling abbreviationEntriesUpdate");
		}

		// create path and map variables
		String localVarPath = "/abbreviationentries/{abbreviationEntryId}/update"
				.replaceAll("\\{" + "abbreviationEntryId" + "\\}", apiClient.escapeString(abbreviationEntryId.toString()));

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

		GenericType<AbbreviationEntryData> localVarReturnType = new GenericType<AbbreviationEntryData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
