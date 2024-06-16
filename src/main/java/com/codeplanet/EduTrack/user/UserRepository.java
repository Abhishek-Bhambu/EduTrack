package com.codeplanet.EduTrack.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
   
	  public User findByEmail(String email);
}
