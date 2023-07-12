
package com.unblu.webapi.model.v3;

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
 * CustomConversationActionData
 */

@JsonPropertyOrder({
	CustomConversationActionData.JSON_PROPERTY_$_TYPE,
	CustomConversationActionData.JSON_PROPERTY_ID,
	CustomConversationActionData.JSON_PROPERTY_CREATION_TIMESTAMP,
	CustomConversationActionData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	CustomConversationActionData.JSON_PROPERTY_VERSION,
	CustomConversationActionData.JSON_PROPERTY_ACCOUNT_ID,
	CustomConversationActionData.JSON_PROPERTY_KEY,
	CustomConversationActionData.JSON_PROPERTY_NAME,
	CustomConversationActionData.JSON_PROPERTY_DESCRIPTION,
	CustomConversationActionData.JSON_PROPERTY_TRANSLATIONS,
	CustomConversationActionData.JSON_PROPERTY_ACTION_ICON,
	CustomConversationActionData.JSON_PROPERTY_STATE,
	CustomConversationActionData.JSON_PROPERTY_TRIGGER_WEBHOOK,
	CustomConversationActionData.JSON_PROPERTY_INVOKABLE_FROM_FRONTENDS,
	CustomConversationActionData.JSON_PROPERTY_INVOKABLE_FOR_CONVERSATION_STATES,
	CustomConversationActionData.JSON_PROPERTY_INVOKABLE_FOR_PARTICIPATION_STATES,
	CustomConversationActionData.JSON_PROPERTY_INVOKABLE_BY,
	CustomConversationActionData.JSON_PROPERTY_TRIGGER_SYSTEM_MESSAGE,
	CustomConversationActionData.JSON_PROPERTY_TRIGGER_VISITOR_MOBILE_SDK_EVENT,
	CustomConversationActionData.JSON_PROPERTY_TRIGGER_VISITOR_EMBEDDED_API_EVENT,
	CustomConversationActionData.JSON_PROPERTY_TRIGGER_VISITOR_FLOATING_API_EVENT,
	CustomConversationActionData.JSON_PROPERTY_TRIGGER_AGENT_MOBILE_SDK_EVENT,
	CustomConversationActionData.JSON_PROPERTY_SORTING_ORDER,
	CustomConversationActionData.JSON_PROPERTY_TYPE,
	CustomConversationActionData.JSON_PROPERTY_ACTION_BAR_POSITION,
	CustomConversationActionData.JSON_PROPERTY_API_EVENT_TRIGGER_FILTER,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CustomConversationActionData implements CustomActionData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CUSTOMCONVERSATIONACTIONDATA("CustomConversationActionData");

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
			return TypeEnum.CUSTOMCONVERSATIONACTIONDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CUSTOMCONVERSATIONACTIONDATA;

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

	public static final String JSON_PROPERTY_INVOKABLE_FROM_FRONTENDS = "invokableFromFrontends";
	@JsonProperty(JSON_PROPERTY_INVOKABLE_FROM_FRONTENDS)
	private List<EFrontend> invokableFromFrontends = null;

	public static final String JSON_PROPERTY_INVOKABLE_FOR_CONVERSATION_STATES = "invokableForConversationStates";
	@JsonProperty(JSON_PROPERTY_INVOKABLE_FOR_CONVERSATION_STATES)
	private List<EConversationState> invokableForConversationStates = null;

	public static final String JSON_PROPERTY_INVOKABLE_FOR_PARTICIPATION_STATES = "invokableForParticipationStates";
	@JsonProperty(JSON_PROPERTY_INVOKABLE_FOR_PARTICIPATION_STATES)
	private List<EConversationParticipationState> invokableForParticipationStates = null;

	public static final String JSON_PROPERTY_INVOKABLE_BY = "invokableBy";
	@JsonProperty(JSON_PROPERTY_INVOKABLE_BY)
	private List<EConversationImpactingParticipationType> invokableBy = null;

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
	private ECustomActionType type = ECustomActionType.CONVERSATION;

	public static final String JSON_PROPERTY_ACTION_BAR_POSITION = "actionBarPosition";
	@JsonProperty(JSON_PROPERTY_ACTION_BAR_POSITION)
	private EActionBarItemPosition actionBarPosition;

	public static final String JSON_PROPERTY_API_EVENT_TRIGGER_FILTER = "apiEventTriggerFilter";
	@JsonProperty(JSON_PROPERTY_API_EVENT_TRIGGER_FILTER)
	private ECustomConversationActionEventTriggerFilter apiEventTriggerFilter;

	public CustomConversationActionData $type(TypeEnum $type) {
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

	public CustomConversationActionData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique id of the entity. When creating an entity this property can be omitted as it will be generated by the server anyway.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique id of the entity. When creating an entity this property can be omitted as it will be generated by the server anyway.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CustomConversationActionData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is stored the first time in the system. It is ignored, when sending it to the server and
	 * therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data
	 * consistency.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is stored the first time in the system. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data consistency.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public CustomConversationActionData modificationTimestamp(Long modificationTimestamp) {
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

	public CustomConversationActionData version(Long version) {
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

	public CustomConversationActionData accountId(String accountId) {
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

	public CustomConversationActionData key(String key) {
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

	public CustomConversationActionData name(String name) {
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

	public CustomConversationActionData description(String description) {
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

	public CustomConversationActionData translations(Map<String, CustomActionTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public CustomConversationActionData putTranslationsItem(String key, CustomActionTranslation translationsItem) {
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

	public CustomConversationActionData actionIcon(ExpandableField<Avatar> actionIcon) {
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

	public CustomConversationActionData state(ECustomActionState state) {
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

	public CustomConversationActionData triggerWebhook(CustomActionWebhookRegistration triggerWebhook) {
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

	public CustomConversationActionData invokableFromFrontends(List<EFrontend> invokableFromFrontends) {
		this.invokableFromFrontends = invokableFromFrontends;
		return this;
	}

	public CustomConversationActionData addInvokableFromFrontendsItem(EFrontend invokableFromFrontendsItem) {
		if (this.invokableFromFrontends == null) {
			this.invokableFromFrontends = new ArrayList<>();
		}
		this.invokableFromFrontends.add(invokableFromFrontendsItem);
		return this;
	}

	/**
	 * The frontends that the action may be invoked from
	 * 
	 * @return invokableFromFrontends
	 **/
	@ApiModelProperty(value = "The frontends that the action may be invoked from")
	public List<EFrontend> getInvokableFromFrontends() {
		return invokableFromFrontends;
	}

	public void setInvokableFromFrontends(List<EFrontend> invokableFromFrontends) {
		this.invokableFromFrontends = invokableFromFrontends;
	}

	public CustomConversationActionData invokableForConversationStates(List<EConversationState> invokableForConversationStates) {
		this.invokableForConversationStates = invokableForConversationStates;
		return this;
	}

	public CustomConversationActionData addInvokableForConversationStatesItem(EConversationState invokableForConversationStatesItem) {
		if (this.invokableForConversationStates == null) {
			this.invokableForConversationStates = new ArrayList<>();
		}
		this.invokableForConversationStates.add(invokableForConversationStatesItem);
		return this;
	}

	/**
	 * The conversation states the action may be invoked in
	 * 
	 * @return invokableForConversationStates
	 **/
	@ApiModelProperty(value = "The conversation states the action may be invoked in")
	public List<EConversationState> getInvokableForConversationStates() {
		return invokableForConversationStates;
	}

	public void setInvokableForConversationStates(List<EConversationState> invokableForConversationStates) {
		this.invokableForConversationStates = invokableForConversationStates;
	}

	public CustomConversationActionData invokableForParticipationStates(List<EConversationParticipationState> invokableForParticipationStates) {
		this.invokableForParticipationStates = invokableForParticipationStates;
		return this;
	}

	public CustomConversationActionData addInvokableForParticipationStatesItem(EConversationParticipationState invokableForParticipationStatesItem) {
		if (this.invokableForParticipationStates == null) {
			this.invokableForParticipationStates = new ArrayList<>();
		}
		this.invokableForParticipationStates.add(invokableForParticipationStatesItem);
		return this;
	}

	/**
	 * The participation states a person may invoke the action in
	 * 
	 * @return invokableForParticipationStates
	 **/
	@ApiModelProperty(value = "The participation states a person may invoke the action in")
	public List<EConversationParticipationState> getInvokableForParticipationStates() {
		return invokableForParticipationStates;
	}

	public void setInvokableForParticipationStates(List<EConversationParticipationState> invokableForParticipationStates) {
		this.invokableForParticipationStates = invokableForParticipationStates;
	}

	public CustomConversationActionData invokableBy(List<EConversationImpactingParticipationType> invokableBy) {
		this.invokableBy = invokableBy;
		return this;
	}

	public CustomConversationActionData addInvokableByItem(EConversationImpactingParticipationType invokableByItem) {
		if (this.invokableBy == null) {
			this.invokableBy = new ArrayList<>();
		}
		this.invokableBy.add(invokableByItem);
		return this;
	}

	/**
	 * The types of participant who may invoke the action
	 * 
	 * @return invokableBy
	 **/
	@ApiModelProperty(value = "The types of participant who may invoke the action")
	public List<EConversationImpactingParticipationType> getInvokableBy() {
		return invokableBy;
	}

	public void setInvokableBy(List<EConversationImpactingParticipationType> invokableBy) {
		this.invokableBy = invokableBy;
	}

	public CustomConversationActionData triggerSystemMessage(Boolean triggerSystemMessage) {
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

	public CustomConversationActionData triggerVisitorMobileSdkEvent(Boolean triggerVisitorMobileSdkEvent) {
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

	public CustomConversationActionData triggerVisitorEmbeddedApiEvent(Boolean triggerVisitorEmbeddedApiEvent) {
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

	public CustomConversationActionData triggerVisitorFloatingApiEvent(Boolean triggerVisitorFloatingApiEvent) {
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

	public CustomConversationActionData triggerAgentMobileSdkEvent(Boolean triggerAgentMobileSdkEvent) {
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

	public CustomConversationActionData sortingOrder(Integer sortingOrder) {
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

	public CustomConversationActionData type(ECustomActionType type) {
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

	public CustomConversationActionData actionBarPosition(EActionBarItemPosition actionBarPosition) {
		this.actionBarPosition = actionBarPosition;
		return this;
	}

	/**
	 * Get actionBarPosition
	 * 
	 * @return actionBarPosition
	 **/
	@ApiModelProperty(value = "")
	public EActionBarItemPosition getActionBarPosition() {
		return actionBarPosition;
	}

	public void setActionBarPosition(EActionBarItemPosition actionBarPosition) {
		this.actionBarPosition = actionBarPosition;
	}

	public CustomConversationActionData apiEventTriggerFilter(ECustomConversationActionEventTriggerFilter apiEventTriggerFilter) {
		this.apiEventTriggerFilter = apiEventTriggerFilter;
		return this;
	}

	/**
	 * Get apiEventTriggerFilter
	 * 
	 * @return apiEventTriggerFilter
	 **/
	@ApiModelProperty(value = "")
	public ECustomConversationActionEventTriggerFilter getApiEventTriggerFilter() {
		return apiEventTriggerFilter;
	}

	public void setApiEventTriggerFilter(ECustomConversationActionEventTriggerFilter apiEventTriggerFilter) {
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
		CustomConversationActionData customConversationActionData = (CustomConversationActionData) o;
		return Objects.equals(this.$type, customConversationActionData.$type) &&
				Objects.equals(this.id, customConversationActionData.id) &&
				Objects.equals(this.creationTimestamp, customConversationActionData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, customConversationActionData.modificationTimestamp) &&
				Objects.equals(this.version, customConversationActionData.version) &&
				Objects.equals(this.accountId, customConversationActionData.accountId) &&
				Objects.equals(this.key, customConversationActionData.key) &&
				Objects.equals(this.name, customConversationActionData.name) &&
				Objects.equals(this.description, customConversationActionData.description) &&
				Objects.equals(this.translations, customConversationActionData.translations) &&
				Objects.equals(this.actionIcon, customConversationActionData.actionIcon) &&
				Objects.equals(this.state, customConversationActionData.state) &&
				Objects.equals(this.triggerWebhook, customConversationActionData.triggerWebhook) &&
				Objects.equals(this.invokableFromFrontends, customConversationActionData.invokableFromFrontends) &&
				Objects.equals(this.invokableForConversationStates, customConversationActionData.invokableForConversationStates) &&
				Objects.equals(this.invokableForParticipationStates, customConversationActionData.invokableForParticipationStates) &&
				Objects.equals(this.invokableBy, customConversationActionData.invokableBy) &&
				Objects.equals(this.triggerSystemMessage, customConversationActionData.triggerSystemMessage) &&
				Objects.equals(this.triggerVisitorMobileSdkEvent, customConversationActionData.triggerVisitorMobileSdkEvent) &&
				Objects.equals(this.triggerVisitorEmbeddedApiEvent, customConversationActionData.triggerVisitorEmbeddedApiEvent) &&
				Objects.equals(this.triggerVisitorFloatingApiEvent, customConversationActionData.triggerVisitorFloatingApiEvent) &&
				Objects.equals(this.triggerAgentMobileSdkEvent, customConversationActionData.triggerAgentMobileSdkEvent) &&
				Objects.equals(this.sortingOrder, customConversationActionData.sortingOrder) &&
				Objects.equals(this.type, customConversationActionData.type) &&
				Objects.equals(this.actionBarPosition, customConversationActionData.actionBarPosition) &&
				Objects.equals(this.apiEventTriggerFilter, customConversationActionData.apiEventTriggerFilter);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, key, name, description, translations, actionIcon, state, triggerWebhook, invokableFromFrontends, invokableForConversationStates, invokableForParticipationStates, invokableBy, triggerSystemMessage, triggerVisitorMobileSdkEvent, triggerVisitorEmbeddedApiEvent, triggerVisitorFloatingApiEvent, triggerAgentMobileSdkEvent, sortingOrder, type, actionBarPosition, apiEventTriggerFilter);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomConversationActionData {\n");
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
		sb.append("    invokableFromFrontends: ").append(toIndentedString(invokableFromFrontends)).append("\n");
		sb.append("    invokableForConversationStates: ").append(toIndentedString(invokableForConversationStates)).append("\n");
		sb.append("    invokableForParticipationStates: ").append(toIndentedString(invokableForParticipationStates)).append("\n");
		sb.append("    invokableBy: ").append(toIndentedString(invokableBy)).append("\n");
		sb.append("    triggerSystemMessage: ").append(toIndentedString(triggerSystemMessage)).append("\n");
		sb.append("    triggerVisitorMobileSdkEvent: ").append(toIndentedString(triggerVisitorMobileSdkEvent)).append("\n");
		sb.append("    triggerVisitorEmbeddedApiEvent: ").append(toIndentedString(triggerVisitorEmbeddedApiEvent)).append("\n");
		sb.append("    triggerVisitorFloatingApiEvent: ").append(toIndentedString(triggerVisitorFloatingApiEvent)).append("\n");
		sb.append("    triggerAgentMobileSdkEvent: ").append(toIndentedString(triggerAgentMobileSdkEvent)).append("\n");
		sb.append("    sortingOrder: ").append(toIndentedString(sortingOrder)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    actionBarPosition: ").append(toIndentedString(actionBarPosition)).append("\n");
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
