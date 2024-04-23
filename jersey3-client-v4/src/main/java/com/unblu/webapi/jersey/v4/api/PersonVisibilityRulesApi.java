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
import com.unblu.webapi.model.v4.PersonVisibilityRuleData;
import com.unblu.webapi.model.v4.PersonVisibilityRuleDataList;
import com.unblu.webapi.model.v4.PersonVisibilityRuleQuery;
import com.unblu.webapi.model.v4.PersonVisibilityRuleResult;
import com.unblu.webapi.model.v4.PersonVisibilityRulesGetByUsedLabelNameBody;

import jakarta.ws.rs.core.GenericType;

public class PersonVisibilityRulesApi {
	private ApiClient apiClient;

	public PersonVisibilityRulesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public PersonVisibilityRulesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * create Creates the given person visibility rule. The ID of the person visibility rule is generated automatically. Any ID provided in the person visibility
	 * rule entity is ignored.&lt;br&gt;
	 * 
	 * @param personVisibilityRuleData The person visibility rule to create (required)
	 * @return PersonVisibilityRuleData
	 * @throws ApiException if fails to make API call
	 */
	public PersonVisibilityRuleData personVisibilityRulesCreate(PersonVisibilityRuleData personVisibilityRuleData) throws ApiException {
		return personVisibilityRulesCreateWithHttpInfo(personVisibilityRuleData).getData();
	}

	/**
	 * create Creates the given person visibility rule. The ID of the person visibility rule is generated automatically. Any ID provided in the person visibility
	 * rule entity is ignored.&lt;br&gt;
	 * 
	 * @param personVisibilityRuleData The person visibility rule to create (required)
	 * @return ApiResponse&lt;PersonVisibilityRuleData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonVisibilityRuleData> personVisibilityRulesCreateWithHttpInfo(PersonVisibilityRuleData personVisibilityRuleData) throws ApiException {
		Object localVarPostBody = personVisibilityRuleData;

		// verify the required parameter 'personVisibilityRuleData' is set
		if (personVisibilityRuleData == null) {
			throw new ApiException(400, "Missing the required parameter 'personVisibilityRuleData' when calling personVisibilityRulesCreate");
		}

		// create path and map variables
		String localVarPath = "/personvisibilityrules/create";

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

		GenericType<PersonVisibilityRuleData> localVarReturnType = new GenericType<PersonVisibilityRuleData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the person visibility rule with the given ID&lt;br&gt;
	 * 
	 * @param personVisibilityRuleId The ID of the person visibility rule to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public void personVisibilityRulesDelete(String personVisibilityRuleId) throws ApiException {

		personVisibilityRulesDeleteWithHttpInfo(personVisibilityRuleId);
	}

	/**
	 * delete Deletes the person visibility rule with the given ID&lt;br&gt;
	 * 
	 * @param personVisibilityRuleId The ID of the person visibility rule to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> personVisibilityRulesDeleteWithHttpInfo(String personVisibilityRuleId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'personVisibilityRuleId' is set
		if (personVisibilityRuleId == null) {
			throw new ApiException(400, "Missing the required parameter 'personVisibilityRuleId' when calling personVisibilityRulesDelete");
		}

		// create path and map variables
		String localVarPath = "/personvisibilityrules/{personVisibilityRuleId}/delete"
				.replaceAll("\\{" + "personVisibilityRuleId" + "\\}", apiClient.escapeString(personVisibilityRuleId.toString()));

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
	 * getByNames Retrieves a list of the person visibility rules with the names provided. Names that don&#39;t match any person visibility rules are
	 * ignored.&lt;br&gt;
	 * 
	 * @param requestBody The names of the person visibility rules to fetch (required)
	 * @return PersonVisibilityRuleDataList
	 * @throws ApiException if fails to make API call
	 */
	public PersonVisibilityRuleDataList personVisibilityRulesGetByNames(List<String> requestBody) throws ApiException {
		return personVisibilityRulesGetByNamesWithHttpInfo(requestBody).getData();
	}

