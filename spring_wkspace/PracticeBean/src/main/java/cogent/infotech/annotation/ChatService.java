package cogent.infotech.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ChatService {

	private final HistoryService histService;
	private final ChatRoomService chatRoomService;
	
	@Autowired
	public ChatService(HistoryService histService, ChatRoomService chatRoomService) {
	
		this.histService = histService;
		this.chatRoomService = chatRoomService;
	}

	
	public void chat() {
		
		histService.store();
		chatRoomService.start();
	}
}
