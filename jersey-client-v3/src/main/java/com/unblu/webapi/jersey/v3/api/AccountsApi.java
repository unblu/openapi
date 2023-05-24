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
import com.unblu.webapi.model.v3.Account;
import com.unblu.webapi.model.v3.AccountQuery;
import com.unblu.webapi.model.v3.AccountResult;
import com.unblu.webapi.model.v3.AccountUserContainer;

public class AccountsApi {
	private ApiClient apiClient;

	public AccountsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AccountsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates the given entity in the system. The id of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
	 * 
	 * @param account The entity to create (required)
	 * @param expand (optional)
	 * @return Account
	 * @throws ApiException if fails to make API call
	 */
	public Account accountsCreate(Account account, String expand) throws ApiException {
		return accountsCreateWithHttpInfo(account, expand).getData();
	}

	/**
	 * create Creates the given entity in the system. The id of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
	 * 
	 * @param account The entity to create (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;Account&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Account> accountsCreateWithHttpInfo(Account account, String expand) throws ApiException {
		Object localVarPostBody = account;

		// verify the required parameter 'account' is set
		if (account == null) {
			throw new ApiException(400, "Missing the required parameter 'account' when calling accountsCreate");
		}

		// create path and map variables
		String localVarPath = "/accounts/create";

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

		GenericType<Account> localVarReturnType = new GenericType<Account>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * createAccountWithNewAdmin createAccountWithNewAdmin operation
	 * 
	 * @param accountUserContainer (required)
	 * @param expand (optional)
	 * @return AccountUserContainer
	 * @throws ApiException if fails to make API call
	 */
	public AccountUserContainer accountsCreateAccountWithNewAdmin(AccountUserContainer accountUserContainer, String expand) throws ApiException {
		return accountsCreateAccountWithNewAdminWithHttpInfo(accountUserContainer, expand).getData();
	}

	/**
	 * createAccountWithNewAdmin createAccountWithNewAdmin operation
	 * 
	 * @param accountUserContainer (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;AccountUserContainer&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AccountUserContainer> accountsCreateAccountWithNewAdminWithHttpInfo(AccountUserContainer accountUserContainer, String expand) throws ApiException {
		Object localVarPostBody = accountUserContainer;

		// verify the required parameter 'accountUserContainer' is set
		if (accountUserContainer == null) {
			throw new ApiException(400, "Missing the required parameter 'accountUserContainer' when calling accountsCreateAccountWithNewAdmin");
		}

		// create path and map variables
		String localVarPath = "/accounts/createAccountWithNewAdmin";

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

		GenericType<AccountUserContainer> localVarReturnType = new GenericType<AccountUserContainer>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the entity for the given id&lt;br&gt;
	 * 
	 * @param id The id of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void accountsDelete(String id) throws ApiException {

		accountsDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given id&lt;br&gt;
	 * 
	 * @param id The id of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> accountsDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/accounts/delete";

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
	 * delete Deletes the entity for the given id&lt;br&gt;
	 * 
	 * @param id The id of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void accountsDeleteLegacyGet(String id) throws ApiException {

		accountsDeleteLegacyGetWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given id&lt;br&gt;
	 * 
	 * @param id The id of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> accountsDeleteLegacyGetWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/accounts/delete";

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
	 * getByName Returns an account by the given name or null, if there is no such account&lt;br&gt;
	 * 
	 * @param name The name of the account which should be returned (optional)
	 * @param expand (optional)
	 * @return Account
	 * @throws ApiException if fails to make API call
	 */
	public Account accountsGetByName(String name, String expand) throws ApiException {
		return accountsGetByNameWithHttpInfo(name, expand).getData();
	}

	/**
	 * getByName Returns an account by the given name or null, if there is no such account&lt;br&gt;
	 * 
	 * @param name The name of the account which should be returned (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;Account&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Account> accountsGetByNameWithHttpInfo(String name, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/accounts/getByName";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<Account> localVarReturnType = new GenericType<Account>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getCurrentAccount Returns the account object of the current logged in user&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return Account
	 * @throws ApiException if fails to make API call
	 */
	public Account accountsGetCurrentAccount(String expand) throws ApiException {
		return accountsGetCurrentAccountWithHttpInfo(expand).getData();
	}

