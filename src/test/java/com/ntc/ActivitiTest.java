package com.ntc;


import org.junit.Test;

/**
 * Created by ChenFei on 2018/8/3.
 */
public class ActivitiTest{
    
    @Test
    public  void activitiTest(){

//        // 1. 获取流程引擎配置
//        ProcessEngineConfiguration config = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("/config/activiti.cfg.xml");
//
//        // 2. 创建流程引擎
//        ProcessEngine engine = config.buildProcessEngine();
//
//        // 3. 获取RepositoryService
//        RepositoryService repositoryService = engine.getRepositoryService();
//
//        // 4. 部署流程图
//        repositoryService.createDeployment().addClasspathResource("processes/HelloWorld.bpmn20.xml").deploy();
//
//        // 5. 获取运行时服务RuntimeService
//        RuntimeService runtimeService = engine.getRuntimeService();
//
//        // 6. 获取流程实例
//        String processDefinitonKey = "myProcess_1";
//        ProcessInstance instance =  runtimeService.startProcessInstanceByKey(processDefinitonKey);
//
//        // 7. 获取TaskService
//        TaskService taskService = engine.getTaskService();
//
//        // 8. 根据流程实例id查询Task
//        Task task = null;
//        task = taskService.createTaskQuery().processInstanceId(instance.getId()).singleResult();
//
//        while(task != null){
//            // 9. 打印当前流程节点
//            System.out.println("当前流程节点： " + task.getName());
//
//            // 10. 完成当前任务节点
//            taskService.complete(task.getId());
//
//            // 11. 根据流程实例id查询Task
//            task = taskService.createTaskQuery().processInstanceId(instance.getId()).singleResult();
//        }
//
//        // 12. 打印当前流程节点
//        System.out.println("流程结束： " + task);
//
//        engine.close();
    }
}
