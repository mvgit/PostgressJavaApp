package com.adiva.dbaccess;

import java.util.Objects;

public class Secrets {

    //Output variable
	private String username;
	private String password;
	private String engine;
	private String dbClusterIdentifier;
	private String host;
	private String port;
	private String sid;
	private String dbInstanceIdentifier;


	public String getDbInstanceIdentifier() {
		return dbInstanceIdentifier;
	}

	public void setDbInstanceIdentifier(String dbInstanceIdentifier) {
		this.dbInstanceIdentifier = dbInstanceIdentifier;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
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

	@Override
	public String toString() {
		return "Secrets [username=" + username + ", password=" + password + ", engine=" + engine
				+ ", dbClusterIdentifier=" + dbClusterIdentifier + ", host=" + host + ", port=" + port + ", sid=" + sid
				+ ", dbInstanceIdentifier=" + dbInstanceIdentifier + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dbClusterIdentifier, dbInstanceIdentifier, engine, host, password, port, sid, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Secrets other = (Secrets) obj;
		return Objects.equals(dbClusterIdentifier, other.dbClusterIdentifier)
				&& Objects.equals(dbInstanceIdentifier, other.dbInstanceIdentifier)
				&& Objects.equals(engine, other.engine) && Objects.equals(host, other.host)
				&& Objects.equals(password, other.password) && Objects.equals(port, other.port)
				&& Objects.equals(sid, other.sid) && Objects.equals(username, other.username);
	}
	
	
}
