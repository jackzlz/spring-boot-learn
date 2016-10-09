package com.example.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<User> getUserList() {

		List<User> r = new ArrayList<User>(users.values());

		return r;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String postUser(@ModelAttribute User user) {
		users.put(user.getId(), user);

		return "success";
	}
}
