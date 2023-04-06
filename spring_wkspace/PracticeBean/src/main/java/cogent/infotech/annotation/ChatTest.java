package cogent.infotech.annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("cogent.infotech.annotation")
public class ChatTest {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.refresh();
		ChatService chatR = ctx.getBean(ChatService.class);
		
		chatR.chat();
		ctx.close();
	}

}
