
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
 * Holds conversation-related fields that are shared by all analytics KPI data access entries.
 */
@ApiModel(description = "Holds conversation-related fields that are shared by all analytics KPI data access entries.")

@JsonPropertyOrder({
	ConversationAnalyticsKpiData.JSON_PROPERTY_$_TYPE,
	ConversationAnalyticsKpiData.JSON_PROPERTY_ID,
	ConversationAnalyticsKpiData.JSON_PROPERTY_TEMPLATE_ID,
	ConversationAnalyticsKpiData.JSON_PROPERTY_LOCALE,
	ConversationAnalyticsKpiData.JSON_PROPERTY_RECIPIENT,
	ConversationAnalyticsKpiData.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE,
	ConversationAnalyticsKpiData.JSON_PROPERTY_INITIAL_ENGAGEMENT_URL,
	ConversationAnalyticsKpiData.JSON_PROPERTY_CONTEXT_PERSON,
	ConversationAnalyticsKpiData.JSON_PROPERTY_ASSIGNED_AGENT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationAnalyticsKpiData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONANALYTICSKPIDATA("ConversationAnalyticsKpiData");

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
			return TypeEnum.CONVERSATIONANALYTICSKPIDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONANALYTICSKPIDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
	@JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
	private String templateId;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public static final String JSON_PROPERTY_RECIPIENT = "recipient";
	@JsonProperty(JSON_PROPERTY_RECIPIENT)
	private RecipientAnalyticsKpiData recipient = null;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE = "initialEngagementType";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE)
	private EInitialEngagementType initialEngagementType;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_URL = "initialEngagementUrl";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_URL)
	private String initialEngagementUrl;

	public static final String JSON_PROPERTY_CONTEXT_PERSON = "contextPerson";
	@JsonProperty(JSON_PROPERTY_CONTEXT_PERSON)
	private PersonAnalyticsKpiData contextPerson = null;

	public static final String JSON_PROPERTY_ASSIGNED_AGENT = "assignedAgent";
	@JsonProperty(JSON_PROPERTY_ASSIGNED_AGENT)
	private PersonAnalyticsKpiData assignedAgent = null;

	public ConversationAnalyticsKpiData $type(TypeEnum $type) {
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

	public ConversationAnalyticsKpiData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The unique identifier of the conversation.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The unique identifier of the conversation.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ConversationAnalyticsKpiData templateId(String templateId) {
		this.templateId = templateId;
		return this;
	}

	/**
	 * The identifier of the conversation template used.
	 * 
	 * @return templateId
	 **/
	@ApiModelProperty(value = "The identifier of the conversation template used.")
	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public ConversationAnalyticsKpiData locale(String locale) {
		this.locale = locale;
		return this;
	}

	/**
	 * The locale of the conversation (e.g., \&quot;en\&quot;, \&quot;de\&quot;).
	 * 
	 * @return locale
	 **/
	@ApiModelProperty(value = "The locale of the conversation (e.g., \"en\", \"de\").")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public ConversationAnalyticsKpiData recipient(RecipientAnalyticsKpiData recipient) {
		this.recipient = recipient;
		return this;
	}

	/**
	 * Get recipient
	 * 
	 * @return recipient
	 **/
	@ApiModelProperty(value = "")
	public RecipientAnalyticsKpiData getRecipient() {
		return recipient;
	}

	public void setRecipient(RecipientAnalyticsKpiData recipient) {
		this.recipient = recipient;
	}

	public ConversationAnalyticsKpiData initialEngagementType(EInitialEngagementType initialEngagementType) {
		this.initialEngagementType = initialEngagementType;
		return this;
	}

	/**
	 * Get initialEngagementType
	 * 
	 * @return initialEngagementType
	 **/
	@ApiModelProperty(value = "")
	public EInitialEngagementType getInitialEngagementType() {
		return initialEngagementType;
	}

	public void setInitialEngagementType(EInitialEngagementType initialEngagementType) {
		this.initialEngagementType = initialEngagementType;
	}

	public ConversationAnalyticsKpiData initialEngagementUrl(String initialEngagementUrl) {
		this.initialEngagementUrl = initialEngagementUrl;
		return this;
	}

	/**
	 * The URL from which the conversation was initiated.
	 * 
	 * @return initialEngagementUrl
	 **/
	@ApiModelProperty(value = "The URL from which the conversation was initiated.")
	public String getInitialEngagementUrl() {
		return initialEngagementUrl;
	}

	public void setInitialEngagementUrl(String initialEngagementUrl) {
		this.initialEngagementUrl = initialEngagementUrl;
	}

	public ConversationAnalyticsKpiData contextPerson(PersonAnalyticsKpiData contextPerson) {
		this.contextPerson = contextPerson;
		return this;
	}

	/**
	 * Get contextPerson
	 * 
	 * @return contextPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonAnalyticsKpiData getContextPerson() {
		return contextPerson;
	}

	public void setContextPerson(PersonAnalyticsKpiData contextPerson) {
		this.contextPerson = contextPerson;
	}

	public ConversationAnalyticsKpiData assignedAgent(PersonAnalyticsKpiData assignedAgent) {
		this.assignedAgent = assignedAgent;
		return this;
	}

	/**
	 * Get assignedAgent
	 * 
	 * @return assignedAgent
	 **/
	@ApiModelProperty(value = "")
	public PersonAnalyticsKpiData getAssignedAgent() {
		return assignedAgent;
	}

	public void setAssignedAgent(PersonAnalyticsKpiData assignedAgent) {
		this.assignedAgent = assignedAgent;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationAnalyticsKpiData conversationAnalyticsKpiData = (ConversationAnalyticsKpiData) o;
		return Objects.equals(this.$type, conversationAnalyticsKpiData.$type) &&
				Objects.equals(this.id, conversationAnalyticsKpiData.id) &&
				Objects.equals(this.templateId, conversationAnalyticsKpiData.templateId) &&
				Objects.equals(this.locale, conversationAnalyticsKpiData.locale) &&
				Objects.equals(this.recipient, conversationAnalyticsKpiData.recipient) &&
				Objects.equals(this.initialEngagementType, conversationAnalyticsKpiData.initialEngagementType) &&
				Objects.equals(this.initialEngagementUrl, conversationAnalyticsKpiData.initialEngagementUrl) &&
				Objects.equals(this.contextPerson, conversationAnalyticsKpiData.contextPerson) &&
				Objects.equals(this.assignedAgent, conversationAnalyticsKpiData.assignedAgent);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, templateId, locale, recipient, initialEngagementType, initialEngagementUrl, contextPerson, assignedAgent);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationAnalyticsKpiData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
		sb.append("    initialEngagementType: ").append(toIndentedString(initialEngagementType)).append("\n");
		sb.append("    initialEngagementUrl: ").append(toIndentedString(initialEngagementUrl)).append("\n");
		sb.append("    contextPerson: ").append(toIndentedString(contextPerson)).append("\n");
		sb.append("    assignedAgent: ").append(toIndentedString(assignedAgent)).append("\n");
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
