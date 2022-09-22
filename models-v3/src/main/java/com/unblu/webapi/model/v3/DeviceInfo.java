
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
 * Model of a device (os, browser, etc) This is the representation of a physical device which may browsers (desktop and mobile) if accessed via the website or
 * actual devices if accessed via the unblu MobileSDK
 */
@ApiModel(description = "Model of a device (os, browser, etc) This is the representation of a physical device which may browsers (desktop and mobile) if accessed via the website or actual devices if accessed via the unblu MobileSDK")

@JsonPropertyOrder({
	DeviceInfo.JSON_PROPERTY_$_TYPE,
	DeviceInfo.JSON_PROPERTY_ID,
	DeviceInfo.JSON_PROPERTY_CREATION_TIMESTAMP,
	DeviceInfo.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	DeviceInfo.JSON_PROPERTY_ACCOUNT_ID,
	DeviceInfo.JSON_PROPERTY_OS_NAME,
	DeviceInfo.JSON_PROPERTY_OS_VERSION,
	DeviceInfo.JSON_PROPERTY_BROWSER_NAME,
	DeviceInfo.JSON_PROPERTY_BROWSER_VERSION,
	DeviceInfo.JSON_PROPERTY_USER_AGENT,
	DeviceInfo.JSON_PROPERTY_SCREEN_WIDTH,
	DeviceInfo.JSON_PROPERTY_SCREEN_HEIGHT,
	DeviceInfo.JSON_PROPERTY_SCREEN_PIXEL_RATIO,
	DeviceInfo.JSON_PROPERTY_TYPE,
	DeviceInfo.JSON_PROPERTY_IDENTIFIER,
	DeviceInfo.JSON_PROPERTY_IDENTIFIER_SOURCE,
	DeviceInfo.JSON_PROPERTY_PUSH_TOKEN,
	DeviceInfo.JSON_PROPERTY_OWNER_PERSON_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DeviceInfo {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DEVICEINFO("DeviceInfo");

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
			return TypeEnum.DEVICEINFO;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DEVICEINFO;

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

	public static final String JSON_PROPERTY_USER_AGENT = "userAgent";
	@JsonProperty(JSON_PROPERTY_USER_AGENT)
	private String userAgent;

	public static final String JSON_PROPERTY_SCREEN_WIDTH = "screenWidth";
	@JsonProperty(JSON_PROPERTY_SCREEN_WIDTH)
	private Integer screenWidth;

	public static final String JSON_PROPERTY_SCREEN_HEIGHT = "screenHeight";
	@JsonProperty(JSON_PROPERTY_SCREEN_HEIGHT)
	private Integer screenHeight;

	public static final String JSON_PROPERTY_SCREEN_PIXEL_RATIO = "screenPixelRatio";
	@JsonProperty(JSON_PROPERTY_SCREEN_PIXEL_RATIO)
	private Float screenPixelRatio;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EDeviceType type;

	public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
	@JsonProperty(JSON_PROPERTY_IDENTIFIER)
	private String identifier;

	public static final String JSON_PROPERTY_IDENTIFIER_SOURCE = "identifierSource";
	@JsonProperty(JSON_PROPERTY_IDENTIFIER_SOURCE)
	private EIdentifierSource identifierSource;

	public static final String JSON_PROPERTY_PUSH_TOKEN = "pushToken";
	@JsonProperty(JSON_PROPERTY_PUSH_TOKEN)
	private String pushToken;

	public static final String JSON_PROPERTY_OWNER_PERSON_ID = "ownerPersonId";
	@JsonProperty(JSON_PROPERTY_OWNER_PERSON_ID)
	private String ownerPersonId;

	public DeviceInfo $type(TypeEnum $type) {
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

	public DeviceInfo id(String id) {
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

	public DeviceInfo creationTimestamp(Long creationTimestamp) {
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

	public DeviceInfo modificationTimestamp(Long modificationTimestamp) {
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

	public DeviceInfo accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Account id to which an entity belongs to. When creating an entity, the accountId can be omitted, as it will be filled by the server automatically with the
	 * account of the currently logged in user. When editing an entity, the accountId must be send.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "Account id to which an entity belongs to. When creating an entity, the accountId can be omitted, as it will be filled by the server automatically with the account of the currently logged in user. When editing an entity, the accountId must be send.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public DeviceInfo osName(String osName) {
		this.osName = osName;
		return this;
	}

	/**
	 * Operation system name
	 * 
	 * @return osName
	 **/
	@ApiModelProperty(value = "Operation system name")
	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public DeviceInfo osVersion(String osVersion) {
		this.osVersion = osVersion;
		return this;
	}

	/**
	 * Operation system version
	 * 
	 * @return osVersion
	 **/
	@ApiModelProperty(value = "Operation system version")
	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public DeviceInfo browserName(String browserName) {
		this.browserName = browserName;
		return this;
	}

	/**
	 * Browser name
	 * 
	 * @return browserName
	 **/
	@ApiModelProperty(value = "Browser name")
	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public DeviceInfo browserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
		return this;
	}

	/**
	 * Browser version
	 * 
	 * @return browserVersion
	 **/
	@ApiModelProperty(value = "Browser version")
	public String getBrowserVersion() {
		return browserVersion;
	}

	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}

	public DeviceInfo userAgent(String userAgent) {
		this.userAgent = userAgent;
		return this;
	}

	/**
	 * Original user agent string from the browser
	 * 
	 * @return userAgent
	 **/
	@ApiModelProperty(value = "Original user agent string from the browser")
	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public DeviceInfo screenWidth(Integer screenWidth) {
		this.screenWidth = screenWidth;
		return this;
	}

	/**
	 * Screen width of the device
	 * 
	 * @return screenWidth
	 **/
	@ApiModelProperty(value = "Screen width of the device")
	public Integer getScreenWidth() {
		return screenWidth;
	}

	public void setScreenWidth(Integer screenWidth) {
		this.screenWidth = screenWidth;
	}

	public DeviceInfo screenHeight(Integer screenHeight) {
		this.screenHeight = screenHeight;
		return this;
	}

	/**
	 * Screen height of the device
	 * 
	 * @return screenHeight
	 **/
	@ApiModelProperty(value = "Screen height of the device")
	public Integer getScreenHeight() {
		return screenHeight;
	}

	public void setScreenHeight(Integer screenHeight) {
		this.screenHeight = screenHeight;
	}

	public DeviceInfo screenPixelRatio(Float screenPixelRatio) {
		this.screenPixelRatio = screenPixelRatio;
		return this;
	}

	/**
	 * Screen pixel ratio of the device
	 * 
	 * @return screenPixelRatio
	 **/
	@ApiModelProperty(value = "Screen pixel ratio of the device")
	public Float getScreenPixelRatio() {
		return screenPixelRatio;
	}

	public void setScreenPixelRatio(Float screenPixelRatio) {
		this.screenPixelRatio = screenPixelRatio;
	}

	public DeviceInfo type(EDeviceType type) {
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

	public DeviceInfo identifier(String identifier) {
		this.identifier = identifier;
		return this;
	}

	/**
	 * Device identifier (via fingerprinting in browser or device id for MobileSDK)
	 * 
	 * @return identifier
	 **/
	@ApiModelProperty(value = "Device identifier (via fingerprinting in browser or device id for MobileSDK)")
	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public DeviceInfo identifierSource(EIdentifierSource identifierSource) {
		this.identifierSource = identifierSource;
		return this;
	}

	/**
	 * Get identifierSource
	 * 
	 * @return identifierSource
	 **/
	@ApiModelProperty(value = "")
	public EIdentifierSource getIdentifierSource() {
		return identifierSource;
	}

	public void setIdentifierSource(EIdentifierSource identifierSource) {
		this.identifierSource = identifierSource;
	}

	public DeviceInfo pushToken(String pushToken) {
		this.pushToken = pushToken;
		return this;
	}

	/**
	 * Token for pushing via FireBase.
	 * 
	 * @return pushToken
	 **/
	@ApiModelProperty(value = "Token for pushing via FireBase.")
	public String getPushToken() {
		return pushToken;
	}

	public void setPushToken(String pushToken) {
		this.pushToken = pushToken;
	}

	public DeviceInfo ownerPersonId(String ownerPersonId) {
		this.ownerPersonId = ownerPersonId;
		return this;
	}

	/**
	 * The person id of the device info owner
	 * 
	 * @return ownerPersonId
	 **/
	@ApiModelProperty(value = "The person id of the device info owner")
	public String getOwnerPersonId() {
		return ownerPersonId;
	}

	public void setOwnerPersonId(String ownerPersonId) {
		this.ownerPersonId = ownerPersonId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeviceInfo deviceInfo = (DeviceInfo) o;
		return Objects.equals(this.$type, deviceInfo.$type) &&
				Objects.equals(this.id, deviceInfo.id) &&
				Objects.equals(this.creationTimestamp, deviceInfo.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, deviceInfo.modificationTimestamp) &&
				Objects.equals(this.accountId, deviceInfo.accountId) &&
				Objects.equals(this.osName, deviceInfo.osName) &&
				Objects.equals(this.osVersion, deviceInfo.osVersion) &&
				Objects.equals(this.browserName, deviceInfo.browserName) &&
				Objects.equals(this.browserVersion, deviceInfo.browserVersion) &&
				Objects.equals(this.userAgent, deviceInfo.userAgent) &&
				Objects.equals(this.screenWidth, deviceInfo.screenWidth) &&
				Objects.equals(this.screenHeight, deviceInfo.screenHeight) &&
				Objects.equals(this.screenPixelRatio, deviceInfo.screenPixelRatio) &&
				Objects.equals(this.type, deviceInfo.type) &&
				Objects.equals(this.identifier, deviceInfo.identifier) &&
				Objects.equals(this.identifierSource, deviceInfo.identifierSource) &&
				Objects.equals(this.pushToken, deviceInfo.pushToken) &&
				Objects.equals(this.ownerPersonId, deviceInfo.ownerPersonId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, accountId, osName, osVersion, browserName, browserVersion, userAgent, screenWidth, screenHeight, screenPixelRatio, type, identifier, identifierSource, pushToken, ownerPersonId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeviceInfo {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
		sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
		sb.append("    browserName: ").append(toIndentedString(browserName)).append("\n");
		sb.append("    browserVersion: ").append(toIndentedString(browserVersion)).append("\n");
		sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
		sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
		sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
		sb.append("    screenPixelRatio: ").append(toIndentedString(screenPixelRatio)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
		sb.append("    identifierSource: ").append(toIndentedString(identifierSource)).append("\n");
		sb.append("    pushToken: ").append(toIndentedString(pushToken)).append("\n");
		sb.append("    ownerPersonId: ").append(toIndentedString(ownerPersonId)).append("\n");
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
