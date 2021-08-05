package com.sangeng.dao;

import com.sangeng.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao {

    List<User> findAll();

    User findById(Integer id);

    User findByUser(User user);

    User findByMap(Map map);

    List<User> findByCondition(@Param("id") Integer id, @Param("username") String username);

    void insertUser(User user);

    void deleteById(Integer id);

    void updateUser(User user);

    List<User> findByIds(@Param("ids") Integer[] ids);

    List<User> selectChoose(User user);
}
