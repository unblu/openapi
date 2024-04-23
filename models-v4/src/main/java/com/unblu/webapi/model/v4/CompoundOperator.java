package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AndCompoundOperator.class, name = "AND"),
	@JsonSubTypes.Type(value = OrCompoundOperator.class, name = "OR"),
})
public interface CompoundOperator {
	void setType(ECompoundOperatorType type);

	ECompoundOperatorType getType();

	CompoundOperator type(ECompoundOperatorType type);

}
