
package com.unblu.webapi.model.v4;

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
 * Request to cancel a search indexing operation
 */
@ApiModel(description = "Request to cancel a search indexing operation")

@JsonPropertyOrder({
	CancelIndexingOperationRequest.JSON_PROPERTY_$_TYPE,
	CancelIndexingOperationRequest.JSON_PROPERTY_INDEX_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CancelIndexingOperationRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CANCELINDEXINGOPERATIONREQUEST("CancelIndexingOperationRequest");

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
			return TypeEnum.CANCELINDEXINGOPERATIONREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CANCELINDEXINGOPERATIONREQUEST;

	public static final String JSON_PROPERTY_INDEX_TYPE = "indexType";
	@JsonProperty(JSON_PROPERTY_INDEX_TYPE)
	private ESearchIndexType indexType;

	public CancelIndexingOperationRequest $type(TypeEnum $type) {
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

	public CancelIndexingOperationRequest indexType(ESearchIndexType indexType) {
		this.indexType = indexType;
		return this;
	}

	/**
	 * Get indexType
	 * 
	 * @return indexType
	 **/
	@ApiModelProperty(value = "")
	public ESearchIndexType getIndexType() {
		return indexType;
	}

	public void setIndexType(ESearchIndexType indexType) {
		this.indexType = indexType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CancelIndexingOperationRequest cancelIndexingOperationRequest = (CancelIndexingOperationRequest) o;
		return Objects.equals(this.$type, cancelIndexingOperationRequest.$type) &&
				Objects.equals(this.indexType, cancelIndexingOperationRequest.indexType);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, indexType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CancelIndexingOperationRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    indexType: ").append(toIndentedString(indexType)).append("\n");
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
