package com.benz.tutorial.jhipster.gateway.repository;

import org.springframework.data.repository.CrudRepository;

import com.benz.tutorial.jhipster.gateway.service.dto.psql.CityDTO;

public interface CityRepository extends CrudRepository<CityDTO, Integer> {

}
