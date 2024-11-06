package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature",
                    tags = "@smoke",
                    glue = {"Step_Definition","Hook"},
                    plugin = { "pretty","html:Target/cucumber_report/cucumberReport.html"}
)
public class MyRun {
}
