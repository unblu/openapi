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
import com.unblu.webapi.model.v4.AgentPersonStateData;
import com.unblu.webapi.model.v4.AgentPersonStateResult;
import com.unblu.webapi.model.v4.AgentStateQuery;
import com.unblu.webapi.model.v4.EPersonSource;
import com.unblu.webapi.model.v4.ExpandFields;
import com.unblu.webapi.model.v4.NotificationCountData;
import com.unblu.webapi.model.v4.PersonData;
import com.unblu.webapi.model.v4.PersonQuery;
import com.unblu.webapi.model.v4.PersonResult;
import com.unblu.webapi.model.v4.PersonStateData;
import com.unblu.webapi.model.v4.PersonTypedQuery;
import com.unblu.webapi.model.v4.PersonsAddAutoPauseNotificationsReasonBody;
import com.unblu.webapi.model.v4.PersonsPauseNotificationsBody;
import com.unblu.webapi.model.v4.PersonsRemoveAutoPauseNotificationsReasonBody;
import com.unblu.webapi.model.v4.PersonsSetAwayBody;
import com.unblu.webapi.model.v4.PersonsSetStatusMessageBody;
import com.unblu.webapi.model.v4.VisitorPersonStateResult;
import com.unblu.webapi.model.v4.VisitorStateQuery;

import jakarta.ws.rs.core.GenericType;

public class PersonsApi {
	private ApiClient apiClient;

	public PersonsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public PersonsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * addAutoPauseNotificationsReason Add an AutoPauseNotificationsReason for a person. By calling this service the notifications for the given user will
	 * automatically be paused for the specified amount of time.&lt;br&gt; If several auto pause reasons are added, the notifications will be automatically paused
	 * until the last auto pause reason is removed or times out.&lt;br&gt; Note: This will only take effect on the pauseNotificationsState if the person&#39;s
	 * pauseNnotificationsMode is set to AUTO.&lt;br&gt;
	 * 
	 * @param personId ID of the person we want to add the auto pause to (required)
	 * @param personsAddAutoPauseNotificationsReasonBody (required)
	 * @return AgentPersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public AgentPersonStateData personsAddAutoPauseNotificationsReason(String personId, PersonsAddAutoPauseNotificationsReasonBody personsAddAutoPauseNotificationsReasonBody) throws ApiException {
		return personsAddAutoPauseNotificationsReasonWithHttpInfo(personId, personsAddAutoPauseNotificationsReasonBody).getData();
	}

	/**
	 * addAutoPauseNotificationsReason Add an AutoPauseNotificationsReason for a person. By calling this service the notifications for the given user will
	 * automatically be paused for the specified amount of time.&lt;br&gt; If several auto pause reasons are added, the notifications will be automatically paused
	 * until the last auto pause reason is removed or times out.&lt;br&gt; Note: This will only take effect on the pauseNotificationsState if the person&#39;s
	 * pauseNnotificationsMode is set to AUTO.&lt;br&gt;
	 * 
	 * @param personId ID of the person we want to add the auto pause to (required)
	 * @param personsAddAutoPauseNotificationsReasonBody (required)
	 * @return ApiResponse&lt;AgentPersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AgentPersonStateData> personsAddAutoPauseNotificationsReasonWithHttpInfo(String personId, PersonsAddAutoPauseNotificationsReasonBody personsAddAutoPauseNotificationsReasonBody) throws ApiException {
		Object localVarPostBody = personsAddAutoPauseNotificationsReasonBody;

		// verify the required parameter 'personId' is set
		if (personId == null) {
			throw new ApiException(400, "Missing the required parameter 'personId' when calling personsAddAutoPauseNotificationsReason");
		}

		// verify the required parameter 'personsAddAutoPauseNotificationsReasonBody' is set
		if (personsAddAutoPauseNotificationsReasonBody == null) {
			throw new ApiException(400, "Missing the required parameter 'personsAddAutoPauseNotificationsReasonBody' when calling personsAddAutoPauseNotificationsReason");
		}

		// create path and map variables
		String localVarPath = "/persons/{personId}/addAutoPauseNotificationsReason"
				.replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

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

		GenericType<AgentPersonStateData> localVarReturnType = new GenericType<AgentPersonStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * addLabels &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Adds the labels provided to those already set on the person specified. A label within the same
	 * scope as an existing person label replaces the current scoped label. To avoid losing access due to the visibility rules, you should remove labels in a
	 * subsequent step.&lt;br&gt;
	 * 
	 * @param personId The ID of the person to add the labels to (required)
	 * @param requestBody List of the labels to be added to the person (required)
	 * @param expand (optional)
	 * @return PersonData
	 * @throws ApiException if fails to make API call
	 */
	public PersonData personsAddLabels(String personId, List<String> requestBody, List<ExpandFields> expand) throws ApiException {
		return personsAddLabelsWithHttpInfo(personId, requestBody, expand).getData();
	}

