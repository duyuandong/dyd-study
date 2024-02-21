package com.dyd.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：com.segi.uhomecp.charge.model.ParkingMainDataPushMsgBodyDto
 * @date ：Created in 2022/8/12 15:05
 * @description：
 * @modified By：
 * @version:
 */
public class ParkingMainDataPushMsgBodyDto implements Serializable {
    private String baseCode; //系统编码

    private String dataArea; //分区编码

    private String changeType; //新增时changeType传1 ， 修改删除changeType传2

    private String changeID; //主键值

    private List<ParkingPushMsgDto> data;

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getDataArea() {
        return dataArea;
    }

    public void setDataArea(String dataArea) {
        this.dataArea = dataArea;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getChangeID() {
        return changeID;
    }

    public void setChangeID(String changeID) {
        this.changeID = changeID;
    }

    public List<ParkingPushMsgDto> getData() {
        return data;
    }

    public void setData(List<ParkingPushMsgDto> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PatrolTaskPushMsgBodyDto{" +
                "baseCode='" + baseCode + '\'' +
                ", dataArea='" + dataArea + '\'' +
                ", changeType='" + changeType + '\'' +
                ", changeID='" + changeID + '\'' +
                ", data=" + data +
                '}';
    }
}
