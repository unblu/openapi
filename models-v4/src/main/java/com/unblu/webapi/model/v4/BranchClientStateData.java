
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.List;
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
 * Data model object for a branch client state
 */
@ApiModel(description = "Data model object for a branch client state")

@JsonPropertyOrder({
	BranchClientStateData.JSON_PROPERTY_$_TYPE,
	BranchClientStateData.JSON_PROPERTY_BRANCH_CLIENT_ID,
	BranchClientStateData.JSON_PROPERTY_ACCOUNT_ID,
	BranchClientStateData.JSON_PROPERTY_KEY,
	BranchClientStateData.JSON_PROPERTY_NAME,
	BranchClientStateData.JSON_PROPERTY_STATE,
	BranchClientStateData.JSON_PROPERTY_ACTIVE_CONVERSATION_ID,
	BranchClientStateData.JSON_PROPERTY_CLIENT_ISSUES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BranchClientStateData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BRANCHCLIENTSTATEDATA("BranchClientStateData");

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
			return TypeEnum.BRANCHCLIENTSTATEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BRANCHCLIENTSTATEDATA;

	public static final String JSON_PROPERTY_BRANCH_CLIENT_ID = "branchClientId";
	@JsonProperty(JSON_PROPERTY_BRANCH_CLIENT_ID)
	private String branchClientId;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_KEY = "key";
	@JsonProperty(JSON_PROPERTY_KEY)
	private String key;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private EBranchClientState state;

	public static final String JSON_PROPERTY_ACTIVE_CONVERSATION_ID = "activeConversationId";
	@JsonProperty(JSON_PROPERTY_ACTIVE_CONVERSATION_ID)
	private String activeConversationId;

	public static final String JSON_PROPERTY_CLIENT_ISSUES = "clientIssues";
	@JsonProperty(JSON_PROPERTY_CLIENT_ISSUES)
	private List<EBranchClientIssueType> clientIssues = null;

	public BranchClientStateData $type(TypeEnum $type) {
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

	public BranchClientStateData branchClientId(String branchClientId) {
		this.branchClientId = branchClientId;
		return this;
	}

	/**
	 * ID of the branch client the state belongs to
	 * 
	 * @return branchClientId
	 **/
	@ApiModelProperty(value = "ID of the branch client the state belongs to")
	public String getBranchClientId() {
		return branchClientId;
	}

	public void setBranchClientId(String branchClientId) {
		this.branchClientId = branchClientId;
	}

	public BranchClientStateData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Account ID to which the branch client state belongs to
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "Account ID to which the branch client state belongs to")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public BranchClientStateData key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * Key of the branch client the state belongs to
	 * 
	 * @return key
	 **/
	@ApiModelProperty(value = "Key of the branch client the state belongs to")
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public BranchClientStateData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the branch client the state belongs to
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the branch client the state belongs to")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BranchClientStateData state(EBranchClientState state) {
		this.state = state;
		return this;
	}

	/**
	 * Get state
	 * 
	 * @return state
	 **/
	@ApiModelProperty(value = "")
	public EBranchClientState getState() {
		return state;
	}

	public void setState(EBranchClientState state) {
		this.state = state;
	}

	public BranchClientStateData activeConversationId(String activeConversationId) {
		this.activeConversationId = activeConversationId;
		return this;
	}

	/**
	 * ID of the conversation the branch client is currently part of. If not set, the branch client is not in a conversation.
	 * 
	 * @return activeConversationId
	 **/
	@ApiModelProperty(value = "ID of the conversation the branch client is currently part of. If not set, the branch client is not in a conversation.")
	public String getActiveConversationId() {
		return activeConversationId;
	}

	public void setActiveConversationId(String activeConversationId) {
		this.activeConversationId = activeConversationId;
	}

	public BranchClientStateData clientIssues(List<EBranchClientIssueType> clientIssues) {
		this.clientIssues = clientIssues;
		return this;
	}

	public BranchClientStateData addClientIssuesItem(EBranchClientIssueType clientIssuesItem) {
		if (this.clientIssues == null) {
			this.clientIssues = new ArrayList<>();
		}
		this.clientIssues.add(clientIssuesItem);
		return this;
	}

	/**
	 * List of issues types the branch client currently has.&lt;br&gt; If there are no issues, the list is empty.
	 * 
	 * @return clientIssues
	 **/
	@ApiModelProperty(value = "List of issues types the branch client currently has.<br> If there are no issues, the list is empty.")
	public List<EBranchClientIssueType> getClientIssues() {
		return clientIssues;
	}

	public void setClientIssues(List<EBranchClientIssueType> clientIssues) {
		this.clientIssues = clientIssues;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BranchClientStateData branchClientStateData = (BranchClientStateData) o;
		return Objects.equals(this.$type, branchClientStateData.$type) &&
				Objects.equals(this.branchClientId, branchClientStateData.branchClientId) &&
				Objects.equals(this.accountId, branchClientStateData.accountId) &&
				Objects.equals(this.key, branchClientStateData.key) &&
				Objects.equals(this.name, branchClientStateData.name) &&
				Objects.equals(this.state, branchClientStateData.state) &&
				Objects.equals(this.activeConversationId, branchClientStateData.activeConversationId) &&
				Objects.equals(this.clientIssues, branchClientStateData.clientIssues);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, branchClientId, accountId, key, name, state, activeConversationId, clientIssues);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BranchClientStateData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    branchClientId: ").append(toIndentedString(branchClientId)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    activeConversationId: ").append(toIndentedString(activeConversationId)).append("\n");
		sb.append("    clientIssues: ").append(toIndentedString(clientIssues)).append("\n");
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
