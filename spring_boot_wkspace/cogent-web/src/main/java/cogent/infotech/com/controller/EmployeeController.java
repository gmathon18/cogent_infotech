package cogent.infotech.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

	@GetMapping("/employee")
	public String display() {
		
		return "Employee name: Shiva and salary is 1000";
	}
}
