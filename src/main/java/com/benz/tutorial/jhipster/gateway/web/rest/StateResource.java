package com.benz.tutorial.jhipster.gateway.web.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.benz.tutorial.jhipster.gateway.domain.psql.State;
import com.benz.tutorial.jhipster.gateway.repository.StateRepository;
import com.benz.tutorial.jhipster.gateway.service.dto.psql.StateDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@RestController
@RequestMapping("/api")
public class StateResource {

	private final Logger log = LoggerFactory.getLogger(AccountResource.class);

	@Autowired
	private StateRepository stateRepo;

	@GetMapping(path = "/states")
	public ResponseEntity<List<State>> findAll() throws Exception {
		List<State> states = null;
		List<StateDTO> stateDTOs = (List<StateDTO>) stateRepo.findAll();
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		log.debug("States " + mapper.writeValueAsString(stateDTOs));
		return ResponseEntity.ok().build();
	}

}
