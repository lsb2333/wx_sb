package subscribe_sb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sbjava.commons.service.TokenManager;
import org.sbjava.weixin_sb.SubscribeSbApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {SubscribeSbApplication.class})
public class TokenManagerTests {
	
	@Autowired
	private TokenManager tokenManager;
	
	//创建两个线程来测试
	@Test
	public void test() throws InterruptedException {
		Runnable task = () ->{
			String token = tokenManager.getToken(null);
			System.out.println("获取到的令牌："+token);
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		t1.start();
		t2.start();
		
		//等待两个线程结束
		t1.join();
		t2.join();
	}
}