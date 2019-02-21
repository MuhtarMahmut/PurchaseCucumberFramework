package cybertek.runners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target//json-reports/cucumber1.json"
        },
        features = {"src/test/resources/com.cybertek"},
        glue = "cybertek/step_definitions"
        , dryRun = false
        , tags = "@wip"
)
public class CukesRunner {

	

}
