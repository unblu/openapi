package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsCollaborationLayerEventSourceTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InCollaborationLayerEventSourceTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsCollaborationLayerEventSourceTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInCollaborationLayerEventSourceTypeOperator.class, name = "NOT_IN"),
})
public interface CollaborationLayerEventSourceTypeOperator {
	void setType(ECollaborationLayerEventSourceTypeOperatorType type);

	ECollaborationLayerEventSourceTypeOperatorType getType();

	CollaborationLayerEventSourceTypeOperator type(ECollaborationLayerEventSourceTypeOperatorType type);

}
