package com.ULFGII.Mobility.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ULFGII.Mobility.Entity.AuthorizedStudent;

public interface AuthorizedStudentRepo extends JpaRepository<AuthorizedStudent, Integer> {

}
