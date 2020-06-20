package fileUpload;

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
            // 监听客户端进程
            Socket socket = server.accept();
            /*
            开启线程
             */
            new Thread(new Runnable() {
                /**
                 * @see Thread#run()
                 */
                @Override
                public void run() {
                    try {
                        // 创建服务端网络输入流
                        InputStream is = socket.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String line = br.readLine();
//                        System.out.println(line);
                        String[] arr = line.split("");
                        String htmlPath = arr[1].substring(1);

                        // 创建本地字节输入流
                        if (!htmlPath.endsWith(".ico")){
                            FileInputStream fis = new FileInputStream(htmlPath);
                            // 使用socket中OutputStream
                            OutputStream os = socket.getOutputStream();

                            // 写入http协议响应头，固定写法
                            os.write("HTTP/1.1 200 OK\n".getBytes());
                            os.write("Content-Type:text/html\n".getBytes());
                            os.write("\n".getBytes());

                            // 一读一写复制文件，把服务器复制的文件回写到客户端
                            byte[] bytes = new byte[1024];
                            int len = 0;
                            while ((len = fis.read(bytes)) != -1) {
                                os.write(bytes, 0, len);
                            }

                            // 释放资源
                            fis.close();
                            socket.close();
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
//            server.close();

        }
    }

}
