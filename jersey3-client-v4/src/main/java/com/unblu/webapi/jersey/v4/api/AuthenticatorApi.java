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
import com.unblu.webapi.model.v4.AuthenticationTokenCreationResult;
import com.unblu.webapi.model.v4.AuthenticatorCreateAuthenticationTokenBody;
import com.unblu.webapi.model.v4.AuthenticatorImpersonateBody;
import com.unblu.webapi.model.v4.AuthenticatorLoginBody;
import com.unblu.webapi.model.v4.AuthenticatorLogoutBody;
import com.unblu.webapi.model.v4.AuthenticatorResetImpersonationBody;
import com.unblu.webapi.model.v4.AuthenticatorSetDefaultLocaleBody;
import com.unblu.webapi.model.v4.AuthenticatorSwitchToAccountBody;
import com.unblu.webapi.model.v4.ExpandFields;
import com.unblu.webapi.model.v4.LoginResult;
import com.unblu.webapi.model.v4.PersonData;
import com.unblu.webapi.model.v4.SecureTokenRequest;

import jakarta.ws.rs.core.GenericType;

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
	 * @return LoginResult
	 * @throws ApiException if fails to make API call
	 */
	public LoginResult authenticatorAuthenticateWithToken(String authenticationToken, String redirectOnSuccess, String redirectOnFailure) throws ApiException {
		return authenticatorAuthenticateWithTokenWithHttpInfo(authenticationToken, redirectOnSuccess, redirectOnFailure).getData();
	}

	/**
	 * authenticateWithToken Authentication using a previously created authentication token from (&#x60;createAuthenticationToken&#x60;). Will create an
	 * authentication session if authentication succeeds (includes setting an authentication cookie)&lt;br&gt;
	 * 
	 * @param authenticationToken token to login with (optional)
	 * @param redirectOnSuccess redirection URL when the operation is successful (optional)
	 * @param redirectOnFailure redirection URL when the operation is not successful (optional)
	 * @return ApiResponse&lt;LoginResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<LoginResult> authenticatorAuthenticateWithTokenWithHttpInfo(String authenticationToken, String redirectOnSuccess, String redirectOnFailure) throws ApiException {
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

		GenericType<LoginResult> localVarReturnType = new GenericType<LoginResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * createAuthenticationToken Creates a new authentication token, which can later be used for login.&lt;br&gt;
	 * 
	 * @param authenticatorCreateAuthenticationTokenBody (required)
	 * @return AuthenticationTokenCreationResult
	 * @throws ApiException if fails to make API call
	 */
	public AuthenticationTokenCreationResult authenticatorCreateAuthenticationToken(AuthenticatorCreateAuthenticationTokenBody authenticatorCreateAuthenticationTokenBody) throws ApiException {
		return authenticatorCreateAuthenticationTokenWithHttpInfo(authenticatorCreateAuthenticationTokenBody).getData();
	}

	/**
	 * createAuthenticationToken Creates a new authentication token, which can later be used for login.&lt;br&gt;
	 * 
	 * @param authenticatorCreateAuthenticationTokenBody (required)
	 * @return ApiResponse&lt;AuthenticationTokenCreationResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AuthenticationTokenCreationResult> authenticatorCreateAuthenticationTokenWithHttpInfo(AuthenticatorCreateAuthenticationTokenBody authenticatorCreateAuthenticationTokenBody) throws ApiException {
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

		GenericType<AuthenticationTokenCreationResult> localVarReturnType = new GenericType<AuthenticationTokenCreationResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * createAuthenticationTokenForCurrentUser Creates a new authentication token for the current logged in user.&lt;br&gt;
	 * 
	 * @return AuthenticationTokenCreationResult
	 * @throws ApiException if fails to make API call
	 */
	public AuthenticationTokenCreationResult authenticatorCreateAuthenticationTokenForCurrentUser() throws ApiException {
		return authenticatorCreateAuthenticationTokenForCurrentUserWithHttpInfo().getData();
	}

	/**
	 * createAuthenticationTokenForCurrentUser Creates a new authentication token for the current logged in user.&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;AuthenticationTokenCreationResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AuthenticationTokenCreationResult> authenticatorCreateAuthenticationTokenForCurrentUserWithHttpInfo() throws ApiException {
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

		GenericType<AuthenticationTokenCreationResult> localVarReturnType = new GenericType<AuthenticationTokenCreationResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getCurrentPerson Returns the current person&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return PersonData
	 * @throws ApiException if fails to make API call
	 */
	public PersonData authenticatorGetCurrentPerson(List<ExpandFields> expand) throws ApiException {
		return authenticatorGetCurrentPersonWithHttpInfo(expand).getData();
	}

	/**
	 * getCurrentPerson Returns the current person&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonData> authenticatorGetCurrentPersonWithHttpInfo(List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/authenticator/getCurrentPerson";

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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<PersonData> localVarReturnType = new GenericType<PersonData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * impersonate Impersonates with another user either via username or userid (one of the two may be null).&lt;br&gt;
	 * 
	 * @param authenticatorImpersonateBody (required)
	 * @return LoginResult
	 * @throws ApiException if fails to make API call
	 */
	public LoginResult authenticatorImpersonate(AuthenticatorImpersonateBody authenticatorImpersonateBody) throws ApiException {
		return authenticatorImpersonateWithHttpInfo(authenticatorImpersonateBody).getData();
	}

	/**
	 * impersonate Impersonates with another user either via username or userid (one of the two may be null).&lt;br&gt;
	 * 
	 * @param authenticatorImpersonateBody (required)
	 * @return ApiResponse&lt;LoginResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<LoginResult> authenticatorImpersonateWithHttpInfo(AuthenticatorImpersonateBody authenticatorImpersonateBody) throws ApiException {
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

		GenericType<LoginResult> localVarReturnType = new GenericType<LoginResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * login Login using username and password credentials. Will create an authentication session if login succeeds (includes setting an authentication
	 * cookie)&lt;br&gt;
	 * 
	 * @param authenticatorLoginBody (required)
	 * @return LoginResult
	 * @throws ApiException if fails to make API call
	 */
	public LoginResult authenticatorLogin(AuthenticatorLoginBody authenticatorLoginBody) throws ApiException {
		return authenticatorLoginWithHttpInfo(authenticatorLoginBody).getData();
	}

	/**
	 * login Login using username and password credentials. Will create an authentication session if login succeeds (includes setting an authentication
	 * cookie)&lt;br&gt;
	 * 
	 * @param authenticatorLoginBody (required)
	 * @return ApiResponse&lt;LoginResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<LoginResult> authenticatorLoginWithHttpInfo(AuthenticatorLoginBody authenticatorLoginBody) throws ApiException {
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

		GenericType<LoginResult> localVarReturnType = new GenericType<LoginResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
	 * @return LoginResult
	 * @throws ApiException if fails to make API call
	 */
	public LoginResult authenticatorResetImpersonation(AuthenticatorResetImpersonationBody authenticatorResetImpersonationBody) throws ApiException {
		return authenticatorResetImpersonationWithHttpInfo(authenticatorResetImpersonationBody).getData();
	}

	/**
	 * resetImpersonation Resets the current impersonation. Will do nothing if there is no impersonation.&lt;br&gt;
	 * 
	 * @param authenticatorResetImpersonationBody (required)
	 * @return ApiResponse&lt;LoginResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<LoginResult> authenticatorResetImpersonationWithHttpInfo(AuthenticatorResetImpersonationBody authenticatorResetImpersonationBody) throws ApiException {
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

		GenericType<LoginResult> localVarReturnType = new GenericType<LoginResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
	 * switchToAccount Switches the account in a given authentication session. If successful, the user is treated, as if he/she was a member of the target
	 * account.&lt;br&gt;
	 * 
	 * @param authenticatorSwitchToAccountBody (required)
	 * @return LoginResult
	 * @throws ApiException if fails to make API call
	 */
	public LoginResult authenticatorSwitchToAccount(AuthenticatorSwitchToAccountBody authenticatorSwitchToAccountBody) throws ApiException {
		return authenticatorSwitchToAccountWithHttpInfo(authenticatorSwitchToAccountBody).getData();
	}

	/**
	 * switchToAccount Switches the account in a given authentication session. If successful, the user is treated, as if he/she was a member of the target
	 * account.&lt;br&gt;
	 * 
	 * @param authenticatorSwitchToAccountBody (required)
	 * @return ApiResponse&lt;LoginResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<LoginResult> authenticatorSwitchToAccountWithHttpInfo(AuthenticatorSwitchToAccountBody authenticatorSwitchToAccountBody) throws ApiException {
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

		GenericType<LoginResult> localVarReturnType = new GenericType<LoginResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
