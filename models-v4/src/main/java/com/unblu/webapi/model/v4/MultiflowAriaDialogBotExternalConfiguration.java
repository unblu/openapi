
package com.unblu.webapi.model.v4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Model representing an aria multiflow dialog bot external configuration.
 */
@ApiModel(description = "Model representing an aria multiflow dialog bot external configuration.")

@JsonPropertyOrder({
	MultiflowAriaDialogBotExternalConfiguration.JSON_PROPERTY_$_TYPE,
	MultiflowAriaDialogBotExternalConfiguration.JSON_PROPERTY_TYPE,
	MultiflowAriaDialogBotExternalConfiguration.JSON_PROPERTY_CONDITION_AGENT_LLM_CREDENTIAL_ID,
	MultiflowAriaDialogBotExternalConfiguration.JSON_PROPERTY_CONDITION_AGENT_LLM_PROVIDER,
	MultiflowAriaDialogBotExternalConfiguration.JSON_PROPERTY_CONDITION_AGENT_LLM_PARAMETERS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class MultiflowAriaDialogBotExternalConfiguration implements AriaDialogBotExternalConfiguration {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		MULTIFLOWARIADIALOGBOTEXTERNALCONFIGURATION("MultiflowAriaDialogBotExternalConfiguration");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			return TypeEnum.MULTIFLOWARIADIALOGBOTEXTERNALCONFIGURATION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.MULTIFLOWARIADIALOGBOTEXTERNALCONFIGURATION;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EAriaDialogBotExternalConfigurationType type = EAriaDialogBotExternalConfigurationType.MULTIFLOW;

	public static final String JSON_PROPERTY_CONDITION_AGENT_LLM_CREDENTIAL_ID = "conditionAgentLlmCredentialId";
	@JsonProperty(JSON_PROPERTY_CONDITION_AGENT_LLM_CREDENTIAL_ID)
	private String conditionAgentLlmCredentialId;

	public static final String JSON_PROPERTY_CONDITION_AGENT_LLM_PROVIDER = "conditionAgentLlmProvider";
	@JsonProperty(JSON_PROPERTY_CONDITION_AGENT_LLM_PROVIDER)
	private String conditionAgentLlmProvider;

	public static final String JSON_PROPERTY_CONDITION_AGENT_LLM_PARAMETERS = "conditionAgentLlmParameters";
	@JsonProperty(JSON_PROPERTY_CONDITION_AGENT_LLM_PARAMETERS)
	private Map<String, String> conditionAgentLlmParameters = null;

	public MultiflowAriaDialogBotExternalConfiguration $type(TypeEnum $type) {
		this.$type = $type;
		return this;
	}

	/**
	 * Get $type
	 * 
	 * @return $type
	 **/
	@ApiModelProperty(value = "")
	public TypeEnum get$Type() {
		return $type;
	}

	public void set$Type(TypeEnum $type) {
		this.$type = $type;
	}

	public MultiflowAriaDialogBotExternalConfiguration type(EAriaDialogBotExternalConfigurationType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	public EAriaDialogBotExternalConfigurationType getType() {
		return type;
	}

	public void setType(EAriaDialogBotExternalConfigurationType type) {
		this.type = type;
	}

	public MultiflowAriaDialogBotExternalConfiguration conditionAgentLlmCredentialId(String conditionAgentLlmCredentialId) {
		this.conditionAgentLlmCredentialId = conditionAgentLlmCredentialId;
		return this;
	}

	/**
	 * Get conditionAgentLlmCredentialId
	 * 
	 * @return conditionAgentLlmCredentialId
	 **/
	@ApiModelProperty(value = "")
	public String getConditionAgentLlmCredentialId() {
		return conditionAgentLlmCredentialId;
	}

	public void setConditionAgentLlmCredentialId(String conditionAgentLlmCredentialId) {
		this.conditionAgentLlmCredentialId = conditionAgentLlmCredentialId;
	}

	public MultiflowAriaDialogBotExternalConfiguration conditionAgentLlmProvider(String conditionAgentLlmProvider) {
		this.conditionAgentLlmProvider = conditionAgentLlmProvider;
		return this;
	}

	/**
	 * Get conditionAgentLlmProvider
	 * 
	 * @return conditionAgentLlmProvider
	 **/
	@ApiModelProperty(value = "")
	public String getConditionAgentLlmProvider() {
		return conditionAgentLlmProvider;
	}

	public void setConditionAgentLlmProvider(String conditionAgentLlmProvider) {
		this.conditionAgentLlmProvider = conditionAgentLlmProvider;
	}

	public MultiflowAriaDialogBotExternalConfiguration conditionAgentLlmParameters(Map<String, String> conditionAgentLlmParameters) {
		this.conditionAgentLlmParameters = conditionAgentLlmParameters;
		return this;
	}

	public MultiflowAriaDialogBotExternalConfiguration putConditionAgentLlmParametersItem(String key, String conditionAgentLlmParametersItem) {
		if (this.conditionAgentLlmParameters == null) {
			this.conditionAgentLlmParameters = new HashMap<>();
		}
		this.conditionAgentLlmParameters.put(key, conditionAgentLlmParametersItem);
		return this;
	}

	/**
	 * Get conditionAgentLlmParameters
	 * 
	 * @return conditionAgentLlmParameters
	 **/
	@ApiModelProperty(value = "")
	public Map<String, String> getConditionAgentLlmParameters() {
		return conditionAgentLlmParameters;
	}

	public void setConditionAgentLlmParameters(Map<String, String> conditionAgentLlmParameters) {
		this.conditionAgentLlmParameters = conditionAgentLlmParameters;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MultiflowAriaDialogBotExternalConfiguration multiflowAriaDialogBotExternalConfiguration = (MultiflowAriaDialogBotExternalConfiguration) o;
		return Objects.equals(this.$type, multiflowAriaDialogBotExternalConfiguration.$type) &&
				Objects.equals(this.type, multiflowAriaDialogBotExternalConfiguration.type) &&
				Objects.equals(this.conditionAgentLlmCredentialId, multiflowAriaDialogBotExternalConfiguration.conditionAgentLlmCredentialId) &&
				Objects.equals(this.conditionAgentLlmProvider, multiflowAriaDialogBotExternalConfiguration.conditionAgentLlmProvider) &&
				Objects.equals(this.conditionAgentLlmParameters, multiflowAriaDialogBotExternalConfiguration.conditionAgentLlmParameters);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, conditionAgentLlmCredentialId, conditionAgentLlmProvider, conditionAgentLlmParameters);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MultiflowAriaDialogBotExternalConfiguration {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    conditionAgentLlmCredentialId: ").append(toIndentedString(conditionAgentLlmCredentialId)).append("\n");
		sb.append("    conditionAgentLlmProvider: ").append(toIndentedString(conditionAgentLlmProvider)).append("\n");
		sb.append("    conditionAgentLlmParameters: ").append(toIndentedString(conditionAgentLlmParameters)).append("\n");
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
