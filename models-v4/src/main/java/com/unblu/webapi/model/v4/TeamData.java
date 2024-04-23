
package com.unblu.webapi.model.v4;

import java.util.HashMap;
import java.util.Map;
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
 * Representation of a Team in a conversation
 */
@ApiModel(description = "Representation of a Team in a conversation")

@JsonPropertyOrder({
	TeamData.JSON_PROPERTY_$_TYPE,
	TeamData.JSON_PROPERTY_ID,
	TeamData.JSON_PROPERTY_ACCOUNT_ID,
	TeamData.JSON_PROPERTY_DISPLAY_NAME,
	TeamData.JSON_PROPERTY_DISPLAY_NAME_TRANSLATIONS,
	TeamData.JSON_PROPERTY_AVATAR,
	TeamData.JSON_PROPERTY_PARENT_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class TeamData implements ConversationRecipientData, AgentTargetData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		TEAMDATA("TeamData");

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
			return TypeEnum.TEAMDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.TEAMDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
	@JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
	private String displayName;

	public static final String JSON_PROPERTY_DISPLAY_NAME_TRANSLATIONS = "displayNameTranslations";
	@JsonProperty(JSON_PROPERTY_DISPLAY_NAME_TRANSLATIONS)
	private Map<String, String> displayNameTranslations = null;

	public static final String JSON_PROPERTY_AVATAR = "avatar";
	@JsonProperty(JSON_PROPERTY_AVATAR)
	private ExpandableField<Avatar> avatar = null;

	public static final String JSON_PROPERTY_PARENT_ID = "parentId";
	@JsonProperty(JSON_PROPERTY_PARENT_ID)
	private String parentId;

	public TeamData $type(TypeEnum $type) {
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

	public TeamData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique id of the team.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique id of the team.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TeamData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Account id to which a team belongs to.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "Account id to which a team belongs to.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public TeamData displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * Display-Name of the team
	 * 
	 * @return displayName
	 **/
	@ApiModelProperty(value = "Display-Name of the team")
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public TeamData displayNameTranslations(Map<String, String> displayNameTranslations) {
		this.displayNameTranslations = displayNameTranslations;
		return this;
	}

	public TeamData putDisplayNameTranslationsItem(String key, String displayNameTranslationsItem) {
		if (this.displayNameTranslations == null) {
			this.displayNameTranslations = new HashMap<>();
		}
		this.displayNameTranslations.put(key, displayNameTranslationsItem);
		return this;
	}

	/**
	 * Localized Display-Name of the team
	 * 
	 * @return displayNameTranslations
	 **/
	@ApiModelProperty(value = "Localized Display-Name of the team")
	public Map<String, String> getDisplayNameTranslations() {
		return displayNameTranslations;
	}

	public void setDisplayNameTranslations(Map<String, String> displayNameTranslations) {
		this.displayNameTranslations = displayNameTranslations;
	}

	public TeamData avatar(ExpandableField<Avatar> avatar) {
		this.avatar = avatar;
		return this;
	}

	/**
	 * Avatar of the team: id that can be expanded.
	 * 
	 * @return avatar
	 **/
	@ApiModelProperty(value = "Avatar of the team: id that can be expanded.")
	public ExpandableField<Avatar> getAvatar() {
		return avatar;
	}

	public void setAvatar(ExpandableField<Avatar> avatar) {
		this.avatar = avatar;
	}

	public TeamData parentId(String parentId) {
		this.parentId = parentId;
		return this;
	}

	/**
	 * Id of the parent team. Only the default team has no parent team. When creating a team and the parentId is omitted, the default team is automatically inserted
	 * by the server.
	 * 
	 * @return parentId
	 **/
	@ApiModelProperty(value = "Id of the parent team. Only the default team has no parent team. When creating a team and the parentId is omitted, the default team is automatically inserted by the server.")
	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TeamData teamData = (TeamData) o;
		return Objects.equals(this.$type, teamData.$type) &&
				Objects.equals(this.id, teamData.id) &&
				Objects.equals(this.accountId, teamData.accountId) &&
				Objects.equals(this.displayName, teamData.displayName) &&
				Objects.equals(this.displayNameTranslations, teamData.displayNameTranslations) &&
				Objects.equals(this.avatar, teamData.avatar) &&
				Objects.equals(this.parentId, teamData.parentId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, displayName, displayNameTranslations, avatar, parentId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TeamData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
		sb.append("    displayNameTranslations: ").append(toIndentedString(displayNameTranslations)).append("\n");
		sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
		sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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
