
package com.unblu.webapi.model.v4;

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
 * Represents a person involved in a conversation, such as an agent, visitor, bot, or system actor.
 */
@ApiModel(description = "Represents a person involved in a conversation, such as an agent, visitor, bot, or system actor.")

@JsonPropertyOrder({
	PersonAnalyticsKpiData.JSON_PROPERTY_$_TYPE,
	PersonAnalyticsKpiData.JSON_PROPERTY_TYPE,
	PersonAnalyticsKpiData.JSON_PROPERTY_ID,
	PersonAnalyticsKpiData.JSON_PROPERTY_NAME,
	PersonAnalyticsKpiData.JSON_PROPERTY_RATING,
	PersonAnalyticsKpiData.JSON_PROPERTY_LABELS,
	PersonAnalyticsKpiData.JSON_PROPERTY_TEAM_ID,
	PersonAnalyticsKpiData.JSON_PROPERTY_USERNAME,
	PersonAnalyticsKpiData.JSON_PROPERTY_SOURCE_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PersonAnalyticsKpiData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		PERSONANALYTICSKPIDATA("PersonAnalyticsKpiData");

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
			return TypeEnum.PERSONANALYTICSKPIDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.PERSONANALYTICSKPIDATA;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EPersonType type;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_RATING = "rating";
	@JsonProperty(JSON_PROPERTY_RATING)
	private Float rating;

	public static final String JSON_PROPERTY_LABELS = "labels";
	@JsonProperty(JSON_PROPERTY_LABELS)
	private List<String> labels = null;

	public static final String JSON_PROPERTY_TEAM_ID = "teamId";
	@JsonProperty(JSON_PROPERTY_TEAM_ID)
	private String teamId;

	public static final String JSON_PROPERTY_USERNAME = "username";
	@JsonProperty(JSON_PROPERTY_USERNAME)
	private String username;

	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public PersonAnalyticsKpiData $type(TypeEnum $type) {
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

	public PersonAnalyticsKpiData type(EPersonType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EPersonType getType() {
		return type;
	}

	public void setType(EPersonType type) {
		this.type = type;
	}

	public PersonAnalyticsKpiData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The unique identifier of the person.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The unique identifier of the person.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PersonAnalyticsKpiData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The display name of the person.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "The display name of the person.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonAnalyticsKpiData rating(Float rating) {
		this.rating = rating;
		return this;
	}

	/**
	 * The rating this person gave to the conversation. Optional. @code{ null} if no rating was given.
	 * 
	 * @return rating
	 **/
	@ApiModelProperty(value = "The rating this person gave to the conversation. Optional. @code{ null} if no rating was given.")
	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public PersonAnalyticsKpiData labels(List<String> labels) {
		this.labels = labels;
		return this;
	}

	public PersonAnalyticsKpiData addLabelsItem(String labelsItem) {
		if (this.labels == null) {
			this.labels = new ArrayList<>();
		}
		this.labels.add(labelsItem);
		return this;
	}

	/**
	 * The labels associated with the person.
	 * 
	 * @return labels
	 **/
	@ApiModelProperty(value = "The labels associated with the person.")
	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public PersonAnalyticsKpiData teamId(String teamId) {
		this.teamId = teamId;
		return this;
	}

	/**
	 * The identifier of the team the person belongs to. Optional. @code{ null} if the person is not an agent.
	 * 
	 * @return teamId
	 **/
	@ApiModelProperty(value = "The identifier of the team the person belongs to. Optional. @code{ null} if the person is not an agent.")
	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public PersonAnalyticsKpiData username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * The username of the person. Optional, may be @code{ null}.
	 * 
	 * @return username
	 **/
	@ApiModelProperty(value = "The username of the person. Optional, may be @code{ null}.")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public PersonAnalyticsKpiData sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * The external source identifier of the person.
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "The external source identifier of the person.")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonAnalyticsKpiData personAnalyticsKpiData = (PersonAnalyticsKpiData) o;
		return Objects.equals(this.$type, personAnalyticsKpiData.$type) &&
				Objects.equals(this.type, personAnalyticsKpiData.type) &&
				Objects.equals(this.id, personAnalyticsKpiData.id) &&
				Objects.equals(this.name, personAnalyticsKpiData.name) &&
				Objects.equals(this.rating, personAnalyticsKpiData.rating) &&
				Objects.equals(this.labels, personAnalyticsKpiData.labels) &&
				Objects.equals(this.teamId, personAnalyticsKpiData.teamId) &&
				Objects.equals(this.username, personAnalyticsKpiData.username) &&
				Objects.equals(this.sourceId, personAnalyticsKpiData.sourceId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, id, name, rating, labels, teamId, username, sourceId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonAnalyticsKpiData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
		sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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
