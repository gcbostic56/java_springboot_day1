package springboot_project_day1.springboot_project_day1;


import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private static final String doggo = "Rooficus Barkus";
	private static final int dogAge = new Random().nextInt(14);
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Cameron") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name), dogAge, doggo);
	}
}
