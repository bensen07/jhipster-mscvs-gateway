package com.benz.tutorial.jhipster.gateway.domain.psql;

import java.io.Serializable;

@SuppressWarnings("serial")
public class State implements Serializable {
	private String name;
	private int population;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}
