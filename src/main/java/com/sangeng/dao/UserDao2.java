package com.sangeng.dao;

import com.sangeng.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao2 {

    List<User> findAll();


}