	/**
	 * getCurrentAccount Returns the account object of the current logged in user&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return ApiResponse&lt;Account&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Account> accountsGetCurrentAccountWithHttpInfo(String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/accounts/getCurrentAccount";

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

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<Account> localVarReturnType = new GenericType<Account>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * isAccountNameAvailable Checks if the account name is available for the given account id&lt;br&gt;
	 * 
	 * @param name The name which should be checked (optional)
	 * @param accountId The account id of the user for who the account should be set. When changing the name of an existing account, its id should be given. When
	 * the name is set to the one of the account, it will then also return true. (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean accountsIsAccountNameAvailable(String name, String accountId) throws ApiException {
		return accountsIsAccountNameAvailableWithHttpInfo(name, accountId).getData();
	}

	/**
	 * isAccountNameAvailable Checks if the account name is available for the given account id&lt;br&gt;
	 * 
	 * @param name The name which should be checked (optional)
	 * @param accountId The account id of the user for who the account should be set. When changing the name of an existing account, its id should be given. When
	 * the name is set to the one of the account, it will then also return true. (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> accountsIsAccountNameAvailableWithHttpInfo(String name, String accountId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/accounts/isAccountNameAvailable";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountId", accountId));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the entity for the given id&lt;br&gt;
	 * 
	 * @param id Id of the entity which should be returned (optional)
	 * @param expand (optional)
	 * @return Account
	 * @throws ApiException if fails to make API call
	 */
	public Account accountsRead(String id, String expand) throws ApiException {
		return accountsReadWithHttpInfo(id, expand).getData();
	}

	/**
	 * read Returns the entity for the given id&lt;br&gt;
	 * 
	 * @param id Id of the entity which should be returned (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;Account&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Account> accountsReadWithHttpInfo(String id, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/accounts/read";

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

		GenericType<Account> localVarReturnType = new GenericType<Account>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of entities for the given id&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The id&#39;s for which the entities should be fetched (required)
	 * @param expand (optional)
	 * @return List&lt;Account&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<Account> accountsReadMultiple(List<String> requestBody, String expand) throws ApiException {
		return accountsReadMultipleWithHttpInfo(requestBody, expand).getData();
	}

	/**
	 * readMultiple Gets a list of entities for the given id&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The id&#39;s for which the entities should be fetched (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;List&lt;Account&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<Account>> accountsReadMultipleWithHttpInfo(List<String> requestBody, String expand) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling accountsReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/accounts/readMultiple";

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

		GenericType<List<Account>> localVarReturnType = new GenericType<List<Account>>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for accounts&lt;br&gt;
	 * 
	 * @param accountQuery (required)
	 * @param expand (optional)
	 * @return AccountResult
	 * @throws ApiException if fails to make API call
	 */
	public AccountResult accountsSearch(AccountQuery accountQuery, String expand) throws ApiException {
		return accountsSearchWithHttpInfo(accountQuery, expand).getData();
	}

	/**
	 * search Search for accounts&lt;br&gt;
	 * 
	 * @param accountQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;AccountResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AccountResult> accountsSearchWithHttpInfo(AccountQuery accountQuery, String expand) throws ApiException {
		Object localVarPostBody = accountQuery;

		// verify the required parameter 'accountQuery' is set
		if (accountQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'accountQuery' when calling accountsSearch");
		}

		// create path and map variables
		String localVarPath = "/accounts/search";

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

		GenericType<AccountResult> localVarReturnType = new GenericType<AccountResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Allows to update the current account as admin. If user is super admin, he can also update other accounts&lt;br&gt;
	 * 
	 * @param account The account entity to update (required)
	 * @param expand (optional)
	 * @return Account
	 * @throws ApiException if fails to make API call
	 */
	public Account accountsUpdate(Account account, String expand) throws ApiException {
		return accountsUpdateWithHttpInfo(account, expand).getData();
	}

	/**
	 * update Allows to update the current account as admin. If user is super admin, he can also update other accounts&lt;br&gt;
	 * 
	 * @param account The account entity to update (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;Account&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Account> accountsUpdateWithHttpInfo(Account account, String expand) throws ApiException {
		Object localVarPostBody = account;

		// verify the required parameter 'account' is set
		if (account == null) {
			throw new ApiException(400, "Missing the required parameter 'account' when calling accountsUpdate");
		}

		// create path and map variables
		String localVarPath = "/accounts/update";

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

		GenericType<Account> localVarReturnType = new GenericType<Account>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
