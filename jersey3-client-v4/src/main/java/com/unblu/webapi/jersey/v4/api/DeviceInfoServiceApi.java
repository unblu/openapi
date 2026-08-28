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
import com.unblu.webapi.model.v4.DeviceInfoData;
import com.unblu.webapi.model.v4.DeviceInfoQuery;
import com.unblu.webapi.model.v4.DeviceInfoResult;
import com.unblu.webapi.model.v4.DeviceInfoServiceSetPushNotificationsEnabledBody;

import jakarta.ws.rs.core.GenericType;

public class DeviceInfoServiceApi {
	private ApiClient apiClient;

	public DeviceInfoServiceApi() {
		this(Configuration.getDefaultApiClient());
	}

	public DeviceInfoServiceApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * delete Deletes a device info. &lt;p&gt; Access depends on the caller&#39;s role: a registered user can only manage their own devices, a supervisor those of
	 * all users they can manage (persons in their own team and its sub-teams, including themselves), and an admin those of all users in the account.&lt;br&gt;
	 * 
	 * @param deviceInfoId The ID of the device info to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public void deviceInfoServiceDelete(String deviceInfoId) throws ApiException {

		deviceInfoServiceDeleteWithHttpInfo(deviceInfoId);
	}

	/**
	 * delete Deletes a device info. &lt;p&gt; Access depends on the caller&#39;s role: a registered user can only manage their own devices, a supervisor those of
	 * all users they can manage (persons in their own team and its sub-teams, including themselves), and an admin those of all users in the account.&lt;br&gt;
	 * 
	 * @param deviceInfoId The ID of the device info to delete (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> deviceInfoServiceDeleteWithHttpInfo(String deviceInfoId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'deviceInfoId' is set
		if (deviceInfoId == null) {
			throw new ApiException(400, "Missing the required parameter 'deviceInfoId' when calling deviceInfoServiceDelete");
		}

		// create path and map variables
		String localVarPath = "/deviceinfoservice/{deviceInfoId}/delete"
				.replaceAll("\\{" + "deviceInfoId" + "\\}", apiClient.escapeString(deviceInfoId.toString()));

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
	 * logout Invalidates all active authentication sessions for the given device. &lt;p&gt; The device info itself remains; the user is forced to re-authenticate
	 * when using this device again. &lt;p&gt; Access depends on the caller&#39;s role: a registered user can only manage their own devices, a supervisor those of
	 * all users they can manage (persons in their own team and its sub-teams, including themselves), and an admin those of all users in the account.&lt;br&gt;
	 * 
	 * @param deviceInfoId The ID of the device whose sessions should be invalidated (required)
	 * @throws ApiException if fails to make API call
	 */
	public void deviceInfoServiceLogout(String deviceInfoId) throws ApiException {

		deviceInfoServiceLogoutWithHttpInfo(deviceInfoId);
	}

	/**
	 * logout Invalidates all active authentication sessions for the given device. &lt;p&gt; The device info itself remains; the user is forced to re-authenticate
	 * when using this device again. &lt;p&gt; Access depends on the caller&#39;s role: a registered user can only manage their own devices, a supervisor those of
	 * all users they can manage (persons in their own team and its sub-teams, including themselves), and an admin those of all users in the account.&lt;br&gt;
	 * 
	 * @param deviceInfoId The ID of the device whose sessions should be invalidated (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> deviceInfoServiceLogoutWithHttpInfo(String deviceInfoId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'deviceInfoId' is set
		if (deviceInfoId == null) {
			throw new ApiException(400, "Missing the required parameter 'deviceInfoId' when calling deviceInfoServiceLogout");
		}

		// create path and map variables
		String localVarPath = "/deviceinfoservice/{deviceInfoId}/logout"
				.replaceAll("\\{" + "deviceInfoId" + "\\}", apiClient.escapeString(deviceInfoId.toString()));

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

		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}

	/**
	 * read Returns the device info for the device with the given ID&lt;br&gt;
	 * 
	 * @param deviceInfoId ID of the device info (required)
	 * @return DeviceInfoData
	 * @throws ApiException if fails to make API call
	 */
	public DeviceInfoData deviceInfoServiceRead(String deviceInfoId) throws ApiException {
		return deviceInfoServiceReadWithHttpInfo(deviceInfoId).getData();
	}

