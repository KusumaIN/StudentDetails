package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.School;

public interface SchoolRepo extends JpaRepository<School, Long> {

}
