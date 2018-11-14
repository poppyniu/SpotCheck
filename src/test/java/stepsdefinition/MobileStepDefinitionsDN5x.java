package stepsdefinition;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import serenity.MobileStepsDN5x;

/**
 * Created by poppy zhang on 2018/8/13.
 */
public class MobileStepDefinitionsDN5x {
    @Steps
    MobileStepsDN5x mobileStepsDN5x=new MobileStepsDN5x();


    @And("^Open app and click into dn5x clean page on (.*)$")
    public void open_app_and_click_into_deebot_clean_page_on_android(String platform) throws Throwable {
        mobileStepsDN5x.getIntoCleanPage(platform);
    }

    @And("^Test error module for dn5x and check result on (.*)$")
    public void test_error_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN5x.testErrorModule(platform);
    }

    @And("^Test senior mode module for dn5x and check result on (.*)$")
    public void test_senior_mode_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN5x.testSeniorModeModule(platform);
    }

    @And("^Test clean power module for dn5x and check result on (.*)$")
    public void test_clean_power_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN5x.testCleanPower(platform);
    }

    @And("^Test water amount module for dn5x and check result on (.*)$")
    public void test_water_amount_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN5x.testWaterAmount(platform);
    }

    @And("^Test carpet Pressurization module for dn5x and check result on (.*)$")
    public void carpet_Pressurization_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN5x.carpetPressurization(platform);
    }

    @And("^Test continue sweep module for dn5x and check result on (.*)$")
    public void test_continue_sweep_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN5x.testContinueSweep(platform);
    }

    @And("^Test no disturb module for dn5x and check result on (.*)$")
    public void test_no_disturb_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN5x.testNoDisturb(platform);
    }

    @And("^Test clean schedule module for dn5x and check result on (.*)$")
    public void test_clean_schedule_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN5x.testCleanSchedule(platform);
    }

    @And("^Test reset map module for dn5x and check result on (.*)$")
    public void test_reset_map_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN5x.testResetMap(platform);
    }

    @And("^Test clean log module for dn5x and check result on (.*)$")
    public void test_clean_log_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN5x.testCleanLog(platform);
    }

    @And("^Test consumables module for dn5x and check result on (.*)$")
    public void test_consumables_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN5x.testAccessories(platform);
    }

    @And("^Test deebot voice module for dn5x and check result on (.*)$")
    public void test_deebot_voice_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
         mobileStepsDN5x.testDeebotVoice(platform);
    }

    @And("^Test rename module for dn5x and check result on (.*)$")
    public void test_rename_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN5x.testRename(platform);
    }

    @And("^Test use help module for dn5x and check result on (.*)$")
    public void test_use_help_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN5x.testUseHelp(platform);
    }

    @And("^Test deebot info module for dn5x and check result on (.*)$")
    public void test_deebot_info_module_for_dn_and_check_result_on_ios(String platform) throws Throwable {
        mobileStepsDN5x.testDeebotInfo(platform);
    }

    @And("^Test look for deebot module for dn5x on (.*)$")
    public void test_look_for_deebot_module_for_dn_on_ios(String platform) throws Throwable {
        mobileStepsDN5x.testLookForDeebot(platform);
    }

}