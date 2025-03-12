
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
 * Data model object for a branch client auxiliary camera
 */
@ApiModel(description = "Data model object for a branch client auxiliary camera")

@JsonPropertyOrder({
	BranchClientAuxiliaryCameraData.JSON_PROPERTY_$_TYPE,
	BranchClientAuxiliaryCameraData.JSON_PROPERTY_ID,
	BranchClientAuxiliaryCameraData.JSON_PROPERTY_NAME,
	BranchClientAuxiliaryCameraData.JSON_PROPERTY_TYPE,
	BranchClientAuxiliaryCameraData.JSON_PROPERTY_DESCRIPTION,
	BranchClientAuxiliaryCameraData.JSON_PROPERTY_TRANSLATIONS,
	BranchClientAuxiliaryCameraData.JSON_PROPERTY_X,
	BranchClientAuxiliaryCameraData.JSON_PROPERTY_Y,
	BranchClientAuxiliaryCameraData.JSON_PROPERTY_SIZE,
	BranchClientAuxiliaryCameraData.JSON_PROPERTY_ROTATION,
	BranchClientAuxiliaryCameraData.JSON_PROPERTY_ICON_ID,
	BranchClientAuxiliaryCameraData.JSON_PROPERTY_ALWAYS_DISPLAY_DURING_CALL,
	BranchClientAuxiliaryCameraData.JSON_PROPERTY_DISPLAY_IN_FLOOR_PLAN,
	BranchClientAuxiliaryCameraData.JSON_PROPERTY_MEDIA_DEVICE_LABEL,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BranchClientAuxiliaryCameraData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BRANCHCLIENTAUXILIARYCAMERADATA("BranchClientAuxiliaryCameraData");

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
			return TypeEnum.BRANCHCLIENTAUXILIARYCAMERADATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BRANCHCLIENTAUXILIARYCAMERADATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EBranchClientAuxiliaryCameraType type;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
	@JsonProperty(JSON_PROPERTY_TRANSLATIONS)
	private Map<String, BranchClientAuxiliaryCameraTranslation> translations = null;

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

	public static final String JSON_PROPERTY_ALWAYS_DISPLAY_DURING_CALL = "alwaysDisplayDuringCall";
	@JsonProperty(JSON_PROPERTY_ALWAYS_DISPLAY_DURING_CALL)
	private Boolean alwaysDisplayDuringCall;

	public static final String JSON_PROPERTY_DISPLAY_IN_FLOOR_PLAN = "displayInFloorPlan";
	@JsonProperty(JSON_PROPERTY_DISPLAY_IN_FLOOR_PLAN)
	private Boolean displayInFloorPlan;

	public static final String JSON_PROPERTY_MEDIA_DEVICE_LABEL = "mediaDeviceLabel";
	@JsonProperty(JSON_PROPERTY_MEDIA_DEVICE_LABEL)
	private String mediaDeviceLabel;

	public BranchClientAuxiliaryCameraData $type(TypeEnum $type) {
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

	public BranchClientAuxiliaryCameraData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * ID of the branch client auxiliary camera
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "ID of the branch client auxiliary camera")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BranchClientAuxiliaryCameraData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the branch client auxiliary camera. Maximum of 250 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the branch client auxiliary camera. Maximum of 250 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BranchClientAuxiliaryCameraData type(EBranchClientAuxiliaryCameraType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EBranchClientAuxiliaryCameraType getType() {
		return type;
	}

	public void setType(EBranchClientAuxiliaryCameraType type) {
		this.type = type;
	}

	public BranchClientAuxiliaryCameraData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the branch client auxiliary camera. Maximum of 500 characters. Optional.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the branch client auxiliary camera. Maximum of 500 characters. Optional.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BranchClientAuxiliaryCameraData translations(Map<String, BranchClientAuxiliaryCameraTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public BranchClientAuxiliaryCameraData putTranslationsItem(String key, BranchClientAuxiliaryCameraTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A Map of localized versions of the name and description of the branch client auxiliary camera
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A Map of localized versions of the name and description of the branch client auxiliary camera")
	public Map<String, BranchClientAuxiliaryCameraTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, BranchClientAuxiliaryCameraTranslation> translations) {
		this.translations = translations;
	}

	public BranchClientAuxiliaryCameraData x(Integer x) {
		this.x = x;
		return this;
	}

	/**
	 * X coordinate of the camera&#39;s icon on the floor plan. 0 marks the left edge of the plan.
	 * 
	 * @return x
	 **/
	@ApiModelProperty(value = "X coordinate of the camera's icon on the floor plan. 0 marks the left edge of the plan.")
	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public BranchClientAuxiliaryCameraData y(Integer y) {
		this.y = y;
		return this;
	}

	/**
	 * Y coordinate of the camera&#39;s icon on the floor plan. 0 marks the top edge of the plan.
	 * 
	 * @return y
	 **/
	@ApiModelProperty(value = "Y coordinate of the camera's icon on the floor plan. 0 marks the top edge of the plan.")
	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public BranchClientAuxiliaryCameraData size(Integer size) {
		this.size = size;
		return this;
	}

	/**
	 * Size of the camera&#39;s icon on the floor plan
	 * 
	 * @return size
	 **/
	@ApiModelProperty(value = "Size of the camera's icon on the floor plan")
	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public BranchClientAuxiliaryCameraData rotation(Integer rotation) {
		this.rotation = rotation;
		return this;
	}

	/**
	 * Rotation, in degrees, of the camera&#39;s icon on the floor plan. 0 degree is to the right and the rotation is clockwise.
	 * 
	 * @return rotation
	 **/
	@ApiModelProperty(value = "Rotation, in degrees, of the camera's icon on the floor plan. 0 degree is to the right and the rotation is clockwise.")
	public Integer getRotation() {
		return rotation;
	}

	public void setRotation(Integer rotation) {
		this.rotation = rotation;
	}

	public BranchClientAuxiliaryCameraData iconId(String iconId) {
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

	public BranchClientAuxiliaryCameraData alwaysDisplayDuringCall(Boolean alwaysDisplayDuringCall) {
		this.alwaysDisplayDuringCall = alwaysDisplayDuringCall;
		return this;
	}

	/**
	 * If set to true, the video feed of this camera is automatically displayed to the agent during calls, otherwise the feed must be activated manually.
	 * 
	 * @return alwaysDisplayDuringCall
	 **/
	@ApiModelProperty(value = "If set to true, the video feed of this camera is automatically displayed to the agent during calls, otherwise the feed must be activated manually.")
	public Boolean isAlwaysDisplayDuringCall() {
		return alwaysDisplayDuringCall;
	}

	public void setAlwaysDisplayDuringCall(Boolean alwaysDisplayDuringCall) {
		this.alwaysDisplayDuringCall = alwaysDisplayDuringCall;
	}

	public BranchClientAuxiliaryCameraData displayInFloorPlan(Boolean displayInFloorPlan) {
		this.displayInFloorPlan = displayInFloorPlan;
		return this;
	}

	/**
	 * Display in floor plan
	 * 
	 * @return displayInFloorPlan
	 **/
	@ApiModelProperty(value = "Display in floor plan")
	public Boolean isDisplayInFloorPlan() {
		return displayInFloorPlan;
	}

	public void setDisplayInFloorPlan(Boolean displayInFloorPlan) {
		this.displayInFloorPlan = displayInFloorPlan;
	}

	public BranchClientAuxiliaryCameraData mediaDeviceLabel(String mediaDeviceLabel) {
		this.mediaDeviceLabel = mediaDeviceLabel;
		return this;
	}

	/**
	 * Media device label of the branch client auxiliary camera. The name is provided by the device. Maximum of 250 characters. Mandatory.
	 * 
	 * @return mediaDeviceLabel
	 **/
	@ApiModelProperty(value = "Media device label of the branch client auxiliary camera. The name is provided by the device. Maximum of 250 characters. Mandatory.")
	public String getMediaDeviceLabel() {
		return mediaDeviceLabel;
	}

	public void setMediaDeviceLabel(String mediaDeviceLabel) {
		this.mediaDeviceLabel = mediaDeviceLabel;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BranchClientAuxiliaryCameraData branchClientAuxiliaryCameraData = (BranchClientAuxiliaryCameraData) o;
		return Objects.equals(this.$type, branchClientAuxiliaryCameraData.$type) &&
				Objects.equals(this.id, branchClientAuxiliaryCameraData.id) &&
				Objects.equals(this.name, branchClientAuxiliaryCameraData.name) &&
				Objects.equals(this.type, branchClientAuxiliaryCameraData.type) &&
				Objects.equals(this.description, branchClientAuxiliaryCameraData.description) &&
				Objects.equals(this.translations, branchClientAuxiliaryCameraData.translations) &&
				Objects.equals(this.x, branchClientAuxiliaryCameraData.x) &&
				Objects.equals(this.y, branchClientAuxiliaryCameraData.y) &&
				Objects.equals(this.size, branchClientAuxiliaryCameraData.size) &&
				Objects.equals(this.rotation, branchClientAuxiliaryCameraData.rotation) &&
				Objects.equals(this.iconId, branchClientAuxiliaryCameraData.iconId) &&
				Objects.equals(this.alwaysDisplayDuringCall, branchClientAuxiliaryCameraData.alwaysDisplayDuringCall) &&
				Objects.equals(this.displayInFloorPlan, branchClientAuxiliaryCameraData.displayInFloorPlan) &&
				Objects.equals(this.mediaDeviceLabel, branchClientAuxiliaryCameraData.mediaDeviceLabel);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, name, type, description, translations, x, y, size, rotation, iconId, alwaysDisplayDuringCall, displayInFloorPlan, mediaDeviceLabel);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BranchClientAuxiliaryCameraData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
		sb.append("    x: ").append(toIndentedString(x)).append("\n");
		sb.append("    y: ").append(toIndentedString(y)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
		sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
		sb.append("    alwaysDisplayDuringCall: ").append(toIndentedString(alwaysDisplayDuringCall)).append("\n");
		sb.append("    displayInFloorPlan: ").append(toIndentedString(displayInFloorPlan)).append("\n");
		sb.append("    mediaDeviceLabel: ").append(toIndentedString(mediaDeviceLabel)).append("\n");
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
