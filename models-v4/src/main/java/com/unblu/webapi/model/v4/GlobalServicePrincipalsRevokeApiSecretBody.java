
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;globalServicePrincipalsRevokeApiSecret&#39; operation
 */
@ApiModel(description = "Request body for the 'globalServicePrincipalsRevokeApiSecret' operation")

@JsonPropertyOrder({
	GlobalServicePrincipalsRevokeApiSecretBody.JSON_PROPERTY_NAME,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class GlobalServicePrincipalsRevokeApiSecretBody {
	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public GlobalServicePrincipalsRevokeApiSecretBody name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The name of the API secret
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "The name of the API secret")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GlobalServicePrincipalsRevokeApiSecretBody globalServicePrincipalsRevokeApiSecretBody = (GlobalServicePrincipalsRevokeApiSecretBody) o;
		return Objects.equals(this.name, globalServicePrincipalsRevokeApiSecretBody.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GlobalServicePrincipalsRevokeApiSecretBody {\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
