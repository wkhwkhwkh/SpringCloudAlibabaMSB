package com.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class Holiday implements Serializable {
    //序列化
    private static final long serialVersionUID = -3549019967563167693L;

    private int id;
    private String name;//申请人名称
    private Date startData;
    private Date endDate;
    private int num;//天数
    private String reason;//请假原因
    private String type;//请假类型
}
