package cogent.infotech.com.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.entity.User;
import cogent.infotech.com.repository.UserRepository;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	

	
	//get list of users
	@GetMapping("user")
	public List<User> getUsers()
	{
		return this.userRepository.findAll();
	}
	
	//add user
	@PostMapping("user")
	public User addUser(@RequestBody User user) {
		
		return this.userRepository.save(user);
	}
	
	//edit user
	@PutMapping("/user")
	public User update(@RequestBody User user) {
		return this.userRepository.save(user);
	}
	
	//delete
	@DeleteMapping("users/id={id}")
    public void delete(@PathVariable Long id) {
       userRepository.deleteById(id);
    }

}
