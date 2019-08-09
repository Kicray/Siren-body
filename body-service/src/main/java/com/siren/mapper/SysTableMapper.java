package com.siren.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/8/1
 */
public interface SysTableMapper extends BaseMapper<Object> {

    @Select("SELECT NAME FROM SYSOBJECTS WHERE XTYPE='U' ")
    List<String> getTables();
}
