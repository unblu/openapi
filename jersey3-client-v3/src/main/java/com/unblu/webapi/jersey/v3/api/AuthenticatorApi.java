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
import com.unblu.webapi.model.v3.AuthenticatorChangePasswordBody;
import com.unblu.webapi.model.v3.AuthenticatorCheckPasswordAgainstPolicyBody;
import com.unblu.webapi.model.v3.AuthenticatorCreateAuthenticationTokenBody;
import com.unblu.webapi.model.v3.AuthenticatorImpersonateBody;
import com.unblu.webapi.model.v3.AuthenticatorLoginBody;
import com.unblu.webapi.model.v3.AuthenticatorLogoutBody;
import com.unblu.webapi.model.v3.AuthenticatorResetImpersonationBody;
import com.unblu.webapi.model.v3.AuthenticatorSendPasswordResetMailBody;
import com.unblu.webapi.model.v3.AuthenticatorSetDefaultLocaleBody;
import com.unblu.webapi.model.v3.AuthenticatorSetNewPasswordBody;
import com.unblu.webapi.model.v3.AuthenticatorSwitchToAccountBody;
import com.unblu.webapi.model.v3.CompactUser;
import com.unblu.webapi.model.v3.Permissions;
import com.unblu.webapi.model.v3.SecureTokenRequest;

public class AuthenticatorApi {
	private ApiClient apiClient;

