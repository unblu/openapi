
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
 * &lt;p&gt;This type is in preview mode.&lt;/p&gt;Data model object for analytics KPI reference line
 */
@ApiModel(description = "<p>This type is in preview mode.</p>Data model object for analytics KPI reference line")

@JsonPropertyOrder({
	AnalyticsKpiReferenceLine.JSON_PROPERTY_$_TYPE,
	AnalyticsKpiReferenceLine.JSON_PROPERTY_ID,
	AnalyticsKpiReferenceLine.JSON_PROPERTY_ANALYTICS_WIDGET_ID,
	AnalyticsKpiReferenceLine.JSON_PROPERTY_LABEL,
	AnalyticsKpiReferenceLine.JSON_PROPERTY_VALUE,
	AnalyticsKpiReferenceLine.JSON_PROPERTY_COLOR,
	AnalyticsKpiReferenceLine.JSON_PROPERTY_DISPLAY_TYPE,
	AnalyticsKpiReferenceLine.JSON_PROPERTY_TRANSLATIONS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AnalyticsKpiReferenceLine {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ANALYTICSKPIREFERENCELINE("AnalyticsKpiReferenceLine");

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
			return TypeEnum.ANALYTICSKPIREFERENCELINE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ANALYTICSKPIREFERENCELINE;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ANALYTICS_WIDGET_ID = "analyticsWidgetId";
	@JsonProperty(JSON_PROPERTY_ANALYTICS_WIDGET_ID)
	private String analyticsWidgetId;

	public static final String JSON_PROPERTY_LABEL = "label";
	@JsonProperty(JSON_PROPERTY_LABEL)
	private String label;

	public static final String JSON_PROPERTY_VALUE = "value";
	@JsonProperty(JSON_PROPERTY_VALUE)
	private Float value;

	public static final String JSON_PROPERTY_COLOR = "color";
	@JsonProperty(JSON_PROPERTY_COLOR)
	private String color;

	public static final String JSON_PROPERTY_DISPLAY_TYPE = "displayType";
	@JsonProperty(JSON_PROPERTY_DISPLAY_TYPE)
	private EAnalyticsKpiReferenceLineDisplayType displayType;

	public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
	@JsonProperty(JSON_PROPERTY_TRANSLATIONS)
	private Map<String, AnalyticsKpiReferenceLineTranslation> translations = null;

	public AnalyticsKpiReferenceLine $type(TypeEnum $type) {
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

	public AnalyticsKpiReferenceLine id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Reference line ID.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Reference line ID.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AnalyticsKpiReferenceLine analyticsWidgetId(String analyticsWidgetId) {
		this.analyticsWidgetId = analyticsWidgetId;
		return this;
	}

	/**
	 * Widget ID the reference line belongs to.
	 * 
	 * @return analyticsWidgetId
	 **/
	@ApiModelProperty(value = "Widget ID the reference line belongs to.")
	public String getAnalyticsWidgetId() {
		return analyticsWidgetId;
	}

	public void setAnalyticsWidgetId(String analyticsWidgetId) {
		this.analyticsWidgetId = analyticsWidgetId;
	}

	public AnalyticsKpiReferenceLine label(String label) {
		this.label = label;
		return this;
	}

	/**
	 * Reference line label.
	 * 
	 * @return label
	 **/
	@ApiModelProperty(value = "Reference line label.")
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public AnalyticsKpiReferenceLine value(Float value) {
		this.value = value;
		return this;
	}

	/**
	 * Reference line value determining the position of the line on the chart.
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "Reference line value determining the position of the line on the chart.")
	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	public AnalyticsKpiReferenceLine color(String color) {
		this.color = color;
		return this;
	}

	/**
	 * Reference line color.
	 * 
	 * @return color
	 **/
	@ApiModelProperty(value = "Reference line color.")
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public AnalyticsKpiReferenceLine displayType(EAnalyticsKpiReferenceLineDisplayType displayType) {
		this.displayType = displayType;
		return this;
	}

	/**
	 * Get displayType
	 * 
	 * @return displayType
	 **/
	@ApiModelProperty(value = "")
	public EAnalyticsKpiReferenceLineDisplayType getDisplayType() {
		return displayType;
	}

	public void setDisplayType(EAnalyticsKpiReferenceLineDisplayType displayType) {
		this.displayType = displayType;
	}

	public AnalyticsKpiReferenceLine translations(Map<String, AnalyticsKpiReferenceLineTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public AnalyticsKpiReferenceLine putTranslationsItem(String key, AnalyticsKpiReferenceLineTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A map of localized versions of the reference line&#39;s label.
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A map of localized versions of the reference line's label.")
	public Map<String, AnalyticsKpiReferenceLineTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, AnalyticsKpiReferenceLineTranslation> translations) {
		this.translations = translations;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AnalyticsKpiReferenceLine analyticsKpiReferenceLine = (AnalyticsKpiReferenceLine) o;
		return Objects.equals(this.$type, analyticsKpiReferenceLine.$type) &&
				Objects.equals(this.id, analyticsKpiReferenceLine.id) &&
				Objects.equals(this.analyticsWidgetId, analyticsKpiReferenceLine.analyticsWidgetId) &&
				Objects.equals(this.label, analyticsKpiReferenceLine.label) &&
				Objects.equals(this.value, analyticsKpiReferenceLine.value) &&
				Objects.equals(this.color, analyticsKpiReferenceLine.color) &&
				Objects.equals(this.displayType, analyticsKpiReferenceLine.displayType) &&
				Objects.equals(this.translations, analyticsKpiReferenceLine.translations);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, analyticsWidgetId, label, value, color, displayType, translations);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AnalyticsKpiReferenceLine {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    analyticsWidgetId: ").append(toIndentedString(analyticsWidgetId)).append("\n");
		sb.append("    label: ").append(toIndentedString(label)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    color: ").append(toIndentedString(color)).append("\n");
		sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
		sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
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
