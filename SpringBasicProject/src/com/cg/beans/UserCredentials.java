package com.cg.beans;

import java.util.HashMap;

public class UserCredentials {
HashMap<String, String> credentials;

public HashMap<String, String> getCredentials() {
	return credentials;
}

public void setCredentials(HashMap<String, String> credentials) {
	this.credentials = credentials;
}

@Override
public String toString() {
	
	return "UserCredentials [credentials=" + credentials + "]";
}



}
