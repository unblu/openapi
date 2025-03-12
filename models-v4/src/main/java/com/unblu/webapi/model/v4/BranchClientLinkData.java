
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
 * Data model object for a branch client link
 */
@ApiModel(description = "Data model object for a branch client link")

@JsonPropertyOrder({
	BranchClientLinkData.JSON_PROPERTY_$_TYPE,
	BranchClientLinkData.JSON_PROPERTY_ID,
	BranchClientLinkData.JSON_PROPERTY_NAME,
	BranchClientLinkData.JSON_PROPERTY_DESCRIPTION,
	BranchClientLinkData.JSON_PROPERTY_TRANSLATIONS,
	BranchClientLinkData.JSON_PROPERTY_TYPE,
	BranchClientLinkData.JSON_PROPERTY_URL,
	BranchClientLinkData.JSON_PROPERTY_LINK_TARGET,
	BranchClientLinkData.JSON_PROPERTY_AUTO_OPEN,
	BranchClientLinkData.JSON_PROPERTY_ICON_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BranchClientLinkData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BRANCHCLIENTLINKDATA("BranchClientLinkData");

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
			return TypeEnum.BRANCHCLIENTLINKDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BRANCHCLIENTLINKDATA;

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
	private Map<String, BranchClientLinkTranslation> translations = null;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EBranchLinkType type;

	public static final String JSON_PROPERTY_URL = "url";
	@JsonProperty(JSON_PROPERTY_URL)
	private String url;

	public static final String JSON_PROPERTY_LINK_TARGET = "linkTarget";
	@JsonProperty(JSON_PROPERTY_LINK_TARGET)
	private String linkTarget;

	public static final String JSON_PROPERTY_AUTO_OPEN = "autoOpen";
	@JsonProperty(JSON_PROPERTY_AUTO_OPEN)
	private Boolean autoOpen;

	public static final String JSON_PROPERTY_ICON_ID = "iconId";
	@JsonProperty(JSON_PROPERTY_ICON_ID)
	private String iconId;

	public BranchClientLinkData $type(TypeEnum $type) {
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

	public BranchClientLinkData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * ID of the branch client link
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "ID of the branch client link")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BranchClientLinkData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the branch client link. Maximum of 250 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the branch client link. Maximum of 250 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BranchClientLinkData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the branch client link. Maximum of 500 characters. Optional.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the branch client link. Maximum of 500 characters. Optional.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BranchClientLinkData translations(Map<String, BranchClientLinkTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public BranchClientLinkData putTranslationsItem(String key, BranchClientLinkTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A Map of localized versions of the name and description of the branch client link
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A Map of localized versions of the name and description of the branch client link")
	public Map<String, BranchClientLinkTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, BranchClientLinkTranslation> translations) {
		this.translations = translations;
	}

	public BranchClientLinkData type(EBranchLinkType type) {
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

	public BranchClientLinkData url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * URL to open when the branch client link is clicked on the floor plan, or when a connection to the branch client is established (if auto-open is enabled).
	 * Maximum of 250 characters. Optional.
	 * 
	 * @return url
	 **/
	@ApiModelProperty(value = "URL to open when the branch client link is clicked on the floor plan, or when a connection to the branch client is established (if auto-open is enabled). Maximum of 250 characters. Optional.")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public BranchClientLinkData linkTarget(String linkTarget) {
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

	public BranchClientLinkData autoOpen(Boolean autoOpen) {
		this.autoOpen = autoOpen;
		return this;
	}

	/**
	 * Open branch client link automatically once a connection is established
	 * 
	 * @return autoOpen
	 **/
	@ApiModelProperty(value = "Open branch client link automatically once a connection is established")
	public Boolean isAutoOpen() {
		return autoOpen;
	}

	public void setAutoOpen(Boolean autoOpen) {
		this.autoOpen = autoOpen;
	}

	public BranchClientLinkData iconId(String iconId) {
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
		BranchClientLinkData branchClientLinkData = (BranchClientLinkData) o;
		return Objects.equals(this.$type, branchClientLinkData.$type) &&
				Objects.equals(this.id, branchClientLinkData.id) &&
				Objects.equals(this.name, branchClientLinkData.name) &&
				Objects.equals(this.description, branchClientLinkData.description) &&
				Objects.equals(this.translations, branchClientLinkData.translations) &&
				Objects.equals(this.type, branchClientLinkData.type) &&
				Objects.equals(this.url, branchClientLinkData.url) &&
				Objects.equals(this.linkTarget, branchClientLinkData.linkTarget) &&
				Objects.equals(this.autoOpen, branchClientLinkData.autoOpen) &&
				Objects.equals(this.iconId, branchClientLinkData.iconId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, name, description, translations, type, url, linkTarget, autoOpen, iconId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BranchClientLinkData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    linkTarget: ").append(toIndentedString(linkTarget)).append("\n");
		sb.append("    autoOpen: ").append(toIndentedString(autoOpen)).append("\n");
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
