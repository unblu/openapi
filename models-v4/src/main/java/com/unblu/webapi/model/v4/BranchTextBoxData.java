
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
 * Data model for a branch text box
 */
@ApiModel(description = "Data model for a branch text box")

@JsonPropertyOrder({
	BranchTextBoxData.JSON_PROPERTY_$_TYPE,
	BranchTextBoxData.JSON_PROPERTY_ID,
	BranchTextBoxData.JSON_PROPERTY_TEXT,
	BranchTextBoxData.JSON_PROPERTY_FONT_SIZE,
	BranchTextBoxData.JSON_PROPERTY_FONT_COLOR,
	BranchTextBoxData.JSON_PROPERTY_BACKGROUND_COLOR,
	BranchTextBoxData.JSON_PROPERTY_TRANSLATIONS,
	BranchTextBoxData.JSON_PROPERTY_X,
	BranchTextBoxData.JSON_PROPERTY_Y,
	BranchTextBoxData.JSON_PROPERTY_WIDTH,
	BranchTextBoxData.JSON_PROPERTY_HEIGHT,
	BranchTextBoxData.JSON_PROPERTY_ROTATION,
	BranchTextBoxData.JSON_PROPERTY_HORIZONTAL_TEXT_ALIGN,
	BranchTextBoxData.JSON_PROPERTY_VERTICAL_TEXT_ALIGN,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BranchTextBoxData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BRANCHTEXTBOXDATA("BranchTextBoxData");

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
			return TypeEnum.BRANCHTEXTBOXDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BRANCHTEXTBOXDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private String text;

	public static final String JSON_PROPERTY_FONT_SIZE = "fontSize";
	@JsonProperty(JSON_PROPERTY_FONT_SIZE)
	private Integer fontSize;

	public static final String JSON_PROPERTY_FONT_COLOR = "fontColor";
	@JsonProperty(JSON_PROPERTY_FONT_COLOR)
	private String fontColor;

	public static final String JSON_PROPERTY_BACKGROUND_COLOR = "backgroundColor";
	@JsonProperty(JSON_PROPERTY_BACKGROUND_COLOR)
	private String backgroundColor;

	public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
	@JsonProperty(JSON_PROPERTY_TRANSLATIONS)
	private Map<String, BranchTextBoxTranslation> translations = null;

	public static final String JSON_PROPERTY_X = "x";
	@JsonProperty(JSON_PROPERTY_X)
	private Integer x;

	public static final String JSON_PROPERTY_Y = "y";
	@JsonProperty(JSON_PROPERTY_Y)
	private Integer y;

	public static final String JSON_PROPERTY_WIDTH = "width";
	@JsonProperty(JSON_PROPERTY_WIDTH)
	private Integer width;

	public static final String JSON_PROPERTY_HEIGHT = "height";
	@JsonProperty(JSON_PROPERTY_HEIGHT)
	private Integer height;

	public static final String JSON_PROPERTY_ROTATION = "rotation";
	@JsonProperty(JSON_PROPERTY_ROTATION)
	private Integer rotation;

	public static final String JSON_PROPERTY_HORIZONTAL_TEXT_ALIGN = "horizontalTextAlign";
	@JsonProperty(JSON_PROPERTY_HORIZONTAL_TEXT_ALIGN)
	private ETextBoxAlign horizontalTextAlign;

	public static final String JSON_PROPERTY_VERTICAL_TEXT_ALIGN = "verticalTextAlign";
	@JsonProperty(JSON_PROPERTY_VERTICAL_TEXT_ALIGN)
	private ETextBoxAlign verticalTextAlign;

	public BranchTextBoxData $type(TypeEnum $type) {
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

	public BranchTextBoxData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * ID of the branch text box
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "ID of the branch text box")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BranchTextBoxData text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * Text of the branch text box. Maximum of 500 characters. Optional.
	 * 
	 * @return text
	 **/
	@ApiModelProperty(value = "Text of the branch text box. Maximum of 500 characters. Optional.")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public BranchTextBoxData fontSize(Integer fontSize) {
		this.fontSize = fontSize;
		return this;
	}

	/**
	 * Font size in the text box
	 * 
	 * @return fontSize
	 **/
	@ApiModelProperty(value = "Font size in the text box")
	public Integer getFontSize() {
		return fontSize;
	}

	public void setFontSize(Integer fontSize) {
		this.fontSize = fontSize;
	}

	public BranchTextBoxData fontColor(String fontColor) {
		this.fontColor = fontColor;
		return this;
	}

	/**
	 * Color of text in the text box
	 * 
	 * @return fontColor
	 **/
	@ApiModelProperty(value = "Color of text in the text box")
	public String getFontColor() {
		return fontColor;
	}

	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}

	public BranchTextBoxData backgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	/**
	 * Background color of the text box
	 * 
	 * @return backgroundColor
	 **/
	@ApiModelProperty(value = "Background color of the text box")
	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public BranchTextBoxData translations(Map<String, BranchTextBoxTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public BranchTextBoxData putTranslationsItem(String key, BranchTextBoxTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A Map of localized versions of the text field of the branch text box
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A Map of localized versions of the text field of the branch text box")
	public Map<String, BranchTextBoxTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, BranchTextBoxTranslation> translations) {
		this.translations = translations;
	}

	public BranchTextBoxData x(Integer x) {
		this.x = x;
		return this;
	}

	/**
	 * X coordinate of the text box on the floor plan. 0 marks the left edge of the plan.
	 * 
	 * @return x
	 **/
	@ApiModelProperty(value = "X coordinate of the text box on the floor plan. 0 marks the left edge of the plan.")
	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public BranchTextBoxData y(Integer y) {
		this.y = y;
		return this;
	}

	/**
	 * Y coordinate of the text box on the floor plan. 0 marks the top edge of the plan.
	 * 
	 * @return y
	 **/
	@ApiModelProperty(value = "Y coordinate of the text box on the floor plan. 0 marks the top edge of the plan.")
	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public BranchTextBoxData width(Integer width) {
		this.width = width;
		return this;
	}

	/**
	 * Width of the text box on the floor plan
	 * 
	 * @return width
	 **/
	@ApiModelProperty(value = "Width of the text box on the floor plan")
	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public BranchTextBoxData height(Integer height) {
		this.height = height;
		return this;
	}

	/**
	 * Height of the text box on the floor plan
	 * 
	 * @return height
	 **/
	@ApiModelProperty(value = "Height of the text box on the floor plan")
	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public BranchTextBoxData rotation(Integer rotation) {
		this.rotation = rotation;
		return this;
	}

	/**
	 * Rotation, in degrees, of the text box on the floor plan. The rotation is clockwise.
	 * 
	 * @return rotation
	 **/
	@ApiModelProperty(value = "Rotation, in degrees, of the text box on the floor plan. The rotation is clockwise.")
	public Integer getRotation() {
		return rotation;
	}

	public void setRotation(Integer rotation) {
		this.rotation = rotation;
	}

	public BranchTextBoxData horizontalTextAlign(ETextBoxAlign horizontalTextAlign) {
		this.horizontalTextAlign = horizontalTextAlign;
		return this;
	}

	/**
	 * Get horizontalTextAlign
	 * 
	 * @return horizontalTextAlign
	 **/
	@ApiModelProperty(value = "")
	public ETextBoxAlign getHorizontalTextAlign() {
		return horizontalTextAlign;
	}

	public void setHorizontalTextAlign(ETextBoxAlign horizontalTextAlign) {
		this.horizontalTextAlign = horizontalTextAlign;
	}

	public BranchTextBoxData verticalTextAlign(ETextBoxAlign verticalTextAlign) {
		this.verticalTextAlign = verticalTextAlign;
		return this;
	}

	/**
	 * Get verticalTextAlign
	 * 
	 * @return verticalTextAlign
	 **/
	@ApiModelProperty(value = "")
	public ETextBoxAlign getVerticalTextAlign() {
		return verticalTextAlign;
	}

	public void setVerticalTextAlign(ETextBoxAlign verticalTextAlign) {
		this.verticalTextAlign = verticalTextAlign;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BranchTextBoxData branchTextBoxData = (BranchTextBoxData) o;
		return Objects.equals(this.$type, branchTextBoxData.$type) &&
				Objects.equals(this.id, branchTextBoxData.id) &&
				Objects.equals(this.text, branchTextBoxData.text) &&
				Objects.equals(this.fontSize, branchTextBoxData.fontSize) &&
				Objects.equals(this.fontColor, branchTextBoxData.fontColor) &&
				Objects.equals(this.backgroundColor, branchTextBoxData.backgroundColor) &&
				Objects.equals(this.translations, branchTextBoxData.translations) &&
				Objects.equals(this.x, branchTextBoxData.x) &&
				Objects.equals(this.y, branchTextBoxData.y) &&
				Objects.equals(this.width, branchTextBoxData.width) &&
				Objects.equals(this.height, branchTextBoxData.height) &&
				Objects.equals(this.rotation, branchTextBoxData.rotation) &&
				Objects.equals(this.horizontalTextAlign, branchTextBoxData.horizontalTextAlign) &&
				Objects.equals(this.verticalTextAlign, branchTextBoxData.verticalTextAlign);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, text, fontSize, fontColor, backgroundColor, translations, x, y, width, height, rotation, horizontalTextAlign, verticalTextAlign);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BranchTextBoxData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
		sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
		sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
		sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
		sb.append("    x: ").append(toIndentedString(x)).append("\n");
		sb.append("    y: ").append(toIndentedString(y)).append("\n");
		sb.append("    width: ").append(toIndentedString(width)).append("\n");
		sb.append("    height: ").append(toIndentedString(height)).append("\n");
		sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
		sb.append("    horizontalTextAlign: ").append(toIndentedString(horizontalTextAlign)).append("\n");
		sb.append("    verticalTextAlign: ").append(toIndentedString(verticalTextAlign)).append("\n");
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