	/**
	 * addLabels &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Adds the labels provided to those already set on the person specified. A label within the same
	 * scope as an existing person label replaces the current scoped label. To avoid losing access due to the visibility rules, you should remove labels in a
	 * subsequent step.&lt;br&gt;
	 * 
	 * @param personId The ID of the person to add the labels to (required)
	 * @param requestBody List of the labels to be added to the person (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonData> personsAddLabelsWithHttpInfo(String personId, List<String> requestBody, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'personId' is set
		if (personId == null) {
			throw new ApiException(400, "Missing the required parameter 'personId' when calling personsAddLabels");
		}

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling personsAddLabels");
		}

		// create path and map variables
		String localVarPath = "/persons/{personId}/addLabels"
				.replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

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

		GenericType<PersonData> localVarReturnType = new GenericType<PersonData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * autoPauseNotifications Set a person&#39;s pauseNotificationsState automatically, based on their ongoing interactions in Unblu and any
	 * AutoPauseNotificationsReasons in place for the person via the Web API. &lt;p&gt; Calling this endpoint sets the person&#39;s pauseNotificationsMode to AUTO.
	 * As a result, their pauseNotificationsState will be ON whenever there is at least one active AutoPauseNotificationsReason and OFF otherwise.&lt;br&gt;
	 * 
	 * @param personId The ID of the person whose pauseNotificationsMode should be set to AUTO (required)
	 * @return AgentPersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public AgentPersonStateData personsAutoPauseNotifications(String personId) throws ApiException {
		return personsAutoPauseNotificationsWithHttpInfo(personId).getData();
	}

	/**
	 * autoPauseNotifications Set a person&#39;s pauseNotificationsState automatically, based on their ongoing interactions in Unblu and any
	 * AutoPauseNotificationsReasons in place for the person via the Web API. &lt;p&gt; Calling this endpoint sets the person&#39;s pauseNotificationsMode to AUTO.
	 * As a result, their pauseNotificationsState will be ON whenever there is at least one active AutoPauseNotificationsReason and OFF otherwise.&lt;br&gt;
	 * 
	 * @param personId The ID of the person whose pauseNotificationsMode should be set to AUTO (required)
	 * @return ApiResponse&lt;AgentPersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AgentPersonStateData> personsAutoPauseNotificationsWithHttpInfo(String personId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'personId' is set
		if (personId == null) {
			throw new ApiException(400, "Missing the required parameter 'personId' when calling personsAutoPauseNotifications");
		}

		// create path and map variables
		String localVarPath = "/persons/{personId}/autoPauseNotifications"
				.replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

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

		GenericType<AgentPersonStateData> localVarReturnType = new GenericType<AgentPersonStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * createOrUpdateBot Updates and returns an existing bot person or creates and returns a bot person if absent.&lt;br&gt;
	 * 
	 * @param personData person data (required)
	 * @param expand (optional)
	 * @return PersonData
	 * @throws ApiException if fails to make API call
	 */
	public PersonData personsCreateOrUpdateBot(PersonData personData, List<ExpandFields> expand) throws ApiException {
		return personsCreateOrUpdateBotWithHttpInfo(personData, expand).getData();
	}

