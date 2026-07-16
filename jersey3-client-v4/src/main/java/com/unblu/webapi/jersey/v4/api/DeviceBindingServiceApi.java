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
import com.unblu.webapi.model.v4.DeviceBindingChallengeRequest;
import com.unblu.webapi.model.v4.DeviceBindingChallengeResponse;
import com.unblu.webapi.model.v4.DeviceBindingIssueEnrollmentChallengeRequest;
import com.unblu.webapi.model.v4.DeviceBindingIssueEnrollmentChallengeResponse;
import com.unblu.webapi.model.v4.DeviceBindingIssueTokenRequest;
import com.unblu.webapi.model.v4.DeviceBindingIssueTokenResponse;
import com.unblu.webapi.model.v4.DeviceBindingRegistrationRequest;
import com.unblu.webapi.model.v4.DeviceBindingRegistrationResponse;
import com.unblu.webapi.model.v4.DeviceBindingVerifyRequest;
import com.unblu.webapi.model.v4.DeviceBindingVerifyResponse;

import jakarta.ws.rs.core.GenericType;

public class DeviceBindingServiceApi {
	private ApiClient apiClient;

	public DeviceBindingServiceApi() {
		this(Configuration.getDefaultApiClient());
	}

	public DeviceBindingServiceApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * issueEnrollmentChallenge Proof-of-possession step 1 (enrollment): mobile presents the token plus the locally-generated public key; server validates the token
	 * and the key, generates a fresh challenge, stores &#x60;(registrationTokenId, publicKeyEncoded, challenge, expiresAt)&#x60; on a
	 * &#x60;DeviceBindingChallenge&#x60; row, and returns the challenge. If a non-expired enrollment challenge already exists for that token, a new row is created
	 * — &#x60;register&#x60;reads the most recent one.
	 * 
	 * @param deviceBindingIssueEnrollmentChallengeRequest (required)
	 * @return DeviceBindingIssueEnrollmentChallengeResponse
	 * @throws ApiException if fails to make API call
	 */
	public DeviceBindingIssueEnrollmentChallengeResponse deviceBindingServiceIssueEnrollmentChallenge(DeviceBindingIssueEnrollmentChallengeRequest deviceBindingIssueEnrollmentChallengeRequest) throws ApiException {
		return deviceBindingServiceIssueEnrollmentChallengeWithHttpInfo(deviceBindingIssueEnrollmentChallengeRequest).getData();
	}

	/**
	 * issueEnrollmentChallenge Proof-of-possession step 1 (enrollment): mobile presents the token plus the locally-generated public key; server validates the token
	 * and the key, generates a fresh challenge, stores &#x60;(registrationTokenId, publicKeyEncoded, challenge, expiresAt)&#x60; on a
	 * &#x60;DeviceBindingChallenge&#x60; row, and returns the challenge. If a non-expired enrollment challenge already exists for that token, a new row is created
	 * — &#x60;register&#x60;reads the most recent one.
	 * 
	 * @param deviceBindingIssueEnrollmentChallengeRequest (required)
	 * @return ApiResponse&lt;DeviceBindingIssueEnrollmentChallengeResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DeviceBindingIssueEnrollmentChallengeResponse> deviceBindingServiceIssueEnrollmentChallengeWithHttpInfo(DeviceBindingIssueEnrollmentChallengeRequest deviceBindingIssueEnrollmentChallengeRequest) throws ApiException {
		Object localVarPostBody = deviceBindingIssueEnrollmentChallengeRequest;

		// verify the required parameter 'deviceBindingIssueEnrollmentChallengeRequest' is set
		if (deviceBindingIssueEnrollmentChallengeRequest == null) {
			throw new ApiException(400, "Missing the required parameter 'deviceBindingIssueEnrollmentChallengeRequest' when calling deviceBindingServiceIssueEnrollmentChallenge");
		}

		// create path and map variables
		String localVarPath = "/devicebindingservice/issueEnrollmentChallenge";

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

		GenericType<DeviceBindingIssueEnrollmentChallengeResponse> localVarReturnType = new GenericType<DeviceBindingIssueEnrollmentChallengeResponse>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * issueRegistrationToken Authenticated user issues a single-use enrollment token bound to themselves. The token is the bearer credential that someone else
	 * (typically the same user on their mobile device) can later present to &#x60;register&#x60; to enroll a device for THIS user.
	 * 
	 * @param deviceBindingIssueTokenRequest (required)
	 * @return DeviceBindingIssueTokenResponse
	 * @throws ApiException if fails to make API call
	 */
	public DeviceBindingIssueTokenResponse deviceBindingServiceIssueRegistrationToken(DeviceBindingIssueTokenRequest deviceBindingIssueTokenRequest) throws ApiException {
		return deviceBindingServiceIssueRegistrationTokenWithHttpInfo(deviceBindingIssueTokenRequest).getData();
	}

