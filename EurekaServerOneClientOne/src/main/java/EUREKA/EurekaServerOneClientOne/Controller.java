package EUREKA.EurekaServerOneClientOne;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class Controller {

	@Autowired
	private DiscoveryClient disc;
	
	@GetMapping("/home")
	public RedirectView home()
	{
		
		List<ServiceInstance> instances=disc.getInstances("Server-1-Client-2");
		return new RedirectView(instances.get(0).getUri()+"/home");
	}
}
