package stepsdefinition;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import serenity.MobileStepsDR930;

/**
 * Created by poppy zhang on 2018/8/13.
 */
public class MobileStepDefinitionsDR930 {
    @Steps
    MobileStepsDR930 mobileStepsDR930=new MobileStepsDR930();

    @And("^Open app and click into deebot clean page on (.*)")
    public void open_app_and_click_into_deebot_clean_page_on_android(String platform) throws Throwable {
        mobileStepsDR930.getIntoCleanPage(platform);
    }
}