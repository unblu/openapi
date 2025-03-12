
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
 * Data model for a branch link
 */
@ApiModel(description = "Data model for a branch link")

@JsonPropertyOrder({
	BranchLinkData.JSON_PROPERTY_$_TYPE,
	BranchLinkData.JSON_PROPERTY_ID,
	BranchLinkData.JSON_PROPERTY_NAME,
	BranchLinkData.JSON_PROPERTY_DESCRIPTION,
	BranchLinkData.JSON_PROPERTY_TRANSLATIONS,
	BranchLinkData.JSON_PROPERTY_TYPE,
	BranchLinkData.JSON_PROPERTY_URL,
	BranchLinkData.JSON_PROPERTY_LINK_TARGET,
	BranchLinkData.JSON_PROPERTY_ICON_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BranchLinkData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BRANCHLINKDATA("BranchLinkData");

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
			return TypeEnum.BRANCHLINKDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BRANCHLINKDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
	@JsonProperty(JSON_PROPERTY_TRANSLATIONS)
	private Map<String, BranchLinkTranslation> translations = null;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EBranchLinkType type;

	public static final String JSON_PROPERTY_URL = "url";
	@JsonProperty(JSON_PROPERTY_URL)
	private String url;

	public static final String JSON_PROPERTY_LINK_TARGET = "linkTarget";
	@JsonProperty(JSON_PROPERTY_LINK_TARGET)
	private String linkTarget;

	public static final String JSON_PROPERTY_ICON_ID = "iconId";
	@JsonProperty(JSON_PROPERTY_ICON_ID)
	private String iconId;

	public BranchLinkData $type(TypeEnum $type) {
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

	public BranchLinkData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * ID of the branch link
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "ID of the branch link")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BranchLinkData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the branch link. Maximum of 250 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the branch link. Maximum of 250 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BranchLinkData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the branch link. Maximum of 500 characters. Optional.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the branch link. Maximum of 500 characters. Optional.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BranchLinkData translations(Map<String, BranchLinkTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public BranchLinkData putTranslationsItem(String key, BranchLinkTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A Map of localized versions of the name and description of the branch link
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A Map of localized versions of the name and description of the branch link")
	public Map<String, BranchLinkTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, BranchLinkTranslation> translations) {
		this.translations = translations;
	}

	public BranchLinkData type(EBranchLinkType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EBranchLinkType getType() {
		return type;
	}

	public void setType(EBranchLinkType type) {
		this.type = type;
	}

	public BranchLinkData url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * URL to open when the branch link is clicked on the floor plan. Maximum of 250 characters. Optional.
	 * 
	 * @return url
	 **/
	@ApiModelProperty(value = "URL to open when the branch link is clicked on the floor plan. Maximum of 250 characters. Optional.")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public BranchLinkData linkTarget(String linkTarget) {
		this.linkTarget = linkTarget;
		return this;
	}

	/**
	 * Target when opening the link. Maximum of 250 characters. The default value is \&quot;_blank\&quot;.
	 * 
	 * @return linkTarget
	 **/
	@ApiModelProperty(value = "Target when opening the link. Maximum of 250 characters. The default value is \"_blank\".")
	public String getLinkTarget() {
		return linkTarget;
	}

	public void setLinkTarget(String linkTarget) {
		this.linkTarget = linkTarget;
	}

	public BranchLinkData iconId(String iconId) {
		this.iconId = iconId;
		return this;
	}

	/**
	 * File ID of the icon
	 * 
	 * @return iconId
	 **/
	@ApiModelProperty(value = "File ID of the icon")
	public String getIconId() {
		return iconId;
	}

	public void setIconId(String iconId) {
		this.iconId = iconId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BranchLinkData branchLinkData = (BranchLinkData) o;
		return Objects.equals(this.$type, branchLinkData.$type) &&
				Objects.equals(this.id, branchLinkData.id) &&
				Objects.equals(this.name, branchLinkData.name) &&
				Objects.equals(this.description, branchLinkData.description) &&
				Objects.equals(this.translations, branchLinkData.translations) &&
				Objects.equals(this.type, branchLinkData.type) &&
				Objects.equals(this.url, branchLinkData.url) &&
				Objects.equals(this.linkTarget, branchLinkData.linkTarget) &&
				Objects.equals(this.iconId, branchLinkData.iconId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, name, description, translations, type, url, linkTarget, iconId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BranchLinkData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    linkTarget: ").append(toIndentedString(linkTarget)).append("\n");
		sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
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
