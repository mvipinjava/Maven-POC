package com.app.b;

public class BResp {
	public String status;
	public String desc;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BResp [status=");
		builder.append(status);
		builder.append(", desc=");
		builder.append(desc);
		builder.append("]");
		return builder.toString();
	}

}
