
package com.unblu.webapi.model.v3;

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
 * Webhook-CallLog model class. Log entry about each call to a registered webhook
 */
@ApiModel(description = "Webhook-CallLog model class. Log entry about each call to a registered webhook")

@JsonPropertyOrder({
	WebhookCallLog.JSON_PROPERTY_$_TYPE,
	WebhookCallLog.JSON_PROPERTY_ID,
	WebhookCallLog.JSON_PROPERTY_CREATION_TIMESTAMP,
	WebhookCallLog.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	WebhookCallLog.JSON_PROPERTY_VERSION,
	WebhookCallLog.JSON_PROPERTY_ACCOUNT_ID,
	WebhookCallLog.JSON_PROPERTY_REGISTRATION_ID,
	WebhookCallLog.JSON_PROPERTY_REQUEST_ID,
	WebhookCallLog.JSON_PROPERTY_EXECUTION_TIMESTAMP,
	WebhookCallLog.JSON_PROPERTY_ENDPOINT,
	WebhookCallLog.JSON_PROPERTY_RETRY_NR,
	WebhookCallLog.JSON_PROPERTY_CALL_ID,
	WebhookCallLog.JSON_PROPERTY_EVENT_NAME,
	WebhookCallLog.JSON_PROPERTY_REQUEST_HEADERS,
	WebhookCallLog.JSON_PROPERTY_REQUEST_SENT,
	WebhookCallLog.JSON_PROPERTY_REQUEST_SENT_TABLE_COLUMN,
	WebhookCallLog.JSON_PROPERTY_REQUEST_FILE_STORE_ID,
	WebhookCallLog.JSON_PROPERTY_HTTP_RESPONSE_CODE,
	WebhookCallLog.JSON_PROPERTY_HTTP_RESPONSE_REASON,
	WebhookCallLog.JSON_PROPERTY_HTTP_RESPONSE_HEADERS,
	WebhookCallLog.JSON_PROPERTY_RESPONSE_FROM_SERVER,
	WebhookCallLog.JSON_PROPERTY_RESPONSE_FROM_SERVER_TABLE_COLUMN,
	WebhookCallLog.JSON_PROPERTY_RESPONSE_MIME_TYPE,
	WebhookCallLog.JSON_PROPERTY_RESPONSE_FILE_STORE_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WebhookCallLog {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WEBHOOKCALLLOG("WebhookCallLog");

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
			return TypeEnum.WEBHOOKCALLLOG;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WEBHOOKCALLLOG;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_VERSION = "version";
	@JsonProperty(JSON_PROPERTY_VERSION)
	private Long version;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_REGISTRATION_ID = "registrationId";
	@JsonProperty(JSON_PROPERTY_REGISTRATION_ID)
	private String registrationId;

	public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
	@JsonProperty(JSON_PROPERTY_REQUEST_ID)
	private String requestId;

	public static final String JSON_PROPERTY_EXECUTION_TIMESTAMP = "executionTimestamp";
	@JsonProperty(JSON_PROPERTY_EXECUTION_TIMESTAMP)
	private Long executionTimestamp;

	public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
	@JsonProperty(JSON_PROPERTY_ENDPOINT)
	private String endpoint;

	public static final String JSON_PROPERTY_RETRY_NR = "retryNr";
	@JsonProperty(JSON_PROPERTY_RETRY_NR)
	private Long retryNr;

	public static final String JSON_PROPERTY_CALL_ID = "callId";
	@JsonProperty(JSON_PROPERTY_CALL_ID)
	private String callId;

	public static final String JSON_PROPERTY_EVENT_NAME = "eventName";
	@JsonProperty(JSON_PROPERTY_EVENT_NAME)
	private String eventName;

	public static final String JSON_PROPERTY_REQUEST_HEADERS = "requestHeaders";
	@JsonProperty(JSON_PROPERTY_REQUEST_HEADERS)
	private String requestHeaders;

	public static final String JSON_PROPERTY_REQUEST_SENT = "requestSent";
	@JsonProperty(JSON_PROPERTY_REQUEST_SENT)
	private String requestSent;

	public static final String JSON_PROPERTY_REQUEST_SENT_TABLE_COLUMN = "requestSentTableColumn";
	@JsonProperty(JSON_PROPERTY_REQUEST_SENT_TABLE_COLUMN)
	private String requestSentTableColumn;

	public static final String JSON_PROPERTY_REQUEST_FILE_STORE_ID = "requestFileStoreId";
	@JsonProperty(JSON_PROPERTY_REQUEST_FILE_STORE_ID)
	private String requestFileStoreId;

	public static final String JSON_PROPERTY_HTTP_RESPONSE_CODE = "httpResponseCode";
	@JsonProperty(JSON_PROPERTY_HTTP_RESPONSE_CODE)
	private Integer httpResponseCode;

	public static final String JSON_PROPERTY_HTTP_RESPONSE_REASON = "httpResponseReason";
	@JsonProperty(JSON_PROPERTY_HTTP_RESPONSE_REASON)
	private String httpResponseReason;

	public static final String JSON_PROPERTY_HTTP_RESPONSE_HEADERS = "httpResponseHeaders";
	@JsonProperty(JSON_PROPERTY_HTTP_RESPONSE_HEADERS)
	private String httpResponseHeaders;

	public static final String JSON_PROPERTY_RESPONSE_FROM_SERVER = "responseFromServer";
	@JsonProperty(JSON_PROPERTY_RESPONSE_FROM_SERVER)
	private String responseFromServer;

	public static final String JSON_PROPERTY_RESPONSE_FROM_SERVER_TABLE_COLUMN = "responseFromServerTableColumn";
	@JsonProperty(JSON_PROPERTY_RESPONSE_FROM_SERVER_TABLE_COLUMN)
	private String responseFromServerTableColumn;

	public static final String JSON_PROPERTY_RESPONSE_MIME_TYPE = "responseMimeType";
	@JsonProperty(JSON_PROPERTY_RESPONSE_MIME_TYPE)
	private String responseMimeType;

	public static final String JSON_PROPERTY_RESPONSE_FILE_STORE_ID = "responseFileStoreId";
	@JsonProperty(JSON_PROPERTY_RESPONSE_FILE_STORE_ID)
	private String responseFileStoreId;

	public WebhookCallLog $type(TypeEnum $type) {
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

	public WebhookCallLog id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique id of the entity. When creating an entity this property can be omitted as it will be generated by the server anyway.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique id of the entity. When creating an entity this property can be omitted as it will be generated by the server anyway.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public WebhookCallLog creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is stored the first time in the system. It is ignored, when sending it to the server and
	 * therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data
	 * consistency.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is stored the first time in the system. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data consistency.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public WebhookCallLog modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational
	 * character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it
	 * will not be written to the storage and will not effect the data consistency.
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data consistency.")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public WebhookCallLog version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * Version of the entity. Will be incremented on each change. New updates must always be based on the newest version, if not updates will be rejected. When
	 * creating an object, the version can be omitted.
	 * 
	 * @return version
	 **/
	@ApiModelProperty(value = "Version of the entity. Will be incremented on each change. New updates must always be based on the newest version, if not updates will be rejected. When creating an object, the version can be omitted.")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public WebhookCallLog accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It will be filled by the server with the account ID of the
	 * user currently logged in. When editing an entity, you must include the account ID.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It will be filled by the server with the account ID of the user currently logged in. When editing an entity, you must include the account ID.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public WebhookCallLog registrationId(String registrationId) {
		this.registrationId = registrationId;
		return this;
	}

	/**
	 * Id of the webhook registration
	 * 
	 * @return registrationId
	 **/
	@ApiModelProperty(value = "Id of the webhook registration")
	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public WebhookCallLog requestId(String requestId) {
		this.requestId = requestId;
		return this;
	}

	/**
	 * Id of the request id created for the request to the webhook
	 * 
	 * @return requestId
	 **/
	@ApiModelProperty(value = "Id of the request id created for the request to the webhook")
	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public WebhookCallLog executionTimestamp(Long executionTimestamp) {
		this.executionTimestamp = executionTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the request to the webhook was executed
	 * 
	 * @return executionTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the request to the webhook was executed")
	public Long getExecutionTimestamp() {
		return executionTimestamp;
	}

	public void setExecutionTimestamp(Long executionTimestamp) {
		this.executionTimestamp = executionTimestamp;
	}

	public WebhookCallLog endpoint(String endpoint) {
		this.endpoint = endpoint;
		return this;
	}

	/**
	 * The webhook endpoint which was requested
	 * 
	 * @return endpoint
	 **/
	@ApiModelProperty(value = "The webhook endpoint which was requested")
	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public WebhookCallLog retryNr(Long retryNr) {
		this.retryNr = retryNr;
		return this;
	}

	/**
	 * The number of request retries done to the webhook
	 * 
	 * @return retryNr
	 **/
	@ApiModelProperty(value = "The number of request retries done to the webhook")
	public Long getRetryNr() {
		return retryNr;
	}

	public void setRetryNr(Long retryNr) {
		this.retryNr = retryNr;
	}

	public WebhookCallLog callId(String callId) {
		this.callId = callId;
		return this;
	}

	/**
	 * The id of the call
	 * 
	 * @return callId
	 **/
	@ApiModelProperty(value = "The id of the call")
	public String getCallId() {
		return callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
	}

	public WebhookCallLog eventName(String eventName) {
		this.eventName = eventName;
		return this;
	}

	/**
	 * The name of the webhook event
	 * 
	 * @return eventName
	 **/
	@ApiModelProperty(value = "The name of the webhook event")
	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public WebhookCallLog requestHeaders(String requestHeaders) {
		this.requestHeaders = requestHeaders;
		return this;
	}

	/**
	 * The request headers send with the webhook event
	 * 
	 * @return requestHeaders
	 **/
	@ApiModelProperty(value = "The request headers send with the webhook event")
	public String getRequestHeaders() {
		return requestHeaders;
	}

	public void setRequestHeaders(String requestHeaders) {
		this.requestHeaders = requestHeaders;
	}

	public WebhookCallLog requestSent(String requestSent) {
		this.requestSent = requestSent;
		return this;
	}

	/**
	 * The full send request
	 * 
	 * @return requestSent
	 **/
	@ApiModelProperty(value = "The full send request")
	public String getRequestSent() {
		return requestSent;
	}

	public void setRequestSent(String requestSent) {
		this.requestSent = requestSent;
	}

	public WebhookCallLog requestSentTableColumn(String requestSentTableColumn) {
		this.requestSentTableColumn = requestSentTableColumn;
		return this;
	}

	/**
	 * If the request data were larger then 2000 bytes, the first 2000 bytes are stored in this field. The other part is stored in the blob-store.
	 * See&#x60;requestFileStoreId&#x60;.
	 * 
	 * @return requestSentTableColumn
	 **/
	@ApiModelProperty(value = "If the request data were larger then 2000 bytes, the first 2000 bytes are stored in this field. The other part is stored in the blob-store. See`requestFileStoreId`.")
	public String getRequestSentTableColumn() {
		return requestSentTableColumn;
	}

	public void setRequestSentTableColumn(String requestSentTableColumn) {
		this.requestSentTableColumn = requestSentTableColumn;
	}

	public WebhookCallLog requestFileStoreId(String requestFileStoreId) {
		this.requestFileStoreId = requestFileStoreId;
		return this;
	}

	/**
	 * If the request data were larger then 2000 bytes, the first 2000 btes are stored in &#x60;requestSentTableColumn&#x60;. The others are stored behind this blob
	 * store id.
	 * 
	 * @return requestFileStoreId
	 **/
	@ApiModelProperty(value = "If the request data were larger then 2000 bytes, the first 2000 btes are stored in `requestSentTableColumn`. The others are stored behind this blob store id.")
	public String getRequestFileStoreId() {
		return requestFileStoreId;
	}

	public void setRequestFileStoreId(String requestFileStoreId) {
		this.requestFileStoreId = requestFileStoreId;
	}

	public WebhookCallLog httpResponseCode(Integer httpResponseCode) {
		this.httpResponseCode = httpResponseCode;
		return this;
	}

	/**
	 * HTTP response code of the request to the webhook
	 * 
	 * @return httpResponseCode
	 **/
	@ApiModelProperty(value = "HTTP response code of the request to the webhook")
	public Integer getHttpResponseCode() {
		return httpResponseCode;
	}

	public void setHttpResponseCode(Integer httpResponseCode) {
		this.httpResponseCode = httpResponseCode;
	}

	public WebhookCallLog httpResponseReason(String httpResponseReason) {
		this.httpResponseReason = httpResponseReason;
		return this;
	}

	/**
	 * HTTP response reason of the request to the webhook
	 * 
	 * @return httpResponseReason
	 **/
	@ApiModelProperty(value = "HTTP response reason of the request to the webhook")
	public String getHttpResponseReason() {
		return httpResponseReason;
	}

	public void setHttpResponseReason(String httpResponseReason) {
		this.httpResponseReason = httpResponseReason;
	}

	public WebhookCallLog httpResponseHeaders(String httpResponseHeaders) {
		this.httpResponseHeaders = httpResponseHeaders;
		return this;
	}

	/**
	 * HTTP response header of the request to the webhook
	 * 
	 * @return httpResponseHeaders
	 **/
	@ApiModelProperty(value = "HTTP response header of the request to the webhook")
	public String getHttpResponseHeaders() {
		return httpResponseHeaders;
	}

	public void setHttpResponseHeaders(String httpResponseHeaders) {
		this.httpResponseHeaders = httpResponseHeaders;
	}

	public WebhookCallLog responseFromServer(String responseFromServer) {
		this.responseFromServer = responseFromServer;
		return this;
	}

	/**
	 * Full Response data returned for the request to the webhook.
	 * 
	 * @return responseFromServer
	 **/
	@ApiModelProperty(value = "Full Response data returned for the request to the webhook.")
	public String getResponseFromServer() {
		return responseFromServer;
	}

	public void setResponseFromServer(String responseFromServer) {
		this.responseFromServer = responseFromServer;
	}

	public WebhookCallLog responseFromServerTableColumn(String responseFromServerTableColumn) {
		this.responseFromServerTableColumn = responseFromServerTableColumn;
		return this;
	}

	/**
	 * If the response to the webhook was larger then 2000 bytes, the first 2000 bytes are stored in this field. The others are stored in
	 * the&#x60;responseFileStoreId&#x60;
	 * 
	 * @return responseFromServerTableColumn
	 **/
	@ApiModelProperty(value = "If the response to the webhook was larger then 2000 bytes, the first 2000 bytes are stored in this field. The others are stored in the`responseFileStoreId`")
	public String getResponseFromServerTableColumn() {
		return responseFromServerTableColumn;
	}

	public void setResponseFromServerTableColumn(String responseFromServerTableColumn) {
		this.responseFromServerTableColumn = responseFromServerTableColumn;
	}

	public WebhookCallLog responseMimeType(String responseMimeType) {
		this.responseMimeType = responseMimeType;
		return this;
	}

	/**
	 * Get responseMimeType
	 * 
	 * @return responseMimeType
	 **/
	@ApiModelProperty(value = "")
	public String getResponseMimeType() {
		return responseMimeType;
	}

	public void setResponseMimeType(String responseMimeType) {
		this.responseMimeType = responseMimeType;
	}

	public WebhookCallLog responseFileStoreId(String responseFileStoreId) {
		this.responseFileStoreId = responseFileStoreId;
		return this;
	}

	/**
	 * If the response to the webhook was larger then 2000 bytes, the first 2000 bytes are stored inside &#x60;responseFromServerTableColumn&#x60;. The others are
	 * stored behind this blob store id.
	 * 
	 * @return responseFileStoreId
	 **/
	@ApiModelProperty(value = "If the response to the webhook was larger then 2000 bytes, the first 2000 bytes are stored inside `responseFromServerTableColumn`. The others are stored behind this blob store id.")
	public String getResponseFileStoreId() {
		return responseFileStoreId;
	}

	public void setResponseFileStoreId(String responseFileStoreId) {
		this.responseFileStoreId = responseFileStoreId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WebhookCallLog webhookCallLog = (WebhookCallLog) o;
		return Objects.equals(this.$type, webhookCallLog.$type) &&
				Objects.equals(this.id, webhookCallLog.id) &&
				Objects.equals(this.creationTimestamp, webhookCallLog.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, webhookCallLog.modificationTimestamp) &&
				Objects.equals(this.version, webhookCallLog.version) &&
				Objects.equals(this.accountId, webhookCallLog.accountId) &&
				Objects.equals(this.registrationId, webhookCallLog.registrationId) &&
				Objects.equals(this.requestId, webhookCallLog.requestId) &&
				Objects.equals(this.executionTimestamp, webhookCallLog.executionTimestamp) &&
				Objects.equals(this.endpoint, webhookCallLog.endpoint) &&
				Objects.equals(this.retryNr, webhookCallLog.retryNr) &&
				Objects.equals(this.callId, webhookCallLog.callId) &&
				Objects.equals(this.eventName, webhookCallLog.eventName) &&
				Objects.equals(this.requestHeaders, webhookCallLog.requestHeaders) &&
				Objects.equals(this.requestSent, webhookCallLog.requestSent) &&
				Objects.equals(this.requestSentTableColumn, webhookCallLog.requestSentTableColumn) &&
				Objects.equals(this.requestFileStoreId, webhookCallLog.requestFileStoreId) &&
				Objects.equals(this.httpResponseCode, webhookCallLog.httpResponseCode) &&
				Objects.equals(this.httpResponseReason, webhookCallLog.httpResponseReason) &&
				Objects.equals(this.httpResponseHeaders, webhookCallLog.httpResponseHeaders) &&
				Objects.equals(this.responseFromServer, webhookCallLog.responseFromServer) &&
				Objects.equals(this.responseFromServerTableColumn, webhookCallLog.responseFromServerTableColumn) &&
				Objects.equals(this.responseMimeType, webhookCallLog.responseMimeType) &&
				Objects.equals(this.responseFileStoreId, webhookCallLog.responseFileStoreId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, registrationId, requestId, executionTimestamp, endpoint, retryNr, callId, eventName, requestHeaders, requestSent, requestSentTableColumn, requestFileStoreId, httpResponseCode, httpResponseReason, httpResponseHeaders, responseFromServer, responseFromServerTableColumn, responseMimeType, responseFileStoreId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WebhookCallLog {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
		sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
		sb.append("    executionTimestamp: ").append(toIndentedString(executionTimestamp)).append("\n");
		sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
		sb.append("    retryNr: ").append(toIndentedString(retryNr)).append("\n");
		sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
		sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
		sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
		sb.append("    requestSent: ").append(toIndentedString(requestSent)).append("\n");
		sb.append("    requestSentTableColumn: ").append(toIndentedString(requestSentTableColumn)).append("\n");
		sb.append("    requestFileStoreId: ").append(toIndentedString(requestFileStoreId)).append("\n");
		sb.append("    httpResponseCode: ").append(toIndentedString(httpResponseCode)).append("\n");
		sb.append("    httpResponseReason: ").append(toIndentedString(httpResponseReason)).append("\n");
		sb.append("    httpResponseHeaders: ").append(toIndentedString(httpResponseHeaders)).append("\n");
		sb.append("    responseFromServer: ").append(toIndentedString(responseFromServer)).append("\n");
		sb.append("    responseFromServerTableColumn: ").append(toIndentedString(responseFromServerTableColumn)).append("\n");
		sb.append("    responseMimeType: ").append(toIndentedString(responseMimeType)).append("\n");
		sb.append("    responseFileStoreId: ").append(toIndentedString(responseFileStoreId)).append("\n");
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