	/**
	 * read Returns the device info for the device with the given ID&lt;br&gt;
	 * 
	 * @param deviceInfoId ID of the device info (required)
	 * @return ApiResponse&lt;DeviceInfoData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DeviceInfoData> deviceInfoServiceReadWithHttpInfo(String deviceInfoId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'deviceInfoId' is set
		if (deviceInfoId == null) {
			throw new ApiException(400, "Missing the required parameter 'deviceInfoId' when calling deviceInfoServiceRead");
		}

		// create path and map variables
		String localVarPath = "/deviceinfoservice/{deviceInfoId}/read"
				.replaceAll("\\{" + "deviceInfoId" + "\\}", apiClient.escapeString(deviceInfoId.toString()));

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

		GenericType<DeviceInfoData> localVarReturnType = new GenericType<DeviceInfoData>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * restore Restores a previously deleted device info. &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; This is only possible for the period specified in the configuration
	 * property &#x60;com.unblu.gc.collectionDelay&#x60; after the device info has been deleted. &lt;p&gt; Access depends on the caller&#39;s role: a registered
	 * user can only manage their own devices, a supervisor those of all users they can manage (persons in their own team and its sub-teams, including themselves),
	 * and an admin those of all users in the account.&lt;br&gt;
	 * 
	 * @param deviceInfoId The ID of the device info to restore (required)
	 * @return DeviceInfoData
	 * @throws ApiException if fails to make API call
	 */
	public DeviceInfoData deviceInfoServiceRestore(String deviceInfoId) throws ApiException {
		return deviceInfoServiceRestoreWithHttpInfo(deviceInfoId).getData();
	}

	/**
	 * restore Restores a previously deleted device info. &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; This is only possible for the period specified in the configuration
	 * property &#x60;com.unblu.gc.collectionDelay&#x60; after the device info has been deleted. &lt;p&gt; Access depends on the caller&#39;s role: a registered
	 * user can only manage their own devices, a supervisor those of all users they can manage (persons in their own team and its sub-teams, including themselves),
	 * and an admin those of all users in the account.&lt;br&gt;
	 * 
	 * @param deviceInfoId The ID of the device info to restore (required)
	 * @return ApiResponse&lt;DeviceInfoData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DeviceInfoData> deviceInfoServiceRestoreWithHttpInfo(String deviceInfoId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'deviceInfoId' is set
		if (deviceInfoId == null) {
			throw new ApiException(400, "Missing the required parameter 'deviceInfoId' when calling deviceInfoServiceRestore");
		}

		// create path and map variables
		String localVarPath = "/deviceinfoservice/{deviceInfoId}/restore"
				.replaceAll("\\{" + "deviceInfoId" + "\\}", apiClient.escapeString(deviceInfoId.toString()));

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

		GenericType<DeviceInfoData> localVarReturnType = new GenericType<DeviceInfoData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * search Search for device infos in the current account. &lt;p&gt; The devices a caller may access depend on their role: a registered user can only see their
	 * own devices, a supervisor those of all users they can manage (persons in their own team and its sub-teams), and an admin those of all users in the account. A
	 * registered user must not set an &#x60;OwnerPersonId&#x60;filter; supervisors may only filter by persons they can manage, while admins may filter by any owner
	 * within the account.&lt;br&gt;
	 * 
	 * @param deviceInfoQuery The search query (required)
	 * @return DeviceInfoResult
	 * @throws ApiException if fails to make API call
	 */
	public DeviceInfoResult deviceInfoServiceSearch(DeviceInfoQuery deviceInfoQuery) throws ApiException {
		return deviceInfoServiceSearchWithHttpInfo(deviceInfoQuery).getData();
	}

	/**
	 * search Search for device infos in the current account. &lt;p&gt; The devices a caller may access depend on their role: a registered user can only see their
	 * own devices, a supervisor those of all users they can manage (persons in their own team and its sub-teams), and an admin those of all users in the account. A
	 * registered user must not set an &#x60;OwnerPersonId&#x60;filter; supervisors may only filter by persons they can manage, while admins may filter by any owner
	 * within the account.&lt;br&gt;
	 * 
	 * @param deviceInfoQuery The search query (required)
	 * @return ApiResponse&lt;DeviceInfoResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DeviceInfoResult> deviceInfoServiceSearchWithHttpInfo(DeviceInfoQuery deviceInfoQuery) throws ApiException {
		Object localVarPostBody = deviceInfoQuery;

		// verify the required parameter 'deviceInfoQuery' is set
		if (deviceInfoQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'deviceInfoQuery' when calling deviceInfoServiceSearch");
		}

		// create path and map variables
		String localVarPath = "/deviceinfoservice/search";

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

		GenericType<DeviceInfoResult> localVarReturnType = new GenericType<DeviceInfoResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * setPushNotificationsEnabled Enables or disables push notifications for the given device. &lt;p&gt; Access depends on the caller&#39;s role: a registered user
	 * can only manage their own devices, a supervisor those of all users they can manage (persons in their own team and its sub-teams, including themselves), and
	 * an admin those of all users in the account.&lt;br&gt;
	 * 
	 * @param deviceInfoId The ID of the device (required)
	 * @param deviceInfoServiceSetPushNotificationsEnabledBody (required)
	 * @return DeviceInfoData
	 * @throws ApiException if fails to make API call
	 */
	public DeviceInfoData deviceInfoServiceSetPushNotificationsEnabled(String deviceInfoId, DeviceInfoServiceSetPushNotificationsEnabledBody deviceInfoServiceSetPushNotificationsEnabledBody) throws ApiException {
		return deviceInfoServiceSetPushNotificationsEnabledWithHttpInfo(deviceInfoId, deviceInfoServiceSetPushNotificationsEnabledBody).getData();
	}

