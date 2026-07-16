
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
	BranchDeviceData.JSON_PROPERTY_$_TYPE,
	BranchDeviceData.JSON_PROPERTY_ID,
	BranchDeviceData.JSON_PROPERTY_NAME,
	BranchDeviceData.JSON_PROPERTY_DESCRIPTION,
	BranchDeviceData.JSON_PROPERTY_TRANSLATIONS,
	BranchDeviceData.JSON_PROPERTY_TYPE,
	BranchDeviceData.JSON_PROPERTY_X,
	BranchDeviceData.JSON_PROPERTY_Y,
	BranchDeviceData.JSON_PROPERTY_SIZE,
	BranchDeviceData.JSON_PROPERTY_ROTATION,
	BranchDeviceData.JSON_PROPERTY_ICON_ID,
	BranchDeviceData.JSON_PROPERTY_URL,
	BranchDeviceData.JSON_PROPERTY_LINK_TARGET,
	BranchDeviceData.JSON_PROPERTY_EXTERNAL_DEVICE_ID,
	BranchDeviceData.JSON_PROPERTY_ON_COLOR,
	BranchDeviceData.JSON_PROPERTY_OFF_COLOR,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BranchDeviceData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BRANCHDEVICEDATA("BranchDeviceData");

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
			return TypeEnum.BRANCHDEVICEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BRANCHDEVICEDATA;

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
	private Map<String, BranchDeviceTranslation> translations = null;

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

	public static final String JSON_PROPERTY_EXTERNAL_DEVICE_ID = "externalDeviceId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_DEVICE_ID)
	private String externalDeviceId;

	public static final String JSON_PROPERTY_ON_COLOR = "onColor";
	@JsonProperty(JSON_PROPERTY_ON_COLOR)
	private String onColor;

	public static final String JSON_PROPERTY_OFF_COLOR = "offColor";
	@JsonProperty(JSON_PROPERTY_OFF_COLOR)
	private String offColor;

	public BranchDeviceData $type(TypeEnum $type) {
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

	public BranchDeviceData id(String id) {
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

	public BranchDeviceData name(String name) {
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

	public BranchDeviceData description(String description) {
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

	public BranchDeviceData translations(Map<String, BranchDeviceTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public BranchDeviceData putTranslationsItem(String key, BranchDeviceTranslation translationsItem) {
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
	public Map<String, BranchDeviceTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, BranchDeviceTranslation> translations) {
		this.translations = translations;
	}

	public BranchDeviceData type(EBranchDeviceType type) {
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

	public BranchDeviceData x(Integer x) {
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

	public BranchDeviceData y(Integer y) {
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

	public BranchDeviceData size(Integer size) {
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

	public BranchDeviceData rotation(Integer rotation) {
		this.rotation = rotation;
		return this;
	}

	/**
	 * Rotation, in degrees, of the device&#39;s icon on the floor plan. 0 degree is to the right and the rotation is clockwise.
	 * 
	 * @return rotation
	 **/
	@ApiModelProperty(value = "Rotation, in degrees, of the device's icon on the floor plan. 0 degree is to the right and the rotation is clockwise.")
	public Integer getRotation() {
		return rotation;
	}

	public void setRotation(Integer rotation) {
		this.rotation = rotation;
	}

	public BranchDeviceData iconId(String iconId) {
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

	public BranchDeviceData url(String url) {
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

	public BranchDeviceData linkTarget(String linkTarget) {
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

	public BranchDeviceData externalDeviceId(String externalDeviceId) {
		this.externalDeviceId = externalDeviceId;
		return this;
	}

	/**
	 * Identifier that addresses this device on the branch&#39;s external device endpoint (e.g. a WebIO port number). Used for DOOR_OPENER and STATUS_LAMP device
	 * types. Optional.
	 * 
	 * @return externalDeviceId
	 **/
	@ApiModelProperty(value = "Identifier that addresses this device on the branch's external device endpoint (e.g. a WebIO port number). Used for DOOR_OPENER and STATUS_LAMP device types. Optional.")
	public String getExternalDeviceId() {
		return externalDeviceId;
	}

	public void setExternalDeviceId(String externalDeviceId) {
		this.externalDeviceId = externalDeviceId;
	}

	public BranchDeviceData onColor(String onColor) {
		this.onColor = onColor;
		return this;
	}

	/**
	 * Hex color displayed when the device is in the ON state. Format: &#x60;#RRGGBB&#x60;. Optional.
	 * 
	 * @return onColor
	 **/
	@ApiModelProperty(value = "Hex color displayed when the device is in the ON state. Format: `#RRGGBB`. Optional.")
	public String getOnColor() {
		return onColor;
	}

	public void setOnColor(String onColor) {
		this.onColor = onColor;
	}

	public BranchDeviceData offColor(String offColor) {
		this.offColor = offColor;
		return this;
	}

	/**
	 * Hex color displayed when the device is in the OFF state. Format: &#x60;#RRGGBB&#x60;. Optional.
	 * 
	 * @return offColor
	 **/
	@ApiModelProperty(value = "Hex color displayed when the device is in the OFF state. Format: `#RRGGBB`. Optional.")
	public String getOffColor() {
		return offColor;
	}

	public void setOffColor(String offColor) {
		this.offColor = offColor;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BranchDeviceData branchDeviceData = (BranchDeviceData) o;
		return Objects.equals(this.$type, branchDeviceData.$type) &&
				Objects.equals(this.id, branchDeviceData.id) &&
				Objects.equals(this.name, branchDeviceData.name) &&
				Objects.equals(this.description, branchDeviceData.description) &&
				Objects.equals(this.translations, branchDeviceData.translations) &&
				Objects.equals(this.type, branchDeviceData.type) &&
				Objects.equals(this.x, branchDeviceData.x) &&
				Objects.equals(this.y, branchDeviceData.y) &&
				Objects.equals(this.size, branchDeviceData.size) &&
				Objects.equals(this.rotation, branchDeviceData.rotation) &&
				Objects.equals(this.iconId, branchDeviceData.iconId) &&
				Objects.equals(this.url, branchDeviceData.url) &&
				Objects.equals(this.linkTarget, branchDeviceData.linkTarget) &&
				Objects.equals(this.externalDeviceId, branchDeviceData.externalDeviceId) &&
				Objects.equals(this.onColor, branchDeviceData.onColor) &&
				Objects.equals(this.offColor, branchDeviceData.offColor);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, name, description, translations, type, x, y, size, rotation, iconId, url, linkTarget, externalDeviceId, onColor, offColor);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BranchDeviceData {\n");
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
		sb.append("    externalDeviceId: ").append(toIndentedString(externalDeviceId)).append("\n");
		sb.append("    onColor: ").append(toIndentedString(onColor)).append("\n");
		sb.append("    offColor: ").append(toIndentedString(offColor)).append("\n");
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
