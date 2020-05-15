package day11_netProgram;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by yanyuchun on 2020/5/4
 */
/*
    TCP通信的客户端
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket s1 = new Socket("127.0.0.1", 8998);
        OutputStream os = s1.getOutputStream();
        os.write("你好，服务器！".getBytes());

        InputStream is = s1.getInputStream();

        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        os.close();
    }
}
