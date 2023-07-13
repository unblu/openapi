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
import com.unblu.webapi.model.v3.EAvailabilityState;

public class AvailabilityApi {
	private ApiClient apiClient;

	public AvailabilityApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AvailabilityApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * getAgentAvailability Returns the current availability state for a given user, account, named area, and locale.&lt;br&gt;&lt;br&gt;
	 * 
	 * @param userId If specified, the availability will be returned for the specified user only (optional)
	 * @param locale The locale in form of a BCP 47 language tag (including the region if available) to check the availability for. If omitted, the service will
	 * check the availability of agents who did not filter the queue by language. (optional)
	 * @param namedAreaSiteId The site ID (meta tag or domain) of the named area to check the availability for. If omitted, the service will check the availability
	 * of agents who did not filter the queue by named area. (optional)
	 * @param apiKey API key to specify the account; mandatory when called as an anonymous user (optional)
	 * @param ignoreAgentAvailabilityOverride If true, the configuration property \&quot;com.unblu.agentavailability.availabilityOverride\&quot; will be ignored
	 * when evaluating agent availability. Defaults to false. (optional)
	 * @return EAvailabilityState
	 * @throws ApiException if fails to make API call
	 */
	public EAvailabilityState availabilityGetAgentAvailability(String userId, String locale, String namedAreaSiteId, String apiKey, Boolean ignoreAgentAvailabilityOverride) throws ApiException {
		return availabilityGetAgentAvailabilityWithHttpInfo(userId, locale, namedAreaSiteId, apiKey, ignoreAgentAvailabilityOverride).getData();
	}

	/**
	 * getAgentAvailability Returns the current availability state for a given user, account, named area, and locale.&lt;br&gt;&lt;br&gt;
	 * 
	 * @param userId If specified, the availability will be returned for the specified user only (optional)
	 * @param locale The locale in form of a BCP 47 language tag (including the region if available) to check the availability for. If omitted, the service will
	 * check the availability of agents who did not filter the queue by language. (optional)
	 * @param namedAreaSiteId The site ID (meta tag or domain) of the named area to check the availability for. If omitted, the service will check the availability
	 * of agents who did not filter the queue by named area. (optional)
	 * @param apiKey API key to specify the account; mandatory when called as an anonymous user (optional)
	 * @param ignoreAgentAvailabilityOverride If true, the configuration property \&quot;com.unblu.agentavailability.availabilityOverride\&quot; will be ignored
	 * when evaluating agent availability. Defaults to false. (optional)
	 * @return ApiResponse&lt;EAvailabilityState&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<EAvailabilityState> availabilityGetAgentAvailabilityWithHttpInfo(String userId, String locale, String namedAreaSiteId, String apiKey, Boolean ignoreAgentAvailabilityOverride) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/availability/getAgentAvailability";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "namedAreaSiteId", namedAreaSiteId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "apiKey", apiKey));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "ignoreAgentAvailabilityOverride", ignoreAgentAvailabilityOverride));

		final String[] localVarAccepts = {
			"application/json"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] { "basicAuth" };

		GenericType<EAvailabilityState> localVarReturnType = new GenericType<EAvailabilityState>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * isAgentAvailable Returns true if an agent is available for a given user, account, named area, and locale.&lt;br&gt;&lt;br&gt;
	 * 
	 * @param userId If specified, the availability will be returned for this user only. (optional)
	 * @param locale The locale in form of a BCP 47 language tag (including the region if available) to check the availability for. If omitted, the service will
	 * check the availability of agents who did not filter the queue by language. (optional)
	 * @param namedAreaSiteId The site ID (meta tag or domain) of the named area to check the availability for. If omitted, the service will check the availability
	 * of agents who did not filter the queue by named area. (optional)
	 * @param apiKey API key to specify the account; mandatory when called as an anonymous user (optional)
	 * @param ignoreAgentAvailabilityOverride If true, the configuration property \&quot;com.unblu.agentavailability.availabilityOverride\&quot; will be ignored
	 * when evaluating agent availability. Defaults to false. (optional)
	 * @return Boolean
	 * @throws ApiException if fails to make API call
	 */
	public Boolean availabilityIsAgentAvailable(String userId, String locale, String namedAreaSiteId, String apiKey, Boolean ignoreAgentAvailabilityOverride) throws ApiException {
		return availabilityIsAgentAvailableWithHttpInfo(userId, locale, namedAreaSiteId, apiKey, ignoreAgentAvailabilityOverride).getData();
	}

	/**
	 * isAgentAvailable Returns true if an agent is available for a given user, account, named area, and locale.&lt;br&gt;&lt;br&gt;
	 * 
	 * @param userId If specified, the availability will be returned for this user only. (optional)
	 * @param locale The locale in form of a BCP 47 language tag (including the region if available) to check the availability for. If omitted, the service will
	 * check the availability of agents who did not filter the queue by language. (optional)
	 * @param namedAreaSiteId The site ID (meta tag or domain) of the named area to check the availability for. If omitted, the service will check the availability
	 * of agents who did not filter the queue by named area. (optional)
	 * @param apiKey API key to specify the account; mandatory when called as an anonymous user (optional)
	 * @param ignoreAgentAvailabilityOverride If true, the configuration property \&quot;com.unblu.agentavailability.availabilityOverride\&quot; will be ignored
	 * when evaluating agent availability. Defaults to false. (optional)
	 * @return ApiResponse&lt;Boolean&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Boolean> availabilityIsAgentAvailableWithHttpInfo(String userId, String locale, String namedAreaSiteId, String apiKey, Boolean ignoreAgentAvailabilityOverride) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/availability/isAgentAvailable";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "namedAreaSiteId", namedAreaSiteId));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "apiKey", apiKey));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "ignoreAgentAvailabilityOverride", ignoreAgentAvailabilityOverride));

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
}
