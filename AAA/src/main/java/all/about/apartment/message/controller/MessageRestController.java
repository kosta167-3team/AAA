package all.about.apartment.message.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import all.about.apartment.message.domain.MessageDTO;
import all.about.apartment.message.service.MessageService;
import all.about.apartment.publicDomain.ResidentVO;
import oracle.net.aso.l;
import oracle.net.aso.s;

@RequestMapping("/message")
@RestController

public class MessageRestController{

	@Inject
	MessageService service;
	
	@RequestMapping(value="/send" , method = RequestMethod.POST)
	public ResponseEntity<String> messageSend(@RequestBody MessageDTO vo){
		System.out.println(vo.toString());
		
		ResponseEntity<String> entity = null;
		
		try {
			service.sendMessage(vo);
			entity = new ResponseEntity<String>("success", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			entity= new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return entity;
	}
	
	@RequestMapping(value="/recieve" ,method = RequestMethod.POST)
	public ResponseEntity<List<MessageDTO>> recieveGET(@RequestBody ResidentVO vo){
		System.out.println(vo);
		
		ResponseEntity<List<MessageDTO>> entity = null;
		List<MessageDTO> list= null;
		
		try {
			list = service.recieveMessage(vo.getR_id());
			entity = new ResponseEntity<List<MessageDTO>>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
}















