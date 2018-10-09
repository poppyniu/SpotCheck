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
    public void doCleanJob(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePage.class);
        //spot check for start auto clean and pause auto clean
        mobilePage.autoCleanBtn.click();
        if (mobilePage.currentStatus.getText().equals("自动清扫")) {
            System.out.println("Start auto clean succeed, test pass");
        } else
            Assert.fail("Start auto clean get error, test fail");
        Thread.sleep(2000);
        mobilePage.pauseBtn.click();
        if (mobilePage.currentStatus.getText().equals("待机")) {
            System.out.println("Pause auto clean succeed, test pass");
        } else
            Assert.fail("Pause auto clean get error, test fail");
        Thread.sleep(2000);
        //spot check for start single room clean and pause single room clean
        mobilePage.singleroomCleanBtn.click();
        if (mobilePage.currentStatus.getText().equals("单间清扫")) {
            System.out.println("Start single room clean succeed, test pass");
        } else
            Assert.fail("Start single room clean get error, test fail");
        Thread.sleep(2000);
        mobilePage.pauseBtn.click();
        if (mobilePage.currentStatus.getText().equals("待机")) {
            System.out.println("Pause single room clean succeed, test pass");
        } else
            Assert.fail("Pause single room clean get error, test fail");
        Thread.sleep(2000);
        //spot check for start border clean and pause border clean
        mobilePage.borderCleanBtn.click();
        if (mobilePage.currentStatus.getText().equals("沿边清扫")) {
            System.out.println("Start border clean succeed, test pass");
        } else
            Assert.fail("Start border clean get error, test fail");
        Thread.sleep(2000);
        mobilePage.pauseBtn.click();
        if (mobilePage.currentStatus.getText().equals("待机")) {
            System.out.println("Pause border clean succeed, test pass");
        } else
            Assert.fail("Pause border clean get error, test fail");
        Thread.sleep(2000);
        //spot check for start fixed clean and pause fixed clean
        mobilePage.fixedCleanBtn.click();
        if (mobilePage.currentStatus.getText().equals("定点清扫")) {
            System.out.println("Start fixed clean succeed, test pass");
        } else
            Assert.fail("Start fixed clean get error, test fail");
        Thread.sleep(2000);
        mobilePage.pauseBtn.click();
        if (mobilePage.currentStatus.getText().equals("待机")) {
            System.out.println("Pause fixed clean succeed, test pass");
        } else
            Assert.fail("Pause fixed clean get error, test fail");
        Thread.sleep(2000);
    }


    @Step
    public void addModifyDeleteSchedule(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePage.class);
        mobilePage.settingsBtn.click();
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.ecovacs.ecosphere:id/appointment_time"), 60, platform);
            System.out.println("Open settings page succeed, test pass");
            Thread.sleep(5000);
        }
        mobilePage.scheduleBtn.click();
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.ecovacs.ecosphere:id/right"), 60, platform);
            System.out.println("Wait add schedule button succeed, test pass");
            Thread.sleep(5000);
        }
        //add schedule
        mobilePage.addScheduleBtn.click();
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.ecovacs.ecosphere:id/repeatText"), 60, platform);
            System.out.println("Open add schedule page succeed, test pass");
            Thread.sleep(5000);
        }
        mobilePage.repeatBtn.click();
        Thread.sleep(3000);
        mobilePage.everySunday.click();
        Thread.sleep(2000);
        mobilePage.repeatPageBackBtn.click();
        Thread.sleep(2000);
        mobilePage.addScheduleSaveBtn.click();
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.ecovacs.ecosphere:id/replytime"), 60, platform);
            System.out.println("Wait new added schedule succeed, test pass");
            Thread.sleep(5000);
        }
        if (mobilePage.newScheduleTimePanel.getText().contains("周日")) {
            System.out.println("Add new clean schedule succeed, test pass");
        } else
            Assert.fail("Add new clean schedule get error, test fail");
        //edit schedule
        mobilePage.newScheduleTimePanel.click();
        Thread.sleep(2000);
        mobilePage.repeatBtn.click();
        Thread.sleep(3000);
        mobilePage.everyMonday.click();
        Thread.sleep(2000);
        mobilePage.repeatPageBackBtn.click();
        Thread.sleep(2000);
        mobilePage.addScheduleSaveBtn.click();
        Thread.sleep(3000);
        if (elementExist(mobilePage.newScheduleTimePanel) && mobilePage.newScheduleTimePanel.getText().contains("周一")) {
            System.out.println("Edit new clean schedule succeed, test pass");
        } else
            Assert.fail("Edit new clean schedule get error, test fail");
        //delete schedule
        mobilePage.newScheduleTimePanel.click();
        Thread.sleep(2000);
        mobilePage.deleteSheduleBtn.click();
        Thread.sleep(2000);
        mobilePage.confirmDeleteBtn.click();
        Thread.sleep(2000);
        if (elementExist(mobilePage.noSchedulePanel) && mobilePage.noSchedulePanel.getText().equals("当前无预约")) {
            System.out.println("Delete clean schedule succeed, test pass");
        } else
            Assert.fail("Delete clean schedule get error, test fail");
        mobilePage.repeatPageBackBtn.click();
    }

    @Step
    public void jobLog(String platform) throws Exception {
        mobilePage.jobLogBtn.click();
        Thread.sleep(2000);
        if (elementExist(mobilePage.jobLogDetail) && mobilePage.jobLogDetail.getText().contains("主机悬空")) {
            System.out.println("Get job log detail info succeed, test pass");
        } else
            Assert.fail("Get job log get error, test fail");
        mobilePage.repeatPageBackBtn.click();
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
        } else if (error.equals("103")) {
            if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("驱动轮异常")) {
                System.out.println("Wheel abnormal error exist, test pass");
            } else
                Assert.fail("Wheel abnormal error does not exist, test fail");
        } else if (error.equals("104")) {
            if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("下视组件异常")) {
                System.out.println("Down sensor abnormal error exist, test pass");
            } else
                Assert.fail("Down sensor abnormal error does not exist, test fail");
        } else if (error.equals("105")) {
            if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("卡住")) {
                System.out.println("Deebot stuck error exist, test pass");
            } else
                Assert.fail("Deebot stuck error does not exist, test fail");
        } else if (error.equals("106")) {
            if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("边刷到期")) {
                System.out.println("Side brush exhausted error exist, test pass");
            } else
                Assert.fail("Side brush exhausted error does not exist, test fail");
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
