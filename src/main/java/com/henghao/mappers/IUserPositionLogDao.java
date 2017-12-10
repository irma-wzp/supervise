package com.henghao.mappers;

import com.henghao.domain.entity.user.UserPositionLog;
import com.henghao.domain.example.UserPositionLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserPositionLogDao {
    int countByExample(UserPositionLogExample example);

    int deleteByExample(UserPositionLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserPositionLog record);

    int insertSelective(UserPositionLog record);

    List<UserPositionLog> selectByExample(UserPositionLogExample example);

    UserPositionLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserPositionLog record, @Param("example") UserPositionLogExample example);

    int updateByExample(@Param("record") UserPositionLog record, @Param("example") UserPositionLogExample example);

    int updateByPrimaryKeySelective(UserPositionLog record);

    int updateByPrimaryKey(UserPositionLog record);
}