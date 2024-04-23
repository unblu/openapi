
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
 * Representation of a Named Area in a conversation
 */
@ApiModel(description = "Representation of a Named Area in a conversation")

@JsonPropertyOrder({
	NamedAreaData.JSON_PROPERTY_$_TYPE,
	NamedAreaData.JSON_PROPERTY_ID,
	NamedAreaData.JSON_PROPERTY_ACCOUNT_ID,
	NamedAreaData.JSON_PROPERTY_DISPLAY_NAME,
	NamedAreaData.JSON_PROPERTY_DISPLAY_NAME_TRANSLATIONS,
	NamedAreaData.JSON_PROPERTY_AVATAR,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class NamedAreaData implements ConversationRecipientData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		NAMEDAREADATA("NamedAreaData");

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
			return TypeEnum.NAMEDAREADATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.NAMEDAREADATA;

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

	public NamedAreaData $type(TypeEnum $type) {
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

	public NamedAreaData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique id of the named area.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique id of the named area.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public NamedAreaData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Account id to which a named area belongs to.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "Account id to which a named area belongs to.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public NamedAreaData displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * Display-Name of the named area
	 * 
	 * @return displayName
	 **/
	@ApiModelProperty(value = "Display-Name of the named area")
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public NamedAreaData displayNameTranslations(Map<String, String> displayNameTranslations) {
		this.displayNameTranslations = displayNameTranslations;
		return this;
	}

	public NamedAreaData putDisplayNameTranslationsItem(String key, String displayNameTranslationsItem) {
		if (this.displayNameTranslations == null) {
			this.displayNameTranslations = new HashMap<>();
		}
		this.displayNameTranslations.put(key, displayNameTranslationsItem);
		return this;
	}

	/**
	 * Localized Display-Name of the named area
	 * 
	 * @return displayNameTranslations
	 **/
	@ApiModelProperty(value = "Localized Display-Name of the named area")
	public Map<String, String> getDisplayNameTranslations() {
		return displayNameTranslations;
	}

	public void setDisplayNameTranslations(Map<String, String> displayNameTranslations) {
		this.displayNameTranslations = displayNameTranslations;
	}

	public NamedAreaData avatar(ExpandableField<Avatar> avatar) {
		this.avatar = avatar;
		return this;
	}

	/**
	 * Avatar of the named area: id that can be expanded.
	 * 
	 * @return avatar
	 **/
	@ApiModelProperty(value = "Avatar of the named area: id that can be expanded.")
	public ExpandableField<Avatar> getAvatar() {
		return avatar;
	}

	public void setAvatar(ExpandableField<Avatar> avatar) {
		this.avatar = avatar;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NamedAreaData namedAreaData = (NamedAreaData) o;
		return Objects.equals(this.$type, namedAreaData.$type) &&
				Objects.equals(this.id, namedAreaData.id) &&
				Objects.equals(this.accountId, namedAreaData.accountId) &&
				Objects.equals(this.displayName, namedAreaData.displayName) &&
				Objects.equals(this.displayNameTranslations, namedAreaData.displayNameTranslations) &&
				Objects.equals(this.avatar, namedAreaData.avatar);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, displayName, displayNameTranslations, avatar);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NamedAreaData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
		sb.append("    displayNameTranslations: ").append(toIndentedString(displayNameTranslations)).append("\n");
		sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
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
