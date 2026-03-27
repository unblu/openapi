package com.unblu.webapi.model.v4;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = InJsonArrayStringOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotInJsonArrayStringOperator.class, name = "NOT_IN"),
})
public interface JsonArrayStringOperator {
	void setType(EJsonArrayOperatorType type);

	EJsonArrayOperatorType getType();

	JsonArrayStringOperator type(EJsonArrayOperatorType type);

	void setValues(List<String> values);

	List<String> getValues();

	JsonArrayStringOperator values(List<String> values);

}
