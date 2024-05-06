
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.List;
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
 * Model of a person label.
 */
@ApiModel(description = "Model of a person label.")

@JsonPropertyOrder({
	PersonLabel.JSON_PROPERTY_$_TYPE,
	PersonLabel.JSON_PROPERTY_ID,
	PersonLabel.JSON_PROPERTY_CREATION_TIMESTAMP,
	PersonLabel.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	PersonLabel.JSON_PROPERTY_VERSION,
	PersonLabel.JSON_PROPERTY_ACCOUNT_ID,
	PersonLabel.JSON_PROPERTY_NAME,
	PersonLabel.JSON_PROPERTY_DESCRIPTION,
	PersonLabel.JSON_PROPERTY_COLOR,
	PersonLabel.JSON_PROPERTY_SETTABLE_ON,
	PersonLabel.JSON_PROPERTY_READABLE_BY_ROLES,
	PersonLabel.JSON_PROPERTY_SETTABLE_BY_ROLES,
	PersonLabel.JSON_PROPERTY_DISPLAYED_TO_ROLES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PersonLabel {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		PERSONLABEL("PersonLabel");

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
			return TypeEnum.PERSONLABEL;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.PERSONLABEL;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_VERSION = "version";
	@JsonProperty(JSON_PROPERTY_VERSION)
	private Long version;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public static final String JSON_PROPERTY_COLOR = "color";
	@JsonProperty(JSON_PROPERTY_COLOR)
	private String color;

	public static final String JSON_PROPERTY_SETTABLE_ON = "settableOn";
	@JsonProperty(JSON_PROPERTY_SETTABLE_ON)
	private List<EPersonLabelTargetType> settableOn = null;

	public static final String JSON_PROPERTY_READABLE_BY_ROLES = "readableByRoles";
	@JsonProperty(JSON_PROPERTY_READABLE_BY_ROLES)
	private List<EPersonLabelManagementRole> readableByRoles = null;

	public static final String JSON_PROPERTY_SETTABLE_BY_ROLES = "settableByRoles";
	@JsonProperty(JSON_PROPERTY_SETTABLE_BY_ROLES)
	private List<EPersonLabelManagementRole> settableByRoles = null;

	public static final String JSON_PROPERTY_DISPLAYED_TO_ROLES = "displayedToRoles";
	@JsonProperty(JSON_PROPERTY_DISPLAYED_TO_ROLES)
	private List<EPersonLabelManagementRole> displayedToRoles = null;

	public PersonLabel $type(TypeEnum $type) {
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

	public PersonLabel id(String id) {
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

	public PersonLabel creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be
	 * omitted. Note: If you set this property, Unblu returns the same value, but it isn&#39;t written to storage and doesn&#39;t affect data consistency..
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be omitted. Note: If you set this property, Unblu returns the same value, but it isn't written to storage and doesn't affect data consistency..")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public PersonLabel modificationTimestamp(Long modificationTimestamp) {
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

	public PersonLabel version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * Version of the entity. Will be incremented on each change. New updates must always be based on the newest version, if not updates will be rejected. When
	 * creating an object, the version can be omitted.
	 * 
	 * @return version
	 **/
	@ApiModelProperty(value = "Version of the entity. Will be incremented on each change. New updates must always be based on the newest version, if not updates will be rejected. When creating an object, the version can be omitted.")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public PersonLabel accountId(String accountId) {
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

	public PersonLabel name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the person label. Maximum length of 250 characters. Mandatory. &lt;br&gt; If the label is a scoped label, the name consists of the scope name and the
	 * value of this particular label, separated by \&quot;::\&quot;, for example \&quot;upsell potential::high\&quot;.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the person label. Maximum length of 250 characters. Mandatory. <br> If the label is a scoped label, the name consists of the scope name and the value of this particular label, separated by \"::\", for example \"upsell potential::high\".")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonLabel description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the person label. Maximum length of 500 characters. Can be omitted.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the person label. Maximum length of 500 characters. Can be omitted.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PersonLabel color(String color) {
		this.color = color;
		return this;
	}

	/**
	 * Color of the person label, specified in a format compatible with CSS. Maximum length of 50 characters. Mandatory.
	 * 
	 * @return color
	 **/
	@ApiModelProperty(value = "Color of the person label, specified in a format compatible with CSS. Maximum length of 50 characters. Mandatory.")
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public PersonLabel settableOn(List<EPersonLabelTargetType> settableOn) {
		this.settableOn = settableOn;
		return this;
	}

	public PersonLabel addSettableOnItem(EPersonLabelTargetType settableOnItem) {
		if (this.settableOn == null) {
			this.settableOn = new ArrayList<>();
		}
		this.settableOn.add(settableOnItem);
		return this;
	}

	/**
	 * The person types the label may be set on
	 * 
	 * @return settableOn
	 **/
	@ApiModelProperty(value = "The person types the label may be set on")
	public List<EPersonLabelTargetType> getSettableOn() {
		return settableOn;
	}

	public void setSettableOn(List<EPersonLabelTargetType> settableOn) {
		this.settableOn = settableOn;
	}

	public PersonLabel readableByRoles(List<EPersonLabelManagementRole> readableByRoles) {
		this.readableByRoles = readableByRoles;
		return this;
	}

	public PersonLabel addReadableByRolesItem(EPersonLabelManagementRole readableByRolesItem) {
		if (this.readableByRoles == null) {
			this.readableByRoles = new ArrayList<>();
		}
		this.readableByRoles.add(readableByRolesItem);
		return this;
	}

	/**
	 * The roles that can read the label on a person via API. If this is not set only admins are able to read this label.
	 * 
	 * @return readableByRoles
	 **/
	@ApiModelProperty(value = "The roles that can read the label on a person via API. If this is not set only admins are able to read this label.")
	public List<EPersonLabelManagementRole> getReadableByRoles() {
		return readableByRoles;
	}

	public void setReadableByRoles(List<EPersonLabelManagementRole> readableByRoles) {
		this.readableByRoles = readableByRoles;
	}

	public PersonLabel settableByRoles(List<EPersonLabelManagementRole> settableByRoles) {
		this.settableByRoles = settableByRoles;
		return this;
	}

	public PersonLabel addSettableByRolesItem(EPersonLabelManagementRole settableByRolesItem) {
		if (this.settableByRoles == null) {
			this.settableByRoles = new ArrayList<>();
		}
		this.settableByRoles.add(settableByRolesItem);
		return this;
	}

	/**
	 * The roles that can set the label on a person. If this is not set only admins are able to set this label.
	 * 
	 * @return settableByRoles
	 **/
	@ApiModelProperty(value = "The roles that can set the label on a person. If this is not set only admins are able to set this label.")
	public List<EPersonLabelManagementRole> getSettableByRoles() {
		return settableByRoles;
	}

	public void setSettableByRoles(List<EPersonLabelManagementRole> settableByRoles) {
		this.settableByRoles = settableByRoles;
	}

	public PersonLabel displayedToRoles(List<EPersonLabelManagementRole> displayedToRoles) {
		this.displayedToRoles = displayedToRoles;
		return this;
	}

	public PersonLabel addDisplayedToRolesItem(EPersonLabelManagementRole displayedToRolesItem) {
		if (this.displayedToRoles == null) {
			this.displayedToRoles = new ArrayList<>();
		}
		this.displayedToRoles.add(displayedToRolesItem);
		return this;
	}

	/**
	 * The roles for which the label is displayed to in the UIs. If this is not set only admins are able to see this label in the UI.
	 * 
	 * @return displayedToRoles
	 **/
	@ApiModelProperty(value = "The roles for which the label is displayed to in the UIs. If this is not set only admins are able to see this label in the UI.")
	public List<EPersonLabelManagementRole> getDisplayedToRoles() {
		return displayedToRoles;
	}

	public void setDisplayedToRoles(List<EPersonLabelManagementRole> displayedToRoles) {
		this.displayedToRoles = displayedToRoles;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonLabel personLabel = (PersonLabel) o;
		return Objects.equals(this.$type, personLabel.$type) &&
				Objects.equals(this.id, personLabel.id) &&
				Objects.equals(this.creationTimestamp, personLabel.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, personLabel.modificationTimestamp) &&
				Objects.equals(this.version, personLabel.version) &&
				Objects.equals(this.accountId, personLabel.accountId) &&
				Objects.equals(this.name, personLabel.name) &&
				Objects.equals(this.description, personLabel.description) &&
				Objects.equals(this.color, personLabel.color) &&
				Objects.equals(this.settableOn, personLabel.settableOn) &&
				Objects.equals(this.readableByRoles, personLabel.readableByRoles) &&
				Objects.equals(this.settableByRoles, personLabel.settableByRoles) &&
				Objects.equals(this.displayedToRoles, personLabel.displayedToRoles);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, description, color, settableOn, readableByRoles, settableByRoles, displayedToRoles);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonLabel {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    color: ").append(toIndentedString(color)).append("\n");
		sb.append("    settableOn: ").append(toIndentedString(settableOn)).append("\n");
		sb.append("    readableByRoles: ").append(toIndentedString(readableByRoles)).append("\n");
		sb.append("    settableByRoles: ").append(toIndentedString(settableByRoles)).append("\n");
		sb.append("    displayedToRoles: ").append(toIndentedString(displayedToRoles)).append("\n");
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