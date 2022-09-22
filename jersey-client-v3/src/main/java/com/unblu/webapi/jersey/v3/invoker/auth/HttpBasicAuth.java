
package com.unblu.webapi.jersey.v3.invoker.auth;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Map;

import com.unblu.webapi.jersey.v3.invoker.Pair;

public class HttpBasicAuth implements Authentication {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
		if (username == null && password == null) {
			return;
		}
		String str = (username == null ? "" : username) + ":" + (password == null ? "" : password);
		headerParams.put("Authorization", "Basic " + Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.ISO_8859_1)));
	}
}
