package com.adiva.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adiva.dbaccess.Secrets;

public class TestSecreatsManager {
	 private static final Logger logger 
     = LoggerFactory.getLogger(TestSecreatsManager.class);
	public static void main(String[] args) {
		SecretsManager sm = new SecretsManager();
		sm.setRegion("us-west-2");
		sm.setSecretName("pgdbsecret");
		Secrets s = sm.getSecret();
		logger.info(s.toString());
		
	}

}
