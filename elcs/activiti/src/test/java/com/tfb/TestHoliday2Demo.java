package com.tfb;

import com.pojo.Holiday;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class TestHoliday2Demo {
    @Test
    public void deployment() throws Exception{
        RepositoryService repositoryService = ProcessEngines.getDefaultProcessEngine().getRepositoryService();
        InputStream in = new FileInputStream("E:\\project\\elcs\\activiti\\src\\main\\resources\\bpmn\\holiday2.bpmn");
        repositoryService.createDeployment().addInputStream("holiday2.bpmn",in).deploy();
    }

    @Test
    public void definition(){
        RuntimeService runtimeService = ProcessEngines.getDefaultProcessEngine().getRuntimeService();
        Map map = new HashMap();
        map.put("assignee1","AAA");
        map.put("assignee3","CCC");
        map.put("assignee4","DDD");
        Holiday holiday = new Holiday();
        holiday.setNum(5);
        map.put("holiday",holiday);
        runtimeService.startProcessInstanceByKey("holiday2",map);
    }

    @Test
    public void complete(){
        TaskService taskService = ProcessEngines.getDefaultProcessEngine().getTaskService();
        taskService.complete("95002");
    }

    @Test
    public void groupTask(){
        TaskService taskService = ProcessEngines.getDefaultProcessEngine().getTaskService();
        Task task = taskService.createTaskQuery().processDefinitionKey("holiday2").taskCandidateUser("ly").singleResult();
        if(task != null){
            System.out.println(task.getId());
            taskService.claim(task.getId(),"ly");//拾取组任务，成为个人任务
            taskService.complete("95002");//拾取后办理任务
            //taskService.setAssignee("负责人",null);  归还组任务
        }
    }


}
