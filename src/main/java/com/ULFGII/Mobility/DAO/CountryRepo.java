package com.ULFGII.Mobility.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ULFGII.Mobility.Entity.Country;

public interface CountryRepo extends JpaRepository<Country, Integer> {

}
