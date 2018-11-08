package constants;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.apache.http.entity.StringEntity;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

/**
 * Created by poppy.zhang on 2018/8/9.
 */
public class Setup {
    public static AppiumDriver appiumDriver;

    public void startSimulator(String type) throws Exception {
        if (type.equals("dr930")) {
            StringEntity inputBody = new StringEntity(DeviceUtility.DR930);
            JsonUtility.postJsonContent("http://localhost:3000/startdevice", inputBody);
        } else if (type.equals("dw700")) {
            StringEntity inputBody = new StringEntity(DeviceUtility.DW700);
            JsonUtility.postJsonContent("http://localhost:3000/startdevice", inputBody);
        }else if (type.equals("dn55")) {
            StringEntity inputBody = new StringEntity(DeviceUtility.DN55);
            JsonUtility.postJsonContent("http://localhost:3000/startdevice", inputBody);
        }
    }

    public AppiumDriver setUp(String platform) throws Exception {
        if (platform.equals("ios")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "iPhone");
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("platformVersion", "11.2.6");
            capabilities.setCapability("bundleId", "com.eco.global.app");
            capabilities.setCapability("udid", "4e3b8c6a88f5d84f6a512ebc666876c3ac5d6358");
            capabilities.setCapability("app", "/Users/ecovacsqa/Desktop/GlobalApp.ipa");
            capabilities.setCapability("automationName", "xcuitest");
            capabilities.setCapability("autoAcceptAlerts", "True");
            capabilities.setCapability("newCommandTimeout", 300);
            capabilities.setCapability("noReset", "True");
            appiumDriver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            return appiumDriver;
        } else {
            File classpathRoot = new File(System.getProperty("user.dir"));
            File appDir = new File(classpathRoot, "file");
            File app = new File(appDir, "dn55.apk");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("automationName", "appium");//UiAutomator2 appium
            capabilities.setCapability("deviceName", "Nexus 6P");//Nexus 6P Letv X500
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.0");//5.0.2 6.0.0
            capabilities.setCapability("udid", "84B7N15A20002666");//MZROUGFIJZ8POBY9   84B7N15A20002666
            capabilities.setCapability("app", app.getAbsolutePath());
//            capabilities.setCapability("appPackage", "com.ecovacs.ecosphere");
//            capabilities.setCapability("appActivity", "com.ecovacs.ecosphere.activity.IconTabActivity");
            capabilities.setCapability("unicodeKeyboard", "True");
            capabilities.setCapability("resetKeyboard", "True");
            capabilities.setCapability("noSign", "True");
            capabilities.setCapability("noReset", "True");
            //capabilities.setCapability("newCommandTimeout", 600);
//            capabilities.setCapability("appWaitActivity", "com.ecovacs.ecosphere.activity.IconTabActivity,");
            appiumDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            return appiumDriver;
        }
    }

    public void tearDown() throws Exception {
        appiumDriver.quit();
    }

    public void SimulatorTearDown() throws Exception {
        JsonUtility.sendPost("http://localhost:3000/reset");
    }

}