	/**
	 * issueRegistrationToken Authenticated user issues a single-use enrollment token bound to themselves. The token is the bearer credential that someone else
	 * (typically the same user on their mobile device) can later present to &#x60;register&#x60; to enroll a device for THIS user.
	 * 
	 * @param deviceBindingIssueTokenRequest (required)
	 * @return ApiResponse&lt;DeviceBindingIssueTokenResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DeviceBindingIssueTokenResponse> deviceBindingServiceIssueRegistrationTokenWithHttpInfo(DeviceBindingIssueTokenRequest deviceBindingIssueTokenRequest) throws ApiException {
		Object localVarPostBody = deviceBindingIssueTokenRequest;

		// verify the required parameter 'deviceBindingIssueTokenRequest' is set
		if (deviceBindingIssueTokenRequest == null) {
			throw new ApiException(400, "Missing the required parameter 'deviceBindingIssueTokenRequest' when calling deviceBindingServiceIssueRegistrationToken");
		}

		// create path and map variables
		String localVarPath = "/devicebindingservice/issueRegistrationToken";

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

		GenericType<DeviceBindingIssueTokenResponse> localVarReturnType = new GenericType<DeviceBindingIssueTokenResponse>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * issueVerifyChallenge Verify step 1: requests a one-time challenge for an existing binding. Caller&#39;s session must own the binding (account + person
	 * match), else BINDING_OWNERSHIP_MISMATCH. The challenge is persisted as a &#x60;DeviceBindingChallenge&#x60; row keyed by &#x60;bindingId&#x60;
	 * so&#x60;verify&#x60; can read it back.
	 * 
	 * @param deviceBindingChallengeRequest (required)
	 * @return DeviceBindingChallengeResponse
	 * @throws ApiException if fails to make API call
	 */
	public DeviceBindingChallengeResponse deviceBindingServiceIssueVerifyChallenge(DeviceBindingChallengeRequest deviceBindingChallengeRequest) throws ApiException {
		return deviceBindingServiceIssueVerifyChallengeWithHttpInfo(deviceBindingChallengeRequest).getData();
	}

	/**
	 * issueVerifyChallenge Verify step 1: requests a one-time challenge for an existing binding. Caller&#39;s session must own the binding (account + person
	 * match), else BINDING_OWNERSHIP_MISMATCH. The challenge is persisted as a &#x60;DeviceBindingChallenge&#x60; row keyed by &#x60;bindingId&#x60;
	 * so&#x60;verify&#x60; can read it back.
	 * 
	 * @param deviceBindingChallengeRequest (required)
	 * @return ApiResponse&lt;DeviceBindingChallengeResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DeviceBindingChallengeResponse> deviceBindingServiceIssueVerifyChallengeWithHttpInfo(DeviceBindingChallengeRequest deviceBindingChallengeRequest) throws ApiException {
		Object localVarPostBody = deviceBindingChallengeRequest;

		// verify the required parameter 'deviceBindingChallengeRequest' is set
		if (deviceBindingChallengeRequest == null) {
			throw new ApiException(400, "Missing the required parameter 'deviceBindingChallengeRequest' when calling deviceBindingServiceIssueVerifyChallenge");
		}

		// create path and map variables
		String localVarPath = "/devicebindingservice/issueVerifyChallenge";

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

		GenericType<DeviceBindingChallengeResponse> localVarReturnType = new GenericType<DeviceBindingChallengeResponse>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * register Proof-of-possession step 2 (enrollment): mobile submits &#x60;(token, signature)&#x60;. Server loads the most recent non-expired
	 * &#x60;DeviceBindingChallenge&#x60;for that token, verifies the signature against the stored public key and stored challenge, then creates
	 * the&#x60;com.unblu.core.shared.storage.authentication.model.devicebinding.DeviceBinding&#x60; for the token&#39;s owner and physically deletes the consumed
	 * challenge and the registration token. The public key is NOT taken from the request — it is taken from the challenge row stored at step 1, so a client cannot
	 * swap keys between the two calls.
	 * 
	 * @param deviceBindingRegistrationRequest (required)
	 * @return DeviceBindingRegistrationResponse
	 * @throws ApiException if fails to make API call
	 */
	public DeviceBindingRegistrationResponse deviceBindingServiceRegister(DeviceBindingRegistrationRequest deviceBindingRegistrationRequest) throws ApiException {
		return deviceBindingServiceRegisterWithHttpInfo(deviceBindingRegistrationRequest).getData();
	}

