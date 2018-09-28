package serenity;

import constants.MessageUtility;
import constants.UDPUtility;
import net.thucydides.core.annotations.Step;

/**
 * Created by poppy zhang on 2018/9/26.
 */
public class SendUDPSteps {
    @Step
    public void send_udp_message(String errorNum) throws Exception {
        String message = "";
        if (errorNum.equals("100")) {
            message = MessageUtility.NoError;
        } else if (errorNum.equals("101")) {
            message = MessageUtility.BatteryLow;
        } else if (errorNum.equals("102")) {
            message = MessageUtility.HostHang;
        } else if (errorNum.equals("103")) {
            message = MessageUtility.WheelAbnormal;
        } else if (errorNum.equals("104")) {
            message = MessageUtility.DownSensorAbnormal;
        } else if (errorNum.equals("105")) {
            message = MessageUtility.Stuck;
        } else if (errorNum.equals("106")) {
            message = MessageUtility.SideBrushExhausted;
        } else if (errorNum.equals("107")) {
            message = MessageUtility.DustCaseHeapExhausted;
        } else if (errorNum.equals("108")) {
            message = MessageUtility.SideAbnormal;
        } else if (errorNum.equals("109")) {
            message = MessageUtility.RollAbnormal;
        } else if (errorNum.equals("110")) {
            message = MessageUtility.NoDustBox;
        } else if (errorNum.equals("111")) {
            message = MessageUtility.BumpAbnormal;
        }
        UDPUtility UDPUtility = new UDPUtility(message);
        Runnable sender = new Runnable() {
            @Override
            public void run() {
                UDPUtility.send();
            }
        };
        Thread thread = new Thread(sender);
        thread.start();
        synchronized (thread) {
            thread.wait();
        }

    }

}