package com.lanying.websocket;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class SystemWebSocketHandler extends TextWebSocketHandler {
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session)
			throws Exception {
		System.out.println("------  websocket建立连接。 --------");
	}
	
	@Override
	protected void handleTextMessage(final WebSocketSession session,
			TextMessage message) throws Exception {
		System.out.println(message.getPayload());
		
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				try {
					TextMessage mess = new TextMessage(sdf.format(new Date()));
					session.sendMessage(mess);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}, 0, 3000);
	}
	
	@Override
	public void afterConnectionClosed(WebSocketSession session,
			CloseStatus status) throws Exception {
		System.out.println("------  websocket连接关闭。 --------");
	}
}
