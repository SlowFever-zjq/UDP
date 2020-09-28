package UDP;


import UDP.print.HtoGBK;
import fanyi.Main;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPThread extends Thread{
    DatagramSocket ds = null;
    DatagramPacket dp = null;
    public static int quantity = 0;
    public UDPThread(DatagramSocket ds, DatagramPacket dp) throws IOException {
        this.ds = ds;
        this.dp = dp;

    }
    public void run(){
        String sever = null;
        InetAddress ip = null;
        int port = 10000;
        byte[] client = null;
        DatagramPacket severdp = null;
        //      标注服务器被链接次数
        try {
//          客户端发来消息
            sever = new String(dp.getData(),0,dp.getLength());
            System.out.println("Client"+ dp.getAddress()+ "send："+sever);
//          对sever进行切割
            DataSplit dataSplit =new DataSplit(sever);

//            System.out.println("================="+sever);
            ip = dp.getAddress();
            port = dp.getPort();
//          报文解析
//            if(sever != null){
//                Print.print(sever);
//            }
//          服务器端响应
            client = "response OK".getBytes();
            severdp = new DatagramPacket(client, client.length,ip,port);
            ds.send(severdp);
            quantity++;
            System.out.println("Server linked times:" + quantity);

//         写出到文本中
//            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("D:\\\\Message\\\\analysis\\\\1.txt")), "GBK"));
//        内容
//            out.write(String.valueOf(sever));
//            out.close();
//            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