	/**
	 * createOrUpdateBot Updates and returns an existing bot person or creates and returns a bot person if absent.&lt;br&gt;
	 * 
	 * @param personData person data (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonData> personsCreateOrUpdateBotWithHttpInfo(PersonData personData, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = personData;

		// verify the required parameter 'personData' is set
		if (personData == null) {
			throw new ApiException(400, "Missing the required parameter 'personData' when calling personsCreateOrUpdateBot");
		}

		// create path and map variables
		String localVarPath = "/persons/createOrUpdateBot";

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

		GenericType<PersonData> localVarReturnType = new GenericType<PersonData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * createOrUpdateVirtual Updates and returns an existing virtual person or creates and returns a virtual person if absent.&lt;br&gt;
	 * 
	 * @param personData person data (required)
	 * @param expand (optional)
	 * @return PersonData
	 * @throws ApiException if fails to make API call
	 */
	public PersonData personsCreateOrUpdateVirtual(PersonData personData, List<ExpandFields> expand) throws ApiException {
		return personsCreateOrUpdateVirtualWithHttpInfo(personData, expand).getData();
	}

	/**
	 * createOrUpdateVirtual Updates and returns an existing virtual person or creates and returns a virtual person if absent.&lt;br&gt;
	 * 
	 * @param personData person data (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonData> personsCreateOrUpdateVirtualWithHttpInfo(PersonData personData, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = personData;

		// verify the required parameter 'personData' is set
		if (personData == null) {
			throw new ApiException(400, "Missing the required parameter 'personData' when calling personsCreateOrUpdateVirtual");
		}

		// create path and map variables
		String localVarPath = "/persons/createOrUpdateVirtual";

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

		GenericType<PersonData> localVarReturnType = new GenericType<PersonData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getBySource Returns the person that represents the user identified by the source ID&lt;br&gt;
	 * 
	 * @param personSource The source of the person (optional)
	 * @param sourceId The identifier of the source for the person&#39;s information&lt;br&gt; &lt;ul&gt; &lt;li&gt;For agents and visitors whose identity is
	 * propagated and whose person source is \&quot;VIRTUAL\&quot;, the source ID is the value of the propagated \&quot;userId\&quot; field which is saved as ${link
	 * User.username} in the User entity. &lt;li&gt;For users whose identity is managed in Unblu (and whose person source is therefore \&quot;USER_DB\&quot;), the
	 * source ID is the ${link User.id} of the user represented by the person. &lt;li&gt;For anonymous visitors, the source ID is a random String. &lt;li&gt;For the
	 * concierge bot, the source ID is the String \&quot;concierge-bot-person-id\&quot;. &lt;/ul&gt; (optional)
	 * @param expand (optional)
	 * @return PersonData
	 * @throws ApiException if fails to make API call
	 */
	public PersonData personsGetBySource(EPersonSource personSource, String sourceId, List<ExpandFields> expand) throws ApiException {
		return personsGetBySourceWithHttpInfo(personSource, sourceId, expand).getData();
	}

	/**
	 * getBySource Returns the person that represents the user identified by the source ID&lt;br&gt;
	 * 
	 * @param personSource The source of the person (optional)
	 * @param sourceId The identifier of the source for the person&#39;s information&lt;br&gt; &lt;ul&gt; &lt;li&gt;For agents and visitors whose identity is
	 * propagated and whose person source is \&quot;VIRTUAL\&quot;, the source ID is the value of the propagated \&quot;userId\&quot; field which is saved as ${link
	 * User.username} in the User entity. &lt;li&gt;For users whose identity is managed in Unblu (and whose person source is therefore \&quot;USER_DB\&quot;), the
	 * source ID is the ${link User.id} of the user represented by the person. &lt;li&gt;For anonymous visitors, the source ID is a random String. &lt;li&gt;For the
	 * concierge bot, the source ID is the String \&quot;concierge-bot-person-id\&quot;. &lt;/ul&gt; (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonData> personsGetBySourceWithHttpInfo(EPersonSource personSource, String sourceId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/persons/getBySource";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "personSource", personSource));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceId", sourceId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<PersonData> localVarReturnType = new GenericType<PersonData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getNotificationCount Returns &#x60;NotificationCountData&#x60; for a personId&lt;br&gt;
	 * 
	 * @param personId (required)
	 * @return NotificationCountData
	 * @throws ApiException if fails to make API call
	 */
	public NotificationCountData personsGetNotificationCount(String personId) throws ApiException {
		return personsGetNotificationCountWithHttpInfo(personId).getData();
	}

