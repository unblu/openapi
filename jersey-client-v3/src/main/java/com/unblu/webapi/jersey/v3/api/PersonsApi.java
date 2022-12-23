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
import com.unblu.webapi.model.v3.EPersonSource;
import com.unblu.webapi.model.v3.NotificationCountData;
import com.unblu.webapi.model.v3.PersonData;
import com.unblu.webapi.model.v3.PersonQuery;
import com.unblu.webapi.model.v3.PersonResult;
import com.unblu.webapi.model.v3.PersonStateData;
import com.unblu.webapi.model.v3.PersonStateQuery;
import com.unblu.webapi.model.v3.PersonStateResult;
import com.unblu.webapi.model.v3.PersonsAddAutoPauseNotificationsReasonBody;
import com.unblu.webapi.model.v3.PersonsPauseNotificationsBody;
import com.unblu.webapi.model.v3.PersonsRemoveAutoPauseNotificationsReasonBody;
import com.unblu.webapi.model.v3.PersonsSetAwayBody;
import com.unblu.webapi.model.v3.PersonsSetStatusMessageBody;

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
	 * @return PersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public PersonStateData personsAddAutoPauseNotificationsReason(String personId, PersonsAddAutoPauseNotificationsReasonBody personsAddAutoPauseNotificationsReasonBody) throws ApiException {
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
	 * @return ApiResponse&lt;PersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonStateData> personsAddAutoPauseNotificationsReasonWithHttpInfo(String personId, PersonsAddAutoPauseNotificationsReasonBody personsAddAutoPauseNotificationsReasonBody) throws ApiException {
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

		GenericType<PersonStateData> localVarReturnType = new GenericType<PersonStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * autoPauseNotifications Set a person&#39;s pauseNotificationsState automatically, based on their ongoing interactions in Unblu and any
	 * AutoPauseNotificationsReasons in place for the person via the Web API. &lt;p&gt; Calling this endpoint sets the person&#39;s pauseNotificationsMode to AUTO.
	 * As a result, their pauseNotificationsState will be ON whenever there is at least one active AutoPauseNotificationsReason and OFF otherwise.&lt;br&gt;
	 * 
	 * @param personId The ID of the person whose pauseNotificationsMode should be set to AUTO (required)
	 * @return PersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public PersonStateData personsAutoPauseNotifications(String personId) throws ApiException {
		return personsAutoPauseNotificationsWithHttpInfo(personId).getData();
	}

	/**
	 * autoPauseNotifications Set a person&#39;s pauseNotificationsState automatically, based on their ongoing interactions in Unblu and any
	 * AutoPauseNotificationsReasons in place for the person via the Web API. &lt;p&gt; Calling this endpoint sets the person&#39;s pauseNotificationsMode to AUTO.
	 * As a result, their pauseNotificationsState will be ON whenever there is at least one active AutoPauseNotificationsReason and OFF otherwise.&lt;br&gt;
	 * 
	 * @param personId The ID of the person whose pauseNotificationsMode should be set to AUTO (required)
	 * @return ApiResponse&lt;PersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonStateData> personsAutoPauseNotificationsWithHttpInfo(String personId) throws ApiException {
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

		GenericType<PersonStateData> localVarReturnType = new GenericType<PersonStateData>() {
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
	public PersonData personsCreateOrUpdateBot(PersonData personData, String expand) throws ApiException {
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
	public ApiResponse<PersonData> personsCreateOrUpdateBotWithHttpInfo(PersonData personData, String expand) throws ApiException {
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
	public PersonData personsCreateOrUpdateVirtual(PersonData personData, String expand) throws ApiException {
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
	public ApiResponse<PersonData> personsCreateOrUpdateVirtualWithHttpInfo(PersonData personData, String expand) throws ApiException {
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
	public PersonData personsGetBySource(EPersonSource personSource, String sourceId, String expand) throws ApiException {
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
	public ApiResponse<PersonData> personsGetBySourceWithHttpInfo(EPersonSource personSource, String sourceId, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/persons/getBySource";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "personSource", personSource));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceId", sourceId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

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
	 * @return PersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public PersonStateData personsPauseNotifications(String personId, PersonsPauseNotificationsBody personsPauseNotificationsBody) throws ApiException {
		return personsPauseNotificationsWithHttpInfo(personId, personsPauseNotificationsBody).getData();
	}

	/**
	 * pauseNotifications Pause notifications for a person. This changes the person&#39;s pauseNotificationsMode and pauseNotificationsState to ON for the specified
	 * period. &lt;p&gt; Note: This overrides any automatic pause of notifications in place. Notification auto-pausing resumes once the period specified is
	 * over.&lt;br&gt;
	 * 
	 * @param personId The ID of the person to pause notifications for (required)
	 * @param personsPauseNotificationsBody (required)
	 * @return ApiResponse&lt;PersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonStateData> personsPauseNotificationsWithHttpInfo(String personId, PersonsPauseNotificationsBody personsPauseNotificationsBody) throws ApiException {
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

		GenericType<PersonStateData> localVarReturnType = new GenericType<PersonStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns a &#x60;PersonData&#x60; by id&lt;br&gt;
	 * 
	 * @param id the personId (optional)
	 * @param expand (optional)
	 * @return PersonData
	 * @throws ApiException if fails to make API call
	 */
	public PersonData personsRead(String id, String expand) throws ApiException {
		return personsReadWithHttpInfo(id, expand).getData();
	}

	/**
	 * read Returns a &#x60;PersonData&#x60; by id&lt;br&gt;
	 * 
	 * @param id the personId (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;PersonData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonData> personsReadWithHttpInfo(String id, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/persons/read";

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

		GenericType<PersonData> localVarReturnType = new GenericType<PersonData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readState Returns a &#x60;PersonStateData&#x60; by personId&lt;br&gt;
	 * 
	 * @param personId (optional)
	 * @return PersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public PersonStateData personsReadState(String personId) throws ApiException {
		return personsReadStateWithHttpInfo(personId).getData();
	}

	/**
	 * readState Returns a &#x60;PersonStateData&#x60; by personId&lt;br&gt;
	 * 
	 * @param personId (optional)
	 * @return ApiResponse&lt;PersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonStateData> personsReadStateWithHttpInfo(String personId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/persons/readState";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "personId", personId));

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
	 * @return PersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public PersonStateData personsRemoveAutoPauseNotificationsReason(String personId, PersonsRemoveAutoPauseNotificationsReasonBody personsRemoveAutoPauseNotificationsReasonBody) throws ApiException {
		return personsRemoveAutoPauseNotificationsReasonWithHttpInfo(personId, personsRemoveAutoPauseNotificationsReasonBody).getData();
	}

	/**
	 * removeAutoPauseNotificationsReason Remove the AutoPauseNotificationsReason with the given sourceId for a specific person&lt;br&gt;
	 * 
	 * @param personId The ID of the person we want to remove the auto-pause reason from (required)
	 * @param personsRemoveAutoPauseNotificationsReasonBody (required)
	 * @return ApiResponse&lt;PersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonStateData> personsRemoveAutoPauseNotificationsReasonWithHttpInfo(String personId, PersonsRemoveAutoPauseNotificationsReasonBody personsRemoveAutoPauseNotificationsReasonBody) throws ApiException {
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

		GenericType<PersonStateData> localVarReturnType = new GenericType<PersonStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * resumeNotifications Resumes notifications for a person. This changes the person&#39;s pauseNotificationsMode and pauseNotificationsState to OFF. &lt;p&gt;
	 * Note: This overrides any automatic pause of notifications.&lt;br&gt;
	 * 
	 * @param personId The ID of the person to resume notifications for (required)
	 * @return PersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public PersonStateData personsResumeNotifications(String personId) throws ApiException {
		return personsResumeNotificationsWithHttpInfo(personId).getData();
	}

	/**
	 * resumeNotifications Resumes notifications for a person. This changes the person&#39;s pauseNotificationsMode and pauseNotificationsState to OFF. &lt;p&gt;
	 * Note: This overrides any automatic pause of notifications.&lt;br&gt;
	 * 
	 * @param personId The ID of the person to resume notifications for (required)
	 * @return ApiResponse&lt;PersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonStateData> personsResumeNotificationsWithHttpInfo(String personId) throws ApiException {
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

		GenericType<PersonStateData> localVarReturnType = new GenericType<PersonStateData>() {
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
	public PersonResult personsSearch(PersonQuery personQuery, String expand) throws ApiException {
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
	public ApiResponse<PersonResult> personsSearchWithHttpInfo(PersonQuery personQuery, String expand) throws ApiException {
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

		GenericType<PersonResult> localVarReturnType = new GenericType<PersonResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * searchByState Search for persons in the current account by state&lt;br&gt;
	 * 
	 * @param personStateQuery (required)
	 * @return PersonStateResult
	 * @throws ApiException if fails to make API call
	 */
	public PersonStateResult personsSearchByState(PersonStateQuery personStateQuery) throws ApiException {
		return personsSearchByStateWithHttpInfo(personStateQuery).getData();
	}

	/**
	 * searchByState Search for persons in the current account by state&lt;br&gt;
	 * 
	 * @param personStateQuery (required)
	 * @return ApiResponse&lt;PersonStateResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonStateResult> personsSearchByStateWithHttpInfo(PersonStateQuery personStateQuery) throws ApiException {
		Object localVarPostBody = personStateQuery;

		// verify the required parameter 'personStateQuery' is set
		if (personStateQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'personStateQuery' when calling personsSearchByState");
		}

		// create path and map variables
		String localVarPath = "/persons/searchByState";

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

		GenericType<PersonStateResult> localVarReturnType = new GenericType<PersonStateResult>() {
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
	 * @return PersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public PersonStateData personsSetAway(String personId, PersonsSetAwayBody personsSetAwayBody) throws ApiException {
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
	 * @return ApiResponse&lt;PersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonStateData> personsSetAwayWithHttpInfo(String personId, PersonsSetAwayBody personsSetAwayBody) throws ApiException {
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

		GenericType<PersonStateData> localVarReturnType = new GenericType<PersonStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setStatusMessage Sets a person&#39;s status message. Setting it to null deletes the current status message (if present).&lt;br&gt;
	 * 
	 * @param personId The ID of the person we want to set a status message for (required)
	 * @param personsSetStatusMessageBody (required)
	 * @return PersonStateData
	 * @throws ApiException if fails to make API call
	 */
	public PersonStateData personsSetStatusMessage(String personId, PersonsSetStatusMessageBody personsSetStatusMessageBody) throws ApiException {
		return personsSetStatusMessageWithHttpInfo(personId, personsSetStatusMessageBody).getData();
	}

	/**
	 * setStatusMessage Sets a person&#39;s status message. Setting it to null deletes the current status message (if present).&lt;br&gt;
	 * 
	 * @param personId The ID of the person we want to set a status message for (required)
	 * @param personsSetStatusMessageBody (required)
	 * @return ApiResponse&lt;PersonStateData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<PersonStateData> personsSetStatusMessageWithHttpInfo(String personId, PersonsSetStatusMessageBody personsSetStatusMessageBody) throws ApiException {
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

		GenericType<PersonStateData> localVarReturnType = new GenericType<PersonStateData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
