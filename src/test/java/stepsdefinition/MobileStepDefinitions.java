package stepsdefinition;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import serenity.MobileSteps;

/**
 * Created by poppy zhang on 2018/8/13.
 */
public class MobileStepDefinitions {
    @Steps
    MobileSteps mobileSteps=new MobileSteps();

    @And("^Check (.*) appears on (.*) mobile$")
    public void check_error_appears_on_mobile(String error,String platform) throws Throwable {
        mobileSteps.check_error_on_mobile(error,platform);
    }

    @And("^Open app and click into dw700 page on (.*)$")
    public void open_dw700(String platform) throws Throwable {
        mobileSteps.open_dw700(platform);
    }

}