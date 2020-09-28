package UDPThread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class SocketServerThread extends Thread{
    Socket socket = null;
    int clientNum = 0;
    public SocketServerThread(Socket socket,int num){
        this.socket = socket;
        this.clientNum = num+1;
    }
    public void run(){
        try{
            String line;
            BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //由Socket对象得到输入流，并构造相应的BufferedReader对象
            PrintWriter writer=new PrintWriter(socket.getOutputStream());
            //由Socket对象得到输出流，并构造PrintWriter对象
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            //由系统标准输入设备构造BufferedReader对象
            System.out.println("Client"+socket.getLocalAddress()+":"+in.readLine());
            //在标准输出上打印从客户端读入的字符串
            line=br.readLine();
            //从标准输入读入一字符串
            while(!line.equals("end")){
                //如果该字符串为 "bye"，则停止循环
                writer.println(line);
                //向客户端输出该字符串
                writer.flush();
                //刷新输出流，使Client马上收到该字符串
                System.out.println("Server:"+line);
                //在系统标准输出上打印读入的字符串
                System.out.println("Client:"+in.readLine());
                //从Client读入一字符串，并打印到标准输出上
                line=br.readLine();
                //从系统标准输入读入一字符串
            } //继续循环
            writer.close(); //关闭Socket输出流
            in.close(); //关闭Socket输入流
            socket.close(); //关闭Socket
        }catch(Exception e) {//出错，打印出错信息
            System.out.println("Error."+e);
        }

    }
}
