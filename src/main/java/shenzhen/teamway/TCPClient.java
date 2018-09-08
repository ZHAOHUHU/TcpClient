package shenzhen.teamway;


import java.io.*;
import java.net.Socket;

/**
 * @program: UDPDemo
 * @description:
 * @author: Zhao Hong Ning
 * @create: 2018-09-07 09:35
 **/
public class TCPClient {
    private static int port = 6789;
    private static final int timeout = 5000;

    public static void main(String[] args) {
        Socket socket = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            //创建Socket实例
            socket = new Socket("127.0.0.1", port);
            //获取输出流,向服务器发生数据
            outputStream = socket.getOutputStream();
            outputStream.write("Cmd=2,DevId=2,Type=1".getBytes());
            ///获取输入流,获取服务器的响应
            inputStream = socket.getInputStream();
            byte[] buff = new byte[1024];
            int len = 0;
            len = inputStream.read(buff);
            //打印服务端的相应
            System.out.println(new String(buff, 0, len));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放资源

            try {
                inputStream.close();
                outputStream.close();
                socket.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}