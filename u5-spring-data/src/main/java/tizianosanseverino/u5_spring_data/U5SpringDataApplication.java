package tizianosanseverino.u5_spring_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tizianosanseverino.u5_spring_data.entities.Drink;
import tizianosanseverino.u5_spring_data.entities.abstracts.Element;
import tizianosanseverino.u5_spring_data.entities.service.ElementService;


@SpringBootApplication
public class U5SpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(U5SpringDataApplication.class, args);


	}

}
