package com.unblu.webapi.model.v4;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AllOfPersonLabelsOperator.class, name = "ALL_OF"),
	@JsonSubTypes.Type(value = AnyOfPersonLabelsOperator.class, name = "ANY_OF"),
	@JsonSubTypes.Type(value = NoneOfPersonLabelsOperator.class, name = "NONE_OF"),
})
public interface PersonLabelsOperator {
	void setType(EPersonLabelsOperatorType type);

	EPersonLabelsOperatorType getType();

	PersonLabelsOperator type(EPersonLabelsOperatorType type);

	void setValues(List<String> values);

	List<String> getValues();

	PersonLabelsOperator values(List<String> values);

}
