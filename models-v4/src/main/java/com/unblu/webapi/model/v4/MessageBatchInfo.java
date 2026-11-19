
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
 * Links a message to the other messages sent together with it in one action, for example a text with files. &lt;p&gt; Messages sent on their own or through the
 * web API have no batch information: their &#x60;batchInfo&#x60; is &#x60;null&#x60;. A batch contains at most 100 messages. Batch information isn&#39;t sent
 * to external message interceptors.
 */
@ApiModel(description = "Links a message to the other messages sent together with it in one action, for example a text with files. <p> Messages sent on their own or through the web API have no batch information: their `batchInfo` is `null`. A batch contains at most 100 messages. Batch information isn't sent to external message interceptors.")

@JsonPropertyOrder({
	MessageBatchInfo.JSON_PROPERTY_$_TYPE,
	MessageBatchInfo.JSON_PROPERTY_BATCH_ID,
	MessageBatchInfo.JSON_PROPERTY_BATCH_SIZE,
	MessageBatchInfo.JSON_PROPERTY_BATCH_INDEX,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class MessageBatchInfo {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		MESSAGEBATCHINFO("MessageBatchInfo");

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
			return TypeEnum.MESSAGEBATCHINFO;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.MESSAGEBATCHINFO;

	public static final String JSON_PROPERTY_BATCH_ID = "batchId";
	@JsonProperty(JSON_PROPERTY_BATCH_ID)
	private String batchId;

	public static final String JSON_PROPERTY_BATCH_SIZE = "batchSize";
	@JsonProperty(JSON_PROPERTY_BATCH_SIZE)
	private Integer batchSize;

	public static final String JSON_PROPERTY_BATCH_INDEX = "batchIndex";
	@JsonProperty(JSON_PROPERTY_BATCH_INDEX)
	private Integer batchIndex;

	public MessageBatchInfo $type(TypeEnum $type) {
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

	public MessageBatchInfo batchId(String batchId) {
		this.batchId = batchId;
		return this;
	}

	/**
	 * ID shared by all messages of the batch.
	 * 
	 * @return batchId
	 **/
	@ApiModelProperty(value = "ID shared by all messages of the batch.")
	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public MessageBatchInfo batchSize(Integer batchSize) {
		this.batchSize = batchSize;
		return this;
	}

	/**
	 * Number of messages sent together in one action. The batch can contain fewer messages, for example if a file couldn&#39;t be uploaded.
	 * 
	 * @return batchSize
	 **/
	@ApiModelProperty(value = "Number of messages sent together in one action. The batch can contain fewer messages, for example if a file couldn't be uploaded.")
	public Integer getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(Integer batchSize) {
		this.batchSize = batchSize;
	}

	public MessageBatchInfo batchIndex(Integer batchIndex) {
		this.batchIndex = batchIndex;
		return this;
	}

	/**
	 * Position of the message within the batch, starting at 0.
	 * 
	 * @return batchIndex
	 **/
	@ApiModelProperty(value = "Position of the message within the batch, starting at 0.")
	public Integer getBatchIndex() {
		return batchIndex;
	}

	public void setBatchIndex(Integer batchIndex) {
		this.batchIndex = batchIndex;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MessageBatchInfo messageBatchInfo = (MessageBatchInfo) o;
		return Objects.equals(this.$type, messageBatchInfo.$type) &&
				Objects.equals(this.batchId, messageBatchInfo.batchId) &&
				Objects.equals(this.batchSize, messageBatchInfo.batchSize) &&
				Objects.equals(this.batchIndex, messageBatchInfo.batchIndex);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, batchId, batchSize, batchIndex);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MessageBatchInfo {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
		sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
		sb.append("    batchIndex: ").append(toIndentedString(batchIndex)).append("\n");
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
