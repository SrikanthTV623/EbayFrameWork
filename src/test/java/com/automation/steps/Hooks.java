package com.automation.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;

public class Hooks {

    @Before
    public void setUp(){
        ConfigReader.initConfig();
        DriverManager.createDriver();
    }
    @After
    public void cleanUp(){
        DriverManager.getDriver().quit();
    }
}
