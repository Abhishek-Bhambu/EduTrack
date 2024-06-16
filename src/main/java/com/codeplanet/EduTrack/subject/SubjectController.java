package com.codeplanet.EduTrack.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class SubjectController {
	
	 @Autowired
	 private SubjectRepository subjectRepository;
	 
	    //to get all subject
	   @GetMapping("/subject")
	   public List<Subject> getAllSubjects(){
		   return  (List<Subject>)this.subjectRepository.findAll();
	   }
	 
	    //to add a new subject
	   @PostMapping("/subject")
	    public Subject addNewSubject(@RequestBody Subject subject ){
		   return  this.subjectRepository.save(subject);
	    }
	   
	    // to delete a subject
	   @DeleteMapping("/subject/{name}")
	    public String deleteSubject(@PathVariable("name") String name){
		   int row =this.subjectRepository.deleteByName(name);
		    return row + " row get deleted";  
		}

}
