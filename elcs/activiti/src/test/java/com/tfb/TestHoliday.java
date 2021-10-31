package com.tfb;

import com.pojo.Holiday;
import org.activiti.engine.*;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class TestHoliday {

    @Test
    public void deployment() throws Exception{
        RepositoryService repositoryService  = ProcessEngines.getDefaultProcessEngine().getRepositoryService();
        InputStream io = new FileInputStream("E:\\project\\elcs\\activiti\\src\\main\\resources\\bpmn\\holiday.bpmn");
        Deployment deployment = repositoryService.createDeployment().name("请假").addInputStream("holiday.bpmn",io).deploy();
        System.out.println(deployment.getName()+"====="+deployment.getKey()+"======"+ deployment.getId());
    }

    /**
     * 启动流程实例是设置global变量
     */
    @Test
    public void instance(){
        RuntimeService runtimeService = ProcessEngines.getDefaultProcessEngine().getRuntimeService();

        Map map = new HashMap();
        map.put("assignee1","AAA");
        map.put("assignee2","BBB");
        map.put("assignee3","CCC");
        map.put("assignee4","DDD");
        Holiday holiday = new Holiday();
        holiday.setNum(5);
        map.put("holiday",holiday);
        //启动流程
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("holiday",map);
        System.out.println(processInstance.getName()+"==="+processInstance.getProcessInstanceId());
    }

    /**
     * 使用流程实例id设置global变量
     */
    @Test
    public void instance2(){
        RuntimeService runtimeService = ProcessEngines.getDefaultProcessEngine().getRuntimeService();

        Map map = new HashMap();
        map.put("assignee1","AAA");
        map.put("assignee2","BBB");
        map.put("assignee3","CCC");
        map.put("assignee4","DDD");
        Holiday holiday = new Holiday();
        holiday.setNum(5);
        map.put("holiday",holiday);
        //启动流程
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("holiday",map);
        //runtimeService.setVariable("流程实例id","holiday",holiday);单个变量
        runtimeService.setVariables("流程实例id",map);//多个变量
        System.out.println(processInstance.getName()+"==="+processInstance.getProcessInstanceId());
    }

    /**
     * 删除已经部署的流程定义
     * delete from ACT_RE_DEPLOYMENT 流程部署信息表;
     * ACT_RE_PROCDEF 流程定义数据表;
     * ACT_GE_BYTEARRAY 二进制数据表;
     */
    @Test
    public void deleteProcessDefinition() {
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        //获取RepositoryService
        RepositoryService repositoryService = engine.getRepositoryService();
        //执行删除流程定义  参数代表流程部署的id
        repositoryService.deleteDeployment("82501", true);
    }

    @Test
    public void activitiComplete(){
        TaskService taskService = ProcessEngines.getDefaultProcessEngine().getTaskService();

        taskService.complete("60002");
    }

    /**
     * 办理任务时设置global变量
     */
    @Test
    public void testComplete2(){
        TaskService taskService = ProcessEngines.getDefaultProcessEngine().getTaskService();
        Map map = new HashMap();
        Holiday holiday = new Holiday();
        holiday.setNum(2);
        map.put("holiday",holiday);
        taskService.complete("任务id",map);
    }

    /**
     * 使用任务id设置global变量
     */
    @Test
    public void testComplete3(){
        TaskService taskService = ProcessEngines.getDefaultProcessEngine().getTaskService();
        Map map = new HashMap();
        Holiday holiday = new Holiday();
        holiday.setNum(2);
        map.put("holiday",holiday);
        taskService.complete("任务id",map);
        //taskService.setVariable("任务id","holiday",holiday);单个变量
        taskService.setVariables("任务id",map);//多个变量
        //taskService.setVariablesLocal(); local变量
    }


}
