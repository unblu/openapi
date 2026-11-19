
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
 * Records a conversation entering the queue, at the moment it enters. A conversation has one record for each time it enters the queue, including requeuing and
 * forwarding. Its invitation ID matches the invitation ID of the waiting time record created when the wait ends.
 */
@ApiModel(description = "Records a conversation entering the queue, at the moment it enters. A conversation has one record for each time it enters the queue, including requeuing and forwarding. Its invitation ID matches the invitation ID of the waiting time record created when the wait ends.")

@JsonPropertyOrder({
	QueueEntryAnalyticsKpiData.JSON_PROPERTY_$_TYPE,
	QueueEntryAnalyticsKpiData.JSON_PROPERTY_ID,
	QueueEntryAnalyticsKpiData.JSON_PROPERTY_EVENT_TIMESTAMP,
	QueueEntryAnalyticsKpiData.JSON_PROPERTY_REDACTED,
	QueueEntryAnalyticsKpiData.JSON_PROPERTY_INVITATION_ID,
	QueueEntryAnalyticsKpiData.JSON_PROPERTY_TYPE,
	QueueEntryAnalyticsKpiData.JSON_PROPERTY_TARGET,
	QueueEntryAnalyticsKpiData.JSON_PROPERTY_CONVERSATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class QueueEntryAnalyticsKpiData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		QUEUEENTRYANALYTICSKPIDATA("QueueEntryAnalyticsKpiData");

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
			return TypeEnum.QUEUEENTRYANALYTICSKPIDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.QUEUEENTRYANALYTICSKPIDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_EVENT_TIMESTAMP = "eventTimestamp";
	@JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
	private Long eventTimestamp;

	public static final String JSON_PROPERTY_REDACTED = "redacted";
	@JsonProperty(JSON_PROPERTY_REDACTED)
	private Boolean redacted;

	public static final String JSON_PROPERTY_INVITATION_ID = "invitationId";
	@JsonProperty(JSON_PROPERTY_INVITATION_ID)
	private String invitationId;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EAnalyticsWaitingTimeType type;

	public static final String JSON_PROPERTY_TARGET = "target";
	@JsonProperty(JSON_PROPERTY_TARGET)
	private RecipientAnalyticsKpiData target = null;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationAnalyticsKpiData conversation = null;

	public QueueEntryAnalyticsKpiData $type(TypeEnum $type) {
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

	public QueueEntryAnalyticsKpiData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The unique identifier of the data entry in the analytics KPI table
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The unique identifier of the data entry in the analytics KPI table")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public QueueEntryAnalyticsKpiData eventTimestamp(Long eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) for the KPI entry. This is the timestamp used for filtering
	 * 
	 * @return eventTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) for the KPI entry. This is the timestamp used for filtering")
	public Long getEventTimestamp() {
		return eventTimestamp;
	}

	public void setEventTimestamp(Long eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
	}

	public QueueEntryAnalyticsKpiData redacted(Boolean redacted) {
		this.redacted = redacted;
		return this;
	}

	/**
	 * True if the analytics event this entry is based on was redacted because the conversation keeps its data only in encrypted stores, so content such as message
	 * text or visitor data may be missing. False if the event wasn&#39;t redacted, or if the entry was recorded before Unblu tracked this.
	 * 
	 * @return redacted
	 **/
	@ApiModelProperty(value = "True if the analytics event this entry is based on was redacted because the conversation keeps its data only in encrypted stores, so content such as message text or visitor data may be missing. False if the event wasn't redacted, or if the entry was recorded before Unblu tracked this.")
	public Boolean isRedacted() {
		return redacted;
	}

	public void setRedacted(Boolean redacted) {
		this.redacted = redacted;
	}

	public QueueEntryAnalyticsKpiData invitationId(String invitationId) {
		this.invitationId = invitationId;
		return this;
	}

	/**
	 * The ID of the invitation created when the conversation entered the queue. The waiting time record created when this invitation is accepted or aborted carries
	 * the same ID.
	 * 
	 * @return invitationId
	 **/
	@ApiModelProperty(value = "The ID of the invitation created when the conversation entered the queue. The waiting time record created when this invitation is accepted or aborted carries the same ID.")
	public String getInvitationId() {
		return invitationId;
	}

	public void setInvitationId(String invitationId) {
		this.invitationId = invitationId;
	}

	public QueueEntryAnalyticsKpiData type(EAnalyticsWaitingTimeType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EAnalyticsWaitingTimeType getType() {
		return type;
	}

	public void setType(EAnalyticsWaitingTimeType type) {
		this.type = type;
	}

	public QueueEntryAnalyticsKpiData target(RecipientAnalyticsKpiData target) {
		this.target = target;
		return this;
	}

	/**
	 * Get target
	 * 
	 * @return target
	 **/
	@ApiModelProperty(value = "")
	public RecipientAnalyticsKpiData getTarget() {
		return target;
	}

	public void setTarget(RecipientAnalyticsKpiData target) {
		this.target = target;
	}

	public QueueEntryAnalyticsKpiData conversation(ConversationAnalyticsKpiData conversation) {
		this.conversation = conversation;
		return this;
	}

	/**
	 * Get conversation
	 * 
	 * @return conversation
	 **/
	@ApiModelProperty(value = "")
	public ConversationAnalyticsKpiData getConversation() {
		return conversation;
	}

	public void setConversation(ConversationAnalyticsKpiData conversation) {
		this.conversation = conversation;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		QueueEntryAnalyticsKpiData queueEntryAnalyticsKpiData = (QueueEntryAnalyticsKpiData) o;
		return Objects.equals(this.$type, queueEntryAnalyticsKpiData.$type) &&
				Objects.equals(this.id, queueEntryAnalyticsKpiData.id) &&
				Objects.equals(this.eventTimestamp, queueEntryAnalyticsKpiData.eventTimestamp) &&
				Objects.equals(this.redacted, queueEntryAnalyticsKpiData.redacted) &&
				Objects.equals(this.invitationId, queueEntryAnalyticsKpiData.invitationId) &&
				Objects.equals(this.type, queueEntryAnalyticsKpiData.type) &&
				Objects.equals(this.target, queueEntryAnalyticsKpiData.target) &&
				Objects.equals(this.conversation, queueEntryAnalyticsKpiData.conversation);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, eventTimestamp, redacted, invitationId, type, target, conversation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class QueueEntryAnalyticsKpiData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
		sb.append("    redacted: ").append(toIndentedString(redacted)).append("\n");
		sb.append("    invitationId: ").append(toIndentedString(invitationId)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    target: ").append(toIndentedString(target)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
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
