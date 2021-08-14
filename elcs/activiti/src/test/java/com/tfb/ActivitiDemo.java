package com.tfb;


import org.activiti.engine.*;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricActivityInstanceQuery;
import org.activiti.engine.impl.event.logger.handler.ProcessInstanceEndedEventHandler;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.repository.ProcessDefinitionQuery;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceQuery;
import org.activiti.engine.task.Task;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.*;
import java.util.List;
import java.util.zip.ZipInputStream;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class ActivitiDemo {

    @Test
    public void testDeployment() throws Exception {
        //创建ProcessEngine
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        //获取RepositoryService
        RepositoryService repositoryService = engine.getRepositoryService();
        File file = new File("D:\\project\\elcs\\activiti\\src\\main\\resources\\bpmn\\chuchai.bpmn");
        InputStream is = new FileInputStream(file);
        //使用service进行流程部署，定义流程名称,添加bpmn文件
        Deployment deployment = repositoryService.createDeployment()
                .name("出差申请")
                .addInputStream("chuchai.bpmn", is)
                .deploy();
        //输出部署信息
        System.out.println("流程部署id=" + deployment.getId());
        System.out.println("流程部署名字=" + deployment.getName());
    }


    /**
     * 启动流程实例
     */
    @Test
    public void testProcess() {
        //创建ProcessEngine
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        //获取RuntimeService
        RuntimeService runtimeService = engine.getRuntimeService();
        //根据流程key启动流程
        ProcessInstance instance = runtimeService.startProcessInstanceByKey("evetion");

        System.out.println("流程定义id:" + instance.getProcessDefinitionId());
        System.out.println("流程实例id:" + instance.getId());
        System.out.println("当前活动id:" + instance.getActivityId());
    }

    /**
     * 查询个人待执行的任务
     */
    @Test
    public void queryPersonalTaskList() {
        //创建ProcessEngine
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        //获取taskService
        TaskService taskService = engine.getTaskService();
        //根据流程key和任务的负责人查询任务
        List<Task> list = taskService.createTaskQuery()
                .processDefinitionKey("evetion") //流程key
                .taskAssignee("wengkeh")  //要查询的负责人
                .list();
        //输出
        for (Task task : list) {
            System.out.println("流程实例id:" + task.getProcessInstanceId());
            System.out.println("任务id:" + task.getId());
            System.out.println("任务负责人:" + task.getAssignee());
            System.out.println("任务名称:" + task.getName());
        }
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
        repositoryService.deleteDeployment("32501", true);
    }

    /**
     * 完成任务
     */
    @Test
    public void taskComplete() {
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();

        TaskService task = engine.getTaskService();

        //完成任务
        task.complete("50002");
    }

    /**
     * 压缩包部署
     */
    @Test
    public void zipDeployment() {
        InputStream inputStream = this
                .getClass()
                .getClassLoader()
                .getResourceAsStream("路径");
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ProcessEngines
                .getDefaultProcessEngine()
                .getRepositoryService()
                .createDeployment()
                .addZipInputStream(zipInputStream);
    }

    /**
     * 流程定义查询
     */
    @Test
    public void queryProcessDefinition() {
        RepositoryService repositoryService = ProcessEngines.getDefaultProcessEngine().getRepositoryService();
        ProcessDefinitionQuery processDefinitionQuery = repositoryService.createProcessDefinitionQuery();
        List<ProcessDefinition> list = processDefinitionQuery.processDefinitionKey("evetion").list();
        //ProcessDefinition processDefinition = processDefinitionQuery.processDefinitionKey("evetion").singleResult();返回一个实例
        for (ProcessDefinition processDefinition : list) {
            System.out.println("流程定义id:" + processDefinition.getId());
            System.out.println("流程定义名称:" + processDefinition.getName());
            System.out.println("流程定义key:" + processDefinition.getKey());
            System.out.println("流程定义版本号:" + processDefinition.getVersion());
        }
    }

    /**
     * 流程定义资源文件保存
     */
    @Test
    public void ResourcesSave() throws IOException {
        ProcessDefinitionQuery processDefinitionQuery = ProcessEngines
                .getDefaultProcessEngine()
                .getRepositoryService()
                .createProcessDefinitionQuery();
        //processDefinitionQuery.processDefinitionKey("evetion").list();
        //得到流程定义信息
        ProcessDefinition processDefinition = processDefinitionQuery.singleResult();

        //得到部署id
        String id = processDefinition.getDeploymentId();

        //获取图片文件转换成流
        //InputStream is = ProcessEngines.getDefaultProcessEngine().getRepositoryService().getResourceAsStream(id,processDefinition.getDiagramResourceName());
        //获取bpmn文件传换成流
        InputStream is = ProcessEngines.getDefaultProcessEngine().getRepositoryService().getResourceAsStream(id, processDefinition.getResourceName());
        OutputStream os = new FileOutputStream("输出文件路径" + processDefinition.getResourceName());
        IOUtils.copy(is, os);
        os.close();
        is.close();
    }

    /**
     * 流程历史信息查询
     */
    @Test
    public void history() {
        HistoryService historyService = ProcessEngines.getDefaultProcessEngine().getHistoryService();
        HistoricActivityInstanceQuery historicActivityInstanceQuery = historyService.createHistoricActivityInstanceQuery();
        historicActivityInstanceQuery.processInstanceId("42501");//设置查询条件 根据流程定义id
        for (HistoricActivityInstance historicActivityInstance : historicActivityInstanceQuery.orderByHistoricActivityInstanceStartTime().asc().list()) {
            System.out.println(historicActivityInstance.getActivityId());
            System.out.println(historicActivityInstance.getActivityName());
            System.out.println(historicActivityInstance.getProcessInstanceId());
            System.out.println(historicActivityInstance.getProcessDefinitionId());
            System.out.println("============");
        }
    }

    /**
     * 暂停流程实例
     */
    @Test
    public void activiAndSuspend() {
        RepositoryService repositoryService = ProcessEngines.getDefaultProcessEngine().getRepositoryService();
        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionKey("evetion").singleResult();
        //判断是否暂停状态
        Boolean flag = processDefinition.isSuspended();
        if (flag) {
            //激活
            repositoryService.activateProcessDefinitionById(processDefinition.getId(), true, null);
            System.out.println("流程定义:" + processDefinition.getId() + "激活");
        } else {
            //挂起
            repositoryService.suspendProcessDefinitionById(processDefinition.getId(), true, null);
            System.out.println("流程定义:" + processDefinition.getId() + "挂起");
        }
    }

    /**
     * 单个流程实例挂起
     */
    @Test
    public void suspendOrActiviProcessInstance() {
        RuntimeService runtimeService = ProcessEngines.getDefaultProcessEngine().getRuntimeService();
        //获取流程定义  根据id获取流程实例
        ProcessInstance instance = runtimeService.createProcessInstanceQuery().processInstanceId("").singleResult();
        //判断
        boolean suspended = instance.isSuspended();
        if(suspended){
            runtimeService.activateProcessInstanceById(instance.getProcessInstanceId());
            System.out.println("流程实例:" + instance.getProcessInstanceId() + "激活");
        }else{
            runtimeService.suspendProcessInstanceById(instance.getProcessInstanceId());
            System.out.println("流程实例:" + instance.getProcessInstanceId() + "挂起");
        }

    }
}
