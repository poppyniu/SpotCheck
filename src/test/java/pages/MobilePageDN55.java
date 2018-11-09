package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by poppy zhang on 2018/9/13.
 */
public class MobilePageDN55 {
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/robot_name")
    public List<MobileElement> dn55Icon;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_content")//com.ecovacs.ecosphere:id/warm_tip
    public MobileElement errorPanel;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]")
    @AndroidFindBy(id = "com.ecovacs.ecosphere:id/title_back")
    public MobileElement repeatPageBackBtn;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]")
    @AndroidFindBy(id = "com.ecovacs.ecosphere:id/replytime")
    public MobileElement newScheduleTimePanel;

    //  一键清扫   com.eco.global.app:id/tv_mode_name
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_mode_name")
    public MobileElement tv_mode_name;

    //  路径规划，清扫全屋   com.eco.global.app:id/tv_mode_intro
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_mode_intro")
    public MobileElement tv_mode_intro;

    //  清扫建图注意事项  com.eco.global.app:id/build_tips
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/build_tips")
    public MobileElement build_tips;

    //  自动清扫按钮   com.eco.global.app:id/iv_idle_clean
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/iv_idle_clean")
    public MobileElement iv_idle_clean;

    //  清扫状态  com.eco.global.app:id/deebot_statues
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/deebot_statues")
    public MobileElement deebot_statues;

    //  回充按钮   com.eco.global.app:id/iv_idle_gocharge
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/iv_idle_gocharge")
    public MobileElement iv_idle_gocharge;

    // 主机更多
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/top_status_more")
    public MobileElement HostMore;

    // 更多页面 List
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title")
    public List<MobileElement> moreList;

    // 更多页面 开关 List
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/msg")
    public List<MobileElement> moreDisplayList;

    // 清扫吸力
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[@index='0']")
    public MobileElement cleanTheSuction;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[@index='2']")
    public MobileElement cleanTheSuctionDisplay;

    // 拖地水量
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView[@index='0']")
    public MobileElement mopTheFloorWater;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView[@index='2']")
    public MobileElement mopTheFloorWaterDisplay;

    // 地毯增压
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView[@index='0']")
    public MobileElement carpetPressurization;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView[@index='2']")
    public MobileElement carpetPressurizationDisplay;

    // 断点续扫
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView[@index='0']")
    public MobileElement breakpointContinueToSweep;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView[@index='2']")
    public MobileElement breakpointContinueToSweepDisplay;

    // 勿扰模式
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.TextView[@index='0']")
    public MobileElement DNDmode;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView[@index='2']")
    public MobileElement DNDmodeDisplay;

    // 清扫预约
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[6]/android.widget.TextView[@index='0']")
    public MobileElement CleanTheAppointment;

    // 重置地图
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.TextView[@index='0']")
    public MobileElement ResetTheMap;

    // 清扫日志
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.TextView[@index='0']")
    public MobileElement CleanTheLog;

    // 耗材计时
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[9]/android.widget.TextView[@index='0']")
    public MobileElement ConsumableTiming;

    // 地宝语音
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[10]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[10]/android.widget.TextView[@index='0']")
    public MobileElement debootVoice;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[10]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[10]/android.widget.TextView[@index='2']")
    public MobileElement debootVoiceDisplay;

    // 重命名
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[11]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[11]/android.widget.TextView[@index='0']")
    public MobileElement rename;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@frame='{{15, 362}, {52, 21}}']")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[11]/android.widget.TextView[@index='0']")
    public MobileElement renameDisplay;

    // 使用帮助
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[12]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[12]/android.widget.TextView[@index='0']")
    public MobileElement usingHelp;

    // 地宝信息
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[13]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[13]/android.widget.TextView[@index='0']")
    public MobileElement debootMessage;

    // 寻找地宝
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[14]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[14]/android.widget.TextView[@index='0']")
    public MobileElement findDeebot;

    //清扫吸力界面
    //清扫吸力标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleInCleanPower;

    //清扫吸力类型 (list)
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_left")
    public List<MobileElement> InCleanPowerList;

    //标准 (bounds)
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement standardInCleanPowerPage;

    //强劲 (bounds)
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement strongInCleanPowerPage;

    //取消
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnInCleanPowerPage;

    //保存
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/right")
    public MobileElement saveBtnInCleanPowerPage;

    // 拖地水量
    // 导航栏标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement mopTheFloorWatertitleContent;

    //取消
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnInMopTheFloorWater;

    //保存
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/right")
    public MobileElement saveBtnInMopTheFloorWater;

    //拖地水量类型 (list)
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_left")
    public List<MobileElement> TheFloorWaterList;

    // 低
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement dTextView;

    // 中
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement zTextView;

    // 高
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement gTextView;

    // 如何启动拖地模式 > com.eco.global.app:id/wateryield_guide
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/wateryield_guide")
    public MobileElement wateryield_guide;

    //  第一步： com.eco.global.app:id/tv_page_title
    //  取出水箱，装水 com.eco.global.app:id/tv_page_contents
    //
    // 超高
    // 超高水量说明

    // 地毯增压
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/f_title")
    public MobileElement dtzyTextView;

    // 开启后，在清扫模式下，地宝识别到地毯时将自动开启强劲吸力
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/robot_carpet_func_tips")
    public MobileElement kqhqsmsTextView;

    // 1.请在非地毯区域启动清扫com.eco.global.app:id/robot_carpet_func_limit
    //2.使用吸口清扫时不支持地毯增压com.eco.global.app:id/robot_carpet_press_limit
    // 3.滚刷缠绕毛发时可能在非地毯界面误启动强吸力模式，请及时清理滚刷com.eco.global.app:id/robot_carpet_twine_limit
    @AndroidFindBy(id = "com.eco.global.app:id/robot_carpet_press_limit")
    public MobileElement syxkqsTextView;

    // 按钮
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/toggle_btn")
    public MobileElement slideBtn;

    //断电续扫页面
    // 导航栏标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement powerContinueToSweep;

    // 断电续扫 com.eco.global.app:id/tv
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement powerContinueToSweep1;

    // 开启后，地宝在电量充足时，会继续执行未完成的清扫工作com.eco.global.app:id/break_point_tips
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/break_point_tips")
    public MobileElement powerContinueToSweepguide1;

    // 主界面右上角显示该图标，表示此功能开启
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/break_point_guide")
    public MobileElement powerContinueToSweepguide2;

    // 建议同步开启勿扰模式
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_hint")
    public MobileElement powerContinueToSweepguide13;

    // 返回
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnInPowerContinueToSweep;

