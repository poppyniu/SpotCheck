package serenity;

import constants.Setup;
import net.thucydides.core.annotations.Step;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class SetupSteps {
    Setup setUp=new Setup();

    @Step
    public void startSimulator(String type) throws Exception {
        setUp.startSimulator(type);
    }

    @Step
    public void setUp(String platform,String deebotType,String udid,String port) throws Exception {
        setUp.setUp(platform,deebotType,udid,port);
    }

    @Step
    public void tearDown( ) throws Exception {
        setUp.tearDown();
    }

    @Step
    public void SimulatorTearDown( ) throws Exception {
        setUp.SimulatorTearDown();
    }

}