	/**
	 * getByNames Retrieves a list of the person visibility rules with the names provided. Names that don&#39;t match any person visibility rules are
	 * ignored.&lt;br&gt;
	 * 
	 * @param requestBody The names of the person visibility rules to fetch (required)
	 * @return ApiResponse&lt;PersonVisibilityRuleDataList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonVisibilityRuleDataList> personVisibilityRulesGetByNamesWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling personVisibilityRulesGetByNames");
		}

		// create path and map variables
		String localVarPath = "/personvisibilityrules/getByNames";

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

		GenericType<PersonVisibilityRuleDataList> localVarReturnType = new GenericType<PersonVisibilityRuleDataList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getByUsedLabelName Returns the person visibility rules which use the provided label name in their selection, or an empty list if none are found&lt;br&gt;
	 * 
	 * @param personVisibilityRulesGetByUsedLabelNameBody (required)
	 * @return PersonVisibilityRuleDataList
	 * @throws ApiException if fails to make API call
	 */
	public PersonVisibilityRuleDataList personVisibilityRulesGetByUsedLabelName(PersonVisibilityRulesGetByUsedLabelNameBody personVisibilityRulesGetByUsedLabelNameBody) throws ApiException {
		return personVisibilityRulesGetByUsedLabelNameWithHttpInfo(personVisibilityRulesGetByUsedLabelNameBody).getData();
	}

	/**
	 * getByUsedLabelName Returns the person visibility rules which use the provided label name in their selection, or an empty list if none are found&lt;br&gt;
	 * 
	 * @param personVisibilityRulesGetByUsedLabelNameBody (required)
	 * @return ApiResponse&lt;PersonVisibilityRuleDataList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonVisibilityRuleDataList> personVisibilityRulesGetByUsedLabelNameWithHttpInfo(PersonVisibilityRulesGetByUsedLabelNameBody personVisibilityRulesGetByUsedLabelNameBody) throws ApiException {
		Object localVarPostBody = personVisibilityRulesGetByUsedLabelNameBody;

		// verify the required parameter 'personVisibilityRulesGetByUsedLabelNameBody' is set
		if (personVisibilityRulesGetByUsedLabelNameBody == null) {
			throw new ApiException(400, "Missing the required parameter 'personVisibilityRulesGetByUsedLabelNameBody' when calling personVisibilityRulesGetByUsedLabelName");
		}

		// create path and map variables
		String localVarPath = "/personvisibilityrules/getByUsedLabelName";

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

		GenericType<PersonVisibilityRuleDataList> localVarReturnType = new GenericType<PersonVisibilityRuleDataList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the person visibility rule with the given ID&lt;br&gt;
	 * 
	 * @param personVisibilityRuleId The ID of the person visibility rule to return (required)
	 * @return PersonVisibilityRuleData
	 * @throws ApiException if fails to make API call
	 */
	public PersonVisibilityRuleData personVisibilityRulesRead(String personVisibilityRuleId) throws ApiException {
		return personVisibilityRulesReadWithHttpInfo(personVisibilityRuleId).getData();
	}

	/**
	 * read Returns the person visibility rule with the given ID&lt;br&gt;
	 * 
	 * @param personVisibilityRuleId The ID of the person visibility rule to return (required)
	 * @return ApiResponse&lt;PersonVisibilityRuleData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonVisibilityRuleData> personVisibilityRulesReadWithHttpInfo(String personVisibilityRuleId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'personVisibilityRuleId' is set
		if (personVisibilityRuleId == null) {
			throw new ApiException(400, "Missing the required parameter 'personVisibilityRuleId' when calling personVisibilityRulesRead");
		}

		// create path and map variables
		String localVarPath = "/personvisibilityrules/{personVisibilityRuleId}/read"
				.replaceAll("\\{" + "personVisibilityRuleId" + "\\}", apiClient.escapeString(personVisibilityRuleId.toString()));

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

		GenericType<PersonVisibilityRuleData> localVarReturnType = new GenericType<PersonVisibilityRuleData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Retrieves a list of person visibility rules for the given IDs. IDs that don&#39;t match any person visibility rules are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the person visibility rules (required)
	 * @return PersonVisibilityRuleDataList
	 * @throws ApiException if fails to make API call
	 */
	public PersonVisibilityRuleDataList personVisibilityRulesReadMultiple(List<String> requestBody) throws ApiException {
		return personVisibilityRulesReadMultipleWithHttpInfo(requestBody).getData();
	}

