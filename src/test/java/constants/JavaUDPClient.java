package constants;

import java.io.IOException;
import java.net.*;

/**
 * Created by poppy.zhang on 2018/9/26.
 */
public class JavaUDPClient {
    public static void main(String[] args) throws Exception {

        Runnable sender = new Runnable() {
            @Override
            public void run() {
                //数据包套接字：相当于码头，专门处理通信数据及进行数据转发设置的
                DatagramSocket ds = null;
                try {
                    ds = new DatagramSocket();
                } catch (SocketException e) {
                    e.printStackTrace();
                }

                String message = "Hello poppy!";

                //数据报包:类似于集装箱，用来存储所有的数据信息
                DatagramPacket dp = null;
                try {
                    dp = new DatagramPacket(
                            message.getBytes(),   //数据都是已字节数据进行发送的，因此需要将数据进行转换
                            message.length(), //发送数据的长度
                            InetAddress.getByName("127.0.0.1"),  //发送数据的源ip地址
                            5066   //发送数据的端口号
                    );
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }

                try {
                    for ( int i=0;i<50;i++){
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ds.send(dp);  //数据包通过码头DatagramSocket发送出去
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ds.close();   //数据发送之后关闭通道，减少资源浪费
            }
        };
        System.out.println("sender start");


        Runnable receiver  = new Runnable() {
            @Override
            public void run() {
                //创建数据接收码头，只接受和客户端约定的3000端口的数据
                DatagramSocket ds= null;
                try {
                    ds = new DatagramSocket(5066);
                } catch (SocketException e) {
                    e.printStackTrace();
                }
                //创建数据接收的数据缓冲区
                byte[] buf=new byte[1024];
                DatagramPacket dp=new DatagramPacket(buf,1024);

                //接受来自端口1024的数据包，并存储在集装箱datagramPacket中：注意一旦服务器开启，就会自动监听3000端口，如果 没有数据，则进行阻塞
                try {
                    ds.receive(dp);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                //解析数据包中的信息
                String data=new String(dp.getData(),0,dp.getLength());
                String ip=dp.getAddress().getHostAddress();
                int port=dp.getPort();

                System.out.println("ip地址："+ip+" 端口号："+port+" 消息："+data);
                //ds.close();
            }
        };
        System.out.println("receive start");
        new Thread(receiver).start();
        new Thread(sender).start();
    }
}
