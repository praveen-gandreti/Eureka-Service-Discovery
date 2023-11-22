package EUREKA.EurekaServerTwoClientTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaServerTwoClientTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerTwoClientTwoApplication.class, args);
	}

}
