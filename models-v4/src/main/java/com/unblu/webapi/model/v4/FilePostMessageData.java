
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.List;
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
 * Message which contains a file and optionally a caption text. The text should be a description of the attached file.
 */
@ApiModel(description = "Message which contains a file and optionally a caption text. The text should be a description of the attached file.")

@JsonPropertyOrder({
	FilePostMessageData.JSON_PROPERTY_$_TYPE,
	FilePostMessageData.JSON_PROPERTY_TYPE,
	FilePostMessageData.JSON_PROPERTY_FALLBACK_TEXT,
	FilePostMessageData.JSON_PROPERTY_FILE_NAME,
	FilePostMessageData.JSON_PROPERTY_CAPTION,
	FilePostMessageData.JSON_PROPERTY_CAPTION_TYPE,
	FilePostMessageData.JSON_PROPERTY_FILE_DATA,
	FilePostMessageData.JSON_PROPERTY_QUICK_REPLIES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class FilePostMessageData implements PostMessageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		FILEPOSTMESSAGEDATA("FilePostMessageData");

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
			return TypeEnum.FILEPOSTMESSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.FILEPOSTMESSAGEDATA;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EPostMessageType type = EPostMessageType.FILE;

	public static final String JSON_PROPERTY_FALLBACK_TEXT = "fallbackText";
	@JsonProperty(JSON_PROPERTY_FALLBACK_TEXT)
	private String fallbackText;

	public static final String JSON_PROPERTY_FILE_NAME = "fileName";
	@JsonProperty(JSON_PROPERTY_FILE_NAME)
	private String fileName;

	public static final String JSON_PROPERTY_CAPTION = "caption";
	@JsonProperty(JSON_PROPERTY_CAPTION)
	private String caption;

	public static final String JSON_PROPERTY_CAPTION_TYPE = "captionType";
	@JsonProperty(JSON_PROPERTY_CAPTION_TYPE)
	private EConversationMessageTextType captionType;

	public static final String JSON_PROPERTY_FILE_DATA = "fileData";
	@JsonProperty(JSON_PROPERTY_FILE_DATA)
	private String fileData;

	public static final String JSON_PROPERTY_QUICK_REPLIES = "quickReplies";
	@JsonProperty(JSON_PROPERTY_QUICK_REPLIES)
	private List<QuickReply> quickReplies = null;

	public FilePostMessageData $type(TypeEnum $type) {
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

	public FilePostMessageData type(EPostMessageType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EPostMessageType getType() {
		return type;
	}

	public void setType(EPostMessageType type) {
		this.type = type;
	}

	public FilePostMessageData fallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
		return this;
	}

	/**
	 * Optional fallback text which is used when: &lt;ul&gt; &lt;li&gt;Unblu can&#39;t restore the complex content of a message&lt;/li&gt; &lt;li&gt;A push
	 * notification couldn&#39;t be decrypted&lt;/li&gt; &lt;li&gt;Last message in the conversation overview&lt;/li&gt; &lt;/ul&gt; The usage of this field is
	 * recommended especially for complex message types.&lt;br&gt; The value must not contain markdown.&lt;br&gt; If no fallback is given, a fallback text based on
	 * the content of the message is generated. This may however not always be a perfect textual representation of the message.&lt;br&gt;
	 * 
	 * @return fallbackText
	 **/
	@ApiModelProperty(value = "Optional fallback text which is used when: <ul> <li>Unblu can't restore the complex content of a message</li> <li>A push notification couldn't be decrypted</li> <li>Last message in the conversation overview</li> </ul> The usage of this field is recommended especially for complex message types.<br> The value must not contain markdown.<br> If no fallback is given, a fallback text based on the content of the message is generated. This may however not always be a perfect textual representation of the message.<br>")
	public String getFallbackText() {
		return fallbackText;
	}

	public void setFallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
	}

	public FilePostMessageData fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	/**
	 * The name of the file that is send
	 * 
	 * @return fileName
	 **/
	@ApiModelProperty(value = "The name of the file that is send")
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public FilePostMessageData caption(String caption) {
		this.caption = caption;
		return this;
	}

	/**
	 * A caption for the file that is send. Can be omitted
	 * 
	 * @return caption
	 **/
	@ApiModelProperty(value = "A caption for the file that is send. Can be omitted")
	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public FilePostMessageData captionType(EConversationMessageTextType captionType) {
		this.captionType = captionType;
		return this;
	}

	/**
	 * Get captionType
	 * 
	 * @return captionType
	 **/
	@ApiModelProperty(value = "")
	public EConversationMessageTextType getCaptionType() {
		return captionType;
	}

	public void setCaptionType(EConversationMessageTextType captionType) {
		this.captionType = captionType;
	}

	public FilePostMessageData fileData(String fileData) {
		this.fileData = fileData;
		return this;
	}

	/**
	 * The the content of the file as data URL scheme (RFC2397 - &lt;code&gt;data:[&amp;lt;mediatype&amp;gt;][;base64],&amp;lt;data&amp;gt;&lt;/code&gt;)
	 * 
	 * @return fileData
	 **/
	@ApiModelProperty(value = "The the content of the file as data URL scheme (RFC2397 - <code>data:[&lt;mediatype&gt;][;base64],&lt;data&gt;</code>)")
	public String getFileData() {
		return fileData;
	}

	public void setFileData(String fileData) {
		this.fileData = fileData;
	}

	public FilePostMessageData quickReplies(List<QuickReply> quickReplies) {
		this.quickReplies = quickReplies;
		return this;
	}

	public FilePostMessageData addQuickRepliesItem(QuickReply quickRepliesItem) {
		if (this.quickReplies == null) {
			this.quickReplies = new ArrayList<>();
		}
		this.quickReplies.add(quickRepliesItem);
		return this;
	}

	/**
	 * Optional list of quick replies available to the message&#39;s recipients &lt;p&gt; Max number of quick replies is 13.
	 * 
	 * @return quickReplies
	 **/
	@ApiModelProperty(value = "Optional list of quick replies available to the message's recipients <p> Max number of quick replies is 13.")
	public List<QuickReply> getQuickReplies() {
		return quickReplies;
	}

	public void setQuickReplies(List<QuickReply> quickReplies) {
		this.quickReplies = quickReplies;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FilePostMessageData filePostMessageData = (FilePostMessageData) o;
		return Objects.equals(this.$type, filePostMessageData.$type) &&
				Objects.equals(this.type, filePostMessageData.type) &&
				Objects.equals(this.fallbackText, filePostMessageData.fallbackText) &&
				Objects.equals(this.fileName, filePostMessageData.fileName) &&
				Objects.equals(this.caption, filePostMessageData.caption) &&
				Objects.equals(this.captionType, filePostMessageData.captionType) &&
				Objects.equals(this.fileData, filePostMessageData.fileData) &&
				Objects.equals(this.quickReplies, filePostMessageData.quickReplies);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, fallbackText, fileName, caption, captionType, fileData, quickReplies);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FilePostMessageData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    fallbackText: ").append(toIndentedString(fallbackText)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
		sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
		sb.append("    captionType: ").append(toIndentedString(captionType)).append("\n");
		sb.append("    fileData: ").append(toIndentedString(fileData)).append("\n");
		sb.append("    quickReplies: ").append(toIndentedString(quickReplies)).append("\n");
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
