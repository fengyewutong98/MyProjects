package com.sm.returndata;

import java.io.Serializable;

public class ApiResult<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	private boolean success = true;

	private String code = "";

	private String message = "";
	private Integer count;
	private T data;

	public ApiResult() {
	}

	public ApiResult(Boolean success) {
		this.setSuccess(success);
	}

	public ApiResult(T data) {
		this.data = data;
	}

	public ApiResult(ErrorMessage errorMessage) {
		this(errorMessage.getCode(), errorMessage.getMessage(), null);
	}

	public ApiResult(String code, String message) {
		this(code, message, null);
	}

	public ApiResult(String code, String message, T cause) {
		this.success = false;
		this.message = message;
		this.code = code;
		this.data = cause;
	}

	public boolean isSuccess() {
		return this.success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}