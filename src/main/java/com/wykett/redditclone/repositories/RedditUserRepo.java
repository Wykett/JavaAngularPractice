package com.wykett.redditclone.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wykett.redditclone.entities.RedditUserEntity;

@Repository
public interface RedditUserRepo extends CrudRepository<RedditUserEntity, Long> {

}
