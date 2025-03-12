
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * Data model object for a branch client
 */
@ApiModel(description = "Data model object for a branch client")

@JsonPropertyOrder({
	BranchClientData.JSON_PROPERTY_$_TYPE,
	BranchClientData.JSON_PROPERTY_ID,
	BranchClientData.JSON_PROPERTY_ACCOUNT_ID,
	BranchClientData.JSON_PROPERTY_CREATION_TIMESTAMP,
	BranchClientData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	BranchClientData.JSON_PROPERTY_VERSION,
	BranchClientData.JSON_PROPERTY_NAME,
	BranchClientData.JSON_PROPERTY_DESCRIPTION,
	BranchClientData.JSON_PROPERTY_TRANSLATIONS,
	BranchClientData.JSON_PROPERTY_BRANCH_ID,
	BranchClientData.JSON_PROPERTY_BRANCH_CLIENT_KEY,
	BranchClientData.JSON_PROPERTY_PUBLIC_KEY,
	BranchClientData.JSON_PROPERTY_MAIN_CAMERA_MEDIA_DEVICE_LABEL,
	BranchClientData.JSON_PROPERTY_MICROPHONE_MEDIA_DEVICE_LABEL,
	BranchClientData.JSON_PROPERTY_TYPE,
	BranchClientData.JSON_PROPERTY_ICON_ID,
	BranchClientData.JSON_PROPERTY_X,
	BranchClientData.JSON_PROPERTY_Y,
	BranchClientData.JSON_PROPERTY_SIZE,
	BranchClientData.JSON_PROPERTY_ROTATION,
	BranchClientData.JSON_PROPERTY_BRANCH_CLIENT_DEVICES,
	BranchClientData.JSON_PROPERTY_BRANCH_CLIENT_AUXILIARY_CAMERAS,
	BranchClientData.JSON_PROPERTY_BRANCH_CLIENT_LINKS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BranchClientData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BRANCHCLIENTDATA("BranchClientData");

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
			return TypeEnum.BRANCHCLIENTDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BRANCHCLIENTDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_VERSION = "version";
	@JsonProperty(JSON_PROPERTY_VERSION)
	private Long version;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
	@JsonProperty(JSON_PROPERTY_TRANSLATIONS)
	private Map<String, BranchClientTranslation> translations = null;

	public static final String JSON_PROPERTY_BRANCH_ID = "branchId";
	@JsonProperty(JSON_PROPERTY_BRANCH_ID)
	private String branchId;

	public static final String JSON_PROPERTY_BRANCH_CLIENT_KEY = "branchClientKey";
	@JsonProperty(JSON_PROPERTY_BRANCH_CLIENT_KEY)
	private String branchClientKey;

	public static final String JSON_PROPERTY_PUBLIC_KEY = "publicKey";
	@JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
	private String publicKey;

	public static final String JSON_PROPERTY_MAIN_CAMERA_MEDIA_DEVICE_LABEL = "mainCameraMediaDeviceLabel";
	@JsonProperty(JSON_PROPERTY_MAIN_CAMERA_MEDIA_DEVICE_LABEL)
	private String mainCameraMediaDeviceLabel;

	public static final String JSON_PROPERTY_MICROPHONE_MEDIA_DEVICE_LABEL = "microphoneMediaDeviceLabel";
	@JsonProperty(JSON_PROPERTY_MICROPHONE_MEDIA_DEVICE_LABEL)
	private String microphoneMediaDeviceLabel;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EBranchClientType type;

	public static final String JSON_PROPERTY_ICON_ID = "iconId";
	@JsonProperty(JSON_PROPERTY_ICON_ID)
	private String iconId;

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

	public static final String JSON_PROPERTY_BRANCH_CLIENT_DEVICES = "branchClientDevices";
	@JsonProperty(JSON_PROPERTY_BRANCH_CLIENT_DEVICES)
	private List<BranchClientDeviceData> branchClientDevices = null;

	public static final String JSON_PROPERTY_BRANCH_CLIENT_AUXILIARY_CAMERAS = "branchClientAuxiliaryCameras";
	@JsonProperty(JSON_PROPERTY_BRANCH_CLIENT_AUXILIARY_CAMERAS)
	private List<BranchClientAuxiliaryCameraData> branchClientAuxiliaryCameras = null;

	public static final String JSON_PROPERTY_BRANCH_CLIENT_LINKS = "branchClientLinks";
	@JsonProperty(JSON_PROPERTY_BRANCH_CLIENT_LINKS)
	private List<BranchClientLinkData> branchClientLinks = null;

	public BranchClientData $type(TypeEnum $type) {
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

	public BranchClientData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * ID of the branch client
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "ID of the branch client")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BranchClientData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Account ID that the branch client belongs to
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "Account ID that the branch client belongs to")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public BranchClientData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be
	 * omitted. Note: If you set this property, Unblu returns the same value, but it isn&#39;t written to storage and doesn&#39;t affect data consistency.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be omitted. Note: If you set this property, Unblu returns the same value, but it isn't written to storage and doesn't affect data consistency.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public BranchClientData modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Timestamp of the last modification. This property is always optional and can be omitted when sending data to the server. If sent to the server, it is
	 * ignored. It is only informational in character. Note: If you set this property, it returns the same value but it isn&#39;t written to storage and doesn&#39;t
	 * affect the data consistency.
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the last modification. This property is always optional and can be omitted when sending data to the server. If sent to the server, it is ignored. It is only informational in character. Note: If you set this property, it returns the same value but it isn't written to storage and doesn't affect the data consistency.")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public BranchClientData version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * Version of the entity, incremented on each change. Updates must always be based on the latest version or they&#39;re rejected. When creating an object, the
	 * version can be omitted.
	 * 
	 * @return version
	 **/
	@ApiModelProperty(value = "Version of the entity, incremented on each change. Updates must always be based on the latest version or they're rejected. When creating an object, the version can be omitted.")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public BranchClientData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the branch client. Maximum of 250 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the branch client. Maximum of 250 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BranchClientData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the branch client. Maximum of 500 characters. Optional.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the branch client. Maximum of 500 characters. Optional.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BranchClientData translations(Map<String, BranchClientTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public BranchClientData putTranslationsItem(String key, BranchClientTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A Map of localized versions of the name and description of the branch client
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A Map of localized versions of the name and description of the branch client")
	public Map<String, BranchClientTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, BranchClientTranslation> translations) {
		this.translations = translations;
	}

	public BranchClientData branchId(String branchId) {
		this.branchId = branchId;
		return this;
	}

	/**
	 * The branch ID that the branch client belongs to
	 * 
	 * @return branchId
	 **/
	@ApiModelProperty(value = "The branch ID that the branch client belongs to")
	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public BranchClientData branchClientKey(String branchClientKey) {
		this.branchClientKey = branchClientKey;
		return this;
	}

	/**
	 * Branch Client Key
	 * 
	 * @return branchClientKey
	 **/
	@ApiModelProperty(value = "Branch Client Key")
	public String getBranchClientKey() {
		return branchClientKey;
	}

	public void setBranchClientKey(String branchClientKey) {
		this.branchClientKey = branchClientKey;
	}

	public BranchClientData publicKey(String publicKey) {
		this.publicKey = publicKey;
		return this;
	}

	/**
	 * Public key for JWT token validation
	 * 
	 * @return publicKey
	 **/
	@ApiModelProperty(value = "Public key for JWT token validation")
	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public BranchClientData mainCameraMediaDeviceLabel(String mainCameraMediaDeviceLabel) {
		this.mainCameraMediaDeviceLabel = mainCameraMediaDeviceLabel;
		return this;
	}

	/**
	 * Media device label of the main branch client camera. The name is provided by the device. Maximum of 250 characters. Optional.
	 * 
	 * @return mainCameraMediaDeviceLabel
	 **/
	@ApiModelProperty(value = "Media device label of the main branch client camera. The name is provided by the device. Maximum of 250 characters. Optional.")
	public String getMainCameraMediaDeviceLabel() {
		return mainCameraMediaDeviceLabel;
	}

	public void setMainCameraMediaDeviceLabel(String mainCameraMediaDeviceLabel) {
		this.mainCameraMediaDeviceLabel = mainCameraMediaDeviceLabel;
	}

	public BranchClientData microphoneMediaDeviceLabel(String microphoneMediaDeviceLabel) {
		this.microphoneMediaDeviceLabel = microphoneMediaDeviceLabel;
		return this;
	}

	/**
	 * Media device label of the branch client microphone. The name is provided by the device. Maximum of 250 characters. Optional.
	 * 
	 * @return microphoneMediaDeviceLabel
	 **/
	@ApiModelProperty(value = "Media device label of the branch client microphone. The name is provided by the device. Maximum of 250 characters. Optional.")
	public String getMicrophoneMediaDeviceLabel() {
		return microphoneMediaDeviceLabel;
	}

	public void setMicrophoneMediaDeviceLabel(String microphoneMediaDeviceLabel) {
		this.microphoneMediaDeviceLabel = microphoneMediaDeviceLabel;
	}

	public BranchClientData type(EBranchClientType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EBranchClientType getType() {
		return type;
	}

	public void setType(EBranchClientType type) {
		this.type = type;
	}

	public BranchClientData iconId(String iconId) {
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

	public BranchClientData x(Integer x) {
		this.x = x;
		return this;
	}

	/**
	 * X coordinate of the client&#39;s icon on the floor plan. 0 marks the left edge of the plan.
	 * 
	 * @return x
	 **/
	@ApiModelProperty(value = "X coordinate of the client's icon on the floor plan. 0 marks the left edge of the plan.")
	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public BranchClientData y(Integer y) {
		this.y = y;
		return this;
	}

	/**
	 * Y coordinate of the client&#39;s icon on the floor plan. 0 marks the top edge of the plan.
	 * 
	 * @return y
	 **/
	@ApiModelProperty(value = "Y coordinate of the client's icon on the floor plan. 0 marks the top edge of the plan.")
	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public BranchClientData size(Integer size) {
		this.size = size;
		return this;
	}

	/**
	 * Size of the client&#39;s icon on the floor plan
	 * 
	 * @return size
	 **/
	@ApiModelProperty(value = "Size of the client's icon on the floor plan")
	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public BranchClientData rotation(Integer rotation) {
		this.rotation = rotation;
		return this;
	}

	/**
	 * Rotation, in degrees, of the client&#39;s icon on the floor plan. 0 degree is to the right and the rotation is clockwise.
	 * 
	 * @return rotation
	 **/
	@ApiModelProperty(value = "Rotation, in degrees, of the client's icon on the floor plan. 0 degree is to the right and the rotation is clockwise.")
	public Integer getRotation() {
		return rotation;
	}

	public void setRotation(Integer rotation) {
		this.rotation = rotation;
	}

	public BranchClientData branchClientDevices(List<BranchClientDeviceData> branchClientDevices) {
		this.branchClientDevices = branchClientDevices;
		return this;
	}

	public BranchClientData addBranchClientDevicesItem(BranchClientDeviceData branchClientDevicesItem) {
		if (this.branchClientDevices == null) {
			this.branchClientDevices = new ArrayList<>();
		}
		this.branchClientDevices.add(branchClientDevicesItem);
		return this;
	}

	/**
	 * List of all branch client devices that belong to the branch client
	 * 
	 * @return branchClientDevices
	 **/
	@ApiModelProperty(value = "List of all branch client devices that belong to the branch client")
	public List<BranchClientDeviceData> getBranchClientDevices() {
		return branchClientDevices;
	}

	public void setBranchClientDevices(List<BranchClientDeviceData> branchClientDevices) {
		this.branchClientDevices = branchClientDevices;
	}

	public BranchClientData branchClientAuxiliaryCameras(List<BranchClientAuxiliaryCameraData> branchClientAuxiliaryCameras) {
		this.branchClientAuxiliaryCameras = branchClientAuxiliaryCameras;
		return this;
	}

	public BranchClientData addBranchClientAuxiliaryCamerasItem(BranchClientAuxiliaryCameraData branchClientAuxiliaryCamerasItem) {
		if (this.branchClientAuxiliaryCameras == null) {
			this.branchClientAuxiliaryCameras = new ArrayList<>();
		}
		this.branchClientAuxiliaryCameras.add(branchClientAuxiliaryCamerasItem);
		return this;
	}

	/**
	 * List of all branch client auxiliary cameras that belong to the branch client
	 * 
	 * @return branchClientAuxiliaryCameras
	 **/
	@ApiModelProperty(value = "List of all branch client auxiliary cameras that belong to the branch client")
	public List<BranchClientAuxiliaryCameraData> getBranchClientAuxiliaryCameras() {
		return branchClientAuxiliaryCameras;
	}

	public void setBranchClientAuxiliaryCameras(List<BranchClientAuxiliaryCameraData> branchClientAuxiliaryCameras) {
		this.branchClientAuxiliaryCameras = branchClientAuxiliaryCameras;
	}

	public BranchClientData branchClientLinks(List<BranchClientLinkData> branchClientLinks) {
		this.branchClientLinks = branchClientLinks;
		return this;
	}

	public BranchClientData addBranchClientLinksItem(BranchClientLinkData branchClientLinksItem) {
		if (this.branchClientLinks == null) {
			this.branchClientLinks = new ArrayList<>();
		}
		this.branchClientLinks.add(branchClientLinksItem);
		return this;
	}

	/**
	 * List of all branch client links that belong to the branch client
	 * 
	 * @return branchClientLinks
	 **/
	@ApiModelProperty(value = "List of all branch client links that belong to the branch client")
	public List<BranchClientLinkData> getBranchClientLinks() {
		return branchClientLinks;
	}

	public void setBranchClientLinks(List<BranchClientLinkData> branchClientLinks) {
		this.branchClientLinks = branchClientLinks;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BranchClientData branchClientData = (BranchClientData) o;
		return Objects.equals(this.$type, branchClientData.$type) &&
				Objects.equals(this.id, branchClientData.id) &&
				Objects.equals(this.accountId, branchClientData.accountId) &&
				Objects.equals(this.creationTimestamp, branchClientData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, branchClientData.modificationTimestamp) &&
				Objects.equals(this.version, branchClientData.version) &&
				Objects.equals(this.name, branchClientData.name) &&
				Objects.equals(this.description, branchClientData.description) &&
				Objects.equals(this.translations, branchClientData.translations) &&
				Objects.equals(this.branchId, branchClientData.branchId) &&
				Objects.equals(this.branchClientKey, branchClientData.branchClientKey) &&
				Objects.equals(this.publicKey, branchClientData.publicKey) &&
				Objects.equals(this.mainCameraMediaDeviceLabel, branchClientData.mainCameraMediaDeviceLabel) &&
				Objects.equals(this.microphoneMediaDeviceLabel, branchClientData.microphoneMediaDeviceLabel) &&
				Objects.equals(this.type, branchClientData.type) &&
				Objects.equals(this.iconId, branchClientData.iconId) &&
				Objects.equals(this.x, branchClientData.x) &&
				Objects.equals(this.y, branchClientData.y) &&
				Objects.equals(this.size, branchClientData.size) &&
				Objects.equals(this.rotation, branchClientData.rotation) &&
				Objects.equals(this.branchClientDevices, branchClientData.branchClientDevices) &&
				Objects.equals(this.branchClientAuxiliaryCameras, branchClientData.branchClientAuxiliaryCameras) &&
				Objects.equals(this.branchClientLinks, branchClientData.branchClientLinks);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, creationTimestamp, modificationTimestamp, version, name, description, translations, branchId, branchClientKey, publicKey, mainCameraMediaDeviceLabel, microphoneMediaDeviceLabel, type, iconId, x, y, size, rotation, branchClientDevices, branchClientAuxiliaryCameras, branchClientLinks);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BranchClientData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
		sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
		sb.append("    branchClientKey: ").append(toIndentedString(branchClientKey)).append("\n");
		sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
		sb.append("    mainCameraMediaDeviceLabel: ").append(toIndentedString(mainCameraMediaDeviceLabel)).append("\n");
		sb.append("    microphoneMediaDeviceLabel: ").append(toIndentedString(microphoneMediaDeviceLabel)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
		sb.append("    x: ").append(toIndentedString(x)).append("\n");
		sb.append("    y: ").append(toIndentedString(y)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
		sb.append("    branchClientDevices: ").append(toIndentedString(branchClientDevices)).append("\n");
		sb.append("    branchClientAuxiliaryCameras: ").append(toIndentedString(branchClientAuxiliaryCameras)).append("\n");
		sb.append("    branchClientLinks: ").append(toIndentedString(branchClientLinks)).append("\n");
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
