package com.hejj.dao;

import com.hejj.pojo.AdminOperation;

public interface AdminOperationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminOperation record);

    int insertSelective(AdminOperation record);

    AdminOperation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminOperation record);

    int updateByPrimaryKey(AdminOperation record);
}
