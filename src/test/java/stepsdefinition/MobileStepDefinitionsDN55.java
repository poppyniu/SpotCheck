package stepsdefinition;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import serenity.MobileStepsDN55;

/**
 * Created by poppy zhang on 2018/8/13.
 */
public class MobileStepDefinitionsDN55 {
    @Steps
    MobileStepsDN55 mobileStepsDN55=new MobileStepsDN55();

    @And("^Open app and click into DN55 clean page on (.*)")
    public void open_app_and_click_into_dn55_clean_page_on_android(String platform) throws Throwable {
        mobileStepsDN55.open_dn55(platform);
    }
    @And("^Open app and click into do clean job on (.*)")
    public void open_app_and_click_into_do_clean_job_on_android(String platform) throws Throwable {
        mobileStepsDN55.doCleanJob(platform);
    }
    @And("^Open app and click into do more job on (.*)")
    public void open_app_and_click_into_more_on_android(String platform) throws Throwable {
//        mobileStepsDN55.cleanPower(platform);
//        mobileStepsDN55.mopTheFloorWater(platform);
//        mobileStepsDN55.carpetPressurization(platform);
//        mobileStepsDN55.breakpointContinueToSweep(platform);
//        mobileStepsDN55.DNDmode(platform);
//        mobileStepsDN55.addModifyDeleteSchedule(platform);
//        mobileStepsDN55.cleanMap(platform);
//        mobileStepsDN55.jobLog(platform);
//        mobileStepsDN55.resetConsumables(platform);
        mobileStepsDN55.debootVoice(platform);
        mobileStepsDN55.debootRename(platform);
        mobileStepsDN55.usingHelp(platform);
        mobileStepsDN55.debootMessage(platform);
        mobileStepsDN55.findDeebot(platform);
    }
    @And("^Open app and click into error page translate job on (.*)")
    public void open_app_and_click_into_error_page_translate_on_android(String platform) throws Throwable {
        mobileStepsDN55.errorPageTranslate(platform);
    }
}