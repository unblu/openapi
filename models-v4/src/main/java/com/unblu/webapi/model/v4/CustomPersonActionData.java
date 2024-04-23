
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

import io.swagger.annotations.ApiModelProperty;

/**
 * CustomPersonActionData
 */

@JsonPropertyOrder({
	CustomPersonActionData.JSON_PROPERTY_$_TYPE,
	CustomPersonActionData.JSON_PROPERTY_ID,
	CustomPersonActionData.JSON_PROPERTY_CREATION_TIMESTAMP,
	CustomPersonActionData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	CustomPersonActionData.JSON_PROPERTY_VERSION,
	CustomPersonActionData.JSON_PROPERTY_ACCOUNT_ID,
	CustomPersonActionData.JSON_PROPERTY_KEY,
	CustomPersonActionData.JSON_PROPERTY_NAME,
	CustomPersonActionData.JSON_PROPERTY_DESCRIPTION,
	CustomPersonActionData.JSON_PROPERTY_TRANSLATIONS,
	CustomPersonActionData.JSON_PROPERTY_ACTION_ICON,
	CustomPersonActionData.JSON_PROPERTY_STATE,
	CustomPersonActionData.JSON_PROPERTY_TRIGGER_WEBHOOK,
	CustomPersonActionData.JSON_PROPERTY_INVOCABLE_FROM_FRONTENDS,
	CustomPersonActionData.JSON_PROPERTY_INVOCABLE_FOR_CONVERSATION_STATES,
	CustomPersonActionData.JSON_PROPERTY_INVOCABLE_FOR_PARTICIPATION_STATES,
	CustomPersonActionData.JSON_PROPERTY_INVOCABLE_BY,
	CustomPersonActionData.JSON_PROPERTY_TRIGGER_SYSTEM_MESSAGE,
	CustomPersonActionData.JSON_PROPERTY_TRIGGER_VISITOR_MOBILE_SDK_EVENT,
	CustomPersonActionData.JSON_PROPERTY_TRIGGER_VISITOR_EMBEDDED_API_EVENT,
	CustomPersonActionData.JSON_PROPERTY_TRIGGER_VISITOR_FLOATING_API_EVENT,
	CustomPersonActionData.JSON_PROPERTY_TRIGGER_AGENT_MOBILE_SDK_EVENT,
	CustomPersonActionData.JSON_PROPERTY_SORTING_ORDER,
	CustomPersonActionData.JSON_PROPERTY_TYPE,
	CustomPersonActionData.JSON_PROPERTY_AVAILABLE_FOR_TARGET_PERSON_TYPES,
	CustomPersonActionData.JSON_PROPERTY_AVAILABLE_FOR_TARGET_FRONTENDS,
	CustomPersonActionData.JSON_PROPERTY_API_EVENT_TRIGGER_FILTER,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CustomPersonActionData implements CustomActionData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CUSTOMPERSONACTIONDATA("CustomPersonActionData");

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
			return TypeEnum.CUSTOMPERSONACTIONDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CUSTOMPERSONACTIONDATA;

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

	public static final String JSON_PROPERTY_KEY = "key";
	@JsonProperty(JSON_PROPERTY_KEY)
	private String key;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
	@JsonProperty(JSON_PROPERTY_TRANSLATIONS)
	private Map<String, CustomActionTranslation> translations = null;

	public static final String JSON_PROPERTY_ACTION_ICON = "actionIcon";
	@JsonProperty(JSON_PROPERTY_ACTION_ICON)
	private ExpandableField<Avatar> actionIcon = null;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private ECustomActionState state;

	public static final String JSON_PROPERTY_TRIGGER_WEBHOOK = "triggerWebhook";
	@JsonProperty(JSON_PROPERTY_TRIGGER_WEBHOOK)
	private CustomActionWebhookRegistration triggerWebhook = null;

	public static final String JSON_PROPERTY_INVOCABLE_FROM_FRONTENDS = "invocableFromFrontends";
	@JsonProperty(JSON_PROPERTY_INVOCABLE_FROM_FRONTENDS)
	private List<EFrontend> invocableFromFrontends = null;

	public static final String JSON_PROPERTY_INVOCABLE_FOR_CONVERSATION_STATES = "invocableForConversationStates";
	@JsonProperty(JSON_PROPERTY_INVOCABLE_FOR_CONVERSATION_STATES)
	private List<EConversationState> invocableForConversationStates = null;

	public static final String JSON_PROPERTY_INVOCABLE_FOR_PARTICIPATION_STATES = "invocableForParticipationStates";
	@JsonProperty(JSON_PROPERTY_INVOCABLE_FOR_PARTICIPATION_STATES)
	private List<EConversationParticipationState> invocableForParticipationStates = null;

	public static final String JSON_PROPERTY_INVOCABLE_BY = "invocableBy";
	@JsonProperty(JSON_PROPERTY_INVOCABLE_BY)
	private List<EConversationImpactingParticipationType> invocableBy = null;

	public static final String JSON_PROPERTY_TRIGGER_SYSTEM_MESSAGE = "triggerSystemMessage";
	@JsonProperty(JSON_PROPERTY_TRIGGER_SYSTEM_MESSAGE)
	private Boolean triggerSystemMessage;

	public static final String JSON_PROPERTY_TRIGGER_VISITOR_MOBILE_SDK_EVENT = "triggerVisitorMobileSdkEvent";
	@JsonProperty(JSON_PROPERTY_TRIGGER_VISITOR_MOBILE_SDK_EVENT)
	private Boolean triggerVisitorMobileSdkEvent;

	public static final String JSON_PROPERTY_TRIGGER_VISITOR_EMBEDDED_API_EVENT = "triggerVisitorEmbeddedApiEvent";
	@JsonProperty(JSON_PROPERTY_TRIGGER_VISITOR_EMBEDDED_API_EVENT)
	private Boolean triggerVisitorEmbeddedApiEvent;

	public static final String JSON_PROPERTY_TRIGGER_VISITOR_FLOATING_API_EVENT = "triggerVisitorFloatingApiEvent";
	@JsonProperty(JSON_PROPERTY_TRIGGER_VISITOR_FLOATING_API_EVENT)
	private Boolean triggerVisitorFloatingApiEvent;

	public static final String JSON_PROPERTY_TRIGGER_AGENT_MOBILE_SDK_EVENT = "triggerAgentMobileSdkEvent";
	@JsonProperty(JSON_PROPERTY_TRIGGER_AGENT_MOBILE_SDK_EVENT)
	private Boolean triggerAgentMobileSdkEvent;

	public static final String JSON_PROPERTY_SORTING_ORDER = "sortingOrder";
	@JsonProperty(JSON_PROPERTY_SORTING_ORDER)
	private Integer sortingOrder;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ECustomActionType type = ECustomActionType.PERSON;

	public static final String JSON_PROPERTY_AVAILABLE_FOR_TARGET_PERSON_TYPES = "availableForTargetPersonTypes";
	@JsonProperty(JSON_PROPERTY_AVAILABLE_FOR_TARGET_PERSON_TYPES)
	private List<ECustomPersonActionTargetPersonType> availableForTargetPersonTypes = null;

	public static final String JSON_PROPERTY_AVAILABLE_FOR_TARGET_FRONTENDS = "availableForTargetFrontends";
	@JsonProperty(JSON_PROPERTY_AVAILABLE_FOR_TARGET_FRONTENDS)
	private List<EFrontend> availableForTargetFrontends = null;

	public static final String JSON_PROPERTY_API_EVENT_TRIGGER_FILTER = "apiEventTriggerFilter";
	@JsonProperty(JSON_PROPERTY_API_EVENT_TRIGGER_FILTER)
	private ECustomPersonActionEventTriggerFilter apiEventTriggerFilter;

	public CustomPersonActionData $type(TypeEnum $type) {
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

	public CustomPersonActionData id(String id) {
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

	public CustomPersonActionData creationTimestamp(Long creationTimestamp) {
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

	public CustomPersonActionData modificationTimestamp(Long modificationTimestamp) {
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

	public CustomPersonActionData version(Long version) {
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

	public CustomPersonActionData accountId(String accountId) {
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

	public CustomPersonActionData key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * The unique key of the action
	 * 
	 * @return key
	 **/
	@ApiModelProperty(value = "The unique key of the action")
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public CustomPersonActionData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The name of the custom action. Maximum of 250 characters. Can not be omitted.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "The name of the custom action. Maximum of 250 characters. Can not be omitted.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CustomPersonActionData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The description of the custom action. Maximum of 500 characters. Can be omitted.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "The description of the custom action. Maximum of 500 characters. Can be omitted.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CustomPersonActionData translations(Map<String, CustomActionTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public CustomPersonActionData putTranslationsItem(String key, CustomActionTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A map of localized versions of the name and description of this custom action
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A map of localized versions of the name and description of this custom action")
	public Map<String, CustomActionTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, CustomActionTranslation> translations) {
		this.translations = translations;
	}

	public CustomPersonActionData actionIcon(ExpandableField<Avatar> actionIcon) {
		this.actionIcon = actionIcon;
		return this;
	}

	/**
	 * The avatar ID of the avatar used as the action&#39;s icon. The ID can be expanded.
	 * 
	 * @return actionIcon
	 **/
	@ApiModelProperty(value = "The avatar ID of the avatar used as the action's icon. The ID can be expanded.")
	public ExpandableField<Avatar> getActionIcon() {
		return actionIcon;
	}

	public void setActionIcon(ExpandableField<Avatar> actionIcon) {
		this.actionIcon = actionIcon;
	}

	public CustomPersonActionData state(ECustomActionState state) {
		this.state = state;
		return this;
	}

	/**
	 * Get state
	 * 
	 * @return state
	 **/
	@ApiModelProperty(value = "")
	public ECustomActionState getState() {
		return state;
	}

	public void setState(ECustomActionState state) {
		this.state = state;
	}

	public CustomPersonActionData triggerWebhook(CustomActionWebhookRegistration triggerWebhook) {
		this.triggerWebhook = triggerWebhook;
		return this;
	}

	/**
	 * Get triggerWebhook
	 * 
	 * @return triggerWebhook
	 **/
	@ApiModelProperty(value = "")
	public CustomActionWebhookRegistration getTriggerWebhook() {
		return triggerWebhook;
	}

	public void setTriggerWebhook(CustomActionWebhookRegistration triggerWebhook) {
		this.triggerWebhook = triggerWebhook;
	}

	public CustomPersonActionData invocableFromFrontends(List<EFrontend> invocableFromFrontends) {
		this.invocableFromFrontends = invocableFromFrontends;
		return this;
	}

	public CustomPersonActionData addInvocableFromFrontendsItem(EFrontend invocableFromFrontendsItem) {
		if (this.invocableFromFrontends == null) {
			this.invocableFromFrontends = new ArrayList<>();
		}
		this.invocableFromFrontends.add(invocableFromFrontendsItem);
		return this;
	}

	/**
	 * The frontends that the action may be invoked from
	 * 
	 * @return invocableFromFrontends
	 **/
	@ApiModelProperty(value = "The frontends that the action may be invoked from")
	public List<EFrontend> getInvocableFromFrontends() {
		return invocableFromFrontends;
	}

	public void setInvocableFromFrontends(List<EFrontend> invocableFromFrontends) {
		this.invocableFromFrontends = invocableFromFrontends;
	}

	public CustomPersonActionData invocableForConversationStates(List<EConversationState> invocableForConversationStates) {
		this.invocableForConversationStates = invocableForConversationStates;
		return this;
	}

	public CustomPersonActionData addInvocableForConversationStatesItem(EConversationState invocableForConversationStatesItem) {
		if (this.invocableForConversationStates == null) {
			this.invocableForConversationStates = new ArrayList<>();
		}
		this.invocableForConversationStates.add(invocableForConversationStatesItem);
		return this;
	}

	/**
	 * The conversation states the action may be invoked in
	 * 
	 * @return invocableForConversationStates
	 **/
	@ApiModelProperty(value = "The conversation states the action may be invoked in")
	public List<EConversationState> getInvocableForConversationStates() {
		return invocableForConversationStates;
	}

	public void setInvocableForConversationStates(List<EConversationState> invocableForConversationStates) {
		this.invocableForConversationStates = invocableForConversationStates;
	}

	public CustomPersonActionData invocableForParticipationStates(List<EConversationParticipationState> invocableForParticipationStates) {
		this.invocableForParticipationStates = invocableForParticipationStates;
		return this;
	}

	public CustomPersonActionData addInvocableForParticipationStatesItem(EConversationParticipationState invocableForParticipationStatesItem) {
		if (this.invocableForParticipationStates == null) {
			this.invocableForParticipationStates = new ArrayList<>();
		}
		this.invocableForParticipationStates.add(invocableForParticipationStatesItem);
		return this;
	}

	/**
	 * The participation states a person may invoke the action in
	 * 
	 * @return invocableForParticipationStates
	 **/
	@ApiModelProperty(value = "The participation states a person may invoke the action in")
	public List<EConversationParticipationState> getInvocableForParticipationStates() {
		return invocableForParticipationStates;
	}

	public void setInvocableForParticipationStates(List<EConversationParticipationState> invocableForParticipationStates) {
		this.invocableForParticipationStates = invocableForParticipationStates;
	}

	public CustomPersonActionData invocableBy(List<EConversationImpactingParticipationType> invocableBy) {
		this.invocableBy = invocableBy;
		return this;
	}

	public CustomPersonActionData addInvocableByItem(EConversationImpactingParticipationType invocableByItem) {
		if (this.invocableBy == null) {
			this.invocableBy = new ArrayList<>();
		}
		this.invocableBy.add(invocableByItem);
		return this;
	}

	/**
	 * The types of participant who may invoke the action
	 * 
	 * @return invocableBy
	 **/
	@ApiModelProperty(value = "The types of participant who may invoke the action")
	public List<EConversationImpactingParticipationType> getInvocableBy() {
		return invocableBy;
	}

	public void setInvocableBy(List<EConversationImpactingParticipationType> invocableBy) {
		this.invocableBy = invocableBy;
	}

	public CustomPersonActionData triggerSystemMessage(Boolean triggerSystemMessage) {
		this.triggerSystemMessage = triggerSystemMessage;
		return this;
	}

	/**
	 * A flag indicating whether the action should trigger a system message. The default value is true.
	 * 
	 * @return triggerSystemMessage
	 **/
	@ApiModelProperty(value = "A flag indicating whether the action should trigger a system message. The default value is true.")
	public Boolean isTriggerSystemMessage() {
		return triggerSystemMessage;
	}

	public void setTriggerSystemMessage(Boolean triggerSystemMessage) {
		this.triggerSystemMessage = triggerSystemMessage;
	}

	public CustomPersonActionData triggerVisitorMobileSdkEvent(Boolean triggerVisitorMobileSdkEvent) {
		this.triggerVisitorMobileSdkEvent = triggerVisitorMobileSdkEvent;
		return this;
	}

	/**
	 * A flag indicating whether the action should trigger a visitor mobile SDK event. The default value is false.
	 * 
	 * @return triggerVisitorMobileSdkEvent
	 **/
	@ApiModelProperty(value = "A flag indicating whether the action should trigger a visitor mobile SDK event. The default value is false.")
	public Boolean isTriggerVisitorMobileSdkEvent() {
		return triggerVisitorMobileSdkEvent;
	}

	public void setTriggerVisitorMobileSdkEvent(Boolean triggerVisitorMobileSdkEvent) {
		this.triggerVisitorMobileSdkEvent = triggerVisitorMobileSdkEvent;
	}

	public CustomPersonActionData triggerVisitorEmbeddedApiEvent(Boolean triggerVisitorEmbeddedApiEvent) {
		this.triggerVisitorEmbeddedApiEvent = triggerVisitorEmbeddedApiEvent;
		return this;
	}

	/**
	 * A flag indicating whether the action should trigger an Embedded JS API event. The default value is false.
	 * 
	 * @return triggerVisitorEmbeddedApiEvent
	 **/
	@ApiModelProperty(value = "A flag indicating whether the action should trigger an Embedded JS API event. The default value is false.")
	public Boolean isTriggerVisitorEmbeddedApiEvent() {
		return triggerVisitorEmbeddedApiEvent;
	}

	public void setTriggerVisitorEmbeddedApiEvent(Boolean triggerVisitorEmbeddedApiEvent) {
		this.triggerVisitorEmbeddedApiEvent = triggerVisitorEmbeddedApiEvent;
	}

	public CustomPersonActionData triggerVisitorFloatingApiEvent(Boolean triggerVisitorFloatingApiEvent) {
		this.triggerVisitorFloatingApiEvent = triggerVisitorFloatingApiEvent;
		return this;
	}

	/**
	 * A flag indicating whether the action should trigger a Visitor JS API event. The default value is false.
	 * 
	 * @return triggerVisitorFloatingApiEvent
	 **/
	@ApiModelProperty(value = "A flag indicating whether the action should trigger a Visitor JS API event. The default value is false.")
	public Boolean isTriggerVisitorFloatingApiEvent() {
		return triggerVisitorFloatingApiEvent;
	}

	public void setTriggerVisitorFloatingApiEvent(Boolean triggerVisitorFloatingApiEvent) {
		this.triggerVisitorFloatingApiEvent = triggerVisitorFloatingApiEvent;
	}

	public CustomPersonActionData triggerAgentMobileSdkEvent(Boolean triggerAgentMobileSdkEvent) {
		this.triggerAgentMobileSdkEvent = triggerAgentMobileSdkEvent;
		return this;
	}

	/**
	 * A flag indicating whether the action should trigger an agent mobile SDK event. The default value is false.
	 * 
	 * @return triggerAgentMobileSdkEvent
	 **/
	@ApiModelProperty(value = "A flag indicating whether the action should trigger an agent mobile SDK event. The default value is false.")
	public Boolean isTriggerAgentMobileSdkEvent() {
		return triggerAgentMobileSdkEvent;
	}

	public void setTriggerAgentMobileSdkEvent(Boolean triggerAgentMobileSdkEvent) {
		this.triggerAgentMobileSdkEvent = triggerAgentMobileSdkEvent;
	}

	public CustomPersonActionData sortingOrder(Integer sortingOrder) {
		this.sortingOrder = sortingOrder;
		return this;
	}

	/**
	 * The sorting order within the custom actions when displayed in the action bar. The default value is 5.
	 * 
	 * @return sortingOrder
	 **/
	@ApiModelProperty(value = "The sorting order within the custom actions when displayed in the action bar. The default value is 5.")
	public Integer getSortingOrder() {
		return sortingOrder;
	}

	public void setSortingOrder(Integer sortingOrder) {
		this.sortingOrder = sortingOrder;
	}

	public CustomPersonActionData type(ECustomActionType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public ECustomActionType getType() {
		return type;
	}

	public void setType(ECustomActionType type) {
		this.type = type;
	}

	public CustomPersonActionData availableForTargetPersonTypes(List<ECustomPersonActionTargetPersonType> availableForTargetPersonTypes) {
		this.availableForTargetPersonTypes = availableForTargetPersonTypes;
		return this;
	}

	public CustomPersonActionData addAvailableForTargetPersonTypesItem(ECustomPersonActionTargetPersonType availableForTargetPersonTypesItem) {
		if (this.availableForTargetPersonTypes == null) {
			this.availableForTargetPersonTypes = new ArrayList<>();
		}
		this.availableForTargetPersonTypes.add(availableForTargetPersonTypesItem);
		return this;
	}

	/**
	 * The person types the action can be invoked on
	 * 
	 * @return availableForTargetPersonTypes
	 **/
	@ApiModelProperty(value = "The person types the action can be invoked on")
	public List<ECustomPersonActionTargetPersonType> getAvailableForTargetPersonTypes() {
		return availableForTargetPersonTypes;
	}

	public void setAvailableForTargetPersonTypes(List<ECustomPersonActionTargetPersonType> availableForTargetPersonTypes) {
		this.availableForTargetPersonTypes = availableForTargetPersonTypes;
	}

	public CustomPersonActionData availableForTargetFrontends(List<EFrontend> availableForTargetFrontends) {
		this.availableForTargetFrontends = availableForTargetFrontends;
		return this;
	}

	public CustomPersonActionData addAvailableForTargetFrontendsItem(EFrontend availableForTargetFrontendsItem) {
		if (this.availableForTargetFrontends == null) {
			this.availableForTargetFrontends = new ArrayList<>();
		}
		this.availableForTargetFrontends.add(availableForTargetFrontendsItem);
		return this;
	}

	/**
	 * The frontends of the person the action can be invoked on. If omitted, the action can be invoked on any of the target person&#39;s frontends, even if they
	 * aren&#39;t present in the conversation at that time.
	 * 
	 * @return availableForTargetFrontends
	 **/
	@ApiModelProperty(value = "The frontends of the person the action can be invoked on. If omitted, the action can be invoked on any of the target person's frontends, even if they aren't present in the conversation at that time.")
	public List<EFrontend> getAvailableForTargetFrontends() {
		return availableForTargetFrontends;
	}

	public void setAvailableForTargetFrontends(List<EFrontend> availableForTargetFrontends) {
		this.availableForTargetFrontends = availableForTargetFrontends;
	}

	public CustomPersonActionData apiEventTriggerFilter(ECustomPersonActionEventTriggerFilter apiEventTriggerFilter) {
		this.apiEventTriggerFilter = apiEventTriggerFilter;
		return this;
	}

	/**
	 * Get apiEventTriggerFilter
	 * 
	 * @return apiEventTriggerFilter
	 **/
	@ApiModelProperty(value = "")
	public ECustomPersonActionEventTriggerFilter getApiEventTriggerFilter() {
		return apiEventTriggerFilter;
	}

	public void setApiEventTriggerFilter(ECustomPersonActionEventTriggerFilter apiEventTriggerFilter) {
		this.apiEventTriggerFilter = apiEventTriggerFilter;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CustomPersonActionData customPersonActionData = (CustomPersonActionData) o;
		return Objects.equals(this.$type, customPersonActionData.$type) &&
				Objects.equals(this.id, customPersonActionData.id) &&
				Objects.equals(this.creationTimestamp, customPersonActionData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, customPersonActionData.modificationTimestamp) &&
				Objects.equals(this.version, customPersonActionData.version) &&
				Objects.equals(this.accountId, customPersonActionData.accountId) &&
				Objects.equals(this.key, customPersonActionData.key) &&
				Objects.equals(this.name, customPersonActionData.name) &&
				Objects.equals(this.description, customPersonActionData.description) &&
				Objects.equals(this.translations, customPersonActionData.translations) &&
				Objects.equals(this.actionIcon, customPersonActionData.actionIcon) &&
				Objects.equals(this.state, customPersonActionData.state) &&
				Objects.equals(this.triggerWebhook, customPersonActionData.triggerWebhook) &&
				Objects.equals(this.invocableFromFrontends, customPersonActionData.invocableFromFrontends) &&
				Objects.equals(this.invocableForConversationStates, customPersonActionData.invocableForConversationStates) &&
				Objects.equals(this.invocableForParticipationStates, customPersonActionData.invocableForParticipationStates) &&
				Objects.equals(this.invocableBy, customPersonActionData.invocableBy) &&
				Objects.equals(this.triggerSystemMessage, customPersonActionData.triggerSystemMessage) &&
				Objects.equals(this.triggerVisitorMobileSdkEvent, customPersonActionData.triggerVisitorMobileSdkEvent) &&
				Objects.equals(this.triggerVisitorEmbeddedApiEvent, customPersonActionData.triggerVisitorEmbeddedApiEvent) &&
				Objects.equals(this.triggerVisitorFloatingApiEvent, customPersonActionData.triggerVisitorFloatingApiEvent) &&
				Objects.equals(this.triggerAgentMobileSdkEvent, customPersonActionData.triggerAgentMobileSdkEvent) &&
				Objects.equals(this.sortingOrder, customPersonActionData.sortingOrder) &&
				Objects.equals(this.type, customPersonActionData.type) &&
				Objects.equals(this.availableForTargetPersonTypes, customPersonActionData.availableForTargetPersonTypes) &&
				Objects.equals(this.availableForTargetFrontends, customPersonActionData.availableForTargetFrontends) &&
				Objects.equals(this.apiEventTriggerFilter, customPersonActionData.apiEventTriggerFilter);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, key, name, description, translations, actionIcon, state, triggerWebhook, invocableFromFrontends, invocableForConversationStates, invocableForParticipationStates, invocableBy, triggerSystemMessage, triggerVisitorMobileSdkEvent, triggerVisitorEmbeddedApiEvent, triggerVisitorFloatingApiEvent, triggerAgentMobileSdkEvent, sortingOrder, type, availableForTargetPersonTypes, availableForTargetFrontends, apiEventTriggerFilter);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomPersonActionData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
		sb.append("    actionIcon: ").append(toIndentedString(actionIcon)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    triggerWebhook: ").append(toIndentedString(triggerWebhook)).append("\n");
		sb.append("    invocableFromFrontends: ").append(toIndentedString(invocableFromFrontends)).append("\n");
		sb.append("    invocableForConversationStates: ").append(toIndentedString(invocableForConversationStates)).append("\n");
		sb.append("    invocableForParticipationStates: ").append(toIndentedString(invocableForParticipationStates)).append("\n");
		sb.append("    invocableBy: ").append(toIndentedString(invocableBy)).append("\n");
		sb.append("    triggerSystemMessage: ").append(toIndentedString(triggerSystemMessage)).append("\n");
		sb.append("    triggerVisitorMobileSdkEvent: ").append(toIndentedString(triggerVisitorMobileSdkEvent)).append("\n");
		sb.append("    triggerVisitorEmbeddedApiEvent: ").append(toIndentedString(triggerVisitorEmbeddedApiEvent)).append("\n");
		sb.append("    triggerVisitorFloatingApiEvent: ").append(toIndentedString(triggerVisitorFloatingApiEvent)).append("\n");
		sb.append("    triggerAgentMobileSdkEvent: ").append(toIndentedString(triggerAgentMobileSdkEvent)).append("\n");
		sb.append("    sortingOrder: ").append(toIndentedString(sortingOrder)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    availableForTargetPersonTypes: ").append(toIndentedString(availableForTargetPersonTypes)).append("\n");
		sb.append("    availableForTargetFrontends: ").append(toIndentedString(availableForTargetFrontends)).append("\n");
		sb.append("    apiEventTriggerFilter: ").append(toIndentedString(apiEventTriggerFilter)).append("\n");
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
