package com.unblu.webapi.model.v3;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class ExpandableFieldDeserializer extends JsonDeserializer<ExpandableField<?>> {

	@Override
	public ExpandableField<?> deserialize(final JsonParser p, final DeserializationContext ctxt) throws IOException, JsonProcessingException {
		final JsonToken token = p.getCurrentToken();
		if (token == JsonToken.VALUE_STRING) {
			return new ExpandableField<>(p.getValueAsString(), null);
		} else if (token == JsonToken.START_OBJECT) {
			final ObjectCodec codec = p.getCodec();
			final JsonNode node = codec.readTree(p);
			final String id;
			if (node.hasNonNull("id")) {
				id = node.get("id").asText();
			} else {
				id = null;
			}
			final Class<?> typeClass = computeType(p, node);
			final Object object = codec.treeToValue(node, typeClass);
			return new ExpandableField<>(id, object);
		}
		return null;
	}

	private Class<?> computeType(final JsonParser p, final JsonNode node) throws JsonProcessingException {
		if (node.has("$_type")) {
			final String type = node.get("$_type").textValue().toLowerCase();
			switch (type) {
			case "address":
				return Address.class;
			case "avatar":
				return Avatar.class;
			default:
				throw new JsonParseException(p, "Can not deserialize expandable value, unxpected '$_type' value:" + type);
			}
		}
		throw new JsonParseException(p, "Can not deserialize expandable value, missing '$_type' attribute.");
	}
}