	/**
	 * getNotificationCount Returns &#x60;NotificationCountData&#x60; for a personId&lt;br&gt;
	 * 
	 * @param personId (required)
	 * @return ApiResponse&lt;NotificationCountData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<NotificationCountData> personsGetNotificationCountWithHttpInfo(String personId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'personId' is set
		if (personId == null) {
			throw new ApiException(400, "Missing the required parameter 'personId' when calling personsGetNotificationCount");
		}

		// create path and map variables
		String localVarPath = "/persons/{personId}/getNotificationCount"
				.replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

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

		GenericType<NotificationCountData> localVarReturnType = new GenericType<NotificationCountData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * pauseNotifications Pause notifications for a person. This changes the person&#39;s pauseNotificationsMode and pauseNotificationsState to ON for the specified
	 * period. &lt;p&gt; Note: This overrides any automatic pause of notifications in place. Notification auto-pausing resumes once the period specified is
	 * over.&lt;br&gt;
	 * 
	 * @param personId The ID of the person to pause notifications for (required)
	 * @param personsPauseNotificationsBody (required)
	 * @return AgentPersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public AgentPersonStateData personsPauseNotifications(String personId, PersonsPauseNotificationsBody personsPauseNotificationsBody) throws ApiException {
		return personsPauseNotificationsWithHttpInfo(personId, personsPauseNotificationsBody).getData();
	}

	/**
	 * pauseNotifications Pause notifications for a person. This changes the person&#39;s pauseNotificationsMode and pauseNotificationsState to ON for the specified
	 * period. &lt;p&gt; Note: This overrides any automatic pause of notifications in place. Notification auto-pausing resumes once the period specified is
	 * over.&lt;br&gt;
	 * 
	 * @param personId The ID of the person to pause notifications for (required)
	 * @param personsPauseNotificationsBody (required)
	 * @return ApiResponse&lt;AgentPersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AgentPersonStateData> personsPauseNotificationsWithHttpInfo(String personId, PersonsPauseNotificationsBody personsPauseNotificationsBody) throws ApiException {
		Object localVarPostBody = personsPauseNotificationsBody;

		// verify the required parameter 'personId' is set
		if (personId == null) {
			throw new ApiException(400, "Missing the required parameter 'personId' when calling personsPauseNotifications");
		}

		// verify the required parameter 'personsPauseNotificationsBody' is set
		if (personsPauseNotificationsBody == null) {
			throw new ApiException(400, "Missing the required parameter 'personsPauseNotificationsBody' when calling personsPauseNotifications");
		}

		// create path and map variables
		String localVarPath = "/persons/{personId}/pauseNotifications"
				.replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

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

		GenericType<AgentPersonStateData> localVarReturnType = new GenericType<AgentPersonStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns a &#x60;PersonData&#x60; by ID. Persons who are not admins are only allowed to read visitors that are visible through visibility rules to
	 * them.&lt;br&gt;
	 * 
	 * @param personId (required)
	 * @param expand (optional)
	 * @return PersonData
	 * @throws ApiException if fails to make API call
	 */
	public PersonData personsRead(String personId, List<ExpandFields> expand) throws ApiException {
		return personsReadWithHttpInfo(personId, expand).getData();
	}

