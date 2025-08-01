package com.iaguinho162.workshomongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iaguinho162.workshomongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		 User maria = new User("1", "Maria Cunha", "Maria@hotmail.com");
		 User iago = new User("2", "Iago Cunha", "Iago@hotmail.com");
		 List<User> list = new ArrayList<>();
		 list.addAll(Arrays.asList(maria, iago));
		 return ResponseEntity.ok().body(list);
			 
		 
	}
} 
