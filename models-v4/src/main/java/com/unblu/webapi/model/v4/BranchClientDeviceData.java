
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
 * Data model for a branch device
 */
@ApiModel(description = "Data model for a branch device")

@JsonPropertyOrder({
	BranchClientDeviceData.JSON_PROPERTY_$_TYPE,
	BranchClientDeviceData.JSON_PROPERTY_ID,
	BranchClientDeviceData.JSON_PROPERTY_NAME,
	BranchClientDeviceData.JSON_PROPERTY_DESCRIPTION,
	BranchClientDeviceData.JSON_PROPERTY_TRANSLATIONS,
	BranchClientDeviceData.JSON_PROPERTY_TYPE,
	BranchClientDeviceData.JSON_PROPERTY_X,
	BranchClientDeviceData.JSON_PROPERTY_Y,
	BranchClientDeviceData.JSON_PROPERTY_SIZE,
	BranchClientDeviceData.JSON_PROPERTY_ROTATION,
	BranchClientDeviceData.JSON_PROPERTY_ICON_ID,
	BranchClientDeviceData.JSON_PROPERTY_URL,
	BranchClientDeviceData.JSON_PROPERTY_LINK_TARGET,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BranchClientDeviceData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BRANCHCLIENTDEVICEDATA("BranchClientDeviceData");

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
			return TypeEnum.BRANCHCLIENTDEVICEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BRANCHCLIENTDEVICEDATA;

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
	private Map<String, BranchClientDeviceTranslation> translations = null;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EBranchDeviceType type;

	public static final String JSON_PROPERTY_X = "x";
	@JsonProperty(JSON_PROPERTY_X)
	private Integer x;

	public static final String JSON_PROPERTY_Y = "y";
	@JsonProperty(JSON_PROPERTY_Y)
	private Integer y;

	public static final String JSON_PROPERTY_SIZE = "size";
	@JsonProperty(JSON_PROPERTY_SIZE)
	private Integer size;

	public static final String JSON_PROPERTY_ROTATION = "rotation";
	@JsonProperty(JSON_PROPERTY_ROTATION)
	private Integer rotation;

	public static final String JSON_PROPERTY_ICON_ID = "iconId";
	@JsonProperty(JSON_PROPERTY_ICON_ID)
	private String iconId;

	public static final String JSON_PROPERTY_URL = "url";
	@JsonProperty(JSON_PROPERTY_URL)
	private String url;

	public static final String JSON_PROPERTY_LINK_TARGET = "linkTarget";
	@JsonProperty(JSON_PROPERTY_LINK_TARGET)
	private String linkTarget;

	public BranchClientDeviceData $type(TypeEnum $type) {
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

	public BranchClientDeviceData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * ID of the branch device
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "ID of the branch device")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BranchClientDeviceData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the branch device. Maximum of 250 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the branch device. Maximum of 250 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BranchClientDeviceData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the branch device. Maximum of 500 characters. Optional.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the branch device. Maximum of 500 characters. Optional.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BranchClientDeviceData translations(Map<String, BranchClientDeviceTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public BranchClientDeviceData putTranslationsItem(String key, BranchClientDeviceTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A Map of localized versions of the name and description of the branch device
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A Map of localized versions of the name and description of the branch device")
	public Map<String, BranchClientDeviceTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, BranchClientDeviceTranslation> translations) {
		this.translations = translations;
	}

	public BranchClientDeviceData type(EBranchDeviceType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EBranchDeviceType getType() {
		return type;
	}

	public void setType(EBranchDeviceType type) {
		this.type = type;
	}

	public BranchClientDeviceData x(Integer x) {
		this.x = x;
		return this;
	}

	/**
	 * X coordinate of the device&#39;s icon on the floor plan. 0 marks the left edge of the plan.
	 * 
	 * @return x
	 **/
	@ApiModelProperty(value = "X coordinate of the device's icon on the floor plan. 0 marks the left edge of the plan.")
	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public BranchClientDeviceData y(Integer y) {
		this.y = y;
		return this;
	}

	/**
	 * Y coordinate of the device&#39;s icon on the floor plan. 0 marks the top edge of the plan.
	 * 
	 * @return y
	 **/
	@ApiModelProperty(value = "Y coordinate of the device's icon on the floor plan. 0 marks the top edge of the plan.")
	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public BranchClientDeviceData size(Integer size) {
		this.size = size;
		return this;
	}

	/**
	 * Size of the device&#39;s icon on the floor plan
	 * 
	 * @return size
	 **/
	@ApiModelProperty(value = "Size of the device's icon on the floor plan")
	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public BranchClientDeviceData rotation(Integer rotation) {
		this.rotation = rotation;
		return this;
	}

	/**
	 * Rotation, in degrees, of the device&#39;s icon on the floor plan
	 * 
	 * @return rotation
	 **/
	@ApiModelProperty(value = "Rotation, in degrees, of the device's icon on the floor plan")
	public Integer getRotation() {
		return rotation;
	}

	public void setRotation(Integer rotation) {
		this.rotation = rotation;
	}

	public BranchClientDeviceData iconId(String iconId) {
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

	public BranchClientDeviceData url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * URL to open when the branch device is clicked on the floor plan. Maximum of 250 characters. Optional.
	 * 
	 * @return url
	 **/
	@ApiModelProperty(value = "URL to open when the branch device is clicked on the floor plan. Maximum of 250 characters. Optional.")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public BranchClientDeviceData linkTarget(String linkTarget) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BranchClientDeviceData branchClientDeviceData = (BranchClientDeviceData) o;
		return Objects.equals(this.$type, branchClientDeviceData.$type) &&
				Objects.equals(this.id, branchClientDeviceData.id) &&
				Objects.equals(this.name, branchClientDeviceData.name) &&
				Objects.equals(this.description, branchClientDeviceData.description) &&
				Objects.equals(this.translations, branchClientDeviceData.translations) &&
				Objects.equals(this.type, branchClientDeviceData.type) &&
				Objects.equals(this.x, branchClientDeviceData.x) &&
				Objects.equals(this.y, branchClientDeviceData.y) &&
				Objects.equals(this.size, branchClientDeviceData.size) &&
				Objects.equals(this.rotation, branchClientDeviceData.rotation) &&
				Objects.equals(this.iconId, branchClientDeviceData.iconId) &&
				Objects.equals(this.url, branchClientDeviceData.url) &&
				Objects.equals(this.linkTarget, branchClientDeviceData.linkTarget);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, name, description, translations, type, x, y, size, rotation, iconId, url, linkTarget);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BranchClientDeviceData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    x: ").append(toIndentedString(x)).append("\n");
		sb.append("    y: ").append(toIndentedString(y)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
		sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    linkTarget: ").append(toIndentedString(linkTarget)).append("\n");
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
