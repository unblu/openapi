package com.unblu.webapi.jersey.v3.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.ws.rs.core.GenericType;

import com.unblu.webapi.jersey.v3.invoker.ApiClient;
import com.unblu.webapi.jersey.v3.invoker.ApiException;
import com.unblu.webapi.jersey.v3.invoker.ApiResponse;
import com.unblu.webapi.jersey.v3.invoker.Configuration;
import com.unblu.webapi.jersey.v3.invoker.Pair;
import com.unblu.webapi.model.v3.Team;
import com.unblu.webapi.model.v3.TeamQuery;
import com.unblu.webapi.model.v3.TeamResult;

public class TeamsApi {
	private ApiClient apiClient;

	public TeamsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public TeamsApi(ApiClient apiClient) {
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
	 * @param team The entity to create (required)
	 * @param expand (optional)
	 * @return Team
	 * @throws ApiException if fails to make API call
	 */
	public Team teamsCreate(Team team, String expand) throws ApiException {
		return teamsCreateWithHttpInfo(team, expand).getData();
	}

	/**
	 * create Creates the given entity in the system. The ID of the entity is ignored for create operations, a new one is generated.&lt;br&gt;
	 * 
	 * @param team The entity to create (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;Team&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Team> teamsCreateWithHttpInfo(Team team, String expand) throws ApiException {
		Object localVarPostBody = team;

		// verify the required parameter 'team' is set
		if (team == null) {
			throw new ApiException(400, "Missing the required parameter 'team' when calling teamsCreate");
		}

		// create path and map variables
		String localVarPath = "/teams/create";

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

		GenericType<Team> localVarReturnType = new GenericType<Team>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public void teamsDelete(String id) throws ApiException {

		teamsDeleteWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> teamsDeleteWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/teams/delete";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

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
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public void teamsDeleteLegacyGet(String id) throws ApiException {

		teamsDeleteLegacyGetWithHttpInfo(id);
	}

	/**
	 * delete Deletes the entity for the given ID&lt;br&gt;
	 * 
	 * @param id The ID of the entity which should be deleted (optional)
	 * @throws ApiException if fails to make API call
	 * @deprecated
	 */
	@Deprecated
	public ApiResponse<Void> teamsDeleteLegacyGetWithHttpInfo(String id) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/teams/delete";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

		final String[] localVarAccepts = {

		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * getByParentId Returns a list of teams, which directly belong to the given parent team.&lt;br&gt;
	 * 
	 * @param parentId The ID of the parent for which the direct child teams should be returned (optional)
	 * @param expand (optional)
	 * @return List&lt;Team&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<Team> teamsGetByParentId(String parentId, String expand) throws ApiException {
		return teamsGetByParentIdWithHttpInfo(parentId, expand).getData();
	}

	/**
	 * getByParentId Returns a list of teams, which directly belong to the given parent team.&lt;br&gt;
	 * 
	 * @param parentId The ID of the parent for which the direct child teams should be returned (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;List&lt;Team&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<Team>> teamsGetByParentIdWithHttpInfo(String parentId, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/teams/getByParentId";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "parentId", parentId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<List<Team>> localVarReturnType = new GenericType<List<Team>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getChildTeamIds Returns a list of teams ids, which recursively belong to the given parent team. So child teams of a child team are also listed&lt;br&gt;
	 * 
	 * @param teamId The ID of the parent team for which the child teams should be returned recursively (optional)
	 * @return List&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<String> teamsGetChildTeamIds(String teamId) throws ApiException {
		return teamsGetChildTeamIdsWithHttpInfo(teamId).getData();
	}

	/**
	 * getChildTeamIds Returns a list of teams ids, which recursively belong to the given parent team. So child teams of a child team are also listed&lt;br&gt;
	 * 
	 * @param teamId The ID of the parent team for which the child teams should be returned recursively (optional)
	 * @return ApiResponse&lt;List&lt;String&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<String>> teamsGetChildTeamIdsWithHttpInfo(String teamId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/teams/getChildTeamIds";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "teamId", teamId));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getChildTeams Returns a list of teams, which recursively belong to the given parent team. So child teams of a child team are also listed&lt;br&gt;
	 * 
	 * @param teamId The ID of the parent team for which the child teams should be returned recursively (optional)
	 * @param expand (optional)
	 * @return List&lt;Team&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<Team> teamsGetChildTeams(String teamId, String expand) throws ApiException {
		return teamsGetChildTeamsWithHttpInfo(teamId, expand).getData();
	}

	/**
	 * getChildTeams Returns a list of teams, which recursively belong to the given parent team. So child teams of a child team are also listed&lt;br&gt;
	 * 
	 * @param teamId The ID of the parent team for which the child teams should be returned recursively (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;List&lt;Team&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<Team>> teamsGetChildTeamsWithHttpInfo(String teamId, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/teams/getChildTeams";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "teamId", teamId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<List<Team>> localVarReturnType = new GenericType<List<Team>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getQuotaUsage Returns the number of entities already existing (for the current account)&lt;br&gt;
	 * 
	 * @return Integer
	 * @throws ApiException if fails to make API call
	 */
	public Integer teamsGetQuotaUsage() throws ApiException {
		return teamsGetQuotaUsageWithHttpInfo().getData();
	}

	/**
	 * getQuotaUsage Returns the number of entities already existing (for the current account)&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;Integer&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Integer> teamsGetQuotaUsageWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/teams/getQuotaUsage";

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

		GenericType<Integer> localVarReturnType = new GenericType<Integer>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getTeamOfCurrentUser Returns the team of the current logged in user. There is always a team, at least the default team.&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return Team
	 * @throws ApiException if fails to make API call
	 */
	public Team teamsGetTeamOfCurrentUser(String expand) throws ApiException {
		return teamsGetTeamOfCurrentUserWithHttpInfo(expand).getData();
	}

	/**
	 * getTeamOfCurrentUser Returns the team of the current logged in user. There is always a team, at least the default team.&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return ApiResponse&lt;Team&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Team> teamsGetTeamOfCurrentUserWithHttpInfo(String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/teams/getTeamOfCurrentUser";

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

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<Team> localVarReturnType = new GenericType<Team>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the team for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the team which should be returned (optional)
	 * @param expand (optional)
	 * @return Team
	 * @throws ApiException if fails to make API call
	 */
	public Team teamsRead(String id, String expand) throws ApiException {
		return teamsReadWithHttpInfo(id, expand).getData();
	}

	/**
	 * read Returns the team for the given ID&lt;br&gt;
	 * 
	 * @param id ID of the team which should be returned (optional)
	 * @param expand (optional)
	 * @return ApiResponse&lt;Team&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Team> teamsReadWithHttpInfo(String id, String expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/teams/read";

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

		GenericType<Team> localVarReturnType = new GenericType<Team>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of teams for the given ID&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The ID&#39;s for which the teams should be fetched (required)
	 * @param expand (optional)
	 * @return List&lt;Team&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<Team> teamsReadMultiple(List<String> requestBody, String expand) throws ApiException {
		return teamsReadMultipleWithHttpInfo(requestBody, expand).getData();
	}

	/**
	 * readMultiple Gets a list of teams for the given ID&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The ID&#39;s for which the teams should be fetched (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;List&lt;Team&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<Team>> teamsReadMultipleWithHttpInfo(List<String> requestBody, String expand) throws ApiException {
		Object localVarPostBody = requestBody;

		// verify the required parameter 'requestBody' is set
		if (requestBody == null) {
			throw new ApiException(400, "Missing the required parameter 'requestBody' when calling teamsReadMultiple");
		}

		// create path and map variables
		String localVarPath = "/teams/readMultiple";

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

		GenericType<List<Team>> localVarReturnType = new GenericType<List<Team>>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for teams in the current account&lt;br&gt;
	 * 
	 * @param teamQuery (required)
	 * @param expand (optional)
	 * @return TeamResult
	 * @throws ApiException if fails to make API call
	 */
	public TeamResult teamsSearch(TeamQuery teamQuery, String expand) throws ApiException {
		return teamsSearchWithHttpInfo(teamQuery, expand).getData();
	}

	/**
	 * search Search for teams in the current account&lt;br&gt;
	 * 
	 * @param teamQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;TeamResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<TeamResult> teamsSearchWithHttpInfo(TeamQuery teamQuery, String expand) throws ApiException {
		Object localVarPostBody = teamQuery;

		// verify the required parameter 'teamQuery' is set
		if (teamQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'teamQuery' when calling teamsSearch");
		}

		// create path and map variables
		String localVarPath = "/teams/search";

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

		GenericType<TeamResult> localVarReturnType = new GenericType<TeamResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * teamIsChildOfOtherTeam Checks if the subTeamId is a child team of the parentTeamId.&lt;br&gt; If isParentTeamItselfAllowed is true, this functions returns
	 * true if subTeamId is equals parentTeamId.&lt;br&gt; This check is recursive. It will check all parent teams of the sub team until it either finds the given
	 * parent team or if there is no parent team anymore.&lt;br&gt;
	 * 
	 * @param parentTeamId The parent team id against which the check should be done (optional)
	 * @param subTeamId The sub team id, which is checked against the parent team id (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean teamsTeamIsChildOfOtherTeam(String parentTeamId, String subTeamId) throws ApiException {
		return teamsTeamIsChildOfOtherTeamWithHttpInfo(parentTeamId, subTeamId).getData();
	}

	/**
	 * teamIsChildOfOtherTeam Checks if the subTeamId is a child team of the parentTeamId.&lt;br&gt; If isParentTeamItselfAllowed is true, this functions returns
	 * true if subTeamId is equals parentTeamId.&lt;br&gt; This check is recursive. It will check all parent teams of the sub team until it either finds the given
	 * parent team or if there is no parent team anymore.&lt;br&gt;
	 * 
	 * @param parentTeamId The parent team id against which the check should be done (optional)
	 * @param subTeamId The sub team id, which is checked against the parent team id (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> teamsTeamIsChildOfOtherTeamWithHttpInfo(String parentTeamId, String subTeamId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/teams/teamIsChildOfOtherTeam";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "parentTeamId", parentTeamId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "subTeamId", subTeamId));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the team entity with the given instance. A supervisor can change his team and all sub teams&lt;br&gt;
	 * 
	 * @param team The entity to update (required)
	 * @param expand (optional)
	 * @return Team
	 * @throws ApiException if fails to make API call
	 */
	public Team teamsUpdate(Team team, String expand) throws ApiException {
		return teamsUpdateWithHttpInfo(team, expand).getData();
	}

	/**
	 * update Updates the team entity with the given instance. A supervisor can change his team and all sub teams&lt;br&gt;
	 * 
	 * @param team The entity to update (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;Team&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Team> teamsUpdateWithHttpInfo(Team team, String expand) throws ApiException {
		Object localVarPostBody = team;

		// verify the required parameter 'team' is set
		if (team == null) {
			throw new ApiException(400, "Missing the required parameter 'team' when calling teamsUpdate");
		}

		// create path and map variables
		String localVarPath = "/teams/update";

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

		GenericType<Team> localVarReturnType = new GenericType<Team>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
