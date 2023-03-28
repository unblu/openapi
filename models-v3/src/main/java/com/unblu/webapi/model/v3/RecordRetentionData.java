
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
 * Representation of account specific record retention data.
 */
@ApiModel(description = "Representation of account specific record retention data.")

@JsonPropertyOrder({
	RecordRetentionData.JSON_PROPERTY_$_TYPE,
	RecordRetentionData.JSON_PROPERTY_ACCOUNT_ID,
	RecordRetentionData.JSON_PROPERTY_RETENTION_INTERVAL_CONVERSATION_SECONDS,
	RecordRetentionData.JSON_PROPERTY_RETENTION_INTERVAL_PRESENCE_SECONDS,
	RecordRetentionData.JSON_PROPERTY_RETENTION_INTERVAL_WEBHOOK_CALL_LOG_SECONDS,
	RecordRetentionData.JSON_PROPERTY_RETENTION_INTERVAL_AUDIT_LOG_SECONDS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RecordRetentionData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		RECORDRETENTIONDATA("RecordRetentionData");

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
			return TypeEnum.RECORDRETENTIONDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.RECORDRETENTIONDATA;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_RETENTION_INTERVAL_CONVERSATION_SECONDS = "retentionIntervalConversationSeconds";
	@JsonProperty(JSON_PROPERTY_RETENTION_INTERVAL_CONVERSATION_SECONDS)
	private Long retentionIntervalConversationSeconds;

	public static final String JSON_PROPERTY_RETENTION_INTERVAL_PRESENCE_SECONDS = "retentionIntervalPresenceSeconds";
	@JsonProperty(JSON_PROPERTY_RETENTION_INTERVAL_PRESENCE_SECONDS)
	private Long retentionIntervalPresenceSeconds;

	public static final String JSON_PROPERTY_RETENTION_INTERVAL_WEBHOOK_CALL_LOG_SECONDS = "retentionIntervalWebhookCallLogSeconds";
	@JsonProperty(JSON_PROPERTY_RETENTION_INTERVAL_WEBHOOK_CALL_LOG_SECONDS)
	private Long retentionIntervalWebhookCallLogSeconds;

	public static final String JSON_PROPERTY_RETENTION_INTERVAL_AUDIT_LOG_SECONDS = "retentionIntervalAuditLogSeconds";
	@JsonProperty(JSON_PROPERTY_RETENTION_INTERVAL_AUDIT_LOG_SECONDS)
	private Long retentionIntervalAuditLogSeconds;

	public RecordRetentionData $type(TypeEnum $type) {
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

	public RecordRetentionData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account whose retention configuration properties the object represents
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account whose retention configuration properties the object represents")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public RecordRetentionData retentionIntervalConversationSeconds(Long retentionIntervalConversationSeconds) {
		this.retentionIntervalConversationSeconds = retentionIntervalConversationSeconds;
		return this;
	}

	/**
	 * Retention interval of conversations represented as number of seconds. Conversations are deleted after the interval, counting from when they ended.
	 * 
	 * @return retentionIntervalConversationSeconds
	 **/
	@ApiModelProperty(value = "Retention interval of conversations represented as number of seconds. Conversations are deleted after the interval, counting from when they ended.")
	public Long getRetentionIntervalConversationSeconds() {
		return retentionIntervalConversationSeconds;
	}

	public void setRetentionIntervalConversationSeconds(Long retentionIntervalConversationSeconds) {
		this.retentionIntervalConversationSeconds = retentionIntervalConversationSeconds;
	}

	public RecordRetentionData retentionIntervalPresenceSeconds(Long retentionIntervalPresenceSeconds) {
		this.retentionIntervalPresenceSeconds = retentionIntervalPresenceSeconds;
		return this;
	}

	/**
	 * Retention interval of person presences represented as number of seconds. If a person presence exists without a conversation, the log is deleted after the
	 * time set below. Otherwise, it is deleted when the conversation record is deleted.
	 * 
	 * @return retentionIntervalPresenceSeconds
	 **/
	@ApiModelProperty(value = "Retention interval of person presences represented as number of seconds. If a person presence exists without a conversation, the log is deleted after the time set below. Otherwise, it is deleted when the conversation record is deleted.")
	public Long getRetentionIntervalPresenceSeconds() {
		return retentionIntervalPresenceSeconds;
	}

	public void setRetentionIntervalPresenceSeconds(Long retentionIntervalPresenceSeconds) {
		this.retentionIntervalPresenceSeconds = retentionIntervalPresenceSeconds;
	}

	public RecordRetentionData retentionIntervalWebhookCallLogSeconds(Long retentionIntervalWebhookCallLogSeconds) {
		this.retentionIntervalWebhookCallLogSeconds = retentionIntervalWebhookCallLogSeconds;
		return this;
	}

	/**
	 * Retention interval of webhook call logs represented as number of seconds. Webhook logs are deleted after the time set below, counting from when they were
	 * created.
	 * 
	 * @return retentionIntervalWebhookCallLogSeconds
	 **/
	@ApiModelProperty(value = "Retention interval of webhook call logs represented as number of seconds. Webhook logs are deleted after the time set below, counting from when they were created.")
	public Long getRetentionIntervalWebhookCallLogSeconds() {
		return retentionIntervalWebhookCallLogSeconds;
	}

	public void setRetentionIntervalWebhookCallLogSeconds(Long retentionIntervalWebhookCallLogSeconds) {
		this.retentionIntervalWebhookCallLogSeconds = retentionIntervalWebhookCallLogSeconds;
	}

	public RecordRetentionData retentionIntervalAuditLogSeconds(Long retentionIntervalAuditLogSeconds) {
		this.retentionIntervalAuditLogSeconds = retentionIntervalAuditLogSeconds;
		return this;
	}

	/**
	 * Retention interval of audit logs represented as number of seconds. Audit logs are deleted after the time set below, counting from when they were created.
	 * 
	 * @return retentionIntervalAuditLogSeconds
	 **/
	@ApiModelProperty(value = "Retention interval of audit logs represented as number of seconds. Audit logs are deleted after the time set below, counting from when they were created.")
	public Long getRetentionIntervalAuditLogSeconds() {
		return retentionIntervalAuditLogSeconds;
	}

	public void setRetentionIntervalAuditLogSeconds(Long retentionIntervalAuditLogSeconds) {
		this.retentionIntervalAuditLogSeconds = retentionIntervalAuditLogSeconds;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RecordRetentionData recordRetentionData = (RecordRetentionData) o;
		return Objects.equals(this.$type, recordRetentionData.$type) &&
				Objects.equals(this.accountId, recordRetentionData.accountId) &&
				Objects.equals(this.retentionIntervalConversationSeconds, recordRetentionData.retentionIntervalConversationSeconds) &&
				Objects.equals(this.retentionIntervalPresenceSeconds, recordRetentionData.retentionIntervalPresenceSeconds) &&
				Objects.equals(this.retentionIntervalWebhookCallLogSeconds, recordRetentionData.retentionIntervalWebhookCallLogSeconds) &&
				Objects.equals(this.retentionIntervalAuditLogSeconds, recordRetentionData.retentionIntervalAuditLogSeconds);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, retentionIntervalConversationSeconds, retentionIntervalPresenceSeconds, retentionIntervalWebhookCallLogSeconds, retentionIntervalAuditLogSeconds);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RecordRetentionData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    retentionIntervalConversationSeconds: ").append(toIndentedString(retentionIntervalConversationSeconds)).append("\n");
		sb.append("    retentionIntervalPresenceSeconds: ").append(toIndentedString(retentionIntervalPresenceSeconds)).append("\n");
		sb.append("    retentionIntervalWebhookCallLogSeconds: ").append(toIndentedString(retentionIntervalWebhookCallLogSeconds)).append("\n");
		sb.append("    retentionIntervalAuditLogSeconds: ").append(toIndentedString(retentionIntervalAuditLogSeconds)).append("\n");
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
