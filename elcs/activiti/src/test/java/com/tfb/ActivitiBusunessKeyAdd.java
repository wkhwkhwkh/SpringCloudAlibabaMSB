package com.tfb;

import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;

import java.util.UUID;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class ActivitiBusunessKeyAdd {

    /**
     * 关联业务主键,启动流程实例同时还要指定业务标识businessKey  本身就是业务主键
     */
    @Test
    public void busunessKeyAdd(){
        //获取RuntimeService对象
        RuntimeService runtimeService = ProcessEngines.getDefaultProcessEngine().getRuntimeService();
        //启动流程实例
        ProcessInstance instance = runtimeService.startProcessInstanceByKey("evetion", UUID.randomUUID().toString());

        System.out.println(instance.getBusinessKey());
    }
}