//勿扰模式

    // 导航栏标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement DNDModeTitleContent;

    // 勿扰模式 111111
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv")
    public MobileElement DNDModeTitleContent1;

    // 开启后，勿扰时间段内，不主动执行预约清扫和断点续扫，并关闭地宝语音和灯光 com.eco.global.app:id/dnd_description
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/dnd_description")
    public MobileElement DNDModeTitleContentGuide1;

    // 勿扰时间段 com.eco.global.app:id/dnd_interval
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/dnd_interval")
    public MobileElement DNDModeTitleContentGuide2;

    //开启时间 com.eco.global.app:id/disturb_start_time
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/disturb_start_time")
    public MobileElement DNDModeTitleContentGuide3;

    //结束时间 com.eco.global.app:id/disturb_end_time
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/disturb_end_time")
    public MobileElement DNDModeTitleContentGuide4;

    // 【勿扰icon】主界面右上角显示该图标，表示此功能开启 com.eco.global.app:id/tv_home_hint
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_home_hint")
    public MobileElement DNDModeTitleContentGuide5;

    // 返回 com.eco.global.app:id/title_back
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnInDNDMode;

    //滑动按钮
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/dnd_toggle_btn")
    public MobileElement dndSlipeBtn;
    // 清扫预约
    // 导航栏标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement cleaningTheAppointmentTitleContent;

    // 无清扫预约
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_empty_hint")
    public MobileElement noCleaningTheAppointment;

    // 添加按钮
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/right")
    public MobileElement addBtnInCleaningTheAppointment;

    // 返回按钮
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnInCleaningTheAppointment;

    // 自动清扫
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_type")
    public MobileElement cleaningTheAppointmentGuide1;

    // 僅一次
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@bounds='[42,307][1038,552]']/android.widget.RelativeLayout[@index='1']/android.widget.TextView[@index='0']")
    public MobileElement cleaningTheAppointmentGuide2;

    // 每天
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@bounds='[42,552][1038,797]']/android.widget.RelativeLayout[@index='1']/android.widget.TextView[@index='0']")
    public MobileElement cleaningTheAppointmentGuide3;

    // 工作天
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@bounds='[42,797][1038,1042]']/android.widget.RelativeLayout[@index='1']/android.widget.TextView[@index='0']")
    public MobileElement cleaningTheAppointmentGuide4;

    // 每個週末
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@bounds='[42,1042][1038,1287]']/android.widget.RelativeLayout[@index='1']/android.widget.TextView[@index='0']")
    public MobileElement cleaningTheAppointmentGuide5;


