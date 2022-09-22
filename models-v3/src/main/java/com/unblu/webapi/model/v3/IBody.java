package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "$_type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = ArrayBody.class, name = "ArrayBody"),
	@JsonSubTypes.Type(value = BodyElement.class, name = "BodyElement"),
})
public interface IBody {
}
