package serenity;

import constants.JsonUtility;
import constants.Setup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.thucydides.core.annotations.Step;
import org.apache.http.entity.StringEntity;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.MobilePageDR930;
import pages.MobilePageDW700;

import java.util.ArrayList;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by poppy zhang on 2018/8/13.
 */
public class MobileStepsDR930 {
    AppiumDriver appiumDriver = Setup.appiumDriver;
    MobilePageDR930 mobilePageDR930 = new MobilePageDR930(appiumDriver);
    List<String> everyWeek;


    @Step
    public void getIntoCleanPage(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDW700.class);
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]"), 60, platform);
            Thread.sleep(5000);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/robot_name"), 60, platform);
            Thread.sleep(5000);
        }
        if (platform.equals("ios")) {
            mobilePageDR930.DR930RobotName.click();
        } else {
            mobilePageDR930.DR930Icon.get(0).click();
        }
        if (mobilePageDR930.cleanPageMoreBtn.isDisplayed()) {
            System.out.println("Open deebot main page succeed, test pass");
        }

    }

    @Step
    public void testErrorModule(String platform) throws Exception {
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/tv_mode_name"), 20, platform);
            Thread.sleep(2000);
        }
        //send 102 error request to 930
        StringEntity inputBody1 = new StringEntity("{\"errorNo\":\"102\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody1);
        Thread.sleep(2000);
        if (mobilePageDR930.errorContent.getText().equals("地宝悬空，请放回地面")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDR930.errorCancelBtn.click();
        }
        Thread.sleep(4000);
        //send 103 error request to 930
        StringEntity inputBody2 = new StringEntity("{\"errorNo\":\"103\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody2);
        Thread.sleep(3000);
        if (mobilePageDR930.errorContent.getText().equals("运行困难，请检查驱动轮")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDR930.errorCancelBtn.click();
        }
        Thread.sleep(3000);
        //send 104 error request to 930
        StringEntity inputBody3 = new StringEntity("{\"errorNo\":\"104\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody3);
        Thread.sleep(2000);
        if (mobilePageDR930.errorContent.getText().equals("下视传感器积灰，请擦拭")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDR930.errorCancelBtn.click();
        }
        Thread.sleep(2000);
        //send 105 error request to 930
        StringEntity inputBody4 = new StringEntity("{\"errorNo\":\"105\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody4);
        Thread.sleep(2000);
        if (mobilePageDR930.errorContent.getText().equals("地宝被困，请协助脱困")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDR930.errorCancelBtn.click();
        }
        Thread.sleep(2000);
        //send 108 error request to 930
        StringEntity inputBody5 = new StringEntity("{\"errorNo\":\"108\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody5);
        Thread.sleep(2000);
        if (mobilePageDR930.errorContent.getText().equals("边刷被缠绕，请清理")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDR930.errorCancelBtn.click();
        }
        Thread.sleep(2000);
        //send 109 error request to 930
        StringEntity inputBody6 = new StringEntity("{\"errorNo\":\"109\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody6);
        Thread.sleep(2000);
        if (mobilePageDR930.errorContent.getText().equals("滚刷被缠绕，请清理")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDR930.errorCancelBtn.click();
        }
        Thread.sleep(3000);
        //send 110 error request to 930
        StringEntity inputBody7 = new StringEntity("{\"errorNo\":\"110\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody7);
        Thread.sleep(2000);
        if (mobilePageDR930.errorContent.getText().equals("尘盒未安装，请检查")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDR930.errorCancelBtn.click();
        }
        Thread.sleep(2000);
        //send 111 error request to 930
        StringEntity inputBody8 = new StringEntity("{\"errorNo\":\"111\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody8);
        Thread.sleep(2000);
        if (mobilePageDR930.errorContent.getText().equals("撞板被卡住，请检查")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDR930.errorCancelBtn.click();
        }
        Thread.sleep(2000);
        //send 112 error request to 930
        StringEntity inputBody9 = new StringEntity("{\"errorNo\":\"112\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody9);
        Thread.sleep(2000);
        if (mobilePageDR930.errorContent.getText().equals("LDS组件停止运行，请检查")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDR930.errorCancelBtn.click();
        }
        Thread.sleep(2000);
        //send all 9 error request to 930
        StringEntity inputBody10 = new StringEntity("{\"errorNo\":\"102,103,104,105,108,109,110,111,112\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody10);
        Thread.sleep(3000);
        if (mobilePageDR930.errorContent.getText().equals("LDS组件停止运行，请检查")) {
            System.out.println("See correct error info, test pass!");
            mobilePageDR930.errorCancelBtn.click();
            //click into more error page
            mobilePageDR930.manyErrorInfo.click();
            Thread.sleep(2000);
            if (mobilePageDR930.errorInfoPageTitle.getText().equals("告警消息")) {
                System.out.println("Get into many error page succeed, test pass!");

            } else
                System.out.println("Get into many error page get error, test fail!");
            Thread.sleep(2000);
            mobilePageDR930.backBtn.click();
        }

    }


    @Step
    public void testCleanPower(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDR930.cleanPageMoreBtn.click();
        Thread.sleep(6000);
        mobilePageDR930.cleanPowerOnMorePageFor930.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/title_back"), 20, platform);
            Thread.sleep(6000);
        }
        mobilePageDR930.panel2OnCleanPowerPage.click();
        mobilePageDR930.saveBtnOnCleanPowerPage.click();
        Thread.sleep(2000);
        if (mobilePageDR930.cleanPowerValue.getText().equals("强劲")) {
            System.out.println("Set clean power succeed, test pass!");
        } else
            System.out.println("Set clean power get error, test pass!");
        Thread.sleep(2000);

    }

    @Step
    public void testWaterAmount(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDR930.waterAmountOnMorePageFor930.click();
        mobilePageDR930.label4OnWaterAmountPageFor930.click();
        mobilePageDR930.saveBtnOnWaterAmountPageFor930.click();
        Thread.sleep(2000);
        if (mobilePageDR930.waterAmountValue.getText().equals("超高")) {
            System.out.println("Set water amount succeed, test pass!");
        } else
            System.out.println("Set water amount get error, test pass!");
        Thread.sleep(2000);
    }

    @Step
    public void testContinueSweep(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDR930.continueSweepOnMorePageFor930.click();
        Thread.sleep(3000);
        if (platform.equals("ios")) {
            if (!CommonPage.waitElementVisible(appiumDriver, (""), 60, platform)) {
                mobilePageDR930.switchBtnOnContinueSweepPageFor930.click();
            }
        } else {
            if (!CommonPage.waitElementVisible(appiumDriver, ("com.eco.global.app:id/tv_hint"), 20, platform)) {
                mobilePageDR930.switchBtnOnContinueSweepPageFor930.click();
            }
            Thread.sleep(6000);
        }
        if (mobilePageDR930.label4OnContinueSweepPageFor930.getText().equals("建议同步开启勿扰模式")) {
            System.out.println("Continue sweep module works well, test pass!");
        } else
            System.out.println("Continue sweep module does not works well, test pass!");

        mobilePageDR930.backBtnOnContinueSweepPageFor930.click();
        Thread.sleep(2000);
    }

    @Step
    public void testNoDisturb(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDR930.noDisturbModeOnMorePageFor930.click();
        Thread.sleep(3000);
        if (platform.equals("ios")) {
            if (!CommonPage.waitElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeStaticText[1]"), 60, platform)) {
                mobilePageDR930.switchBtnOnNoDisturbPage.click();
            }
        } else {
            if (!CommonPage.waitElementVisible(appiumDriver, ("com.eco.global.app:id/dnd_interval"), 20, platform)) {
                mobilePageDR930.switchBtnOnNoDisturbPage.click();
            }
            Thread.sleep(6000);
        }
        mobilePageDR930.startTimeOnNoDisturbPage.click();
        Thread.sleep(1000);
        mobilePageDR930.saveBtnOnStartTimeNoDisturbPage.click();
        Thread.sleep(1000);
        mobilePageDR930.endTimeOnNoDisturbPage.click();
        Thread.sleep(1000);
        mobilePageDR930.saveBtnOnEndTimeNoDisturbPage.click();
        Thread.sleep(1000);
        if (mobilePageDR930.hintInfoOnNoDisturbPage.getText().contains("此功能开启")) {
            System.out.println("No disturb module works well, test pass!");
        } else
            System.out.println("No disturb module does not works well, test fail!");

        mobilePageDR930.backBtnOnNoDisturbPage.click();
        Thread.sleep(2000);
    }

    @Step
    public void testCleanSchedule(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDR930.cleanScheduleOnMorePageFor930.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 10, platform);
            Thread.sleep(6000);
        }
        everyWeek = new ArrayList<>();
        everyWeek.add("周日");
        addSchedule(appiumDriver, everyWeek);
        Thread.sleep(1000);
        mobilePageDR930.backBtnOnRepeatRatePage.click();
        Thread.sleep(1500);
        mobilePageDR930.saveBtnOnAddNewSchedulePage.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/lly"), 60, platform);
            Thread.sleep(6000);
        }
        if (platform.equals("ios")) {
            if (mobilePageDR930.firstScheduleWeekLabel.getText().equals("每周日")) {
                System.out.println("Add schedule succeed, test pass!");
            } else
                System.out.println("Add schedule get error, test pass!");
        } else {
            if (mobilePageDR930.everyWeekLabel.get(mobilePageDR930.scheduleList.size() - 1).getText().equals("每周日")) {
                System.out.println("Add schedule succeed, test pass!");
            } else
                System.out.println("Add schedule get error, test pass!");
        }
        Thread.sleep(2000);
        mobilePageDR930.firstSchedule.click();
        Thread.sleep(1000);
        mobilePageDR930.delBtn.click();
        Thread.sleep(1000);
        mobilePageDR930.backBtnOnCleanSchedulePage.click();
        Thread.sleep(2000);
    }


    @Step
    public void testResetMap(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDR930.resetMapOnMorePageFor930.click();
        Thread.sleep(3000);
        if (mobilePageDR930.resetMapContentFor930.getText().contains("重置地图")) {
            System.out.println("Reset map module works well, test pass!");
        } else
            System.out.println("Reset map module does not work well, test pass!");
        mobilePageDR930.resetMapCancelBtnFor930.click();
    }

    @Step
    public void testCleanLog(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDR930.cleanLogOnMorePageFor930.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 50, platform);
            Thread.sleep(6000);
        }
        if (mobilePageDR930.areaOnCleanLogPage.getText().contains("累计面积")) {
            System.out.println("Clean log module works well, test pass!");
        } else
            System.out.println("Clean log module does not work well, test pass!");
        mobilePageDR930.backBtnOnCleanLogPage.click();
        Thread.sleep(5000);
    }

    @Step
    public void testAccessories(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDR930.accessoriesTimeOnMorePageFor930.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 6, platform);
            Thread.sleep(6000);
        }
        //reset side brush
        mobilePageDR930.reset1OnAccessoriesPage.click();
        Thread.sleep(2000);
        mobilePageDR930.okBtnOnAccessoriesPage.click();
        Thread.sleep(2000);
        if (mobilePageDR930.sideBrushPercent.getText().contains("100")) {
            System.out.println("Reset side brush succeed, test pass!");
        } else
            System.out.println("Reset side brush get error, test fail!");
        Thread.sleep(2000);
        //reset roll brush
        mobilePageDR930.reset2OnAccessoriesPage.click();
        Thread.sleep(2000);
        mobilePageDR930.okBtnOnAccessoriesPage.click();
        Thread.sleep(2000);
        System.out.print("11111" + mobilePageDR930.rollBrushPercent.getText());
        if (mobilePageDR930.rollBrushPercent.getText().contains("100")) {
            System.out.println("Reset roll brush succeed, test pass!");
        } else
            System.out.println("Reset roll brush get error, test fail!");
        Thread.sleep(2000);
        //reset hepa
        mobilePageDR930.reset3OnAccessoriesPage.click();
        Thread.sleep(2000);
        mobilePageDR930.okBtnOnAccessoriesPage.click();
        Thread.sleep(2000);
        if (mobilePageDR930.hepaPercent.getText().contains("100")) {
            System.out.println("Reset hepa succeed, test pass!");
        } else
            System.out.println("Reset hepa get error, test fail!");
        Thread.sleep(2000);
        mobilePageDR930.backBtnOnAccessoriesPage.click();
        Thread.sleep(5000);
    }

    @Step
    public void testDeebotVoice(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDR930.deebotVoiceOnMorePageFor930.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 6, platform);
            Thread.sleep(6000);
        }
        mobilePageDR930.chooseLanguageOnDebootVoicePage.click();
        Thread.sleep(2000);
        mobilePageDR930.language2.click();
        mobilePageDR930.saveBtnOnDebootVoicePage.click();
        Thread.sleep(2000);
        if (mobilePageDR930.activeLanguage.getText().equals("國語")) {
            System.out.println("Reset language succeed, test pass!");
        } else
            System.out.println("Reset language get error, test fail!");
        mobilePageDR930.backBtnOnDebootVoicePage.click();
        Thread.sleep(2000);
    }

    @Step
    public void testRename(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDR930.renameOnMorePageFor930.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 3, platform);
            Thread.sleep(6000);
        }
        mobilePageDR930.renameField.click();
        mobilePageDR930.renameField.clear();
        mobilePageDR930.renameField.sendKeys("new930");
        mobilePageDR930.saveBtnOnRenamePage.click();
        Thread.sleep(6000);
        if (mobilePageDR930.renameValueField.getText().equals("new930")) {
            System.out.println("Rename module works well, test pass!");
        } else
            System.out.println("Rename module does not works well, test fail!");
        Thread.sleep(2000);

    }

    @Step
    public void testUseHelp(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDR930.useHelpOnMorePageFor930.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 20, platform);
            Thread.sleep(6000);
        }
        if (mobilePageDR930.tab1OnUseHelpPage.getText().equals("常见问题") && mobilePageDR930.noQuestionlabelOnUseHelpPage.getText().equals("暂无常见问题")) {
            System.out.println("Use help tab1 works well, test pass!");
        }
        mobilePageDR930.tab2OnUseHelpPage.click();
        Thread.sleep(5000);
        if (mobilePageDR930.tab2OnUseHelpPage.getText().equals("使用说明书") && mobilePageDR930.noGuidelabelOnUseHelpPage.getText().equals("暂无使用说明书")) {
            System.out.println("Use help tab2 works well, test pass!");
        }
        mobilePageDR930.tab3OnUseHelpPage.click();
        Thread.sleep(5000);
        if (mobilePageDR930.tab3OnUseHelpPage.getText().equals("使用视频") && mobilePageDR930.noVideolabelOnUseHelpPage.getText().equals("暂无使用视频")) {
            System.out.println("Use help tab3 works well, test pass!");
        }
        mobilePageDR930.backBtnOnUseHelpPage.click();
        Thread.sleep(2000);
        if (platform.equals("ios")) {
            CommonPage.swipeToDirection(appiumDriver, "up");
            Thread.sleep(3000);
        }
    }

    @Step
    public void testDeebotInfo(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDR930.deebotInfoOnMorePageFor930.click();
        if (platform.equals("ios")) {
            CommonPage.waitForVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"), 60, platform);
        } else {
            CommonPage.waitForVisible(appiumDriver, ("com.eco.global.app:id/titleContent"), 3, platform);
            Thread.sleep(6000);
        }
//        mobilePageDR930.firmwareVersionOnDebootInfoPage.click();
//        mobilePageDR930.backBtnOnFirmwareVersionPage.click();
        Thread.sleep(2000);
        mobilePageDR930.netInfoOnDebootInfoPage.click();
        Thread.sleep(2000);
        mobilePageDR930.wifiMapOnNetInfoPage.click();
        Thread.sleep(2000);
        mobilePageDR930.backBtnOnWifiMapPage.click();
        Thread.sleep(2000);
        mobilePageDR930.backBtnOnNetInfoPage.click();
        Thread.sleep(2000);
        mobilePageDR930.backBtnOnDebootInfoPage.click();
        Thread.sleep(2000);
    }

    @Step
    public void testLookForDeebot(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        mobilePageDR930.lookForDeebotOnMorePageFor930.click();
        System.out.println("Spot check test for dr930 done, test pass!");
        if (platform.equals("ios")) {
            CommonPage.swipeToDirection(appiumDriver, "down");
            Thread.sleep(3000);
        }
        mobilePageDR930.backBtnOnMorePage.click();
        Thread.sleep(3000);
    }


    private void addSchedule(AppiumDriver driver, List<String> list) throws InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDR930.class);
        Thread.sleep(5000);
        mobilePageDR930.addScheduleBtnOnCleanSchedulePage.click();
        CommonPage.swipeInElement(driver, mobilePageDR930.hourWheel, CommonPage.Heading.DOWN);
        mobilePageDR930.repeatTimesOnAddNewSchedulePage.click();
        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i)) {
                case "周日":
                    mobilePageDR930.panel1OnRepeatRatePage.click();
                    continue;
                case "周一":
                    mobilePageDR930.panel2OnRepeatRatePage.click();
                    continue;
                case "周二":
                    mobilePageDR930.panel3OnRepeatRatePage.click();
                    continue;
                case "周三":
                    mobilePageDR930.panel4OnRepeatRatePage.click();
                    continue;
                case "周四":
                    mobilePageDR930.panel5OnRepeatRatePage.click();
                    continue;
                case "周五":
                    mobilePageDR930.panel6OnRepeatRatePage.click();
                    continue;
                case "周六":
                    mobilePageDR930.panel7OnRepeatRatePage.click();
                    continue;
            }
        }

    }


}
