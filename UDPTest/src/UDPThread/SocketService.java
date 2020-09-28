package UDPThread;

import java.io.IOException;
import java.net.ServerSocket;

public class SocketService {
    public static void main(String[] args) throws IOException {
        SocketService socketService = new SocketService();
        socketService.manyServer();

    }

    public  void manyServer() throws IOException{
        boolean flag = true;
        ServerSocket serverSocket = null;
        serverSocket = new ServerSocket(10000);
        int clientNum = 0;
        while(flag){
            new SocketServerThread(serverSocket.accept(), clientNum).start();
            clientNum++;
            System.out.println("访问次数："+clientNum);
        }
        serverSocket.close();
    }

}
