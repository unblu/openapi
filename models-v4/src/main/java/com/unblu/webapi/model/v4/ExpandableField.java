package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonDeserialize(using = ExpandableFieldDeserializer.class)
@JsonSerialize(using = ExpandableFieldSerializer.class)
public class ExpandableField<T> {
	private String id;
	private T expandedObject;

	public ExpandableField(final String id, final T expandedObject) {
		this.id = id;
		this.expandedObject = expandedObject;
	}

	public boolean isExpanded() {
		return expandedObject != null;
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public T getExpanded() {
		return expandedObject;
	}

	public void setExpanded(final T expandedObject) {
		this.expandedObject = expandedObject;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((expandedObject == null) ? 0 : expandedObject.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final ExpandableField<T> other = (ExpandableField<T>) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (expandedObject == null) {
			if (other.expandedObject != null)
				return false;
		} else if (!expandedObject.equals(other.expandedObject)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ExpandableField [id=" + id + ", expandedObject=" + expandedObject + "]";
	}
}