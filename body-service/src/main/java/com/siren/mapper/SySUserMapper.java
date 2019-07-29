package com.siren.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.siren.pojo.user.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/27
 */
public interface SySUserMapper extends BaseMapper<SysUser> {

    @Select("select " +
            "  su.id, " +
            "  su.password, " +
            "  su.user_name as userName, " +
            "  su.user_nickname as userNickname, " +
            "  su.create_date as createDate, " +
            "  su.status, " +
            "  su.phone " +
            "from " +
            "  sys_user su " +
            "where " +
            "  id = #{id}")
    SysUser getById(@Param("id") String id);
}
