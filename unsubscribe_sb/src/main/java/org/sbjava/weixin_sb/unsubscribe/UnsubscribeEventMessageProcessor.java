package org.sbjava.weixin_sb.unsubscribe;

import java.util.Date;

import javax.transaction.Transactional;

import org.sbjava.commons.domain.User;
import org.sbjava.commons.domain.event.EventInMessage;
import org.sbjava.commons.processors.EventMessageProcessor;
import org.sbjava.commons.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("unsubscribeMessageProcessor")
public class UnsubscribeEventMessageProcessor implements EventMessageProcessor {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	@Transactional
	public void onMessage(EventInMessage msg) {
		if (!msg.getEvent().equals("unsubscribe")) {
			// 非取消关注事件，不处理
			return;
		}
		
		//由于方法上面有@Transactional注解，调用对象的set方法，会自动更新到数据库
		User user = this.userRepository.findByOpenId(msg.getFromUserName());
		if(user !=null) {
			user.setStatus(User.Status.IS_UNSUBSCRIBE);
			user.setUnsubTime(new Date());
		}
	}
}
