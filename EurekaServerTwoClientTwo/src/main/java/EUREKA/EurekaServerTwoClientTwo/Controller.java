package EUREKA.EurekaServerTwoClientTwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("home")
	public String home()
	{
		return "This is SERVER 2 - CLIENT 2";
	}
}
