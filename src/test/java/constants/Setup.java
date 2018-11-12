package constants;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.apache.http.entity.StringEntity;
import org.junit.Assert;
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
            String returnStr=JsonUtility.postJsonContent("http://localhost:3000/startdevice", inputBody);
            if(returnStr.equals("OK")||returnStr.equals("virtual device is already online")){
                System.out.println("Start DR930 succeed, test pass!");
            }
            else
                Assert.fail("Start DR930 get error, test fail!");
        } else if (type.equals("dw700")) {
            StringEntity inputBody = new StringEntity(DeviceUtility.DW700);
            String returnStr = JsonUtility.postJsonContent("http://localhost:3000/startdevice", inputBody);
            if (returnStr.equals("OK") || returnStr.equals("virtual device is already online")) {
                System.out.println("Start DW700 succeed, test pass!");
            } else
                Assert.fail("Start DW700 get error, test fail!");
        }
        else if (type.equals("dn39")) {
            StringEntity inputBody = new StringEntity(DeviceUtility.DN39);
            String returnStr = JsonUtility.postJsonContent("http://localhost:3000/startdevice", inputBody);
            if (returnStr.equals("OK") || returnStr.equals("virtual device is already online")) {
                System.out.println("Start DN39 succeed, test pass!");
            } else
                Assert.fail("Start DN39 get error, test fail!");
            JsonUtility.postJsonContent("http://localhost:3000/startdevice", inputBody);
        }else if (type.equals("dn55")) {
            StringEntity inputBody = new StringEntity(DeviceUtility.DN55);
            String returnStr = JsonUtility.postJsonContent("http://localhost:3000/startdevice", inputBody);
            if (returnStr.equals("OK") || returnStr.equals("virtual device is already online")) {
                System.out.println("Start DN55 succeed, test pass!");
            } else
                Assert.fail("Start DN55 get error, test fail!");
            JsonUtility.postJsonContent("http://localhost:3000/startdevice", inputBody);
        }
    }

    public AppiumDriver setUp(String platform,String deebotType) throws Exception {
        if (platform.equals("ios")) {
            File classpathRoot = new File(System.getProperty("user.dir"));
            File appDir = new File(classpathRoot, "file");
            File app = new File(appDir, deebotType+".ipa");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "iPhone");
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("platformVersion", "11.1.1");
            capabilities.setCapability("bundleId", "com.eco.global.app");
            capabilities.setCapability("udid", "1291e24e38090c86966e07b5bd6299c74b80be31");
            capabilities.setCapability("app", app.getAbsolutePath());
            capabilities.setCapability("automationName", "xcuitest");
            capabilities.setCapability("autoAcceptAlerts", "True");
            capabilities.setCapability("noSign", "True");
            capabilities.setCapability("newCommandTimeout", 300);
            capabilities.setCapability("noReset", "True");
            appiumDriver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            return appiumDriver;
        } else {
            File classpathRoot = new File(System.getProperty("user.dir"));
            File appDir = new File(classpathRoot, "file");
            File app = new File(appDir, deebotType+".apk");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("automationName", "Appium");
            capabilities.setCapability("deviceName", "Nexus 6");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "6.0.0");
            capabilities.setCapability("udid", "84B7N15A20002666");
            capabilities.setCapability("app", app.getAbsolutePath());
            //capabilities.setCapability("appPackage","com.eco.global.app");
            //capabilities.setCapability("appActivity","com.eco.main.activity.EcoMainActivity");
            capabilities.setCapability("unicodeKeyboard", "True");
            capabilities.setCapability("resetKeyboard", "True");
            capabilities.setCapability("noSign", "True");
            capabilities.setCapability("newCommandTimeout", 600);
            //True每次运行不重新安装
            capabilities.setCapability("noReset", "True");
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
