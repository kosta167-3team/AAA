package all.about.apartment.message.persistence;

import java.util.List;

import all.about.apartment.message.domain.MessageDTO;

public interface MessageDAO {
	
	public void sendMessage(MessageDTO vo) throws Exception;
	
	public List<MessageDTO> recieveMessage(String reciever) throws Exception; 
}
