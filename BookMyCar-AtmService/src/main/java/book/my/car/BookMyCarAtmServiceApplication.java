package book.my.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BookMyCarAtmServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyCarAtmServiceApplication.class, args);
	}

}
