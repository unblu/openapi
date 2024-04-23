package com.unblu.webapi.model.v4;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AllEqualIdListOperator.class, name = "ALL_EQUAL"),
	@JsonSubTypes.Type(value = AllOfIdListOperator.class, name = "ALL_OF"),
	@JsonSubTypes.Type(value = AnyOfIdListOperator.class, name = "ANY_OF"),
})
public interface IdListOperator {
	void setType(EIdListOperatorType type);

	EIdListOperatorType getType();

	IdListOperator type(EIdListOperatorType type);

	void setValues(List<String> values);

	List<String> getValues();

	IdListOperator values(List<String> values);

}
