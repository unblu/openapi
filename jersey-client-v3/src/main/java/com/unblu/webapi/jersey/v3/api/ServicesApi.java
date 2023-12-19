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
import com.unblu.webapi.model.v3.ERegistrationLocation;
import com.unblu.webapi.model.v3.EWebApiVersion;
import com.unblu.webapi.model.v3.ServiceType;
import com.unblu.webapi.model.v3.ServiceWebhookEventType;
import com.unblu.webapi.model.v3.ServicesContainer;
import com.unblu.webapi.model.v3.WebApiService;

public class ServicesApi {
	private ApiClient apiClient;

	public ServicesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ServicesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * findWebhookEventTypeNamesBy Returns the webhook event type names matching certain condition. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @param apiVersion only the events compatible with this version will be returned. If null the newest Web-API version will be used. (optional)
	 * @param registrationLocation only the events having this registration location will be returned. If null all location will be considered (optional)
	 * @return List&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<String> servicesFindWebhookEventTypeNamesBy(EWebApiVersion apiVersion, ERegistrationLocation registrationLocation) throws ApiException {
		return servicesFindWebhookEventTypeNamesByWithHttpInfo(apiVersion, registrationLocation).getData();
	}

	/**
	 * findWebhookEventTypeNamesBy Returns the webhook event type names matching certain condition. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @param apiVersion only the events compatible with this version will be returned. If null the newest Web-API version will be used. (optional)
	 * @param registrationLocation only the events having this registration location will be returned. If null all location will be considered (optional)
	 * @return ApiResponse&lt;List&lt;String&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<String>> servicesFindWebhookEventTypeNamesByWithHttpInfo(EWebApiVersion apiVersion, ERegistrationLocation registrationLocation) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/services/findWebhookEventTypeNamesBy";

		// query params
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "apiVersion", apiVersion));
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "registrationLocation", registrationLocation));

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
	 * getAllServiceNames Returns the name of all available services. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @return List&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<String> servicesGetAllServiceNames() throws ApiException {
		return servicesGetAllServiceNamesWithHttpInfo().getData();
	}

	/**
	 * getAllServiceNames Returns the name of all available services. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;List&lt;String&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<String>> servicesGetAllServiceNamesWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/services/getAllServiceNames";

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

		GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getAllServices Returns a list of all available services. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @return List&lt;WebApiService&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<WebApiService> servicesGetAllServices() throws ApiException {
		return servicesGetAllServicesWithHttpInfo().getData();
	}

	/**
	 * getAllServices Returns a list of all available services. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;List&lt;WebApiService&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<WebApiService>> servicesGetAllServicesWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/services/getAllServices";

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

		GenericType<List<WebApiService>> localVarReturnType = new GenericType<List<WebApiService>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getAllServicesMetadata Returns all metadata information available in one batch. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @return ServicesContainer
	 * @throws ApiException if fails to make API call
	 */
	public ServicesContainer servicesGetAllServicesMetadata() throws ApiException {
		return servicesGetAllServicesMetadataWithHttpInfo().getData();
	}

	/**
	 * getAllServicesMetadata Returns all metadata information available in one batch. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;ServicesContainer&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ServicesContainer> servicesGetAllServicesMetadataWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/services/getAllServicesMetadata";

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

		GenericType<ServicesContainer> localVarReturnType = new GenericType<ServicesContainer>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getAllTypeNames Returns A list of all type names used by the services and the webhook events. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @return List&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<String> servicesGetAllTypeNames() throws ApiException {
		return servicesGetAllTypeNamesWithHttpInfo().getData();
	}

	/**
	 * getAllTypeNames Returns A list of all type names used by the services and the webhook events. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;List&lt;String&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<String>> servicesGetAllTypeNamesWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/services/getAllTypeNames";

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

		GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getAllTypes Returns All available types used by the services and the webhook events. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @return List&lt;ServiceType&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<ServiceType> servicesGetAllTypes() throws ApiException {
		return servicesGetAllTypesWithHttpInfo().getData();
	}

	/**
	 * getAllTypes Returns All available types used by the services and the webhook events. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;List&lt;ServiceType&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<ServiceType>> servicesGetAllTypesWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/services/getAllTypes";

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

		GenericType<List<ServiceType>> localVarReturnType = new GenericType<List<ServiceType>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getAllWebhookEventTypeNames Returns all webhook event type names. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @return List&lt;String&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<String> servicesGetAllWebhookEventTypeNames() throws ApiException {
		return servicesGetAllWebhookEventTypeNamesWithHttpInfo().getData();
	}

	/**
	 * getAllWebhookEventTypeNames Returns all webhook event type names. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;List&lt;String&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<String>> servicesGetAllWebhookEventTypeNamesWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/services/getAllWebhookEventTypeNames";

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

		GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getAllWebhookEventTypes Returns all webhook event types. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @return List&lt;ServiceWebhookEventType&gt;
	 * @throws ApiException if fails to make API call
	 */
	public List<ServiceWebhookEventType> servicesGetAllWebhookEventTypes() throws ApiException {
		return servicesGetAllWebhookEventTypesWithHttpInfo().getData();
	}

