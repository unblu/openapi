package com.unblu.webapi.model.v4;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AllOfLabelsOperator.class, name = "ALL_OF"),
	@JsonSubTypes.Type(value = AnyOfLabelsOperator.class, name = "ANY_OF"),
	@JsonSubTypes.Type(value = NoneOfLabelsOperator.class, name = "NONE_OF"),
})
public interface LabelsOperator {
	void setType(ELabelsOperatorType type);

	ELabelsOperatorType getType();

	LabelsOperator type(ELabelsOperatorType type);

	void setValues(List<String> values);

	List<String> getValues();

	LabelsOperator values(List<String> values);

}
