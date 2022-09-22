
package com.unblu.webapi.model.v3;

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
 * Contains custom visitor data in any format.
 */
@ApiModel(description = "Contains custom visitor data in any format.")

@JsonPropertyOrder({
	ConversationsSetVisitorDataBody.JSON_PROPERTY_$_TYPE,
	ConversationsSetVisitorDataBody.JSON_PROPERTY_VISITOR_DATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationsSetVisitorDataBody {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONSSETVISITORDATABODY("ConversationsSetVisitorDataBody");

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
			return TypeEnum.CONVERSATIONSSETVISITORDATABODY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONSSETVISITORDATABODY;

	public static final String JSON_PROPERTY_VISITOR_DATA = "visitorData";
	@JsonProperty(JSON_PROPERTY_VISITOR_DATA)
	private String visitorData;

	public ConversationsSetVisitorDataBody $type(TypeEnum $type) {
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

	public ConversationsSetVisitorDataBody visitorData(String visitorData) {
		this.visitorData = visitorData;
		return this;
	}

	/**
	 * Custom visitor data in any format.
	 * 
	 * @return visitorData
	 **/
	@ApiModelProperty(value = "Custom visitor data in any format.")
	public String getVisitorData() {
		return visitorData;
	}

	public void setVisitorData(String visitorData) {
		this.visitorData = visitorData;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationsSetVisitorDataBody conversationsSetVisitorDataBody = (ConversationsSetVisitorDataBody) o;
		return Objects.equals(this.$type, conversationsSetVisitorDataBody.$type) &&
				Objects.equals(this.visitorData, conversationsSetVisitorDataBody.visitorData);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, visitorData);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationsSetVisitorDataBody {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    visitorData: ").append(toIndentedString(visitorData)).append("\n");
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
