package org.sbjava.commons.domain;

public class ResponseMessage {

	/**
	 * 状态为1，表示成功，其他数字都表示失败
	 */
	private int status;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
