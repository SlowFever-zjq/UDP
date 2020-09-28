package UDP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.ByteBuffer;

public class SendThread extends Thread{




    int port = 10000;

    public SendThread(String ip) {
        run(ip);
    }

    public void run(String ip) {
        while (true){
            try {
//                InetAddress ip;
//                ip = InetAddress.getLocalHost();


                //      手动输入
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

                String Client = "";
//        System.out.println(in.readLine());
                Client = in.readLine();
//            in.close();

                byte[] data = Client.getBytes();
                DatagramPacket dp = new DatagramPacket(data, data.length, InetAddress.getByName(ip), port);
                DatagramSocket ds = new DatagramSocket();
                ds.send(dp);
//      接收服务器响应数据
                byte[] data2 = new byte[1024];
                DatagramPacket dp2 = new DatagramPacket(data2, data2.length);
                ds.receive(dp2);
                String sever = new String(data2, 0, dp2.getLength());
                System.out.println("server:" + sever);
                ds.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
