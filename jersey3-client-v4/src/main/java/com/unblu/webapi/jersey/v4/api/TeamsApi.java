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
import com.unblu.webapi.model.v4.ExpandFields;
import com.unblu.webapi.model.v4.Team;
import com.unblu.webapi.model.v4.TeamList;
import com.unblu.webapi.model.v4.TeamQuery;
import com.unblu.webapi.model.v4.TeamResult;

import jakarta.ws.rs.core.GenericType;

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
	public Team teamsCreate(Team team, List<ExpandFields> expand) throws ApiException {
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
	public ApiResponse<Team> teamsCreateWithHttpInfo(Team team, List<ExpandFields> expand) throws ApiException {
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

		GenericType<Team> localVarReturnType = new GenericType<Team>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * delete Deletes the team with the given ID&lt;br&gt;
	 * 
	 * @param teamId The ID of the team which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public void teamsDelete(String teamId) throws ApiException {

		teamsDeleteWithHttpInfo(teamId);
	}

	/**
	 * delete Deletes the team with the given ID&lt;br&gt;
	 * 
	 * @param teamId The ID of the team which should be deleted (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> teamsDeleteWithHttpInfo(String teamId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'teamId' is set
		if (teamId == null) {
			throw new ApiException(400, "Missing the required parameter 'teamId' when calling teamsDelete");
		}

		// create path and map variables
		String localVarPath = "/teams/{teamId}/delete"
				.replaceAll("\\{" + "teamId" + "\\}", apiClient.escapeString(teamId.toString()));

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
	 * getChildTeams Returns a recursive list of all teams that belong to the given parent team. In other words, child teams of a child team are also listed.
	 * &lt;p&gt; To search only for direct children, use &#x60;search&#x60; with a &#x60;ParentIdTeamSearchFilter&#x60;.&lt;br&gt;
	 * 
	 * @param teamId The ID of the parent team for which the child teams should be returned recursively (required)
	 * @param expand (optional)
	 * @return TeamList
	 * @throws ApiException if fails to make API call
	 */
	public TeamList teamsGetChildTeams(String teamId, List<ExpandFields> expand) throws ApiException {
		return teamsGetChildTeamsWithHttpInfo(teamId, expand).getData();
	}

	/**
	 * getChildTeams Returns a recursive list of all teams that belong to the given parent team. In other words, child teams of a child team are also listed.
	 * &lt;p&gt; To search only for direct children, use &#x60;search&#x60; with a &#x60;ParentIdTeamSearchFilter&#x60;.&lt;br&gt;
	 * 
	 * @param teamId The ID of the parent team for which the child teams should be returned recursively (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;TeamList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<TeamList> teamsGetChildTeamsWithHttpInfo(String teamId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'teamId' is set
		if (teamId == null) {
			throw new ApiException(400, "Missing the required parameter 'teamId' when calling teamsGetChildTeams");
		}

		// create path and map variables
		String localVarPath = "/teams/{teamId}/getChildTeams"
				.replaceAll("\\{" + "teamId" + "\\}", apiClient.escapeString(teamId.toString()));

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

		GenericType<TeamList> localVarReturnType = new GenericType<TeamList>() {
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
	public Team teamsGetTeamOfCurrentUser(List<ExpandFields> expand) throws ApiException {
		return teamsGetTeamOfCurrentUserWithHttpInfo(expand).getData();
	}

	/**
	 * getTeamOfCurrentUser Returns the team of the current logged in user. There is always a team, at least the default team.&lt;br&gt;
	 * 
	 * @param expand (optional)
	 * @return ApiResponse&lt;Team&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Team> teamsGetTeamOfCurrentUserWithHttpInfo(List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/teams/getTeamOfCurrentUser";

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

		GenericType<Team> localVarReturnType = new GenericType<Team>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * read Returns the team with the given ID&lt;br&gt;
	 * 
	 * @param teamId ID of the team which should be returned (required)
	 * @param expand (optional)
	 * @return Team
	 * @throws ApiException if fails to make API call
	 */
	public Team teamsRead(String teamId, List<ExpandFields> expand) throws ApiException {
		return teamsReadWithHttpInfo(teamId, expand).getData();
	}

	/**
	 * read Returns the team with the given ID&lt;br&gt;
	 * 
	 * @param teamId ID of the team which should be returned (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;Team&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Team> teamsReadWithHttpInfo(String teamId, List<ExpandFields> expand) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'teamId' is set
		if (teamId == null) {
			throw new ApiException(400, "Missing the required parameter 'teamId' when calling teamsRead");
		}

		// create path and map variables
		String localVarPath = "/teams/{teamId}/read"
				.replaceAll("\\{" + "teamId" + "\\}", apiClient.escapeString(teamId.toString()));

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

		GenericType<Team> localVarReturnType = new GenericType<Team>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * readMultiple Gets a list of teams for the given ID&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The ID&#39;s for which the teams should be fetched (required)
	 * @param expand (optional)
	 * @return TeamList
	 * @throws ApiException if fails to make API call
	 */
	public TeamList teamsReadMultiple(List<String> requestBody, List<ExpandFields> expand) throws ApiException {
		return teamsReadMultipleWithHttpInfo(requestBody, expand).getData();
	}

	/**
	 * readMultiple Gets a list of teams for the given ID&#39;s&lt;br&gt;
	 * 
	 * @param requestBody The ID&#39;s for which the teams should be fetched (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;TeamList&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<TeamList> teamsReadMultipleWithHttpInfo(List<String> requestBody, List<ExpandFields> expand) throws ApiException {
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

		GenericType<TeamList> localVarReturnType = new GenericType<TeamList>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Searches for teams in the current account&lt;br&gt;
	 * 
	 * @param teamQuery (required)
	 * @param expand (optional)
	 * @return TeamResult
	 * @throws ApiException if fails to make API call
	 */
	public TeamResult teamsSearch(TeamQuery teamQuery, List<ExpandFields> expand) throws ApiException {
		return teamsSearchWithHttpInfo(teamQuery, expand).getData();
	}

	/**
	 * search Searches for teams in the current account&lt;br&gt;
	 * 
	 * @param teamQuery (required)
	 * @param expand (optional)
	 * @return ApiResponse&lt;TeamResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<TeamResult> teamsSearchWithHttpInfo(TeamQuery teamQuery, List<ExpandFields> expand) throws ApiException {
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

		GenericType<TeamResult> localVarReturnType = new GenericType<TeamResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * update Updates the team entity with the given instance. A supervisor can change his team and all sub teams&lt;br&gt;
	 * 
	 * @param team The entity to update (required)
	 * @param expand (optional)
	 * @return Team
	 * @throws ApiException if fails to make API call
	 */
	public Team teamsUpdate(Team team, List<ExpandFields> expand) throws ApiException {
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
	public ApiResponse<Team> teamsUpdateWithHttpInfo(Team team, List<ExpandFields> expand) throws ApiException {
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

		GenericType<Team> localVarReturnType = new GenericType<Team>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
