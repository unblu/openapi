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
import com.unblu.webapi.model.v3.Avatar;

public class AvatarsApi {
	private ApiClient apiClient;

	public AvatarsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AvatarsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates the avatar in the system. The id can not be set for create operation, a new one is generated.&lt;br&gt;
	 * 
	 * @param avatar The entity to create (required)
	 * @return Avatar
	 * @throws ApiException if fails to make API call
	 */
	public Avatar avatarsCreate(Avatar avatar) throws ApiException {
		return avatarsCreateWithHttpInfo(avatar).getData();
	}

	/**
	 * create Creates the avatar in the system. The id can not be set for create operation, a new one is generated.&lt;br&gt;
	 * 
	 * @param avatar The entity to create (required)
	 * @return ApiResponse&lt;Avatar&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Avatar> avatarsCreateWithHttpInfo(Avatar avatar) throws ApiException {
		Object localVarPostBody = avatar;

		// verify the required parameter 'avatar' is set
		if (avatar == null) {
			throw new ApiException(400, "Missing the required parameter 'avatar' when calling avatarsCreate");
		}

		// create path and map variables
		String localVarPath = "/avatars/create";

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

		GenericType<Avatar> localVarReturnType = new GenericType<Avatar>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the avatar for the given id&lt;br&gt;
	 * 
	 * @param id Id of the entity which should be returned (optional)
	 * @return Avatar
	 * @throws ApiException if fails to make API call
	 */
	public Avatar avatarsRead(String id) throws ApiException {
		return avatarsReadWithHttpInfo(id).getData();
	}

	/**
	 * read Returns the avatar for the given id&lt;br&gt;
	 * 
	 * @param id Id of the entity which should be returned (optional)
	 * @return ApiResponse&lt;Avatar&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Avatar> avatarsReadWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new Object();

		// create path and map variables
		String localVarPath = "/avatars/read";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<Avatar> localVarReturnType = new GenericType<Avatar>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
