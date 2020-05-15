package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by yanyuchun on 2020/5/4
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        // 创建一个服务器ServerSocket，和系统要指定的端口号
        ServerSocket server = new ServerSocket(9090);
        /*
            浏览器解析服务器回写的html页面，页面如果有图片，那么浏览器就会单独开启一个线程
         */
        while (true) {
            // 监听客户端
            Socket socket = server.accept();

            new Thread(new Runnable() {
                /**
                 * @see Thread#run()
                 */
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        // 创建字符输入流
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        // 提取文件路径
                        String line = br.readLine();
//            System.out.println(line);
                        String[] arr = line.split(" ");
                        String pathName = arr[1].substring(1);
                        if (!pathName.endsWith(".ico")) {
                            // 创建一个本地字节输入流，用来读取服务端的文件传递给客户端
                            FileInputStream fis = new FileInputStream(pathName);
                            // 获取Socket中的outputStream，把读取的文件输出到页面去
                            OutputStream os = socket.getOutputStream();

                            // 写入http协议响应头，固定写法
                            os.write("HTTP/1.1 200 OK\n".getBytes());
                            os.write("Content-Type:text/html\n".getBytes());
                            os.write("\n".getBytes());

                            // 一读一写复制文件，把服务器复制的文件回写到客户端
                            byte[] bytes = new byte[1024];
                            int len;
                            while ((len = fis.read(bytes)) != -1) {
                                os.write(bytes, 0, len);
                            }
                            fis.close();
                            socket.close();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            // 一直在监听，不需要关闭socket
//        server.close();

//        byte[] bytes = new byte[1024];
//        int len;
//        while ((len = is.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,len));
//        }
        }

    }
}
