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
import com.unblu.webapi.model.v4.PersonLabel;
import com.unblu.webapi.model.v4.PersonLabelList;
import com.unblu.webapi.model.v4.PersonLabelQuery;
import com.unblu.webapi.model.v4.PersonLabelResult;
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
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates the given person label. The ID of the person label is generated automatically. Any ID
	 * provided in the person label entity is ignored.&lt;br&gt;
	 * 
	 * @param personLabel The person label to create (required)
	 * @return PersonLabel
	 * @throws ApiException if fails to make API call
	 */
	public PersonLabel personLabelsCreate(PersonLabel personLabel) throws ApiException {
		return personLabelsCreateWithHttpInfo(personLabel).getData();
	}

	/**
	 * create &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Creates the given person label. The ID of the person label is generated automatically. Any ID
	 * provided in the person label entity is ignored.&lt;br&gt;
	 * 
	 * @param personLabel The person label to create (required)
	 * @return ApiResponse&lt;PersonLabel&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonLabel> personLabelsCreateWithHttpInfo(PersonLabel personLabel) throws ApiException {
		Object localVarPostBody = personLabel;

		// verify the required parameter 'personLabel' is set
		if (personLabel == null) {
			throw new ApiException(400, "Missing the required parameter 'personLabel' when calling personLabelsCreate");
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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<PersonLabel> localVarReturnType = new GenericType<PersonLabel>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes the person label with the given ID&lt;br&gt;
	 * 
	 * @param personLabelId The ID of the person label to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public void personLabelsDelete(String personLabelId) throws ApiException {

		personLabelsDeleteWithHttpInfo(personLabelId);
	}

	/**
	 * delete &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Deletes the person label with the given ID&lt;br&gt;
	 * 
	 * @param personLabelId The ID of the person label to delete (required)
	 * @throws ApiException if fails to make API call
	 */
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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * getByNames &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves a list of the person labels with the names provided. Names that don&#39;t match any
	 * person labels are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The names of the person labels to fetch (required)
	 * @return PersonLabelList
	 * @throws ApiException if fails to make API call
	 */
	public PersonLabelList personLabelsGetByNames(List<String> requestBody) throws ApiException {
		return personLabelsGetByNamesWithHttpInfo(requestBody).getData();
	}

	/**
	 * getByNames &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves a list of the person labels with the names provided. Names that don&#39;t match any
	 * person labels are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The names of the person labels to fetch (required)
	 * @return ApiResponse&lt;PersonLabelList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonLabelList> personLabelsGetByNamesWithHttpInfo(List<String> requestBody) throws ApiException {
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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<PersonLabelList> localVarReturnType = new GenericType<PersonLabelList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getByScope &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves the person labels found for the given scope, or an empty list if none are
	 * found&lt;br&gt;
	 * 
	 * @param personLabelsGetByScopeBody (required)
	 * @return PersonLabelList
	 * @throws ApiException if fails to make API call
	 */
	public PersonLabelList personLabelsGetByScope(PersonLabelsGetByScopeBody personLabelsGetByScopeBody) throws ApiException {
		return personLabelsGetByScopeWithHttpInfo(personLabelsGetByScopeBody).getData();
	}

	/**
	 * getByScope &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves the person labels found for the given scope, or an empty list if none are
	 * found&lt;br&gt;
	 * 
	 * @param personLabelsGetByScopeBody (required)
	 * @return ApiResponse&lt;PersonLabelList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonLabelList> personLabelsGetByScopeWithHttpInfo(PersonLabelsGetByScopeBody personLabelsGetByScopeBody) throws ApiException {
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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<PersonLabelList> localVarReturnType = new GenericType<PersonLabelList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the person label with the given ID&lt;br&gt;
	 * 
	 * @param personLabelId The ID of the person label to return (required)
	 * @return PersonLabel
	 * @throws ApiException if fails to make API call
	 */
	public PersonLabel personLabelsRead(String personLabelId) throws ApiException {
		return personLabelsReadWithHttpInfo(personLabelId).getData();
	}

	/**
	 * read &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Returns the person label with the given ID&lt;br&gt;
	 * 
	 * @param personLabelId The ID of the person label to return (required)
	 * @return ApiResponse&lt;PersonLabel&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonLabel> personLabelsReadWithHttpInfo(String personLabelId) throws ApiException {
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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<PersonLabel> localVarReturnType = new GenericType<PersonLabel>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves a list of person labels for the given IDs. IDs that don&#39;t match any person
	 * labels are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the person labels (required)
	 * @return PersonLabelList
	 * @throws ApiException if fails to make API call
	 */
	public PersonLabelList personLabelsReadMultiple(List<String> requestBody) throws ApiException {
		return personLabelsReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Retrieves a list of person labels for the given IDs. IDs that don&#39;t match any person
	 * labels are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the person labels (required)
	 * @return ApiResponse&lt;PersonLabelList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonLabelList> personLabelsReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<PersonLabelList> localVarReturnType = new GenericType<PersonLabelList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for person labels&lt;br&gt;
	 * 
	 * @param personLabelQuery The query to use for the search (required)
	 * @return PersonLabelResult
	 * @throws ApiException if fails to make API call
	 */
	public PersonLabelResult personLabelsSearch(PersonLabelQuery personLabelQuery) throws ApiException {
		return personLabelsSearchWithHttpInfo(personLabelQuery).getData();
	}

	/**
	 * search &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Searches for person labels&lt;br&gt;
	 * 
	 * @param personLabelQuery The query to use for the search (required)
	 * @return ApiResponse&lt;PersonLabelResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonLabelResult> personLabelsSearchWithHttpInfo(PersonLabelQuery personLabelQuery) throws ApiException {
		Object localVarPostBody = personLabelQuery;

		// verify the required parameter 'personLabelQuery' is set
		if (personLabelQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'personLabelQuery' when calling personLabelsSearch");
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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<PersonLabelResult> localVarReturnType = new GenericType<PersonLabelResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates the person label in the system with the given entity. The update fails if no person label
	 * exists with the ID provided.&lt;br&gt;
	 * 
	 * @param personLabel The details to update the person label with (required)
	 * @return PersonLabel
	 * @throws ApiException if fails to make API call
	 */
	public PersonLabel personLabelsUpdate(PersonLabel personLabel) throws ApiException {
		return personLabelsUpdateWithHttpInfo(personLabel).getData();
	}

	/**
	 * update &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Updates the person label in the system with the given entity. The update fails if no person label
	 * exists with the ID provided.&lt;br&gt;
	 * 
	 * @param personLabel The details to update the person label with (required)
	 * @return ApiResponse&lt;PersonLabel&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonLabel> personLabelsUpdateWithHttpInfo(PersonLabel personLabel) throws ApiException {
		Object localVarPostBody = personLabel;

		// verify the required parameter 'personLabel' is set
		if (personLabel == null) {
			throw new ApiException(400, "Missing the required parameter 'personLabel' when calling personLabelsUpdate");
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

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<PersonLabel> localVarReturnType = new GenericType<PersonLabel>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
