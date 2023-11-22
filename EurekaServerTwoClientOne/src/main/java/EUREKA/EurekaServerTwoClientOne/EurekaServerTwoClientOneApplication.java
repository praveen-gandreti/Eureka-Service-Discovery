package EUREKA.EurekaServerTwoClientOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaServerTwoClientOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerTwoClientOneApplication.class, args);
	}

}
