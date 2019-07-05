package org.sbjava.weixin.menu;

import org.sbjava.commons.config.EventListenerConfig;
import org.sbjava.commons.domain.event.EventInMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("org.sbjava")
@ComponentScan("org.sbjava")
public class SelfMenuApplication implements EventListenerConfig {

	public static void main(String[] args) {
		SpringApplication.run(SelfMenuApplication.class, args);
	}

	@Override
	public void handle(EventInMessage msg) {
		// 目前此模块不处理任何消息，所以这里留空即可
	}
}
