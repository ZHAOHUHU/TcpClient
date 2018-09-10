/**
 * @program: UDPDemo
 * @description:
 * @author: Zhao Hong Ning
 * @create: 2018-09-10 11:06
 **/
public class apptest2 {
    public static double cutValue(String args) {
        String ss = "Id=810000011,Name=....,BaseTypeId=1006001001,Value=25,Valid=1,SampleTime=2018-09-10 11:02:33";
        String s = " Id=810000011,Name=....,BaseTypeId=1006001001,Value=25,Valid=1,SampleTime=2018-09-10 11:02:33.Id=810000021,Name=....,BaseTypeId=1006003001,Value=54.3,Valid=1,SampleTime=2018-09-10 11:02:33.";
        final String[] split = s.split("Value=");
        final String[] split1 = split[1].split(",");
        System.out.println(split1[0]);
        return Double.parseDouble(split1[0]);

    }

    public static void main(String[] args) {
        String ss = "Id=810000011,Name=....,BaseTypeId=1006001001,Value=25,Valid=1,SampleTime=2018-09-10 11:02:33";
        new apptest2().cutValue(ss);
    }

}