package com.jinhaoxun.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jinhaoxun.common.pojo.Test;
import org.apache.ibatis.annotations.Param;

/**
 * @version 1.0
 * @author jinhaoxun
 * @date 2018-05-09
 * @description 用户Mapper接口
 */
public interface TestMapper extends BaseMapper<Test> {

    /**
     * @author jinhaoxun
     * @description 获得id
     * @param phone 手机号
     * @return ResponseResult 用户id
     */
    Long selectIdByPhone(String phone);

    /**
     * @author jinhaoxun
     * @description 获得密码
     * @param userId 用户ID
     * @return ResponseResult 用户密码
     */
    String selectPassword(Long userId);

    /**
     * @author jinhaoxun
     * @description 获得封禁状态
     * @param userId 用户ID
     * @return ResponseResult 用户封禁状态
     */
    Boolean selectBan(Long userId);

    /**
     * @author jinhaoxun
     * @description 获得账号状态
     * @param userId 用户ID
     * @return ResponseResult 账号状态
     */
    Boolean selectStatus(Long userId);

    /**
     * @author jinhaoxun
     * @description 获得姓名
     * @param userId 用户ID
     * @return ResponseResult 用户姓名
     */
    String selectName(Long userId);

    /**
     * @author jinhaoxun
     * @description 用户注销
     * @param userId 用户ID
     * @return ResponseResult 注销成功条数
     */
    int updateStatus(Long userId);

    /**
     * @author jinhaoxun
     * @description 更新密码
     * @param userId 用户ID
     * @return ResponseResult 更新成功条数
     */
    int updatePassword(@Param("userId") Long userId,@Param("password") String password);

    /**
     * @author jinhaoxun
     * @description 更新封禁/解封状态
     * @param userId 用户ID
     * @return ResponseResult 封禁成功条数
     */
    int updateBan(@Param("userId") Long userId,@Param("ban") Boolean ban);

}
