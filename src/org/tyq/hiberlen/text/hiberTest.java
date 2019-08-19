package org.tyq.hiberlen.text;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.tyq.hiberlen.model.Users;



public class hiberTest {
    public static void main(String[] args){
        //创建对象
//        Users users = new Users(1,"田宇琦","ttyqui","756683214@qqq.com");
//        Users users1 = new Users();
//        users1.setuId(1);
//
//        users1.setuEmali("756683214@qq.com");
        //获取配置管理类
        Configuration configuration = new Configuration();
        //不给参数就默认加载hibernate.cfg.xml文件
        configuration.configure("resources/hibernate.cfg.xml");
        //创建SessionFactory工厂
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //得到session对象
        Session session = sessionFactory.openSession();
        //使用hibernate操作数据库，都要开启事物，得到事物对象
        Transaction transaction = session.getTransaction();
        //开启事物
        transaction.begin();
        //把对象添加到数据库中
//        session.save(users);
//        session.update(users);
        Users users1 = session.get(Users.class,1);
        System.out.println(users1);
        //提交事物
        transaction.commit();
        //关闭session
        session.close();


    }
}
