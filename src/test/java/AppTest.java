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

        String s = " Id=810000011,Name=....,BaseTypeId=1006001001,Value=25,Valid=1,SampleTime=2018-09-10 11:02:33.Id=810000021,Name=....,BaseTypeId=1006003001,Value=54.3,Valid=1,SampleTime=2018-09-10 11:02:33.";
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