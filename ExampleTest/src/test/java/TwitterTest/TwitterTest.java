package TwitterTest;

import Interact.TwitterConfig;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import Interact.TwitterInteractions;


@CucumberOptions(strict = true, monochrome = true, features = "src/test/resources/TwitterTest", glue = "TwitterTest", plugin = {
        "pretty"})

public class TwitterTest extends TwitterConfig {

    private TwitterInteractions twitterInteractions;

    @Override
    public String getName() {
        return "Twitter Test";
    }

    @Given("^i open the app$")
    @Override
    public void setUpPage() {
        driver.launchApp();
    }

    @When("^tap in something$")
    public void tapInSomething() {
        if (twitterInteractions == null) twitterInteractions = new TwitterInteractions(TwitterConfig.driver);
        twitterInteractions.tapInAdd();
    }

    @Then("^something has to change$")
    public void blockUser() {
        if (twitterInteractions == null) twitterInteractions = new TwitterInteractions(TwitterConfig.driver);
        Assert.assertTrue(twitterInteractions.seeAddScreen());
    }

}
