package serenity;

import constants.Setup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.LoginPage;
import pages.MobilePageDW700;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by poppy zhang on 2018/8/13.
 */
public class MobileStepsDR930 {
    AppiumDriver appiumDriver = Setup.appiumDriver;
    MobilePageDW700 mobilePage = new MobilePageDW700(appiumDriver);
    LoginPage loginPage = new LoginPage(appiumDriver);


    @Step
    public void getIntoCleanPage(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDW700.class);
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.ecovacs.ecosphere:id/titleContent"), 60, platform);
            Thread.sleep(5000);
        }
        mobilePage.dw700Icon.get(0).click();
        System.out.println("Open deebot main page succeed, test pass");

    }


}
