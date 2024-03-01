package nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ：duyd@segimail.com
 * @class ：nio.NioSelectorService
 * @date ：Created in 2024/3/1 15:56
 * @description：客户端 用telnet localhost 9000 进行连接
 *                      send  内容  发送数据
 * @modified By：
 * @version:
 */
public class NioSelectorService {
    public static void main(String[] args) throws IOException {
        //建立nio连接
        ServerSocketChannel serverSocket = ServerSocketChannel.open();
        //设置监听端口
        serverSocket.socket().bind(new InetSocketAddress(9000));
        //设置ServerSocketChannel为非阻塞
        serverSocket.configureBlocking(false);

        //打开selector处理channel,即创建epoll
        Selector selector = Selector.open();
        //将socket的[连接]注册到selector上
        serverSocket.register(selector, SelectionKey.OP_ACCEPT);

        System.out.println("server start...");

        while (true){
            //阻塞等待需要处理的事件
            selector.select();
            //获取selector中注册的全部事件,
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            //遍历处理连接事件
            if(iterator.hasNext()){
                SelectionKey key = iterator.next();
                //如果事件是OP_ACCEPT事件,则连接后进行OP_READ 注册
                if(key.isAcceptable()){
                    ServerSocketChannel channel = (ServerSocketChannel)key.channel();
                    SocketChannel accept = channel.accept();
                    accept.configureBlocking(false);

                    System.out.println("客户端连接成功");
                    channel.register(selector,SelectionKey.OP_READ);

                } else if (key.isReadable()) {//如果是OP_READ则进行读取和打印
                    SocketChannel channel = (SocketChannel)key.channel();
                    ByteBuffer allocate = ByteBuffer.allocate(6);
                    int len = channel.read(allocate);
                    if(len != -1 ){
                        System.out.println("接收到消息:" + new String(allocate.array()));
                    }else{
                        System.out.println("客户端断开连接");
                        channel.close();
                    }
                }
                //从事件集合删除本次处理的key
                iterator.remove();
            }

        }
    }
}
