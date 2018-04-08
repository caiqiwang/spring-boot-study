package com.example.springbootstudy.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.springbootstudy.entity.People;

public interface PeopleRespository extends JpaRepository<People, Long> {
	@Query("from People p where p.name=:name")
	People findPeople(@Param("name") String name);

}
