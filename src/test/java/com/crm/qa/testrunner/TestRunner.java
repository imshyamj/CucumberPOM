package com.crm.qa.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Selenium_WorkSpace\\CucumberPOM\\src\\test\\java\\com\\crm\\qa\\featues\\FreeCRM.feature"},//the path of the feature files
		glue={"com.crm.qa.stepDefinitions"},//the path of the step definition files
		plugin= {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step definition file
		)

public class TestRunner {

}
