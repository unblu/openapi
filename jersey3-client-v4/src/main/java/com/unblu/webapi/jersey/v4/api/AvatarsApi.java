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
import com.unblu.webapi.model.v4.Avatar;

import jakarta.ws.rs.core.GenericType;

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
	 * read Returns the avatar with the given ID&lt;br&gt;
	 * 
	 * @param avatarId ID of the avatar which should be returned (required)
	 * @return Avatar
	 * @throws ApiException if fails to make API call
	 */
	public Avatar avatarsRead(String avatarId) throws ApiException {
		return avatarsReadWithHttpInfo(avatarId).getData();
	}

	/**
	 * read Returns the avatar with the given ID&lt;br&gt;
	 * 
	 * @param avatarId ID of the avatar which should be returned (required)
	 * @return ApiResponse&lt;Avatar&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Avatar> avatarsReadWithHttpInfo(String avatarId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'avatarId' is set
		if (avatarId == null) {
			throw new ApiException(400, "Missing the required parameter 'avatarId' when calling avatarsRead");
		}

		// create path and map variables
		String localVarPath = "/avatars/{avatarId}/read"
				.replaceAll("\\{" + "avatarId" + "\\}", apiClient.escapeString(avatarId.toString()));

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

		GenericType<Avatar> localVarReturnType = new GenericType<Avatar>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
