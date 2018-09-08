import java.util.HashMap;

/**
 * @program: UDPDemo
 * @description:
 * @author: Zhao Hong Ning
 * @create: 2018-09-08 10:30
 **/
public class AppTest {
    public static void main(String[] args) {
        final HashMap<String, String> map = new HashMap<String, String>();

        String s = "deviceid=567466412,name=KBT37...........deviceid=569463093,name=......-60W.deviceid=575514832,name=KBT85...........deviceid=810434374,name=485YG.deviceid=810451715,name=.......deviceid=410521693,name=......New.deviceid=440834797,name=.......deviceid=504958072,name=JXBS3001...................deviceid=318256905,name=...................";
        final String[] split = s.split("deviceid=");
        for (int i = 0; i < split.length; i++) {
            String ss = split[i];
            final String[] split1 = ss.split(",name=");
            String temp = null;
            for (int j = 0; j < split1.length - 1; j = j + 2) {
                map.put(split1[j], split1[j + 1]);
            }
        }
    }
}