package day11_netProgram;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by yanyuchun on 2020/5/5
 */
public class FileUploadServer {
    public static void main(String[] args) throws IOException {  
        try {
            ServerSocket sc = new ServerSocket(6667);
            Socket socket = sc.accept();
            File file = new File("java_advance/src/day11_netProgram");
            if (!file.exists()) {
                file.mkdirs();
            }
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file+"/007.txt"));
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }

            socket.getOutputStream().write("上传成功".getBytes());
            bos.close();
            socket.close();
            sc.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
