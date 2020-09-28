package UDP;

import java.io.IOException;

public class Send3 {
    public static void main(String args[]) throws IOException {
/*      DatagramSocket ds = new DatagramSocket();
        String data = "udp send to receiver";
        byte[] buf = data.getBytes();

        InetAddress ip = InetAddress.getLocalHost();
        int port = 10000;

//      System.out.println(ip);
//      System.out.println(buf.length);
        DatagramPacket dp = new DatagramPacket(buf,buf.length, ip,port);
        ds.send(dp);
        ds.close();
        */
/*
        InetAddress ip = InetAddress.getLocalHost();
        int port = 10000;
//      手动输入
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

//        BufferedReader in = new BufferedReader( new InputStreamReader(new FileInputStream("D:\\Message\\Message analysis.txt"),"gbk"));
        String Client = "";
//        System.out.println(in.readLine());
        Client = in.readLine();
        in.close();
        byte[] data = Client.getBytes();
        DatagramPacket dp = new DatagramPacket(data,data.length,ip,port);
        DatagramSocket ds = new DatagramSocket();
        ds.send(dp);
//      接收服务器响应数据
        byte[] data2 = new byte[1024];
        DatagramPacket dp2 = new DatagramPacket(data2, data2.length);
        ds.receive(dp2);
        String sever = new String(data2,0,dp2.getLength());
        System.out.println("服务器端说："+sever);
        ds.close();

*/
        String ip = "127.0.0.1";
//        SendThread thread3 = new SendThread(5555,"localhost",10000);
        SendThread thread3 = new SendThread(ip);
//        thread3.run();
        thread3.run();

    }
}
