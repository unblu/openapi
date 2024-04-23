package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AccountChangeAuditChangeSearchFilter.class, name = "ACCOUNT_CHANGE"),
	@JsonSubTypes.Type(value = AuthorizationRoleAuditChangeSearchFilter.class, name = "AUTHORIZATION_ROLE"),
	@JsonSubTypes.Type(value = ChangeTypeAuditChangeSearchFilter.class, name = "CHANGE_TYPE"),
	@JsonSubTypes.Type(value = CreationTimestampAuditChangeSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = EntityIdAuditChangeSearchFilter.class, name = "ENTITY_ID"),
	@JsonSubTypes.Type(value = EntityNameAuditChangeSearchFilter.class, name = "ENTITY_NAME"),
	@JsonSubTypes.Type(value = EntityTypeAuditChangeSearchFilter.class, name = "ENTITY_TYPE"),
	@JsonSubTypes.Type(value = GlobalChangeAuditChangeSearchFilter.class, name = "GLOBAL_CHANGE"),
	@JsonSubTypes.Type(value = ImpersonationTypeAuditChangeSearchFilter.class, name = "IMPERSONATION_TYPE"),
	@JsonSubTypes.Type(value = InteractionNameAuditChangeSearchFilter.class, name = "INTERACTION_NAME"),
	@JsonSubTypes.Type(value = InteractionTypeAuditChangeSearchFilter.class, name = "INTERACTION_TYPE"),
	@JsonSubTypes.Type(value = OwnerIdAuditChangeSearchFilter.class, name = "OWNER_ID"),
	@JsonSubTypes.Type(value = OwnerTypeAuditChangeSearchFilter.class, name = "OWNER_TYPE"),
	@JsonSubTypes.Type(value = UsernameAuditChangeSearchFilter.class, name = "USERNAME"),
	@JsonSubTypes.Type(value = UserIdAuditChangeSearchFilter.class, name = "USER_ID"),
})
public interface AuditChangeSearchFilter {
	void setField(EAuditChangeSearchFilterField field);

	EAuditChangeSearchFilterField getField();

	AuditChangeSearchFilter field(EAuditChangeSearchFilterField field);

}
