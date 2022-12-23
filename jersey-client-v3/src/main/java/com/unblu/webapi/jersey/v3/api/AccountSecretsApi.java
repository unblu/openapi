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
import com.unblu.webapi.model.v3.AccountSecret;

public class AccountSecretsApi {
	private ApiClient apiClient;

	public AccountSecretsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AccountSecretsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * getCurrentAccountSecret getCurrentAccountSecret operation
	 * 
	 * @return AccountSecret
	 * @throws ApiException if fails to make API call
	 */
	public AccountSecret accountSecretsGetCurrentAccountSecret() throws ApiException {
		return accountSecretsGetCurrentAccountSecretWithHttpInfo().getData();
	}

	/**
	 * getCurrentAccountSecret getCurrentAccountSecret operation
	 * 
	 * @return ApiResponse&lt;AccountSecret&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AccountSecret> accountSecretsGetCurrentAccountSecretWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/accountsecrets/getCurrentAccountSecret";

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

		GenericType<AccountSecret> localVarReturnType = new GenericType<AccountSecret>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
