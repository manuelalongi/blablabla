package manuel.alongi.bot;

import manuel.alongi.bot.command.Orchestrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class BotApplication implements CommandLineRunner {
	@Autowired
	private Orchestrator orchestrator;

	public static void main(String[] args) {
		SpringApplication.run(BotApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		while(true){
			orchestrator.run();
		}
	}
}
