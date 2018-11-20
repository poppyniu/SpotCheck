package stepsdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import serenity.SetupSteps;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class SetupStepDefinitions {
    @Steps
    SetupSteps setupSteps=new SetupSteps();

    @Given("^Start simulator for deebot (.*)$")
    public void start_simulator_for_deebot_dr(String type) throws Throwable {
        setupSteps.startSimulator(type);
    }

    @Given("^Set up testing environment on (.*) for deebot (.*) on (.*) on (.*)$")
    public void set_up_testing_environment_on_android(String platfrom,String deebotType,String udid,String port) throws Throwable {
        setupSteps.setUp(platfrom,deebotType,udid,port);
    }

    @Then("^Tear down for mobile driver$")
    public void tear_down() throws Throwable {
        setupSteps.tearDown();
    }

    @Then("^Tear down for simulator$")
    public void tear_down_for_simulator() throws Throwable {
        setupSteps.SimulatorTearDown();
    }

}