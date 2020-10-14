package com.wykett.redditclone.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wykett.redditclone.services.RedditUserService;

@RestController
@RequestMapping(value = "/api/user")
public class RedditUserController {
	
	@Autowired
	public RedditUserService service;

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ResponseEntity<?> getLevelHeroesUserByUsername() {
		service.createUser();
		return ResponseEntity.ok("ok");
	}
}