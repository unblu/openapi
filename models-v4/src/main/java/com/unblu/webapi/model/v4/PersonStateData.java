package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AgentPersonStateData.class, name = "AGENT"),
	@JsonSubTypes.Type(value = VisitorPersonStateData.class, name = "VISITOR"),
})
public interface PersonStateData {
	void setPersonId(String personId);

	String getPersonId();

	PersonStateData personId(String personId);

	void setOnlineState(EOnlineState onlineState);

	EOnlineState getOnlineState();

	PersonStateData onlineState(EOnlineState onlineState);

	void setType(EPersonStateType type);

	EPersonStateType getType();

	PersonStateData type(EPersonStateType type);

}
