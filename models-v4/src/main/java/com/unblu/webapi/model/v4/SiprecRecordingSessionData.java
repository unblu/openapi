
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
 * The SIPREC session that one recording server received for a SIPREC recording
 */
@ApiModel(description = "The SIPREC session that one recording server received for a SIPREC recording")

@JsonPropertyOrder({
	SiprecRecordingSessionData.JSON_PROPERTY_$_TYPE,
	SiprecRecordingSessionData.JSON_PROPERTY_RECORDER_INDEX,
	SiprecRecordingSessionData.JSON_PROPERTY_SESSION_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class SiprecRecordingSessionData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		SIPRECRECORDINGSESSIONDATA("SiprecRecordingSessionData");

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
			return TypeEnum.SIPRECRECORDINGSESSIONDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.SIPRECRECORDINGSESSIONDATA;

	public static final String JSON_PROPERTY_RECORDER_INDEX = "recorderIndex";
	@JsonProperty(JSON_PROPERTY_RECORDER_INDEX)
	private Integer recorderIndex;

	public static final String JSON_PROPERTY_SESSION_ID = "sessionId";
	@JsonProperty(JSON_PROPERTY_SESSION_ID)
	private String sessionId;

	public SiprecRecordingSessionData $type(TypeEnum $type) {
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

	public SiprecRecordingSessionData recorderIndex(Integer recorderIndex) {
		this.recorderIndex = recorderIndex;
		return this;
	}

	/**
	 * The index of the recording server: 0 for the primary server, 1 for the secondary server
	 * 
	 * @return recorderIndex
	 **/
	@ApiModelProperty(value = "The index of the recording server: 0 for the primary server, 1 for the secondary server")
	public Integer getRecorderIndex() {
		return recorderIndex;
	}

	public void setRecorderIndex(Integer recorderIndex) {
		this.recorderIndex = recorderIndex;
	}

	public SiprecRecordingSessionData sessionId(String sessionId) {
		this.sessionId = sessionId;
		return this;
	}

	/**
	 * The SIPREC session ID the recording server received. Recording systems store it with their record; Verba, for example, stores it as
	 * &#x60;platform_call_id&#x60;.
	 * 
	 * @return sessionId
	 **/
	@ApiModelProperty(value = "The SIPREC session ID the recording server received. Recording systems store it with their record; Verba, for example, stores it as `platform_call_id`.")
	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SiprecRecordingSessionData siprecRecordingSessionData = (SiprecRecordingSessionData) o;
		return Objects.equals(this.$type, siprecRecordingSessionData.$type) &&
				Objects.equals(this.recorderIndex, siprecRecordingSessionData.recorderIndex) &&
				Objects.equals(this.sessionId, siprecRecordingSessionData.sessionId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, recorderIndex, sessionId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SiprecRecordingSessionData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    recorderIndex: ").append(toIndentedString(recorderIndex)).append("\n");
		sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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
