package org.sbjava.weixin_sb.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.sbjava.commons.domain.InMessage;
import org.sbjava.commons.domain.event.EventInMessage;
import org.sbjava.commons.domain.image.ImageInMessage;
import org.sbjava.commons.domain.link.LinkInMessage;
import org.sbjava.commons.domain.location.LocationInMessage;
import org.sbjava.commons.domain.shortvideo.ShortVideoInMessage;
import org.sbjava.commons.domain.text.TextInMessage;
import org.sbjava.commons.domain.video.VideoInMessage;
import org.sbjava.commons.domain.voice.VoiceInMessage;

public class MessageTypeMapper {
	
	private static Map<String, Class<? extends InMessage>> typeMap = new ConcurrentHashMap<>();
	
	//通过一个Map记录了消息类型和类的关系
	static {
		typeMap.put("text",TextInMessage.class);
		typeMap.put("image",ImageInMessage.class);
		typeMap.put("voice",VoiceInMessage.class);
		typeMap.put("video",VideoInMessage.class);
		typeMap.put("shortvideo",ShortVideoInMessage.class);
		typeMap.put("location",LocationInMessage.class);
		typeMap.put("link",LinkInMessage.class);
		typeMap.put("event",EventInMessage.class);
	}
	
	//通过消息类型获取对应的类
	@SuppressWarnings("unchecked")
	public static <T extends InMessage> Class<T> getClass(String type){
		return (Class<T>) typeMap.get(type);
	}
	
}
