package com.lanying.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mq")
public class MessageController {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@RequestMapping("reciveMessage")
	public void reciveMessage(String message) {
		amqpTemplate.convertAndSend("queueTestKey", message);
	}
}
