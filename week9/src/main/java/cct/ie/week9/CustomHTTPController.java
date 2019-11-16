package cct.ie.week9;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomHTTPController {
	ArrayList<User> person = new ArrayList<>();

	@GetMapping("custom")
	public String httpUnauthorized() {
		int a = 0;
		if (a == 0)

			throw new UnauthorizedException();
		return "Works";
	}

	@GetMapping("login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password) {

		if (email.equals("john") && password.equals("12345")) {
			return "Works";
		} else {
			throw new UnauthorizedException();
		}

	}

	@GetMapping("/getPerson")
	public User getPerson1(@RequestParam String name) {
		User a = new User();

		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).getName().equals(name)) {
				a = person.get(i);
				return a;
			} 
			
		}

		return a;
	}

	@PostMapping("/setPerson")
	public ArrayList<User> setPerson(@RequestBody User person1) {
		person.add(person1);
		return person;

	}

}
