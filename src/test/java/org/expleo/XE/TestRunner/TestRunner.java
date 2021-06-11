package org.expleo.XE.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/test/java/org/expleo/XE/Features", glue="Oog/expleo/XE/stepDefinations",  monochrome = true)
public class TestRunner {

}
