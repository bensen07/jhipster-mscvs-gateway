package com.benz.tutorial.jhipster.gateway.cucumber.stepdefs;

import com.benz.tutorial.jhipster.gateway.JhipstermscvsgatewayApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipstermscvsgatewayApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
