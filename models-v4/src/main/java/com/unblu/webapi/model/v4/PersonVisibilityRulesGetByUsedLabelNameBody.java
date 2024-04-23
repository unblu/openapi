
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;personVisibilityRulesGetByUsedLabelName&#39; operation
 */
@ApiModel(description = "Request body for the 'personVisibilityRulesGetByUsedLabelName' operation")

@JsonPropertyOrder({
	PersonVisibilityRulesGetByUsedLabelNameBody.JSON_PROPERTY_LABEL_NAME,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PersonVisibilityRulesGetByUsedLabelNameBody {
	public static final String JSON_PROPERTY_LABEL_NAME = "labelName";
	@JsonProperty(JSON_PROPERTY_LABEL_NAME)
	private String labelName;

	public PersonVisibilityRulesGetByUsedLabelNameBody labelName(String labelName) {
		this.labelName = labelName;
		return this;
	}

	/**
	 * The name of a person label to search for in the rule selection
	 * 
	 * @return labelName
	 **/
	@ApiModelProperty(value = "The name of a person label to search for in the rule selection")
	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonVisibilityRulesGetByUsedLabelNameBody personVisibilityRulesGetByUsedLabelNameBody = (PersonVisibilityRulesGetByUsedLabelNameBody) o;
		return Objects.equals(this.labelName, personVisibilityRulesGetByUsedLabelNameBody.labelName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(labelName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonVisibilityRulesGetByUsedLabelNameBody {\n");
		sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
