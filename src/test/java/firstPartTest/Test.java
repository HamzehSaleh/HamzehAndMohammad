package firstPartTest;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html: target/cucumber.html"}, features = "use_cases" , 
glue= "firstPartTest" , strict = true)


public class Test {

}