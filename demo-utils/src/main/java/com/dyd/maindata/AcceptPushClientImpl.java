package com.dyd.maindata;

import Ice.Current;
import com.glacier.GlacierClient;
import segi.common.mq.push.client.Client.MqPushResponse;
import segi.common.mq.push.client.Client._MQAcceptClientDisp;

/**
 * 接受服务端推送数据的客户端实现类
 *
 * @author tanjun
 */
public class AcceptPushClientImpl extends _MQAcceptClientDisp {
  private GlacierClient gc = null;
  private long tid;

  /**
   * 客户使用gc对象中的 获取当前连接状态,或者提交消息业务处理状态,两个方法
   *
   * @param glacierClient
   */
  public void setGlacierClient(GlacierClient glacierClient, long id) {
    this.gc = glacierClient;
    this.tid = id;
  }

  /** 接受服务端推送的数据 如果MqPushResponse的code返回非0那么久代表客户端不签收数据,mq消费者不会提交offset,下次会重新推送 */
  @Override
  public MqPushResponse accept(MqPushResponse response, Current __current) {
    MqPushResponse clientResponse = new MqPushResponse();
    try {
      System.out.println("客户端号:" + this.tid + "数据内容:" + response.getData());
      // 返回数据接收状态,收到了就返回0
      clientResponse.setCode("0");
      clientResponse.setMessage("收到了推送过来的数据,已处理");

      /*			// 客户加处理业务逻辑
      boolean flag=saveData(response.getData());
      if (flag) {
      	//返回数据接收状态,收到了就返回0
      	clientResponse.setCode("0");
      	clientResponse.setMessage("收到了推送过来的数据,已处理");
      } else {
      	clientResponse.setCode("1");
      	clientResponse.setMessage("业务处理失败，稍后重试");
      }*/

      /**
       * 一般不需要用这个： 客户想要把最终的处理结果推送给服务端(在服务端可以看到记录，报表查询等 )
       * 提交本条消息的业务最终处理结果,可以在任何一个能获取到GlacierClient对象的线程中提交都可以
       * gc.msgSubmit(response.getMsgid(),1,"业务系统成功处理了这条数据");
       */
    } catch (Throwable e) { // 自己的业务异常一定要自己处理,别抛到服务端,看异常情况来定是否返回code0 或 code1
      e.printStackTrace();
      String emsg = "接收推送数据,进行处理时发生异常" + e.getMessage();
      clientResponse.setCode("1");
      clientResponse.setMessage(emsg);
    }
    return clientResponse;
  }
}