	/**
	 * read Returns a &#x60;PersonData&#x60; by ID. Persons who are not admins are only allowed to read visitors that are visible through visibility rules to
	 * them.&lt;br&gt;
	 * 
	 * @param personId (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonData> personsReadWithHttpInfo(String personId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'personId' is set
		if (personId == null) {
			throw new ApiException(400, "Missing the required parameter 'personId' when calling personsRead");
		}

		// create path and map variables
		String localVarPath = "/persons/{personId}/read"
				.replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

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

		GenericType<PersonData> localVarReturnType = new GenericType<PersonData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readState Returns a &#x60;PersonStateData&#x60; by personId&lt;br&gt;
	 * 
	 * @param personId (required)
	 * @return PersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public PersonStateData personsReadState(String personId) throws ApiException {
		return personsReadStateWithHttpInfo(personId).getData();
	}

	/**
	 * readState Returns a &#x60;PersonStateData&#x60; by personId&lt;br&gt;
	 * 
	 * @param personId (required)
	 * @return ApiResponse&lt;PersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonStateData> personsReadStateWithHttpInfo(String personId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'personId' is set
		if (personId == null) {
			throw new ApiException(400, "Missing the required parameter 'personId' when calling personsReadState");
		}

		// create path and map variables
		String localVarPath = "/persons/{personId}/readState"
				.replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

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

		GenericType<PersonStateData> localVarReturnType = new GenericType<PersonStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * removeAutoPauseNotificationsReason Remove the AutoPauseNotificationsReason with the given sourceId for a specific person&lt;br&gt;
	 * 
	 * @param personId The ID of the person we want to remove the auto-pause reason from (required)
	 * @param personsRemoveAutoPauseNotificationsReasonBody (required)
	 * @return AgentPersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public AgentPersonStateData personsRemoveAutoPauseNotificationsReason(String personId, PersonsRemoveAutoPauseNotificationsReasonBody personsRemoveAutoPauseNotificationsReasonBody) throws ApiException {
		return personsRemoveAutoPauseNotificationsReasonWithHttpInfo(personId, personsRemoveAutoPauseNotificationsReasonBody).getData();
	}

	/**
	 * removeAutoPauseNotificationsReason Remove the AutoPauseNotificationsReason with the given sourceId for a specific person&lt;br&gt;
	 * 
	 * @param personId The ID of the person we want to remove the auto-pause reason from (required)
	 * @param personsRemoveAutoPauseNotificationsReasonBody (required)
	 * @return ApiResponse&lt;AgentPersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AgentPersonStateData> personsRemoveAutoPauseNotificationsReasonWithHttpInfo(String personId, PersonsRemoveAutoPauseNotificationsReasonBody personsRemoveAutoPauseNotificationsReasonBody) throws ApiException {
		Object localVarPostBody = personsRemoveAutoPauseNotificationsReasonBody;

		// verify the required parameter 'personId' is set
		if (personId == null) {
			throw new ApiException(400, "Missing the required parameter 'personId' when calling personsRemoveAutoPauseNotificationsReason");
		}

		// verify the required parameter 'personsRemoveAutoPauseNotificationsReasonBody' is set
		if (personsRemoveAutoPauseNotificationsReasonBody == null) {
			throw new ApiException(400, "Missing the required parameter 'personsRemoveAutoPauseNotificationsReasonBody' when calling personsRemoveAutoPauseNotificationsReason");
		}

		// create path and map variables
		String localVarPath = "/persons/{personId}/removeAutoPauseNotificationsReason"
				.replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

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

		GenericType<AgentPersonStateData> localVarReturnType = new GenericType<AgentPersonStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * removeLabels &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Removes the labels with the given names from the person specified. This operation can result
	 * in the caller being denied access to the person in question due to the visibility rules in place. You should therefore always add new labels first, then
	 * remove the labels in a subsequent step.&lt;br&gt;
	 * 
	 * @param personId The ID of the person to remove the labels from (required)
	 * @param requestBody List of the labels to remove from the person (required)
	 * @param expand (optional)
	 * @return PersonData
	 * @throws ApiException if fails to make API call
	 */
	public PersonData personsRemoveLabels(String personId, List<String> requestBody, List<ExpandFields> expand) throws ApiException {
		return personsRemoveLabelsWithHttpInfo(personId, requestBody, expand).getData();
	}

	/**
	 * removeLabels &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Removes the labels with the given names from the person specified. This operation can result
	 * in the caller being denied access to the person in question due to the visibility rules in place. You should therefore always add new labels first, then
	 * remove the labels in a subsequent step.&lt;br&gt;
	 * 
	 * @param personId The ID of the person to remove the labels from (required)
	 * @param requestBody List of the labels to remove from the person (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonData> personsRemoveLabelsWithHttpInfo(String personId, List<String> requestBody, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'personId' is set
		if (personId == null) {
			throw new ApiException(400, "Missing the required parameter 'personId' when calling personsRemoveLabels");
		}

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling personsRemoveLabels");
		}

		// create path and map variables
		String localVarPath = "/persons/{personId}/removeLabels"
				.replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

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

		GenericType<PersonData> localVarReturnType = new GenericType<PersonData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * resumeNotifications Resumes notifications for a person. This changes the person&#39;s pauseNotificationsMode and pauseNotificationsState to OFF. &lt;p&gt;
	 * Note: This overrides any automatic pause of notifications.&lt;br&gt;
	 * 
	 * @param personId The ID of the person to resume notifications for (required)
	 * @return AgentPersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public AgentPersonStateData personsResumeNotifications(String personId) throws ApiException {
		return personsResumeNotificationsWithHttpInfo(personId).getData();
	}

	/**
	 * resumeNotifications Resumes notifications for a person. This changes the person&#39;s pauseNotificationsMode and pauseNotificationsState to OFF. &lt;p&gt;
	 * Note: This overrides any automatic pause of notifications.&lt;br&gt;
	 * 
	 * @param personId The ID of the person to resume notifications for (required)
	 * @return ApiResponse&lt;AgentPersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AgentPersonStateData> personsResumeNotificationsWithHttpInfo(String personId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'personId' is set
		if (personId == null) {
			throw new ApiException(400, "Missing the required parameter 'personId' when calling personsResumeNotifications");
		}

		// create path and map variables
		String localVarPath = "/persons/{personId}/resumeNotifications"
				.replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

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

		GenericType<AgentPersonStateData> localVarReturnType = new GenericType<AgentPersonStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for persons in the current account&lt;br&gt;
	 * 
	 * @param personQuery (required)
	 * @param expand (optional)
	 * @return PersonResult
	 * @throws ApiException if fails to make API call
	 */
	public PersonResult personsSearch(PersonQuery personQuery, List<ExpandFields> expand) throws ApiException {
		return personsSearchWithHttpInfo(personQuery, expand).getData();
	}

