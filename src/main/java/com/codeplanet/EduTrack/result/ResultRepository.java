package com.codeplanet.EduTrack.result;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends CrudRepository<Result, Integer> {

	  public List<Result> findByEmailEmail(String email );
}
