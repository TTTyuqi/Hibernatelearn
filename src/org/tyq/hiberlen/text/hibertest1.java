package org.tyq.hiberlen.text;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.tyq.hiberlen.model.userAddr;
import org.hibernate.cfg.Configuration;


public class hibertest1 {
    public static void main(String[] args){
        //创建对象
//        userAddr usaddr = new userAddr();
//        usaddr.setUaName("刘江峰");
//        usaddr.setUaQQnum("756683214");
//        usaddr.getUaAddress().add("武汉市江汉区财富中心");
//        usaddr.getUaAddress().add("湖北省潜江市江汉油田广华办事处");

        //获取配置管理类
        Configuration configuration = new Configuration();
        //加载hibernate.cfg.xml文件
        configuration.configure("resources/hibernate.cfg.xml");
        //创建SessionFactory工厂
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //得到session对象
        Session session = sessionFactory.openSession();
        //使用hibernate操作数据库，都要开启事物,得到事物
        Transaction transaction = session.getTransaction();
        //开启事物
        transaction.begin();
        //把数据添加到数据库中
//        session.save(usaddr);
        userAddr usaddr = session.get(userAddr.class,1);
        System.out.println(usaddr);
        //提交事物
        transaction.commit();
        //关闭session
        session.close();

    }
}
