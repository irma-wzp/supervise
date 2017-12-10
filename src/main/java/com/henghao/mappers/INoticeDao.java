package com.henghao.mappers;

import com.henghao.domain.entity.Notice;
import com.henghao.domain.example.UserNoticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface INoticeDao {
    int countByExample(UserNoticeExample example);

    int deleteByExample(UserNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Notice record);

    int insertSelective(Notice record);

    List<Notice> selectByExample(UserNoticeExample example);

    Notice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Notice record, @Param("example") UserNoticeExample example);

    int updateByExample(@Param("record") Notice record, @Param("example") UserNoticeExample example);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
}