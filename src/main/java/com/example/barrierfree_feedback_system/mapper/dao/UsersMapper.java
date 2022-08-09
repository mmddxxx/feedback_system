package com.example.barrierfree_feedback_system.mapper.dao;

import com.example.barrierfree_feedback_system.bean.Users;
import com.example.barrierfree_feedback_system.mapper.general.GeneralDAO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UsersMapper extends GeneralDAO<Users> {
}