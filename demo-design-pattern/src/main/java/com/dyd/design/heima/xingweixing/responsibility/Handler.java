package com.dyd.design.heima.xingweixing.responsibility;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.xingweixing.chain_of_responsibility.Handler
 * @date ：Created in 2024/1/22 15:58
 * @description：抽象处理者角色
 * @modified By：
 * @version:
 */
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    //请假天数区间
    private int numStart;
    private int numEnd;
    //声明后继者
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }
    //设置上级领导对象
    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
    //提交请假条
    public final void submit(LeaveRequest leaveRequest){
        //该领导进行审批
        handlerLeave(leaveRequest);
        if(this.nextHandler != null && leaveRequest.getNum() > this.numEnd){
            this.nextHandler.submit(leaveRequest);
        }else{
            System.out.println("流程结束!");
        }
    }
    //各级领导处理请假条
    public abstract void handlerLeave(LeaveRequest leave);
}
