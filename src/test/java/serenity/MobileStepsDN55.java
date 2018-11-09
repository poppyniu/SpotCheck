package serenity;

import constants.JsonUtility;
import constants.Setup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.thucydides.core.annotations.Step;
import org.apache.http.entity.StringEntity;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.MobilePageDN55;

import java.util.HashMap;
import java.util.Map;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by xiaowei zhang on 2018/10/29.
 */
public class MobileStepsDN55 {
    private String deeBot = "DEEBOT OZMO 900 77";

    AppiumDriver appiumDriver = Setup.appiumDriver;
    MobilePageDN55 mobilePage = new MobilePageDN55(appiumDriver);

    @Step
    public void open_dn55(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDN55.class);
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/robot_status"), 60, platform);
            Thread.sleep(5000);
        }
        mobilePage.dn55Icon.get(0).click();
        System.out.println("Open deebot main page succeed, test pass");

    }

    @Step
    public void doCleanJob(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDN55.class);
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/iv_idle_clean"), 60, platform);
        }

        //进入更多页面
        mobilePage.HostMore.click();
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/msg"), 60, platform);
        }
    }

    @Step
    public void cleanPower(String platform) throws Exception {
        if (elementExist(mobilePage.moreDisplayList.get(0)) && mobilePage.moreDisplayList.get(0).getText().contains("标准")) {
            mobilePage.cleanTheSuction.click();
            // 等待主机文字标准出现
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"), 60, platform);
            } else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/tv_left"), 60, platform);
            }
            mobilePage.InCleanPowerList.get(1).click();
            mobilePage.saveBtnInCleanPowerPage.click();
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]"), 60, platform);
            } else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/msg"), 60, platform);
            }
            if (elementExist(mobilePage.moreDisplayList.get(0)) && mobilePage.moreDisplayList.get(0).getText().contains("强劲")) {
                System.out.println("Get clean power info succeed, test pass");
            } else
                Assert.fail("Get clean power get error, test fail");
        }else{
            mobilePage.cleanTheSuction.click();
            // 等待主机文字标准出现
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"), 60, platform);
            } else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/tv_left"), 60, platform);
            }
            mobilePage.InCleanPowerList.get(0).click();
            mobilePage.saveBtnInCleanPowerPage.click();
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]"), 60, platform);
            } else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/msg"), 60, platform);
            }
            if (elementExist(mobilePage.moreDisplayList.get(0)) && mobilePage.moreDisplayList.get(0).getText().contains("标准")) {
                System.out.println("Get clean power info succeed, test pass");
            } else
                Assert.fail("Get clean power get error, test fail");
        }
    }

    @Step
    public void mopTheFloorWater(String platform) throws Exception {
        mobilePage.mopTheFloorWater.click();
        // 等待主机文字标准出现
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/tv_left"), 60, platform);
        }
        mobilePage.TheFloorWaterList.get(2).click();
        mobilePage.saveBtnInMopTheFloorWater.click();
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]"), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/msg"), 60, platform);
        }
        if (elementExist(mobilePage.moreDisplayList.get(1)) && mobilePage.moreDisplayList.get(1).getText().contains("高")) {
            System.out.println("Get mop the floor water info succeed, test pass");
        } else
            Assert.fail("Get mop the floor water get error, test fail");

    }

    @Step
    public void carpetPressurization(String platform) throws Exception {
        if (elementExist(mobilePage.moreDisplayList.get(2)) && mobilePage.moreDisplayList.get(2).getText().contains("关闭")) {
            mobilePage.carpetPressurization.click();
            // 等待主机地毯增压页面出现
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"), 60, platform);
            }else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/toggle_btn"), 60, platform);
            }
            mobilePage.slideBtn.click();
            Thread.sleep(1000);
            mobilePage.backBtnInPowerContinueToSweep.click();
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]"), 60, platform);
            } else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/msg"), 60, platform);
            }
            if (elementExist(mobilePage.moreDisplayList.get(2)) && mobilePage.moreDisplayList.get(2).getText().contains("开启")) {
                System.out.println("Get carpet pressurization info succeed, test pass");
            } else
                Assert.fail("Get carpet pressurization get error, test fail");
        } else {
            mobilePage.carpetPressurization.click();
            // 等待主机地毯增压页面出现
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"), 60, platform);
            }else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/toggle_btn"), 60, platform);
            }
            mobilePage.slideBtn.click();
            Thread.sleep(1000);
            mobilePage.backBtnInPowerContinueToSweep.click();
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]"), 60, platform);
            } else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/msg"), 60, platform);
            }
            if (elementExist(mobilePage.moreDisplayList.get(2)) && mobilePage.moreDisplayList.get(2).getText().contains("关闭")) {
                System.out.println("Get carpet pressurization info succeed, test pass");
            } else
                Assert.fail("Get carpet pressurization get error, test fail");
        }


    }

    @Step
    public void breakpointContinueToSweep(String platform) throws Exception {
        if (elementExist(mobilePage.moreDisplayList.get(3)) && mobilePage.moreDisplayList.get(3).getText().contains("开启")) {

            mobilePage.breakpointContinueToSweep.click();
            // 等待页面出现 breakpointContinueToSweepDisplay
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"), 60, platform);
            }else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/toggle_btn"), 60, platform);
            }
            mobilePage.slideBtn.click();
            Thread.sleep(1000);
            mobilePage.backBtnInPowerContinueToSweep.click();
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]"), 60, platform);
            } else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/msg"), 60, platform);
            }
            if (elementExist(mobilePage.moreDisplayList.get(3)) && mobilePage.moreDisplayList.get(3).getText().contains("关闭")) {
                System.out.println("Get break point continue to sweep info succeed, test pass");
            } else
                Assert.fail("Get break point continue to sweep get error, test fail");

        } else {

            mobilePage.breakpointContinueToSweep.click();
            // 等待页面出现 breakpointContinueToSweepDisplay
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"), 60, platform);
            }else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/toggle_btn"), 60, platform);
            }
            mobilePage.slideBtn.click();
            Thread.sleep(1000);
            mobilePage.backBtnInPowerContinueToSweep.click();
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]"), 60, platform);
            } else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/msg"), 60, platform);
            }
            if (elementExist(mobilePage.moreDisplayList.get(3)) && mobilePage.moreDisplayList.get(3).getText().contains("开启")) {
                System.out.println("Get break point continue to sweep info succeed, test pass");
            } else
                Assert.fail("Get break point continue to sweep get error, test fail");

        }

    }

    @Step
    public void DNDmode(String platform) throws Exception {
        if (elementExist(mobilePage.moreDisplayList.get(4)) && mobilePage.moreDisplayList.get(4).getText().contains("开启")) {
            mobilePage.DNDmode.click();
            // 等待页面出现
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"), 60, platform);
            }else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/dnd_toggle_btn"), 60, platform);
            }
            mobilePage.dndSlipeBtn.click();
            Thread.sleep(1000);
            mobilePage.backBtnInDNDMode.click();
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]"), 60, platform);
            } else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/msg"), 60, platform);
            }
            if (elementExist(mobilePage.moreDisplayList.get(4)) && mobilePage.moreDisplayList.get(4).getText().contains("关闭")) {
                System.out.println("Get DNDmode info succeed, test pass");
            } else
                Assert.fail("Get DNDmode get error, test fail");

        } else {

            mobilePage.DNDmode.click();
            // 等待页面出现
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"), 60, platform);
            }else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/dnd_toggle_btn"), 60, platform);
            }
            mobilePage.dndSlipeBtn.click();
            Thread.sleep(1000);
            mobilePage.backBtnInDNDMode.click();
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]"), 60, platform);
            } else {
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/msg"), 60, platform);
            }
            if (elementExist(mobilePage.moreDisplayList.get(4)) && mobilePage.moreDisplayList.get(4).getText().contains("开启")) {
                System.out.println("Get DNDmode info succeed, test pass");
            } else
                Assert.fail("Get DNDmode get error, test fail");

        }

    }

    @Step
    public void addModifyDeleteSchedule(String platform) throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, 10, SECONDS), MobilePageDN55.class);
        mobilePage.CleanTheAppointment.click();
        // 等待主机清扫预约主页面的预约显示
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]"), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/tv_appoint_empty_hint"), 60, platform);
        }
        //add schedule
        mobilePage.addBtnInCleaningTheAppointment.click();
        // 等待主机新增预约页面预约类型出现
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"), 60, platform);
        }

        mobilePage.addCleaningTheAppointmentGuige4.click();
        Thread.sleep(3000);
        mobilePage.everySunday.click();
        Thread.sleep(2000);
        mobilePage.backBtnInRepetitionFrequency.click();
        Thread.sleep(2000);
        mobilePage.saveBtnInEditCleaningTheAppointment.click();

