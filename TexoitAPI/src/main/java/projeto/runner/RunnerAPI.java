package projeto.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/projeto/features"},
        glue = {"projeto.steps"},
  	    monochrome=true,
        plugin = {"pretty", "html:target/report-html.html"},   
        tags = "@teste"
)

public class RunnerAPI {
}
