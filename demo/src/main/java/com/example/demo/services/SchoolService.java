package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.pojo.School;
import com.example.demo.repo.SchoolRepo;

@Service
public class SchoolService {
    private final SchoolRepo schoolRepository;

    public SchoolService(SchoolRepo schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    public School createSchool(School school) {
        return schoolRepository.save(school);
    }
}
