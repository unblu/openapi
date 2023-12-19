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
import com.unblu.webapi.model.v3.AccountIngressStatus;
import com.unblu.webapi.model.v3.AccountQuery;
import com.unblu.webapi.model.v3.AccountResult;
import com.unblu.webapi.model.v3.AccountUserContainer;
import com.unblu.webapi.model.v3.AccountsDisableAccountIngressBody;
import com.unblu.webapi.model.v3.AccountsEnableAccountIngressBody;
import com.unblu.webapi.model.v3.AccountsRestartIngressMigrationBody;

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
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
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
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
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
	 * createAccountWithNewAdmin Create a new account with a new admin which will receive an email with the initial password.&lt;br&gt;
	 * 
	 * @param accountUserContainer the new account and admin user information (required)
	 * @param expand (optional)
	 * @return AccountUserContainer
	 * @throws ApiException if fails to make API call
	 */
	public AccountUserContainer accountsCreateAccountWithNewAdmin(AccountUserContainer accountUserContainer, String expand) throws ApiException {
		return accountsCreateAccountWithNewAdminWithHttpInfo(accountUserContainer, expand).getData();
	}

	/**
	 * createAccountWithNewAdmin Create a new account with a new admin which will receive an email with the initial password.&lt;br&gt;
	 * 
	 * @param accountUserContainer the new account and admin user information (required)
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
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void accountsDelete(String id) throws ApiException {

		accountsDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
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
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void accountsDeleteLegacyGet(String id) throws ApiException {

		accountsDeleteLegacyGetWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
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
	 * disableAccountIngress Disables ingress for the given account. &lt;p&gt; Calling this method triggers the ingress deactivation process. This consists of a
	 * single step: &lt;ol&gt; &lt;li&gt;Migrate all users of the account to be managed through the built-in Unblu user management system. &lt;/ol&gt; Successfully
	 * completing the deactivation process changes the &#x60;getMigrationStatus&#x60; to DONE_INGRESS_INACTIVE and the&#x60;getIngressStatus&#x60; to
	 * GLOBAL&lt;br&gt; If the deactivation process fails, &#x60;getMigrationStatus&#x60; changes to ERROR.&lt;br&gt; In such a case, use
	 * &#x60;readIngressStatus&#x60; to retrieve the current status and find the potential source of the problems. &lt;p&gt; Once you&#39;ve resolved the issues
	 * that caused the deactivation process to fail, use &#x60;restartIngressMigration&#x60; to restart the process.
	 * 
	 * @param accountsDisableAccountIngressBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void accountsDisableAccountIngress(AccountsDisableAccountIngressBody accountsDisableAccountIngressBody) throws ApiException {

		accountsDisableAccountIngressWithHttpInfo(accountsDisableAccountIngressBody);
	}

	/**
	 * disableAccountIngress Disables ingress for the given account. &lt;p&gt; Calling this method triggers the ingress deactivation process. This consists of a
	 * single step: &lt;ol&gt; &lt;li&gt;Migrate all users of the account to be managed through the built-in Unblu user management system. &lt;/ol&gt; Successfully
	 * completing the deactivation process changes the &#x60;getMigrationStatus&#x60; to DONE_INGRESS_INACTIVE and the&#x60;getIngressStatus&#x60; to
	 * GLOBAL&lt;br&gt; If the deactivation process fails, &#x60;getMigrationStatus&#x60; changes to ERROR.&lt;br&gt; In such a case, use
	 * &#x60;readIngressStatus&#x60; to retrieve the current status and find the potential source of the problems. &lt;p&gt; Once you&#39;ve resolved the issues
	 * that caused the deactivation process to fail, use &#x60;restartIngressMigration&#x60; to restart the process.
	 * 
	 * @param accountsDisableAccountIngressBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> accountsDisableAccountIngressWithHttpInfo(AccountsDisableAccountIngressBody accountsDisableAccountIngressBody) throws ApiException {
		Object localVarPostBody = accountsDisableAccountIngressBody;

		// verify the required parameter 'accountsDisableAccountIngressBody' is set
		if (accountsDisableAccountIngressBody == null) {
			throw new ApiException(400, "Missing the required parameter 'accountsDisableAccountIngressBody' when calling accountsDisableAccountIngress");
		}

		// create path and map variables
		String localVarPath = "/accounts/disableAccountIngress";

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

	/**
	 * enableAccountIngress Enables ingress for the given account. Before calling this method, you must have configured ingress correctly. &lt;p&gt; Calling this
	 * method triggers the ingress activation process. The process consists of the following steps: &lt;ol&gt; &lt;li&gt;Migrate all the users of the account to be
	 * managed through ingress single sign-on (SSO). &lt;li&gt;Check and apply all ingress-related configuration properties. &lt;/ol&gt; Successfully completing the
	 * activation process changes the &#x60;getMigrationStatus&#x60; to DONE_INGRESS_ACTIVE and the&#x60;getIngressStatus&#x60; to ACCOUNT&lt;br&gt; If the
	 * activation process fails, the &#x60;getMigrationStatus&#x60; changes to ERROR.&lt;br&gt; In such a case, use &#x60;readIngressStatus&#x60; to retrieve the
	 * current status and find the potential source of the problems. &lt;/p&gt; If the process failed because of an invalid configuration, ingress is automatically
	 * activated once the configuration has been rectified.&lt;br&gt; If there was an issue during migration, use &#x60;restartIngressMigration&#x60; to restart the
	 * process once you&#39;ve resolved all migration issues.
	 * 
	 * @param accountsEnableAccountIngressBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void accountsEnableAccountIngress(AccountsEnableAccountIngressBody accountsEnableAccountIngressBody) throws ApiException {

		accountsEnableAccountIngressWithHttpInfo(accountsEnableAccountIngressBody);
	}

	/**
	 * enableAccountIngress Enables ingress for the given account. Before calling this method, you must have configured ingress correctly. &lt;p&gt; Calling this
	 * method triggers the ingress activation process. The process consists of the following steps: &lt;ol&gt; &lt;li&gt;Migrate all the users of the account to be
	 * managed through ingress single sign-on (SSO). &lt;li&gt;Check and apply all ingress-related configuration properties. &lt;/ol&gt; Successfully completing the
	 * activation process changes the &#x60;getMigrationStatus&#x60; to DONE_INGRESS_ACTIVE and the&#x60;getIngressStatus&#x60; to ACCOUNT&lt;br&gt; If the
	 * activation process fails, the &#x60;getMigrationStatus&#x60; changes to ERROR.&lt;br&gt; In such a case, use &#x60;readIngressStatus&#x60; to retrieve the
	 * current status and find the potential source of the problems. &lt;/p&gt; If the process failed because of an invalid configuration, ingress is automatically
	 * activated once the configuration has been rectified.&lt;br&gt; If there was an issue during migration, use &#x60;restartIngressMigration&#x60; to restart the
	 * process once you&#39;ve resolved all migration issues.
	 * 
	 * @param accountsEnableAccountIngressBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> accountsEnableAccountIngressWithHttpInfo(AccountsEnableAccountIngressBody accountsEnableAccountIngressBody) throws ApiException {
		Object localVarPostBody = accountsEnableAccountIngressBody;

		// verify the required parameter 'accountsEnableAccountIngressBody' is set
		if (accountsEnableAccountIngressBody == null) {
			throw new ApiException(400, "Missing the required parameter 'accountsEnableAccountIngressBody' when calling accountsEnableAccountIngress");
		}

		// create path and map variables
		String localVarPath = "/accounts/enableAccountIngress";

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
	 * read Returns the entity for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the entity which should be returned (optional)
	 * @param expand (optional)
	 * @return Account
	 * @throws ApiException if fails to make API call
	 */
	public Account accountsRead(String id, String expand) throws ApiException {
		return accountsReadWithHttpInfo(id, expand).getData();
	}

	/**
	 * read Returns the entity for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the entity which should be returned (optional)
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
	 * readIngressStatus readIngressStatus operation
	 * 
	 * @param accountId (optional)
	 * @return AccountIngressStatus
	 * @throws ApiException if fails to make API call
	 */
	public AccountIngressStatus accountsReadIngressStatus(String accountId) throws ApiException {
		return accountsReadIngressStatusWithHttpInfo(accountId).getData();
	}

	/**
	 * readIngressStatus readIngressStatus operation
	 * 
	 * @param accountId (optional)
	 * @return ApiResponse&lt;AccountIngressStatus&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AccountIngressStatus> accountsReadIngressStatusWithHttpInfo(String accountId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/accounts/readIngressStatus";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountId", accountId));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<AccountIngressStatus> localVarReturnType = new GenericType<AccountIngressStatus>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of the entities with the given IDs. IDs that can&#39;t be found are ignored&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the entities (required)
	 * @param expand (optional)
	 * @return List&lt;Account&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<Account> accountsReadMultiple(List<String> requestBody, String expand) throws ApiException {
		return accountsReadMultipleWithHttpInfo(requestBody, expand).getData();
	}

	/**
	 * readMultiple Gets a list of the entities with the given IDs. IDs that can&#39;t be found are ignored&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the entities (required)
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
	 * restartIngressMigration Retries the ingress migration process for the given account. This is necessary when main_account#ingress_migration_status is ERROR.
	 * &lt;p&gt; When the service is executed, it updates the ingress_activation_status to MIGRATING. This causes the ingress migration leader selection task to
	 * resume the migration.
	 * 
	 * @param accountsRestartIngressMigrationBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void accountsRestartIngressMigration(AccountsRestartIngressMigrationBody accountsRestartIngressMigrationBody) throws ApiException {

		accountsRestartIngressMigrationWithHttpInfo(accountsRestartIngressMigrationBody);
	}

	/**
	 * restartIngressMigration Retries the ingress migration process for the given account. This is necessary when main_account#ingress_migration_status is ERROR.
	 * &lt;p&gt; When the service is executed, it updates the ingress_activation_status to MIGRATING. This causes the ingress migration leader selection task to
	 * resume the migration.
	 * 
	 * @param accountsRestartIngressMigrationBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> accountsRestartIngressMigrationWithHttpInfo(AccountsRestartIngressMigrationBody accountsRestartIngressMigrationBody) throws ApiException {
		Object localVarPostBody = accountsRestartIngressMigrationBody;

		// verify the required parameter 'accountsRestartIngressMigrationBody' is set
		if (accountsRestartIngressMigrationBody == null) {
			throw new ApiException(400, "Missing the required parameter 'accountsRestartIngressMigrationBody' when calling accountsRestartIngressMigration");
		}

		// create path and map variables
		String localVarPath = "/accounts/restartIngressMigration";

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
