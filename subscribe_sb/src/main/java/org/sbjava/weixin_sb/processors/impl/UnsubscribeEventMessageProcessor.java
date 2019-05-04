package org.sbjava.weixin_sb.processors.impl;

import org.sbjava.commons.domain.event.EventInMessage;
import org.sbjava.commons.processors.EventMessageProcessor;
import org.springframework.stereotype.Service;

@Service("unsubscribeMessageMessageProcessor")
public class UnsubscribeEventMessageProcessor implements EventMessageProcessor {

	@Override
	public void onMessage(EventInMessage msg) {
		// 把用户的数据删除，或者标记为已经取消关注
		
	}
}
