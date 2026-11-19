package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsRecordingSystemOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = NotEqualsRecordingSystemOperator.class, name = "NOT_EQUALS"),
})
public interface RecordingSystemOperator {
	void setType(ERecordingSystemOperatorType type);

	ERecordingSystemOperatorType getType();

	RecordingSystemOperator type(ERecordingSystemOperatorType type);

	void setValue(ERecordingSystem value);

	ERecordingSystem getValue();

	RecordingSystemOperator value(ERecordingSystem value);

}