	/**
	 * getAllWebhookEventTypes Returns all webhook event types. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @return ApiResponse&lt;List&lt;ServiceWebhookEventType&gt;&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<List<ServiceWebhookEventType>> servicesGetAllWebhookEventTypesWithHttpInfo() throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// create path and map variables
		String localVarPath = "/services/getAllWebhookEventTypes";

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

		GenericType<List<ServiceWebhookEventType>> localVarReturnType = new GenericType<List<ServiceWebhookEventType>>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getServiceByName Returns the metadata for the requested service. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @param serviceName The name of the service of which the metadata should be returned (required)
	 * @return WebApiService
	 * @throws ApiException if fails to make API call
	 */
	public WebApiService servicesGetServiceByName(String serviceName) throws ApiException {
		return servicesGetServiceByNameWithHttpInfo(serviceName).getData();
	}

	/**
	 * getServiceByName Returns the metadata for the requested service. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @param serviceName The name of the service of which the metadata should be returned (required)
	 * @return ApiResponse&lt;WebApiService&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<WebApiService> servicesGetServiceByNameWithHttpInfo(String serviceName) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'serviceName' is set
		if (serviceName == null) {
			throw new ApiException(400, "Missing the required parameter 'serviceName' when calling servicesGetServiceByName");
		}

		// create path and map variables
		String localVarPath = "/services/getServiceByName/{serviceName}"
				.replaceAll("\\{" + "serviceName" + "\\}", apiClient.escapeString(serviceName.toString()));

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

		GenericType<WebApiService> localVarReturnType = new GenericType<WebApiService>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getTypeByName Returns a type definition by the given name. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @param name The name of the type of which the metadata should be returned (required)
	 * @return ServiceType
	 * @throws ApiException if fails to make API call
	 */
	public ServiceType servicesGetTypeByName(String name) throws ApiException {
		return servicesGetTypeByNameWithHttpInfo(name).getData();
	}

	/**
	 * getTypeByName Returns a type definition by the given name. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @param name The name of the type of which the metadata should be returned (required)
	 * @return ApiResponse&lt;ServiceType&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ServiceType> servicesGetTypeByNameWithHttpInfo(String name) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'name' is set
		if (name == null) {
			throw new ApiException(400, "Missing the required parameter 'name' when calling servicesGetTypeByName");
		}

		// create path and map variables
		String localVarPath = "/services/getTypeByName/{name}"
				.replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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

		GenericType<ServiceType> localVarReturnType = new GenericType<ServiceType>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}

	/**
	 * getWebhookEventTypeByName Returns the webhook event type definition for the requested webhook event. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @param name The name of the webhook event type of which the metadata should be returned (required)
	 * @return ServiceWebhookEventType
	 * @throws ApiException if fails to make API call
	 */
	public ServiceWebhookEventType servicesGetWebhookEventTypeByName(String name) throws ApiException {
		return servicesGetWebhookEventTypeByNameWithHttpInfo(name).getData();
	}

	/**
	 * getWebhookEventTypeByName Returns the webhook event type definition for the requested webhook event. This feature will be removed with Unblu 8&lt;br&gt;
	 * 
	 * @param name The name of the webhook event type of which the metadata should be returned (required)
	 * @return ApiResponse&lt;ServiceWebhookEventType&gt;
	 * @throws ApiException if fails to make API call
	 */
	public ApiResponse<ServiceWebhookEventType> servicesGetWebhookEventTypeByNameWithHttpInfo(String name) throws ApiException {
		Object localVarPostBody = new HashMap<>();

		// verify the required parameter 'name' is set
		if (name == null) {
			throw new ApiException(400, "Missing the required parameter 'name' when calling servicesGetWebhookEventTypeByName");
		}

		// create path and map variables
		String localVarPath = "/services/getWebhookEventTypeByName/{name}"
				.replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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

		GenericType<ServiceWebhookEventType> localVarReturnType = new GenericType<ServiceWebhookEventType>() {
		};
		return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
	}
}
