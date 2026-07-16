package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = BrowserNameDeviceInfoSearchFilter.class, name = "BROWSER_NAME"),
	@JsonSubTypes.Type(value = DeviceTypeDeviceInfoSearchFilter.class, name = "DEVICE_TYPE"),
	@JsonSubTypes.Type(value = OsNameDeviceInfoSearchFilter.class, name = "OS_NAME"),
	@JsonSubTypes.Type(value = OwnerPersonIdDeviceInfoSearchFilter.class, name = "OWNER_PERSON_ID"),
})
public interface DeviceInfoSearchFilter {
	void setField(EDeviceInfoSearchFilterField field);

	EDeviceInfoSearchFilterField getField();

	DeviceInfoSearchFilter field(EDeviceInfoSearchFilterField field);

}
