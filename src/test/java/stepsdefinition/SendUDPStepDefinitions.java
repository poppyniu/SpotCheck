package stepsdefinition;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import serenity.SendUDPSteps;

/**
 * Created by poppy zhang on 2018/8/9.
 */
public class SendUDPStepDefinitions {
    @Steps
    SendUDPSteps requestUDPSteps=new SendUDPSteps();

    @And("^Request deebot send (.*) udp message to mobile$")
    public void request_deebot_send_udp_roll_brush_exception_to_mobile(String errorNum ) throws Throwable {
        requestUDPSteps.send_udp_message(errorNum);
    }
}