package com.app.b;

public class BReq {
public String oid;
public String name;
public String getOid() {
	return oid;
}
public void setOid(String oid) {
	this.oid = oid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("BReq [oid=");
	builder.append(oid);
	builder.append(", name=");
	builder.append(name);
	builder.append("]");
	return builder.toString();
}

}
