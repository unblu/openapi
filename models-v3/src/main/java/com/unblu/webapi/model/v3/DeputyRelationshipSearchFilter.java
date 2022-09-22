package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AgentUserIdDeputyRelationshipSearchFilter.class, name = "AGENT_USER_ID"),
	@JsonSubTypes.Type(value = CreationTimestampDeputyRelationshipSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = DeputyIdDeputyRelationshipSearchFilter.class, name = "DEPUTY_ID"),
	@JsonSubTypes.Type(value = DeputyTypeDeputyRelationshipSearchFilter.class, name = "DEPUTY_TYPE"),
	@JsonSubTypes.Type(value = EscalationLevelDeputyRelationshipSearchFilter.class, name = "ESCALATION_LEVEL"),
	@JsonSubTypes.Type(value = ModificationTimestampDeputyRelationshipSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
})
public interface DeputyRelationshipSearchFilter {
	void setField(EDeputyRelationshipSearchFilterField field);

	EDeputyRelationshipSearchFilterField getField();

	DeputyRelationshipSearchFilter field(EDeputyRelationshipSearchFilterField field);

}