// 等待主机清扫预约主页面的预约显示
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]"), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/tv_week"), 60, platform);
        }
        if (mobilePage.tv_week.getText().contains("每周日")) {
            System.out.println("Add new clean schedule succeed, test pass");
        } else
            Assert.fail("Add new clean schedule get error, test fail");

        //edit schedule
        mobilePage.tv_appoint_type.click();
        Thread.sleep(2000);
        mobilePage.addCleaningTheAppointmentGuige4.click();
        Thread.sleep(3000);
        mobilePage.everySaturday.click();
        Thread.sleep(2000);
        mobilePage.backBtnInRepetitionFrequency.click();
        Thread.sleep(2000);
        mobilePage.saveBtnInEditCleaningTheAppointment.click();
        Thread.sleep(2000);
        // 等待主机清扫预约主页面的预约显示
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]"), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/tv_week"), 60, platform);
        }
        if (elementExist(mobilePage.tv_week) && mobilePage.tv_week.getText().contains("周末")) {//元素没换
            System.out.println("Edit new clean schedule succeed, test pass");
        } else
            Assert.fail("Edit new clean schedule get error, test fail");

        //delete schedule
        mobilePage.tv_week.click();
        Thread.sleep(2000);
        mobilePage.bjscyyTextView.click();
        // 等待主机清扫预约主页面的预约显示
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]"), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/tv_appoint_empty_hint"), 60, platform);
        }
        if (elementExist(mobilePage.noCleaningTheAppointment) && mobilePage.noCleaningTheAppointment.getText().equals("无清扫预约")) {
            System.out.println("Delete clean schedule succeed, test pass");
        } else
            Assert.fail("Delete clean schedule get error, test fail");
        mobilePage.backBtnInCleaningTheAppointment.click();
    }

    @Step
    public void cleanMap(String platform) throws Exception {

    }

    @Step
    public void jobLog(String platform) throws Exception {
        mobilePage.CleanTheLog.click();
        // 等待主机清扫日志累计时间
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]"), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/tv_cumulative_area_name"), 60, platform);
        }
        if (elementExist(mobilePage.cleanTheLogGuide2) && mobilePage.cleanTheLogGuide2.getText().contains("清扫次数")) {
            System.out.println("Get job log detail info succeed, test pass");
        } else
            Assert.fail("Get job log get error, test fail");
        mobilePage.backBtnInCleanTheLog.click();
    }

    @Step
    public void resetConsumables(String platform) throws Exception {
        mobilePage.ConsumableTiming.click();
        // 等待主机耗材计时页面
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]"), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/tv_side_brush"), 60, platform);
        }
        mobilePage.tv_reset_side_brush.click();
        mobilePage.tv_positive.click();

        if (elementExist(mobilePage.tv_side_brush_percent) && mobilePage.tv_side_brush_percent.getText().contains("100")) {
            System.out.println("Get reset side brush detail info succeed, test pass");
        } else
            Assert.fail("Get reset side brush get error, test fail");

        mobilePage.tv_reset_roll_brush.click();
        mobilePage.tv_positive.click();

        if (elementExist(mobilePage.tv_roll_brush_percent) && mobilePage.tv_roll_brush_percent.getText().contains("100")) {
            System.out.println("Get reset roll brush detail info succeed, test pass");
        } else
            Assert.fail("Get reset roll brush get error, test fail");

        mobilePage.tv_reset_hepa.click();
        mobilePage.tv_positive.click();

        if (elementExist(mobilePage.tv_hepa_percent) && mobilePage.tv_hepa_percent.getText().contains("100")) {
            System.out.println("Get reset hepa detail info succeed, test pass");
        } else
            Assert.fail("Get reset hepa get error, test fail");

        mobilePage.backBtnInConsumableTiming.click();
    }

    @Step
    public void debootVoice(String platform) throws Exception {
        if (elementExist(mobilePage.moreDisplayList.get(9)) && mobilePage.moreDisplayList.get(9).getText().contains("开启")) {
            mobilePage.debootVoice.click();
            // 等待页面出现
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"), 60, platform);
            }else{
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/toggle_btn"), 60, platform);
            }
            mobilePage.slideBtn.click();
            Thread.sleep(3000);
            mobilePage.backBtnInPowerContinueToSweep.click();

            if (elementExist(mobilePage.moreDisplayList.get(9)) && mobilePage.moreDisplayList.get(9).getText().contains("关闭")) {
                System.out.println("Get deboot voice info succeed, test pass");
            } else
                Assert.fail("Get deboot voice get error, test fail");

        } else {

            mobilePage.debootVoice.click();
            // 等待页面出现
            if (platform.equals("ios")) {
                CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"), 60, platform);
            }else{
                CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/toggle_btn"), 60, platform);
            }
            mobilePage.slideBtn.click();
            Thread.sleep(3000);
            mobilePage.backBtnInPowerContinueToSweep.click();

            if (elementExist(mobilePage.moreDisplayList.get(9)) && mobilePage.moreDisplayList.get(9).getText().contains("开启")) {
                System.out.println("Get deboot voice info succeed, test pass");
            } else
                Assert.fail("Get deboot voice get error, test fail");

        }

    }

    @Step
    public void debootRename(String platform) throws Exception {
        mobilePage.rename.click();
        mobilePage.inputInRenamePage.clear();
        mobilePage.inputInRenamePage.sendKeys("国际Dn55");
        mobilePage.saveInRenamePage.click();
        Thread.sleep(2000);
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"), 60, platform);
        }else{
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/msg"), 60, platform);
        }
        if (elementExist(mobilePage.moreDisplayList.get(10)) && mobilePage.moreDisplayList.get(10).getText().contains("国际Dn55")) {
            System.out.println("Get deboot rename info succeed, test pass");
        } else
            Assert.fail("Get deboot rename get error, test fail");

    }

    @Step
    public void usingHelp(String platform) throws Exception {
        mobilePage.usingHelp.click();
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"), 60, platform);
        }else{
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/tv_tab_title"), 60, platform);
        }
        mobilePage.backBtnInDebeetMessage.click();


    }

    @Step
    public void debootMessage(String platform) throws Exception {
        mobilePage.debootMessage.click();
        // 等待 地宝SN号编码出现
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeStaticText[@name='" + deeBot + "']"), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/tv_Right"), 60, platform);
        }

        mobilePage.debeetMessageTitleContentGuide1.get(0).click();
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]"), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/update_status"), 60, platform);
        }
        if (elementExist(mobilePage.FWVersionGuideContent) && mobilePage.FWVersionGuideContent.getText().contains("当前为最新版本1.11.7")) {
            System.out.println("Get FW Version Guide Content info succeed, test pass");
        } else
            Assert.fail("Get FW Version Guide Content get error, test fail");
        mobilePage.backBtnInDebeetMessage.click();
        mobilePage.debeetMessageTitleContentGuide1.get(2).click();
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, ("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]"), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/tv_Right"), 60, platform);
        }
