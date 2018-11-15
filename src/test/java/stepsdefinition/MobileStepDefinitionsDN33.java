package stepsdefinition;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import serenity.MobileStepsDN33;

/**
 * Created by poppy zhang on 2018/8/13.
 */
public class MobileStepDefinitionsDN33 {
    @Steps
    MobileStepsDN33 mobileStepsDN33 =new MobileStepsDN33();

    @And("^Open app and click into dn33 clean page on (.*)$")
    public void open_app_and_click_into_deebot_clean_page_on_android(String platform) throws Throwable {
        mobileStepsDN33.getIntoCleanPage(platform);
    }

    @And("^Test error module for dn33 and check result on (.*)$")
    public void test_error_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN33.testErrorModule(platform);
    }

    @And("^Test senior mode module for dn33 and check result on (.*)$")
    public void test_senior_mode_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN33.testSeniorModeModule(platform);
    }

    @And("^Test clean power module for dn33 and check result on (.*)$")
    public void test_clean_power_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN33.testCleanPower(platform);
    }

    @And("^Test water amount module for dn33 and check result on (.*)$")
    public void test_water_amount_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN33.testWaterAmount(platform);
    }

    @And("^Test continue sweep module for dn33 and check result on (.*)$")
    public void test_continue_sweep_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN33.testContinueSweep(platform);
    }

    @And("^Test no disturb module for dn33 and check result on (.*)$")
    public void test_no_disturb_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN33.testNoDisturb(platform);
    }

    @And("^Test clean schedule module for dn33 and check result on (.*)$")
    public void test_clean_schedule_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN33.testCleanSchedule(platform);
    }

    @And("^Test reset map module for dn33 and check result on (.*)$")
    public void test_reset_map_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN33.testResetMap(platform);
    }

    @And("^Test clean log module for dn33 and check result on (.*)$")
    public void test_clean_log_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN33.testCleanLog(platform);
    }

    @And("^Test consumables module for dn33 and check result on (.*)$")
    public void test_consumables_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN33.testAccessories(platform);
    }

    @And("^Test deebot voice module for dn33 and check result on (.*)$")
    public void test_deebot_voice_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
         mobileStepsDN33.testDeebotVoice(platform);
    }

    @And("^Test rename module for dn33 and check result on (.*)$")
    public void test_rename_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN33.testRename(platform);
    }

    @And("^Test use help module for dn33 and check result on (.*)$")
    public void test_use_help_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN33.testUseHelp(platform);
    }

    @And("^Test deebot info module for dn33 and check result on (.*)$")
    public void test_deebot_info_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN33.testDeebotInfo(platform);
    }

    @And("^Test look for deebot module for dn33 on (.*)$")
    public void test_look_for_deebot_module_for_dn_on_ios(String platform) throws Throwable {
        mobileStepsDN33.testLookForDeebot(platform);
    }

}