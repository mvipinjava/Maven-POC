package com.app.c;

public class CResp {
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
	builder.append("CRes [status=");
	builder.append(status);
	builder.append(", desc=");
	builder.append(desc);
	builder.append("]");
	return builder.toString();
}

}
