package server;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * Created by yanyuchun on 2020/5/4
 */
/*
    TCP通信的客户端
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket s1 = new Socket("127.0.0.1", 9090);

        InputStream is = s1.getInputStream();

        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));




    }
}