	/**
	 * search Search for persons in the current account&lt;br&gt;
	 * 
	 * @param personQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonResult> personsSearchWithHttpInfo(PersonQuery personQuery, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = personQuery;

		// verify the required parameter 'personQuery' is set
		if (personQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'personQuery' when calling personsSearch");
		}

		// create path and map variables
		String localVarPath = "/persons/search";

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

		GenericType<PersonResult> localVarReturnType = new GenericType<PersonResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * searchAgents Searches for agents in the current account&lt;br&gt;
	 * 
	 * @param personTypedQuery (required)
	 * @param expand (optional)
	 * @return PersonResult
	 * @throws ApiException if fails to make API call
	 */
	public PersonResult personsSearchAgents(PersonTypedQuery personTypedQuery, List<ExpandFields> expand) throws ApiException {
		return personsSearchAgentsWithHttpInfo(personTypedQuery, expand).getData();
	}

	/**
	 * searchAgents Searches for agents in the current account&lt;br&gt;
	 * 
	 * @param personTypedQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonResult> personsSearchAgentsWithHttpInfo(PersonTypedQuery personTypedQuery, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = personTypedQuery;

		// verify the required parameter 'personTypedQuery' is set
		if (personTypedQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'personTypedQuery' when calling personsSearchAgents");
		}

		// create path and map variables
		String localVarPath = "/persons/searchAgents";

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

		GenericType<PersonResult> localVarReturnType = new GenericType<PersonResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * searchAgentsByState Searches for agents in the current account by state&lt;br&gt;
	 * 
	 * @param agentStateQuery (required)
	 * @return AgentPersonStateResult
	 * @throws ApiException if fails to make API call
	 */
	public AgentPersonStateResult personsSearchAgentsByState(AgentStateQuery agentStateQuery) throws ApiException {
		return personsSearchAgentsByStateWithHttpInfo(agentStateQuery).getData();
	}

	/**
	 * searchAgentsByState Searches for agents in the current account by state&lt;br&gt;
	 * 
	 * @param agentStateQuery (required)
	 * @return ApiResponse&lt;AgentPersonStateResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AgentPersonStateResult> personsSearchAgentsByStateWithHttpInfo(AgentStateQuery agentStateQuery) throws ApiException {
		Object localVarPostBody = agentStateQuery;

		// verify the required parameter 'agentStateQuery' is set
		if (agentStateQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'agentStateQuery' when calling personsSearchAgentsByState");
		}

		// create path and map variables
		String localVarPath = "/persons/searchAgentsByState";

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

		GenericType<AgentPersonStateResult> localVarReturnType = new GenericType<AgentPersonStateResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * searchBots Searches for bots in the current account&lt;br&gt;
	 * 
	 * @param personTypedQuery (required)
	 * @param expand (optional)
	 * @return PersonResult
	 * @throws ApiException if fails to make API call
	 */
	public PersonResult personsSearchBots(PersonTypedQuery personTypedQuery, List<ExpandFields> expand) throws ApiException {
		return personsSearchBotsWithHttpInfo(personTypedQuery, expand).getData();
	}

