package com.unblu.webapi.model.v4;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class ExpandableFieldSerializer extends JsonSerializer<ExpandableField<?>> {

	@Override
	public void serialize(final ExpandableField<?> value, final JsonGenerator gen, final SerializerProvider serializers) throws IOException {
		if (value == null) {
			gen.writeNull();
		} else if (value.isExpanded()) {
			gen.writeObject(value.getExpanded());
		} else {
			gen.writeString(value.getId());
		}
	}
}
