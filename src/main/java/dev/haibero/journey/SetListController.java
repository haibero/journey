package dev.haibero.journey;
import java.util.concurrent.atomic.AtomicLong;

import dev.haibero.journey.restservice.SetList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SetListController {

	private final AtomicLong counter = new AtomicLong();

	public static void main(String[] args) {
		SpringApplication.run(SetListController.class, args);
	}

	@GetMapping("/ping")
	public String pong(@RequestParam(value = "pong", defaultValue = "PONG") String pong) {
		return String.format("PING: %s!" ,pong);
	}

	@GetMapping("/setlist")
	public SetList setList(@RequestParam(value = "pong", defaultValue = "PONG") String pong) {
		return new SetList(counter.incrementAndGet(), "DEFAULT");
	}

}
