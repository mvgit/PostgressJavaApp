package com.adiva.dbaccess;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import com.adiva.utility.SecretsManager;

public class Secrets {

	public Secrets() {
		super();
		initialize();
	}
	
	private void initialize() {
		String json = SecretsManager.getSecret();
		StringReader reader = new StringReader(json);
		JsonReader jsonReader = Json.createReader(reader);
		JsonObject newJsonObject = jsonReader.readObject();
		this.password = newJsonObject.getString("password");
		this.host = newJsonObject.getString("host");
		this.username = newJsonObject.getString("username");
		this.port = newJsonObject.getString("port");
	}
	
    //Output variable
	private String username;
	private String password;
	private String url;
	private String host;
	private String port;
	private SecretsManager sm;
	
	public SecretsManager getSm() {
		return sm;
	}

	public void setSm(SecretsManager sm) {
		this.sm = sm;
	}
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
