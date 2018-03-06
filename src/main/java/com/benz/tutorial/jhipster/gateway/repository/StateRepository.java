package com.benz.tutorial.jhipster.gateway.repository;

import org.springframework.data.repository.CrudRepository;

import com.benz.tutorial.jhipster.gateway.service.dto.psql.StateDTO;

public interface StateRepository extends CrudRepository<StateDTO, Integer> {

}
