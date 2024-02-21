package com.dyd.model;

import java.util.List;

public class HttpResponse<T> {

	/**
	 * 响应请求返回成功
	 */
	public static final String REST_RESPONSE_SUCCESS_CODE = "0";

	/**
	 * 响应请求返回失败
	 */
	public static final String REST_RESPONSE_FIAL_CODE = "-1";

	private String code;

	private String msg;

	private List<T> result;
	
	private T entity;

	/**
	 * 请求消息体
	 */
	private String requestContent;
	
	/**
	 * 响应消息体
	 */
	private String responseContent;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}

	public boolean isResponseSuccess() {
		return REST_RESPONSE_SUCCESS_CODE.equals(code);
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public String getResponseContent() {
		return responseContent;
	}

	public void setResponseContent(String responseContent) {
		this.responseContent = responseContent;
	}

	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HttpResponse{");
        sb.append("code='").append(code).append('\'');
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", result=").append(result);
        sb.append(", entity=").append(entity);
        sb.append('}');
        return sb.toString();
    }
}
