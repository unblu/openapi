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
	 * create Creates the given entity in the system. The id of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
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
	 * create Creates the given entity in the system. The id of the entity can not be set for create operation, a new one is generated.&lt;br&gt;
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
	 * createUserWithRandomPassword Creates a new user with a random password. The random password is returned and also send via email, if email is correctly
	 * configured.&lt;br&gt;
	 * 
	 * @param user The user data with which the new user is created (required)
	 * @param expand (optional)
	 * @return UserPasswordContainer
	 * @throws ApiException if fails to make API call
	 */
	public UserPasswordContainer usersCreateUserWithRandomPassword(User user, String expand) throws ApiException {
		return usersCreateUserWithRandomPasswordWithHttpInfo(user, expand).getData();
	}

	/**
	 * createUserWithRandomPassword Creates a new user with a random password. The random password is returned and also send via email, if email is correctly
	 * configured.&lt;br&gt;
	 * 
	 * @param user The user data with which the new user is created (required)
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
	 * createWithPassword Creates a new user with the provided password for login.&lt;br&gt;
	 * 
	 * @param userPasswordContainer The user and the password which should be created (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersCreateWithPassword(UserPasswordContainer userPasswordContainer, String expand) throws ApiException {
		return usersCreateWithPasswordWithHttpInfo(userPasswordContainer, expand).getData();
	}

	/**
	 * createWithPassword Creates a new user with the provided password for login.&lt;br&gt;
	 * 
	 * @param userPasswordContainer The user and the password which should be created (required)
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
	 * delete Deletes the entity for the given id&lt;br&gt;
	 * 
	 * @param id The id of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void usersDelete(String id) throws ApiException {

		usersDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given id&lt;br&gt;
	 * 
	 * @param id The id of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> usersDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

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
	 * delete Deletes the entity for the given id&lt;br&gt;
	 * 
	 * @param id The id of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void usersDeleteLegacyGet(String id) throws ApiException {

		usersDeleteLegacyGetWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given id&lt;br&gt;
	 * 
	 * @param id The id of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> usersDeleteLegacyGetWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

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
	 * doesUserLoginExist Checks if the given username exists in the system. Only checks the current account. This endpoint can be used for any type of users
	 * including virtual visitors.&lt;br&gt;
	 * 
	 * @param username The username which will be looked up (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean usersDoesUserLoginExist(String username) throws ApiException {
		return usersDoesUserLoginExistWithHttpInfo(username).getData();
	}

	/**
	 * doesUserLoginExist Checks if the given username exists in the system. Only checks the current account. This endpoint can be used for any type of users
	 * including virtual visitors.&lt;br&gt;
	 * 
	 * @param username The username which will be looked up (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> usersDoesUserLoginExistWithHttpInfo(String username) throws ApiException {
		Object localVarPostBody = new HashMap<>();

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
	 * getByUsername Returns the user for the given username.&lt;br&gt;
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
	 * getByUsername Returns the user for the given username.&lt;br&gt;
	 * 
	 * @param username The username of the requested user (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersGetByUsernameWithHttpInfo(String username, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

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
		Object localVarPostBody = new HashMap<>();

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
	 * isSuperUser Checks if the given user id belongs to a super admin user. This endpoint can be used for any type of users including virtual visitors.&lt;br&gt;
	 * 
	 * @param userId The id of a user which should be checked (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean usersIsSuperUser(String userId) throws ApiException {
		return usersIsSuperUserWithHttpInfo(userId).getData();
	}

	/**
	 * isSuperUser Checks if the given user id belongs to a super admin user. This endpoint can be used for any type of users including virtual visitors.&lt;br&gt;
	 * 
	 * @param userId The id of a user which should be checked (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> usersIsSuperUserWithHttpInfo(String userId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

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
	 * isUsernameAvailable Checks if the username is available in general or for the given userId. Checks all accounts and includes virtual visitors.&lt;br&gt;
	 * 
	 * @param name The name which should be checked (optional)
	 * @param userId The user id of the user for who the username should be set. When set, the name of the user (for himself) is considered as available. (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean usersIsUsernameAvailable(String name, String userId) throws ApiException {
		return usersIsUsernameAvailableWithHttpInfo(name, userId).getData();
	}

	/**
	 * isUsernameAvailable Checks if the username is available in general or for the given userId. Checks all accounts and includes virtual visitors.&lt;br&gt;
	 * 
	 * @param name The name which should be checked (optional)
	 * @param userId The user id of the user for who the username should be set. When set, the name of the user (for himself) is considered as available. (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> usersIsUsernameAvailableWithHttpInfo(String name, String userId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

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
	 * read Returns the user for the given id.&lt;br&gt;
	 * 
	 * @param id Id of the user which should be returned (optional)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersRead(String id, String expand) throws ApiException {
		return usersReadWithHttpInfo(id, expand).getData();
	}

	/**
	 * read Returns the user for the given id.&lt;br&gt;
	 * 
	 * @param id Id of the user which should be returned (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersReadWithHttpInfo(String id, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

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
	 * readMultiple Gets a list of users for the given id&#39;s. The response will not include virtual visitors.&lt;br&gt;
	 * 
	 * @param requestBody The id&#39;s for which the users should be fetched (required)
	 * @param expand (optional)
	 * @return List&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<User> usersReadMultiple(List<String> requestBody, String expand) throws ApiException {
		return usersReadMultipleWithHttpInfo(requestBody, expand).getData();
	}

	/**
	 * readMultiple Gets a list of users for the given id&#39;s. The response will not include virtual visitors.&lt;br&gt;
	 * 
	 * @param requestBody The id&#39;s for which the users should be fetched (required)
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
	 * search Search for users in the current account. The response will not include virtual visitors.&lt;br&gt;
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
	 * search Search for users in the current account. The response will not include virtual visitors.&lt;br&gt;
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
	 * update Updates the given user with the new data.&lt;br&gt;
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
	 * update Updates the given user with the new data.&lt;br&gt;
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
	 * updateAndRemovePassword Updates a user and remove the existing password of this user. Without password the user will not be able to log in directly into the
	 * system. Users without a password are typically used in setups with ID propagation.&lt;br&gt;
	 * 
	 * @param user The user which should be updated (password will be removed) (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersUpdateAndRemovePassword(User user, String expand) throws ApiException {
		return usersUpdateAndRemovePasswordWithHttpInfo(user, expand).getData();
	}

	/**
	 * updateAndRemovePassword Updates a user and remove the existing password of this user. Without password the user will not be able to log in directly into the
	 * system. Users without a password are typically used in setups with ID propagation.&lt;br&gt;
	 * 
	 * @param user The user which should be updated (password will be removed) (required)
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
	 * updatePassword Updates the password of the given user.&lt;br&gt;
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
	 * updatePassword Updates the password of the given user.&lt;br&gt;
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
	 * updatePassword Updates the password of the given user.&lt;br&gt;
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
	 * updatePassword Updates the password of the given user.&lt;br&gt;
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
		Object localVarPostBody = new HashMap<>();

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
	 * updateUserWithRandomPassword Updates the password of a user with a new random password and also the user data. The random password is returned and also send
	 * via email, if email is correctly configured.&lt;br&gt;
	 * 
	 * @param user The user which should be updated with a random password (required)
	 * @param expand (optional)
	 * @return UserPasswordContainer
	 * @throws ApiException if fails to make API call
	 */
	public UserPasswordContainer usersUpdateUserWithRandomPassword(User user, String expand) throws ApiException {
		return usersUpdateUserWithRandomPasswordWithHttpInfo(user, expand).getData();
	}

	/**
	 * updateUserWithRandomPassword Updates the password of a user with a new random password and also the user data. The random password is returned and also send
	 * via email, if email is correctly configured.&lt;br&gt;
	 * 
	 * @param user The user which should be updated with a random password (required)
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
	 * updateWithPassword Updates the password of the given user.&lt;br&gt;
	 * 
	 * @param userPasswordContainer The user and the password which should be updated (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersUpdateWithPassword(UserPasswordContainer userPasswordContainer, String expand) throws ApiException {
		return usersUpdateWithPasswordWithHttpInfo(userPasswordContainer, expand).getData();
	}

	/**
	 * updateWithPassword Updates the password of the given user.&lt;br&gt;
	 * 
	 * @param userPasswordContainer The user and the password which should be updated (required)
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
	 * userHasPassword Checks if a user has a password defined. This endpoint can be used for any type of users including virtual visitors.&lt;br&gt;
	 * 
	 * @param userId The id of the user to check (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean usersUserHasPassword(String userId) throws ApiException {
		return usersUserHasPasswordWithHttpInfo(userId).getData();
	}

	/**
	 * userHasPassword Checks if a user has a password defined. This endpoint can be used for any type of users including virtual visitors.&lt;br&gt;
	 * 
	 * @param userId The id of the user to check (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> usersUserHasPasswordWithHttpInfo(String userId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

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
