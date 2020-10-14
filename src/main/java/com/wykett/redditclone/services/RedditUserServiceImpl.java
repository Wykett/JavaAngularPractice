package com.wykett.redditclone.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wykett.redditclone.entities.RedditUserEntity;
import com.wykett.redditclone.repositories.RedditUserRepo;

@Service
public class RedditUserServiceImpl implements RedditUserService {
	
	@Autowired
	RedditUserRepo repo;
	
	public void createUser() {
		RedditUserEntity entity = new RedditUserEntity();
		entity.setUserEmail("bruno.chami@gmail.com");
		entity.setUsername("Wykett");
		
		repo.save(entity);
	}
}