	/**
	 * readMultiple Retrieves a list of person visibility rules for the given IDs. IDs that don&#39;t match any person visibility rules are ignored.&lt;br&gt;
	 * 
	 * @param requestBody The IDs for which to fetch the person visibility rules (required)
	 * @return ApiResponse&lt;PersonVisibilityRuleDataList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonVisibilityRuleDataList> personVisibilityRulesReadMultipleWithHttpInfo(List<String> requestBody) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling personVisibilityRulesReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/personvisibilityrules/readMultiple";

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

		GenericType<PersonVisibilityRuleDataList> localVarReturnType = new GenericType<PersonVisibilityRuleDataList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Searches for person visibility rules&lt;br&gt;
	 * 
	 * @param personVisibilityRuleQuery The query to use for the search (required)
	 * @return PersonVisibilityRuleResult
	 * @throws ApiException if fails to make API call
	 */
	public PersonVisibilityRuleResult personVisibilityRulesSearch(PersonVisibilityRuleQuery personVisibilityRuleQuery) throws ApiException {
		return personVisibilityRulesSearchWithHttpInfo(personVisibilityRuleQuery).getData();
	}

	/**
	 * search Searches for person visibility rules&lt;br&gt;
	 * 
	 * @param personVisibilityRuleQuery The query to use for the search (required)
	 * @return ApiResponse&lt;PersonVisibilityRuleResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonVisibilityRuleResult> personVisibilityRulesSearchWithHttpInfo(PersonVisibilityRuleQuery personVisibilityRuleQuery) throws ApiException {
		Object localVarPostBody = personVisibilityRuleQuery;

		// verify the required parameter 'personVisibilityRuleQuery' is set
		if (personVisibilityRuleQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'personVisibilityRuleQuery' when calling personVisibilityRulesSearch");
		}

		// create path and map variables
		String localVarPath = "/personvisibilityrules/search";

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

		GenericType<PersonVisibilityRuleResult> localVarReturnType = new GenericType<PersonVisibilityRuleResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the person visibility rule. The update fails if no person visibility rule exists with the ID provided.&lt;br&gt;
	 * 
	 * @param personVisibilityRuleData The details to update the person visibility rule with (required)
	 * @return PersonVisibilityRuleData
	 * @throws ApiException if fails to make API call
	 */
	public PersonVisibilityRuleData personVisibilityRulesUpdate(PersonVisibilityRuleData personVisibilityRuleData) throws ApiException {
		return personVisibilityRulesUpdateWithHttpInfo(personVisibilityRuleData).getData();
	}

	/**
	 * update Updates the person visibility rule. The update fails if no person visibility rule exists with the ID provided.&lt;br&gt;
	 * 
	 * @param personVisibilityRuleData The details to update the person visibility rule with (required)
	 * @return ApiResponse&lt;PersonVisibilityRuleData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonVisibilityRuleData> personVisibilityRulesUpdateWithHttpInfo(PersonVisibilityRuleData personVisibilityRuleData) throws ApiException {
		Object localVarPostBody = personVisibilityRuleData;

		// verify the required parameter 'personVisibilityRuleData' is set
		if (personVisibilityRuleData == null) {
			throw new ApiException(400, "Missing the required parameter 'personVisibilityRuleData' when calling personVisibilityRulesUpdate");
		}

		// create path and map variables
		String localVarPath = "/personvisibilityrules/update";

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

		GenericType<PersonVisibilityRuleData> localVarReturnType = new GenericType<PersonVisibilityRuleData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
