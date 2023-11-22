package EUREKA.EurekaServerOneClientTwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("home")
	public String home()
	{
		return "This is SERVER 1 - CLIENT 2";
	}
}
