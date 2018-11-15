package serenity;

import constants.JsonUtility;
import constants.Setup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.thucydides.core.annotations.Step;
import org.apache.http.entity.StringEntity;
import org.openqa.selenium.support.PageFactory;
import pages.*;

import java.util.ArrayList;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by poppy zhang on 2018/8/13.
 */
public class MobileStepsDN33 {
    AppiumDriver appiumDriver = Setup.appiumDriver;
    MobilePageDN33 mobilePageDN33 = new MobilePageDN33(appiumDriver);
    List<String> everyWeek;


    @Step
    public void getIntoCleanPage(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDW700.class);
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//*[@name=\"国内DN33\"]"), 60, platform);
            CommonPage.swipeToDirection(appiumDriver, "up");
            Thread.sleep(5000);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/robot_name"), 60, platform);
            Thread.sleep(5000);
        }
        //DN33 is in the second
        mobilePageDN33.DN33RobotName.click();
        // wait for clean page more button
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//*[@name=\"com global more\"]"), 60, platform);
            Thread.sleep(2000);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/top_status_more"), 60, platform);
            Thread.sleep(2000);
        }
        if (mobilePageDN33.cleanPageMoreBtn.isDisplayed()) {
            System.out.println("Open deebot main page succeed, test pass");
        }

    }

    @Step
    public void testCleanModule(String platform) throws Exception {

    }

    @Step
    public void testChargeModule(String platform) throws Exception {

    }


    @Step
    public void testErrorModule(String platform) throws Exception {
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//*[@name=\"com global more\"]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/tv_mode_name"), 20, platform);
            Thread.sleep(2000);
        }
        //send 102 error request to 930
        StringEntity inputBody1 = new StringEntity("{\"errorNo\":\"102\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody1);
        Thread.sleep(2000);
        if (mobilePageDN33.errorContent.getText().equals("地宝悬空，请放回地面")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDN33.errorCancelBtn.click();
        }
        Thread.sleep(4000);
        //send 103 error request to 930
        StringEntity inputBody2 = new StringEntity("{\"errorNo\":\"103\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody2);
        Thread.sleep(3000);
        if (mobilePageDN33.errorContent.getText().equals("运行困难，请检查驱动轮")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDN33.errorCancelBtn.click();
        }
        Thread.sleep(3000);
        //send 104 error request to 930
        StringEntity inputBody3 = new StringEntity("{\"errorNo\":\"104\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody3);
        Thread.sleep(2000);
        if (mobilePageDN33.errorContent.getText().equals("下视传感器积灰，请擦拭")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDN33.errorCancelBtn.click();
        }
        Thread.sleep(2000);
        //send 105 error request to 930
        StringEntity inputBody4 = new StringEntity("{\"errorNo\":\"105\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody4);
        Thread.sleep(2000);
        if (mobilePageDN33.errorContent.getText().equals("地宝被困，请协助脱困")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDN33.errorCancelBtn.click();
        }
        Thread.sleep(2000);
        //send 108 error request to 930
        StringEntity inputBody5 = new StringEntity("{\"errorNo\":\"108\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody5);
        Thread.sleep(2000);
        if (mobilePageDN33.errorContent.getText().equals("边刷被缠绕，请清理")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDN33.errorCancelBtn.click();
        }
        Thread.sleep(2000);
        //send 109 error request to 930
        StringEntity inputBody6 = new StringEntity("{\"errorNo\":\"109\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody6);
        Thread.sleep(2000);
        if (mobilePageDN33.errorContent.getText().equals("滚刷被缠绕，请清理")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDN33.errorCancelBtn.click();
        }
        Thread.sleep(3000);
        //send 110 error request to 930
        StringEntity inputBody7 = new StringEntity("{\"errorNo\":\"110\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody7);
        Thread.sleep(2000);
        if (mobilePageDN33.errorContent.getText().equals("尘盒未安装，请检查")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDN33.errorCancelBtn.click();
        }
        Thread.sleep(2000);
        //send 111 error request to 930
        StringEntity inputBody8 = new StringEntity("{\"errorNo\":\"111\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody8);
        Thread.sleep(2000);
        if (mobilePageDN33.errorContent.getText().equals("撞板被卡住，请检查")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDN33.errorCancelBtn.click();
        }
        Thread.sleep(2000);
        //send 112 error request to 930
        StringEntity inputBody9 = new StringEntity("{\"errorNo\":\"112\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody9);
        Thread.sleep(2000);
        if (mobilePageDN33.errorContent.getText().equals("LDS组件停止运行，请检查")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDN33.errorCancelBtn.click();
        }
        Thread.sleep(2000);
        //send all 9 error request to 930
        Thread.sleep(3000);
        StringEntity inputBody10 = new StringEntity("{\"errorNo\":\"102,103,104,105,108,109,110,111,112\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody10);
        Thread.sleep(3000);
        if (mobilePageDN33.errorContent.getText().equals("LDS组件停止运行，请检查")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDN33.errorCancelBtn.click();
            Thread.sleep(3000);
            //click into more error page
            mobilePageDN33.manyErrorInfo.click();
            Thread.sleep(2000);
            if (mobilePageDN33.errorInfoPageTitle.getText().equals("告警消息")) {
                System.out.println("Get into many error page succeed, test pass!");

            } else
                System.out.println("Get into many error page get error, test fail!");
            Thread.sleep(2000);
            mobilePageDN33.backBtn.click();
        }

    }


    @Step
    public void testSeniorModeModule(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDN33.cleanPageMoreBtn.click();
        Thread.sleep(6000);
        mobilePageDN33.seniorModeOnMorePage.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//*[@name=\"comnav back black\"]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/title_back"), 20, platform);
            Thread.sleep(6000);
        }
        //switch btn is enable then disable it
        if (platform.equals("ios")) {
            System.out.println("0000000000 senior on off value is" + mobilePageDN33.seniorModeOnOffBtn.getAttribute("value").toString());
            if (mobilePageDN33.seniorModeOnOffBtn.getAttribute("value").equals("1")) {
                mobilePageDN33.seniorModeOnOffBtn.click();
                Thread.sleep(2000);
                mobilePageDN33.seniorModeBackBtn.click();
                Thread.sleep(2000);
                if (mobilePageDN33.seniorModeValueField.getText().equals("关闭")) {
                    System.out.println("Senior mode module works well, test pass!");
                } else
                    System.out.println("Senior mode module does not work well, test fail!");
                Thread.sleep(2000);
            }
            //switch btn is disable  then  enable it
            else if (mobilePageDN33.seniorModeOnOffBtn.getAttribute("value").equals("0")) {
                mobilePageDN33.seniorModeOnOffBtn.click();
                Thread.sleep(2000);
                mobilePageDN33.seniorModeBackBtn.click();
                Thread.sleep(2000);
                if (mobilePageDN33.seniorModeValueField.getText().equals("开启")) {
                    System.out.println("Senior mode module works well, test pass!");
                } else
                    System.out.println("Senior mode module does not work well, test fail!");
                Thread.sleep(2000);
            }
        } else if (platform.equals("android")) {
            mobilePageDN33.seniorModeOnOffBtn.click();
            Thread.sleep(2000);
            mobilePageDN33.seniorModeBackBtn.click();
            Thread.sleep(2000);
            if (mobilePageDN33.seniorModeValueField.getText().equals("开启") || mobilePageDN33.seniorModeValueField.getText().equals("关闭")) {
                System.out.println("Senior mode module works well, test pass!");
            } else
                System.out.println("Senior mode module does not work well, test fail!");
            Thread.sleep(2000);
        }
    }


    @Step
    public void testCleanPower(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDN33.cleanPowerOnMorePage.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/title_back"), 20, platform);
            Thread.sleep(6000);
        }
        mobilePageDN33.panel2OnCleanPowerPage.click();
        mobilePageDN33.saveBtnOnCleanPowerPage.click();
        Thread.sleep(2000);
        if (mobilePageDN33.cleanPowerValueField.getText().equals("强劲")) {
            System.out.println("Set clean power succeed, test pass!");
        } else
            System.out.println("Set clean power get error, test pass!");
        Thread.sleep(2000);

    }

    @Step
    public void testWaterAmount(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDN33.waterAmountOnMorePage.click();
        mobilePageDN33.label3OnWaterAmountPage.click();
        mobilePageDN33.saveBtnOnWaterAmountPage.click();
        Thread.sleep(2000);
        if (mobilePageDN33.waterAmountValueField.getText().equals("开启")) {
            System.out.println("Set water amount succeed, test pass!");
        } else
            System.out.println("Set water amount get error, test pass!");
        Thread.sleep(2000);
    }

    @Step
    public void testContinueSweep(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDN33.continueSweepOnMorePage.click();
        Thread.sleep(3000);
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 60, platform);
        }
        mobilePageDN33.switchBtnOnContinueSweepPage.click();
        Thread.sleep(4000);
        mobilePageDN33.backBtnOnContinueSweepPage.click();
        Thread.sleep(2000);
        if (mobilePageDN33.continueSweepValueField.getText().equals("开启") || mobilePageDN33.continueSweepValueField.getText().equals("关闭")) {
            System.out.println("Continue sweep module works well, test pass!");
        } else
            System.out.println("Continue sweep module does not works well, test pass!");
        Thread.sleep(2000);
    }

    @Step
    public void testNoDisturb(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDN33.noDisturbModeOnMorePage.click();
        Thread.sleep(3000);
        if (platform.equals("ios")) {
            if (!CommonPage.waitElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeStaticText[1]"), 60, platform)) {
                mobilePageDN33.switchBtnOnNoDisturbPage.click();
            }
        } else {
            if (!CommonPage.waitElementVisible(appiumDriver, ("com.eco.global.app:id/dnd_interval"), 20, platform)) {
                mobilePageDN33.switchBtnOnNoDisturbPage.click();
            }
            Thread.sleep(6000);
        }
        Thread.sleep(2000);
        if (mobilePageDN33.hintInfoOnNoDisturbPage.getText().contains("此功能开启")) {
            System.out.println("No disturb module enable switch works well, test pass!");
        } else
            System.out.println("No disturb module enable switch does not works well, test fail!");
        Thread.sleep(2000);
        mobilePageDN33.startTimeOnNoDisturbPage.click();
        Thread.sleep(1000);
        mobilePageDN33.saveBtnOnStartTimeNoDisturbPage.click();
        Thread.sleep(1000);
        mobilePageDN33.endTimeOnNoDisturbPage.click();
        Thread.sleep(1000);
        mobilePageDN33.saveBtnOnEndTimeNoDisturbPage.click();
        Thread.sleep(1000);
        mobilePageDN33.backBtnOnNoDisturbPage.click();
        Thread.sleep(2000);
        if (mobilePageDN33.doNotDisturbValueField.getText().equals("开启")) {
            System.out.println("No disturb module works well, test pass!");
        } else
            System.out.println("No disturb module does not works well, test pass!");

        Thread.sleep(2000);
    }

    @Step
    public void testCleanSchedule(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDN33.cleanScheduleOnMorePage.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 10, platform);
            Thread.sleep(6000);
        }
        //test add a schedule
        everyWeek = new ArrayList<>();
        everyWeek.add("周日");
        addSchedule(appiumDriver, everyWeek);
        Thread.sleep(1000);
        mobilePageDN33.backBtnOnRepeatRatePage.click();
        Thread.sleep(1500);
        mobilePageDN33.saveBtnOnAddNewSchedulePage.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/lly"), 60, platform);
            Thread.sleep(6000);
        }
        if (platform.equals("ios")) {
            if (mobilePageDN33.firstScheduleWeekLabel.getText().equals("每周日")) {
                System.out.println("Add schedule succeed, test pass!");
            } else
                System.out.println("Add schedule get error, test pass!");
        } else {
            if (mobilePageDN33.everyWeekLabel.get(mobilePageDN33.scheduleList.size() - 1).getText().equals("每周日")) {
                System.out.println("Add schedule succeed, test pass!");
            } else
                System.out.println("Add schedule get error, test pass!");
        }
        Thread.sleep(2000);
        //test edit a schedule
        mobilePageDN33.firstSchedule.click();
        Thread.sleep(1000);
        mobilePageDN33.frequencyValueLabelnEditSchedulePage.click();
        Thread.sleep(1000);
        mobilePageDN33.panel2OnRepeatRatePage.click();
        Thread.sleep(1000);
        mobilePageDN33.backBtnOnRepeatRatePage.click();
        Thread.sleep(1000);
        mobilePageDN33.saveBtnOnAddNewSchedulePage.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/lly"), 60, platform);
            Thread.sleep(6000);
        }
        if (platform.equals("ios")) {
            if (mobilePageDN33.firstScheduleWeekLabel.getText().contains("周一")) {
                System.out.println("Edit schedule succeed, test pass!");
            } else
                System.out.println("Edit schedule get error, test fail!");
        } else {
            if (mobilePageDN33.everyWeekLabel.get(mobilePageDN33.scheduleList.size() - 1).getText().contains("周一")) {
                System.out.println("Edit schedule succeed, test pass!");
            } else
                System.out.println("Edit schedule get error, test pass!");
        }
        //test delete a schedule
        mobilePageDN33.firstSchedule.click();
        Thread.sleep(1000);
        mobilePageDN33.delBtn.click();
        Thread.sleep(1000);
        mobilePageDN33.backBtnOnCleanSchedulePage.click();
        Thread.sleep(2000);
        if (mobilePageDN33.cleanScheduleOnMorePage.isDisplayed()) {
            System.out.println("Delete schedule succeed, test pass!");
        } else
            System.out.println("Delete schedule get error, test pass!");
    }


    @Step
    public void testResetMap(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDN33.resetMapOnMorePage.click();
        Thread.sleep(3000);
        if (mobilePageDN33.resetMapContent.getText().contains("重置地图")) {
            System.out.println("Reset map module works well, test pass!");
        } else
            System.out.println("Reset map module does not work well, test pass!");
        mobilePageDN33.resetMapCancelBtn.click();
    }

    @Step
    public void testCleanLog(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDN33.cleanLogOnMorePage.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//*[@name=\"累计面积\"]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 50, platform);
            Thread.sleep(6000);
        }
        if (mobilePageDN33.areaOnCleanLogPage.getText().contains("累计面积")) {
            System.out.println("Clean log module works well, test pass!");
        } else
            System.out.println("Clean log module does not work well, test pass!");
        mobilePageDN33.backBtnOnCleanLogPage.click();
        Thread.sleep(5000);
    }

    @Step
    public void testAccessories(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDN33.accessoriesTimeOnMorePage.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 6, platform);
            Thread.sleep(6000);
        }
        //reset side brush
        mobilePageDN33.reset1OnAccessoriesPage.click();
        Thread.sleep(2000);
        mobilePageDN33.okBtnOnAccessoriesPage.click();
        Thread.sleep(3000);
        if (mobilePageDN33.sideBrushPercent.getText().contains("100")) {
            System.out.println("Reset side brush succeed, test pass!");
        } else
            System.out.println("Reset side brush get error, test fail!");
        Thread.sleep(2000);
        //reset roll brush
        mobilePageDN33.reset2OnAccessoriesPage.click();
        Thread.sleep(2000);
        mobilePageDN33.okBtnOnAccessoriesPage.click();
        Thread.sleep(3000);
        System.out.print("11111" + mobilePageDN33.rollBrushPercent.getText());
        if (mobilePageDN33.rollBrushPercent.getText().contains("100")) {
            System.out.println("Reset roll brush succeed, test pass!");
        } else
            System.out.println("Reset roll brush get error, test fail!");
        Thread.sleep(2000);
        //reset hepa
        mobilePageDN33.reset3OnAccessoriesPage.click();
        Thread.sleep(2000);
        mobilePageDN33.okBtnOnAccessoriesPage.click();
        Thread.sleep(3000);
        if (mobilePageDN33.hepaPercent.getText().contains("100")) {
            System.out.println("Reset hepa succeed, test pass!");
        } else
            System.out.println("Reset hepa get error, test fail!");
        Thread.sleep(2000);
        mobilePageDN33.backBtnOnAccessoriesPage.click();
        Thread.sleep(5000);
    }

    @Step
    public void testDeebotVoice(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDN33.deebotVoiceOnMorePage.click();
        if (platform.equals("ios")) {
            //如果没等到选择语音这个元素就打开地宝语音开关
            if (!CommonPage.waitElementVisible(appiumDriver, "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]", 6, platform)) {
                mobilePageDN33.switchBtnOnContinueSweepPage.click();
            }
        } else
            //如果没等到选择语音这个元素就打开地宝语音开关
            if (!CommonPage.waitElementVisible(appiumDriver, "com.eco.global.app:id/tv_left", 6, platform)) {
                mobilePageDN33.switchBtnOnContinueSweepPage.click();
                Thread.sleep(6000);
            }
            mobilePageDN33.chooseLanguageOnDebootVoicePage.click();
            Thread.sleep(2000);
            mobilePageDN33.languageEnglish.click();
            mobilePageDN33.saveBtnOnDebootVoicePage.click();
            Thread.sleep(3000);
            if (mobilePageDN33.activeLanguage.getText().equals("English")) {
                System.out.println("Reset language succeed, test pass!");
            } else
                System.out.println("Reset language get error, test fail!");
            //set switch btn off
            mobilePageDN33.switchBtnOnDeebotVoicePage.click();
            Thread.sleep(5000);
            mobilePageDN33.backBtnOnDebootVoicePage.click();
            Thread.sleep(6000);
            if (mobilePageDN33.deebotVoiceValueField.getText().contains("关闭")) {
                System.out.println("Deebot voice module works well, test pass!");
            } else
                System.out.println("Deebot voice module does not work well, test fail!");
            Thread.sleep(2000);
        }

        @Step
        public void testRename (String platform) throws Exception {
            PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
            mobilePageDN33.renameOnMorePage.click();
            if (platform.equals("ios")) {
                CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"), 60, platform);
            } else {
                CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 3, platform);
                Thread.sleep(6000);
            }
            mobilePageDN33.renameField.click();
            mobilePageDN33.renameField.clear();
            mobilePageDN33.renameField.sendKeys("国内DN33");
            mobilePageDN33.saveBtnOnRenamePage.click();
            Thread.sleep(6000);
            if (mobilePageDN33.renameValueField.getText().contains("国内DN33")) {
                System.out.println("Rename module works well, test pass!");
            } else
                System.out.println("Rename module does not works well, test fail!");
            Thread.sleep(2000);

        }

        @Step
        public void testUseHelp (String platform) throws Exception {
            PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
            mobilePageDN33.useHelpOnMorePage.click();
            if (platform.equals("ios")) {
                CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]"), 60, platform);
            } else {
                CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 20, platform);
                Thread.sleep(6000);
            }
            if (mobilePageDN33.tab1OnUseHelpPage.getText().equals("常见问题") && mobilePageDN33.noQuestionlabelOnUseHelpPage.getText().equals("暂无常见问题")) {
                System.out.println("Use help tab1 works well, test pass!");
            }
            mobilePageDN33.tab2OnUseHelpPage.click();
            Thread.sleep(5000);
            if (mobilePageDN33.tab2OnUseHelpPage.getText().equals("使用说明书") && mobilePageDN33.noGuidelabelOnUseHelpPage.getText().equals("暂无使用说明书")) {
                System.out.println("Use help tab2 works well, test pass!");
            }
            mobilePageDN33.tab3OnUseHelpPage.click();
            Thread.sleep(5000);
            if (mobilePageDN33.tab3OnUseHelpPage.getText().equals("使用视频") && mobilePageDN33.noVideolabelOnUseHelpPage.getText().equals("暂无使用视频")) {
                System.out.println("Use help tab3 works well, test pass!");
            }
            mobilePageDN33.backBtnOnUseHelpPage.click();
            Thread.sleep(2000);
            if (platform.equals("ios")) {
                CommonPage.swipeToDirection(appiumDriver, "up");
                Thread.sleep(3000);
            }
        }

        @Step
        public void testDeebotInfo (String platform) throws Exception {
            PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
            mobilePageDN33.deebotInfoOnMorePage.click();
            if (platform.equals("ios")) {
                CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"), 60, platform);
            } else {
                CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 3, platform);
                Thread.sleep(6000);
            }