//        if (elementExist(mobilePage.internetMessageTitleContentGuideList2) && mobilePage.internetMessageTitleContentGuideList2.getText().contains("网络信息")) {
//            System.out.println("Get job log detail info succeed, test pass");
//        } else
//            Assert.fail("Get job log get error, test fail");
        if (elementExist(mobilePage.internetMessageTitleContentGuideList1.get(0)) && mobilePage.internetMessageTitleContentGuideList1.get(0).getText().contains("rd4_iot_ww_testpub")) {
            System.out.println("Get job log detail info succeed, test pass");
        } else
            Assert.fail("Get job log get error, test fail");
        if (elementExist(mobilePage.internetMessageTitleContentGuideList1.get(1)) && mobilePage.internetMessageTitleContentGuideList1.get(1).getText().contains("中")) {
            System.out.println("Get job log detail info succeed, test pass");
        } else
            Assert.fail("Get job log get error, test fail");
        if (elementExist(mobilePage.internetMessageTitleContentGuideList1.get(2)) && mobilePage.internetMessageTitleContentGuideList1.get(2).getText().contains("192.168.0.30")) {
            System.out.println("Get job log detail info succeed, test pass");
        } else
            Assert.fail("Get job log get error, test fail");
//        if (elementExist(mobilePage.internetMessageTitleContentGuide4) && mobilePage.internetMessageTitleContentGuide4.getText().contains("中")) {
//            System.out.println("Get job log detail info succeed, test pass");
//        } else
//            Assert.fail("Get job log get error, test fail");
        mobilePage.backBtnInInternetMessage.click();
        mobilePage.backBtnInInternetMessage.click();

    }

    @Step
    public void findDeebot(String platform) throws Exception {
        mobilePage.findDeebot.click();
    }

    @Step
    public void errorPageTranslate(String platform) throws Exception {
        //返回到主机清扫页面
        mobilePage.backBtnInInternetMessage.click();
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/iv_idle_clean"), 60, platform);
        }
        //send 102 error request to DN55 "{\"name\":\""+name+"\",\"age\":\""+age+"\"}"
