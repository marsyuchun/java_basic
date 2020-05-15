package day11_netProgram;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by yanyuchun on 2020/5/4
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8998);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
//        while (len !=-1){
//
//        }

        OutputStream out = accept.getOutputStream();
        out.write("收到，客户端！".getBytes());

        accept.close();
        ss.close();

    }

}
