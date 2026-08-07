package com.unblu.webapi.jersey.v4.api;

import com.unblu.webapi.jersey.v4.invoker.ApiException;
import com.unblu.webapi.jersey.v4.invoker.ApiClient;
import com.unblu.webapi.jersey.v4.invoker.ApiResponse;
import com.unblu.webapi.jersey.v4.invoker.Configuration;
import com.unblu.webapi.jersey.v4.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.unblu.webapi.model.v4.Label;
import com.unblu.webapi.model.v4.LabelList;
import com.unblu.webapi.model.v4.LabelQuery;
import com.unblu.webapi.model.v4.LabelResult;
import com.unblu.webapi.model.v4.LabelsGetByScopeBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LabelsApi {
	private ApiClient apiClient;

	public LabelsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public LabelsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates the given label. The ID of the label is generated automatically. Any ID provided in the
	 * label entity is ignored.&lt;br&gt;
	 * 
	 * @param label The label to create (required)
	 * @return Label
	 * @throws ApiException if fails to make API call
	 */
	public Label labelsCreate(Label label) throws ApiException {
		return labelsCreateWithHttpInfo(label).getData();
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates the given label. The ID of the label is generated automatically. Any ID provided in the
	 * label entity is ignored.&lt;br&gt;
	 * 
	 * @param label The label to create (required)
	 * @return ApiResponse&lt;Label&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Label> labelsCreateWithHttpInfo(Label label) throws ApiException {
		Object localVarPostBody = label;

		// verify the required parameter 'label' is set
		if (label == null) {
			throw new ApiException(400, "Missing the required parameter 'label' when calling labelsCreate");
		}

		// create path and map variables
		String localVarPath = "/labels/create";

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<Label> localVarReturnType = new GenericType<Label>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes the label with the given ID&lt;br&gt;
	 * 
	 * @param labelId The ID of the label to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public void labelsDelete(String labelId) throws ApiException {

		labelsDeleteWithHttpInfo(labelId);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes the label with the given ID&lt;br&gt;
	 * 
	 * @param labelId The ID of the label to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> labelsDeleteWithHttpInfo(String labelId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'labelId' is set
		if (labelId == null) {
			throw new ApiException(400, "Missing the required parameter 'labelId' when calling labelsDelete");
		}

		// create path and map variables
		String localVarPath = "/labels/{labelId}/delete"
				.replaceAll("\\{" + "labelId" + "\\}", apiClient.escapeString(labelId.toString()));

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * getByNames &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves a list of the labels with the names provided. Names that don&#39;t match any labels
	 * are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The names of the labels to fetch (required)
	 * @return LabelList
	 * @throws ApiException if fails to make API call
	 */
	public LabelList labelsGetByNames(List<String> requestBody) throws ApiException {
		return labelsGetByNamesWithHttpInfo(requestBody).getData();
	}

	/**
	 * getByNames &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves a list of the labels with the names provided. Names that don&#39;t match any labels
	 * are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The names of the labels to fetch (required)
	 * @return ApiResponse&lt;LabelList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<LabelList> labelsGetByNamesWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling labelsGetByNames");
		}

		// create path and map variables
		String localVarPath = "/labels/getByNames";

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<LabelList> localVarReturnType = new GenericType<LabelList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getByScope &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves the labels found for the given scope, or an empty list if none are found&lt;br&gt;
	 * 
	 * @param labelsGetByScopeBody (required)
	 * @return LabelList
	 * @throws ApiException if fails to make API call
	 */
	public LabelList labelsGetByScope(LabelsGetByScopeBody labelsGetByScopeBody) throws ApiException {
		return labelsGetByScopeWithHttpInfo(labelsGetByScopeBody).getData();
	}

	/**
	 * getByScope &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves the labels found for the given scope, or an empty list if none are found&lt;br&gt;
	 * 
	 * @param labelsGetByScopeBody (required)
	 * @return ApiResponse&lt;LabelList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<LabelList> labelsGetByScopeWithHttpInfo(LabelsGetByScopeBody labelsGetByScopeBody) throws ApiException {
		Object localVarPostBody = labelsGetByScopeBody;

		// verify the required parameter 'labelsGetByScopeBody' is set
		if (labelsGetByScopeBody == null) {
			throw new ApiException(400, "Missing the required parameter 'labelsGetByScopeBody' when calling labelsGetByScope");
		}

		// create path and map variables
		String localVarPath = "/labels/getByScope";

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<LabelList> localVarReturnType = new GenericType<LabelList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the label with the given ID&lt;br&gt;
	 * 
	 * @param labelId The ID of the label to return (required)
	 * @return Label
	 * @throws ApiException if fails to make API call
	 */
	public Label labelsRead(String labelId) throws ApiException {
		return labelsReadWithHttpInfo(labelId).getData();
	}

	/**
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the label with the given ID&lt;br&gt;
	 * 
	 * @param labelId The ID of the label to return (required)
	 * @return ApiResponse&lt;Label&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Label> labelsReadWithHttpInfo(String labelId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'labelId' is set
		if (labelId == null) {
			throw new ApiException(400, "Missing the required parameter 'labelId' when calling labelsRead");
		}

		// create path and map variables
		String localVarPath = "/labels/{labelId}/read"
				.replaceAll("\\{" + "labelId" + "\\}", apiClient.escapeString(labelId.toString()));

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<Label> localVarReturnType = new GenericType<Label>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves a list of labels for the given IDs. IDs that don&#39;t match any labels are
	 * ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the labels (required)
	 * @return LabelList
	 * @throws ApiException if fails to make API call
	 */
	public LabelList labelsReadMultiple(List<String> requestBody) throws ApiException {
		return labelsReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves a list of labels for the given IDs. IDs that don&#39;t match any labels are
	 * ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the labels (required)
	 * @return ApiResponse&lt;LabelList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<LabelList> labelsReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling labelsReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/labels/readMultiple";

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<LabelList> localVarReturnType = new GenericType<LabelList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for labels&lt;br&gt;
	 * 
	 * @param labelQuery The query to use for the search (required)
	 * @return LabelResult
	 * @throws ApiException if fails to make API call
	 */
	public LabelResult labelsSearch(LabelQuery labelQuery) throws ApiException {
		return labelsSearchWithHttpInfo(labelQuery).getData();
	}

	/**
	 * search &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for labels&lt;br&gt;
	 * 
	 * @param labelQuery The query to use for the search (required)
	 * @return ApiResponse&lt;LabelResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<LabelResult> labelsSearchWithHttpInfo(LabelQuery labelQuery) throws ApiException {
		Object localVarPostBody = labelQuery;

		// verify the required parameter 'labelQuery' is set
		if (labelQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'labelQuery' when calling labelsSearch");
		}

		// create path and map variables
		String localVarPath = "/labels/search";

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<LabelResult> localVarReturnType = new GenericType<LabelResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates the label in the system with the given entity. The update fails if no label exists with
	 * the ID provided.&lt;br&gt;
	 * 
	 * @param label The details to update the label with (required)
	 * @return Label
	 * @throws ApiException if fails to make API call
	 */
	public Label labelsUpdate(Label label) throws ApiException {
		return labelsUpdateWithHttpInfo(label).getData();
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates the label in the system with the given entity. The update fails if no label exists with
	 * the ID provided.&lt;br&gt;
	 * 
	 * @param label The details to update the label with (required)
	 * @return ApiResponse&lt;Label&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Label> labelsUpdateWithHttpInfo(Label label) throws ApiException {
		Object localVarPostBody = label;

		// verify the required parameter 'label' is set
		if (label == null) {
			throw new ApiException(400, "Missing the required parameter 'label' when calling labelsUpdate");
		}

		// create path and map variables
		String localVarPath = "/labels/update";

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

		String[] localVarAuthNames = new String[] { "basicAuth", "bearerAuth" };

		GenericType<Label> localVarReturnType = new GenericType<Label>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