	/**
	 * register Proof-of-possession step 2 (enrollment): mobile submits &#x60;(token, signature)&#x60;. Server loads the most recent non-expired
	 * &#x60;DeviceBindingChallenge&#x60;for that token, verifies the signature against the stored public key and stored challenge, then creates
	 * the&#x60;com.unblu.core.shared.storage.authentication.model.devicebinding.DeviceBinding&#x60; for the token&#39;s owner and physically deletes the consumed
	 * challenge and the registration token. The public key is NOT taken from the request — it is taken from the challenge row stored at step 1, so a client cannot
	 * swap keys between the two calls.
	 * 
	 * @param deviceBindingRegistrationRequest (required)
	 * @return ApiResponse&lt;DeviceBindingRegistrationResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DeviceBindingRegistrationResponse> deviceBindingServiceRegisterWithHttpInfo(DeviceBindingRegistrationRequest deviceBindingRegistrationRequest) throws ApiException {
		Object localVarPostBody = deviceBindingRegistrationRequest;

		// verify the required parameter 'deviceBindingRegistrationRequest' is set
		if (deviceBindingRegistrationRequest == null) {
			throw new ApiException(400, "Missing the required parameter 'deviceBindingRegistrationRequest' when calling deviceBindingServiceRegister");
		}

		// create path and map variables
		String localVarPath = "/devicebindingservice/register";

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

		GenericType<DeviceBindingRegistrationResponse> localVarReturnType = new GenericType<DeviceBindingRegistrationResponse>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * revokeBinding Soft-revokes a binding owned by the current user.
	 * 
	 * @param bindingId (required)
	 * @throws ApiException if fails to make API call
	 */
	public void deviceBindingServiceRevokeBinding(String bindingId) throws ApiException {

		deviceBindingServiceRevokeBindingWithHttpInfo(bindingId);
	}

	/**
	 * revokeBinding Soft-revokes a binding owned by the current user.
	 * 
	 * @param bindingId (required)
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<Void> deviceBindingServiceRevokeBindingWithHttpInfo(String bindingId) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'bindingId' is set
		if (bindingId == null) {
			throw new ApiException(400, "Missing the required parameter 'bindingId' when calling deviceBindingServiceRevokeBinding");
		}

		// create path and map variables
		String localVarPath = "/devicebindingservice/{bindingId}/revokeBinding"
				.replaceAll("\\{" + "bindingId" + "\\}", apiClient.escapeString(bindingId.toString()));

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
	 * verify Verify step 2: verifies the signature against the binding&#39;s stored public key and the most recent non-expired server-issued challenge for that
	 * binding. The client does not send the challenge — it is read from storage so a replay across two devices cannot succeed. Same ownership requirement
	 * as&#x60;issueVerifyChallenge&#x60;.
	 * 
	 * @param deviceBindingVerifyRequest (required)
	 * @return DeviceBindingVerifyResponse
	 * @throws ApiException if fails to make API call
	 */
	public DeviceBindingVerifyResponse deviceBindingServiceVerify(DeviceBindingVerifyRequest deviceBindingVerifyRequest) throws ApiException {
		return deviceBindingServiceVerifyWithHttpInfo(deviceBindingVerifyRequest).getData();
	}

	/**
	 * verify Verify step 2: verifies the signature against the binding&#39;s stored public key and the most recent non-expired server-issued challenge for that
	 * binding. The client does not send the challenge — it is read from storage so a replay across two devices cannot succeed. Same ownership requirement
	 * as&#x60;issueVerifyChallenge&#x60;.
	 * 
	 * @param deviceBindingVerifyRequest (required)
	 * @return ApiResponse&lt;DeviceBindingVerifyResponse&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<DeviceBindingVerifyResponse> deviceBindingServiceVerifyWithHttpInfo(DeviceBindingVerifyRequest deviceBindingVerifyRequest) throws ApiException {
		Object localVarPostBody = deviceBindingVerifyRequest;

		// verify the required parameter 'deviceBindingVerifyRequest' is set
		if (deviceBindingVerifyRequest == null) {
			throw new ApiException(400, "Missing the required parameter 'deviceBindingVerifyRequest' when calling deviceBindingServiceVerify");
		}

		// create path and map variables
		String localVarPath = "/devicebindingservice/verify";

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

		GenericType<DeviceBindingVerifyResponse> localVarReturnType = new GenericType<DeviceBindingVerifyResponse>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
