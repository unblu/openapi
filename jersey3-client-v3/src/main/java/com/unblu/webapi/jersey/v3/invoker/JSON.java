package com.unblu.webapi.jersey.v3.invoker;

import java.io.IOException;
import java.text.DateFormat;

import jakarta.ws.rs.ext.ContextResolver;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JSON implements ContextResolver<ObjectMapper> {
	private final ObjectMapper mapper;

	public JSON() {
		mapper = createObjectMapper();
	}

	public static ObjectMapper createObjectMapper() {
		final ObjectMapper m = new ObjectMapper();
		m.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		m.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		m.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
		m.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
		m.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		m.disable(MapperFeature.AUTO_DETECT_CREATORS);
		m.disable(MapperFeature.AUTO_DETECT_FIELDS);
		m.disable(MapperFeature.AUTO_DETECT_GETTERS);
		m.disable(MapperFeature.AUTO_DETECT_IS_GETTERS);
		m.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
		m.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
		m.setDateFormat(new RFC3339DateFormat());
		m.registerModule(new JavaTimeModule());
		return m;
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
