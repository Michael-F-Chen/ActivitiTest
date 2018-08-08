package com.ntc;

import org.junit.Test;

import java.sql.*;

/**
 * Created by ChenFei on 2018/8/1.
 * H2数据库测试类
 */
public class H2DBTest{

    @Test
    public  void testH2(){
        try {
            // 1.加载驱动
            Class.forName("org.h2.Driver");
            // 2.获取数据库连接
            Connection conn =  DriverManager.getConnection("jdbc:h2:mem:activiti","ntc","");
            // 3.创建表
            Statement stt = conn.createStatement();
            String sql = "create table person(id int auto_increment primary key, name varchar(200));"
                        + " insert into person(name) values('ntc')";
            // 4.执行sql
            stt.execute(sql);

            // 5.查找
            PreparedStatement ps =  conn.prepareStatement("select * from person");
            ResultSet rs = ps.executeQuery();

            // 6.打印结果
            while (rs.next()){
                System.out.print("id: " + rs.getInt(1) + " name: " + rs.getString(2));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
