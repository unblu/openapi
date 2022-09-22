
package com.unblu.webapi.model.v3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Representation of a Web API resource
 */
@ApiModel(description = "Representation of a Web API resource")

@JsonPropertyOrder({
	ResourceMetadata.JSON_PROPERTY_$_TYPE,
	ResourceMetadata.JSON_PROPERTY_DOCUMENTATION,
	ResourceMetadata.JSON_PROPERTY_REQUIRED_ROLE,
	ResourceMetadata.JSON_PROPERTY_REQUIRED_CALL_ORIGIN,
	ResourceMetadata.JSON_PROPERTY_PATH,
	ResourceMetadata.JSON_PROPERTY_QUERY_PARAMETERS,
	ResourceMetadata.JSON_PROPERTY_BODY,
	ResourceMetadata.JSON_PROPERTY_RETURN_DOCUMENTATION,
	ResourceMetadata.JSON_PROPERTY_RETURN_TYPE,
	ResourceMetadata.JSON_PROPERTY_IS_GET_ALL,
	ResourceMetadata.JSON_PROPERTY_METHOD_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ResourceMetadata {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		RESOURCEMETADATA("ResourceMetadata");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			return TypeEnum.RESOURCEMETADATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.RESOURCEMETADATA;

	public static final String JSON_PROPERTY_DOCUMENTATION = "documentation";
	@JsonProperty(JSON_PROPERTY_DOCUMENTATION)
	private String documentation;

	public static final String JSON_PROPERTY_REQUIRED_ROLE = "requiredRole";
	@JsonProperty(JSON_PROPERTY_REQUIRED_ROLE)
	private List<String> requiredRole = null;

	public static final String JSON_PROPERTY_REQUIRED_CALL_ORIGIN = "requiredCallOrigin";
	@JsonProperty(JSON_PROPERTY_REQUIRED_CALL_ORIGIN)
	private String requiredCallOrigin;

	public static final String JSON_PROPERTY_PATH = "path";
	@JsonProperty(JSON_PROPERTY_PATH)
	private List<ResourcePathElement> path = null;

	public static final String JSON_PROPERTY_QUERY_PARAMETERS = "queryParameters";
	@JsonProperty(JSON_PROPERTY_QUERY_PARAMETERS)
	private List<QueryParameter> queryParameters = null;

	public static final String JSON_PROPERTY_BODY = "body";
	@JsonProperty(JSON_PROPERTY_BODY)
	private IBody body = null;

	public static final String JSON_PROPERTY_RETURN_DOCUMENTATION = "returnDocumentation";
	@JsonProperty(JSON_PROPERTY_RETURN_DOCUMENTATION)
	private String returnDocumentation;

	public static final String JSON_PROPERTY_RETURN_TYPE = "returnType";
	@JsonProperty(JSON_PROPERTY_RETURN_TYPE)
	private ServiceTypeBinding returnType = null;

	public static final String JSON_PROPERTY_IS_GET_ALL = "isGetAll";
	@JsonProperty(JSON_PROPERTY_IS_GET_ALL)
	private Boolean isGetAll;

	public static final String JSON_PROPERTY_METHOD_TYPE = "methodType";
	@JsonProperty(JSON_PROPERTY_METHOD_TYPE)
	private EMethodType methodType;

	public ResourceMetadata $type(TypeEnum $type) {
		this.$type = $type;
		return this;
	}

	/**
	 * Get $type
	 * 
	 * @return $type
	 **/
	@ApiModelProperty(value = "")
	public TypeEnum get$Type() {
		return $type;
	}

	public void set$Type(TypeEnum $type) {
		this.$type = $type;
	}

	public ResourceMetadata documentation(String documentation) {
		this.documentation = documentation;
		return this;
	}

	/**
	 * Documentation of the resource
	 * 
	 * @return documentation
	 **/
	@ApiModelProperty(value = "Documentation of the resource")
	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public ResourceMetadata requiredRole(List<String> requiredRole) {
		this.requiredRole = requiredRole;
		return this;
	}

	public ResourceMetadata addRequiredRoleItem(String requiredRoleItem) {
		if (this.requiredRole == null) {
			this.requiredRole = new ArrayList<>();
		}
		this.requiredRole.add(requiredRoleItem);
		return this;
	}

	/**
	 * Role required to call the resource. One Of EAuthorizationRole
	 * 
	 * @return requiredRole
	 **/
	@ApiModelProperty(value = "Role required to call the resource. One Of EAuthorizationRole")
	public List<String> getRequiredRole() {
		return requiredRole;
	}

	public void setRequiredRole(List<String> requiredRole) {
		this.requiredRole = requiredRole;
	}

	public ResourceMetadata requiredCallOrigin(String requiredCallOrigin) {
		this.requiredCallOrigin = requiredCallOrigin;
		return this;
	}

	/**
	 * Origin required to call the resource. One of EOrigin
	 * 
	 * @return requiredCallOrigin
	 **/
	@ApiModelProperty(value = "Origin required to call the resource. One of EOrigin")
	public String getRequiredCallOrigin() {
		return requiredCallOrigin;
	}

	public void setRequiredCallOrigin(String requiredCallOrigin) {
		this.requiredCallOrigin = requiredCallOrigin;
	}

	public ResourceMetadata path(List<ResourcePathElement> path) {
		this.path = path;
		return this;
	}

	public ResourceMetadata addPathItem(ResourcePathElement pathItem) {
		if (this.path == null) {
			this.path = new ArrayList<>();
		}
		this.path.add(pathItem);
		return this;
	}

	/**
	 * path to the resource. For the url each path element can be separated by /
	 * 
	 * @return path
	 **/
	@ApiModelProperty(value = "path to the resource. For the url each path element can be separated by /")
	public List<ResourcePathElement> getPath() {
		return path;
	}

	public void setPath(List<ResourcePathElement> path) {
		this.path = path;
	}

	public ResourceMetadata queryParameters(List<QueryParameter> queryParameters) {
		this.queryParameters = queryParameters;
		return this;
	}

	public ResourceMetadata addQueryParametersItem(QueryParameter queryParametersItem) {
		if (this.queryParameters == null) {
			this.queryParameters = new ArrayList<>();
		}
		this.queryParameters.add(queryParametersItem);
		return this;
	}

	/**
	 * Query parameters for the call
	 * 
	 * @return queryParameters
	 **/
	@ApiModelProperty(value = "Query parameters for the call")
	public List<QueryParameter> getQueryParameters() {
		return queryParameters;
	}

	public void setQueryParameters(List<QueryParameter> queryParameters) {
		this.queryParameters = queryParameters;
	}

	public ResourceMetadata body(IBody body) {
		this.body = body;
		return this;
	}

	/**
	 * Get body
	 * 
	 * @return body
	 **/
	@ApiModelProperty(value = "")
	public IBody getBody() {
		return body;
	}

	public void setBody(IBody body) {
		this.body = body;
	}

	public ResourceMetadata returnDocumentation(String returnDocumentation) {
		this.returnDocumentation = returnDocumentation;
		return this;
	}

	/**
	 * Documentation of the return value
	 * 
	 * @return returnDocumentation
	 **/
	@ApiModelProperty(value = "Documentation of the return value")
	public String getReturnDocumentation() {
		return returnDocumentation;
	}

	public void setReturnDocumentation(String returnDocumentation) {
		this.returnDocumentation = returnDocumentation;
	}

	public ResourceMetadata returnType(ServiceTypeBinding returnType) {
		this.returnType = returnType;
		return this;
	}

	/**
	 * Get returnType
	 * 
	 * @return returnType
	 **/
	@ApiModelProperty(value = "")
	public ServiceTypeBinding getReturnType() {
		return returnType;
	}

	public void setReturnType(ServiceTypeBinding returnType) {
		this.returnType = returnType;
	}

	public ResourceMetadata isGetAll(Boolean isGetAll) {
		this.isGetAll = isGetAll;
		return this;
	}

	/**
	 * Defines if the resource is a listing resource. In this case its call ends with a / (e.g. rest/v1/accounts/)
	 * 
	 * @return isGetAll
	 **/
	@ApiModelProperty(value = "Defines if the resource is a listing resource. In this case its call ends with a / (e.g. rest/v1/accounts/)")
	public Boolean isIsGetAll() {
		return isGetAll;
	}

	public void setIsGetAll(Boolean isGetAll) {
		this.isGetAll = isGetAll;
	}

	public ResourceMetadata methodType(EMethodType methodType) {
		this.methodType = methodType;
		return this;
	}

	/**
	 * Get methodType
	 * 
	 * @return methodType
	 **/
	@ApiModelProperty(value = "")
	public EMethodType getMethodType() {
		return methodType;
	}

	public void setMethodType(EMethodType methodType) {
		this.methodType = methodType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ResourceMetadata resourceMetadata = (ResourceMetadata) o;
		return Objects.equals(this.$type, resourceMetadata.$type) &&
				Objects.equals(this.documentation, resourceMetadata.documentation) &&
				Objects.equals(this.requiredRole, resourceMetadata.requiredRole) &&
				Objects.equals(this.requiredCallOrigin, resourceMetadata.requiredCallOrigin) &&
				Objects.equals(this.path, resourceMetadata.path) &&
				Objects.equals(this.queryParameters, resourceMetadata.queryParameters) &&
				Objects.equals(this.body, resourceMetadata.body) &&
				Objects.equals(this.returnDocumentation, resourceMetadata.returnDocumentation) &&
				Objects.equals(this.returnType, resourceMetadata.returnType) &&
				Objects.equals(this.isGetAll, resourceMetadata.isGetAll) &&
				Objects.equals(this.methodType, resourceMetadata.methodType);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, documentation, requiredRole, requiredCallOrigin, path, queryParameters, body, returnDocumentation, returnType, isGetAll, methodType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ResourceMetadata {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
		sb.append("    requiredRole: ").append(toIndentedString(requiredRole)).append("\n");
		sb.append("    requiredCallOrigin: ").append(toIndentedString(requiredCallOrigin)).append("\n");
		sb.append("    path: ").append(toIndentedString(path)).append("\n");
		sb.append("    queryParameters: ").append(toIndentedString(queryParameters)).append("\n");
		sb.append("    body: ").append(toIndentedString(body)).append("\n");
		sb.append("    returnDocumentation: ").append(toIndentedString(returnDocumentation)).append("\n");
		sb.append("    returnType: ").append(toIndentedString(returnType)).append("\n");
		sb.append("    isGetAll: ").append(toIndentedString(isGetAll)).append("\n");
		sb.append("    methodType: ").append(toIndentedString(methodType)).append("\n");
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