//        StringEntity inputBody1 = new StringEntity("{\"errno\":\"101\"}");
//        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody1);
//        Thread.sleep(2000);
//        if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("电量低")) {
//            System.out.println("Battery low error exist, test pass");
//        } else
//            Assert.fail("Battery low error does not exist, test fail");
        StringEntity inputBody2 = new StringEntity("{\"errorNo\":\"102\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody2);
        if (platform.equals("ios")) {
            CommonPage.waitMobileElementVisible(appiumDriver, (""), 60, platform);
        } else {
            CommonPage.waitMobileElementVisible(appiumDriver, ("com.eco.global.app:id/tv_content"), 60, platform);
        }
        if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("地宝悬空，请放回地面")) {
            System.out.println("Host hang error exist, test pass");
        } else
            Assert.fail("Host hang error does not exist, test fail");
        StringEntity inputBody3 = new StringEntity("{\"errorNo\":\"103\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody3);
        Thread.sleep(2000);
        if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("运行困难，请检查驱动轮")) {
            System.out.println("Wheel abnormal error exist, test pass");
        } else
            Assert.fail("Wheel abnormal error does not exist, test fail");
        StringEntity inputBody4 = new StringEntity("{\"errorNo\":\"104\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody4);
        Thread.sleep(5000);
        if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("下视传感器积灰，请擦试")) {
            System.out.println("Down sensor abnormal error exist, test pass");
        } else
            Assert.fail("Down sensor abnormal error does not exist, test fail");
        StringEntity inputBody5 = new StringEntity("{\"errorNo\":\"105\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody5);
        Thread.sleep(5000);
        if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("地宝被困，请协助脱困")) {
            System.out.println("Deebot stuck error exist, test pass");
        } else
            Assert.fail("Deebot stuck error does not exist, test fail");
