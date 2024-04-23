
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
 * Request sent when a person offboards a conversation, giving the bot a chance to participate in the person&#39;s offboarding. &lt;p&gt; This may be triggered
 * by several things: &lt;ul&gt; &lt;li&gt;&lt;b&gt;A person leaves a conversation:&lt;/b&gt; A bot can participate in the offboarding process of this
 * person.&lt;/li&gt; &lt;li&gt;&lt;b&gt;A conversation ends:&lt;/b&gt; A bot can participate in the offboarding process for every person in the
 * conversation.&lt;/li&gt; &lt;/ul&gt; Bots must accept or decline the dialog offer by responding to the request with a &#x60;BotBoardingOfferResponse&#x60;.
 * &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; &lt;ul&gt; &lt;li&gt;If the offboarding person doesn&#39;t match the offboarding filter defined in the
 * &#x60;DialogBot&#x60;, the request isn&#39;t sent to the bot&#39;s endpoint.&lt;/li&gt; &lt;li&gt;The bot MUST respond to the request. If it doesn&#39;t, the
 * offboarding person has to wait for a timeout before their offboarding can proceed.&lt;/li&gt; &lt;/ul&gt;
 */
@ApiModel(description = "Request sent when a person offboards a conversation, giving the bot a chance to participate in the person's offboarding. <p> This may be triggered by several things: <ul> <li><b>A person leaves a conversation:</b> A bot can participate in the offboarding process of this person.</li> <li><b>A conversation ends:</b> A bot can participate in the offboarding process for every person in the conversation.</li> </ul> Bots must accept or decline the dialog offer by responding to the request with a `BotBoardingOfferResponse`. <p> <b>Note:</b> <ul> <li>If the offboarding person doesn't match the offboarding filter defined in the `DialogBot`, the request isn't sent to the bot's endpoint.</li> <li>The bot MUST respond to the request. If it doesn't, the offboarding person has to wait for a timeout before their offboarding can proceed.</li> </ul>")

@JsonPropertyOrder({
	BotOffboardingOfferRequest.JSON_PROPERTY_$_TYPE,
	BotOffboardingOfferRequest.JSON_PROPERTY_ACCOUNT_ID,
	BotOffboardingOfferRequest.JSON_PROPERTY_SERVICE_NAME,
	BotOffboardingOfferRequest.JSON_PROPERTY_DIALOG_TOKEN,
	BotOffboardingOfferRequest.JSON_PROPERTY_OFFBOARDING_PERSON,
	BotOffboardingOfferRequest.JSON_PROPERTY_OFFBOARDING_REASON,
	BotOffboardingOfferRequest.JSON_PROPERTY_CONVERSATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotOffboardingOfferRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTOFFBOARDINGOFFERREQUEST("BotOffboardingOfferRequest");

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
			return TypeEnum.BOTOFFBOARDINGOFFERREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTOFFBOARDINGOFFERREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_OFFBOARDING_PERSON = "offboardingPerson";
	@JsonProperty(JSON_PROPERTY_OFFBOARDING_PERSON)
	private PersonData offboardingPerson = null;

	public static final String JSON_PROPERTY_OFFBOARDING_REASON = "offboardingReason";
	@JsonProperty(JSON_PROPERTY_OFFBOARDING_REASON)
	private EOffboardingReason offboardingReason;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationData conversation = null;

	public BotOffboardingOfferRequest $type(TypeEnum $type) {
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

	public BotOffboardingOfferRequest accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Get accountId
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public BotOffboardingOfferRequest serviceName(String serviceName) {
		this.serviceName = serviceName;
		return this;
	}

	/**
	 * Get serviceName
	 * 
	 * @return serviceName
	 **/
	@ApiModelProperty(value = "")
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public BotOffboardingOfferRequest dialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
		return this;
	}

	/**
	 * The unique dialog token for this bot, used to identify this offboarding via the bot web API
	 * 
	 * @return dialogToken
	 **/
	@ApiModelProperty(value = "The unique dialog token for this bot, used to identify this offboarding via the bot web API")
	public String getDialogToken() {
		return dialogToken;
	}

	public void setDialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
	}

	public BotOffboardingOfferRequest offboardingPerson(PersonData offboardingPerson) {
		this.offboardingPerson = offboardingPerson;
		return this;
	}

	/**
	 * Get offboardingPerson
	 * 
	 * @return offboardingPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getOffboardingPerson() {
		return offboardingPerson;
	}

	public void setOffboardingPerson(PersonData offboardingPerson) {
		this.offboardingPerson = offboardingPerson;
	}

	public BotOffboardingOfferRequest offboardingReason(EOffboardingReason offboardingReason) {
		this.offboardingReason = offboardingReason;
		return this;
	}

	/**
	 * Get offboardingReason
	 * 
	 * @return offboardingReason
	 **/
	@ApiModelProperty(value = "")
	public EOffboardingReason getOffboardingReason() {
		return offboardingReason;
	}

	public void setOffboardingReason(EOffboardingReason offboardingReason) {
		this.offboardingReason = offboardingReason;
	}

	public BotOffboardingOfferRequest conversation(ConversationData conversation) {
		this.conversation = conversation;
		return this;
	}

	/**
	 * Get conversation
	 * 
	 * @return conversation
	 **/
	@ApiModelProperty(value = "")
	public ConversationData getConversation() {
		return conversation;
	}

	public void setConversation(ConversationData conversation) {
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
		BotOffboardingOfferRequest botOffboardingOfferRequest = (BotOffboardingOfferRequest) o;
		return Objects.equals(this.$type, botOffboardingOfferRequest.$type) &&
				Objects.equals(this.accountId, botOffboardingOfferRequest.accountId) &&
				Objects.equals(this.serviceName, botOffboardingOfferRequest.serviceName) &&
				Objects.equals(this.dialogToken, botOffboardingOfferRequest.dialogToken) &&
				Objects.equals(this.offboardingPerson, botOffboardingOfferRequest.offboardingPerson) &&
				Objects.equals(this.offboardingReason, botOffboardingOfferRequest.offboardingReason) &&
				Objects.equals(this.conversation, botOffboardingOfferRequest.conversation);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, dialogToken, offboardingPerson, offboardingReason, conversation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotOffboardingOfferRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    offboardingPerson: ").append(toIndentedString(offboardingPerson)).append("\n");
		sb.append("    offboardingReason: ").append(toIndentedString(offboardingReason)).append("\n");
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
