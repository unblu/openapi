
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
 * Records a single queue interaction event: an invitation or reservation that was created and subsequently resolved (redeemed, revoked, declined, or timed
 * out). A conversation may produce multiple queue interaction entries if it goes through several invitation/reservation cycles during its lifecycle.
 */
@ApiModel(description = "Records a single queue interaction event: an invitation or reservation that was created and subsequently resolved (redeemed, revoked, declined, or timed out). A conversation may produce multiple queue interaction entries if it goes through several invitation/reservation cycles during its lifecycle.")

@JsonPropertyOrder({
	QueueInteractionAnalyticsKpiData.JSON_PROPERTY_$_TYPE,
	QueueInteractionAnalyticsKpiData.JSON_PROPERTY_ID,
	QueueInteractionAnalyticsKpiData.JSON_PROPERTY_EVENT_TIMESTAMP,
	QueueInteractionAnalyticsKpiData.JSON_PROPERTY_RESERVATION_CREATION_TIMESTAMP,
	QueueInteractionAnalyticsKpiData.JSON_PROPERTY_INVITATION_CREATION_TIMESTAMP,
	QueueInteractionAnalyticsKpiData.JSON_PROPERTY_RESPONSE_END_TIMESTAMP,
	QueueInteractionAnalyticsKpiData.JSON_PROPERTY_RESERVATION_TIME_DURATION,
	QueueInteractionAnalyticsKpiData.JSON_PROPERTY_QUEUE_INTERACTION_TYPE,
	QueueInteractionAnalyticsKpiData.JSON_PROPERTY_TARGET,
	QueueInteractionAnalyticsKpiData.JSON_PROPERTY_CONVERSATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class QueueInteractionAnalyticsKpiData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		QUEUEINTERACTIONANALYTICSKPIDATA("QueueInteractionAnalyticsKpiData");

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
			return TypeEnum.QUEUEINTERACTIONANALYTICSKPIDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.QUEUEINTERACTIONANALYTICSKPIDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_EVENT_TIMESTAMP = "eventTimestamp";
	@JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
	private Long eventTimestamp;

	public static final String JSON_PROPERTY_RESERVATION_CREATION_TIMESTAMP = "reservationCreationTimestamp";
	@JsonProperty(JSON_PROPERTY_RESERVATION_CREATION_TIMESTAMP)
	private Long reservationCreationTimestamp;

	public static final String JSON_PROPERTY_INVITATION_CREATION_TIMESTAMP = "invitationCreationTimestamp";
	@JsonProperty(JSON_PROPERTY_INVITATION_CREATION_TIMESTAMP)
	private Long invitationCreationTimestamp;

	public static final String JSON_PROPERTY_RESPONSE_END_TIMESTAMP = "responseEndTimestamp";
	@JsonProperty(JSON_PROPERTY_RESPONSE_END_TIMESTAMP)
	private Long responseEndTimestamp;

	public static final String JSON_PROPERTY_RESERVATION_TIME_DURATION = "reservationTimeDuration";
	@JsonProperty(JSON_PROPERTY_RESERVATION_TIME_DURATION)
	private Long reservationTimeDuration;

	public static final String JSON_PROPERTY_QUEUE_INTERACTION_TYPE = "queueInteractionType";
	@JsonProperty(JSON_PROPERTY_QUEUE_INTERACTION_TYPE)
	private EQueueInteractionType queueInteractionType;

	public static final String JSON_PROPERTY_TARGET = "target";
	@JsonProperty(JSON_PROPERTY_TARGET)
	private RecipientAnalyticsKpiData target = null;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationAnalyticsKpiData conversation = null;

	public QueueInteractionAnalyticsKpiData $type(TypeEnum $type) {
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

	public QueueInteractionAnalyticsKpiData id(String id) {
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

	public QueueInteractionAnalyticsKpiData eventTimestamp(Long eventTimestamp) {
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

	public QueueInteractionAnalyticsKpiData reservationCreationTimestamp(Long reservationCreationTimestamp) {
		this.reservationCreationTimestamp = reservationCreationTimestamp;
		return this;
	}

	/**
	 * The UTC timestamp (ms) when the reservation was created. @code{ null} when the interaction was not reserved.
	 * 
	 * @return reservationCreationTimestamp
	 **/
	@ApiModelProperty(value = "The UTC timestamp (ms) when the reservation was created. @code{ null} when the interaction was not reserved.")
	public Long getReservationCreationTimestamp() {
		return reservationCreationTimestamp;
	}

	public void setReservationCreationTimestamp(Long reservationCreationTimestamp) {
		this.reservationCreationTimestamp = reservationCreationTimestamp;
	}

	public QueueInteractionAnalyticsKpiData invitationCreationTimestamp(Long invitationCreationTimestamp) {
		this.invitationCreationTimestamp = invitationCreationTimestamp;
		return this;
	}

	/**
	 * The UTC timestamp (ms) when the invitation was created.
	 * 
	 * @return invitationCreationTimestamp
	 **/
	@ApiModelProperty(value = "The UTC timestamp (ms) when the invitation was created.")
	public Long getInvitationCreationTimestamp() {
		return invitationCreationTimestamp;
	}

	public void setInvitationCreationTimestamp(Long invitationCreationTimestamp) {
		this.invitationCreationTimestamp = invitationCreationTimestamp;
	}

	public QueueInteractionAnalyticsKpiData responseEndTimestamp(Long responseEndTimestamp) {
		this.responseEndTimestamp = responseEndTimestamp;
		return this;
	}

	/**
	 * The UTC timestamp (ms) when the invitation/reservation was resolved.
	 * 
	 * @return responseEndTimestamp
	 **/
	@ApiModelProperty(value = "The UTC timestamp (ms) when the invitation/reservation was resolved.")
	public Long getResponseEndTimestamp() {
		return responseEndTimestamp;
	}

	public void setResponseEndTimestamp(Long responseEndTimestamp) {
		this.responseEndTimestamp = responseEndTimestamp;
	}

	public QueueInteractionAnalyticsKpiData reservationTimeDuration(Long reservationTimeDuration) {
		this.reservationTimeDuration = reservationTimeDuration;
		return this;
	}

	/**
	 * The duration (ms) between the reservation creation and the resolution of the reservation. @code{ null} when the interaction was not reserved.
	 * 
	 * @return reservationTimeDuration
	 **/
	@ApiModelProperty(value = "The duration (ms) between the reservation creation and the resolution of the reservation. @code{ null} when the interaction was not reserved.")
	public Long getReservationTimeDuration() {
		return reservationTimeDuration;
	}

	public void setReservationTimeDuration(Long reservationTimeDuration) {
		this.reservationTimeDuration = reservationTimeDuration;
	}

	public QueueInteractionAnalyticsKpiData queueInteractionType(EQueueInteractionType queueInteractionType) {
		this.queueInteractionType = queueInteractionType;
		return this;
	}

	/**
	 * Get queueInteractionType
	 * 
	 * @return queueInteractionType
	 **/
	@ApiModelProperty(value = "")
	public EQueueInteractionType getQueueInteractionType() {
		return queueInteractionType;
	}

	public void setQueueInteractionType(EQueueInteractionType queueInteractionType) {
		this.queueInteractionType = queueInteractionType;
	}

	public QueueInteractionAnalyticsKpiData target(RecipientAnalyticsKpiData target) {
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

	public QueueInteractionAnalyticsKpiData conversation(ConversationAnalyticsKpiData conversation) {
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
		QueueInteractionAnalyticsKpiData queueInteractionAnalyticsKpiData = (QueueInteractionAnalyticsKpiData) o;
		return Objects.equals(this.$type, queueInteractionAnalyticsKpiData.$type) &&
				Objects.equals(this.id, queueInteractionAnalyticsKpiData.id) &&
				Objects.equals(this.eventTimestamp, queueInteractionAnalyticsKpiData.eventTimestamp) &&
				Objects.equals(this.reservationCreationTimestamp, queueInteractionAnalyticsKpiData.reservationCreationTimestamp) &&
				Objects.equals(this.invitationCreationTimestamp, queueInteractionAnalyticsKpiData.invitationCreationTimestamp) &&
				Objects.equals(this.responseEndTimestamp, queueInteractionAnalyticsKpiData.responseEndTimestamp) &&
				Objects.equals(this.reservationTimeDuration, queueInteractionAnalyticsKpiData.reservationTimeDuration) &&
				Objects.equals(this.queueInteractionType, queueInteractionAnalyticsKpiData.queueInteractionType) &&
				Objects.equals(this.target, queueInteractionAnalyticsKpiData.target) &&
				Objects.equals(this.conversation, queueInteractionAnalyticsKpiData.conversation);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, eventTimestamp, reservationCreationTimestamp, invitationCreationTimestamp, responseEndTimestamp, reservationTimeDuration, queueInteractionType, target, conversation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class QueueInteractionAnalyticsKpiData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
		sb.append("    reservationCreationTimestamp: ").append(toIndentedString(reservationCreationTimestamp)).append("\n");
		sb.append("    invitationCreationTimestamp: ").append(toIndentedString(invitationCreationTimestamp)).append("\n");
		sb.append("    responseEndTimestamp: ").append(toIndentedString(responseEndTimestamp)).append("\n");
		sb.append("    reservationTimeDuration: ").append(toIndentedString(reservationTimeDuration)).append("\n");
		sb.append("    queueInteractionType: ").append(toIndentedString(queueInteractionType)).append("\n");
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
