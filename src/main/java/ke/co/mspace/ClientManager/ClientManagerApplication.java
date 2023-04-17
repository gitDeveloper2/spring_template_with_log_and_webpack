package ke.co.mspace.ClientManager;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;

@SpringBootApplication
@Slf4j
public class ClientManagerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ClientManagerApplication.class, args);
		log.info("Application started");
	}

}
