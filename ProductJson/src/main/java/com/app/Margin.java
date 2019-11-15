package com.app;

public class Margin {
private int mrgId;
private String mrgCode;
public Margin() {
	super();
}
public int getMrgId() {
	return mrgId;
}
public void setMrgId(int mrgId) {
	this.mrgId = mrgId;
}
public String getMrgCode() {
	return mrgCode;
}
public void setMrgCode(String mrgCode) {
	this.mrgCode = mrgCode;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Margin [mrgId=");
	builder.append(mrgId);
	builder.append(", mrgCode=");
	builder.append(mrgCode);
	builder.append("]");
	return builder.toString();
}

}
