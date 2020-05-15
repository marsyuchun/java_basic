package day11_netProgram.fileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * Created by yanyuchun on 2020/5/5
 */
public class FileUploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket sc = new ServerSocket(6667);
        /*
        让服务器一直处于监听状态，有一个客户端上传文件，就保存一个文件
         */
        while (true) {
            Socket socket = sc.accept();

            /*
            使用多线程技术提高程序的效率
            有一个客户端上传，就开启一个线程
             */
            new Thread(new Runnable() {

                /**
                 * When an object implementing interface <code>Runnable</code> is used
                 * to create a thread, starting the thread causes the object's
                 * <code>run</code> method to be called in that separately executing
                 * thread.
                 * <p>
                 * The general contract of the method <code>run</code> is that it may
                 * take any action whatsoever.
                 *
                 * @see Thread#run()
                 */
                // 完成文件上传
                @Override
                public void run() {
                    try {
                        File file = new File("java_advance/src/day11_netProgram/");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        /*
                            自定义文件命名规则
                        */
                        String fileName = "wormpex" + System.currentTimeMillis() + new Random().nextInt(6666) + ".txt";
//                      System.out.println(file+fileName);


                        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file + "/" + fileName));
                        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                        byte[] bytes = new byte[1024];
                        int len;
                        while ((len = bis.read(bytes)) != -1) {
                            bos.write(bytes, 0, len);
                        }

                        socket.getOutputStream().write("上传成功".getBytes());

                        bos.close();
                        socket.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();


        }

        // 服务器一直启动状态
//        sc.close();

    }
}