	/**
	 * searchBots Searches for bots in the current account&lt;br&gt;
	 * 
	 * @param personTypedQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonResult> personsSearchBotsWithHttpInfo(PersonTypedQuery personTypedQuery, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = personTypedQuery;

		// verify the required parameter 'personTypedQuery' is set
		if (personTypedQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'personTypedQuery' when calling personsSearchBots");
		}

		// create path and map variables
		String localVarPath = "/persons/searchBots";

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

		GenericType<PersonResult> localVarReturnType = new GenericType<PersonResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * searchVisitors Searches for visitors in the current account&lt;br&gt;
	 * 
	 * @param personTypedQuery (required)
	 * @param expand (optional)
	 * @return PersonResult
	 * @throws ApiException if fails to make API call
	 */
	public PersonResult personsSearchVisitors(PersonTypedQuery personTypedQuery, List<ExpandFields> expand) throws ApiException {
		return personsSearchVisitorsWithHttpInfo(personTypedQuery, expand).getData();
	}

	/**
	 * searchVisitors Searches for visitors in the current account&lt;br&gt;
	 * 
	 * @param personTypedQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonResult> personsSearchVisitorsWithHttpInfo(PersonTypedQuery personTypedQuery, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = personTypedQuery;

		// verify the required parameter 'personTypedQuery' is set
		if (personTypedQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'personTypedQuery' when calling personsSearchVisitors");
		}

		// create path and map variables
		String localVarPath = "/persons/searchVisitors";

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

		GenericType<PersonResult> localVarReturnType = new GenericType<PersonResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * searchVisitorsByState Searches for visitors in the current account by state&lt;br&gt;
	 * 
	 * @param visitorStateQuery (required)
	 * @return VisitorPersonStateResult
	 * @throws ApiException if fails to make API call
	 */
	public VisitorPersonStateResult personsSearchVisitorsByState(VisitorStateQuery visitorStateQuery) throws ApiException {
		return personsSearchVisitorsByStateWithHttpInfo(visitorStateQuery).getData();
	}

	/**
	 * searchVisitorsByState Searches for visitors in the current account by state&lt;br&gt;
	 * 
	 * @param visitorStateQuery (required)
	 * @return ApiResponse&lt;VisitorPersonStateResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<VisitorPersonStateResult> personsSearchVisitorsByStateWithHttpInfo(VisitorStateQuery visitorStateQuery) throws ApiException {
		Object localVarPostBody = visitorStateQuery;

		// verify the required parameter 'visitorStateQuery' is set
		if (visitorStateQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'visitorStateQuery' when calling personsSearchVisitorsByState");
		}

		// create path and map variables
		String localVarPath = "/persons/searchVisitorsByState";

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

		GenericType<VisitorPersonStateResult> localVarReturnType = new GenericType<VisitorPersonStateResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setAway Defines if a person should be shown as AWAY or ONLINE when they&#39;re logged in. &lt;p&gt; If the endpoint is called with \&quot;true\&quot;, the
	 * person&#39;s online state will be set to AWAY, if it&#39;s called with \&quot;false\&quot; the person&#39;s online state will be set to ONLINE. &lt;p&gt; If
	 * the person in question is logged in, the change in their online state takes effect immediately. If they&#39;re not logged in, their online state will be set
	 * when they log in again.&lt;br&gt;
	 * 
	 * @param personId The ID of the person to set the online state for (required)
	 * @param personsSetAwayBody (required)
	 * @return AgentPersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public AgentPersonStateData personsSetAway(String personId, PersonsSetAwayBody personsSetAwayBody) throws ApiException {
		return personsSetAwayWithHttpInfo(personId, personsSetAwayBody).getData();
	}

	/**
	 * setAway Defines if a person should be shown as AWAY or ONLINE when they&#39;re logged in. &lt;p&gt; If the endpoint is called with \&quot;true\&quot;, the
	 * person&#39;s online state will be set to AWAY, if it&#39;s called with \&quot;false\&quot; the person&#39;s online state will be set to ONLINE. &lt;p&gt; If
	 * the person in question is logged in, the change in their online state takes effect immediately. If they&#39;re not logged in, their online state will be set
	 * when they log in again.&lt;br&gt;
	 * 
	 * @param personId The ID of the person to set the online state for (required)
	 * @param personsSetAwayBody (required)
	 * @return ApiResponse&lt;AgentPersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AgentPersonStateData> personsSetAwayWithHttpInfo(String personId, PersonsSetAwayBody personsSetAwayBody) throws ApiException {
		Object localVarPostBody = personsSetAwayBody;

		// verify the required parameter 'personId' is set
		if (personId == null) {
			throw new ApiException(400, "Missing the required parameter 'personId' when calling personsSetAway");
		}

		// verify the required parameter 'personsSetAwayBody' is set
		if (personsSetAwayBody == null) {
			throw new ApiException(400, "Missing the required parameter 'personsSetAwayBody' when calling personsSetAway");
		}

		// create path and map variables
		String localVarPath = "/persons/{personId}/setAway"
				.replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

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

		GenericType<AgentPersonStateData> localVarReturnType = new GenericType<AgentPersonStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setLabels &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Sets labels with the given names on the person specified. Labels already set on the person but
	 * missing from the list provided are deleted. Labels already set and present in the list provided remain unchanged. Labels not set on the person but present in
	 * the list provided are added to the person. The changes to the person only take affect for labels the executing user has permissions for.&lt;br&gt;
	 * 
	 * @param personId The ID of the person to set the labels on (required)
	 * @param requestBody List of the labels to set on the person (required)
	 * @param expand (optional)
	 * @return PersonData
	 * @throws ApiException if fails to make API call
	 */
	public PersonData personsSetLabels(String personId, List<String> requestBody, List<ExpandFields> expand) throws ApiException {
		return personsSetLabelsWithHttpInfo(personId, requestBody, expand).getData();
	}

