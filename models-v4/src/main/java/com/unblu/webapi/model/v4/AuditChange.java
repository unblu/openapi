
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
 * Represents a change in the database captured by &#x60;AuditPersistenceListener&#x60; and stored by &#x60;AuditKafkaConsumer&#x60;.
 */
@ApiModel(description = "Represents a change in the database captured by `AuditPersistenceListener` and stored by `AuditKafkaConsumer`.")

@JsonPropertyOrder({
	AuditChange.JSON_PROPERTY_$_TYPE,
	AuditChange.JSON_PROPERTY_ID,
	AuditChange.JSON_PROPERTY_CREATION_TIMESTAMP,
	AuditChange.JSON_PROPERTY_ACCOUNT_ID,
	AuditChange.JSON_PROPERTY_INTERACTION_TYPE,
	AuditChange.JSON_PROPERTY_INTERACTION_NAME,
	AuditChange.JSON_PROPERTY_USER_NAME,
	AuditChange.JSON_PROPERTY_USER_ID,
	AuditChange.JSON_PROPERTY_USER_ROLE,
	AuditChange.JSON_PROPERTY_USER_ANONYMOUS,
	AuditChange.JSON_PROPERTY_USER_VIRTUAL,
	AuditChange.JSON_PROPERTY_USER_PROPAGATED,
	AuditChange.JSON_PROPERTY_USER_IMPERSONATION_TYPE,
	AuditChange.JSON_PROPERTY_IMPERSONATION_ACCOUNT_ID,
	AuditChange.JSON_PROPERTY_IMPERSONATION_USER_ID,
	AuditChange.JSON_PROPERTY_USER_AUTH_INFO,
	AuditChange.JSON_PROPERTY_SOURCE_IP,
	AuditChange.JSON_PROPERTY_PRODUCT_VERSION,
	AuditChange.JSON_PROPERTY_CHANGE_TYPE,
	AuditChange.JSON_PROPERTY_ENTITY_TYPE,
	AuditChange.JSON_PROPERTY_ENTITY_NAME,
	AuditChange.JSON_PROPERTY_ENTITY_ID,
	AuditChange.JSON_PROPERTY_OLD_STATE,
	AuditChange.JSON_PROPERTY_NEW_STATE,
	AuditChange.JSON_PROPERTY_OWNER_TYPE,
	AuditChange.JSON_PROPERTY_OWNER_ID,
	AuditChange.JSON_PROPERTY_OWNER_ENTITY,
	AuditChange.JSON_PROPERTY_GLOBAL_CHANGE,
	AuditChange.JSON_PROPERTY_ACCOUNT_CHANGE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AuditChange {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AUDITCHANGE("AuditChange");

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
			return TypeEnum.AUDITCHANGE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AUDITCHANGE;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_INTERACTION_TYPE = "interactionType";
	@JsonProperty(JSON_PROPERTY_INTERACTION_TYPE)
	private AuditInteractionType interactionType;

	public static final String JSON_PROPERTY_INTERACTION_NAME = "interactionName";
	@JsonProperty(JSON_PROPERTY_INTERACTION_NAME)
	private String interactionName;

	public static final String JSON_PROPERTY_USER_NAME = "userName";
	@JsonProperty(JSON_PROPERTY_USER_NAME)
	private String userName;

	public static final String JSON_PROPERTY_USER_ID = "userId";
	@JsonProperty(JSON_PROPERTY_USER_ID)
	private String userId;

	public static final String JSON_PROPERTY_USER_ROLE = "userRole";
	@JsonProperty(JSON_PROPERTY_USER_ROLE)
	private String userRole;

	public static final String JSON_PROPERTY_USER_ANONYMOUS = "userAnonymous";
	@JsonProperty(JSON_PROPERTY_USER_ANONYMOUS)
	private Boolean userAnonymous;

	public static final String JSON_PROPERTY_USER_VIRTUAL = "userVirtual";
	@JsonProperty(JSON_PROPERTY_USER_VIRTUAL)
	private Boolean userVirtual;

	public static final String JSON_PROPERTY_USER_PROPAGATED = "userPropagated";
	@JsonProperty(JSON_PROPERTY_USER_PROPAGATED)
	private Boolean userPropagated;

	public static final String JSON_PROPERTY_USER_IMPERSONATION_TYPE = "userImpersonationType";
	@JsonProperty(JSON_PROPERTY_USER_IMPERSONATION_TYPE)
	private String userImpersonationType;

	public static final String JSON_PROPERTY_IMPERSONATION_ACCOUNT_ID = "impersonationAccountId";
	@JsonProperty(JSON_PROPERTY_IMPERSONATION_ACCOUNT_ID)
	private String impersonationAccountId;

	public static final String JSON_PROPERTY_IMPERSONATION_USER_ID = "impersonationUserId";
	@JsonProperty(JSON_PROPERTY_IMPERSONATION_USER_ID)
	private String impersonationUserId;

	public static final String JSON_PROPERTY_USER_AUTH_INFO = "userAuthInfo";
	@JsonProperty(JSON_PROPERTY_USER_AUTH_INFO)
	private String userAuthInfo;

	public static final String JSON_PROPERTY_SOURCE_IP = "sourceIp";
	@JsonProperty(JSON_PROPERTY_SOURCE_IP)
	private String sourceIp;

	public static final String JSON_PROPERTY_PRODUCT_VERSION = "productVersion";
	@JsonProperty(JSON_PROPERTY_PRODUCT_VERSION)
	private String productVersion;

	public static final String JSON_PROPERTY_CHANGE_TYPE = "changeType";
	@JsonProperty(JSON_PROPERTY_CHANGE_TYPE)
	private AuditChangeType changeType;

	public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
	@JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
	private String entityType;

	public static final String JSON_PROPERTY_ENTITY_NAME = "entityName";
	@JsonProperty(JSON_PROPERTY_ENTITY_NAME)
	private String entityName;

	public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
	@JsonProperty(JSON_PROPERTY_ENTITY_ID)
	private String entityId;

	public static final String JSON_PROPERTY_OLD_STATE = "oldState";
	@JsonProperty(JSON_PROPERTY_OLD_STATE)
	private String oldState;

	public static final String JSON_PROPERTY_NEW_STATE = "newState";
	@JsonProperty(JSON_PROPERTY_NEW_STATE)
	private String newState;

	public static final String JSON_PROPERTY_OWNER_TYPE = "ownerType";
	@JsonProperty(JSON_PROPERTY_OWNER_TYPE)
	private EPropertyOwnerType ownerType;

	public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
	@JsonProperty(JSON_PROPERTY_OWNER_ID)
	private String ownerId;

	public static final String JSON_PROPERTY_OWNER_ENTITY = "ownerEntity";
	@JsonProperty(JSON_PROPERTY_OWNER_ENTITY)
	private String ownerEntity;

	public static final String JSON_PROPERTY_GLOBAL_CHANGE = "globalChange";
	@JsonProperty(JSON_PROPERTY_GLOBAL_CHANGE)
	private Boolean globalChange;

	public static final String JSON_PROPERTY_ACCOUNT_CHANGE = "accountChange";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_CHANGE)
	private Boolean accountChange;

	public AuditChange $type(TypeEnum $type) {
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

	public AuditChange id(String id) {
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

	public AuditChange creationTimestamp(Long creationTimestamp) {
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

	public AuditChange accountId(String accountId) {
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

	public AuditChange interactionType(AuditInteractionType interactionType) {
		this.interactionType = interactionType;
		return this;
	}

	/**
	 * Get interactionType
	 * 
	 * @return interactionType
	 **/
	@ApiModelProperty(value = "")
	public AuditInteractionType getInteractionType() {
		return interactionType;
	}

	public void setInteractionType(AuditInteractionType interactionType) {
		this.interactionType = interactionType;
	}

	public AuditChange interactionName(String interactionName) {
		this.interactionName = interactionName;
		return this;
	}

	/**
	 * Get interactionName
	 * 
	 * @return interactionName
	 **/
	@ApiModelProperty(value = "")
	public String getInteractionName() {
		return interactionName;
	}

	public void setInteractionName(String interactionName) {
		this.interactionName = interactionName;
	}

	public AuditChange userName(String userName) {
		this.userName = userName;
		return this;
	}

	/**
	 * Get userName
	 * 
	 * @return userName
	 **/
	@ApiModelProperty(value = "")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public AuditChange userId(String userId) {
		this.userId = userId;
		return this;
	}

	/**
	 * Get userId
	 * 
	 * @return userId
	 **/
	@ApiModelProperty(value = "")
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public AuditChange userRole(String userRole) {
		this.userRole = userRole;
		return this;
	}

	/**
	 * Get userRole
	 * 
	 * @return userRole
	 **/
	@ApiModelProperty(value = "")
	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public AuditChange userAnonymous(Boolean userAnonymous) {
		this.userAnonymous = userAnonymous;
		return this;
	}

	/**
	 * Get userAnonymous
	 * 
	 * @return userAnonymous
	 **/
	@ApiModelProperty(value = "")
	public Boolean isUserAnonymous() {
		return userAnonymous;
	}

	public void setUserAnonymous(Boolean userAnonymous) {
		this.userAnonymous = userAnonymous;
	}

	public AuditChange userVirtual(Boolean userVirtual) {
		this.userVirtual = userVirtual;
		return this;
	}

	/**
	 * Get userVirtual
	 * 
	 * @return userVirtual
	 **/
	@ApiModelProperty(value = "")
	public Boolean isUserVirtual() {
		return userVirtual;
	}

	public void setUserVirtual(Boolean userVirtual) {
		this.userVirtual = userVirtual;
	}

	public AuditChange userPropagated(Boolean userPropagated) {
		this.userPropagated = userPropagated;
		return this;
	}

	/**
	 * Get userPropagated
	 * 
	 * @return userPropagated
	 **/
	@ApiModelProperty(value = "")
	public Boolean isUserPropagated() {
		return userPropagated;
	}

	public void setUserPropagated(Boolean userPropagated) {
		this.userPropagated = userPropagated;
	}

	public AuditChange userImpersonationType(String userImpersonationType) {
		this.userImpersonationType = userImpersonationType;
		return this;
	}

	/**
	 * Get userImpersonationType
	 * 
	 * @return userImpersonationType
	 **/
	@ApiModelProperty(value = "")
	public String getUserImpersonationType() {
		return userImpersonationType;
	}

	public void setUserImpersonationType(String userImpersonationType) {
		this.userImpersonationType = userImpersonationType;
	}

	public AuditChange impersonationAccountId(String impersonationAccountId) {
		this.impersonationAccountId = impersonationAccountId;
		return this;
	}

	/**
	 * Get impersonationAccountId
	 * 
	 * @return impersonationAccountId
	 **/
	@ApiModelProperty(value = "")
	public String getImpersonationAccountId() {
		return impersonationAccountId;
	}

	public void setImpersonationAccountId(String impersonationAccountId) {
		this.impersonationAccountId = impersonationAccountId;
	}

	public AuditChange impersonationUserId(String impersonationUserId) {
		this.impersonationUserId = impersonationUserId;
		return this;
	}

	/**
	 * Get impersonationUserId
	 * 
	 * @return impersonationUserId
	 **/
	@ApiModelProperty(value = "")
	public String getImpersonationUserId() {
		return impersonationUserId;
	}

	public void setImpersonationUserId(String impersonationUserId) {
		this.impersonationUserId = impersonationUserId;
	}

	public AuditChange userAuthInfo(String userAuthInfo) {
		this.userAuthInfo = userAuthInfo;
		return this;
	}

	/**
	 * Get userAuthInfo
	 * 
	 * @return userAuthInfo
	 **/
	@ApiModelProperty(value = "")
	public String getUserAuthInfo() {
		return userAuthInfo;
	}

	public void setUserAuthInfo(String userAuthInfo) {
		this.userAuthInfo = userAuthInfo;
	}

	public AuditChange sourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		return this;
	}

	/**
	 * Get sourceIp
	 * 
	 * @return sourceIp
	 **/
	@ApiModelProperty(value = "")
	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

	public AuditChange productVersion(String productVersion) {
		this.productVersion = productVersion;
		return this;
	}

	/**
	 * Get productVersion
	 * 
	 * @return productVersion
	 **/
	@ApiModelProperty(value = "")
	public String getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	public AuditChange changeType(AuditChangeType changeType) {
		this.changeType = changeType;
		return this;
	}

	/**
	 * Get changeType
	 * 
	 * @return changeType
	 **/
	@ApiModelProperty(value = "")
	public AuditChangeType getChangeType() {
		return changeType;
	}

	public void setChangeType(AuditChangeType changeType) {
		this.changeType = changeType;
	}

	public AuditChange entityType(String entityType) {
		this.entityType = entityType;
		return this;
	}

	/**
	 * Get entityType
	 * 
	 * @return entityType
	 **/
	@ApiModelProperty(value = "")
	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public AuditChange entityName(String entityName) {
		this.entityName = entityName;
		return this;
	}

	/**
	 * Get entityName
	 * 
	 * @return entityName
	 **/
	@ApiModelProperty(value = "")
	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public AuditChange entityId(String entityId) {
		this.entityId = entityId;
		return this;
	}

	/**
	 * Get entityId
	 * 
	 * @return entityId
	 **/
	@ApiModelProperty(value = "")
	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public AuditChange oldState(String oldState) {
		this.oldState = oldState;
		return this;
	}

	/**
	 * Get oldState
	 * 
	 * @return oldState
	 **/
	@ApiModelProperty(value = "")
	public String getOldState() {
		return oldState;
	}

	public void setOldState(String oldState) {
		this.oldState = oldState;
	}

	public AuditChange newState(String newState) {
		this.newState = newState;
		return this;
	}

	/**
	 * Get newState
	 * 
	 * @return newState
	 **/
	@ApiModelProperty(value = "")
	public String getNewState() {
		return newState;
	}

	public void setNewState(String newState) {
		this.newState = newState;
	}

	public AuditChange ownerType(EPropertyOwnerType ownerType) {
		this.ownerType = ownerType;
		return this;
	}

	/**
	 * Get ownerType
	 * 
	 * @return ownerType
	 **/
	@ApiModelProperty(value = "")
	public EPropertyOwnerType getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(EPropertyOwnerType ownerType) {
		this.ownerType = ownerType;
	}

	public AuditChange ownerId(String ownerId) {
		this.ownerId = ownerId;
		return this;
	}

	/**
	 * Get ownerId
	 * 
	 * @return ownerId
	 **/
	@ApiModelProperty(value = "")
	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public AuditChange ownerEntity(String ownerEntity) {
		this.ownerEntity = ownerEntity;
		return this;
	}

	/**
	 * Get ownerEntity
	 * 
	 * @return ownerEntity
	 **/
	@ApiModelProperty(value = "")
	public String getOwnerEntity() {
		return ownerEntity;
	}

	public void setOwnerEntity(String ownerEntity) {
		this.ownerEntity = ownerEntity;
	}

	public AuditChange globalChange(Boolean globalChange) {
		this.globalChange = globalChange;
		return this;
	}

	/**
	 * &lt;ul&gt; &lt;li&gt;SUPER_ADMIN can view: &lt;pre&gt; (globalChange&#x3D;&#x3D;true or (accountChange&#x3D;&#x3D;true and
	 * accountId&#x3D;&amp;lt;superadmin&#39;s account id&amp;gt;)) &lt;/pre&gt; &lt;li&gt;ADMIN can view: &lt;pre&gt; accountChange&#x3D;&#x3D;true and
	 * accountId&#x3D;&amp;lt;admin&#39;s account id&amp;gt; &lt;/pre&gt; &lt;/ul&gt;
	 * 
	 * @return globalChange
	 **/
	@ApiModelProperty(value = "<ul> <li>SUPER_ADMIN can view: <pre> (globalChange==true or (accountChange==true and accountId=&lt;superadmin's account id&gt;)) </pre> <li>ADMIN can view: <pre> accountChange==true and accountId=&lt;admin's account id&gt; </pre> </ul>")
	public Boolean isGlobalChange() {
		return globalChange;
	}

	public void setGlobalChange(Boolean globalChange) {
		this.globalChange = globalChange;
	}

	public AuditChange accountChange(Boolean accountChange) {
		this.accountChange = accountChange;
		return this;
	}

	/**
	 * &lt;ul&gt; &lt;li&gt;SUPER_ADMIN can view: &lt;pre&gt; (globalChange&#x3D;&#x3D;true or (accountChange&#x3D;&#x3D;true and
	 * accountId&#x3D;&amp;lt;superadmin&#39;s account id&amp;gt;)) &lt;/pre&gt; &lt;li&gt;ADMIN can view: &lt;pre&gt; accountChange&#x3D;&#x3D;true and
	 * accountId&#x3D;&amp;lt;admin&#39;s account id&amp;gt; &lt;/pre&gt; &lt;/ul&gt;
	 * 
	 * @return accountChange
	 **/
	@ApiModelProperty(value = "<ul> <li>SUPER_ADMIN can view: <pre> (globalChange==true or (accountChange==true and accountId=&lt;superadmin's account id&gt;)) </pre> <li>ADMIN can view: <pre> accountChange==true and accountId=&lt;admin's account id&gt; </pre> </ul>")
	public Boolean isAccountChange() {
		return accountChange;
	}

	public void setAccountChange(Boolean accountChange) {
		this.accountChange = accountChange;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AuditChange auditChange = (AuditChange) o;
		return Objects.equals(this.$type, auditChange.$type) &&
				Objects.equals(this.id, auditChange.id) &&
				Objects.equals(this.creationTimestamp, auditChange.creationTimestamp) &&
				Objects.equals(this.accountId, auditChange.accountId) &&
				Objects.equals(this.interactionType, auditChange.interactionType) &&
				Objects.equals(this.interactionName, auditChange.interactionName) &&
				Objects.equals(this.userName, auditChange.userName) &&
				Objects.equals(this.userId, auditChange.userId) &&
				Objects.equals(this.userRole, auditChange.userRole) &&
				Objects.equals(this.userAnonymous, auditChange.userAnonymous) &&
				Objects.equals(this.userVirtual, auditChange.userVirtual) &&
				Objects.equals(this.userPropagated, auditChange.userPropagated) &&
				Objects.equals(this.userImpersonationType, auditChange.userImpersonationType) &&
				Objects.equals(this.impersonationAccountId, auditChange.impersonationAccountId) &&
				Objects.equals(this.impersonationUserId, auditChange.impersonationUserId) &&
				Objects.equals(this.userAuthInfo, auditChange.userAuthInfo) &&
				Objects.equals(this.sourceIp, auditChange.sourceIp) &&
				Objects.equals(this.productVersion, auditChange.productVersion) &&
				Objects.equals(this.changeType, auditChange.changeType) &&
				Objects.equals(this.entityType, auditChange.entityType) &&
				Objects.equals(this.entityName, auditChange.entityName) &&
				Objects.equals(this.entityId, auditChange.entityId) &&
				Objects.equals(this.oldState, auditChange.oldState) &&
				Objects.equals(this.newState, auditChange.newState) &&
				Objects.equals(this.ownerType, auditChange.ownerType) &&
				Objects.equals(this.ownerId, auditChange.ownerId) &&
				Objects.equals(this.ownerEntity, auditChange.ownerEntity) &&
				Objects.equals(this.globalChange, auditChange.globalChange) &&
				Objects.equals(this.accountChange, auditChange.accountChange);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, accountId, interactionType, interactionName, userName, userId, userRole, userAnonymous, userVirtual, userPropagated, userImpersonationType, impersonationAccountId, impersonationUserId, userAuthInfo, sourceIp, productVersion, changeType, entityType, entityName, entityId, oldState, newState, ownerType, ownerId, ownerEntity, globalChange, accountChange);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuditChange {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
		sb.append("    interactionName: ").append(toIndentedString(interactionName)).append("\n");
		sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
		sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
		sb.append("    userRole: ").append(toIndentedString(userRole)).append("\n");
		sb.append("    userAnonymous: ").append(toIndentedString(userAnonymous)).append("\n");
		sb.append("    userVirtual: ").append(toIndentedString(userVirtual)).append("\n");
		sb.append("    userPropagated: ").append(toIndentedString(userPropagated)).append("\n");
		sb.append("    userImpersonationType: ").append(toIndentedString(userImpersonationType)).append("\n");
		sb.append("    impersonationAccountId: ").append(toIndentedString(impersonationAccountId)).append("\n");
		sb.append("    impersonationUserId: ").append(toIndentedString(impersonationUserId)).append("\n");
		sb.append("    userAuthInfo: ").append(toIndentedString(userAuthInfo)).append("\n");
		sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
		sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
		sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
		sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
		sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
		sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
		sb.append("    oldState: ").append(toIndentedString(oldState)).append("\n");
		sb.append("    newState: ").append(toIndentedString(newState)).append("\n");
		sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
		sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
		sb.append("    ownerEntity: ").append(toIndentedString(ownerEntity)).append("\n");
		sb.append("    globalChange: ").append(toIndentedString(globalChange)).append("\n");
		sb.append("    accountChange: ").append(toIndentedString(accountChange)).append("\n");
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
