
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;personsSetAway&#39; operation
 */
@ApiModel(description = "Request body for the 'personsSetAway' operation")

@JsonPropertyOrder({
	PersonsSetAwayBody.JSON_PROPERTY_AWAY,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PersonsSetAwayBody {
	public static final String JSON_PROPERTY_AWAY = "away";
	@JsonProperty(JSON_PROPERTY_AWAY)
	private Boolean away;

	public PersonsSetAwayBody away(Boolean away) {
		this.away = away;
		return this;
	}

	/**
	 * Boolean Whether to set the person&#39;s online state to AWAY (true) of ONLINE (false)
	 * 
	 * @return away
	 **/
	@ApiModelProperty(value = "Boolean Whether to set the person's online state to AWAY (true) of ONLINE (false)")
	public Boolean isAway() {
		return away;
	}

	public void setAway(Boolean away) {
		this.away = away;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonsSetAwayBody personsSetAwayBody = (PersonsSetAwayBody) o;
		return Objects.equals(this.away, personsSetAwayBody.away);
	}

	@Override
	public int hashCode() {
		return Objects.hash(away);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonsSetAwayBody {\n");
		sb.append("    away: ").append(toIndentedString(away)).append("\n");
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
