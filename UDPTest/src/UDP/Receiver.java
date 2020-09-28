package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    public static void main(String args[]) throws IOException {
//      创建接收端点
        DatagramSocket ds = new DatagramSocket(10000);
        while (true){

//      定义存储数据的数据包
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf,buf.length);
//          System.out.println(dp.getLength());
//      端点接受的数据存入到数据包中
            ds.receive(dp);
//      调用线程启动
            Thread thread = new Thread(new UDPThread(ds,dp));
            thread.start();
//      获取访问ip
//          String ip = dp.getAddress().getHostAddress().toString();
//          System.out.println("当前客户的ip为"+ip);
//          String data = new String(dp.getData(),0,dp.getLength());
//          System.out.println(data);
//          int port = dp.getPort();
//          System.out.println(port);

//          ds.close();
        }
    }
}
