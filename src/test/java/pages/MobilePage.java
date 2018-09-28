package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by poppy zhang on 2018/9/13.
 */
public class MobilePage {
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_country_arrow")
    public MobileElement moreCountryIcon;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/tv_country")
    public MobileElement countryInLoginPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeButton[3]")
    @AndroidFindBy(id = "com.eco.global.app:id/btn_change_login")
    public MobileElement chinaPwdLoginBtn;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/edit_account")
    public MobileElement emailAccountTextbox;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeSecureTextField[1]")
    @AndroidFindBy(id = "com.eco.global.app:id/edit_password")
    public MobileElement passwordTextbox;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id = "com.eco.global.app:id/btn_login")
    public MobileElement loginButton;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    @AndroidFindBy(id="com.eco.global.app:id/actionbar_right_text")
    public MobileElement saveBtnInAreaPage;
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeImage[1]")
    @AndroidFindBy(id="com.eco.global.app:id/online_service_text")
    public MobileElement onlineCustom;
    @iOSFindBy(xpath="")
    @AndroidFindBy(id="com.ecovacs.ecosphere:id/icon")
    public MobileElement dw700Icon;
    @iOSFindBy(xpath="")
    @AndroidFindBy(id="com.ecovacs.ecosphere:id/warm_tip")
    public MobileElement errorPanel;



    public MobilePage(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


}
