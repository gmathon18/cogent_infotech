package cogent.infotech.annotation;

import org.springframework.stereotype.Component;

@Component("history")
public class HistoryService {

	public void store() {
		
		System.out.println("Storing the history....");
	}
}
