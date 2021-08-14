package com.tfb;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.junit.Test;

/**
 * 生成25张表
 */
public class ActivitiTest {

    @Test
    public void function(){
        //工具类创建 ProcessEngines,使用方法getDefaultProcessEngine会默认从resources下读取
        //名字为activiti.cfg.xml
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        RepositoryService repositoryService = engine.getRepositoryService();

        System.out.println(engine);
    }

}
