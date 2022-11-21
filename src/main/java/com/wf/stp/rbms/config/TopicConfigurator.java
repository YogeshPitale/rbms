package com.wf.stp.rbms.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@Profile("local")
public class TopicConfigurator {

	@Bean
	public NewTopic createTopic_upo_in() {
		return TopicBuilder.name("upo-in").partitions(2).replicas(1).build();
	}

	@Bean
	public NewTopic createTopic_upo_out() {
		return TopicBuilder.name("upo-out").partitions(2).replicas(1).build();
	}

}
