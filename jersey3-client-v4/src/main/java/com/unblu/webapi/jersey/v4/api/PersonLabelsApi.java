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
import com.unblu.webapi.model.v4.Label;
import com.unblu.webapi.model.v4.LabelList;
import com.unblu.webapi.model.v4.LabelQuery;
import com.unblu.webapi.model.v4.LabelResult;
import com.unblu.webapi.model.v4.PersonLabelsGetByScopeBody;

import jakarta.ws.rs.core.GenericType;

public class PersonLabelsApi {
	private ApiClient apiClient;

	public PersonLabelsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public PersonLabelsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Creates the given person label. The ID of the person label is generated automatically. Any ID provided
	 * in the person label entity is ignored.&lt;br&gt;
	 * 
	 * @param label The person label to create (required)
	 * @return Label
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public Label personLabelsCreate(Label label) throws ApiException {
		return personLabelsCreateWithHttpInfo(label).getData();
	}

	/**
	 * create &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Creates the given person label. The ID of the person label is generated automatically. Any ID provided
	 * in the person label entity is ignored.&lt;br&gt;
	 * 
	 * @param label The person label to create (required)
	 * @return ApiResponse&lt;Label&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Label> personLabelsCreateWithHttpInfo(Label label) throws ApiException {
		Object localVarPostBody = label;

		// verify the required parameter 'label' is set
		if (label == null) {
			throw new ApiException(400, "Missing the required parameter 'label' when calling personLabelsCreate");
		}

		// create path and map variables
		String localVarPath = "/personlabels/create";

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
	 * delete &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Deletes the person label with the given ID&lt;br&gt;
	 * 
	 * @param personLabelId The ID of the person label to delete (required)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void personLabelsDelete(String personLabelId) throws ApiException {

		personLabelsDeleteWithHttpInfo(personLabelId);
	}

	/**
	 * delete &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Deletes the person label with the given ID&lt;br&gt;
	 * 
	 * @param personLabelId The ID of the person label to delete (required)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> personLabelsDeleteWithHttpInfo(String personLabelId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'personLabelId' is set
		if (personLabelId == null) {
			throw new ApiException(400, "Missing the required parameter 'personLabelId' when calling personLabelsDelete");
		}

		// create path and map variables
		String localVarPath = "/personlabels/{personLabelId}/delete"
				.replaceAll("\\{" + "personLabelId" + "\\}", apiClient.escapeString(personLabelId.toString()));

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
	 * getByNames &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Retrieves a list of the person labels with the names provided. Names that don&#39;t match any
	 * person labels are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The names of the person labels to fetch (required)
	 * @return LabelList
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public LabelList personLabelsGetByNames(List<String> requestBody) throws ApiException {
		return personLabelsGetByNamesWithHttpInfo(requestBody).getData();
	}

	/**
	 * getByNames &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Retrieves a list of the person labels with the names provided. Names that don&#39;t match any
	 * person labels are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The names of the person labels to fetch (required)
	 * @return ApiResponse&lt;LabelList&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<LabelList> personLabelsGetByNamesWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling personLabelsGetByNames");
		}

		// create path and map variables
		String localVarPath = "/personlabels/getByNames";

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
	 * getByScope &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Retrieves the person labels found for the given scope, or an empty list if none are found&lt;br&gt;
	 * 
	 * @param personLabelsGetByScopeBody (required)
	 * @return LabelList
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public LabelList personLabelsGetByScope(PersonLabelsGetByScopeBody personLabelsGetByScopeBody) throws ApiException {
		return personLabelsGetByScopeWithHttpInfo(personLabelsGetByScopeBody).getData();
	}

	/**
	 * getByScope &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Retrieves the person labels found for the given scope, or an empty list if none are found&lt;br&gt;
	 * 
	 * @param personLabelsGetByScopeBody (required)
	 * @return ApiResponse&lt;LabelList&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<LabelList> personLabelsGetByScopeWithHttpInfo(PersonLabelsGetByScopeBody personLabelsGetByScopeBody) throws ApiException {
		Object localVarPostBody = personLabelsGetByScopeBody;

		// verify the required parameter 'personLabelsGetByScopeBody' is set
		if (personLabelsGetByScopeBody == null) {
			throw new ApiException(400, "Missing the required parameter 'personLabelsGetByScopeBody' when calling personLabelsGetByScope");
		}

		// create path and map variables
		String localVarPath = "/personlabels/getByScope";

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
	 * read &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Returns the person label with the given ID&lt;br&gt;
	 * 
	 * @param personLabelId The ID of the person label to return (required)
	 * @return Label
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public Label personLabelsRead(String personLabelId) throws ApiException {
		return personLabelsReadWithHttpInfo(personLabelId).getData();
	}

	/**
	 * read &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Returns the person label with the given ID&lt;br&gt;
	 * 
	 * @param personLabelId The ID of the person label to return (required)
	 * @return ApiResponse&lt;Label&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Label> personLabelsReadWithHttpInfo(String personLabelId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'personLabelId' is set
		if (personLabelId == null) {
			throw new ApiException(400, "Missing the required parameter 'personLabelId' when calling personLabelsRead");
		}

		// create path and map variables
		String localVarPath = "/personlabels/{personLabelId}/read"
				.replaceAll("\\{" + "personLabelId" + "\\}", apiClient.escapeString(personLabelId.toString()));

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
	 * readMultiple &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Retrieves a list of person labels for the given IDs. IDs that don&#39;t match any person labels
	 * are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the person labels (required)
	 * @return LabelList
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public LabelList personLabelsReadMultiple(List<String> requestBody) throws ApiException {
		return personLabelsReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Retrieves a list of person labels for the given IDs. IDs that don&#39;t match any person labels
	 * are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the person labels (required)
	 * @return ApiResponse&lt;LabelList&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<LabelList> personLabelsReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling personLabelsReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/personlabels/readMultiple";

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
	 * search &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Searches for person labels&lt;br&gt;
	 * 
	 * @param labelQuery The query to use for the search (required)
	 * @return LabelResult
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public LabelResult personLabelsSearch(LabelQuery labelQuery) throws ApiException {
		return personLabelsSearchWithHttpInfo(labelQuery).getData();
	}

	/**
	 * search &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Searches for person labels&lt;br&gt;
	 * 
	 * @param labelQuery The query to use for the search (required)
	 * @return ApiResponse&lt;LabelResult&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<LabelResult> personLabelsSearchWithHttpInfo(LabelQuery labelQuery) throws ApiException {
		Object localVarPostBody = labelQuery;

		// verify the required parameter 'labelQuery' is set
		if (labelQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'labelQuery' when calling personLabelsSearch");
		}

		// create path and map variables
		String localVarPath = "/personlabels/search";

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
	 * update &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Updates the person label in the system with the given entity. The update fails if no person label
	 * exists with the ID provided.&lt;br&gt;
	 * 
	 * @param label The details to update the person label with (required)
	 * @return Label
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public Label personLabelsUpdate(Label label) throws ApiException {
		return personLabelsUpdateWithHttpInfo(label).getData();
	}

	/**
	 * update &lt;p&gt;This endpoint is deprecated.&lt;/p&gt;Updates the person label in the system with the given entity. The update fails if no person label
	 * exists with the ID provided.&lt;br&gt;
	 * 
	 * @param label The details to update the person label with (required)
	 * @return ApiResponse&lt;Label&gt;
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Label> personLabelsUpdateWithHttpInfo(Label label) throws ApiException {
		Object localVarPostBody = label;

		// verify the required parameter 'label' is set
		if (label == null) {
			throw new ApiException(400, "Missing the required parameter 'label' when calling personLabelsUpdate");
		}

		// create path and map variables
		String localVarPath = "/personlabels/update";

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
