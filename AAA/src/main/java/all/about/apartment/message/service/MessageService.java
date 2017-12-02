package all.about.apartment.message.service;

import java.util.List;

import all.about.apartment.message.domain.MessageDTO;

public interface MessageService {
	
	public void sendMessage(MessageDTO vo)throws Exception;
	
	public List<MessageDTO> recieveMessage(String reciever) throws Exception;
}