	/**
	 * setLabels &lt;p&gt;This endpoint is in preview mode.&lt;/p&gt;Sets labels with the given names on the person specified. Labels already set on the person but
	 * missing from the list provided are deleted. Labels already set and present in the list provided remain unchanged. Labels not set on the person but present in
	 * the list provided are added to the person. The changes to the person only take affect for labels the executing user has permissions for.&lt;br&gt;
	 * 
	 * @param personId The ID of the person to set the labels on (required)
	 * @param requestBody List of the labels to set on the person (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonData> personsSetLabelsWithHttpInfo(String personId, List<String> requestBody, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'personId' is set
		if (personId == null) {
			throw new ApiException(400, "Missing the required parameter 'personId' when calling personsSetLabels");
		}

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling personsSetLabels");
		}

		// create path and map variables
		String localVarPath = "/persons/{personId}/setLabels"
				.replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

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

		GenericType<PersonData> localVarReturnType = new GenericType<PersonData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setStatusMessage Sets a person&#39;s status message. Setting it to null deletes the current status message (if present).&lt;br&gt;
	 * 
	 * @param personId The ID of the person we want to set a status message for (required)
	 * @param personsSetStatusMessageBody (required)
	 * @return AgentPersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public AgentPersonStateData personsSetStatusMessage(String personId, PersonsSetStatusMessageBody personsSetStatusMessageBody) throws ApiException {
		return personsSetStatusMessageWithHttpInfo(personId, personsSetStatusMessageBody).getData();
	}

	/**
	 * setStatusMessage Sets a person&#39;s status message. Setting it to null deletes the current status message (if present).&lt;br&gt;
	 * 
	 * @param personId The ID of the person we want to set a status message for (required)
	 * @param personsSetStatusMessageBody (required)
	 * @return ApiResponse&lt;AgentPersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AgentPersonStateData> personsSetStatusMessageWithHttpInfo(String personId, PersonsSetStatusMessageBody personsSetStatusMessageBody) throws ApiException {
		Object localVarPostBody = personsSetStatusMessageBody;

		// verify the required parameter 'personId' is set
		if (personId == null) {
			throw new ApiException(400, "Missing the required parameter 'personId' when calling personsSetStatusMessage");
		}

		// verify the required parameter 'personsSetStatusMessageBody' is set
		if (personsSetStatusMessageBody == null) {
			throw new ApiException(400, "Missing the required parameter 'personsSetStatusMessageBody' when calling personsSetStatusMessage");
		}

		// create path and map variables
		String localVarPath = "/persons/{personId}/setStatusMessage"
				.replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

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

		GenericType<AgentPersonStateData> localVarReturnType = new GenericType<AgentPersonStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
