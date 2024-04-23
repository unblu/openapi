package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsVisibilityRuleLabelSelectionOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = NotEqualsVisibilityRuleLabelSelectionOperator.class, name = "NOT_EQUALS"),
})
public interface VisibilityRuleLabelSelectionOperator {
	void setType(EVisibilityRuleLabelSelectionOperatorType type);

	EVisibilityRuleLabelSelectionOperatorType getType();

	VisibilityRuleLabelSelectionOperator type(EVisibilityRuleLabelSelectionOperatorType type);

	void setValue(EPersonVisibilityLabelSelection value);

	EPersonVisibilityLabelSelection getValue();

	VisibilityRuleLabelSelectionOperator value(EPersonVisibilityLabelSelection value);

}
