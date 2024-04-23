package com.unblu.webapi.jersey.v4.invoker;

import java.io.IOException;
import java.text.DateFormat;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import jakarta.ws.rs.ext.ContextResolver;

public class JSON implements ContextResolver<ObjectMapper> {
	private final ObjectMapper mapper;

	public JSON() {
		mapper = new ObjectMapper();
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		mapper.disable(MapperFeature.AUTO_DETECT_CREATORS);
		mapper.disable(MapperFeature.AUTO_DETECT_FIELDS);
		mapper.disable(MapperFeature.AUTO_DETECT_GETTERS);
		mapper.disable(MapperFeature.AUTO_DETECT_IS_GETTERS);
		mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
		mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
		mapper.setDateFormat(new RFC3339DateFormat());
		mapper.registerModule(new JavaTimeModule());
	}

	/**
	 * Set the date format for JSON (de)serialization with Date properties.
	 *
	 * @param dateFormat Date format
	 */
	public void setDateFormat(final DateFormat dateFormat) {
		mapper.setDateFormat(dateFormat);
	}

	@Override
	public ObjectMapper getContext(final Class<?> type) {
		return mapper;
	}

	/**
	 * Serialize the given Java object into JSON string.
	 *
	 * @param obj Object
	 * @return String representation of the JSON
	 * @throws JsonProcessingException
	 */
	public String serialize(final Object obj) throws JsonProcessingException {
		return mapper.writeValueAsString(obj);
	}

	/**
	 * Deserialize the given JSON string to Java object.
	 *
	 * @param <T> Type
	 * @param body The JSON string
	 * @param returnType The type to deserialize into
	 * @return The deserialized Java object
	 * @throws IOException
	 * @throws JsonMappingException
	 */
	public <T> T deserialize(final String body, final Class<T> returnType) throws JsonMappingException, IOException {
		return mapper.readValue(body, returnType);
	}
}
