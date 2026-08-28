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
import com.unblu.webapi.model.v4.AccountIngressCreateBody;
import com.unblu.webapi.model.v4.AccountIngressData;
import com.unblu.webapi.model.v4.AccountIngressDataResult;
import com.unblu.webapi.model.v4.AccountIngressQuery;
import com.unblu.webapi.model.v4.AccountIngressUpdateBody;
import com.unblu.webapi.model.v4.ExpandFields;

import jakarta.ws.rs.core.GenericType;

public class AccountIngressesApi {
	private ApiClient apiClient;

	public AccountIngressesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AccountIngressesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates a new account ingress&lt;br&gt;
	 * 
	 * @param accountIngressCreateBody The account ingress to create (required)
	 * @param expand (optional)
	 * @return AccountIngressData
	 * @throws ApiException if fails to make API call
	 */
	public AccountIngressData accountIngressesCreate(AccountIngressCreateBody accountIngressCreateBody, List<ExpandFields> expand) throws ApiException {
		return accountIngressesCreateWithHttpInfo(accountIngressCreateBody, expand).getData();
	}

	/**
	 * create Creates a new account ingress&lt;br&gt;
	 * 
	 * @param accountIngressCreateBody The account ingress to create (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;AccountIngressData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AccountIngressData> accountIngressesCreateWithHttpInfo(AccountIngressCreateBody accountIngressCreateBody, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = accountIngressCreateBody;

		// verify the required parameter 'accountIngressCreateBody' is set
		if (accountIngressCreateBody == null) {
			throw new ApiException(400, "Missing the required parameter 'accountIngressCreateBody' when calling accountIngressesCreate");
		}

		// create path and map variables
		String localVarPath = "/accountingresses/create";

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

		GenericType<AccountIngressData> localVarReturnType = new GenericType<AccountIngressData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the account ingress with the specified ID. The primary &#x60;EAccountIngressEntryPath.PUBLIC&#x60; ingress can&#39;t be deleted as long as
	 * other&#x60;EAccountIngressEntryPath.PUBLIC&#x60; ingresses exist.&lt;br&gt;
	 * 
	 * @param accountIngressId The ID of the account ingress to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public void accountIngressesDelete(String accountIngressId) throws ApiException {

		accountIngressesDeleteWithHttpInfo(accountIngressId);
	}

	/**
	 * delete Deletes the account ingress with the specified ID. The primary &#x60;EAccountIngressEntryPath.PUBLIC&#x60; ingress can&#39;t be deleted as long as
	 * other&#x60;EAccountIngressEntryPath.PUBLIC&#x60; ingresses exist.&lt;br&gt;
	 * 
	 * @param accountIngressId The ID of the account ingress to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> accountIngressesDeleteWithHttpInfo(String accountIngressId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'accountIngressId' is set
		if (accountIngressId == null) {
			throw new ApiException(400, "Missing the required parameter 'accountIngressId' when calling accountIngressesDelete");
		}

		// create path and map variables
		String localVarPath = "/accountingresses/{accountIngressId}/delete"
				.replaceAll("\\{" + "accountIngressId" + "\\}", apiClient.escapeString(accountIngressId.toString()));

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
	 * read Reads an existing account ingress&lt;br&gt;
	 * 
	 * @param accountIngressId The ID of the account ingress to read (required)
	 * @param expand (optional)
	 * @return AccountIngressData
	 * @throws ApiException if fails to make API call
	 */
	public AccountIngressData accountIngressesRead(String accountIngressId, List<ExpandFields> expand) throws ApiException {
		return accountIngressesReadWithHttpInfo(accountIngressId, expand).getData();
	}

	/**
	 * read Reads an existing account ingress&lt;br&gt;
	 * 
	 * @param accountIngressId The ID of the account ingress to read (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;AccountIngressData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AccountIngressData> accountIngressesReadWithHttpInfo(String accountIngressId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'accountIngressId' is set
		if (accountIngressId == null) {
			throw new ApiException(400, "Missing the required parameter 'accountIngressId' when calling accountIngressesRead");
		}

		// create path and map variables
		String localVarPath = "/accountingresses/{accountIngressId}/read"
				.replaceAll("\\{" + "accountIngressId" + "\\}", apiClient.escapeString(accountIngressId.toString()));

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

		GenericType<AccountIngressData> localVarReturnType = new GenericType<AccountIngressData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for account ingresses in the current account&lt;br&gt;
	 * 
	 * @param accountIngressQuery (required)
	 * @param expand (optional)
	 * @return AccountIngressDataResult
	 * @throws ApiException if fails to make API call
	 */
	public AccountIngressDataResult accountIngressesSearch(AccountIngressQuery accountIngressQuery, List<ExpandFields> expand) throws ApiException {
		return accountIngressesSearchWithHttpInfo(accountIngressQuery, expand).getData();
	}

