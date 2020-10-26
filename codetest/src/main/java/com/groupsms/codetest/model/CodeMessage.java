package com.groupsms.codetest.model;

public enum CodeMessage {
	
	Success("Success / Record Found"),
	RecordNotFound("Record Not Found"),
	Duplicate("Record Already Exist");

	CodeMessage(String val)
	{
		this.val=val;
	}
	private final String val;
	
	public String value() {
		return val;
	}
}
