package hellocucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCucumberTest {
    public static void main(String[] args) throws Throwable {
        String[] arguments = {"/Users/severin/IdeaProjects/cucumber/hellocucumber/src/test/resources/hellocucumber/is_it_friday_yet.feature", "--glue hellocucumber"};
        cucumber.api.cli.Main.main(arguments);
    }
}