//        StringEntity inputBody6 = new StringEntity("{\"errorNo\":\"106\"}");
//        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody6);
//        Thread.sleep(5000);
//        if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("边刷到期")) {
//            System.out.println("Side brush exhausted error exist, test pass");
//        } else
//            Assert.fail("Side brush exhausted error does not exist, test fail");
//        StringEntity inputBody7 = new StringEntity("{\"errorNo\":\"107\"}");//没
//        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody7);
//        Thread.sleep(5000);
//        if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("尘盒到期")) {
//            System.out.println("Dust case heap exhausted error exist, test pass");
//        } else
//            Assert.fail("Dust case heap exhausted error does not exist, test fail");
        StringEntity inputBody8 = new StringEntity("{\"errorNo\":\"108\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody8);
        Thread.sleep(5000);
        if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("边刷被缠绕，请清理")) {
            System.out.println("Side brush abnormal error exist, test pass");
        } else
            Assert.fail("Side brush abnormal  error does not exist, test fail");
        StringEntity inputBody9 = new StringEntity("{\"errorNo\":\"109\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody9);
        Thread.sleep(5000);
        if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("滚刷被缠绕，请清理")) {
            System.out.println("Roll brush abnormal error exist, test pass");
        } else
            Assert.fail("Roll brush abnormal error does not exist, test fail");
        StringEntity inputBody10 = new StringEntity("{\"errorNo\":\"110\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody10);
        Thread.sleep(5000);
        if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("尘盒未安装，请检查")) {
            System.out.println("No dust box error exist, test pass");
        } else
            Assert.fail("No dust box error does not exist, test fail");
        StringEntity inputBody11 = new StringEntity("{\"errorNo\":\"111\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody11);
        Thread.sleep(5000);
        if (elementExist(mobilePage.errorPanel) && mobilePage.errorPanel.getText().equals("撞板被卡住，请检查")) {
            System.out.println("Bump abnormal error exist, test pass");
        } else
            Assert.fail("Bump abnormalerror does not exist, test fail");
    }

    private boolean elementExist(MobileElement element) throws Exception {
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