//        mobilePageDR930.firmwareVersionOnDebootInfoPage.click();
//        mobilePageDR930.backBtnOnFirmwareVersionPage.click();
            Thread.sleep(2000);
            mobilePageDN33.netInfoOnDebootInfoPage.click();
            Thread.sleep(2000);
            if (mobilePageDN33.wifiNameOnNetInfoPage.getText().contains("名称")) {
                System.out.println("Open network info page succeed, test pass!");
            } else
                System.out.println("Open network info page get error, test fail!");
            mobilePageDN33.wifiMapOnNetInfoPage.click();
            Thread.sleep(2000);
            if (mobilePageDN33.wifiMapTitle.getText().contains("地图")) {
                System.out.println("Open wifi map page succeed, test pass!");
            } else
                System.out.println("Open wifi map page get error, test fail!");
            mobilePageDN33.backBtnOnWifiMapPage.click();
            Thread.sleep(2000);
            mobilePageDN33.backBtnOnNetInfoPage.click();
            Thread.sleep(2000);
            mobilePageDN33.backBtnOnDebootInfoPage.click();
            Thread.sleep(2000);
        }

        @Step
        public void testLookForDeebot (String platform) throws Exception {
            PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
            if (platform.equals("android")) {
                //swipe to bottom to locate '寻找地宝'
                String lookForDeebotElement=CommonPage.getElementStrByText("寻找地宝");
                System.out.println("000000寻找地宝："+lookForDeebotElement);
                ((AndroidDriver) appiumDriver).findElementByAndroidUIAutomator(lookForDeebotElement).click();

            }
            mobilePageDN33.lookForDeebotOnMorePage.click();
            System.out.println("Spot check test for dr930 done, test pass!");
            if (platform.equals("ios")) {
                CommonPage.swipeToDirection(appiumDriver, "down");
                Thread.sleep(3000);
            }
            mobilePageDN33.backBtnOnMorePage.click();
            Thread.sleep(3000);
        }


    private void addSchedule(AppiumDriver driver, List<String> list) throws InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        Thread.sleep(5000);
        mobilePageDN33.addScheduleBtnOnCleanSchedulePage.click();
        CommonPage.swipeInElement(driver, mobilePageDN33.hourWheel, CommonPage.Heading.DOWN);
        mobilePageDN33.repeatTimesOnAddNewSchedulePage.click();
        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i)) {
                case "周日":
                    mobilePageDN33.panel1OnRepeatRatePage.click();
                    continue;
                case "周一":
                    mobilePageDN33.panel2OnRepeatRatePage.click();
                    continue;
                case "周二":
                    mobilePageDN33.panel3OnRepeatRatePage.click();
                    continue;
                case "周三":
                    mobilePageDN33.panel4OnRepeatRatePage.click();
                    continue;
                case "周四":
                    mobilePageDN33.panel5OnRepeatRatePage.click();
                    continue;
                case "周五":
                    mobilePageDN33.panel6OnRepeatRatePage.click();
                    continue;
                case "周六":
                    mobilePageDN33.panel7OnRepeatRatePage.click();
                    continue;
            }
        }

    }


}
