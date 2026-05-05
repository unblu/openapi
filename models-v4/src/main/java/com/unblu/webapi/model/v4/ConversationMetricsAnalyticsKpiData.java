
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
 * Aggregate metrics for a conversation, including collaboration layer counts and durations, call counts and durations, and message counts by sender type.
 */
@ApiModel(description = "Aggregate metrics for a conversation, including collaboration layer counts and durations, call counts and durations, and message counts by sender type.")

@JsonPropertyOrder({
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_$_TYPE,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_SCREEN_SHARING_COUNT,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_SCREEN_SHARING_DURATION_MS,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_EMBEDDED_COBROWSING_COUNT,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_EMBEDDED_COBROWSING_DURATION_MS,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_CONTEXT_MIGRATION_COBROWSING_COUNT,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_CONTEXT_MIGRATION_COBROWSING_DURATION_MS,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_MOBILE_COBROWSING_COUNT,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_MOBILE_COBROWSING_DURATION_MS,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_DOCUMENT_COBROWSING_COUNT,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_DOCUMENT_COBROWSING_DURATION_MS,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_WHITEBOARD_COUNT,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_WHITEBOARD_DURATION_MS,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_UNIVERSAL_COBROWSING_COUNT,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_UNIVERSAL_COBROWSING_DURATION_MS,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_DOCUMENT_CAMERA_SHARING_COUNT,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_DOCUMENT_CAMERA_SHARING_DURATION_MS,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_CALLS_COUNT,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_CALLS_DURATION_MS,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_SYSTEM_MESSAGE_COUNT,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_BOT_MESSAGE_COUNT,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_AGENT_MESSAGE_COUNT,
	ConversationMetricsAnalyticsKpiData.JSON_PROPERTY_VISITOR_MESSAGE_COUNT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationMetricsAnalyticsKpiData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONMETRICSANALYTICSKPIDATA("ConversationMetricsAnalyticsKpiData");

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
			return TypeEnum.CONVERSATIONMETRICSANALYTICSKPIDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONMETRICSANALYTICSKPIDATA;

	public static final String JSON_PROPERTY_SCREEN_SHARING_COUNT = "screenSharingCount";
	@JsonProperty(JSON_PROPERTY_SCREEN_SHARING_COUNT)
	private Integer screenSharingCount;

	public static final String JSON_PROPERTY_SCREEN_SHARING_DURATION_MS = "screenSharingDurationMs";
	@JsonProperty(JSON_PROPERTY_SCREEN_SHARING_DURATION_MS)
	private Long screenSharingDurationMs;

	public static final String JSON_PROPERTY_EMBEDDED_COBROWSING_COUNT = "embeddedCobrowsingCount";
	@JsonProperty(JSON_PROPERTY_EMBEDDED_COBROWSING_COUNT)
	private Integer embeddedCobrowsingCount;

	public static final String JSON_PROPERTY_EMBEDDED_COBROWSING_DURATION_MS = "embeddedCobrowsingDurationMs";
	@JsonProperty(JSON_PROPERTY_EMBEDDED_COBROWSING_DURATION_MS)
	private Long embeddedCobrowsingDurationMs;

	public static final String JSON_PROPERTY_CONTEXT_MIGRATION_COBROWSING_COUNT = "contextMigrationCobrowsingCount";
	@JsonProperty(JSON_PROPERTY_CONTEXT_MIGRATION_COBROWSING_COUNT)
	private Integer contextMigrationCobrowsingCount;

	public static final String JSON_PROPERTY_CONTEXT_MIGRATION_COBROWSING_DURATION_MS = "contextMigrationCobrowsingDurationMs";
	@JsonProperty(JSON_PROPERTY_CONTEXT_MIGRATION_COBROWSING_DURATION_MS)
	private Long contextMigrationCobrowsingDurationMs;

	public static final String JSON_PROPERTY_MOBILE_COBROWSING_COUNT = "mobileCobrowsingCount";
	@JsonProperty(JSON_PROPERTY_MOBILE_COBROWSING_COUNT)
	private Integer mobileCobrowsingCount;

	public static final String JSON_PROPERTY_MOBILE_COBROWSING_DURATION_MS = "mobileCobrowsingDurationMs";
	@JsonProperty(JSON_PROPERTY_MOBILE_COBROWSING_DURATION_MS)
	private Long mobileCobrowsingDurationMs;

	public static final String JSON_PROPERTY_DOCUMENT_COBROWSING_COUNT = "documentCobrowsingCount";
	@JsonProperty(JSON_PROPERTY_DOCUMENT_COBROWSING_COUNT)
	private Integer documentCobrowsingCount;

	public static final String JSON_PROPERTY_DOCUMENT_COBROWSING_DURATION_MS = "documentCobrowsingDurationMs";
	@JsonProperty(JSON_PROPERTY_DOCUMENT_COBROWSING_DURATION_MS)
	private Long documentCobrowsingDurationMs;

	public static final String JSON_PROPERTY_WHITEBOARD_COUNT = "whiteboardCount";
	@JsonProperty(JSON_PROPERTY_WHITEBOARD_COUNT)
	private Integer whiteboardCount;

	public static final String JSON_PROPERTY_WHITEBOARD_DURATION_MS = "whiteboardDurationMs";
	@JsonProperty(JSON_PROPERTY_WHITEBOARD_DURATION_MS)
	private Long whiteboardDurationMs;

	public static final String JSON_PROPERTY_UNIVERSAL_COBROWSING_COUNT = "universalCobrowsingCount";
	@JsonProperty(JSON_PROPERTY_UNIVERSAL_COBROWSING_COUNT)
	private Integer universalCobrowsingCount;

	public static final String JSON_PROPERTY_UNIVERSAL_COBROWSING_DURATION_MS = "universalCobrowsingDurationMs";
	@JsonProperty(JSON_PROPERTY_UNIVERSAL_COBROWSING_DURATION_MS)
	private Long universalCobrowsingDurationMs;

	public static final String JSON_PROPERTY_DOCUMENT_CAMERA_SHARING_COUNT = "documentCameraSharingCount";
	@JsonProperty(JSON_PROPERTY_DOCUMENT_CAMERA_SHARING_COUNT)
	private Integer documentCameraSharingCount;

	public static final String JSON_PROPERTY_DOCUMENT_CAMERA_SHARING_DURATION_MS = "documentCameraSharingDurationMs";
	@JsonProperty(JSON_PROPERTY_DOCUMENT_CAMERA_SHARING_DURATION_MS)
	private Long documentCameraSharingDurationMs;

	public static final String JSON_PROPERTY_CALLS_COUNT = "callsCount";
	@JsonProperty(JSON_PROPERTY_CALLS_COUNT)
	private Integer callsCount;

	public static final String JSON_PROPERTY_CALLS_DURATION_MS = "callsDurationMs";
	@JsonProperty(JSON_PROPERTY_CALLS_DURATION_MS)
	private Long callsDurationMs;

	public static final String JSON_PROPERTY_SYSTEM_MESSAGE_COUNT = "systemMessageCount";
	@JsonProperty(JSON_PROPERTY_SYSTEM_MESSAGE_COUNT)
	private Integer systemMessageCount;

	public static final String JSON_PROPERTY_BOT_MESSAGE_COUNT = "botMessageCount";
	@JsonProperty(JSON_PROPERTY_BOT_MESSAGE_COUNT)
	private Integer botMessageCount;

	public static final String JSON_PROPERTY_AGENT_MESSAGE_COUNT = "agentMessageCount";
	@JsonProperty(JSON_PROPERTY_AGENT_MESSAGE_COUNT)
	private Integer agentMessageCount;

	public static final String JSON_PROPERTY_VISITOR_MESSAGE_COUNT = "visitorMessageCount";
	@JsonProperty(JSON_PROPERTY_VISITOR_MESSAGE_COUNT)
	private Integer visitorMessageCount;

	public ConversationMetricsAnalyticsKpiData $type(TypeEnum $type) {
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

	public ConversationMetricsAnalyticsKpiData screenSharingCount(Integer screenSharingCount) {
		this.screenSharingCount = screenSharingCount;
		return this;
	}

	/**
	 * The number of screen sharing sessions in the conversation.
	 * 
	 * @return screenSharingCount
	 **/
	@ApiModelProperty(value = "The number of screen sharing sessions in the conversation.")
	public Integer getScreenSharingCount() {
		return screenSharingCount;
	}

	public void setScreenSharingCount(Integer screenSharingCount) {
		this.screenSharingCount = screenSharingCount;
	}

	public ConversationMetricsAnalyticsKpiData screenSharingDurationMs(Long screenSharingDurationMs) {
		this.screenSharingDurationMs = screenSharingDurationMs;
		return this;
	}

	/**
	 * The total duration (ms) of screen sharing sessions in the conversation.
	 * 
	 * @return screenSharingDurationMs
	 **/
	@ApiModelProperty(value = "The total duration (ms) of screen sharing sessions in the conversation.")
	public Long getScreenSharingDurationMs() {
		return screenSharingDurationMs;
	}

	public void setScreenSharingDurationMs(Long screenSharingDurationMs) {
		this.screenSharingDurationMs = screenSharingDurationMs;
	}

	public ConversationMetricsAnalyticsKpiData embeddedCobrowsingCount(Integer embeddedCobrowsingCount) {
		this.embeddedCobrowsingCount = embeddedCobrowsingCount;
		return this;
	}

	/**
	 * The number of embedded co-browsing sessions in the conversation.
	 * 
	 * @return embeddedCobrowsingCount
	 **/
	@ApiModelProperty(value = "The number of embedded co-browsing sessions in the conversation.")
	public Integer getEmbeddedCobrowsingCount() {
		return embeddedCobrowsingCount;
	}

	public void setEmbeddedCobrowsingCount(Integer embeddedCobrowsingCount) {
		this.embeddedCobrowsingCount = embeddedCobrowsingCount;
	}

	public ConversationMetricsAnalyticsKpiData embeddedCobrowsingDurationMs(Long embeddedCobrowsingDurationMs) {
		this.embeddedCobrowsingDurationMs = embeddedCobrowsingDurationMs;
		return this;
	}

	/**
	 * The total duration (ms) of embedded co-browsing sessions in the conversation.
	 * 
	 * @return embeddedCobrowsingDurationMs
	 **/
	@ApiModelProperty(value = "The total duration (ms) of embedded co-browsing sessions in the conversation.")
	public Long getEmbeddedCobrowsingDurationMs() {
		return embeddedCobrowsingDurationMs;
	}

	public void setEmbeddedCobrowsingDurationMs(Long embeddedCobrowsingDurationMs) {
		this.embeddedCobrowsingDurationMs = embeddedCobrowsingDurationMs;
	}

	public ConversationMetricsAnalyticsKpiData contextMigrationCobrowsingCount(Integer contextMigrationCobrowsingCount) {
		this.contextMigrationCobrowsingCount = contextMigrationCobrowsingCount;
		return this;
	}

	/**
	 * The number of context migration co-browsing sessions in the conversation.
	 * 
	 * @return contextMigrationCobrowsingCount
	 **/
	@ApiModelProperty(value = "The number of context migration co-browsing sessions in the conversation.")
	public Integer getContextMigrationCobrowsingCount() {
		return contextMigrationCobrowsingCount;
	}

	public void setContextMigrationCobrowsingCount(Integer contextMigrationCobrowsingCount) {
		this.contextMigrationCobrowsingCount = contextMigrationCobrowsingCount;
	}

	public ConversationMetricsAnalyticsKpiData contextMigrationCobrowsingDurationMs(Long contextMigrationCobrowsingDurationMs) {
		this.contextMigrationCobrowsingDurationMs = contextMigrationCobrowsingDurationMs;
		return this;
	}

	/**
	 * The total duration (ms) of context migration co-browsing sessions in the conversation.
	 * 
	 * @return contextMigrationCobrowsingDurationMs
	 **/
	@ApiModelProperty(value = "The total duration (ms) of context migration co-browsing sessions in the conversation.")
	public Long getContextMigrationCobrowsingDurationMs() {
		return contextMigrationCobrowsingDurationMs;
	}

	public void setContextMigrationCobrowsingDurationMs(Long contextMigrationCobrowsingDurationMs) {
		this.contextMigrationCobrowsingDurationMs = contextMigrationCobrowsingDurationMs;
	}

	public ConversationMetricsAnalyticsKpiData mobileCobrowsingCount(Integer mobileCobrowsingCount) {
		this.mobileCobrowsingCount = mobileCobrowsingCount;
		return this;
	}

	/**
	 * Number of mobile co-browsing sessions in the conversation.
	 * 
	 * @return mobileCobrowsingCount
	 **/
	@ApiModelProperty(value = "Number of mobile co-browsing sessions in the conversation.")
	public Integer getMobileCobrowsingCount() {
		return mobileCobrowsingCount;
	}

	public void setMobileCobrowsingCount(Integer mobileCobrowsingCount) {
		this.mobileCobrowsingCount = mobileCobrowsingCount;
	}

	public ConversationMetricsAnalyticsKpiData mobileCobrowsingDurationMs(Long mobileCobrowsingDurationMs) {
		this.mobileCobrowsingDurationMs = mobileCobrowsingDurationMs;
		return this;
	}

	/**
	 * The total duration (ms) of mobile co-browsing sessions in the conversation.
	 * 
	 * @return mobileCobrowsingDurationMs
	 **/
	@ApiModelProperty(value = "The total duration (ms) of mobile co-browsing sessions in the conversation.")
	public Long getMobileCobrowsingDurationMs() {
		return mobileCobrowsingDurationMs;
	}

	public void setMobileCobrowsingDurationMs(Long mobileCobrowsingDurationMs) {
		this.mobileCobrowsingDurationMs = mobileCobrowsingDurationMs;
	}

	public ConversationMetricsAnalyticsKpiData documentCobrowsingCount(Integer documentCobrowsingCount) {
		this.documentCobrowsingCount = documentCobrowsingCount;
		return this;
	}

	/**
	 * The number of document co-browsing sessions in the conversation.
	 * 
	 * @return documentCobrowsingCount
	 **/
	@ApiModelProperty(value = "The number of document co-browsing sessions in the conversation.")
	public Integer getDocumentCobrowsingCount() {
		return documentCobrowsingCount;
	}

	public void setDocumentCobrowsingCount(Integer documentCobrowsingCount) {
		this.documentCobrowsingCount = documentCobrowsingCount;
	}

	public ConversationMetricsAnalyticsKpiData documentCobrowsingDurationMs(Long documentCobrowsingDurationMs) {
		this.documentCobrowsingDurationMs = documentCobrowsingDurationMs;
		return this;
	}

	/**
	 * The total duration (ms) of document co-browsing sessions in the conversation.
	 * 
	 * @return documentCobrowsingDurationMs
	 **/
	@ApiModelProperty(value = "The total duration (ms) of document co-browsing sessions in the conversation.")
	public Long getDocumentCobrowsingDurationMs() {
		return documentCobrowsingDurationMs;
	}

	public void setDocumentCobrowsingDurationMs(Long documentCobrowsingDurationMs) {
		this.documentCobrowsingDurationMs = documentCobrowsingDurationMs;
	}

	public ConversationMetricsAnalyticsKpiData whiteboardCount(Integer whiteboardCount) {
		this.whiteboardCount = whiteboardCount;
		return this;
	}

	/**
	 * The number of whiteboard sessions in the conversation.
	 * 
	 * @return whiteboardCount
	 **/
	@ApiModelProperty(value = "The number of whiteboard sessions in the conversation.")
	public Integer getWhiteboardCount() {
		return whiteboardCount;
	}

	public void setWhiteboardCount(Integer whiteboardCount) {
		this.whiteboardCount = whiteboardCount;
	}

	public ConversationMetricsAnalyticsKpiData whiteboardDurationMs(Long whiteboardDurationMs) {
		this.whiteboardDurationMs = whiteboardDurationMs;
		return this;
	}

	/**
	 * The total duration (ms) of whiteboard sessions in the conversation.
	 * 
	 * @return whiteboardDurationMs
	 **/
	@ApiModelProperty(value = "The total duration (ms) of whiteboard sessions in the conversation.")
	public Long getWhiteboardDurationMs() {
		return whiteboardDurationMs;
	}

	public void setWhiteboardDurationMs(Long whiteboardDurationMs) {
		this.whiteboardDurationMs = whiteboardDurationMs;
	}

	public ConversationMetricsAnalyticsKpiData universalCobrowsingCount(Integer universalCobrowsingCount) {
		this.universalCobrowsingCount = universalCobrowsingCount;
		return this;
	}

	/**
	 * The number of universal co-browsing sessions in the conversation.
	 * 
	 * @return universalCobrowsingCount
	 **/
	@ApiModelProperty(value = "The number of universal co-browsing sessions in the conversation.")
	public Integer getUniversalCobrowsingCount() {
		return universalCobrowsingCount;
	}

	public void setUniversalCobrowsingCount(Integer universalCobrowsingCount) {
		this.universalCobrowsingCount = universalCobrowsingCount;
	}

	public ConversationMetricsAnalyticsKpiData universalCobrowsingDurationMs(Long universalCobrowsingDurationMs) {
		this.universalCobrowsingDurationMs = universalCobrowsingDurationMs;
		return this;
	}

	/**
	 * The total duration (ms) of universal co-browsing sessions in the conversation.
	 * 
	 * @return universalCobrowsingDurationMs
	 **/
	@ApiModelProperty(value = "The total duration (ms) of universal co-browsing sessions in the conversation.")
	public Long getUniversalCobrowsingDurationMs() {
		return universalCobrowsingDurationMs;
	}

	public void setUniversalCobrowsingDurationMs(Long universalCobrowsingDurationMs) {
		this.universalCobrowsingDurationMs = universalCobrowsingDurationMs;
	}

	public ConversationMetricsAnalyticsKpiData documentCameraSharingCount(Integer documentCameraSharingCount) {
		this.documentCameraSharingCount = documentCameraSharingCount;
		return this;
	}

	/**
	 * The number of document camera sharing sessions in the conversation.
	 * 
	 * @return documentCameraSharingCount
	 **/
	@ApiModelProperty(value = "The number of document camera sharing sessions in the conversation.")
	public Integer getDocumentCameraSharingCount() {
		return documentCameraSharingCount;
	}

	public void setDocumentCameraSharingCount(Integer documentCameraSharingCount) {
		this.documentCameraSharingCount = documentCameraSharingCount;
	}

	public ConversationMetricsAnalyticsKpiData documentCameraSharingDurationMs(Long documentCameraSharingDurationMs) {
		this.documentCameraSharingDurationMs = documentCameraSharingDurationMs;
		return this;
	}

	/**
	 * The total duration (ms) of document camera sharing sessions in the conversation.
	 * 
	 * @return documentCameraSharingDurationMs
	 **/
	@ApiModelProperty(value = "The total duration (ms) of document camera sharing sessions in the conversation.")
	public Long getDocumentCameraSharingDurationMs() {
		return documentCameraSharingDurationMs;
	}

	public void setDocumentCameraSharingDurationMs(Long documentCameraSharingDurationMs) {
		this.documentCameraSharingDurationMs = documentCameraSharingDurationMs;
	}

	public ConversationMetricsAnalyticsKpiData callsCount(Integer callsCount) {
		this.callsCount = callsCount;
		return this;
	}

	/**
	 * The number of calls in the conversation.
	 * 
	 * @return callsCount
	 **/
	@ApiModelProperty(value = "The number of calls in the conversation.")
	public Integer getCallsCount() {
		return callsCount;
	}

	public void setCallsCount(Integer callsCount) {
		this.callsCount = callsCount;
	}

	public ConversationMetricsAnalyticsKpiData callsDurationMs(Long callsDurationMs) {
		this.callsDurationMs = callsDurationMs;
		return this;
	}

	/**
	 * The total duration (ms) of calls in the conversation.
	 * 
	 * @return callsDurationMs
	 **/
	@ApiModelProperty(value = "The total duration (ms) of calls in the conversation.")
	public Long getCallsDurationMs() {
		return callsDurationMs;
	}

	public void setCallsDurationMs(Long callsDurationMs) {
		this.callsDurationMs = callsDurationMs;
	}

	public ConversationMetricsAnalyticsKpiData systemMessageCount(Integer systemMessageCount) {
		this.systemMessageCount = systemMessageCount;
		return this;
	}

	/**
	 * The number of system messages in the conversation.
	 * 
	 * @return systemMessageCount
	 **/
	@ApiModelProperty(value = "The number of system messages in the conversation.")
	public Integer getSystemMessageCount() {
		return systemMessageCount;
	}

	public void setSystemMessageCount(Integer systemMessageCount) {
		this.systemMessageCount = systemMessageCount;
	}

	public ConversationMetricsAnalyticsKpiData botMessageCount(Integer botMessageCount) {
		this.botMessageCount = botMessageCount;
		return this;
	}

	/**
	 * The number of bot messages in the conversation.
	 * 
	 * @return botMessageCount
	 **/
	@ApiModelProperty(value = "The number of bot messages in the conversation.")
	public Integer getBotMessageCount() {
		return botMessageCount;
	}

	public void setBotMessageCount(Integer botMessageCount) {
		this.botMessageCount = botMessageCount;
	}

	public ConversationMetricsAnalyticsKpiData agentMessageCount(Integer agentMessageCount) {
		this.agentMessageCount = agentMessageCount;
		return this;
	}

	/**
	 * The number of agent messages in the conversation.
	 * 
	 * @return agentMessageCount
	 **/
	@ApiModelProperty(value = "The number of agent messages in the conversation.")
	public Integer getAgentMessageCount() {
		return agentMessageCount;
	}

	public void setAgentMessageCount(Integer agentMessageCount) {
		this.agentMessageCount = agentMessageCount;
	}

	public ConversationMetricsAnalyticsKpiData visitorMessageCount(Integer visitorMessageCount) {
		this.visitorMessageCount = visitorMessageCount;
		return this;
	}

	/**
	 * The number of visitor messages in the conversation.
	 * 
	 * @return visitorMessageCount
	 **/
	@ApiModelProperty(value = "The number of visitor messages in the conversation.")
	public Integer getVisitorMessageCount() {
		return visitorMessageCount;
	}

	public void setVisitorMessageCount(Integer visitorMessageCount) {
		this.visitorMessageCount = visitorMessageCount;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationMetricsAnalyticsKpiData conversationMetricsAnalyticsKpiData = (ConversationMetricsAnalyticsKpiData) o;
		return Objects.equals(this.$type, conversationMetricsAnalyticsKpiData.$type) &&
				Objects.equals(this.screenSharingCount, conversationMetricsAnalyticsKpiData.screenSharingCount) &&
				Objects.equals(this.screenSharingDurationMs, conversationMetricsAnalyticsKpiData.screenSharingDurationMs) &&
				Objects.equals(this.embeddedCobrowsingCount, conversationMetricsAnalyticsKpiData.embeddedCobrowsingCount) &&
				Objects.equals(this.embeddedCobrowsingDurationMs, conversationMetricsAnalyticsKpiData.embeddedCobrowsingDurationMs) &&
				Objects.equals(this.contextMigrationCobrowsingCount, conversationMetricsAnalyticsKpiData.contextMigrationCobrowsingCount) &&
				Objects.equals(this.contextMigrationCobrowsingDurationMs, conversationMetricsAnalyticsKpiData.contextMigrationCobrowsingDurationMs) &&
				Objects.equals(this.mobileCobrowsingCount, conversationMetricsAnalyticsKpiData.mobileCobrowsingCount) &&
				Objects.equals(this.mobileCobrowsingDurationMs, conversationMetricsAnalyticsKpiData.mobileCobrowsingDurationMs) &&
				Objects.equals(this.documentCobrowsingCount, conversationMetricsAnalyticsKpiData.documentCobrowsingCount) &&
				Objects.equals(this.documentCobrowsingDurationMs, conversationMetricsAnalyticsKpiData.documentCobrowsingDurationMs) &&
				Objects.equals(this.whiteboardCount, conversationMetricsAnalyticsKpiData.whiteboardCount) &&
				Objects.equals(this.whiteboardDurationMs, conversationMetricsAnalyticsKpiData.whiteboardDurationMs) &&
				Objects.equals(this.universalCobrowsingCount, conversationMetricsAnalyticsKpiData.universalCobrowsingCount) &&
				Objects.equals(this.universalCobrowsingDurationMs, conversationMetricsAnalyticsKpiData.universalCobrowsingDurationMs) &&
				Objects.equals(this.documentCameraSharingCount, conversationMetricsAnalyticsKpiData.documentCameraSharingCount) &&
				Objects.equals(this.documentCameraSharingDurationMs, conversationMetricsAnalyticsKpiData.documentCameraSharingDurationMs) &&
				Objects.equals(this.callsCount, conversationMetricsAnalyticsKpiData.callsCount) &&
				Objects.equals(this.callsDurationMs, conversationMetricsAnalyticsKpiData.callsDurationMs) &&
				Objects.equals(this.systemMessageCount, conversationMetricsAnalyticsKpiData.systemMessageCount) &&
				Objects.equals(this.botMessageCount, conversationMetricsAnalyticsKpiData.botMessageCount) &&
				Objects.equals(this.agentMessageCount, conversationMetricsAnalyticsKpiData.agentMessageCount) &&
				Objects.equals(this.visitorMessageCount, conversationMetricsAnalyticsKpiData.visitorMessageCount);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, screenSharingCount, screenSharingDurationMs, embeddedCobrowsingCount, embeddedCobrowsingDurationMs, contextMigrationCobrowsingCount, contextMigrationCobrowsingDurationMs, mobileCobrowsingCount, mobileCobrowsingDurationMs, documentCobrowsingCount, documentCobrowsingDurationMs, whiteboardCount, whiteboardDurationMs, universalCobrowsingCount, universalCobrowsingDurationMs, documentCameraSharingCount, documentCameraSharingDurationMs, callsCount, callsDurationMs, systemMessageCount, botMessageCount, agentMessageCount, visitorMessageCount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationMetricsAnalyticsKpiData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    screenSharingCount: ").append(toIndentedString(screenSharingCount)).append("\n");
		sb.append("    screenSharingDurationMs: ").append(toIndentedString(screenSharingDurationMs)).append("\n");
		sb.append("    embeddedCobrowsingCount: ").append(toIndentedString(embeddedCobrowsingCount)).append("\n");
		sb.append("    embeddedCobrowsingDurationMs: ").append(toIndentedString(embeddedCobrowsingDurationMs)).append("\n");
		sb.append("    contextMigrationCobrowsingCount: ").append(toIndentedString(contextMigrationCobrowsingCount)).append("\n");
		sb.append("    contextMigrationCobrowsingDurationMs: ").append(toIndentedString(contextMigrationCobrowsingDurationMs)).append("\n");
		sb.append("    mobileCobrowsingCount: ").append(toIndentedString(mobileCobrowsingCount)).append("\n");
		sb.append("    mobileCobrowsingDurationMs: ").append(toIndentedString(mobileCobrowsingDurationMs)).append("\n");
		sb.append("    documentCobrowsingCount: ").append(toIndentedString(documentCobrowsingCount)).append("\n");
		sb.append("    documentCobrowsingDurationMs: ").append(toIndentedString(documentCobrowsingDurationMs)).append("\n");
		sb.append("    whiteboardCount: ").append(toIndentedString(whiteboardCount)).append("\n");
		sb.append("    whiteboardDurationMs: ").append(toIndentedString(whiteboardDurationMs)).append("\n");
		sb.append("    universalCobrowsingCount: ").append(toIndentedString(universalCobrowsingCount)).append("\n");
		sb.append("    universalCobrowsingDurationMs: ").append(toIndentedString(universalCobrowsingDurationMs)).append("\n");
		sb.append("    documentCameraSharingCount: ").append(toIndentedString(documentCameraSharingCount)).append("\n");
		sb.append("    documentCameraSharingDurationMs: ").append(toIndentedString(documentCameraSharingDurationMs)).append("\n");
		sb.append("    callsCount: ").append(toIndentedString(callsCount)).append("\n");
		sb.append("    callsDurationMs: ").append(toIndentedString(callsDurationMs)).append("\n");
		sb.append("    systemMessageCount: ").append(toIndentedString(systemMessageCount)).append("\n");
		sb.append("    botMessageCount: ").append(toIndentedString(botMessageCount)).append("\n");
		sb.append("    agentMessageCount: ").append(toIndentedString(agentMessageCount)).append("\n");
		sb.append("    visitorMessageCount: ").append(toIndentedString(visitorMessageCount)).append("\n");
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
