package com.adiva.dbaccess;

public class Secrets {

    //Output variable
	private String username;
	private String password;
	private String engine;
	private String dbClusterIdentifier;
	private String host;
	private String port;


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

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDbClusterIdentifier() {
		return dbClusterIdentifier;
	}

	public void setDbClusterIdentifier(String dbClusterIdentifier) {
		this.dbClusterIdentifier = dbClusterIdentifier;
	}
	
	
}
