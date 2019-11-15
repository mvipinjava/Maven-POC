package com.app;

import java.util.Map;

public class Model {
private int modId;
private String modCode;
private double modCOst;
Map<Integer, Margin> marginObjs;
public Model() {
	super();
}
public int getModId() {
	return modId;
}
public void setModId(int modId) {
	this.modId = modId;
}
public String getModCode() {
	return modCode;
}
public void setModCode(String modCode) {
	this.modCode = modCode;
}
public double getModCOst() {
	return modCOst;
}
public void setModCOst(double modCOst) {
	this.modCOst = modCOst;
}
public Map<Integer, Margin> getMarginObjs() {
	return marginObjs;
}
public void setMarginObjs(Map<Integer, Margin> marginObjs) {
	this.marginObjs = marginObjs;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Model [modId=");
	builder.append(modId);
	builder.append(", modCode=");
	builder.append(modCode);
	builder.append(", modCOst=");
	builder.append(modCOst);
	builder.append(", marginObjs=");
	builder.append(marginObjs);
	builder.append("]");
	return builder.toString();
}

}
