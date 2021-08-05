package com.sangeng;


import com.sangeng.dao.UserDao;
import com.sangeng.dao.UserDao2;
import com.sangeng.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws IOException {
        //定义mybatis配置文件的路径
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取Sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取UserDao实现类对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //调用方法测试
        List<User> userList = userDao.findAll();
        for (User u : userList) {
            System.out.println(u);
        }
//        System.out.println();
//        User user = userDao.findByUser(new User(1, "UZI", 19, "sh"));
//        System.out.println(user);

//        Map map = new HashMap();
//        map.put("id",2);
//        map.put("username","PDD");
//        map.put("age",25);
//        map.put("address","sh");
//        userDao.findByMap(map);
//
//        User user2 = userDao.findByMap(map);
//        System.out.println(user2);

//        List<User> users = userDao.findByCondition(null, null);
//        System.out.println(users);

        //userDao.insertUser(new User(null, "ruofeng", 35, "sh"));

        //userDao.deleteById(4);

//        userDao.updateUser(new User(2, "pdd", null, null));
//
//        sqlSession.commit();
//        Integer[] ids = new Integer[]{1, 2, 3, 4, 5};
//        System.out.println(userDao.findByIds(ids));
        //System.out.println(userDao.selectChoose(new User(null, null, 20, null)));
        //释放资源
        sqlSession.close();

    }
}

