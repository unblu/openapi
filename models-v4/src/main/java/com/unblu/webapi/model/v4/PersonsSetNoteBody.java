
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;personsSetNote&#39; operation
 */
@ApiModel(description = "Request body for the 'personsSetNote' operation")

@JsonPropertyOrder({
	PersonsSetNoteBody.JSON_PROPERTY_NOTE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PersonsSetNoteBody {
	public static final String JSON_PROPERTY_NOTE = "note";
	@JsonProperty(JSON_PROPERTY_NOTE)
	private String note;

	public PersonsSetNoteBody note(String note) {
		this.note = note;
		return this;
	}

	/**
	 * The value of the note set on the person
	 * 
	 * @return note
	 **/
	@ApiModelProperty(value = "The value of the note set on the person")
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonsSetNoteBody personsSetNoteBody = (PersonsSetNoteBody) o;
		return Objects.equals(this.note, personsSetNoteBody.note);
	}

	@Override
	public int hashCode() {
		return Objects.hash(note);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonsSetNoteBody {\n");
		sb.append("    note: ").append(toIndentedString(note)).append("\n");
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
