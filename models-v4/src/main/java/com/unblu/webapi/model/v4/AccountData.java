
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
 * Representation of an Account in a conversation
 */
@ApiModel(description = "Representation of an Account in a conversation")

@JsonPropertyOrder({
	AccountData.JSON_PROPERTY_$_TYPE,
	AccountData.JSON_PROPERTY_ID,
	AccountData.JSON_PROPERTY_DISPLAY_NAME,
	AccountData.JSON_PROPERTY_DISPLAY_NAME_TRANSLATIONS,
	AccountData.JSON_PROPERTY_AVATAR,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AccountData implements ConversationRecipientData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ACCOUNTDATA("AccountData");

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
			return TypeEnum.ACCOUNTDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ACCOUNTDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
	@JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
	private String displayName;

	public static final String JSON_PROPERTY_DISPLAY_NAME_TRANSLATIONS = "displayNameTranslations";
	@JsonProperty(JSON_PROPERTY_DISPLAY_NAME_TRANSLATIONS)
	private Map<String, String> displayNameTranslations = null;

	public static final String JSON_PROPERTY_AVATAR = "avatar";
	@JsonProperty(JSON_PROPERTY_AVATAR)
	private ExpandableField<Avatar> avatar = null;

	public AccountData $type(TypeEnum $type) {
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

	public AccountData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique id of the account.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique id of the account.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AccountData displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * Display-Name of the account
	 * 
	 * @return displayName
	 **/
	@ApiModelProperty(value = "Display-Name of the account")
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public AccountData displayNameTranslations(Map<String, String> displayNameTranslations) {
		this.displayNameTranslations = displayNameTranslations;
		return this;
	}

	public AccountData putDisplayNameTranslationsItem(String key, String displayNameTranslationsItem) {
		if (this.displayNameTranslations == null) {
			this.displayNameTranslations = new HashMap<>();
		}
		this.displayNameTranslations.put(key, displayNameTranslationsItem);
		return this;
	}

	/**
	 * Localized Display-Name of the account
	 * 
	 * @return displayNameTranslations
	 **/
	@ApiModelProperty(value = "Localized Display-Name of the account")
	public Map<String, String> getDisplayNameTranslations() {
		return displayNameTranslations;
	}

	public void setDisplayNameTranslations(Map<String, String> displayNameTranslations) {
		this.displayNameTranslations = displayNameTranslations;
	}

	public AccountData avatar(ExpandableField<Avatar> avatar) {
		this.avatar = avatar;
		return this;
	}

	/**
	 * Avatar of the account: id that can be expanded.
	 * 
	 * @return avatar
	 **/
	@ApiModelProperty(value = "Avatar of the account: id that can be expanded.")
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
		AccountData accountData = (AccountData) o;
		return Objects.equals(this.$type, accountData.$type) &&
				Objects.equals(this.id, accountData.id) &&
				Objects.equals(this.displayName, accountData.displayName) &&
				Objects.equals(this.displayNameTranslations, accountData.displayNameTranslations) &&
				Objects.equals(this.avatar, accountData.avatar);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, displayName, displayNameTranslations, avatar);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
