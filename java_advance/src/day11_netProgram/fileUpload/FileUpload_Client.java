package day11_netProgram.fileUpload;


import java.io.*;
import java.net.Socket;

/**
 * Created by yanyuchun on 2020/5/5
 */
public class FileUpload_Client {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("java_advance/src/day10_Stream/serialize/wenben.txt"));
        // 2、 创建socket
        Socket socket = new Socket("localhost", 6667);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());




        byte[] bytes = new byte[1024];
        int len=0;
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes, 0, len);
        }
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }


        socket.close();
        bis.close();

    }


}
