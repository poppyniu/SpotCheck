package pages;

import constants.CommonException;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by Poppy_Zhang on 2018/9/11.
 */
public class CommonPage extends PageObject {
    public static long longWait;
    private static final long defaultTimeout = longWait;

    /**
     * clear text box if it's not empty
     * add by poppy
     *
     * @param driver
     * @return
     */
    public static void clearTextbox(WebDriver driver, By by)
            throws Exception {
        WebElement element = driver.findElement(by);
        if (element != null) {
            element.clear();
        }
    }

    public boolean elementExist(WebElement element) throws Exception {
        boolean elementExist = element.isDisplayed();
        try {
            if (elementExist == true) {
                Assert.assertTrue(true);
                return elementExist;
            }
        } catch (NoSuchElementException e) {
            return false;
        }
        return elementExist;
    }


    public void navigatePage(String url)
            throws Exception {
        getDriver().navigate().to(url);
    }

    /**
     * Wait time
     *
     * @param driver
     */
    public static void wait(WebDriver driver, long timeOutInSeconds) {
        try {
            (new WebDriverWait(driver, timeOutInSeconds)).until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    return false;
                }
            });
        } catch (Exception e) {
        }
    }

    /**
     * Will return particular element by the given locator condition.
     *
     * @param driver  WebDriver on a page, or WebElement on a page.
     * @param by      How to find the element.
     * @param timeout The time to wait in seconds.
     * @return The particular element.
     */
    public static WebElement getElement(WebDriver driver, By by, long timeout) {
        WebElement element;
        try {
            element = WaitElementToBeLocated(driver, by, timeout);
        } catch (Exception ex) {
            element = null;
        }

        return element;
    }

    /**
     * Click the particular element by the given locator condition.
     *
     * @param driver WebDriver on a page, or WebElement on a page.
     * @param by     How to find the element.
     * @throws Exception
     */
    public static void clickElementWhenPresent(WebDriver driver, By by) throws Exception {
        clickElementWhenPresent(driver, by, defaultTimeout);
    }

    /**
     * Click the particular element by the given locator condition.
     *
     * @param driver  WebDriver on a page, or WebElement on a page.
     * @param by      How to find the element.
     * @param timeout The time to wait in seconds.
     * @throws Exception
     */
    public static void clickElementWhenPresent(WebDriver driver, By by, long timeout) throws Exception {
        try {
            WebElement element = WaitElementToBeClickable(driver, by, timeout);
            element.click();
        } catch (Exception ex) {
            throw new CommonException(packErrMsg(by.toString()), ex);
        }
    }

    /**
     * @param driver
     * @param by
     * @param timeout
     * @return
     */
    private static WebElement WaitElementToBeLocated(WebDriver driver, By by, long timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /**
     * @param driver  WebDriver on a page, or WebElement on a page.
     * @param by      How to find the element.
     * @param timeout The time to wait in seconds.
     * @return
     */
    private static WebElement WaitElementToBeClickable(WebDriver driver, By by, long timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    /**
     * Wrap up message
     *
     * @param desc
     * @return message
     */
    private static String packErrMsg(String desc) {
        String message = "";
        if (desc != null && desc != "") {
            message = "Unable to locate the element: " + desc;
        } else {
            message = "Unable to locate element";
        }
        return message;
    }

    public void selectWorkingHoursDrodownByItemAndNumber(Integer Number, String item)
            throws Exception {
        //getDriver().findElement(By.xpath(".//*[@id='tender.general.workingHours']/div[@class='working-hours']/div[2]/div["+Number+"]/ul/li/span/span[contains(text(),'"+item+"')]")).click();
        getDriver().findElement(By.xpath(".//*[@id='tender.general.workingHours']/div/div[2]/div[" + Number + "]/div[3]/ul/li/span/span[contains(text(),'" + item + "')]")).click();
    }

    public void selectWorkingHoursDrodownByItem(String item)
            throws Exception {
        getDriver().findElement(By.xpath("//div[contains(@id,'workingHours')]/div[contains(@id,'add')]/div[1]/ul/li/span/span[contains(text(),'" + item + "')]")).click();
    }

    public void selectWorkingHoursDrodown2ByItem(String item)
            throws Exception {
        getDriver().findElement(By.xpath("//div[contains(@id,'workingHours')]/div[contains(@id,'add')]/div[2]/ul/li/span/span[contains(text(),'" + item + "')]")).click();
    }

    public void sendKeysOnElement(WebElement element, String sendValue) {
        element.click();
        element.clear();
        String insertedValue = element.getAttribute("value");
        while (!insertedValue.equals(sendValue)) {
            element.click();
            for (int i = 0; i < sendValue.length(); i++) {
                element.sendKeys(sendValue.substring(i, i + 1));
            }
            insertedValue = element.getAttribute("value");
        }
    }

    public void scrollToElement(final WebElement element) {
        final int yCoordinate = element.getLocation().getY();
        final String script = String.format("window.scrollTo(0,%s);", yCoordinate - 350);
        getJavascriptExecutorFacade().executeScript(script, element);
    }

    public static String getSpecifiedDayBefore(String specifiedDay) {
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Calendar c = Calendar.getInstance();
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day - 1);

        String dayBefore = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime());
        return dayBefore;
    }

    public static boolean isContentAppeared(WebDriver driver, String content) {
        boolean status = false;
        try {
            driver.findElement(By.xpath("//*[contains(a,'" + content + "')]"));
            System.out.println(content + " is appeard!");
            status = true;
        } catch (NoSuchElementException e) {
            System.out.println("'" + content + "' doesn't exist!");
        }
        return status;
    }

    //use below function to wait mobile element
    public static void waitMobileElementVisible(AppiumDriver driver, String xpath, int waitTime, String platform) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        for (int attempt = 0; attempt < waitTime; attempt++) {
            try {
                if (platform.equals("ios")) {
                    driver.findElementByXPath(xpath);
                    break;
                } else {
                    driver.findElementById(xpath);
                    break;
                }

            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            }
        }
        if (platform.equals("ios")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        } else {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(xpath)));
        }
    }

    public static boolean waitElementVisible(AppiumDriver driver, String xpath, int waitTime, String platform) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        for (int attempt = 0; attempt < waitTime; attempt++) {
            try {
                if (platform.equals("ios")) {
                    driver.findElementByXPath(xpath);
                    break;
                } else {
                    driver.findElementById(xpath);
                    break;
                }

            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                return false;
            }
        }
        if (platform.equals("ios")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        } else {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(xpath)));
        }
        return true;
    }

    public static void waitForVisible(AppiumDriver driver, String xpath, int waitTime, String platform) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        for (int attempt = 0; attempt < waitTime; attempt++) {
            try {
                if (platform.equals("ios")) {
                    driver.findElementByXPath(xpath);
                    break;
                } else {
                    driver.findElementById(xpath);
                    break;
                }

            } catch (Exception e) {
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            }
        }
        if (platform.equals("ios")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        } else {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(xpath)));
        }
    }

    //控制滑动方向
    public enum Heading {
        UP, DOWN, LEFT
    }


    public static void swipeInElement(AppiumDriver driver, MobileElement xpath, Heading heading) {
        // 获取控件开始位置的坐标轴
        Point start = xpath.getLocation();
        TouchAction ta = new TouchAction(driver);
        Duration duration = Duration.ofSeconds(1);
        int startX = start.x;
        int startY = start.y;

        // 获取控件坐标轴差
        Dimension q = xpath.getSize();
        int x = q.getWidth();
        int y = q.getHeight();
        // 计算出控件结束坐标
        int endX = x + startX;
        int endY = y + startY;

        // 计算中间点坐标
        int centreX = (endX + startX) / 2;
        int centreY = (endY + startY) / 2;

        switch (heading) {
            // 向上滑动
            case UP:
                ta.press(centreX, centreY + 30).moveTo(centreX, centreY - 30).release().perform();
                //driver.swipe(centreX, centreY + 30, centreX, centreY - 30, 500);
                break;
            // 向下滑动
            case DOWN:
                ta.press(centreX, centreY - 30).moveTo(centreX, centreY + 30).release().perform();
                //                driver.swipe(centreX, centreY - 30, centreX, centreY + 30, 500);
                break;
            case LEFT:
                int width = driver.manage().window().getSize().width;
                int height = driver.manage().window().getSize().height;
                ta.press(width * 3 / 4, height / 2).waitAction(Integer.parseInt(Duration.ofSeconds(1).toString())).moveTo(width / 4, height / 2).release().perform();
        }
    }

    public static void swipeElementToLeft(AppiumDriver driver, MobileElement element) throws InterruptedException {
        Point point = element.getLocation();
        int startX = point.x;
        int startY = point.y;
        Dimension dimension = element.getSize();
        int width = dimension.getWidth();
        int height = dimension.getHeight();

        int centerX = startX + width * 1 / 2;
        int centerY = startY + height * 1 / 2;
        TouchAction ta = new TouchAction(driver);
        //ta.press(centerX, centerY).moveTo(100 - centerX, 0).release().perform();
        ta.press(centerX, centerY).moveTo(200 - centerX, 0).release().perform();
    }

    public static void swipeToDirection(AppiumDriver driver, String direction) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<>();
        params.put("direction", direction);
        js.executeScript("mobile: swipe", params);
    }

}
