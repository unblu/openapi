
package com.unblu.webapi.model.v3;

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
 * derived images model class (used for avatar-images)
 */
@ApiModel(description = "derived images model class (used for avatar-images)")

@JsonPropertyOrder({
	Avatar.JSON_PROPERTY_$_TYPE,
	Avatar.JSON_PROPERTY_ID,
	Avatar.JSON_PROPERTY_CREATION_TIMESTAMP,
	Avatar.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	Avatar.JSON_PROPERTY_ACCOUNT_ID,
	Avatar.JSON_PROPERTY_IMAGE_ZOOM_FACTOR,
	Avatar.JSON_PROPERTY_IMAGE_X_POSITION_RATIO,
	Avatar.JSON_PROPERTY_IMAGE_Y_POSITION_RATIO,
	Avatar.JSON_PROPERTY_IMAGE_ROTATION_ANGLE,
	Avatar.JSON_PROPERTY_IMAGE_DATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Avatar {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AVATAR("Avatar");

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
			return TypeEnum.AVATAR;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AVATAR;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_IMAGE_ZOOM_FACTOR = "imageZoomFactor";
	@JsonProperty(JSON_PROPERTY_IMAGE_ZOOM_FACTOR)
	private Float imageZoomFactor;

	public static final String JSON_PROPERTY_IMAGE_X_POSITION_RATIO = "imageXPositionRatio";
	@JsonProperty(JSON_PROPERTY_IMAGE_X_POSITION_RATIO)
	private Float imageXPositionRatio;

	public static final String JSON_PROPERTY_IMAGE_Y_POSITION_RATIO = "imageYPositionRatio";
	@JsonProperty(JSON_PROPERTY_IMAGE_Y_POSITION_RATIO)
	private Float imageYPositionRatio;

	public static final String JSON_PROPERTY_IMAGE_ROTATION_ANGLE = "imageRotationAngle";
	@JsonProperty(JSON_PROPERTY_IMAGE_ROTATION_ANGLE)
	private Integer imageRotationAngle;

	public static final String JSON_PROPERTY_IMAGE_DATA = "imageData";
	@JsonProperty(JSON_PROPERTY_IMAGE_DATA)
	private String imageData;

	public Avatar $type(TypeEnum $type) {
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

	public Avatar id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique id of the entity. When creating an entity this property can be omitted as it will be generated by the server anyway.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique id of the entity. When creating an entity this property can be omitted as it will be generated by the server anyway.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Avatar creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is stored the first time in the system. It is ignored, when sending it to the server and
	 * therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data
	 * consistency.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is stored the first time in the system. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data consistency.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public Avatar modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational
	 * character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it
	 * will not be written to the storage and will not effect the data consistency.
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data consistency.")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public Avatar accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It will be filled by the server with the account ID of the
	 * user currently logged in. When editing an entity, you must include the account ID.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It will be filled by the server with the account ID of the user currently logged in. When editing an entity, you must include the account ID.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Avatar imageZoomFactor(Float imageZoomFactor) {
		this.imageZoomFactor = imageZoomFactor;
		return this;
	}

	/**
	 * Zoom factor to crop the original image. Must be bigger than 1. If omitted a minimal factor will be computed.
	 * 
	 * @return imageZoomFactor
	 **/
	@ApiModelProperty(value = "Zoom factor to crop the original image. Must be bigger than 1. If omitted a minimal factor will be computed.")
	public Float getImageZoomFactor() {
		return imageZoomFactor;
	}

	public void setImageZoomFactor(Float imageZoomFactor) {
		this.imageZoomFactor = imageZoomFactor;
	}

	public Avatar imageXPositionRatio(Float imageXPositionRatio) {
		this.imageXPositionRatio = imageXPositionRatio;
		return this;
	}

	/**
	 * Ratio to determine the horizontal position of the cropping area. Must be between 0 and 1: 0 means moved at the left border, 1 means moved at the right
	 * border. If omitted 0.5 will be used.
	 * 
	 * @return imageXPositionRatio
	 **/
	@ApiModelProperty(value = "Ratio to determine the horizontal position of the cropping area. Must be between 0 and 1: 0 means moved at the left border, 1 means moved at the right border. If omitted 0.5 will be used.")
	public Float getImageXPositionRatio() {
		return imageXPositionRatio;
	}

	public void setImageXPositionRatio(Float imageXPositionRatio) {
		this.imageXPositionRatio = imageXPositionRatio;
	}

	public Avatar imageYPositionRatio(Float imageYPositionRatio) {
		this.imageYPositionRatio = imageYPositionRatio;
		return this;
	}

	/**
	 * Ratio to determine the vertical position of the cropping area. Must be between 0 and 1: 0 means moved at the top border, 1 means moved at the bottom border.
	 * If omitted 0.5 will be used.
	 * 
	 * @return imageYPositionRatio
	 **/
	@ApiModelProperty(value = "Ratio to determine the vertical position of the cropping area. Must be between 0 and 1: 0 means moved at the top border, 1 means moved at the bottom border. If omitted 0.5 will be used.")
	public Float getImageYPositionRatio() {
		return imageYPositionRatio;
	}

	public void setImageYPositionRatio(Float imageYPositionRatio) {
		this.imageYPositionRatio = imageYPositionRatio;
	}

	public Avatar imageRotationAngle(Integer imageRotationAngle) {
		this.imageRotationAngle = imageRotationAngle;
		return this;
	}

	/**
	 * Clockwise angle in degree (0-380) for rotation. If omitted 0 will be used.
	 * 
	 * @return imageRotationAngle
	 **/
	@ApiModelProperty(value = "Clockwise angle in degree (0-380) for rotation. If omitted 0 will be used.")
	public Integer getImageRotationAngle() {
		return imageRotationAngle;
	}

	public void setImageRotationAngle(Integer imageRotationAngle) {
		this.imageRotationAngle = imageRotationAngle;
	}

	public Avatar imageData(String imageData) {
		this.imageData = imageData;
		return this;
	}

	/**
	 * Image content as data URL scheme (RFC2397 - &lt;code&gt;data:[&amp;lt;mediatype&amp;gt;][;base64],&amp;lt;data&amp;gt;&lt;/code&gt;)
	 * 
	 * @return imageData
	 **/
	@ApiModelProperty(value = "Image content as data URL scheme (RFC2397 - <code>data:[&lt;mediatype&gt;][;base64],&lt;data&gt;</code>)")
	public String getImageData() {
		return imageData;
	}

	public void setImageData(String imageData) {
		this.imageData = imageData;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Avatar avatar = (Avatar) o;
		return Objects.equals(this.$type, avatar.$type) &&
				Objects.equals(this.id, avatar.id) &&
				Objects.equals(this.creationTimestamp, avatar.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, avatar.modificationTimestamp) &&
				Objects.equals(this.accountId, avatar.accountId) &&
				Objects.equals(this.imageZoomFactor, avatar.imageZoomFactor) &&
				Objects.equals(this.imageXPositionRatio, avatar.imageXPositionRatio) &&
				Objects.equals(this.imageYPositionRatio, avatar.imageYPositionRatio) &&
				Objects.equals(this.imageRotationAngle, avatar.imageRotationAngle) &&
				Objects.equals(this.imageData, avatar.imageData);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, accountId, imageZoomFactor, imageXPositionRatio, imageYPositionRatio, imageRotationAngle, imageData);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Avatar {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    imageZoomFactor: ").append(toIndentedString(imageZoomFactor)).append("\n");
		sb.append("    imageXPositionRatio: ").append(toIndentedString(imageXPositionRatio)).append("\n");
		sb.append("    imageYPositionRatio: ").append(toIndentedString(imageYPositionRatio)).append("\n");
		sb.append("    imageRotationAngle: ").append(toIndentedString(imageRotationAngle)).append("\n");
		sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
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