	/**
	 * setPushNotificationsEnabled Enables or disables push notifications for the given device. &lt;p&gt; Access depends on the caller&#39;s role: a registered user
	 * can only manage their own devices, a supervisor those of all users they can manage (persons in their own team and its sub-teams, including themselves), and
	 * an admin those of all users in the account.&lt;br&gt;
	 * 
	 * @param deviceInfoId The ID of the device (required)
	 * @param deviceInfoServiceSetPushNotificationsEnabledBody (required)
	 * @return ApiResponse&lt;DeviceInfoData&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DeviceInfoData> deviceInfoServiceSetPushNotificationsEnabledWithHttpInfo(String deviceInfoId, DeviceInfoServiceSetPushNotificationsEnabledBody deviceInfoServiceSetPushNotificationsEnabledBody) throws ApiException {
		Object localVarPostBody = deviceInfoServiceSetPushNotificationsEnabledBody;

		// verify the required parameter 'deviceInfoId' is set
		if (deviceInfoId == null) {
			throw new ApiException(400, "Missing the required parameter 'deviceInfoId' when calling deviceInfoServiceSetPushNotificationsEnabled");
		}

		// verify the required parameter 'deviceInfoServiceSetPushNotificationsEnabledBody' is set
		if (deviceInfoServiceSetPushNotificationsEnabledBody == null) {
			throw new ApiException(400, "Missing the required parameter 'deviceInfoServiceSetPushNotificationsEnabledBody' when calling deviceInfoServiceSetPushNotificationsEnabled");
		}

		// create path and map variables
		String localVarPath = "/deviceinfoservice/{deviceInfoId}/setPushNotificationsEnabled"
				.replaceAll("\\{" + "deviceInfoId" + "\\}", apiClient.escapeString(deviceInfoId.toString()));

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

		GenericType<DeviceInfoData> localVarReturnType = new GenericType<DeviceInfoData>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * unbind Revokes the active device binding of the given device (unbinds it). Only mobile devices can be bound. &lt;p&gt; Access depends on the caller&#39;s
	 * role: a registered user can only manage their own devices, a supervisor those of all users they can manage (persons in their own team and its sub-teams,
	 * including themselves), and an admin those of all users in the account.&lt;br&gt;
	 * 
	 * @param deviceInfoId The ID of the device to unbind (required)
	 * @throws ApiException if fails to make API call
	 */
	public void deviceInfoServiceUnbind(String deviceInfoId) throws ApiException {

		deviceInfoServiceUnbindWithHttpInfo(deviceInfoId);
	}

	/**
	 * unbind Revokes the active device binding of the given device (unbinds it). Only mobile devices can be bound. &lt;p&gt; Access depends on the caller&#39;s
	 * role: a registered user can only manage their own devices, a supervisor those of all users they can manage (persons in their own team and its sub-teams,
	 * including themselves), and an admin those of all users in the account.&lt;br&gt;
	 * 
	 * @param deviceInfoId The ID of the device to unbind (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> deviceInfoServiceUnbindWithHttpInfo(String deviceInfoId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'deviceInfoId' is set
		if (deviceInfoId == null) {
			throw new ApiException(400, "Missing the required parameter 'deviceInfoId' when calling deviceInfoServiceUnbind");
		}

		// create path and map variables
		String localVarPath = "/deviceinfoservice/{deviceInfoId}/unbind"
				.replaceAll("\\{" + "deviceInfoId" + "\\}", apiClient.escapeString(deviceInfoId.toString()));

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

		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
	}
}
