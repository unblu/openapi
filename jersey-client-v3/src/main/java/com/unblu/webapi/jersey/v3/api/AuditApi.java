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
import com.unblu.webapi.model.v3.AuditChangeQuery;
import com.unblu.webapi.model.v3.AuditChangeResult;

public class AuditApi {
	private ApiClient apiClient;

	public AuditApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AuditApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * search Search for audit log entries &lt;ul&gt; &lt;li&gt;of database entities in the current account for ADMIN role user. &lt;li&gt;of global owner type
	 * entities and account entities for SUPERADMIN role user. &lt;/ul&gt;&lt;br&gt;
	 * 
	 * @param auditChangeQuery (required)
	 * @return AuditChangeResult
	 * @throws ApiException if fails to make API call
	 */
	public AuditChangeResult auditSearch(AuditChangeQuery auditChangeQuery) throws ApiException {
		return auditSearchWithHttpInfo(auditChangeQuery).getData();
	}

	/**
	 * search Search for audit log entries &lt;ul&gt; &lt;li&gt;of database entities in the current account for ADMIN role user. &lt;li&gt;of global owner type
	 * entities and account entities for SUPERADMIN role user. &lt;/ul&gt;&lt;br&gt;
	 * 
	 * @param auditChangeQuery (required)
	 * @return ApiResponse&lt;AuditChangeResult&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<AuditChangeResult> auditSearchWithHttpInfo(AuditChangeQuery auditChangeQuery) throws ApiException {
		Object localVarPostBody = auditChangeQuery;

		// verify the required parameter 'auditChangeQuery' is set
		if (auditChangeQuery == null) {
			throw new ApiException(400, "Missing the required parameter 'auditChangeQuery' when calling auditSearch");
		}

		// create path and map variables
		String localVarPath = "/audit/search";

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

		GenericType<AuditChangeResult> localVarReturnType = new GenericType<AuditChangeResult>() {
		};
		return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