	/**
	 * search Search for account ingresses in the current account&lt;br&gt;
	 * 
	 * @param accountIngressQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;AccountIngressDataResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AccountIngressDataResult> accountIngressesSearchWithHttpInfo(AccountIngressQuery accountIngressQuery, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = accountIngressQuery;

		// verify the required parameter 'accountIngressQuery' is set
		if (accountIngressQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'accountIngressQuery' when calling accountIngressesSearch");
		}

		// create path and map variables
		String localVarPath = "/accountingresses/search";

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

		GenericType<AccountIngressDataResult> localVarReturnType = new GenericType<AccountIngressDataResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setAsPublicPrimaryIngress Sets the specified account ingress as the primary &#x60;EEntryPath.PUBLIC&#x60; ingress. This clears the existing primary
	 * &#x60;EEntryPath.PUBLIC&#x60; ingress.&lt;br&gt;
	 * 
	 * @param accountIngressId The ID of the account ingress to set as the primary ingress (required)
	 * @param expand (optional)
	 * @return AccountIngressData
	 * @throws ApiException if fails to make API call
	 */
	public AccountIngressData accountIngressesSetAsPublicPrimaryIngress(String accountIngressId, List<ExpandFields> expand) throws ApiException {
		return accountIngressesSetAsPublicPrimaryIngressWithHttpInfo(accountIngressId, expand).getData();
	}

	/**
	 * setAsPublicPrimaryIngress Sets the specified account ingress as the primary &#x60;EEntryPath.PUBLIC&#x60; ingress. This clears the existing primary
	 * &#x60;EEntryPath.PUBLIC&#x60; ingress.&lt;br&gt;
	 * 
	 * @param accountIngressId The ID of the account ingress to set as the primary ingress (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;AccountIngressData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AccountIngressData> accountIngressesSetAsPublicPrimaryIngressWithHttpInfo(String accountIngressId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'accountIngressId' is set
		if (accountIngressId == null) {
			throw new ApiException(400, "Missing the required parameter 'accountIngressId' when calling accountIngressesSetAsPublicPrimaryIngress");
		}

		// create path and map variables
		String localVarPath = "/accountingresses/{accountIngressId}/setAsPublicPrimaryIngress"
				.replaceAll("\\{" + "accountIngressId" + "\\}", apiClient.escapeString(accountIngressId.toString()));

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

		GenericType<AccountIngressData> localVarReturnType = new GenericType<AccountIngressData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates an account ingress&lt;br&gt;
	 * 
	 * @param accountIngressUpdateBody The account ingress with the updated values (required)
	 * @param expand (optional)
	 * @return AccountIngressData
	 * @throws ApiException if fails to make API call
	 */
	public AccountIngressData accountIngressesUpdate(AccountIngressUpdateBody accountIngressUpdateBody, List<ExpandFields> expand) throws ApiException {
		return accountIngressesUpdateWithHttpInfo(accountIngressUpdateBody, expand).getData();
	}

