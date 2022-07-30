package com.sda.zdtestpol103.steps;


import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.sql.SQLOutput;

public class Hooks {

    @Before
    public void beforeScenario (Scenario scenario) {
        System.out.println("THIS IS SCENARIO NAME: " + scenario.getName());
        // This is place to start browser
    }

    @After
    public void afterScenario (Scenario scenario) {
        System.out.println("Is scenario FAILED: " + scenario.isFailed());
        // This is place to kill browser
    }
}
