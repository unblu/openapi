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
import com.unblu.webapi.model.v4.ExpandFields;
import com.unblu.webapi.model.v4.HasPasswordData;
import com.unblu.webapi.model.v4.User;
import com.unblu.webapi.model.v4.UserList;
import com.unblu.webapi.model.v4.UserPasswordContainer;
import com.unblu.webapi.model.v4.UserQuery;
import com.unblu.webapi.model.v4.UserResult;
import com.unblu.webapi.model.v4.UsersSetPasswordBody;
import com.unblu.webapi.model.v4.UsersTransformVirtualToPhysicalBody;

import jakarta.ws.rs.core.GenericType;

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
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
	 * 
	 * @param user The entity to create (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersCreate(User user, List<ExpandFields> expand) throws ApiException {
		return usersCreateWithHttpInfo(user, expand).getData();
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
	 * 
	 * @param user The entity to create (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersCreateWithHttpInfo(User user, List<ExpandFields> expand) throws ApiException {
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

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

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
	 * createWithPassword Creates a new user with the provided password.&lt;br&gt;
	 * 
	 * @param userPasswordContainer The user and the password to create (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersCreateWithPassword(UserPasswordContainer userPasswordContainer, List<ExpandFields> expand) throws ApiException {
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
	public ApiResponse<User> usersCreateWithPasswordWithHttpInfo(UserPasswordContainer userPasswordContainer, List<ExpandFields> expand) throws ApiException {
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

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

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
	 * createWithRandomPassword Creates a new user with a random password. The random password is sent via email.&lt;br&gt;
	 * 
	 * @param user The data to create the new user with (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersCreateWithRandomPassword(User user, List<ExpandFields> expand) throws ApiException {
		return usersCreateWithRandomPasswordWithHttpInfo(user, expand).getData();
	}

	/**
	 * createWithRandomPassword Creates a new user with a random password. The random password is sent via email.&lt;br&gt;
	 * 
	 * @param user The data to create the new user with (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersCreateWithRandomPasswordWithHttpInfo(User user, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = user;

		// verify the required parameter 'user' is set
		if (user == null) {
			throw new ApiException(400, "Missing the required parameter 'user' when calling usersCreateWithRandomPassword");
		}

		// create path and map variables
		String localVarPath = "/users/createWithRandomPassword";

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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<User> localVarReturnType = new GenericType<User>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the user with the given ID&lt;br&gt;
	 * 
	 * @param userId The ID of the user which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void usersDelete(String userId) throws ApiException {

		usersDeleteWithHttpInfo(userId);
	}

	/**
	 * delete Deletes the user with the given ID&lt;br&gt;
	 * 
	 * @param userId The ID of the user which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> usersDeleteWithHttpInfo(String userId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'userId' is set
		if (userId == null) {
			throw new ApiException(400, "Missing the required parameter 'userId' when calling usersDelete");
		}

		// create path and map variables
		String localVarPath = "/users/{userId}/delete"
				.replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
	 * getByUsername Returns the user with the given username.&lt;br&gt;
	 * 
	 * @param username The username of the requested user (optional)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersGetByUsername(String username, List<ExpandFields> expand) throws ApiException {
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
	public ApiResponse<User> usersGetByUsernameWithHttpInfo(String username, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/users/getByUsername";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

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
	 * hasPassword Checks if a user has a password. This endpoint can be used for any type of user, including virtual visitors.&lt;br&gt;
	 * 
	 * @param userId The ID of the user to check (required)
	 * @return HasPasswordData
	 * @throws ApiException if fails to make API call
	 */
	public HasPasswordData usersHasPassword(String userId) throws ApiException {
		return usersHasPasswordWithHttpInfo(userId).getData();
	}

	/**
	 * hasPassword Checks if a user has a password. This endpoint can be used for any type of user, including virtual visitors.&lt;br&gt;
	 * 
	 * @param userId The ID of the user to check (required)
	 * @return ApiResponse&lt;HasPasswordData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<HasPasswordData> usersHasPasswordWithHttpInfo(String userId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'userId' is set
		if (userId == null) {
			throw new ApiException(400, "Missing the required parameter 'userId' when calling usersHasPassword");
		}

		// create path and map variables
		String localVarPath = "/users/{userId}/hasPassword"
				.replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

		GenericType<HasPasswordData> localVarReturnType = new GenericType<HasPasswordData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the user with the given ID.&lt;br&gt;
	 * 
	 * @param userId The ID of the user to return (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersRead(String userId, List<ExpandFields> expand) throws ApiException {
		return usersReadWithHttpInfo(userId, expand).getData();
	}

	/**
	 * read Returns the user with the given ID.&lt;br&gt;
	 * 
	 * @param userId The ID of the user to return (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersReadWithHttpInfo(String userId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'userId' is set
		if (userId == null) {
			throw new ApiException(400, "Missing the required parameter 'userId' when calling usersRead");
		}

		// create path and map variables
		String localVarPath = "/users/{userId}/read"
				.replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

		GenericType<User> localVarReturnType = new GenericType<User>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of users for the given IDs. The response doesn&#39;t include virtual visitors.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the users to be fetched (required)
	 * @param expand (optional)
	 * @return UserList
	 * @throws ApiException if fails to make API call
	 */
	public UserList usersReadMultiple(List<String> requestBody, List<ExpandFields> expand) throws ApiException {
		return usersReadMultipleWithHttpInfo(requestBody, expand).getData();
	}

	/**
	 * readMultiple Gets a list of users for the given IDs. The response doesn&#39;t include virtual visitors.&lt;br&gt;
	 * 
	 * @param requestBody The IDs of the users to be fetched (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;UserList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<UserList> usersReadMultipleWithHttpInfo(List<String> requestBody, List<ExpandFields> expand) throws ApiException {
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

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {
			"application/json"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<UserList> localVarReturnType = new GenericType<UserList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * removePassword Removes the password for the user with the given ID. Without a password, the user can&#39;t log in to Unblu directly. Users without a password
	 * are typically used in setups with ID propagation.&lt;br&gt;
	 * 
	 * @param userId The ID of the user whose password will be removed (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersRemovePassword(String userId, List<ExpandFields> expand) throws ApiException {
		return usersRemovePasswordWithHttpInfo(userId, expand).getData();
	}

	/**
	 * removePassword Removes the password for the user with the given ID. Without a password, the user can&#39;t log in to Unblu directly. Users without a password
	 * are typically used in setups with ID propagation.&lt;br&gt;
	 * 
	 * @param userId The ID of the user whose password will be removed (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersRemovePasswordWithHttpInfo(String userId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'userId' is set
		if (userId == null) {
			throw new ApiException(400, "Missing the required parameter 'userId' when calling usersRemovePassword");
		}

		// create path and map variables
		String localVarPath = "/users/{userId}/removePassword"
				.replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

		GenericType<User> localVarReturnType = new GenericType<User>() {
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
	public UserResult usersSearch(UserQuery userQuery, List<ExpandFields> expand) throws ApiException {
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
	public ApiResponse<UserResult> usersSearchWithHttpInfo(UserQuery userQuery, List<ExpandFields> expand) throws ApiException {
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

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

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
	 * setPassword Updates the given user&#39;s password.&lt;br&gt;
	 * 
	 * @param userId The ID of the user whose password should be updated (required)
	 * @param usersSetPasswordBody (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersSetPassword(String userId, UsersSetPasswordBody usersSetPasswordBody, List<ExpandFields> expand) throws ApiException {
		return usersSetPasswordWithHttpInfo(userId, usersSetPasswordBody, expand).getData();
	}

	/**
	 * setPassword Updates the given user&#39;s password.&lt;br&gt;
	 * 
	 * @param userId The ID of the user whose password should be updated (required)
	 * @param usersSetPasswordBody (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersSetPasswordWithHttpInfo(String userId, UsersSetPasswordBody usersSetPasswordBody, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = usersSetPasswordBody;

		// verify the required parameter 'userId' is set
		if (userId == null) {
			throw new ApiException(400, "Missing the required parameter 'userId' when calling usersSetPassword");
		}

		// verify the required parameter 'usersSetPasswordBody' is set
		if (usersSetPasswordBody == null) {
			throw new ApiException(400, "Missing the required parameter 'usersSetPasswordBody' when calling usersSetPassword");
		}

		// create path and map variables
		String localVarPath = "/users/{userId}/setPassword"
				.replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<User> localVarReturnType = new GenericType<User>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setRandomPassword Updates a user&#39;s password with a new random password. The random password is sent via email.&lt;br&gt;
	 * 
	 * @param userId The ID of the user who will be assigned a random password (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersSetRandomPassword(String userId, List<ExpandFields> expand) throws ApiException {
		return usersSetRandomPasswordWithHttpInfo(userId, expand).getData();
	}

	/**
	 * setRandomPassword Updates a user&#39;s password with a new random password. The random password is sent via email.&lt;br&gt;
	 * 
	 * @param userId The ID of the user who will be assigned a random password (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersSetRandomPasswordWithHttpInfo(String userId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'userId' is set
		if (userId == null) {
			throw new ApiException(400, "Missing the required parameter 'userId' when calling usersSetRandomPassword");
		}

		// create path and map variables
		String localVarPath = "/users/{userId}/setRandomPassword"
				.replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

		GenericType<User> localVarReturnType = new GenericType<User>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * transformVirtualToPhysical Converts the user with the given username from a virtual to a physical user. This also changes the related &#x60;Person&#x60;
	 * entity to a physical&#x60;Person&#x60;. If the user&#39;s already physical, the user is simply returned. If no user with the given username exists, the
	 * endpoint returns an error.&lt;br&gt;
	 * 
	 * @param usersTransformVirtualToPhysicalBody (required)
	 * @param expand (optional)
	 * @return User
	 * @throws ApiException if fails to make API call
	 */
	public User usersTransformVirtualToPhysical(UsersTransformVirtualToPhysicalBody usersTransformVirtualToPhysicalBody, List<ExpandFields> expand) throws ApiException {
		return usersTransformVirtualToPhysicalWithHttpInfo(usersTransformVirtualToPhysicalBody, expand).getData();
	}

	/**
	 * transformVirtualToPhysical Converts the user with the given username from a virtual to a physical user. This also changes the related &#x60;Person&#x60;
	 * entity to a physical&#x60;Person&#x60;. If the user&#39;s already physical, the user is simply returned. If no user with the given username exists, the
	 * endpoint returns an error.&lt;br&gt;
	 * 
	 * @param usersTransformVirtualToPhysicalBody (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;User&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<User> usersTransformVirtualToPhysicalWithHttpInfo(UsersTransformVirtualToPhysicalBody usersTransformVirtualToPhysicalBody, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = usersTransformVirtualToPhysicalBody;

		// verify the required parameter 'usersTransformVirtualToPhysicalBody' is set
		if (usersTransformVirtualToPhysicalBody == null) {
			throw new ApiException(400, "Missing the required parameter 'usersTransformVirtualToPhysicalBody' when calling usersTransformVirtualToPhysical");
		}

		// create path and map variables
		String localVarPath = "/users/transformVirtualToPhysical";

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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<User> localVarReturnType = new GenericType<User>() {
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
	public User usersUpdate(User user, List<ExpandFields> expand) throws ApiException {
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
	public ApiResponse<User> usersUpdateWithHttpInfo(User user, List<ExpandFields> expand) throws ApiException {
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

		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

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
}
