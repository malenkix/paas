package de.malenkix.paas;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PaasService {

	private static final String[] ANSWERS = new String[] { "Ja", "Nein" };
	private static final Random RANDOM = new Random();

	@RequestMapping("/answer")
	public String getAnswer() {
		return ANSWERS[RANDOM.nextInt(ANSWERS.length)];
	}
}
