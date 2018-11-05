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

    @And("^Open app and click into deebot clean page on (.*)$")
    public void open_app_and_click_into_deebot_clean_page_on_android(String platform) throws Throwable {
        mobileStepsDR930.getIntoCleanPage(platform);
    }

    @And("^Test clean module and check result on (.*)$")
    public void test_clean_module_and_check_result_on_android(String platform) throws Throwable {
        mobileStepsDR930.testCleanModule(platform);
    }

    @And("^Test charge module and check result on (.*)$")
    public void test_charge_module_and_check_result_on_android(String platform) throws Throwable {
        mobileStepsDR930.testChargeModule(platform);
    }

    @And("^Test error module and check result on (.*)$")
    public void test_cerror_module_and_check_result_on_android(String platform) throws Throwable {
        mobileStepsDR930.testErrorModule(platform);
    }

    @And("^Test clean power module and check result on (.*)$")
    public void test_clean_power_module_and_check_result_on_android(String platform) throws Throwable {
        mobileStepsDR930.testCleanPower(platform);
    }

    @And("^Test water amount module and check result on (.*)$")
    public void test_water_amount_module_and_check_result_on_android(String platform) throws Throwable {
        mobileStepsDR930.testWaterAmount(platform);
    }

    @And("^Test continue sweep module and check result on (.*)$")
    public void test_continue_sweep_module_and_check_result_on_android(String platform) throws Throwable {
        mobileStepsDR930.testContinueSweep(platform);
    }

    @And("^Test no disturb module and check result on (.*)$")
    public void test_no_disturb_module_and_check_result_on_android(String platform) throws Throwable {
        mobileStepsDR930.testNoDisturb(platform);
    }

    @And("^Test clean schedule module and check result on (.*)$")
    public void test_clean_schedule_module_and_check_result_on_android(String platform) throws Throwable {
        mobileStepsDR930.testCleanSchedule(platform);
    }

    @And("^Test reset map module and check result on (.*)$")
    public void test_reset_map_module_and_check_result_on_android(String platform) throws Throwable {
        mobileStepsDR930.testResetMap(platform);
    }

    @And("^Test clean log module and check result on (.*)$")
    public void test_clean_log_module_and_check_result_on_android(String platform) throws Throwable {
        mobileStepsDR930.testCleanLog(platform);
    }

    @And("^Test consumables module and check result on (.*)$")
    public void test_consumables_module_and_check_result_on_android(String platform) throws Throwable {
        mobileStepsDR930.testAccessories(platform);
    }

    @And("^Test deebot voice module and check result on (.*)$")
    public void test_deebot_voice_module_and_check_result_on_android(String platform) throws Throwable {
        mobileStepsDR930.testDeebotVoice(platform);
    }

    @And("^Test rename module and check result on (.*)$")
    public void test_rename_module_and_check_result_on_android(String platform) throws Throwable {
        mobileStepsDR930.testRename(platform);
    }

    @And("^Test use help module and check result on (.*)$")
    public void test_use_help_module_and_check_result_on_android(String platform) throws Throwable {
        mobileStepsDR930.testUseHelp(platform);
    }

    @And("^Test deebot info module and check result on (.*)$")
    public void test_deebot_info_module_and_check_result_on_android(String platform) throws Throwable {
        mobileStepsDR930.testDeebotInfo(platform);
    }

    @And("^Test look for deebot module on (.*)$")
    public void test_look_for_deebot_module_on_android(String platform) throws Throwable {
        mobileStepsDR930.testLookForDeebot(platform);
    }

}