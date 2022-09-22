/*
 *    Copyright 2008-2018 unblu inc., Sarnen, Switzerland
 *    All rights reserved.
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package com.unblu.webapi.jersey.v3;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unblu.webapi.jersey.v3.invoker.ApiClient;

/**
 * Utility to simplify webapi calls
 */
public class V3ApiUtil {

	/**
	 * Create the {@link ApiClient} object without any authentication.
	 *
	 * @param baseUrl Url of the server. Example value: <code>https://testing.unblu.com/unblu</code>
	 * @return api client
	 */
	public static ApiClient getWithNoAuth(final String baseUrl) {
		final ApiClient apiClient = new ApiClient();
		apiClient.setBasePath(normalizeBasePath(baseUrl));
		return apiClient;
	}

	/**
	 * Create the {@link ApiClient} object with basic authentication.
	 *
	 * @param baseUrl Url of the server. Example value: <code>https://testing.unblu.com/unblu</code>
	 * @param username username
	 * @param password password
	 * @return api client
	 */
	public static ApiClient getWithBasicAuth(final String baseUrl, final String username, final String password) {
		final ApiClient apiClient = new ApiClient();
		apiClient.setBasePath(normalizeBasePath(baseUrl));
		apiClient.setUsername(username);
		apiClient.setPassword(password);
		return apiClient;
	}

	private static String normalizeBasePath(final String baseUrl) {
		final StringBuilder sb = new StringBuilder();
		sb.append(baseUrl);
		if (!baseUrl.endsWith("/")) {
			sb.append("/");
		}
		sb.append("rest/v3");
		return sb.toString();
	}

	/**
	 * Utility to deserialize json content
	 *
	 * @param jsonContent the content
	 * @param cls the desired return type class
	 * @param <T> the return type
	 * @return an instance corresponding to the json content
	 */
	public static <T> T deserializeJson(final String jsonContent, final Class<T> cls) {
		final ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(jsonContent, cls);
		} catch (final IOException e) {
			throw new IllegalStateException("Could not deserialize json", e);
		}
	}
}
