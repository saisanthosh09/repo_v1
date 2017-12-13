package demo.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/")
	public String hello() {
		System.out.println("Added new Line");
		return "Hello World";
	}
}
