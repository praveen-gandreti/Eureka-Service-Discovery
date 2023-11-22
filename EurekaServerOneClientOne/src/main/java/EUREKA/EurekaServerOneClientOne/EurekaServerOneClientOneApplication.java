package EUREKA.EurekaServerOneClientOne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaServerOneClientOneApplication implements CommandLineRunner{

	@Autowired
	private DiscoveryClient disc;
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerOneClientOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<ServiceInstance> instances=disc.getInstances("Server-1-Client-2");
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println(instances);
		System.out.println(instances.get(0).getUri());
		System.out.println(instances.get(1).getUri());
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("********************************");
		
	}

}
