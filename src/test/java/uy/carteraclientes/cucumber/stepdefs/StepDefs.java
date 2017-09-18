package uy.carteraclientes.cucumber.stepdefs;

import uy.carteraclientes.CarteraclientesApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CarteraclientesApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
