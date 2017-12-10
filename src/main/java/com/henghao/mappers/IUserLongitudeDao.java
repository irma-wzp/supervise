package com.henghao.mappers;

import com.henghao.domain.entity.user.UserLongitude;
import com.henghao.domain.example.UserLongitudeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserLongitudeDao {
    int countByExample(UserLongitudeExample example);

    int deleteByExample(UserLongitudeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserLongitude record);

    int insertSelective(UserLongitude record);

    List<UserLongitude> selectByExample(UserLongitudeExample example);

    UserLongitude selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserLongitude record, @Param("example") UserLongitudeExample example);

    int updateByExample(@Param("record") UserLongitude record, @Param("example") UserLongitudeExample example);

    int updateByPrimaryKeySelective(UserLongitude record);

    int updateByPrimaryKey(UserLongitude record);
}