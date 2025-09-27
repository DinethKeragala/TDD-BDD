package com.example.Task;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber") // Use Cucumber engine
@SelectClasspathResource("features") // Folder where feature files are
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.example.Task") // Package for step definitions
public class CucumberTestRunner {
}
