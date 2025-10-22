
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
 * A model that represents a conversation summary template.
 */
@ApiModel(description = "A model that represents a conversation summary template.")

@JsonPropertyOrder({
	ConversationSummaryTemplateData.JSON_PROPERTY_$_TYPE,
	ConversationSummaryTemplateData.JSON_PROPERTY_ID,
	ConversationSummaryTemplateData.JSON_PROPERTY_CREATION_TIMESTAMP,
	ConversationSummaryTemplateData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	ConversationSummaryTemplateData.JSON_PROPERTY_VERSION,
	ConversationSummaryTemplateData.JSON_PROPERTY_ACCOUNT_ID,
	ConversationSummaryTemplateData.JSON_PROPERTY_NAME,
	ConversationSummaryTemplateData.JSON_PROPERTY_DESCRIPTION,
	ConversationSummaryTemplateData.JSON_PROPERTY_REVIEW_REQUIRED,
	ConversationSummaryTemplateData.JSON_PROPERTY_REVIEWABLE_BY,
	ConversationSummaryTemplateData.JSON_PROPERTY_VISIBLE_TO,
	ConversationSummaryTemplateData.JSON_PROPERTY_SUMMARIZATION_LANGUAGE_CONFIGURATION,
	ConversationSummaryTemplateData.JSON_PROPERTY_SPECIFIC_GENERATION_LANGUAGE,
	ConversationSummaryTemplateData.JSON_PROPERTY_PROMPT_STRUCTURE,
	ConversationSummaryTemplateData.JSON_PROPERTY_PROMPT_CUSTOMIZATION,
	ConversationSummaryTemplateData.JSON_PROPERTY_MIN_CHARACTER_COUNT_FILTER,
	ConversationSummaryTemplateData.JSON_PROPERTY_SUMMARIZATION_TIME_FRAME,
	ConversationSummaryTemplateData.JSON_PROPERTY_INCLUDE_INTERNAL_MESSAGES,
	ConversationSummaryTemplateData.JSON_PROPERTY_INCLUDE_ONBOARDING_MESSAGES,
	ConversationSummaryTemplateData.JSON_PROPERTY_INCLUDE_OFFBOARDING_MESSAGES,
	ConversationSummaryTemplateData.JSON_PROPERTY_INCLUDE_REBOARDING_MESSAGES,
	ConversationSummaryTemplateData.JSON_PROPERTY_TRANSLATIONS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationSummaryTemplateData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONSUMMARYTEMPLATEDATA("ConversationSummaryTemplateData");

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
			return TypeEnum.CONVERSATIONSUMMARYTEMPLATEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONSUMMARYTEMPLATEDATA;

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

	public static final String JSON_PROPERTY_REVIEW_REQUIRED = "reviewRequired";
	@JsonProperty(JSON_PROPERTY_REVIEW_REQUIRED)
	private Boolean reviewRequired;

	public static final String JSON_PROPERTY_REVIEWABLE_BY = "reviewableBy";
	@JsonProperty(JSON_PROPERTY_REVIEWABLE_BY)
	private List<EConversationAgentParticipationType> reviewableBy = null;

	public static final String JSON_PROPERTY_VISIBLE_TO = "visibleTo";
	@JsonProperty(JSON_PROPERTY_VISIBLE_TO)
	private List<EConversationAgentParticipationType> visibleTo = null;

	public static final String JSON_PROPERTY_SUMMARIZATION_LANGUAGE_CONFIGURATION = "summarizationLanguageConfiguration";
	@JsonProperty(JSON_PROPERTY_SUMMARIZATION_LANGUAGE_CONFIGURATION)
	private ESummarizationLanguageConfiguration summarizationLanguageConfiguration;

	public static final String JSON_PROPERTY_SPECIFIC_GENERATION_LANGUAGE = "specificGenerationLanguage";
	@JsonProperty(JSON_PROPERTY_SPECIFIC_GENERATION_LANGUAGE)
	private String specificGenerationLanguage;

	public static final String JSON_PROPERTY_PROMPT_STRUCTURE = "promptStructure";
	@JsonProperty(JSON_PROPERTY_PROMPT_STRUCTURE)
	private String promptStructure;

	public static final String JSON_PROPERTY_PROMPT_CUSTOMIZATION = "promptCustomization";
	@JsonProperty(JSON_PROPERTY_PROMPT_CUSTOMIZATION)
	private String promptCustomization;

	public static final String JSON_PROPERTY_MIN_CHARACTER_COUNT_FILTER = "minCharacterCountFilter";
	@JsonProperty(JSON_PROPERTY_MIN_CHARACTER_COUNT_FILTER)
	private Long minCharacterCountFilter;

	public static final String JSON_PROPERTY_SUMMARIZATION_TIME_FRAME = "summarizationTimeFrame";
	@JsonProperty(JSON_PROPERTY_SUMMARIZATION_TIME_FRAME)
	private ESummarizationTimeFrame summarizationTimeFrame;

	public static final String JSON_PROPERTY_INCLUDE_INTERNAL_MESSAGES = "includeInternalMessages";
	@JsonProperty(JSON_PROPERTY_INCLUDE_INTERNAL_MESSAGES)
	private Boolean includeInternalMessages;

	public static final String JSON_PROPERTY_INCLUDE_ONBOARDING_MESSAGES = "includeOnboardingMessages";
	@JsonProperty(JSON_PROPERTY_INCLUDE_ONBOARDING_MESSAGES)
	private Boolean includeOnboardingMessages;

	public static final String JSON_PROPERTY_INCLUDE_OFFBOARDING_MESSAGES = "includeOffboardingMessages";
	@JsonProperty(JSON_PROPERTY_INCLUDE_OFFBOARDING_MESSAGES)
	private Boolean includeOffboardingMessages;

	public static final String JSON_PROPERTY_INCLUDE_REBOARDING_MESSAGES = "includeReboardingMessages";
	@JsonProperty(JSON_PROPERTY_INCLUDE_REBOARDING_MESSAGES)
	private Boolean includeReboardingMessages;

	public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
	@JsonProperty(JSON_PROPERTY_TRANSLATIONS)
	private Map<String, ConversationSummaryTemplateTranslation> translations = null;

	public ConversationSummaryTemplateData $type(TypeEnum $type) {
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

	public ConversationSummaryTemplateData id(String id) {
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

	public ConversationSummaryTemplateData creationTimestamp(Long creationTimestamp) {
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

	public ConversationSummaryTemplateData modificationTimestamp(Long modificationTimestamp) {
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

	public ConversationSummaryTemplateData version(Long version) {
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

	public ConversationSummaryTemplateData accountId(String accountId) {
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

	public ConversationSummaryTemplateData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the conversation summary template. Maximum length of 250 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the conversation summary template. Maximum length of 250 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ConversationSummaryTemplateData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the conversation summary template. Maximum length of 500 characters.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the conversation summary template. Maximum length of 500 characters.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ConversationSummaryTemplateData reviewRequired(Boolean reviewRequired) {
		this.reviewRequired = reviewRequired;
		return this;
	}

	/**
	 * Specify whether summaries created with this template require reviewing. Mandatory.
	 * 
	 * @return reviewRequired
	 **/
	@ApiModelProperty(value = "Specify whether summaries created with this template require reviewing. Mandatory.")
	public Boolean isReviewRequired() {
		return reviewRequired;
	}

	public void setReviewRequired(Boolean reviewRequired) {
		this.reviewRequired = reviewRequired;
	}

	public ConversationSummaryTemplateData reviewableBy(List<EConversationAgentParticipationType> reviewableBy) {
		this.reviewableBy = reviewableBy;
		return this;
	}

	public ConversationSummaryTemplateData addReviewableByItem(EConversationAgentParticipationType reviewableByItem) {
		if (this.reviewableBy == null) {
			this.reviewableBy = new ArrayList<>();
		}
		this.reviewableBy.add(reviewableByItem);
		return this;
	}

	/**
	 * Conversation participation types allowed to review summaries created with this template. Mandatory if &#x60;reviewRequired&#x60; is \&quot;true\&quot;,
	 * ignored otherwise.
	 * 
	 * @return reviewableBy
	 **/
	@ApiModelProperty(value = "Conversation participation types allowed to review summaries created with this template. Mandatory if `reviewRequired` is \"true\", ignored otherwise.")
	public List<EConversationAgentParticipationType> getReviewableBy() {
		return reviewableBy;
	}

	public void setReviewableBy(List<EConversationAgentParticipationType> reviewableBy) {
		this.reviewableBy = reviewableBy;
	}

	public ConversationSummaryTemplateData visibleTo(List<EConversationAgentParticipationType> visibleTo) {
		this.visibleTo = visibleTo;
		return this;
	}

	public ConversationSummaryTemplateData addVisibleToItem(EConversationAgentParticipationType visibleToItem) {
		if (this.visibleTo == null) {
			this.visibleTo = new ArrayList<>();
		}
		this.visibleTo.add(visibleToItem);
		return this;
	}

	/**
	 * Conversation participation types allowed to see summaries created with this template. Mandatory.
	 * 
	 * @return visibleTo
	 **/
	@ApiModelProperty(value = "Conversation participation types allowed to see summaries created with this template. Mandatory.")
	public List<EConversationAgentParticipationType> getVisibleTo() {
		return visibleTo;
	}

	public void setVisibleTo(List<EConversationAgentParticipationType> visibleTo) {
		this.visibleTo = visibleTo;
	}

	public ConversationSummaryTemplateData summarizationLanguageConfiguration(ESummarizationLanguageConfiguration summarizationLanguageConfiguration) {
		this.summarizationLanguageConfiguration = summarizationLanguageConfiguration;
		return this;
	}

	/**
	 * Get summarizationLanguageConfiguration
	 * 
	 * @return summarizationLanguageConfiguration
	 **/
	@ApiModelProperty(value = "")
	public ESummarizationLanguageConfiguration getSummarizationLanguageConfiguration() {
		return summarizationLanguageConfiguration;
	}

	public void setSummarizationLanguageConfiguration(ESummarizationLanguageConfiguration summarizationLanguageConfiguration) {
		this.summarizationLanguageConfiguration = summarizationLanguageConfiguration;
	}

	public ConversationSummaryTemplateData specificGenerationLanguage(String specificGenerationLanguage) {
		this.specificGenerationLanguage = specificGenerationLanguage;
		return this;
	}

	/**
	 * The language used for all summaries created with this template. Mandatory if summarizationLanguageConfiguration is set to DEFINED_LANGUAGE, ignored
	 * otherwise.
	 * 
	 * @return specificGenerationLanguage
	 **/
	@ApiModelProperty(value = "The language used for all summaries created with this template. Mandatory if summarizationLanguageConfiguration is set to DEFINED_LANGUAGE, ignored otherwise.")
	public String getSpecificGenerationLanguage() {
		return specificGenerationLanguage;
	}

	public void setSpecificGenerationLanguage(String specificGenerationLanguage) {
		this.specificGenerationLanguage = specificGenerationLanguage;
	}

	public ConversationSummaryTemplateData promptStructure(String promptStructure) {
		this.promptStructure = promptStructure;
		return this;
	}

	/**
	 * Customizable part of the prompt used to generate summaries. It describes the expected output structure of the summary. Maximum length of 2000 characters.
	 * Optional.
	 * 
	 * @return promptStructure
	 **/
	@ApiModelProperty(value = "Customizable part of the prompt used to generate summaries. It describes the expected output structure of the summary. Maximum length of 2000 characters. Optional.")
	public String getPromptStructure() {
		return promptStructure;
	}

	public void setPromptStructure(String promptStructure) {
		this.promptStructure = promptStructure;
	}

	public ConversationSummaryTemplateData promptCustomization(String promptCustomization) {
		this.promptCustomization = promptCustomization;
		return this;
	}

	/**
	 * Customizable part of the prompt used to generate summaries. It describes specific behavior the model should have when generating the summary. Maximum length
	 * of 2000 characters. Optional.
	 * 
	 * @return promptCustomization
	 **/
	@ApiModelProperty(value = "Customizable part of the prompt used to generate summaries. It describes specific behavior the model should have when generating the summary. Maximum length of 2000 characters. Optional.")
	public String getPromptCustomization() {
		return promptCustomization;
	}

	public void setPromptCustomization(String promptCustomization) {
		this.promptCustomization = promptCustomization;
	}

	public ConversationSummaryTemplateData minCharacterCountFilter(Long minCharacterCountFilter) {
		this.minCharacterCountFilter = minCharacterCountFilter;
		return this;
	}

	/**
	 * Minimum character count to generate a summary. If the number of characters is smaller than this value, no summary is created. Mandatory.
	 * 
	 * @return minCharacterCountFilter
	 **/
	@ApiModelProperty(value = "Minimum character count to generate a summary. If the number of characters is smaller than this value, no summary is created. Mandatory.")
	public Long getMinCharacterCountFilter() {
		return minCharacterCountFilter;
	}

	public void setMinCharacterCountFilter(Long minCharacterCountFilter) {
		this.minCharacterCountFilter = minCharacterCountFilter;
	}

	public ConversationSummaryTemplateData summarizationTimeFrame(ESummarizationTimeFrame summarizationTimeFrame) {
		this.summarizationTimeFrame = summarizationTimeFrame;
		return this;
	}

	/**
	 * Get summarizationTimeFrame
	 * 
	 * @return summarizationTimeFrame
	 **/
	@ApiModelProperty(value = "")
	public ESummarizationTimeFrame getSummarizationTimeFrame() {
		return summarizationTimeFrame;
	}

	public void setSummarizationTimeFrame(ESummarizationTimeFrame summarizationTimeFrame) {
		this.summarizationTimeFrame = summarizationTimeFrame;
	}

	public ConversationSummaryTemplateData includeInternalMessages(Boolean includeInternalMessages) {
		this.includeInternalMessages = includeInternalMessages;
		return this;
	}

	/**
	 * Specify whether internal messages should be used when generating summaries with this template. Mandatory.
	 * 
	 * @return includeInternalMessages
	 **/
	@ApiModelProperty(value = "Specify whether internal messages should be used when generating summaries with this template. Mandatory.")
	public Boolean isIncludeInternalMessages() {
		return includeInternalMessages;
	}

	public void setIncludeInternalMessages(Boolean includeInternalMessages) {
		this.includeInternalMessages = includeInternalMessages;
	}

	public ConversationSummaryTemplateData includeOnboardingMessages(Boolean includeOnboardingMessages) {
		this.includeOnboardingMessages = includeOnboardingMessages;
		return this;
	}

	/**
	 * Specify whether messages sent during onboarding should be used when generating summaries with this template. Mandatory.
	 * 
	 * @return includeOnboardingMessages
	 **/
	@ApiModelProperty(value = "Specify whether messages sent during onboarding should be used when generating summaries with this template. Mandatory.")
	public Boolean isIncludeOnboardingMessages() {
		return includeOnboardingMessages;
	}

	public void setIncludeOnboardingMessages(Boolean includeOnboardingMessages) {
		this.includeOnboardingMessages = includeOnboardingMessages;
	}

	public ConversationSummaryTemplateData includeOffboardingMessages(Boolean includeOffboardingMessages) {
		this.includeOffboardingMessages = includeOffboardingMessages;
		return this;
	}

	/**
	 * Specify whether messages sent during offboarding should be used when generating summaries with this template. Mandatory.
	 * 
	 * @return includeOffboardingMessages
	 **/
	@ApiModelProperty(value = "Specify whether messages sent during offboarding should be used when generating summaries with this template. Mandatory.")
	public Boolean isIncludeOffboardingMessages() {
		return includeOffboardingMessages;
	}

	public void setIncludeOffboardingMessages(Boolean includeOffboardingMessages) {
		this.includeOffboardingMessages = includeOffboardingMessages;
	}

	public ConversationSummaryTemplateData includeReboardingMessages(Boolean includeReboardingMessages) {
		this.includeReboardingMessages = includeReboardingMessages;
		return this;
	}

	/**
	 * Specify whether messages sent during reboarding are taken into account for the summary. Mandatory.
	 * 
	 * @return includeReboardingMessages
	 **/
	@ApiModelProperty(value = "Specify whether messages sent during reboarding are taken into account for the summary. Mandatory.")
	public Boolean isIncludeReboardingMessages() {
		return includeReboardingMessages;
	}

	public void setIncludeReboardingMessages(Boolean includeReboardingMessages) {
		this.includeReboardingMessages = includeReboardingMessages;
	}

	public ConversationSummaryTemplateData translations(Map<String, ConversationSummaryTemplateTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public ConversationSummaryTemplateData putTranslationsItem(String key, ConversationSummaryTemplateTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A map of localized versions of the name and description of this entity
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A map of localized versions of the name and description of this entity")
	public Map<String, ConversationSummaryTemplateTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, ConversationSummaryTemplateTranslation> translations) {
		this.translations = translations;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationSummaryTemplateData conversationSummaryTemplateData = (ConversationSummaryTemplateData) o;
		return Objects.equals(this.$type, conversationSummaryTemplateData.$type) &&
				Objects.equals(this.id, conversationSummaryTemplateData.id) &&
				Objects.equals(this.creationTimestamp, conversationSummaryTemplateData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, conversationSummaryTemplateData.modificationTimestamp) &&
				Objects.equals(this.version, conversationSummaryTemplateData.version) &&
				Objects.equals(this.accountId, conversationSummaryTemplateData.accountId) &&
				Objects.equals(this.name, conversationSummaryTemplateData.name) &&
				Objects.equals(this.description, conversationSummaryTemplateData.description) &&
				Objects.equals(this.reviewRequired, conversationSummaryTemplateData.reviewRequired) &&
				Objects.equals(this.reviewableBy, conversationSummaryTemplateData.reviewableBy) &&
				Objects.equals(this.visibleTo, conversationSummaryTemplateData.visibleTo) &&
				Objects.equals(this.summarizationLanguageConfiguration, conversationSummaryTemplateData.summarizationLanguageConfiguration) &&
				Objects.equals(this.specificGenerationLanguage, conversationSummaryTemplateData.specificGenerationLanguage) &&
				Objects.equals(this.promptStructure, conversationSummaryTemplateData.promptStructure) &&
				Objects.equals(this.promptCustomization, conversationSummaryTemplateData.promptCustomization) &&
				Objects.equals(this.minCharacterCountFilter, conversationSummaryTemplateData.minCharacterCountFilter) &&
				Objects.equals(this.summarizationTimeFrame, conversationSummaryTemplateData.summarizationTimeFrame) &&
				Objects.equals(this.includeInternalMessages, conversationSummaryTemplateData.includeInternalMessages) &&
				Objects.equals(this.includeOnboardingMessages, conversationSummaryTemplateData.includeOnboardingMessages) &&
				Objects.equals(this.includeOffboardingMessages, conversationSummaryTemplateData.includeOffboardingMessages) &&
				Objects.equals(this.includeReboardingMessages, conversationSummaryTemplateData.includeReboardingMessages) &&
				Objects.equals(this.translations, conversationSummaryTemplateData.translations);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, description, reviewRequired, reviewableBy, visibleTo, summarizationLanguageConfiguration, specificGenerationLanguage, promptStructure, promptCustomization, minCharacterCountFilter, summarizationTimeFrame, includeInternalMessages, includeOnboardingMessages, includeOffboardingMessages, includeReboardingMessages, translations);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationSummaryTemplateData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    reviewRequired: ").append(toIndentedString(reviewRequired)).append("\n");
		sb.append("    reviewableBy: ").append(toIndentedString(reviewableBy)).append("\n");
		sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
		sb.append("    summarizationLanguageConfiguration: ").append(toIndentedString(summarizationLanguageConfiguration)).append("\n");
		sb.append("    specificGenerationLanguage: ").append(toIndentedString(specificGenerationLanguage)).append("\n");
		sb.append("    promptStructure: ").append(toIndentedString(promptStructure)).append("\n");
		sb.append("    promptCustomization: ").append(toIndentedString(promptCustomization)).append("\n");
		sb.append("    minCharacterCountFilter: ").append(toIndentedString(minCharacterCountFilter)).append("\n");
		sb.append("    summarizationTimeFrame: ").append(toIndentedString(summarizationTimeFrame)).append("\n");
		sb.append("    includeInternalMessages: ").append(toIndentedString(includeInternalMessages)).append("\n");
		sb.append("    includeOnboardingMessages: ").append(toIndentedString(includeOnboardingMessages)).append("\n");
		sb.append("    includeOffboardingMessages: ").append(toIndentedString(includeOffboardingMessages)).append("\n");
		sb.append("    includeReboardingMessages: ").append(toIndentedString(includeReboardingMessages)).append("\n");
		sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
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
