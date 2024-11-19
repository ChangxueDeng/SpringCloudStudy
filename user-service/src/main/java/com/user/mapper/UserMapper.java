package com.user.mapper;

import entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from db_user where uid= #{uid}")
    User getUserById(int uid);
}
