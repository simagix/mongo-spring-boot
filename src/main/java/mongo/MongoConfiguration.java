// Copyright 2019 Kuei-chun Chen. All rights reserved.
package mongo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoConfiguration {
	private Logger logger = LoggerFactory.getLogger(MongoConfiguration.class);
	@Value("${spring.data.mongodb.uri}")
	private String mongoURI;

	@Bean
	public MongoClient mongoClient() throws Exception {
		logger.debug("mongoURI: " + mongoURI);
		return MongoClients.create(mongoURI);
	}
}