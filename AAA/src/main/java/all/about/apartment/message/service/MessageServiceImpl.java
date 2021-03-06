package all.about.apartment.message.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import all.about.apartment.message.domain.MessageDTO;
import all.about.apartment.message.persistence.MessageDAO;

@Service
public class MessageServiceImpl implements MessageService {

	@Inject
	MessageDAO dao;
	
	//메세지 전송(insert)
	@Override
	public void sendMessage(MessageDTO vo) throws Exception {
		dao.sendMessage(vo);
	}

	@Override
	public List<MessageDTO> recieveMessage(String reciever) throws Exception {
		return dao.recieveMessage(reciever);
	}

}