	/**
	 * update Updates an account ingress&lt;br&gt;
	 * 
	 * @param accountIngressUpdateBody The account ingress with the updated values (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;AccountIngressData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AccountIngressData> accountIngressesUpdateWithHttpInfo(AccountIngressUpdateBody accountIngressUpdateBody, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = accountIngressUpdateBody;

		// verify the required parameter 'accountIngressUpdateBody' is set
		if (accountIngressUpdateBody == null) {
			throw new ApiException(400, "Missing the required parameter 'accountIngressUpdateBody' when calling accountIngressesUpdate");
		}

		// create path and map variables
		String localVarPath = "/accountingresses/update";

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

		GenericType<AccountIngressData> localVarReturnType = new GenericType<AccountIngressData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * updateConfiguration Updates the configuration map for a specific account ingress&lt;br&gt;
	 * 
	 * @param accountIngressId The ID of the account ingress to be updated (required)
	 * @param requestBody The key-value map of settings to update. The source for this map has to be the &lt;code&gt;configuration&lt;/code&gt; attribute when you
	 * read the account ingress using &lt;code&gt;configuration&lt;/code&gt; in the &lt;code&gt;expand&lt;/code&gt; query parameter. (required)
	 * @param expand (optional)
	 * @return AccountIngressData
	 * @throws ApiException if fails to make API call
	 */
	public AccountIngressData accountIngressesUpdateConfiguration(String accountIngressId, Map<String, String> requestBody, List<ExpandFields> expand) throws ApiException {
		return accountIngressesUpdateConfigurationWithHttpInfo(accountIngressId, requestBody, expand).getData();
	}

	/**
	 * updateConfiguration Updates the configuration map for a specific account ingress&lt;br&gt;
	 * 
	 * @param accountIngressId The ID of the account ingress to be updated (required)
	 * @param requestBody The key-value map of settings to update. The source for this map has to be the &lt;code&gt;configuration&lt;/code&gt; attribute when you
	 * read the account ingress using &lt;code&gt;configuration&lt;/code&gt; in the &lt;code&gt;expand&lt;/code&gt; query parameter. (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;AccountIngressData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AccountIngressData> accountIngressesUpdateConfigurationWithHttpInfo(String accountIngressId, Map<String, String> requestBody, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'accountIngressId' is set
		if (accountIngressId == null) {
			throw new ApiException(400, "Missing the required parameter 'accountIngressId' when calling accountIngressesUpdateConfiguration");
		}

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling accountIngressesUpdateConfiguration");
		}

		// create path and map variables
		String localVarPath = "/accountingresses/{accountIngressId}/updateConfiguration"
				.replaceAll("\\{" + "accountIngressId" + "\\}", apiClient.escapeString(accountIngressId.toString()));

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

		GenericType<AccountIngressData> localVarReturnType = new GenericType<AccountIngressData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * updateMetadata Updates the metadata map for a specific account ingress&lt;br&gt;
	 * 
	 * @param accountIngressId The ID of the account ingress to update (required)
	 * @param requestBody The key-value map of metadata to update. The source for this map has to be the &lt;code&gt;metadata&lt;/code&gt; attribute when you read
	 * the account ingress using &lt;code&gt;metadata&lt;/code&gt; in the &lt;code&gt;expand&lt;/code&gt; query parameter. (required)
	 * @param expand (optional)
	 * @return AccountIngressData
	 * @throws ApiException if fails to make API call
	 */
	public AccountIngressData accountIngressesUpdateMetadata(String accountIngressId, Map<String, String> requestBody, List<ExpandFields> expand) throws ApiException {
		return accountIngressesUpdateMetadataWithHttpInfo(accountIngressId, requestBody, expand).getData();
	}

	/**
	 * updateMetadata Updates the metadata map for a specific account ingress&lt;br&gt;
	 * 
	 * @param accountIngressId The ID of the account ingress to update (required)
	 * @param requestBody The key-value map of metadata to update. The source for this map has to be the &lt;code&gt;metadata&lt;/code&gt; attribute when you read
	 * the account ingress using &lt;code&gt;metadata&lt;/code&gt; in the &lt;code&gt;expand&lt;/code&gt; query parameter. (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;AccountIngressData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AccountIngressData> accountIngressesUpdateMetadataWithHttpInfo(String accountIngressId, Map<String, String> requestBody, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'accountIngressId' is set
		if (accountIngressId == null) {
			throw new ApiException(400, "Missing the required parameter 'accountIngressId' when calling accountIngressesUpdateMetadata");
		}

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling accountIngressesUpdateMetadata");
		}

		// create path and map variables
		String localVarPath = "/accountingresses/{accountIngressId}/updateMetadata"
				.replaceAll("\\{" + "accountIngressId" + "\\}", apiClient.escapeString(accountIngressId.toString()));

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

		GenericType<AccountIngressData> localVarReturnType = new GenericType<AccountIngressData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