	public AuthenticatorApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AuthenticatorApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * authenticateWithToken Authentication using a previously created authentication token from (&#x60;createAuthenticationToken&#x60;). Will create an
	 * authentication session if authentication succeeds (includes setting an authentication cookie)&lt;br&gt;
	 * 
	 * @param authenticationToken token to login with (optional)
	 * @param redirectOnSuccess redirection URL when the operation is successful (optional)
	 * @param redirectOnFailure redirection URL when the operation is not successful (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean authenticatorAuthenticateWithToken(String authenticationToken, String redirectOnSuccess, String redirectOnFailure) throws ApiException {
		return authenticatorAuthenticateWithTokenWithHttpInfo(authenticationToken, redirectOnSuccess, redirectOnFailure).getData();
	}

	/**
	 * authenticateWithToken Authentication using a previously created authentication token from (&#x60;createAuthenticationToken&#x60;). Will create an
	 * authentication session if authentication succeeds (includes setting an authentication cookie)&lt;br&gt;
	 * 
	 * @param authenticationToken token to login with (optional)
	 * @param redirectOnSuccess redirection URL when the operation is successful (optional)
	 * @param redirectOnFailure redirection URL when the operation is not successful (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> authenticatorAuthenticateWithTokenWithHttpInfo(String authenticationToken, String redirectOnSuccess, String redirectOnFailure) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/authenticateWithToken";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "authenticationToken", authenticationToken));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirectOnSuccess", redirectOnSuccess));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirectOnFailure", redirectOnFailure));

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
	 * changePassword Changes password for currently logged in user, if the old password is currently matching the stored password&lt;br&gt;
	 * 
	 * @param authenticatorChangePasswordBody (required)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean authenticatorChangePassword(AuthenticatorChangePasswordBody authenticatorChangePasswordBody) throws ApiException {
		return authenticatorChangePasswordWithHttpInfo(authenticatorChangePasswordBody).getData();
	}

	/**
	 * changePassword Changes password for currently logged in user, if the old password is currently matching the stored password&lt;br&gt;
	 * 
	 * @param authenticatorChangePasswordBody (required)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> authenticatorChangePasswordWithHttpInfo(AuthenticatorChangePasswordBody authenticatorChangePasswordBody) throws ApiException {
		Object localVarPostBody = authenticatorChangePasswordBody;

		// verify the required parameter 'authenticatorChangePasswordBody' is set
		if (authenticatorChangePasswordBody == null) {
			throw new ApiException(400, "Missing the required parameter 'authenticatorChangePasswordBody' when calling authenticatorChangePassword");
		}

		// create path and map variables
		String localVarPath = "/authenticator/changePassword";

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

		GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * changePassword Changes password for currently logged in user, if the old password is currently matching the stored password&lt;br&gt;
	 * 
	 * @param oldPassword (optional)
	 * @param newPassword (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public Boolean authenticatorChangePasswordLegacyGet(String oldPassword, String newPassword) throws ApiException {
		return authenticatorChangePasswordLegacyGetWithHttpInfo(oldPassword, newPassword).getData();
	}

	/**
	 * changePassword Changes password for currently logged in user, if the old password is currently matching the stored password&lt;br&gt;
	 * 
	 * @param oldPassword (optional)
	 * @param newPassword (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Boolean> authenticatorChangePasswordLegacyGetWithHttpInfo(String oldPassword, String newPassword) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/changePassword";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "oldPassword", oldPassword));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "newPassword", newPassword));

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
	 * checkPasswordAgainstPolicy checks if a &#39;potential&#39; password is valid given the current password policy&lt;br&gt;
	 * 
	 * @param authenticatorCheckPasswordAgainstPolicyBody (required)
	 * @return List&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<String> authenticatorCheckPasswordAgainstPolicy(AuthenticatorCheckPasswordAgainstPolicyBody authenticatorCheckPasswordAgainstPolicyBody) throws ApiException {
		return authenticatorCheckPasswordAgainstPolicyWithHttpInfo(authenticatorCheckPasswordAgainstPolicyBody).getData();
	}

	/**
	 * checkPasswordAgainstPolicy checks if a &#39;potential&#39; password is valid given the current password policy&lt;br&gt;
	 * 
	 * @param authenticatorCheckPasswordAgainstPolicyBody (required)
	 * @return ApiResponse&lt;List&lt;String&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<String>> authenticatorCheckPasswordAgainstPolicyWithHttpInfo(AuthenticatorCheckPasswordAgainstPolicyBody authenticatorCheckPasswordAgainstPolicyBody) throws ApiException {
		Object localVarPostBody = authenticatorCheckPasswordAgainstPolicyBody;

		// verify the required parameter 'authenticatorCheckPasswordAgainstPolicyBody' is set
		if (authenticatorCheckPasswordAgainstPolicyBody == null) {
			throw new ApiException(400, "Missing the required parameter 'authenticatorCheckPasswordAgainstPolicyBody' when calling authenticatorCheckPasswordAgainstPolicy");
		}

		// create path and map variables
		String localVarPath = "/authenticator/checkPasswordAgainstPolicy";

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

		GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * checkPasswordAgainstPolicy checks if a &#39;potential&#39; password is valid given the current password policy&lt;br&gt;
	 * 
	 * @param password (optional)
	 * @return List&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public List<String> authenticatorCheckPasswordAgainstPolicyLegacyGet(String password) throws ApiException {
		return authenticatorCheckPasswordAgainstPolicyLegacyGetWithHttpInfo(password).getData();
	}

	/**
	 * checkPasswordAgainstPolicy checks if a &#39;potential&#39; password is valid given the current password policy&lt;br&gt;
	 * 
	 * @param password (optional)
	 * @return ApiResponse&lt;List&lt;String&gt;&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<List<String>> authenticatorCheckPasswordAgainstPolicyLegacyGetWithHttpInfo(String password) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/checkPasswordAgainstPolicy";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * checkSuperAdminPasswordFile checks if a password file for the superadmin exists&lt;br&gt;
	 * 
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean authenticatorCheckSuperAdminPasswordFile() throws ApiException {
		return authenticatorCheckSuperAdminPasswordFileWithHttpInfo().getData();
	}

	/**
	 * checkSuperAdminPasswordFile checks if a password file for the superadmin exists&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> authenticatorCheckSuperAdminPasswordFileWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/checkSuperAdminPasswordFile";

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

		GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * createAuthenticationToken Creates a new authentication token, which can later be used for login.&lt;br&gt;
	 * 
	 * @param authenticatorCreateAuthenticationTokenBody (required)
	 * @return String
	 * @throws ApiException if fails to make API call
	 */
	public String authenticatorCreateAuthenticationToken(AuthenticatorCreateAuthenticationTokenBody authenticatorCreateAuthenticationTokenBody) throws ApiException {
		return authenticatorCreateAuthenticationTokenWithHttpInfo(authenticatorCreateAuthenticationTokenBody).getData();
	}

	/**
	 * createAuthenticationToken Creates a new authentication token, which can later be used for login.&lt;br&gt;
	 * 
	 * @param authenticatorCreateAuthenticationTokenBody (required)
	 * @return ApiResponse&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<String> authenticatorCreateAuthenticationTokenWithHttpInfo(AuthenticatorCreateAuthenticationTokenBody authenticatorCreateAuthenticationTokenBody) throws ApiException {
		Object localVarPostBody = authenticatorCreateAuthenticationTokenBody;

		// verify the required parameter 'authenticatorCreateAuthenticationTokenBody' is set
		if (authenticatorCreateAuthenticationTokenBody == null) {
			throw new ApiException(400, "Missing the required parameter 'authenticatorCreateAuthenticationTokenBody' when calling authenticatorCreateAuthenticationToken");
		}

		// create path and map variables
		String localVarPath = "/authenticator/createAuthenticationToken";

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

		GenericType<String> localVarReturnType = new GenericType<String>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * createAuthenticationTokenForCurrentUser Creates a new authentication token for the current logged in user.&lt;br&gt;
	 * 
	 * @return String
	 * @throws ApiException if fails to make API call
	 */
	public String authenticatorCreateAuthenticationTokenForCurrentUser() throws ApiException {
		return authenticatorCreateAuthenticationTokenForCurrentUserWithHttpInfo().getData();
	}

	/**
	 * createAuthenticationTokenForCurrentUser Creates a new authentication token for the current logged in user.&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<String> authenticatorCreateAuthenticationTokenForCurrentUserWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/createAuthenticationTokenForCurrentUser";

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

		GenericType<String> localVarReturnType = new GenericType<String>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * createAuthenticationTokenForCurrentUser Creates a new authentication token for the current logged in user.&lt;br&gt;
	 * 
	 * @return String
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public String authenticatorCreateAuthenticationTokenForCurrentUserLegacyGet() throws ApiException {
		return authenticatorCreateAuthenticationTokenForCurrentUserLegacyGetWithHttpInfo().getData();
	}

	/**
	 * createAuthenticationTokenForCurrentUser Creates a new authentication token for the current logged in user.&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<String> authenticatorCreateAuthenticationTokenForCurrentUserLegacyGetWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/createAuthenticationTokenForCurrentUser";

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

		GenericType<String> localVarReturnType = new GenericType<String>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * createAuthenticationToken Creates a new authentication token, which can later be used for login.&lt;br&gt;
	 * 
	 * @param username (optional)
	 * @param password (optional)
	 * @return String
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public String authenticatorCreateAuthenticationTokenLegacyGet(String username, String password) throws ApiException {
		return authenticatorCreateAuthenticationTokenLegacyGetWithHttpInfo(username, password).getData();
	}

	/**
	 * createAuthenticationToken Creates a new authentication token, which can later be used for login.&lt;br&gt;
	 * 
	 * @param username (optional)
	 * @param password (optional)
	 * @return ApiResponse&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<String> authenticatorCreateAuthenticationTokenLegacyGetWithHttpInfo(String username, String password) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/createAuthenticationToken";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<String> localVarReturnType = new GenericType<String>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getAuthenticatedUserDisplayName Returns the name of the user which can be displayed somewhere&lt;br&gt;
	 * 
	 * @return String
	 * @throws ApiException if fails to make API call
	 */
	public String authenticatorGetAuthenticatedUserDisplayName() throws ApiException {
		return authenticatorGetAuthenticatedUserDisplayNameWithHttpInfo().getData();
	}

	/**
	 * getAuthenticatedUserDisplayName Returns the name of the user which can be displayed somewhere&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<String> authenticatorGetAuthenticatedUserDisplayNameWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/getAuthenticatedUserDisplayName";

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

		GenericType<String> localVarReturnType = new GenericType<String>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getAuthenticatedUserName Returns the name of the logged in user&lt;br&gt;
	 * 
	 * @return String
	 * @throws ApiException if fails to make API call
	 */
	public String authenticatorGetAuthenticatedUserName() throws ApiException {
		return authenticatorGetAuthenticatedUserNameWithHttpInfo().getData();
	}

	/**
	 * getAuthenticatedUserName Returns the name of the logged in user&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<String> authenticatorGetAuthenticatedUserNameWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/getAuthenticatedUserName";

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

		GenericType<String> localVarReturnType = new GenericType<String>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getCompactUser Returns a compact user object, which contains the most important information about the current logged in user.&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return CompactUser
	 * @throws ApiException if fails to make API call
	 */
	public CompactUser authenticatorGetCompactUser(String expand) throws ApiException {
		return authenticatorGetCompactUserWithHttpInfo(expand).getData();
	}

	/**
	 * getCompactUser Returns a compact user object, which contains the most important information about the current logged in user.&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return ApiResponse&lt;CompactUser&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<CompactUser> authenticatorGetCompactUserWithHttpInfo(String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/getCompactUser";

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

		GenericType<CompactUser> localVarReturnType = new GenericType<CompactUser>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getUserId The user id of the current user&lt;br&gt;
	 * 
	 * @return String
	 * @throws ApiException if fails to make API call
	 */
	public String authenticatorGetUserId() throws ApiException {
		return authenticatorGetUserIdWithHttpInfo().getData();
	}

	/**
	 * getUserId The user id of the current user&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<String> authenticatorGetUserIdWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/getUserId";

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

		GenericType<String> localVarReturnType = new GenericType<String>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getUserPermissions Returns the permissions of the current user&lt;br&gt;
	 * 
	 * @return Permissions
	 * @throws ApiException if fails to make API call
	 */
	public Permissions authenticatorGetUserPermissions() throws ApiException {
		return authenticatorGetUserPermissionsWithHttpInfo().getData();
	}

	/**
	 * getUserPermissions Returns the permissions of the current user&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;Permissions&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Permissions> authenticatorGetUserPermissionsWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/getUserPermissions";

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

		GenericType<Permissions> localVarReturnType = new GenericType<Permissions>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getUserRole Returns the user role of the current logged in user&lt;br&gt;
	 * 
	 * @return String
	 * @throws ApiException if fails to make API call
	 */
	public String authenticatorGetUserRole() throws ApiException {
		return authenticatorGetUserRoleWithHttpInfo().getData();
	}

	/**
	 * getUserRole Returns the user role of the current logged in user&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<String> authenticatorGetUserRoleWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/getUserRole";

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

		GenericType<String> localVarReturnType = new GenericType<String>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * impersonate Impersonates with another user either via username or userid (one of the two may be null).&lt;br&gt;
	 * 
	 * @param authenticatorImpersonateBody (required)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean authenticatorImpersonate(AuthenticatorImpersonateBody authenticatorImpersonateBody) throws ApiException {
		return authenticatorImpersonateWithHttpInfo(authenticatorImpersonateBody).getData();
	}

	/**
	 * impersonate Impersonates with another user either via username or userid (one of the two may be null).&lt;br&gt;
	 * 
	 * @param authenticatorImpersonateBody (required)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> authenticatorImpersonateWithHttpInfo(AuthenticatorImpersonateBody authenticatorImpersonateBody) throws ApiException {
		Object localVarPostBody = authenticatorImpersonateBody;

		// verify the required parameter 'authenticatorImpersonateBody' is set
		if (authenticatorImpersonateBody == null) {
			throw new ApiException(400, "Missing the required parameter 'authenticatorImpersonateBody' when calling authenticatorImpersonate");
		}

		// create path and map variables
		String localVarPath = "/authenticator/impersonate";

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

		GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * impersonate Impersonates with another user either via username or userid (one of the two may be null).&lt;br&gt;
	 * 
	 * @param username (optional)
	 * @param userId (optional)
	 * @param superUser (optional)
	 * @param redirectOnSuccess (optional)
	 * @param redirectOnFailure (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public Boolean authenticatorImpersonateLegacyGet(String username, String userId, Boolean superUser, String redirectOnSuccess, String redirectOnFailure) throws ApiException {
		return authenticatorImpersonateLegacyGetWithHttpInfo(username, userId, superUser, redirectOnSuccess, redirectOnFailure).getData();
	}

	/**
	 * impersonate Impersonates with another user either via username or userid (one of the two may be null).&lt;br&gt;
	 * 
	 * @param username (optional)
	 * @param userId (optional)
	 * @param superUser (optional)
	 * @param redirectOnSuccess (optional)
	 * @param redirectOnFailure (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Boolean> authenticatorImpersonateLegacyGetWithHttpInfo(String username, String userId, Boolean superUser, String redirectOnSuccess, String redirectOnFailure) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/impersonate";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "superUser", superUser));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirectOnSuccess", redirectOnSuccess));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirectOnFailure", redirectOnFailure));

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
	 * isAuthenticated Checks if the current client is authenticated and session has not expired&lt;br&gt;
	 * 
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean authenticatorIsAuthenticated() throws ApiException {
		return authenticatorIsAuthenticatedWithHttpInfo().getData();
	}

	/**
	 * isAuthenticated Checks if the current client is authenticated and session has not expired&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> authenticatorIsAuthenticatedWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/isAuthenticated";

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

		GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * isRegisteredUser Checks if the user is a registered user and not a web user or anonymous one from the system&lt;br&gt;
	 * 
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean authenticatorIsRegisteredUser() throws ApiException {
		return authenticatorIsRegisteredUserWithHttpInfo().getData();
	}

	/**
	 * isRegisteredUser Checks if the user is a registered user and not a web user or anonymous one from the system&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> authenticatorIsRegisteredUserWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/isRegisteredUser";

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

		GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * isSuperAdmin Checks if the current user is super admin&lt;br&gt;
	 * 
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean authenticatorIsSuperAdmin() throws ApiException {
		return authenticatorIsSuperAdminWithHttpInfo().getData();
	}

	/**
	 * isSuperAdmin Checks if the current user is super admin&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> authenticatorIsSuperAdminWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/isSuperAdmin";

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

		GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * login Login using username and password credentials. Will create an authentication session if login succeeds (includes setting an authentication
	 * cookie)&lt;br&gt;
	 * 
	 * @param authenticatorLoginBody (required)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean authenticatorLogin(AuthenticatorLoginBody authenticatorLoginBody) throws ApiException {
		return authenticatorLoginWithHttpInfo(authenticatorLoginBody).getData();
	}

	/**
	 * login Login using username and password credentials. Will create an authentication session if login succeeds (includes setting an authentication
	 * cookie)&lt;br&gt;
	 * 
	 * @param authenticatorLoginBody (required)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> authenticatorLoginWithHttpInfo(AuthenticatorLoginBody authenticatorLoginBody) throws ApiException {
		Object localVarPostBody = authenticatorLoginBody;

		// verify the required parameter 'authenticatorLoginBody' is set
		if (authenticatorLoginBody == null) {
			throw new ApiException(400, "Missing the required parameter 'authenticatorLoginBody' when calling authenticatorLogin");
		}

		// create path and map variables
		String localVarPath = "/authenticator/login";

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

		GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * login Login using username and password credentials. Will create an authentication session if login succeeds (includes setting an authentication
	 * cookie)&lt;br&gt;
	 * 
	 * @param username (optional)
	 * @param password (optional)
	 * @param redirectOnSuccess (optional)
	 * @param redirectOnFailure (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public Boolean authenticatorLoginLegacyGet(String username, String password, String redirectOnSuccess, String redirectOnFailure) throws ApiException {
		return authenticatorLoginLegacyGetWithHttpInfo(username, password, redirectOnSuccess, redirectOnFailure).getData();
	}

	/**
	 * login Login using username and password credentials. Will create an authentication session if login succeeds (includes setting an authentication
	 * cookie)&lt;br&gt;
	 * 
	 * @param username (optional)
	 * @param password (optional)
	 * @param redirectOnSuccess (optional)
	 * @param redirectOnFailure (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Boolean> authenticatorLoginLegacyGetWithHttpInfo(String username, String password, String redirectOnSuccess, String redirectOnFailure) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/login";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirectOnSuccess", redirectOnSuccess));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirectOnFailure", redirectOnFailure));

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
	 * loginWithSecureToken Start a session using a signed JWT as the login credentials. A logout token can be provided in the claim set of the signed JWT. This
	 * logout token is stored in the authentication session to be used later for the &#x60;logoutWithSecureToken&#x60; call. A new user with the role WEBUSER is
	 * created automatically. If authentication is successful, the response includes an authentication cookie; the response body is empty.
	 * &lt;code&gt;x-unblu-apikey&lt;/code&gt; is a mandatory GET parameter for this operation, even though it is not part of the OpenAPI specification.
	 * 
	 * @param secureTokenRequest (required)
	 * @throws ApiException if fails to make API call
	 */
	public void authenticatorLoginWithSecureToken(SecureTokenRequest secureTokenRequest) throws ApiException {

		authenticatorLoginWithSecureTokenWithHttpInfo(secureTokenRequest);
	}

	/**
	 * loginWithSecureToken Start a session using a signed JWT as the login credentials. A logout token can be provided in the claim set of the signed JWT. This
	 * logout token is stored in the authentication session to be used later for the &#x60;logoutWithSecureToken&#x60; call. A new user with the role WEBUSER is
	 * created automatically. If authentication is successful, the response includes an authentication cookie; the response body is empty.
	 * &lt;code&gt;x-unblu-apikey&lt;/code&gt; is a mandatory GET parameter for this operation, even though it is not part of the OpenAPI specification.
	 * 
	 * @param secureTokenRequest (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> authenticatorLoginWithSecureTokenWithHttpInfo(SecureTokenRequest secureTokenRequest) throws ApiException {
		Object localVarPostBody = secureTokenRequest;

		// verify the required parameter 'secureTokenRequest' is set
		if (secureTokenRequest == null) {
			throw new ApiException(400, "Missing the required parameter 'secureTokenRequest' when calling authenticatorLoginWithSecureToken");
		}

		// create path and map variables
		String localVarPath = "/authenticator/loginWithSecureToken";

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
	 * logout Call this to logout (clear internal session and session cookie on response)&lt;br&gt;
	 * 
	 * @param authenticatorLogoutBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void authenticatorLogout(AuthenticatorLogoutBody authenticatorLogoutBody) throws ApiException {

		authenticatorLogoutWithHttpInfo(authenticatorLogoutBody);
	}

	/**
	 * logout Call this to logout (clear internal session and session cookie on response)&lt;br&gt;
	 * 
	 * @param authenticatorLogoutBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> authenticatorLogoutWithHttpInfo(AuthenticatorLogoutBody authenticatorLogoutBody) throws ApiException {
		Object localVarPostBody = authenticatorLogoutBody;

		// verify the required parameter 'authenticatorLogoutBody' is set
		if (authenticatorLogoutBody == null) {
			throw new ApiException(400, "Missing the required parameter 'authenticatorLogoutBody' when calling authenticatorLogout");
		}

		// create path and map variables
		String localVarPath = "/authenticator/logout";

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
	 * logout Call this to logout (clear internal session and session cookie on response)&lt;br&gt;
	 * 
	 * @param redirectOnSuccess (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void authenticatorLogoutLegacyGet(String redirectOnSuccess) throws ApiException {

		authenticatorLogoutLegacyGetWithHttpInfo(redirectOnSuccess);
	}

	/**
	 * logout Call this to logout (clear internal session and session cookie on response)&lt;br&gt;
	 * 
	 * @param redirectOnSuccess (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> authenticatorLogoutLegacyGetWithHttpInfo(String redirectOnSuccess) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/logout";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirectOnSuccess", redirectOnSuccess));

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
	 * logoutWithSecureToken Call this to log out using a signed JWT containing the logout token in the claim set. Use this to allow backend server(s) to log out
	 * from visitor SSO. &lt;code&gt;x-unblu-apikey&lt;/code&gt; is a mandatory GET parameter for this operation, even though it is not part of the OpenAPI
	 * specification.
	 * 
	 * @param secureTokenRequest (required)
	 * @throws ApiException if fails to make API call
	 */
	public void authenticatorLogoutWithSecureToken(SecureTokenRequest secureTokenRequest) throws ApiException {

		authenticatorLogoutWithSecureTokenWithHttpInfo(secureTokenRequest);
	}

	/**
	 * logoutWithSecureToken Call this to log out using a signed JWT containing the logout token in the claim set. Use this to allow backend server(s) to log out
	 * from visitor SSO. &lt;code&gt;x-unblu-apikey&lt;/code&gt; is a mandatory GET parameter for this operation, even though it is not part of the OpenAPI
	 * specification.
	 * 
	 * @param secureTokenRequest (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> authenticatorLogoutWithSecureTokenWithHttpInfo(SecureTokenRequest secureTokenRequest) throws ApiException {
		Object localVarPostBody = secureTokenRequest;

		// verify the required parameter 'secureTokenRequest' is set
		if (secureTokenRequest == null) {
			throw new ApiException(400, "Missing the required parameter 'secureTokenRequest' when calling authenticatorLogoutWithSecureToken");
		}

		// create path and map variables
		String localVarPath = "/authenticator/logoutWithSecureToken";

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
	 * resetImpersonation Resets the current impersonation. Will do nothing if there is no impersonation.&lt;br&gt;
	 * 
	 * @param authenticatorResetImpersonationBody (required)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean authenticatorResetImpersonation(AuthenticatorResetImpersonationBody authenticatorResetImpersonationBody) throws ApiException {
		return authenticatorResetImpersonationWithHttpInfo(authenticatorResetImpersonationBody).getData();
	}

	/**
	 * resetImpersonation Resets the current impersonation. Will do nothing if there is no impersonation.&lt;br&gt;
	 * 
	 * @param authenticatorResetImpersonationBody (required)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> authenticatorResetImpersonationWithHttpInfo(AuthenticatorResetImpersonationBody authenticatorResetImpersonationBody) throws ApiException {
		Object localVarPostBody = authenticatorResetImpersonationBody;

		// verify the required parameter 'authenticatorResetImpersonationBody' is set
		if (authenticatorResetImpersonationBody == null) {
			throw new ApiException(400, "Missing the required parameter 'authenticatorResetImpersonationBody' when calling authenticatorResetImpersonation");
		}

		// create path and map variables
		String localVarPath = "/authenticator/resetImpersonation";

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

		GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * resetImpersonation Resets the current impersonation. Will do nothing if there is no impersonation.&lt;br&gt;
	 * 
	 * @param redirectOnSuccess (optional)
	 * @param redirectOnFailure (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public Boolean authenticatorResetImpersonationLegacyGet(String redirectOnSuccess, String redirectOnFailure) throws ApiException {
		return authenticatorResetImpersonationLegacyGetWithHttpInfo(redirectOnSuccess, redirectOnFailure).getData();
	}

	/**
	 * resetImpersonation Resets the current impersonation. Will do nothing if there is no impersonation.&lt;br&gt;
	 * 
	 * @param redirectOnSuccess (optional)
	 * @param redirectOnFailure (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Boolean> authenticatorResetImpersonationLegacyGetWithHttpInfo(String redirectOnSuccess, String redirectOnFailure) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/resetImpersonation";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirectOnSuccess", redirectOnSuccess));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirectOnFailure", redirectOnFailure));

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
	 * sendPasswordResetMail Sends a reset password link to the user by email only if the user exists&lt;br&gt;
	 * 
	 * @param authenticatorSendPasswordResetMailBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void authenticatorSendPasswordResetMail(AuthenticatorSendPasswordResetMailBody authenticatorSendPasswordResetMailBody) throws ApiException {

		authenticatorSendPasswordResetMailWithHttpInfo(authenticatorSendPasswordResetMailBody);
	}

	/**
	 * sendPasswordResetMail Sends a reset password link to the user by email only if the user exists&lt;br&gt;
	 * 
	 * @param authenticatorSendPasswordResetMailBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> authenticatorSendPasswordResetMailWithHttpInfo(AuthenticatorSendPasswordResetMailBody authenticatorSendPasswordResetMailBody) throws ApiException {
		Object localVarPostBody = authenticatorSendPasswordResetMailBody;

		// verify the required parameter 'authenticatorSendPasswordResetMailBody' is set
		if (authenticatorSendPasswordResetMailBody == null) {
			throw new ApiException(400, "Missing the required parameter 'authenticatorSendPasswordResetMailBody' when calling authenticatorSendPasswordResetMail");
		}

		// create path and map variables
		String localVarPath = "/authenticator/sendPasswordResetMail";

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
	 * sendPasswordResetMail Sends a reset password link to the user by email only if the user exists&lt;br&gt;
	 * 
	 * @param username (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void authenticatorSendPasswordResetMailLegacyGet(String username) throws ApiException {

		authenticatorSendPasswordResetMailLegacyGetWithHttpInfo(username);
	}

	/**
	 * sendPasswordResetMail Sends a reset password link to the user by email only if the user exists&lt;br&gt;
	 * 
	 * @param username (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> authenticatorSendPasswordResetMailLegacyGetWithHttpInfo(String username) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/sendPasswordResetMail";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));

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
	 * setDefaultLocale Changes the language of the current user. It is stored also in the returned cookies&lt;br&gt; Note: A reload should be done
	 * afterwards.&lt;br&gt;
	 * 
	 * @param authenticatorSetDefaultLocaleBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void authenticatorSetDefaultLocale(AuthenticatorSetDefaultLocaleBody authenticatorSetDefaultLocaleBody) throws ApiException {

		authenticatorSetDefaultLocaleWithHttpInfo(authenticatorSetDefaultLocaleBody);
	}

	/**
	 * setDefaultLocale Changes the language of the current user. It is stored also in the returned cookies&lt;br&gt; Note: A reload should be done
	 * afterwards.&lt;br&gt;
	 * 
	 * @param authenticatorSetDefaultLocaleBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> authenticatorSetDefaultLocaleWithHttpInfo(AuthenticatorSetDefaultLocaleBody authenticatorSetDefaultLocaleBody) throws ApiException {
		Object localVarPostBody = authenticatorSetDefaultLocaleBody;

		// verify the required parameter 'authenticatorSetDefaultLocaleBody' is set
		if (authenticatorSetDefaultLocaleBody == null) {
			throw new ApiException(400, "Missing the required parameter 'authenticatorSetDefaultLocaleBody' when calling authenticatorSetDefaultLocale");
		}

		// create path and map variables
		String localVarPath = "/authenticator/setDefaultLocale";

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
	 * setDefaultLocale Changes the language of the current user. It is stored also in the returned cookies&lt;br&gt; Note: A reload should be done
	 * afterwards.&lt;br&gt;
	 * 
	 * @param locale (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void authenticatorSetDefaultLocaleLegacyGet(String locale) throws ApiException {

		authenticatorSetDefaultLocaleLegacyGetWithHttpInfo(locale);
	}

	/**
	 * setDefaultLocale Changes the language of the current user. It is stored also in the returned cookies&lt;br&gt; Note: A reload should be done
	 * afterwards.&lt;br&gt;
	 * 
	 * @param locale (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> authenticatorSetDefaultLocaleLegacyGetWithHttpInfo(String locale) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/setDefaultLocale";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));

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
	 * setNewPassword Saves a new password for the user behind the given authentication token. The token can be created with&#x60;createAuthenticationToken&#x60;.
	 * The user needs to be authenticated first.&lt;br&gt;
	 * 
	 * @param authenticatorSetNewPasswordBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public void authenticatorSetNewPassword(AuthenticatorSetNewPasswordBody authenticatorSetNewPasswordBody) throws ApiException {

		authenticatorSetNewPasswordWithHttpInfo(authenticatorSetNewPasswordBody);
	}

	/**
	 * setNewPassword Saves a new password for the user behind the given authentication token. The token can be created with&#x60;createAuthenticationToken&#x60;.
	 * The user needs to be authenticated first.&lt;br&gt;
	 * 
	 * @param authenticatorSetNewPasswordBody (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> authenticatorSetNewPasswordWithHttpInfo(AuthenticatorSetNewPasswordBody authenticatorSetNewPasswordBody) throws ApiException {
		Object localVarPostBody = authenticatorSetNewPasswordBody;

		// verify the required parameter 'authenticatorSetNewPasswordBody' is set
		if (authenticatorSetNewPasswordBody == null) {
			throw new ApiException(400, "Missing the required parameter 'authenticatorSetNewPasswordBody' when calling authenticatorSetNewPassword");
		}

		// create path and map variables
		String localVarPath = "/authenticator/setNewPassword";

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
	 * setNewPassword Saves a new password for the user behind the given authentication token. The token can be created with&#x60;createAuthenticationToken&#x60;.
	 * The user needs to be authenticated first.&lt;br&gt;
	 * 
	 * @param authenticationToken (optional)
	 * @param password (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void authenticatorSetNewPasswordLegacyGet(String authenticationToken, String password) throws ApiException {

		authenticatorSetNewPasswordLegacyGetWithHttpInfo(authenticationToken, password);
	}

	/**
	 * setNewPassword Saves a new password for the user behind the given authentication token. The token can be created with&#x60;createAuthenticationToken&#x60;.
	 * The user needs to be authenticated first.&lt;br&gt;
	 * 
	 * @param authenticationToken (optional)
	 * @param password (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> authenticatorSetNewPasswordLegacyGetWithHttpInfo(String authenticationToken, String password) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/setNewPassword";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "authenticationToken", authenticationToken));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));

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
	 * switchToAccount Switches the account in a given authentication session. If successful, the user is treated, as if he/she was a member of the target
	 * account.&lt;br&gt;
	 * 
	 * @param authenticatorSwitchToAccountBody (required)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean authenticatorSwitchToAccount(AuthenticatorSwitchToAccountBody authenticatorSwitchToAccountBody) throws ApiException {
		return authenticatorSwitchToAccountWithHttpInfo(authenticatorSwitchToAccountBody).getData();
	}

	/**
	 * switchToAccount Switches the account in a given authentication session. If successful, the user is treated, as if he/she was a member of the target
	 * account.&lt;br&gt;
	 * 
	 * @param authenticatorSwitchToAccountBody (required)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> authenticatorSwitchToAccountWithHttpInfo(AuthenticatorSwitchToAccountBody authenticatorSwitchToAccountBody) throws ApiException {
		Object localVarPostBody = authenticatorSwitchToAccountBody;

		// verify the required parameter 'authenticatorSwitchToAccountBody' is set
		if (authenticatorSwitchToAccountBody == null) {
			throw new ApiException(400, "Missing the required parameter 'authenticatorSwitchToAccountBody' when calling authenticatorSwitchToAccount");
		}

		// create path and map variables
		String localVarPath = "/authenticator/switchToAccount";

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

		GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * switchToAccount Switches the account in a given authentication session. If successful, the user is treated, as if he/she was a member of the target
	 * account.&lt;br&gt;
	 * 
	 * @param accountId (optional)
	 * @param redirectOnSuccess (optional)
	 * @param redirectOnFailure (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public Boolean authenticatorSwitchToAccountLegacyGet(String accountId, String redirectOnSuccess, String redirectOnFailure) throws ApiException {
		return authenticatorSwitchToAccountLegacyGetWithHttpInfo(accountId, redirectOnSuccess, redirectOnFailure).getData();
	}

	/**
	 * switchToAccount Switches the account in a given authentication session. If successful, the user is treated, as if he/she was a member of the target
	 * account.&lt;br&gt;
	 * 
	 * @param accountId (optional)
	 * @param redirectOnSuccess (optional)
	 * @param redirectOnFailure (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Boolean> authenticatorSwitchToAccountLegacyGetWithHttpInfo(String accountId, String redirectOnSuccess, String redirectOnFailure) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/switchToAccount";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountId", accountId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirectOnSuccess", redirectOnSuccess));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirectOnFailure", redirectOnFailure));

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
}
