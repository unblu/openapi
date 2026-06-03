
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
 * Data model object for a branch
 */
@ApiModel(description = "Data model object for a branch")

@JsonPropertyOrder({
	BranchData.JSON_PROPERTY_$_TYPE,
	BranchData.JSON_PROPERTY_ID,
	BranchData.JSON_PROPERTY_CREATION_TIMESTAMP,
	BranchData.JSON_PROPERTY_ACCOUNT_ID,
	BranchData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	BranchData.JSON_PROPERTY_VERSION,
	BranchData.JSON_PROPERTY_NAME,
	BranchData.JSON_PROPERTY_DESCRIPTION,
	BranchData.JSON_PROPERTY_STREET_ADDRESS,
	BranchData.JSON_PROPERTY_ZIP,
	BranchData.JSON_PROPERTY_CITY,
	BranchData.JSON_PROPERTY_REGION,
	BranchData.JSON_PROPERTY_COUNTRY,
	BranchData.JSON_PROPERTY_TRANSLATIONS,
	BranchData.JSON_PROPERTY_STATE,
	BranchData.JSON_PROPERTY_FLOOR_PLAN_IMAGE,
	BranchData.JSON_PROPERTY_WIDTH,
	BranchData.JSON_PROPERTY_HEIGHT,
	BranchData.JSON_PROPERTY_DISPLAY_LABELS_ON_FLOOR_PLAN,
	BranchData.JSON_PROPERTY_DEVICE_ENDPOINT_URL,
	BranchData.JSON_PROPERTY_BRANCH_CLIENTS,
	BranchData.JSON_PROPERTY_BRANCH_DEVICES,
	BranchData.JSON_PROPERTY_BRANCH_TEXT_BOXES,
	BranchData.JSON_PROPERTY_BRANCH_LINKS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BranchData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BRANCHDATA("BranchData");

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
			return TypeEnum.BRANCHDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BRANCHDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

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

	public static final String JSON_PROPERTY_STREET_ADDRESS = "streetAddress";
	@JsonProperty(JSON_PROPERTY_STREET_ADDRESS)
	private String streetAddress;

	public static final String JSON_PROPERTY_ZIP = "zip";
	@JsonProperty(JSON_PROPERTY_ZIP)
	private String zip;

	public static final String JSON_PROPERTY_CITY = "city";
	@JsonProperty(JSON_PROPERTY_CITY)
	private String city;

	public static final String JSON_PROPERTY_REGION = "region";
	@JsonProperty(JSON_PROPERTY_REGION)
	private String region;

	public static final String JSON_PROPERTY_COUNTRY = "country";
	@JsonProperty(JSON_PROPERTY_COUNTRY)
	private String country;

	public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
	@JsonProperty(JSON_PROPERTY_TRANSLATIONS)
	private Map<String, BranchTranslation> translations = null;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private EBranchState state;

	public static final String JSON_PROPERTY_FLOOR_PLAN_IMAGE = "floorPlanImage";
	@JsonProperty(JSON_PROPERTY_FLOOR_PLAN_IMAGE)
	private ExpandableField<Image> floorPlanImage = null;

	public static final String JSON_PROPERTY_WIDTH = "width";
	@JsonProperty(JSON_PROPERTY_WIDTH)
	private Integer width;

	public static final String JSON_PROPERTY_HEIGHT = "height";
	@JsonProperty(JSON_PROPERTY_HEIGHT)
	private Integer height;

	public static final String JSON_PROPERTY_DISPLAY_LABELS_ON_FLOOR_PLAN = "displayLabelsOnFloorPlan";
	@JsonProperty(JSON_PROPERTY_DISPLAY_LABELS_ON_FLOOR_PLAN)
	private Boolean displayLabelsOnFloorPlan;

	public static final String JSON_PROPERTY_DEVICE_ENDPOINT_URL = "deviceEndpointUrl";
	@JsonProperty(JSON_PROPERTY_DEVICE_ENDPOINT_URL)
	private String deviceEndpointUrl;

	public static final String JSON_PROPERTY_BRANCH_CLIENTS = "branchClients";
	@JsonProperty(JSON_PROPERTY_BRANCH_CLIENTS)
	private List<BranchClientData> branchClients = null;

	public static final String JSON_PROPERTY_BRANCH_DEVICES = "branchDevices";
	@JsonProperty(JSON_PROPERTY_BRANCH_DEVICES)
	private List<BranchDeviceData> branchDevices = null;

	public static final String JSON_PROPERTY_BRANCH_TEXT_BOXES = "branchTextBoxes";
	@JsonProperty(JSON_PROPERTY_BRANCH_TEXT_BOXES)
	private List<BranchTextBoxData> branchTextBoxes = null;

	public static final String JSON_PROPERTY_BRANCH_LINKS = "branchLinks";
	@JsonProperty(JSON_PROPERTY_BRANCH_LINKS)
	private List<BranchLinkData> branchLinks = null;

	public BranchData $type(TypeEnum $type) {
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

	public BranchData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * ID of the branch
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "ID of the branch")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BranchData creationTimestamp(Long creationTimestamp) {
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

	public BranchData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Account ID the branch belongs to
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "Account ID the branch belongs to")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public BranchData modificationTimestamp(Long modificationTimestamp) {
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

	public BranchData version(Long version) {
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

	public BranchData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the branch. Maximum of 250 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the branch. Maximum of 250 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BranchData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the branch. Maximum of 500 characters. Optional.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the branch. Maximum of 500 characters. Optional.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BranchData streetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
		return this;
	}

	/**
	 * Street address including the street number. Maximum of 250 characters. Optional.
	 * 
	 * @return streetAddress
	 **/
	@ApiModelProperty(value = "Street address including the street number. Maximum of 250 characters. Optional.")
	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public BranchData zip(String zip) {
		this.zip = zip;
		return this;
	}

	/**
	 * Zip code. Maximum of 20 characters. Optional.
	 * 
	 * @return zip
	 **/
	@ApiModelProperty(value = "Zip code. Maximum of 20 characters. Optional.")
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public BranchData city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * City. Maximum of 250 characters. Optional.
	 * 
	 * @return city
	 **/
	@ApiModelProperty(value = "City. Maximum of 250 characters. Optional.")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public BranchData region(String region) {
		this.region = region;
		return this;
	}

	/**
	 * Region. Maximum of 250 characters. Optional.
	 * 
	 * @return region
	 **/
	@ApiModelProperty(value = "Region. Maximum of 250 characters. Optional.")
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public BranchData country(String country) {
		this.country = country;
		return this;
	}

	/**
	 * Country. Maximum of 250 characters. Optional.
	 * 
	 * @return country
	 **/
	@ApiModelProperty(value = "Country. Maximum of 250 characters. Optional.")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BranchData translations(Map<String, BranchTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public BranchData putTranslationsItem(String key, BranchTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A Map of localized versions of the name, description and info of the branch
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A Map of localized versions of the name, description and info of the branch")
	public Map<String, BranchTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, BranchTranslation> translations) {
		this.translations = translations;
	}

	public BranchData state(EBranchState state) {
		this.state = state;
		return this;
	}

	/**
	 * Get state
	 * 
	 * @return state
	 **/
	@ApiModelProperty(value = "")
	public EBranchState getState() {
		return state;
	}

	public void setState(EBranchState state) {
		this.state = state;
	}

	public BranchData floorPlanImage(ExpandableField<Image> floorPlanImage) {
		this.floorPlanImage = floorPlanImage;
		return this;
	}

	/**
	 * Image of the entity: ID that can be expanded.
	 * 
	 * @return floorPlanImage
	 **/
	@ApiModelProperty(value = "Image of the entity: ID that can be expanded.")
	public ExpandableField<Image> getFloorPlanImage() {
		return floorPlanImage;
	}

	public void setFloorPlanImage(ExpandableField<Image> floorPlanImage) {
		this.floorPlanImage = floorPlanImage;
	}

	public BranchData width(Integer width) {
		this.width = width;
		return this;
	}

	/**
	 * Width of the floor plan. Derived from the uploaded image if not set.
	 * 
	 * @return width
	 **/
	@ApiModelProperty(value = "Width of the floor plan. Derived from the uploaded image if not set.")
	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public BranchData height(Integer height) {
		this.height = height;
		return this;
	}

	/**
	 * Height of the floor plan. Derived from the uploaded image if not set.
	 * 
	 * @return height
	 **/
	@ApiModelProperty(value = "Height of the floor plan. Derived from the uploaded image if not set.")
	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public BranchData displayLabelsOnFloorPlan(Boolean displayLabelsOnFloorPlan) {
		this.displayLabelsOnFloorPlan = displayLabelsOnFloorPlan;
		return this;
	}

	/**
	 * Display the labels of branch elements inside the floor plan. False if not explicitly set.
	 * 
	 * @return displayLabelsOnFloorPlan
	 **/
	@ApiModelProperty(value = "Display the labels of branch elements inside the floor plan. False if not explicitly set.")
	public Boolean isDisplayLabelsOnFloorPlan() {
		return displayLabelsOnFloorPlan;
	}

	public void setDisplayLabelsOnFloorPlan(Boolean displayLabelsOnFloorPlan) {
		this.displayLabelsOnFloorPlan = displayLabelsOnFloorPlan;
	}

	public BranchData deviceEndpointUrl(String deviceEndpointUrl) {
		this.deviceEndpointUrl = deviceEndpointUrl;
		return this;
	}

	/**
	 * Base URL of the external device REST API (e.g. a WebIO relay) used to control door openers and status lamps on this branch. Optional.
	 * 
	 * @return deviceEndpointUrl
	 **/
	@ApiModelProperty(value = "Base URL of the external device REST API (e.g. a WebIO relay) used to control door openers and status lamps on this branch. Optional.")
	public String getDeviceEndpointUrl() {
		return deviceEndpointUrl;
	}

	public void setDeviceEndpointUrl(String deviceEndpointUrl) {
		this.deviceEndpointUrl = deviceEndpointUrl;
	}

	public BranchData branchClients(List<BranchClientData> branchClients) {
		this.branchClients = branchClients;
		return this;
	}

	public BranchData addBranchClientsItem(BranchClientData branchClientsItem) {
		if (this.branchClients == null) {
			this.branchClients = new ArrayList<>();
		}
		this.branchClients.add(branchClientsItem);
		return this;
	}

	/**
	 * List of all branch clients that are assigned to the branch
	 * 
	 * @return branchClients
	 **/
	@ApiModelProperty(value = "List of all branch clients that are assigned to the branch")
	public List<BranchClientData> getBranchClients() {
		return branchClients;
	}

	public void setBranchClients(List<BranchClientData> branchClients) {
		this.branchClients = branchClients;
	}

	public BranchData branchDevices(List<BranchDeviceData> branchDevices) {
		this.branchDevices = branchDevices;
		return this;
	}

	public BranchData addBranchDevicesItem(BranchDeviceData branchDevicesItem) {
		if (this.branchDevices == null) {
			this.branchDevices = new ArrayList<>();
		}
		this.branchDevices.add(branchDevicesItem);
		return this;
	}

	/**
	 * List of all branch devices that belong to the branch
	 * 
	 * @return branchDevices
	 **/
	@ApiModelProperty(value = "List of all branch devices that belong to the branch")
	public List<BranchDeviceData> getBranchDevices() {
		return branchDevices;
	}

	public void setBranchDevices(List<BranchDeviceData> branchDevices) {
		this.branchDevices = branchDevices;
	}

	public BranchData branchTextBoxes(List<BranchTextBoxData> branchTextBoxes) {
		this.branchTextBoxes = branchTextBoxes;
		return this;
	}

	public BranchData addBranchTextBoxesItem(BranchTextBoxData branchTextBoxesItem) {
		if (this.branchTextBoxes == null) {
			this.branchTextBoxes = new ArrayList<>();
		}
		this.branchTextBoxes.add(branchTextBoxesItem);
		return this;
	}

	/**
	 * List of all branch text boxes that belong to the branch
	 * 
	 * @return branchTextBoxes
	 **/
	@ApiModelProperty(value = "List of all branch text boxes that belong to the branch")
	public List<BranchTextBoxData> getBranchTextBoxes() {
		return branchTextBoxes;
	}

	public void setBranchTextBoxes(List<BranchTextBoxData> branchTextBoxes) {
		this.branchTextBoxes = branchTextBoxes;
	}

	public BranchData branchLinks(List<BranchLinkData> branchLinks) {
		this.branchLinks = branchLinks;
		return this;
	}

	public BranchData addBranchLinksItem(BranchLinkData branchLinksItem) {
		if (this.branchLinks == null) {
			this.branchLinks = new ArrayList<>();
		}
		this.branchLinks.add(branchLinksItem);
		return this;
	}

	/**
	 * List of all branch links that belong to the branch
	 * 
	 * @return branchLinks
	 **/
	@ApiModelProperty(value = "List of all branch links that belong to the branch")
	public List<BranchLinkData> getBranchLinks() {
		return branchLinks;
	}

	public void setBranchLinks(List<BranchLinkData> branchLinks) {
		this.branchLinks = branchLinks;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BranchData branchData = (BranchData) o;
		return Objects.equals(this.$type, branchData.$type) &&
				Objects.equals(this.id, branchData.id) &&
				Objects.equals(this.creationTimestamp, branchData.creationTimestamp) &&
				Objects.equals(this.accountId, branchData.accountId) &&
				Objects.equals(this.modificationTimestamp, branchData.modificationTimestamp) &&
				Objects.equals(this.version, branchData.version) &&
				Objects.equals(this.name, branchData.name) &&
				Objects.equals(this.description, branchData.description) &&
				Objects.equals(this.streetAddress, branchData.streetAddress) &&
				Objects.equals(this.zip, branchData.zip) &&
				Objects.equals(this.city, branchData.city) &&
				Objects.equals(this.region, branchData.region) &&
				Objects.equals(this.country, branchData.country) &&
				Objects.equals(this.translations, branchData.translations) &&
				Objects.equals(this.state, branchData.state) &&
				Objects.equals(this.floorPlanImage, branchData.floorPlanImage) &&
				Objects.equals(this.width, branchData.width) &&
				Objects.equals(this.height, branchData.height) &&
				Objects.equals(this.displayLabelsOnFloorPlan, branchData.displayLabelsOnFloorPlan) &&
				Objects.equals(this.deviceEndpointUrl, branchData.deviceEndpointUrl) &&
				Objects.equals(this.branchClients, branchData.branchClients) &&
				Objects.equals(this.branchDevices, branchData.branchDevices) &&
				Objects.equals(this.branchTextBoxes, branchData.branchTextBoxes) &&
				Objects.equals(this.branchLinks, branchData.branchLinks);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, accountId, modificationTimestamp, version, name, description, streetAddress, zip, city, region, country, translations, state, floorPlanImage, width, height, displayLabelsOnFloorPlan, deviceEndpointUrl, branchClients, branchDevices, branchTextBoxes, branchLinks);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BranchData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
		sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
		sb.append("    city: ").append(toIndentedString(city)).append("\n");
		sb.append("    region: ").append(toIndentedString(region)).append("\n");
		sb.append("    country: ").append(toIndentedString(country)).append("\n");
		sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    floorPlanImage: ").append(toIndentedString(floorPlanImage)).append("\n");
		sb.append("    width: ").append(toIndentedString(width)).append("\n");
		sb.append("    height: ").append(toIndentedString(height)).append("\n");
		sb.append("    displayLabelsOnFloorPlan: ").append(toIndentedString(displayLabelsOnFloorPlan)).append("\n");
		sb.append("    deviceEndpointUrl: ").append(toIndentedString(deviceEndpointUrl)).append("\n");
		sb.append("    branchClients: ").append(toIndentedString(branchClients)).append("\n");
		sb.append("    branchDevices: ").append(toIndentedString(branchDevices)).append("\n");
		sb.append("    branchTextBoxes: ").append(toIndentedString(branchTextBoxes)).append("\n");
		sb.append("    branchLinks: ").append(toIndentedString(branchLinks)).append("\n");
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
