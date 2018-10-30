package stepsdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.MobileStepsDW700;

/**
 * Created by poppy zhang on 2018/8/13.
 */
public class MobileStepDefinitionsDW700 {
    @Steps
    MobileStepsDW700 mobileSteps=new MobileStepsDW700();

    @When("^Choose (.*) as login country on (.*)$")
    public void choose_america_as_login_country(String country,String platform) throws Throwable {
        mobileSteps.chooseCountry(country,platform);
    }

    @And("^Input ([^\"]*) and ([^\"]*) and click login button$")
    public void input_email_password_and_click_login_button(String email, String password) throws Throwable {
        mobileSteps.global_login(email,password);
    }

    @And("^Check (.*) appears on (.*) mobile$")
    public void check_error_appears_on_mobile(String error,String platform) throws Throwable {
        mobileSteps.check_error_on_mobile(error,platform);
    }

    @And("^Open app and click into dw700 page on (.*)$")
    public void open_dw700(String platform) throws Throwable {
        mobileSteps.open_dw700(platform);
    }

    @And("^Deebot start to do clean job and check result on (.*)$")
    public void deebot_start_to_do_clean_job_and_check_result(String platform) throws Throwable {
        mobileSteps.doCleanJob(platform);
    }
    @And("^Deebot start to do error and check result on (.*)$")
    public void deebot_start_to_do_error_and_check_result(String platform) throws Throwable {
        mobileSteps.errorPageTranslate(platform);
    }
    @And("^Deebot start to add modify delete clean schedule and check result on (.*)$")
    public void deebot_start_to_add_modify_delete_clean_schedule_and_check_result(String platform) throws Throwable {
        mobileSteps.addModifyDeleteSchedule(platform);
    }

    @And("^Deebot start to get work log and check result on (.*)$")
    public void deebot_start_to_get_work_log_and_check_result(String platform) throws Throwable {
        mobileSteps.jobLog(platform);
    }

    @And("^Deebot start to reset consumables and check result on (.*)$")
    public void deebot_start_to_reset_consumables_and_check_result(String platform) throws Throwable {
        mobileSteps.resetConsumables(platform);
    }

}