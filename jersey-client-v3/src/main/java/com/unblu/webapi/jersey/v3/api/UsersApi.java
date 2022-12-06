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
import com.unblu.webapi.model.v3.User;
import com.unblu.webapi.model.v3.UserPasswordContainer;
import com.unblu.webapi.model.v3.UserQuery;
import com.unblu.webapi.model.v3.UserResult;
import com.unblu.webapi.model.v3.UsersUpdatePasswordBody;

public class UsersApi {
	private ApiClient apiClient;

	public UsersApi() {
		this(Configuration.getDefaultApiClient());
	}

	public UsersApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
	 * 
	 * @param user The entity to create (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersCreate(User user, String expand) throws ApiException {
		return usersCreateWithHttpInfo(user, expand).getData();
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
	 * 
	 * @param user The entity to create (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersCreateWithHttpInfo(User user, String expand) throws ApiException {
		Object localVarPostBody = user;

		// verify the required parameter 'user' is set
		if (user == null) {
			throw new ApiException(400, "Missing the required parameter 'user' when calling usersCreate");
		}

		// create path and map variables
		String localVarPath = "/users/create";

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

		GenericType<User> localVarReturnType = new GenericType<User>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * createUserWithRandomPassword Creates a new user with a random password. The random password is returned and also sent via email, if email is configured
	 * correctly.&lt;br&gt;
	 * 
	 * @param user The data to create the new user with (required)
	 * @param expand (optional)
	 * @return UserPasswordContainer
	 * @throws ApiException if fails to make API call
	 */
	public UserPasswordContainer usersCreateUserWithRandomPassword(User user, String expand) throws ApiException {
		return usersCreateUserWithRandomPasswordWithHttpInfo(user, expand).getData();
	}

	/**
	 * createUserWithRandomPassword Creates a new user with a random password. The random password is returned and also sent via email, if email is configured
	 * correctly.&lt;br&gt;
	 * 
	 * @param user The data to create the new user with (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;UserPasswordContainer&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<UserPasswordContainer> usersCreateUserWithRandomPasswordWithHttpInfo(User user, String expand) throws ApiException {
		Object localVarPostBody = user;

		// verify the required parameter 'user' is set
		if (user == null) {
			throw new ApiException(400, "Missing the required parameter 'user' when calling usersCreateUserWithRandomPassword");
		}

		// create path and map variables
		String localVarPath = "/users/createUserWithRandomPassword";

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

		GenericType<UserPasswordContainer> localVarReturnType = new GenericType<UserPasswordContainer>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * createWithPassword Creates a new user with the provided password.&lt;br&gt;
	 * 
	 * @param userPasswordContainer The user and the password to create (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersCreateWithPassword(UserPasswordContainer userPasswordContainer, String expand) throws ApiException {
		return usersCreateWithPasswordWithHttpInfo(userPasswordContainer, expand).getData();
	}

	/**
	 * createWithPassword Creates a new user with the provided password.&lt;br&gt;
	 * 
	 * @param userPasswordContainer The user and the password to create (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersCreateWithPasswordWithHttpInfo(UserPasswordContainer userPasswordContainer, String expand) throws ApiException {
		Object localVarPostBody = userPasswordContainer;

		// verify the required parameter 'userPasswordContainer' is set
		if (userPasswordContainer == null) {
			throw new ApiException(400, "Missing the required parameter 'userPasswordContainer' when calling usersCreateWithPassword");
		}

		// create path and map variables
		String localVarPath = "/users/createWithPassword";

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

		GenericType<User> localVarReturnType = new GenericType<User>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void usersDelete(String id) throws ApiException {

		usersDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> usersDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/users/delete";

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
	public void usersDeleteLegacyGet(String id) throws ApiException {

		usersDeleteLegacyGetWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> usersDeleteLegacyGetWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/users/delete";

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
	 * doesUserLoginExist Checks if the given username exists in the current account. This endpoint can be used for all types of user, including virtual
	 * visitors.&lt;br&gt;
	 * 
	 * @param username The username to look up (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean usersDoesUserLoginExist(String username) throws ApiException {
		return usersDoesUserLoginExistWithHttpInfo(username).getData();
	}

	/**
	 * doesUserLoginExist Checks if the given username exists in the current account. This endpoint can be used for all types of user, including virtual
	 * visitors.&lt;br&gt;
	 * 
	 * @param username The username to look up (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> usersDoesUserLoginExistWithHttpInfo(String username) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/users/doesUserLoginExist";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));

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
	 * getByUsername Returns the user with the given username.&lt;br&gt;
	 * 
	 * @param username The username of the requested user (optional)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersGetByUsername(String username, String expand) throws ApiException {
		return usersGetByUsernameWithHttpInfo(username, expand).getData();
	}

	/**
	 * getByUsername Returns the user with the given username.&lt;br&gt;
	 * 
	 * @param username The username of the requested user (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersGetByUsernameWithHttpInfo(String username, String expand) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/users/getByUsername";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<User> localVarReturnType = new GenericType<User>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getQuotaUsage Returns the number of entities already existing (for the current account)&lt;br&gt;
	 * 
	 * @return Integer
	 * @throws ApiException if fails to make API call
	 */
	public Integer usersGetQuotaUsage() throws ApiException {
		return usersGetQuotaUsageWithHttpInfo().getData();
	}

	/**
	 * getQuotaUsage Returns the number of entities already existing (for the current account)&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;Integer&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Integer> usersGetQuotaUsageWithHttpInfo() throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/users/getQuotaUsage";

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

		GenericType<Integer> localVarReturnType = new GenericType<Integer>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * isSuperUser Checks if the given user ID belongs to a superadmin user.&lt;br&gt;
	 * 
	 * @param userId The user ID to check (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean usersIsSuperUser(String userId) throws ApiException {
		return usersIsSuperUserWithHttpInfo(userId).getData();
	}

	/**
	 * isSuperUser Checks if the given user ID belongs to a superadmin user.&lt;br&gt;
	 * 
	 * @param userId The user ID to check (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> usersIsSuperUserWithHttpInfo(String userId) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/users/isSuperUser";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));

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
	 * isUsernameAvailable Checks if the username is available, in general or for the given user ID. If the context account isn&#39;t ingress-enabled, calling the
	 * endpoint checks all accounts and includes virtual visitors. If ingress is enabled, only users in the context account are checked.&lt;br&gt;
	 * 
	 * @param name The username to check (optional)
	 * @param userId The user ID of the user to check the username for. If their username matches the one provided, the username is considered to be available.
	 * (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean usersIsUsernameAvailable(String name, String userId) throws ApiException {
		return usersIsUsernameAvailableWithHttpInfo(name, userId).getData();
	}

	/**
	 * isUsernameAvailable Checks if the username is available, in general or for the given user ID. If the context account isn&#39;t ingress-enabled, calling the
	 * endpoint checks all accounts and includes virtual visitors. If ingress is enabled, only users in the context account are checked.&lt;br&gt;
	 * 
	 * @param name The username to check (optional)
	 * @param userId The user ID of the user to check the username for. If their username matches the one provided, the username is considered to be available.
	 * (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> usersIsUsernameAvailableWithHttpInfo(String name, String userId) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/users/isUsernameAvailable";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));

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
	 * read Returns the user for the given ID.&lt;br&gt;
	 * 
	 * @param id The ID of the user to return (optional)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersRead(String id, String expand) throws ApiException {
		return usersReadWithHttpInfo(id, expand).getData();
	}

	/**
	 * read Returns the user for the given ID.&lt;br&gt;
	 * 
	 * @param id The ID of the user to return (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersReadWithHttpInfo(String id, String expand) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/users/read";

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

		GenericType<User> localVarReturnType = new GenericType<User>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of users for the given IDs. The response doesn&#39;t include virtual visitors.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the users to be fetched (required)
	 * @param expand (optional)
	 * @return List&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<User> usersReadMultiple(List<String> requestBody, String expand) throws ApiException {
		return usersReadMultipleWithHttpInfo(requestBody, expand).getData();
	}

	/**
	 * readMultiple Gets a list of users for the given IDs. The response doesn&#39;t include virtual visitors.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the users to be fetched (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;List&lt;User&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<User>> usersReadMultipleWithHttpInfo(List<String> requestBody, String expand) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling usersReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/users/readMultiple";

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

		GenericType<List<User>> localVarReturnType = new GenericType<List<User>>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for users in the current account. The response doesn&#39;t include virtual visitors.&lt;br&gt;
	 * 
	 * @param userQuery (required)
	 * @param expand (optional)
	 * @return UserResult
	 * @throws ApiException if fails to make API call
	 */
	public UserResult usersSearch(UserQuery userQuery, String expand) throws ApiException {
		return usersSearchWithHttpInfo(userQuery, expand).getData();
	}

	/**
	 * search Search for users in the current account. The response doesn&#39;t include virtual visitors.&lt;br&gt;
	 * 
	 * @param userQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;UserResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<UserResult> usersSearchWithHttpInfo(UserQuery userQuery, String expand) throws ApiException {
		Object localVarPostBody = userQuery;

		// verify the required parameter 'userQuery' is set
		if (userQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'userQuery' when calling usersSearch");
		}

		// create path and map variables
		String localVarPath = "/users/search";

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

		GenericType<UserResult> localVarReturnType = new GenericType<UserResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the given user with the provided data.&lt;br&gt;
	 * 
	 * @param user The new user data (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersUpdate(User user, String expand) throws ApiException {
		return usersUpdateWithHttpInfo(user, expand).getData();
	}

	/**
	 * update Updates the given user with the provided data.&lt;br&gt;
	 * 
	 * @param user The new user data (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersUpdateWithHttpInfo(User user, String expand) throws ApiException {
		Object localVarPostBody = user;

		// verify the required parameter 'user' is set
		if (user == null) {
			throw new ApiException(400, "Missing the required parameter 'user' when calling usersUpdate");
		}

		// create path and map variables
		String localVarPath = "/users/update";

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

		GenericType<User> localVarReturnType = new GenericType<User>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * updateAndRemovePassword Updates a user and removes their existing password. Without a password, the user can&#39;t log in to Unblu directly. Users without a
	 * password are typically used in setups with ID propagation.&lt;br&gt;
	 * 
	 * @param user The user to update; their password will be removed (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersUpdateAndRemovePassword(User user, String expand) throws ApiException {
		return usersUpdateAndRemovePasswordWithHttpInfo(user, expand).getData();
	}

	/**
	 * updateAndRemovePassword Updates a user and removes their existing password. Without a password, the user can&#39;t log in to Unblu directly. Users without a
	 * password are typically used in setups with ID propagation.&lt;br&gt;
	 * 
	 * @param user The user to update; their password will be removed (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersUpdateAndRemovePasswordWithHttpInfo(User user, String expand) throws ApiException {
		Object localVarPostBody = user;

		// verify the required parameter 'user' is set
		if (user == null) {
			throw new ApiException(400, "Missing the required parameter 'user' when calling usersUpdateAndRemovePassword");
		}

		// create path and map variables
		String localVarPath = "/users/updateAndRemovePassword";

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

		GenericType<User> localVarReturnType = new GenericType<User>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * updatePassword Updates the given user&#39;s password.&lt;br&gt;
	 * 
	 * @param usersUpdatePasswordBody (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersUpdatePassword(UsersUpdatePasswordBody usersUpdatePasswordBody, String expand) throws ApiException {
		return usersUpdatePasswordWithHttpInfo(usersUpdatePasswordBody, expand).getData();
	}

	/**
	 * updatePassword Updates the given user&#39;s password.&lt;br&gt;
	 * 
	 * @param usersUpdatePasswordBody (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersUpdatePasswordWithHttpInfo(UsersUpdatePasswordBody usersUpdatePasswordBody, String expand) throws ApiException {
		Object localVarPostBody = usersUpdatePasswordBody;

		// verify the required parameter 'usersUpdatePasswordBody' is set
		if (usersUpdatePasswordBody == null) {
			throw new ApiException(400, "Missing the required parameter 'usersUpdatePasswordBody' when calling usersUpdatePassword");
		}

		// create path and map variables
		String localVarPath = "/users/updatePassword";

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

		GenericType<User> localVarReturnType = new GenericType<User>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * updatePassword Updates the given user&#39;s password.&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @param userId (optional)
	 * @param password (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public User usersUpdatePasswordLegacyGet(String expand, String userId, String password) throws ApiException {
		return usersUpdatePasswordLegacyGetWithHttpInfo(expand, userId, password).getData();
	}

	/**
	 * updatePassword Updates the given user&#39;s password.&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @param userId (optional)
	 * @param password (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<User> usersUpdatePasswordLegacyGetWithHttpInfo(String expand, String userId, String password) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/users/updatePassword";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<User> localVarReturnType = new GenericType<User>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * updateUserWithRandomPassword Updates a user&#39;s password with a new random password, and updates the user&#39;s data. The random password is returned and
	 * also sent via email, if email is configured correctly.&lt;br&gt;
	 * 
	 * @param user The user to update and assign a random password to (required)
	 * @param expand (optional)
	 * @return UserPasswordContainer
	 * @throws ApiException if fails to make API call
	 */
	public UserPasswordContainer usersUpdateUserWithRandomPassword(User user, String expand) throws ApiException {
		return usersUpdateUserWithRandomPasswordWithHttpInfo(user, expand).getData();
	}

	/**
	 * updateUserWithRandomPassword Updates a user&#39;s password with a new random password, and updates the user&#39;s data. The random password is returned and
	 * also sent via email, if email is configured correctly.&lt;br&gt;
	 * 
	 * @param user The user to update and assign a random password to (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;UserPasswordContainer&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<UserPasswordContainer> usersUpdateUserWithRandomPasswordWithHttpInfo(User user, String expand) throws ApiException {
		Object localVarPostBody = user;

		// verify the required parameter 'user' is set
		if (user == null) {
			throw new ApiException(400, "Missing the required parameter 'user' when calling usersUpdateUserWithRandomPassword");
		}

		// create path and map variables
		String localVarPath = "/users/updateUserWithRandomPassword";

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

		GenericType<UserPasswordContainer> localVarReturnType = new GenericType<UserPasswordContainer>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * updateWithPassword Updates the password and user data of the given user.&lt;br&gt;
	 * 
	 * @param userPasswordContainer A container for the user to update and their new password (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersUpdateWithPassword(UserPasswordContainer userPasswordContainer, String expand) throws ApiException {
		return usersUpdateWithPasswordWithHttpInfo(userPasswordContainer, expand).getData();
	}

	/**
	 * updateWithPassword Updates the password and user data of the given user.&lt;br&gt;
	 * 
	 * @param userPasswordContainer A container for the user to update and their new password (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersUpdateWithPasswordWithHttpInfo(UserPasswordContainer userPasswordContainer, String expand) throws ApiException {
		Object localVarPostBody = userPasswordContainer;

		// verify the required parameter 'userPasswordContainer' is set
		if (userPasswordContainer == null) {
			throw new ApiException(400, "Missing the required parameter 'userPasswordContainer' when calling usersUpdateWithPassword");
		}

		// create path and map variables
		String localVarPath = "/users/updateWithPassword";

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

		GenericType<User> localVarReturnType = new GenericType<User>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * userHasPassword Checks if a user has a password. This endpoint can be used for any type of user, including virtual visitors.&lt;br&gt;
	 * 
	 * @param userId The ID of the user to check (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean usersUserHasPassword(String userId) throws ApiException {
		return usersUserHasPasswordWithHttpInfo(userId).getData();
	}

	/**
	 * userHasPassword Checks if a user has a password. This endpoint can be used for any type of user, including virtual visitors.&lt;br&gt;
	 * 
	 * @param userId The ID of the user to check (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> usersUserHasPasswordWithHttpInfo(String userId) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/users/userHasPassword";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));

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
