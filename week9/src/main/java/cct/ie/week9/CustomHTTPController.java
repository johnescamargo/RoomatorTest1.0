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
	public User login(@RequestParam("email") String email, @RequestParam("password") String password) {
		User user = new User();
		
		for (int i = 0; i < person.size(); i++) {

			if (email.equals(person.get(i).getEmail()) && password.equals(person.get(i).getPassword())) {
				user = person.get(i);
			} 
		}
		return user;

	}

	@GetMapping("/getPerson")
	public User getPerson1(@RequestParam String email) {
		User a = new User();

		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).getEmail().equals(email)) {
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
