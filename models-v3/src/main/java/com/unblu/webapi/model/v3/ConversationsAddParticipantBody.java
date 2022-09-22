
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;conversationsAddParticipant&#39; operation
 */
@ApiModel(description = "Request Body for the 'conversationsAddParticipant' operation")

@JsonPropertyOrder({
	ConversationsAddParticipantBody.JSON_PROPERTY_PERSON_ID,
	ConversationsAddParticipantBody.JSON_PROPERTY_CONNECTED_VIA_EXTERNAL_MESSENGER,
	ConversationsAddParticipantBody.JSON_PROPERTY_HIDDEN,
	ConversationsAddParticipantBody.JSON_PROPERTY_CONVERSATION_STARRED,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationsAddParticipantBody {
	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_CONNECTED_VIA_EXTERNAL_MESSENGER = "connectedViaExternalMessenger";
	@JsonProperty(JSON_PROPERTY_CONNECTED_VIA_EXTERNAL_MESSENGER)
	private Boolean connectedViaExternalMessenger;

	public static final String JSON_PROPERTY_HIDDEN = "hidden";
	@JsonProperty(JSON_PROPERTY_HIDDEN)
	private Boolean hidden;

	public static final String JSON_PROPERTY_CONVERSATION_STARRED = "conversationStarred";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_STARRED)
	private Boolean conversationStarred;

	public ConversationsAddParticipantBody personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * Id of the person to add
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "Id of the person to add")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public ConversationsAddParticipantBody connectedViaExternalMessenger(Boolean connectedViaExternalMessenger) {
		this.connectedViaExternalMessenger = connectedViaExternalMessenger;
		return this;
	}

	/**
	 * If the participant is sending messages via a messenger channel, this parameter must be set to true. Otherwise false or do not set.
	 * 
	 * @return connectedViaExternalMessenger
	 **/
	@ApiModelProperty(value = "If the participant is sending messages via a messenger channel, this parameter must be set to true. Otherwise false or do not set.")
	public Boolean isConnectedViaExternalMessenger() {
		return connectedViaExternalMessenger;
	}

	public void setConnectedViaExternalMessenger(Boolean connectedViaExternalMessenger) {
		this.connectedViaExternalMessenger = connectedViaExternalMessenger;
	}

	public ConversationsAddParticipantBody hidden(Boolean hidden) {
		this.hidden = hidden;
		return this;
	}

	/**
	 * If the person should be hidden or not. &lt;b&gt;Note:&lt;/b&gt; only secondary agents and bots may be hidden.
	 * 
	 * @return hidden
	 **/
	@ApiModelProperty(value = "If the person should be hidden or not. <b>Note:</b> only secondary agents and bots may be hidden.")
	public Boolean isHidden() {
		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public ConversationsAddParticipantBody conversationStarred(Boolean conversationStarred) {
		this.conversationStarred = conversationStarred;
		return this;
	}

	/**
	 * If this conversation should be marked as starred for the person. If &lt;code&gt;null&lt;/code&gt;, the default value is &lt;code&gt;false&lt;/code&gt;
	 * 
	 * @return conversationStarred
	 **/
	@ApiModelProperty(value = "If this conversation should be marked as starred for the person. If <code>null</code>, the default value is <code>false</code>")
	public Boolean isConversationStarred() {
		return conversationStarred;
	}

	public void setConversationStarred(Boolean conversationStarred) {
		this.conversationStarred = conversationStarred;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationsAddParticipantBody conversationsAddParticipantBody = (ConversationsAddParticipantBody) o;
		return Objects.equals(this.personId, conversationsAddParticipantBody.personId) &&
				Objects.equals(this.connectedViaExternalMessenger, conversationsAddParticipantBody.connectedViaExternalMessenger) &&
				Objects.equals(this.hidden, conversationsAddParticipantBody.hidden) &&
				Objects.equals(this.conversationStarred, conversationsAddParticipantBody.conversationStarred);
	}

	@Override
	public int hashCode() {
		return Objects.hash(personId, connectedViaExternalMessenger, hidden, conversationStarred);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationsAddParticipantBody {\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    connectedViaExternalMessenger: ").append(toIndentedString(connectedViaExternalMessenger)).append("\n");
		sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
		sb.append("    conversationStarred: ").append(toIndentedString(conversationStarred)).append("\n");
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
