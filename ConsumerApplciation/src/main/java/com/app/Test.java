package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Test {
public static void main(String[] args) {
	String url="http://localhost:8012/JavaToml/rest/enter/msg";
	Client c =Client.create();
	WebResource wr=c.resource(url);
	ClientResponse cr=wr.get(ClientResponse.class);
	String str=cr.getEntity(String.class);
	System.out.println(str);
}
}
