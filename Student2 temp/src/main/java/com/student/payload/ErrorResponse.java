package com.student.payload;

public class ErrorResponse {
	
	private String msg;
	private Boolean success;
	
	public ErrorResponse(String msg, Boolean success) {
		super();
		this.msg = msg;
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
}
