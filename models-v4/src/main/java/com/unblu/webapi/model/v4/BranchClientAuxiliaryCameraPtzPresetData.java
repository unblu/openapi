
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
 * Data model object for a branch client auxiliary camera PTZ preset
 */
@ApiModel(description = "Data model object for a branch client auxiliary camera PTZ preset")

@JsonPropertyOrder({
	BranchClientAuxiliaryCameraPtzPresetData.JSON_PROPERTY_$_TYPE,
	BranchClientAuxiliaryCameraPtzPresetData.JSON_PROPERTY_ID,
	BranchClientAuxiliaryCameraPtzPresetData.JSON_PROPERTY_NAME,
	BranchClientAuxiliaryCameraPtzPresetData.JSON_PROPERTY_DESCRIPTION,
	BranchClientAuxiliaryCameraPtzPresetData.JSON_PROPERTY_TRANSLATIONS,
	BranchClientAuxiliaryCameraPtzPresetData.JSON_PROPERTY_PAN,
	BranchClientAuxiliaryCameraPtzPresetData.JSON_PROPERTY_TILT,
	BranchClientAuxiliaryCameraPtzPresetData.JSON_PROPERTY_ZOOM,
	BranchClientAuxiliaryCameraPtzPresetData.JSON_PROPERTY_DEFAULT_VALUE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BranchClientAuxiliaryCameraPtzPresetData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BRANCHCLIENTAUXILIARYCAMERAPTZPRESETDATA("BranchClientAuxiliaryCameraPtzPresetData");

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
			return TypeEnum.BRANCHCLIENTAUXILIARYCAMERAPTZPRESETDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BRANCHCLIENTAUXILIARYCAMERAPTZPRESETDATA;

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
	private Map<String, BranchClientAuxiliaryCameraPtzPresetTranslation> translations = null;

	public static final String JSON_PROPERTY_PAN = "pan";
	@JsonProperty(JSON_PROPERTY_PAN)
	private Float pan;

	public static final String JSON_PROPERTY_TILT = "tilt";
	@JsonProperty(JSON_PROPERTY_TILT)
	private Float tilt;

	public static final String JSON_PROPERTY_ZOOM = "zoom";
	@JsonProperty(JSON_PROPERTY_ZOOM)
	private Float zoom;

	public static final String JSON_PROPERTY_DEFAULT_VALUE = "defaultValue";
	@JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
	private Boolean defaultValue;

	public BranchClientAuxiliaryCameraPtzPresetData $type(TypeEnum $type) {
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

	public BranchClientAuxiliaryCameraPtzPresetData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * ID of the branch client auxiliary camera PTZ preset
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "ID of the branch client auxiliary camera PTZ preset")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BranchClientAuxiliaryCameraPtzPresetData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the branch client auxiliary camera PTZ preset. Maximum of 250 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the branch client auxiliary camera PTZ preset. Maximum of 250 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BranchClientAuxiliaryCameraPtzPresetData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the branch client auxiliary camera PTZ preset. Maximum of 500 characters. Optional.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the branch client auxiliary camera PTZ preset. Maximum of 500 characters. Optional.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BranchClientAuxiliaryCameraPtzPresetData translations(Map<String, BranchClientAuxiliaryCameraPtzPresetTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public BranchClientAuxiliaryCameraPtzPresetData putTranslationsItem(String key, BranchClientAuxiliaryCameraPtzPresetTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A Map of localized versions of the name and description of the branch client auxiliary camera PTZ preset
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A Map of localized versions of the name and description of the branch client auxiliary camera PTZ preset")
	public Map<String, BranchClientAuxiliaryCameraPtzPresetTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, BranchClientAuxiliaryCameraPtzPresetTranslation> translations) {
		this.translations = translations;
	}

	public BranchClientAuxiliaryCameraPtzPresetData pan(Float pan) {
		this.pan = pan;
		return this;
	}

	/**
	 * Target pan value for the PTZ camera source (if set to null, no pan will be applied)
	 * 
	 * @return pan
	 **/
	@ApiModelProperty(value = "Target pan value for the PTZ camera source (if set to null, no pan will be applied)")
	public Float getPan() {
		return pan;
	}

	public void setPan(Float pan) {
		this.pan = pan;
	}

	public BranchClientAuxiliaryCameraPtzPresetData tilt(Float tilt) {
		this.tilt = tilt;
		return this;
	}

	/**
	 * Target tilt value for the PTZ camera source (if set to null, no tilt will be applied)
	 * 
	 * @return tilt
	 **/
	@ApiModelProperty(value = "Target tilt value for the PTZ camera source (if set to null, no tilt will be applied)")
	public Float getTilt() {
		return tilt;
	}

	public void setTilt(Float tilt) {
		this.tilt = tilt;
	}

	public BranchClientAuxiliaryCameraPtzPresetData zoom(Float zoom) {
		this.zoom = zoom;
		return this;
	}

	/**
	 * Target zoom value for the PTZ camera source (if set to null, no zoom will be applied)
	 * 
	 * @return zoom
	 **/
	@ApiModelProperty(value = "Target zoom value for the PTZ camera source (if set to null, no zoom will be applied)")
	public Float getZoom() {
		return zoom;
	}

	public void setZoom(Float zoom) {
		this.zoom = zoom;
	}

	public BranchClientAuxiliaryCameraPtzPresetData defaultValue(Boolean defaultValue) {
		this.defaultValue = defaultValue;
		return this;
	}

	/**
	 * If set to true, this PTZ preset will be activated by default
	 * 
	 * @return defaultValue
	 **/
	@ApiModelProperty(value = "If set to true, this PTZ preset will be activated by default")
	public Boolean isDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(Boolean defaultValue) {
		this.defaultValue = defaultValue;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BranchClientAuxiliaryCameraPtzPresetData branchClientAuxiliaryCameraPtzPresetData = (BranchClientAuxiliaryCameraPtzPresetData) o;
		return Objects.equals(this.$type, branchClientAuxiliaryCameraPtzPresetData.$type) &&
				Objects.equals(this.id, branchClientAuxiliaryCameraPtzPresetData.id) &&
				Objects.equals(this.name, branchClientAuxiliaryCameraPtzPresetData.name) &&
				Objects.equals(this.description, branchClientAuxiliaryCameraPtzPresetData.description) &&
				Objects.equals(this.translations, branchClientAuxiliaryCameraPtzPresetData.translations) &&
				Objects.equals(this.pan, branchClientAuxiliaryCameraPtzPresetData.pan) &&
				Objects.equals(this.tilt, branchClientAuxiliaryCameraPtzPresetData.tilt) &&
				Objects.equals(this.zoom, branchClientAuxiliaryCameraPtzPresetData.zoom) &&
				Objects.equals(this.defaultValue, branchClientAuxiliaryCameraPtzPresetData.defaultValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, name, description, translations, pan, tilt, zoom, defaultValue);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BranchClientAuxiliaryCameraPtzPresetData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
		sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
		sb.append("    tilt: ").append(toIndentedString(tilt)).append("\n");
		sb.append("    zoom: ").append(toIndentedString(zoom)).append("\n");
		sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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
