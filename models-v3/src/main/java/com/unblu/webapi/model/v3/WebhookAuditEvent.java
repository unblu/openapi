
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
 * Event sent when a new audit entry is created in &#x60;PersistenceAuditListener&#x60;.
 */
@ApiModel(description = "Event sent when a new audit entry is created in `PersistenceAuditListener`.")

@JsonPropertyOrder({
	WebhookAuditEvent.JSON_PROPERTY_$_TYPE,
	WebhookAuditEvent.JSON_PROPERTY_TIMESTAMP,
	WebhookAuditEvent.JSON_PROPERTY_EVENT_TYPE,
	WebhookAuditEvent.JSON_PROPERTY_ACCOUNT_ID,
	WebhookAuditEvent.JSON_PROPERTY_ENTITY_TYPE,
	WebhookAuditEvent.JSON_PROPERTY_ENTITY_ID,
	WebhookAuditEvent.JSON_PROPERTY_CHANGE_TYPE,
	WebhookAuditEvent.JSON_PROPERTY_AUDIT_ENTITY,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WebhookAuditEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WEBHOOKAUDITEVENT("WebhookAuditEvent");

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
			return TypeEnum.WEBHOOKAUDITEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WEBHOOKAUDITEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
	@JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
	private String entityType;

	public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
	@JsonProperty(JSON_PROPERTY_ENTITY_ID)
	private String entityId;

	public static final String JSON_PROPERTY_CHANGE_TYPE = "changeType";
	@JsonProperty(JSON_PROPERTY_CHANGE_TYPE)
	private String changeType;

	public static final String JSON_PROPERTY_AUDIT_ENTITY = "auditEntity";
	@JsonProperty(JSON_PROPERTY_AUDIT_ENTITY)
	private String auditEntity;

	public WebhookAuditEvent $type(TypeEnum $type) {
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

	public WebhookAuditEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The time (Unix time in ms) when the event was generated
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The time (Unix time in ms) when the event was generated")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public WebhookAuditEvent eventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * The name of the event
	 * 
	 * @return eventType
	 **/
	@ApiModelProperty(value = "The name of the event")
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public WebhookAuditEvent accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public WebhookAuditEvent entityType(String entityType) {
		this.entityType = entityType;
		return this;
	}

	/**
	 * Get entityType
	 * 
	 * @return entityType
	 **/
	@ApiModelProperty(value = "")
	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public WebhookAuditEvent entityId(String entityId) {
		this.entityId = entityId;
		return this;
	}

	/**
	 * Get entityId
	 * 
	 * @return entityId
	 **/
	@ApiModelProperty(value = "")
	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public WebhookAuditEvent changeType(String changeType) {
		this.changeType = changeType;
		return this;
	}

	/**
	 * Get changeType
	 * 
	 * @return changeType
	 **/
	@ApiModelProperty(value = "")
	public String getChangeType() {
		return changeType;
	}

	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public WebhookAuditEvent auditEntity(String auditEntity) {
		this.auditEntity = auditEntity;
		return this;
	}

	/**
	 * Get auditEntity
	 * 
	 * @return auditEntity
	 **/
	@ApiModelProperty(value = "")
	public String getAuditEntity() {
		return auditEntity;
	}

	public void setAuditEntity(String auditEntity) {
		this.auditEntity = auditEntity;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WebhookAuditEvent webhookAuditEvent = (WebhookAuditEvent) o;
		return Objects.equals(this.$type, webhookAuditEvent.$type) &&
				Objects.equals(this.timestamp, webhookAuditEvent.timestamp) &&
				Objects.equals(this.eventType, webhookAuditEvent.eventType) &&
				Objects.equals(this.accountId, webhookAuditEvent.accountId) &&
				Objects.equals(this.entityType, webhookAuditEvent.entityType) &&
				Objects.equals(this.entityId, webhookAuditEvent.entityId) &&
				Objects.equals(this.changeType, webhookAuditEvent.changeType) &&
				Objects.equals(this.auditEntity, webhookAuditEvent.auditEntity);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, entityType, entityId, changeType, auditEntity);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WebhookAuditEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
		sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
		sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
		sb.append("    auditEntity: ").append(toIndentedString(auditEntity)).append("\n");
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
