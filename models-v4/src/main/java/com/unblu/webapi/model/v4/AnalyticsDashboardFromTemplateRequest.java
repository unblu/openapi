
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * AnalyticsDashboardFromTemplateRequest
 */

@JsonPropertyOrder({
	AnalyticsDashboardFromTemplateRequest.JSON_PROPERTY_$_TYPE,
	AnalyticsDashboardFromTemplateRequest.JSON_PROPERTY_TEMPLATE,
	AnalyticsDashboardFromTemplateRequest.JSON_PROPERTY_NAME,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AnalyticsDashboardFromTemplateRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ANALYTICSDASHBOARDFROMTEMPLATEREQUEST("AnalyticsDashboardFromTemplateRequest");

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
			return TypeEnum.ANALYTICSDASHBOARDFROMTEMPLATEREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ANALYTICSDASHBOARDFROMTEMPLATEREQUEST;

	public static final String JSON_PROPERTY_TEMPLATE = "template";
	@JsonProperty(JSON_PROPERTY_TEMPLATE)
	private EAnalyticsDashboardTemplateType template;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public AnalyticsDashboardFromTemplateRequest $type(TypeEnum $type) {
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

	public AnalyticsDashboardFromTemplateRequest template(EAnalyticsDashboardTemplateType template) {
		this.template = template;
		return this;
	}

	/**
	 * Get template
	 * 
	 * @return template
	 **/
	@ApiModelProperty(value = "")
	public EAnalyticsDashboardTemplateType getTemplate() {
		return template;
	}

	public void setTemplate(EAnalyticsDashboardTemplateType template) {
		this.template = template;
	}

	public AnalyticsDashboardFromTemplateRequest name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name to use for the dashboard. If not provided, the template name will be used. Optional.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name to use for the dashboard. If not provided, the template name will be used. Optional.")
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
		AnalyticsDashboardFromTemplateRequest analyticsDashboardFromTemplateRequest = (AnalyticsDashboardFromTemplateRequest) o;
		return Objects.equals(this.$type, analyticsDashboardFromTemplateRequest.$type) &&
				Objects.equals(this.template, analyticsDashboardFromTemplateRequest.template) &&
				Objects.equals(this.name, analyticsDashboardFromTemplateRequest.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, template, name);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AnalyticsDashboardFromTemplateRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
