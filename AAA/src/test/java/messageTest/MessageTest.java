package messageTest;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import all.about.apartment.message.domain.MessageDTO;
import all.about.apartment.message.service.MessageService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class MessageTest {

	@Inject
	MessageService service;
	
	@Test
	public void recieveTest() {
		List<MessageDTO> list;
		try {
			list= service.recieveMessage("dustks123");
			
			for (MessageDTO messageVO : list) {
				System.out.println(messageVO);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}




















