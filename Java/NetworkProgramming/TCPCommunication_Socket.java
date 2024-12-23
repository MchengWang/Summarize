package Summarize.NetworkProgramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPCommunication_Socket {
    /*TCP通信的客户端代码实现
     *   向服务端发送连接请求，给服务器发送数据，读取服务器回写的数据
     *   java.net.Socket 表示客户端的类
     *       此类实现客户端套接字（“也可以叫套接写”）。套接字就是两台机器通信的端点
     *   套接字：既包含了IP地址和端口的网络单位*/

    public static void main(String[] args) throws IOException {
        // 1.创建客户端对象Socket，构造中绑定服务器IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);
        // 2.使用Socket对象中的方法getOutputStream（）获取网络字节输出流对象
        OutputStream os = socket.getOutputStream();
        // 3.使用网络字节输出流OutputStream对象中的方法write，给服务器发送数据
        os.write("你好服务器".getBytes());
        // 4.使用Socket对象中的方法getInputStream（）获取网络字节输入流对象
        InputStream is = socket.getInputStream();
        // 5.使用网络字节输入流InputStream对象中的方法read，读取服务器回写的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes , 0 , len));
        // 6.释放资源close（）
        socket.close();
    }
}
