package serenity;

import constants.Setup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.MobilePage;

import java.util.HashMap;
import java.util.Map;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by poppy zhang on 2018/8/13.
 */
public class MobileSteps {
    AppiumDriver appiumDriver = Setup.appiumDriver;
    MobilePage mobilePage = new MobilePage(appiumDriver);


    @Step
    public void chooseCountry(String country, String platform) throws Exception {
        //initial area page
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePage.class);
        Thread.sleep(9000);
        if (country != null && appiumDriver != null && platform.equals("android")) {
            if (elementExist(mobilePage.moreCountryIcon)) {
                mobilePage.moreCountryIcon.click();
                String countryStr = "new UiScrollable(new UiSelector().scrollable(true).instance(0))." + "scrollIntoView(new UiSelector().textContains(" + "\"" + country + "\"" + ").instance(0))";
                ((AndroidDriver) appiumDriver).findElementByAndroidUIAutomator(countryStr).click();
            }
        } else {
            //CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[6]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"), 60, platform);
            //loginPage.notAllowNoticeBtn.click();
            Thread.sleep(2000);
            mobilePage.countryInLoginPage.click();
            Thread.sleep(20000);
            boolean countryYouWant = true;
            while (countryYouWant) {
                if (appiumDriver.findElementByXPath("//XCUIElementTypeStaticText[@name='" + country + "']").isDisplayed()) {
                    appiumDriver.findElementByXPath("//XCUIElementTypeStaticText[@name='" + country + "']").click();
                    countryYouWant = false;
                } else {
                    swipeToDirection(appiumDriver, "up");
                }
            }
        }
        mobilePage.saveBtnInAreaPage.click();
    }

    @Step
    public void different_country_login_to_mobile(String name, String password, String country) throws Exception {
        if (country.equals("中国")) {
            mobilePage.chinaPwdLoginBtn.click();
        }
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePage.class);
        if (name != null && password != null) {
            mobilePage.emailAccountTextbox.clear();
            mobilePage.emailAccountTextbox.sendKeys(name);
            mobilePage.passwordTextbox.clear();
            mobilePage.passwordTextbox.sendKeys(password);
            mobilePage.loginButton.click();
        }
    }


    @Step
    public void open_dw700(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePage.class);
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.ecovacs.ecosphere:id/icon"), 60, platform);
            Thread.sleep(5000);
        }
        mobilePage.dw700Icon.click();
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.ecovacs.ecosphere:id/low_electricity"), 60, platform);
            System.out.println("Open deebot main page succeed, test pass");
            Thread.sleep(5000);
        }
    }

    @Step
    public void check_error_on_mobile(String error, String platform) throws Exception {
        Thread.sleep(5000);
        checkErrorExist(error, platform);
    }

    public void checkErrorExist(String error, String platform) throws Exception {
        if (error.equals("101")) {
            if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("电量低")) {
                System.out.println("Battery low error exist, test pass");
            } else
                Assert.fail("Battery low error does not exist, test fail");
        } else if (error.equals("102")) {
            if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("主机悬空")) {
                System.out.println("Host hang error exist, test pass");
            } else
                Assert.fail("Host hang error does not exist, test fail");
        }
        else if (error.equals("103")) {
            if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("驱动轮异常")) {
                System.out.println("Wheel abnormal error exist, test pass");
            } else
                Assert.fail("Wheel abnormal error does not exist, test fail");
        }
    }


    private boolean elementExist(MobileElement element)
            throws Exception {
        boolean elementExist = element.isDisplayed();
        if (elementExist == true) {
            junit.framework.Assert.assertTrue(true);
            return elementExist;
        }
        junit.framework.Assert.assertFalse("Mobile element does not exist!", false);
        return elementExist;
    }

    private static void swipeToDirection(AppiumDriver driver, String direction) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<>();
        params.put("direction", direction);
        js.executeScript("mobile: swipe", params);

    }

}
