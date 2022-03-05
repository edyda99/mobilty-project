package com.ULFGII.Mobility.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ULFGII.Mobility.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
