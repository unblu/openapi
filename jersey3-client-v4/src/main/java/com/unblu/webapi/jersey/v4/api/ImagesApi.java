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
import com.unblu.webapi.model.v4.Image;

import jakarta.ws.rs.core.GenericType;

public class ImagesApi {
	private ApiClient apiClient;

	public ImagesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ImagesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * read Returns the image with the given ID&lt;br&gt;
	 * 
	 * @param imageId ID of the image which should be returned (required)
	 * @return Image
	 * @throws ApiException if fails to make API call
	 */
	public Image imagesRead(String imageId) throws ApiException {
		return imagesReadWithHttpInfo(imageId).getData();
	}

	/**
	 * read Returns the image with the given ID&lt;br&gt;
	 * 
	 * @param imageId ID of the image which should be returned (required)
	 * @return ApiResponse&lt;Image&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Image> imagesReadWithHttpInfo(String imageId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'imageId' is set
		if (imageId == null) {
			throw new ApiException(400, "Missing the required parameter 'imageId' when calling imagesRead");
		}

		// create path and map variables
		String localVarPath = "/images/{imageId}/read"
				.replaceAll("\\{" + "imageId" + "\\}", apiClient.escapeString(imageId.toString()));

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

		GenericType<Image> localVarReturnType = new GenericType<Image>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
