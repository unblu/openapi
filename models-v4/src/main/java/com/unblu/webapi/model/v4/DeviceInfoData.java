
package com.unblu.webapi.model.v4;

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
 * Data transfer object for device info, associated with a specific person. A device represents either a browser or an app that uses the Unblu mobile SDK.
 */
@ApiModel(description = "Data transfer object for device info, associated with a specific person. A device represents either a browser or an app that uses the Unblu mobile SDK.")

@JsonPropertyOrder({
	DeviceInfoData.JSON_PROPERTY_$_TYPE,
	DeviceInfoData.JSON_PROPERTY_ID,
	DeviceInfoData.JSON_PROPERTY_CREATION_TIMESTAMP,
	DeviceInfoData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	DeviceInfoData.JSON_PROPERTY_ACCOUNT_ID,
	DeviceInfoData.JSON_PROPERTY_OS_NAME,
	DeviceInfoData.JSON_PROPERTY_OS_VERSION,
	DeviceInfoData.JSON_PROPERTY_BROWSER_NAME,
	DeviceInfoData.JSON_PROPERTY_BROWSER_VERSION,
	DeviceInfoData.JSON_PROPERTY_TYPE,
	DeviceInfoData.JSON_PROPERTY_OWNER_PERSON_ID,
	DeviceInfoData.JSON_PROPERTY_LAST_SEEN,
	DeviceInfoData.JSON_PROPERTY_PUSH_NOTIFICATIONS_ENABLED,
	DeviceInfoData.JSON_PROPERTY_HAS_ACTIVE_AUTH_SESSION,
	DeviceInfoData.JSON_PROPERTY_ONLINE,
	DeviceInfoData.JSON_PROPERTY_HAS_PUSH_NOTIFICATION_TOKENS,
	DeviceInfoData.JSON_PROPERTY_CURRENT_DEVICE,
	DeviceInfoData.JSON_PROPERTY_BOUND,
	DeviceInfoData.JSON_PROPERTY_BOUND_TIMESTAMP,
	DeviceInfoData.JSON_PROPERTY_BINDING_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DeviceInfoData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DEVICEINFODATA("DeviceInfoData");

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
			return TypeEnum.DEVICEINFODATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DEVICEINFODATA;

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

	public static final String JSON_PROPERTY_OS_NAME = "osName";
	@JsonProperty(JSON_PROPERTY_OS_NAME)
	private String osName;

	public static final String JSON_PROPERTY_OS_VERSION = "osVersion";
	@JsonProperty(JSON_PROPERTY_OS_VERSION)
	private String osVersion;

	public static final String JSON_PROPERTY_BROWSER_NAME = "browserName";
	@JsonProperty(JSON_PROPERTY_BROWSER_NAME)
	private String browserName;

	public static final String JSON_PROPERTY_BROWSER_VERSION = "browserVersion";
	@JsonProperty(JSON_PROPERTY_BROWSER_VERSION)
	private String browserVersion;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EDeviceType type;

	public static final String JSON_PROPERTY_OWNER_PERSON_ID = "ownerPersonId";
	@JsonProperty(JSON_PROPERTY_OWNER_PERSON_ID)
	private String ownerPersonId;

	public static final String JSON_PROPERTY_LAST_SEEN = "lastSeen";
	@JsonProperty(JSON_PROPERTY_LAST_SEEN)
	private Long lastSeen;

	public static final String JSON_PROPERTY_PUSH_NOTIFICATIONS_ENABLED = "pushNotificationsEnabled";
	@JsonProperty(JSON_PROPERTY_PUSH_NOTIFICATIONS_ENABLED)
	private Boolean pushNotificationsEnabled;

	public static final String JSON_PROPERTY_HAS_ACTIVE_AUTH_SESSION = "hasActiveAuthSession";
	@JsonProperty(JSON_PROPERTY_HAS_ACTIVE_AUTH_SESSION)
	private Boolean hasActiveAuthSession;

	public static final String JSON_PROPERTY_ONLINE = "online";
	@JsonProperty(JSON_PROPERTY_ONLINE)
	private Boolean online;

	public static final String JSON_PROPERTY_HAS_PUSH_NOTIFICATION_TOKENS = "hasPushNotificationTokens";
	@JsonProperty(JSON_PROPERTY_HAS_PUSH_NOTIFICATION_TOKENS)
	private Boolean hasPushNotificationTokens;

	public static final String JSON_PROPERTY_CURRENT_DEVICE = "currentDevice";
	@JsonProperty(JSON_PROPERTY_CURRENT_DEVICE)
	private Boolean currentDevice;

	public static final String JSON_PROPERTY_BOUND = "bound";
	@JsonProperty(JSON_PROPERTY_BOUND)
	private Boolean bound;

	public static final String JSON_PROPERTY_BOUND_TIMESTAMP = "boundTimestamp";
	@JsonProperty(JSON_PROPERTY_BOUND_TIMESTAMP)
	private Long boundTimestamp;

	public static final String JSON_PROPERTY_BINDING_ID = "bindingId";
	@JsonProperty(JSON_PROPERTY_BINDING_ID)
	private String bindingId;

	public DeviceInfoData $type(TypeEnum $type) {
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

	public DeviceInfoData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique ID of the entity. When creating an entity, this property can be omitted; it&#39;s generated by the server.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique ID of the entity. When creating an entity, this property can be omitted; it's generated by the server.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DeviceInfoData creationTimestamp(Long creationTimestamp) {
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

	public DeviceInfoData modificationTimestamp(Long modificationTimestamp) {
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

	public DeviceInfoData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It is filled by the Unblu server with the account ID of the
	 * user currently logged in. When editing an entity, you must include the account ID.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It is filled by the Unblu server with the account ID of the user currently logged in. When editing an entity, you must include the account ID.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public DeviceInfoData osName(String osName) {
		this.osName = osName;
		return this;
	}

	/**
	 * Name of the operating system the device runs on.
	 * 
	 * @return osName
	 **/
	@ApiModelProperty(value = "Name of the operating system the device runs on.")
	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public DeviceInfoData osVersion(String osVersion) {
		this.osVersion = osVersion;
		return this;
	}

	/**
	 * Version of the operating system, null if it is unknown.
	 * 
	 * @return osVersion
	 **/
	@ApiModelProperty(value = "Version of the operating system, null if it is unknown.")
	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public DeviceInfoData browserName(String browserName) {
		this.browserName = browserName;
		return this;
	}

	/**
	 * Name of the browser running on the device, for example \&quot;Chrome\&quot;. \&quot;Mobile SDK\&quot; for Mobile SDK
	 * 
	 * @return browserName
	 **/
	@ApiModelProperty(value = "Name of the browser running on the device, for example \"Chrome\". \"Mobile SDK\" for Mobile SDK")
	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public DeviceInfoData browserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
		return this;
	}

	/**
	 * Version of the browser or mobile SDK.
	 * 
	 * @return browserVersion
	 **/
	@ApiModelProperty(value = "Version of the browser or mobile SDK.")
	public String getBrowserVersion() {
		return browserVersion;
	}

	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}

	public DeviceInfoData type(EDeviceType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EDeviceType getType() {
		return type;
	}

	public void setType(EDeviceType type) {
		this.type = type;
	}

	public DeviceInfoData ownerPersonId(String ownerPersonId) {
		this.ownerPersonId = ownerPersonId;
		return this;
	}

	/**
	 * ID of the person that owns this device.
	 * 
	 * @return ownerPersonId
	 **/
	@ApiModelProperty(value = "ID of the person that owns this device.")
	public String getOwnerPersonId() {
		return ownerPersonId;
	}

	public void setOwnerPersonId(String ownerPersonId) {
		this.ownerPersonId = ownerPersonId;
	}

	public DeviceInfoData lastSeen(Long lastSeen) {
		this.lastSeen = lastSeen;
		return this;
	}

	/**
	 * Unix timestamp in milliseconds of when the device was last seen.
	 * 
	 * @return lastSeen
	 **/
	@ApiModelProperty(value = "Unix timestamp in milliseconds of when the device was last seen.")
	public Long getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(Long lastSeen) {
		this.lastSeen = lastSeen;
	}

	public DeviceInfoData pushNotificationsEnabled(Boolean pushNotificationsEnabled) {
		this.pushNotificationsEnabled = pushNotificationsEnabled;
		return this;
	}

	/**
	 * Whether push notifications are enabled in Unblu for this device.
	 * 
	 * @return pushNotificationsEnabled
	 **/
	@ApiModelProperty(value = "Whether push notifications are enabled in Unblu for this device.")
	public Boolean isPushNotificationsEnabled() {
		return pushNotificationsEnabled;
	}

	public void setPushNotificationsEnabled(Boolean pushNotificationsEnabled) {
		this.pushNotificationsEnabled = pushNotificationsEnabled;
	}

	public DeviceInfoData hasActiveAuthSession(Boolean hasActiveAuthSession) {
		this.hasActiveAuthSession = hasActiveAuthSession;
		return this;
	}

	/**
	 * Whether the device currently has an active authentication session, that is, whether the owner is signed in to Unblu on the device.
	 * 
	 * @return hasActiveAuthSession
	 **/
	@ApiModelProperty(value = "Whether the device currently has an active authentication session, that is, whether the owner is signed in to Unblu on the device.")
	public Boolean isHasActiveAuthSession() {
		return hasActiveAuthSession;
	}

	public void setHasActiveAuthSession(Boolean hasActiveAuthSession) {
		this.hasActiveAuthSession = hasActiveAuthSession;
	}

	public DeviceInfoData online(Boolean online) {
		this.online = online;
		return this;
	}

	/**
	 * Whether the device currently has an active person presence, that is, whether the person is online in Unblu.
	 * 
	 * @return online
	 **/
	@ApiModelProperty(value = "Whether the device currently has an active person presence, that is, whether the person is online in Unblu.")
	public Boolean isOnline() {
		return online;
	}

	public void setOnline(Boolean online) {
		this.online = online;
	}

	public DeviceInfoData hasPushNotificationTokens(Boolean hasPushNotificationTokens) {
		this.hasPushNotificationTokens = hasPushNotificationTokens;
		return this;
	}

	/**
	 * Whether the device has at least one push notification token registered (mobile push, PushKit, or web push).
	 * 
	 * @return hasPushNotificationTokens
	 **/
	@ApiModelProperty(value = "Whether the device has at least one push notification token registered (mobile push, PushKit, or web push).")
	public Boolean isHasPushNotificationTokens() {
		return hasPushNotificationTokens;
	}

	public void setHasPushNotificationTokens(Boolean hasPushNotificationTokens) {
		this.hasPushNotificationTokens = hasPushNotificationTokens;
	}

	public DeviceInfoData currentDevice(Boolean currentDevice) {
		this.currentDevice = currentDevice;
		return this;
	}

	/**
	 * Whether this device is the one the current request is being made from.
	 * 
	 * @return currentDevice
	 **/
	@ApiModelProperty(value = "Whether this device is the one the current request is being made from.")
	public Boolean isCurrentDevice() {
		return currentDevice;
	}

	public void setCurrentDevice(Boolean currentDevice) {
		this.currentDevice = currentDevice;
	}

	public DeviceInfoData bound(Boolean bound) {
		this.bound = bound;
		return this;
	}

	/**
	 * Whether this device has an active device binding. Only mobile devices can be bound; &#x60;false&#x60;/null for desktop and browser devices.
	 * 
	 * @return bound
	 **/
	@ApiModelProperty(value = "Whether this device has an active device binding. Only mobile devices can be bound; `false`/null for desktop and browser devices.")
	public Boolean isBound() {
		return bound;
	}

	public void setBound(Boolean bound) {
		this.bound = bound;
	}

	public DeviceInfoData boundTimestamp(Long boundTimestamp) {
		this.boundTimestamp = boundTimestamp;
		return this;
	}

	/**
	 * Unix timestamp in milliseconds of when the device&#39;s active binding was created, null if the device is not bound.
	 * 
	 * @return boundTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp in milliseconds of when the device's active binding was created, null if the device is not bound.")
	public Long getBoundTimestamp() {
		return boundTimestamp;
	}

	public void setBoundTimestamp(Long boundTimestamp) {
		this.boundTimestamp = boundTimestamp;
	}

	public DeviceInfoData bindingId(String bindingId) {
		this.bindingId = bindingId;
		return this;
	}

	/**
	 * ID of the device&#39;s active binding, null if the device is not bound. Used to revoke (unbind) the binding.
	 * 
	 * @return bindingId
	 **/
	@ApiModelProperty(value = "ID of the device's active binding, null if the device is not bound. Used to revoke (unbind) the binding.")
	public String getBindingId() {
		return bindingId;
	}

	public void setBindingId(String bindingId) {
		this.bindingId = bindingId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeviceInfoData deviceInfoData = (DeviceInfoData) o;
		return Objects.equals(this.$type, deviceInfoData.$type) &&
				Objects.equals(this.id, deviceInfoData.id) &&
				Objects.equals(this.creationTimestamp, deviceInfoData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, deviceInfoData.modificationTimestamp) &&
				Objects.equals(this.accountId, deviceInfoData.accountId) &&
				Objects.equals(this.osName, deviceInfoData.osName) &&
				Objects.equals(this.osVersion, deviceInfoData.osVersion) &&
				Objects.equals(this.browserName, deviceInfoData.browserName) &&
				Objects.equals(this.browserVersion, deviceInfoData.browserVersion) &&
				Objects.equals(this.type, deviceInfoData.type) &&
				Objects.equals(this.ownerPersonId, deviceInfoData.ownerPersonId) &&
				Objects.equals(this.lastSeen, deviceInfoData.lastSeen) &&
				Objects.equals(this.pushNotificationsEnabled, deviceInfoData.pushNotificationsEnabled) &&
				Objects.equals(this.hasActiveAuthSession, deviceInfoData.hasActiveAuthSession) &&
				Objects.equals(this.online, deviceInfoData.online) &&
				Objects.equals(this.hasPushNotificationTokens, deviceInfoData.hasPushNotificationTokens) &&
				Objects.equals(this.currentDevice, deviceInfoData.currentDevice) &&
				Objects.equals(this.bound, deviceInfoData.bound) &&
				Objects.equals(this.boundTimestamp, deviceInfoData.boundTimestamp) &&
				Objects.equals(this.bindingId, deviceInfoData.bindingId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, accountId, osName, osVersion, browserName, browserVersion, type, ownerPersonId, lastSeen, pushNotificationsEnabled, hasActiveAuthSession, online, hasPushNotificationTokens, currentDevice, bound, boundTimestamp, bindingId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeviceInfoData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
		sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
		sb.append("    browserName: ").append(toIndentedString(browserName)).append("\n");
		sb.append("    browserVersion: ").append(toIndentedString(browserVersion)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    ownerPersonId: ").append(toIndentedString(ownerPersonId)).append("\n");
		sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
		sb.append("    pushNotificationsEnabled: ").append(toIndentedString(pushNotificationsEnabled)).append("\n");
		sb.append("    hasActiveAuthSession: ").append(toIndentedString(hasActiveAuthSession)).append("\n");
		sb.append("    online: ").append(toIndentedString(online)).append("\n");
		sb.append("    hasPushNotificationTokens: ").append(toIndentedString(hasPushNotificationTokens)).append("\n");
		sb.append("    currentDevice: ").append(toIndentedString(currentDevice)).append("\n");
		sb.append("    bound: ").append(toIndentedString(bound)).append("\n");
		sb.append("    boundTimestamp: ").append(toIndentedString(boundTimestamp)).append("\n");
		sb.append("    bindingId: ").append(toIndentedString(bindingId)).append("\n");
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