//    // 删除预约com.eco.global.app:id/tv_appoint_delete
//    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_delete")
//    public MobileElement qsscyyTextView;
//    // 频率选项（通用）

    // 新增预约
    // 导航栏标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement addCleaningTheAppointment;

    // 保存按钮
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/right")
    public MobileElement saveBtnInAddCleaningTheAppointment;

    // 取消按钮
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement cancelBtnInAddCleaningTheAppointment;

    // 预约类型
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_type")
    public MobileElement addCleaningTheAppointmentGuige1;

    // 自动清扫
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appointtype_value")
    public MobileElement addCleaningTheAppointmentGuige2;

    // 时间设置
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_time_setting")
    public MobileElement addCleaningTheAppointmentGuige3;

    // 重复频率
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_repeat_hint")
    public MobileElement addCleaningTheAppointmentGuige4;

    // 重复频率类型
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_repeat")
    public MobileElement addCleaningTheAppointmentGuige5;

    // 编辑预约
    // 导航栏标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement editCleaningTheAppointment;

    // 保存按钮
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/right")
    public MobileElement saveBtnInEditCleaningTheAppointment;

    // 取消按钮
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement cancelBtnInEditCleaningTheAppointment;

    // 清扫预约第一条中的清扫类型   com.eco.global.app:id/tv_appoint_type
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_type")
    public MobileElement tv_appoint_type;
    // 清扫预约第一条中的清扫频率类型   com.eco.global.app:id/tv_week
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_week")
    public MobileElement tv_week;

    // 预约类型
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_type")
    public MobileElement EditCleaningTheAppointmentGuige1;

    // 自动清扫
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appointtype_value")
    public MobileElement EditCleaningTheAppointmentGuige2;

    // 时间设置
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_time_setting")
    public MobileElement EditCleaningTheAppointmentGuige3;

    // 重复频率
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_repeat_hint")
    public MobileElement EditCleaningTheAppointmentGuige4;

    // 重复频率类型
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_repeat")
    public MobileElement EditCleaningTheAppointmentGuige5;

    // 删除预约
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/btn_appoint_delete")
    public MobileElement EditCleaningTheAppointmentGuige6;

    //重复频率
    // 导航栏标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement repetitionFrequency;

    //每周日
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement everySunday;

    //每周一
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]")
    public MobileElement everyMonday;

    //每周二
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.TextView[1]")
    public MobileElement everyTuesday;

    //每周三
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[4]/android.widget.TextView[1]")
    public MobileElement everyWednesday;

    //每周四
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[5]/android.widget.TextView[1]")
    public MobileElement everyThursday;

    //每周五
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[6]/android.widget.TextView[1]")
    public MobileElement everyFriday;

    //每周六
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[7]/android.widget.TextView[1]")
    public MobileElement everySaturday;

    // 返回按钮
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnInRepetitionFrequency;

    // 编辑预约
    // 导航栏标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_type")
    public MobileElement bjyyTextView;

    // 预约类型
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_type")
    public MobileElement bjyylxTextView;

    // 时间设置
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_time_setting")
    public MobileElement bjsjszTextView;

    // 重复频率
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_appoint_repeat_hint")
    public MobileElement bjcfplTextView;

    // 删除预约
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/btn_appoint_delete")
    public MobileElement bjscyyTextView;

    // 取消 com.eco.global.app:id/btn_appoint_delete


    // 清扫日志
    // 无清扫日志
    // 导航栏标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement cleanTheLogTitleContent;

    // 累计面积
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_cumulative_area_name")
    public MobileElement cleanTheLogGuide1;

    // 清扫次数
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_cumulative_times_name")
    public MobileElement cleanTheLogGuide2;

    // 累计时长
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_cumulative_duration_name")
    public MobileElement cleanTheLogGuide3;

    // 返回
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnInCleanTheLog;


    // 单次开始清扫的时间年月日
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_log_date")
    public MobileElement YTD;

    // 单次开始清扫的时间时分秒
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_log_time")
    public MobileElement HMS;

    // 自动清扫
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_log_info")
    public MobileElement Autoclean;

    // 区域清扫
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_log_info")
    public MobileElement Areaceaning;

    // 时间显示
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_cumulative_times_name")
    public MobileElement timedisplay;

    // 清扫详情
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement Cleaningthedetails;

    // 清扫面积
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_areaname")
    public MobileElement sweepoutpattern;

    // 清扫时长
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_timename")
    public MobileElement Thecleaningtime;

    // 分享
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/btn_share")
    public MobileElement btn_share;


    // 耗材计时
    // 导航栏标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement ConsumableTimingTitleContent;

    // 边刷
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_side_brush")
    public MobileElement tv_side_brush;

    // 滚刷
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_roll_brush")
    public MobileElement tv_roll_brush;

    // 滤芯
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_hepa")
    public MobileElement tv_hepa;

    // 预计剩余时间x小时 边刷com.eco.global.app:id/tv_side_brush_desc 滚刷com.eco.global.app:id/tv_roll_brush_desc 滤芯com.eco.global.app:id/tv_hepa_desc
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_side_brush_desc")
    public MobileElement tv_side_brush_desc;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_roll_brush_desc")
    public MobileElement tv_roll_brush_desc;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_hepa_desc")
    public MobileElement tv_hepa_desc;

    // 复位 边刷com.eco.global.app:id/tv_reset_side_brush 滚刷com.eco.global.app:id/tv_reset_roll_brush 滤芯com.eco.global.app:id/tv_reset_hepa
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_reset_side_brush")
    public MobileElement tv_reset_side_brush;

    // 边刷百分比
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_side_brush_percent")
    public MobileElement tv_side_brush_percent;

    // 滚刷
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_reset_roll_brush")
    public MobileElement tv_reset_roll_brush;

    // 滚刷百分比
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_roll_brush_percent")
    public MobileElement tv_roll_brush_percent;

    // 滤芯
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_reset_hepa")
    public MobileElement tv_reset_hepa;

    // 滤芯百分比
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_hepa_percent")
    public MobileElement tv_hepa_percent;

    //复位 弹框 取消
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_cancel")
    public MobileElement tv_cancel;

    //复位 弹框 确认
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_positive")
    public MobileElement tv_positive;

    //确认已更换边刷？
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_content")
    public MobileElement tv_content;

    // 返回
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnInConsumableTiming;


    // 地宝语音
    // 导航栏标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement toTreasureTheVoiceTitleContent;


    // 返回按钮
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement title_back;

    // 地宝语音
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/fun_name")
    public MobileElement fun_name;

    // 选择语音
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_left")
    public MobileElement tv_left;

    // 选择语音
    //导航栏标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement selectTheVoice;

    // 保存按钮
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/right")
    public MobileElement saveBtnInSelectTheVoice;

    // 取消按钮
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnInSelectTheVoice;

    //重命名
    //标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleInRenamePage;

    //最多输入32位字符
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_rename_hint")
    public MobileElement maxInputInRenamePage;

    //输入框
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/cet_rename_edit")
    public MobileElement inputInRenamePage;

    //保存
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/right")
    public MobileElement saveInRenamePage;

    //取消
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnInRenamePage;
    // 使用帮助
    // 导航栏标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement titleContent;

    // 意见反馈
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/right")
    public MobileElement right;

    // 常见问题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_tab_title")
    public MobileElement FAQ;

    // 使用说明书
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_tab_title")
    public MobileElement operationInstruction;

    // 使用视频
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_tab_title")
    public MobileElement useOfVideo;

    // 暂无常见问题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_no_faq")
    public MobileElement noFAQ;

    // 下载完整版说明书
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/progress_button")
    public MobileElement progressButton;

    // 查看完整版说明书
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/progress_button")
    public MobileElement progressButton2;

    // 地宝信息
    // 导航栏
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement debeetMessageTitleContent;

    // 固件版本
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_left")
    public List<MobileElement> FWVersionGuide;

    //com.eco.global.app:id/update_status 当前为最新版本1.11.7
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/update_status")
    public MobileElement FWVersionGuideContent;
    // 固件版本
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_left")
    public List<MobileElement> debeetMessageTitleContentGuide1;

    // SN号
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement debeetMessageTitleContentGuide2;

    // 网络信息
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement debeetMessageTitleContentGuide3;

    // 返回
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnInDebeetMessage;

    // 网络信息
    // 导航栏
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/titleContent")
    public MobileElement internetMessageTitleContent;

    // Wi-Fi名称
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public List<MobileElement> internetMessageTitleContentGuideList;

    // rd4_iot_ww_testpub
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_Right")
    public List<MobileElement> internetMessageTitleContentGuideList1;

    //Wi-Fi强度
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public MobileElement internetMessageTitleContentGuideList2;

    // 中
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public List<MobileElement> internetMessageTitleContentGuideList21;

    //IP地址
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public List<MobileElement> internetMessageTitleContentGuideList3;

    // 192.168.0.30
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_Right")
    public List<MobileElement> internetMessageTitleContentGuideList31;

    //    Wi-Fi地图
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(xpath = "com.eco.global.app:id/tv_left")
    public List<MobileElement> internetMessageTitleContentGuideList4;

    // 返回
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/title_back")
    public MobileElement backBtnInInternetMessage;

    //固件版本
    //标题
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
    @AndroidFindBy(id = "com.ecovacs.ecosphere.intl:id/action_bar_title_content")
    public MobileElement titleInFWVersionPage;

    //检测中,请稍后
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.ecovacs.ecosphere.intl:id/tv_checking")
    public MobileElement waitInFWVersionPage;

    //产品系列号
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "com.ecovacs.ecosphere.intl:id/serial_num_text")
    public MobileElement snInFWVersionPage;

    //当前版本 当前为最新版本1.9.7
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.ecovacs.ecosphere.intl:id/new_version_text")
    public MobileElement currentVersionInFWVersionPage;

    //返回
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.ecovacs.ecosphere.intl:id/back")
    public MobileElement backBtnInFWVersionPage;

    public MobilePageDN55(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


}
