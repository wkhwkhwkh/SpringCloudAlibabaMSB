package com.utan.com.tfb;

import com.utan.mapper.UserMapper1;
import com.utan.mapper.UserMapper2;
import com.utan.pojo.User1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RptDataKNew {

    Logger logger = Logger.getLogger(RptDataKNew.class);

    private SqlSessionFactory sqlSessionFactory;

    private SqlSession session;

    private static ExecutorService executor;

    private static int i;
    public void target() throws Exception{
        a();
        b();
        c();
        d();
    }

    public void a() throws Exception{
        get();
        String resources = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resources);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession();
        UserMapper1 userMapper = session.getMapper(UserMapper1.class);
        UserMapper2 userMapper2 = session.getMapper(UserMapper2.class);
        List<User1> list = userMapper.query();
       // List list1 = new ArrayList();
       // for(int i = 0; i < list.size(); i++){
           // if(i != 0 && i % 999 == 0){
                runthread(list,userMapper2);
              //  list1 = new ArrayList();
           // }
          //  list1.add(list.get(i));

        //}
        executor.shutdown();
    }

    public void b(){

    }


    public void c(){

    }

    public void d(){

    }

    public void runthread(List list, UserMapper2 userMapper2){
        TaskPro taskPro = new TaskPro(list,userMapper2);
        executor.execute(taskPro);
    }


    class TaskPro implements Runnable{

        private UserMapper2 userMapper2;

        private List list;
    
        public TaskPro(List list,UserMapper2 userMapper2) {
            this.userMapper2 = userMapper2;
            this.list = list;
        }

        @Override
        public void run() {
            handle(list);
        }

        public void handle(List list){
            for(int j = 0; j < list.size(); j++){
                System.out.println("============================"+Thread.currentThread().getName() + "抽数");
                userMapper2.add((User1) list.get(j));
                session.commit();
            }
            System.out.println("''''''");
        }
    }

    @Test
    public void runT() throws Exception{
        new RptDataKNew().target();
    }

    public static void get(){
        executor = Executors.newFixedThreadPool(5);
    }
}
