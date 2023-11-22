package EUREKA.EurekaServerOneClientTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaServerOneClientTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerOneClientTwoApplication.class, args);
	}

}
