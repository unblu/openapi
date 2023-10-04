
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
 * Event sent to file upload interceptors when a new file is uploaded
 */
@ApiModel(description = "Event sent to file upload interceptors when a new file is uploaded")

@JsonPropertyOrder({
	InterceptorNewFileEvent.JSON_PROPERTY_$_TYPE,
	InterceptorNewFileEvent.JSON_PROPERTY_TIMESTAMP,
	InterceptorNewFileEvent.JSON_PROPERTY_EVENT_TYPE,
	InterceptorNewFileEvent.JSON_PROPERTY_ACCOUNT_ID,
	InterceptorNewFileEvent.JSON_PROPERTY_API_TOKEN,
	InterceptorNewFileEvent.JSON_PROPERTY_NAME,
	InterceptorNewFileEvent.JSON_PROPERTY_MIME_TYPE,
	InterceptorNewFileEvent.JSON_PROPERTY_LENGTH,
	InterceptorNewFileEvent.JSON_PROPERTY_DOWNLOAD_LINK,
	InterceptorNewFileEvent.JSON_PROPERTY_SOURCE,
	InterceptorNewFileEvent.JSON_PROPERTY_PERSON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InterceptorNewFileEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		INTERCEPTORNEWFILEEVENT("InterceptorNewFileEvent");

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
			return TypeEnum.INTERCEPTORNEWFILEEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.INTERCEPTORNEWFILEEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_API_TOKEN = "apiToken";
	@JsonProperty(JSON_PROPERTY_API_TOKEN)
	private String apiToken;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
	@JsonProperty(JSON_PROPERTY_MIME_TYPE)
	private String mimeType;

	public static final String JSON_PROPERTY_LENGTH = "length";
	@JsonProperty(JSON_PROPERTY_LENGTH)
	private Long length;

	public static final String JSON_PROPERTY_DOWNLOAD_LINK = "downloadLink";
	@JsonProperty(JSON_PROPERTY_DOWNLOAD_LINK)
	private String downloadLink;

	public static final String JSON_PROPERTY_SOURCE = "source";
	@JsonProperty(JSON_PROPERTY_SOURCE)
	private EFileUploadInterceptorSource source;

	public static final String JSON_PROPERTY_PERSON = "person";
	@JsonProperty(JSON_PROPERTY_PERSON)
	private PersonData person = null;

	public InterceptorNewFileEvent $type(TypeEnum $type) {
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

	public InterceptorNewFileEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The time (Unix time in ms) when the event was generated
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The time (Unix time in ms) when the event was generated")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public InterceptorNewFileEvent eventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * The name of the event
	 * 
	 * @return eventType
	 **/
	@ApiModelProperty(value = "The name of the event")
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public InterceptorNewFileEvent accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public InterceptorNewFileEvent apiToken(String apiToken) {
		this.apiToken = apiToken;
		return this;
	}

	/**
	 * The token to get the message&#39;s content and approve or reject the message
	 * 
	 * @return apiToken
	 **/
	@ApiModelProperty(value = "The token to get the message's content and approve or reject the message")
	public String getApiToken() {
		return apiToken;
	}

	public void setApiToken(String apiToken) {
		this.apiToken = apiToken;
	}

	public InterceptorNewFileEvent name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The name of the file
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "The name of the file")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public InterceptorNewFileEvent mimeType(String mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	/**
	 * The file&#39;s MIME type
	 * 
	 * @return mimeType
	 **/
	@ApiModelProperty(value = "The file's MIME type")
	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public InterceptorNewFileEvent length(Long length) {
		this.length = length;
		return this;
	}

	/**
	 * The length, or size, of the file in bytes
	 * 
	 * @return length
	 **/
	@ApiModelProperty(value = "The length, or size, of the file in bytes")
	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	public InterceptorNewFileEvent downloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
		return this;
	}

	/**
	 * The link to retrieve the file&#39;s contents
	 * 
	 * @return downloadLink
	 **/
	@ApiModelProperty(value = "The link to retrieve the file's contents")
	public String getDownloadLink() {
		return downloadLink;
	}

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}

	public InterceptorNewFileEvent source(EFileUploadInterceptorSource source) {
		this.source = source;
		return this;
	}

	/**
	 * Get source
	 * 
	 * @return source
	 **/
	@ApiModelProperty(value = "")
	public EFileUploadInterceptorSource getSource() {
		return source;
	}

	public void setSource(EFileUploadInterceptorSource source) {
		this.source = source;
	}

	public InterceptorNewFileEvent person(PersonData person) {
		this.person = person;
		return this;
	}

	/**
	 * Get person
	 * 
	 * @return person
	 **/
	@ApiModelProperty(value = "")
	public PersonData getPerson() {
		return person;
	}

	public void setPerson(PersonData person) {
		this.person = person;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InterceptorNewFileEvent interceptorNewFileEvent = (InterceptorNewFileEvent) o;
		return Objects.equals(this.$type, interceptorNewFileEvent.$type) &&
				Objects.equals(this.timestamp, interceptorNewFileEvent.timestamp) &&
				Objects.equals(this.eventType, interceptorNewFileEvent.eventType) &&
				Objects.equals(this.accountId, interceptorNewFileEvent.accountId) &&
				Objects.equals(this.apiToken, interceptorNewFileEvent.apiToken) &&
				Objects.equals(this.name, interceptorNewFileEvent.name) &&
				Objects.equals(this.mimeType, interceptorNewFileEvent.mimeType) &&
				Objects.equals(this.length, interceptorNewFileEvent.length) &&
				Objects.equals(this.downloadLink, interceptorNewFileEvent.downloadLink) &&
				Objects.equals(this.source, interceptorNewFileEvent.source) &&
				Objects.equals(this.person, interceptorNewFileEvent.person);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, apiToken, name, mimeType, length, downloadLink, source, person);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InterceptorNewFileEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    apiToken: ").append(toIndentedString(apiToken)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
		sb.append("    length: ").append(toIndentedString(length)).append("\n");
		sb.append("    downloadLink: ").append(toIndentedString(downloadLink)).append("\n");
		sb.append("    source: ").append(toIndentedString(source)).append("\n");
		sb.append("    person: ").append(toIndentedString(person)).append("\n");
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
