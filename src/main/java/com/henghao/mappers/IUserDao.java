package com.henghao.mappers;

import com.henghao.domain.entity.user.UserPOJO;
import com.henghao.domain.entity.result.Result;
import com.henghao.domain.example.UserExample;
import com.henghao.vo.LoginVo;
import com.henghao.vo.user.UserUpdateVo;
import com.henghao.vo.user.UserVo;
import com.henghao.vo.user.UsrLongAndLatVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@SuppressWarnings("all")
@Mapper
public interface IUserDao {

    /*
     * 逆向生成工具自带 Start
     */
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserPOJO record);

    int insertSelective(UserPOJO record);

    List<UserPOJO> selectByExample(UserExample example);

    UserPOJO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserPOJO record, @Param("example") UserExample example);

    int updateByExample(@Param("record") UserPOJO record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(UserPOJO record);

    int updateByPrimaryKey(UserPOJO record);

    /*
     * 逆向生成工具自带 End
     */



    /*
     * 自定义 Start
     */

    /**
     * 查询通讯录列表
     * @return
     * @throws Exception
     */
    List<UserVo> findAllUserToApp() throws Exception;

    /**
     * APP端根据用户ID查询用户信息
     * @param uid 用户ID
     * @return
     */
    UserVo findByUidToApp(String uid);

    /**
     * APP端的登录验证
     * @param loginVo
     * @return
     */
    UserPOJO findUserToCheck(LoginVo loginVo);

    /**
     * 修改用户所属部门
     * @param updateVo {@link UserUpdateVo}
     */
    void updateUserDept(UserUpdateVo updateVo);

    /**
     * 保存用户头像到数据库
     * @param uid 用户ID
     * @param file_ture_name 文件名
     */
    void addImageInfo(String uid, String file_ture_name);

    /**
     * 查询用户历史经纬度集合
     *
     * @return {@link Result}
     * @update: update on 2017/12/4
     */
    List<UsrLongAndLatVo> selectUserTitudesDao();

    /*
     * 自定义 End
     */

}