package com.VoleteClasses.DMS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.VoleteClasses.DMS.Models.Dog;


/**
*Sai Prashanth Volete
*/
public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);
}
