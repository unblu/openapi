
package com.unblu.webapi.model.v4;

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
 * Represents the recipient of a conversation or invitation, such as an account, team, or named area.
 */
@ApiModel(description = "Represents the recipient of a conversation or invitation, such as an account, team, or named area.")

@JsonPropertyOrder({
	RecipientAnalyticsKpiData.JSON_PROPERTY_$_TYPE,
	RecipientAnalyticsKpiData.JSON_PROPERTY_TYPE,
	RecipientAnalyticsKpiData.JSON_PROPERTY_ID,
	RecipientAnalyticsKpiData.JSON_PROPERTY_NAME,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RecipientAnalyticsKpiData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		RECIPIENTANALYTICSKPIDATA("RecipientAnalyticsKpiData");

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
			return TypeEnum.RECIPIENTANALYTICSKPIDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.RECIPIENTANALYTICSKPIDATA;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EConversationRecipientType type;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public RecipientAnalyticsKpiData $type(TypeEnum $type) {
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

	public RecipientAnalyticsKpiData type(EConversationRecipientType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EConversationRecipientType getType() {
		return type;
	}

	public void setType(EConversationRecipientType type) {
		this.type = type;
	}

	public RecipientAnalyticsKpiData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The unique identifier of the recipient.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The unique identifier of the recipient.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RecipientAnalyticsKpiData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The display name of the recipient.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "The display name of the recipient.")
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
		RecipientAnalyticsKpiData recipientAnalyticsKpiData = (RecipientAnalyticsKpiData) o;
		return Objects.equals(this.$type, recipientAnalyticsKpiData.$type) &&
				Objects.equals(this.type, recipientAnalyticsKpiData.type) &&
				Objects.equals(this.id, recipientAnalyticsKpiData.id) &&
				Objects.equals(this.name, recipientAnalyticsKpiData.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, id, name);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RecipientAnalyticsKpiData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
