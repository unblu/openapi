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
import com.unblu.webapi.model.v4.Account;
import com.unblu.webapi.model.v4.AccountIngressStatus;
import com.unblu.webapi.model.v4.AccountList;
import com.unblu.webapi.model.v4.AccountQuery;
import com.unblu.webapi.model.v4.AccountQuotaUsageData;
import com.unblu.webapi.model.v4.AccountResult;
import com.unblu.webapi.model.v4.AccountSecret;
import com.unblu.webapi.model.v4.AccountUserContainer;
import com.unblu.webapi.model.v4.RecordedMinutesData;

import jakarta.ws.rs.core.GenericType;

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
	 * delete Deletes the account with the given ID&lt;br&gt;
	 * 
	 * @param accountId The ID of the account which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void accountsDelete(String accountId) throws ApiException {

		accountsDeleteWithHttpInfo(accountId);
	}

	/**
	 * delete Deletes the account with the given ID&lt;br&gt;
	 * 
	 * @param accountId The ID of the account which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> accountsDeleteWithHttpInfo(String accountId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'accountId' is set
		if (accountId == null) {
			throw new ApiException(400, "Missing the required parameter 'accountId' when calling accountsDelete");
		}

		// create path and map variables
		String localVarPath = "/accounts/{accountId}/delete"
				.replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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
	 * disableAccountIngress Disables ingress for the given account. &lt;p&gt; Calling this method triggers the ingress deactivation process. This consists of a
	 * single step: &lt;ol&gt; &lt;li&gt;Migrate all users of the account to be managed through the built-in Unblu user management system. &lt;/ol&gt; Successfully
	 * completing the deactivation process changes the &#x60;getMigrationStatus&#x60; to DONE_INGRESS_INACTIVE and the&#x60;getIngressStatus&#x60; to
	 * GLOBAL&lt;br&gt; If the deactivation process fails, &#x60;getMigrationStatus&#x60; changes to ERROR.&lt;br&gt; In such a case, use
	 * &#x60;readIngressStatus&#x60; to retrieve the current status and find the potential source of the problems. &lt;p&gt; Once you&#39;ve resolved the issues
	 * that caused the deactivation process to fail, use &#x60;restartIngressMigration&#x60; to restart the process.&lt;br&gt;
	 * 
	 * @param accountId The ID of the account for which ingress should be disabled (required)
	 * @throws ApiException if fails to make API call
	 */
	public void accountsDisableAccountIngress(String accountId) throws ApiException {

		accountsDisableAccountIngressWithHttpInfo(accountId);
	}

	/**
	 * disableAccountIngress Disables ingress for the given account. &lt;p&gt; Calling this method triggers the ingress deactivation process. This consists of a
	 * single step: &lt;ol&gt; &lt;li&gt;Migrate all users of the account to be managed through the built-in Unblu user management system. &lt;/ol&gt; Successfully
	 * completing the deactivation process changes the &#x60;getMigrationStatus&#x60; to DONE_INGRESS_INACTIVE and the&#x60;getIngressStatus&#x60; to
	 * GLOBAL&lt;br&gt; If the deactivation process fails, &#x60;getMigrationStatus&#x60; changes to ERROR.&lt;br&gt; In such a case, use
	 * &#x60;readIngressStatus&#x60; to retrieve the current status and find the potential source of the problems. &lt;p&gt; Once you&#39;ve resolved the issues
	 * that caused the deactivation process to fail, use &#x60;restartIngressMigration&#x60; to restart the process.&lt;br&gt;
	 * 
	 * @param accountId The ID of the account for which ingress should be disabled (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> accountsDisableAccountIngressWithHttpInfo(String accountId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'accountId' is set
		if (accountId == null) {
			throw new ApiException(400, "Missing the required parameter 'accountId' when calling accountsDisableAccountIngress");
		}

		// create path and map variables
		String localVarPath = "/accounts/{accountId}/disableAccountIngress"
				.replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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
	 * process once you&#39;ve resolved all migration issues.&lt;br&gt;
	 * 
	 * @param accountId The ID of the account for which ingress should be enabled (required)
	 * @throws ApiException if fails to make API call
	 */
	public void accountsEnableAccountIngress(String accountId) throws ApiException {

		accountsEnableAccountIngressWithHttpInfo(accountId);
	}

	/**
	 * enableAccountIngress Enables ingress for the given account. Before calling this method, you must have configured ingress correctly. &lt;p&gt; Calling this
	 * method triggers the ingress activation process. The process consists of the following steps: &lt;ol&gt; &lt;li&gt;Migrate all the users of the account to be
	 * managed through ingress single sign-on (SSO). &lt;li&gt;Check and apply all ingress-related configuration properties. &lt;/ol&gt; Successfully completing the
	 * activation process changes the &#x60;getMigrationStatus&#x60; to DONE_INGRESS_ACTIVE and the&#x60;getIngressStatus&#x60; to ACCOUNT&lt;br&gt; If the
	 * activation process fails, the &#x60;getMigrationStatus&#x60; changes to ERROR.&lt;br&gt; In such a case, use &#x60;readIngressStatus&#x60; to retrieve the
	 * current status and find the potential source of the problems. &lt;/p&gt; If the process failed because of an invalid configuration, ingress is automatically
	 * activated once the configuration has been rectified.&lt;br&gt; If there was an issue during migration, use &#x60;restartIngressMigration&#x60; to restart the
	 * process once you&#39;ve resolved all migration issues.&lt;br&gt;
	 * 
	 * @param accountId The ID of the account for which ingress should be enabled (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> accountsEnableAccountIngressWithHttpInfo(String accountId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'accountId' is set
		if (accountId == null) {
			throw new ApiException(400, "Missing the required parameter 'accountId' when calling accountsEnableAccountIngress");
		}

		// create path and map variables
		String localVarPath = "/accounts/{accountId}/enableAccountIngress"
				.replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * getAccountSecret Returns the account secret for the given account ID. &lt;p&gt; Only superadmins can call this endpoint for accounts other than their
	 * own.&lt;br&gt;
	 * 
	 * @param accountId The ID of the account the secret belongs to (required)
	 * @return AccountSecret
	 * @throws ApiException if fails to make API call
	 */
	public AccountSecret accountsGetAccountSecret(String accountId) throws ApiException {
		return accountsGetAccountSecretWithHttpInfo(accountId).getData();
	}

	/**
	 * getAccountSecret Returns the account secret for the given account ID. &lt;p&gt; Only superadmins can call this endpoint for accounts other than their
	 * own.&lt;br&gt;
	 * 
	 * @param accountId The ID of the account the secret belongs to (required)
	 * @return ApiResponse&lt;AccountSecret&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AccountSecret> accountsGetAccountSecretWithHttpInfo(String accountId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'accountId' is set
		if (accountId == null) {
			throw new ApiException(400, "Missing the required parameter 'accountId' when calling accountsGetAccountSecret");
		}

		// create path and map variables
		String localVarPath = "/accounts/{accountId}/getAccountSecret"
				.replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

		GenericType<AccountSecret> localVarReturnType = new GenericType<AccountSecret>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getByName Returns an account by the given name or an error, if there is no such account&lt;br&gt;
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
	 * getByName Returns an account by the given name or an error, if there is no such account&lt;br&gt;
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
	 * getIngressStatus Returns the current state of the account ingress configuration. &lt;p&gt; Use &#x60;enableAccountIngress&#x60; to enable account ingress.
	 * &lt;p&gt; Use &#x60;disableAccountIngress&#x60; to disable account ingress.&lt;br&gt;
	 * 
	 * @param accountId The ID of the account for which the status should be returned (required)
	 * @return AccountIngressStatus
	 * @throws ApiException if fails to make API call
	 */
	public AccountIngressStatus accountsGetIngressStatus(String accountId) throws ApiException {
		return accountsGetIngressStatusWithHttpInfo(accountId).getData();
	}

	/**
	 * getIngressStatus Returns the current state of the account ingress configuration. &lt;p&gt; Use &#x60;enableAccountIngress&#x60; to enable account ingress.
	 * &lt;p&gt; Use &#x60;disableAccountIngress&#x60; to disable account ingress.&lt;br&gt;
	 * 
	 * @param accountId The ID of the account for which the status should be returned (required)
	 * @return ApiResponse&lt;AccountIngressStatus&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AccountIngressStatus> accountsGetIngressStatusWithHttpInfo(String accountId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'accountId' is set
		if (accountId == null) {
			throw new ApiException(400, "Missing the required parameter 'accountId' when calling accountsGetIngressStatus");
		}

		// create path and map variables
		String localVarPath = "/accounts/{accountId}/getIngressStatus"
				.replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

		GenericType<AccountIngressStatus> localVarReturnType = new GenericType<AccountIngressStatus>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getQuotaUsage Calculates the quota usage values and their corresponding limits for API keys, domains, teams, and users in the current account.&lt;br&gt;
	 * 
	 * @return AccountQuotaUsageData
	 * @throws ApiException if fails to make API call
	 */
	public AccountQuotaUsageData accountsGetQuotaUsage() throws ApiException {
		return accountsGetQuotaUsageWithHttpInfo().getData();
	}

	/**
	 * getQuotaUsage Calculates the quota usage values and their corresponding limits for API keys, domains, teams, and users in the current account.&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;AccountQuotaUsageData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AccountQuotaUsageData> accountsGetQuotaUsageWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/accounts/getQuotaUsage";

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

		GenericType<AccountQuotaUsageData> localVarReturnType = new GenericType<AccountQuotaUsageData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getRecordedMinutes Returns the total length of all conversation recordings made between the given dates over all accounts. If there were no recordings in the
	 * given time, the return value is 0. &lt;p&gt; Only superadmins can call this endpoint for accounts other than their own.&lt;br&gt;
	 * 
	 * @param accountId The ID of the account to get the total length of all conversation recordings for. (required)
	 * @param fromTime Date from which to count the conversation recording length. The value is rounded to the beginning of the day. (optional)
	 * @param toTime Date to which to count the conversation recording length. The value is rounded to the end of the day. (optional)
	 * @return RecordedMinutesData
	 * @throws ApiException if fails to make API call
	 */
	public RecordedMinutesData accountsGetRecordedMinutes(String accountId, Long fromTime, Long toTime) throws ApiException {
		return accountsGetRecordedMinutesWithHttpInfo(accountId, fromTime, toTime).getData();
	}

	/**
	 * getRecordedMinutes Returns the total length of all conversation recordings made between the given dates over all accounts. If there were no recordings in the
	 * given time, the return value is 0. &lt;p&gt; Only superadmins can call this endpoint for accounts other than their own.&lt;br&gt;
	 * 
	 * @param accountId The ID of the account to get the total length of all conversation recordings for. (required)
	 * @param fromTime Date from which to count the conversation recording length. The value is rounded to the beginning of the day. (optional)
	 * @param toTime Date to which to count the conversation recording length. The value is rounded to the end of the day. (optional)
	 * @return ApiResponse&lt;RecordedMinutesData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<RecordedMinutesData> accountsGetRecordedMinutesWithHttpInfo(String accountId, Long fromTime, Long toTime) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'accountId' is set
		if (accountId == null) {
			throw new ApiException(400, "Missing the required parameter 'accountId' when calling accountsGetRecordedMinutes");
		}

		// create path and map variables
		String localVarPath = "/accounts/{accountId}/getRecordedMinutes"
				.replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromTime", fromTime));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "toTime", toTime));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<RecordedMinutesData> localVarReturnType = new GenericType<RecordedMinutesData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the account with the given ID&lt;br&gt;
	 * 
	 * @param accountId ID of the account which should be returned (required)
	 * @param expand (optional)
	 * @return Account
	 * @throws ApiException if fails to make API call
	 */
	public Account accountsRead(String accountId, String expand) throws ApiException {
		return accountsReadWithHttpInfo(accountId, expand).getData();
	}

	/**
	 * read Returns the account with the given ID&lt;br&gt;
	 * 
	 * @param accountId ID of the account which should be returned (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;Account&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Account> accountsReadWithHttpInfo(String accountId, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'accountId' is set
		if (accountId == null) {
			throw new ApiException(400, "Missing the required parameter 'accountId' when calling accountsRead");
		}

		// create path and map variables
		String localVarPath = "/accounts/{accountId}/read"
				.replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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
	 * readMultiple Gets a list of accounts with the given IDs. IDs that can&#39;t be found are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the accounts to fetch (required)
	 * @param expand (optional)
	 * @return AccountList
	 * @throws ApiException if fails to make API call
	 */
	public AccountList accountsReadMultiple(List<String> requestBody, String expand) throws ApiException {
		return accountsReadMultipleWithHttpInfo(requestBody, expand).getData();
	}

	/**
	 * readMultiple Gets a list of accounts with the given IDs. IDs that can&#39;t be found are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the accounts to fetch (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;AccountList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AccountList> accountsReadMultipleWithHttpInfo(List<String> requestBody, String expand) throws ApiException {
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

		GenericType<AccountList> localVarReturnType = new GenericType<AccountList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * restartIngressMigration Retries the ingress migration process for the given account. This is necessary when main_account#ingress_migration_status is ERROR.
	 * &lt;p&gt; When the service is executed, it updates the ingress_activation_status to MIGRATING. This causes the ingress migration leader selection task to
	 * resume the migration.&lt;br&gt;
	 * 
	 * @param accountId The ID of the account for which the ingress migration should be restarted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void accountsRestartIngressMigration(String accountId) throws ApiException {

		accountsRestartIngressMigrationWithHttpInfo(accountId);
	}

	/**
	 * restartIngressMigration Retries the ingress migration process for the given account. This is necessary when main_account#ingress_migration_status is ERROR.
	 * &lt;p&gt; When the service is executed, it updates the ingress_activation_status to MIGRATING. This causes the ingress migration leader selection task to
	 * resume the migration.&lt;br&gt;
	 * 
	 * @param accountId The ID of the account for which the ingress migration should be restarted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> accountsRestartIngressMigrationWithHttpInfo(String accountId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'accountId' is set
		if (accountId == null) {
			throw new ApiException(400, "Missing the required parameter 'accountId' when calling accountsRestartIngressMigration");
		}

		// create path and map variables
		String localVarPath = "/accounts/{accountId}/restartIngressMigration"
				.replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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
