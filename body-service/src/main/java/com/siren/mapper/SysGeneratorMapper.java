package com.siren.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器 - 相关mapper
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/8/12
 */
public interface SysGeneratorMapper extends BaseMapper {

    @Select("select "+
             "table_name tableName,"+
             "engine," +
             "table_comment tableComment," +
             "create_time createTime " +
             "from information_schema.tables " +
             "where table_schema = (select database()) and table_name = #{tableName}")
    Map<String,String> getTables(@Param("tableName") String tableName);

    @Select("select " +
            " column_name columnName," +
            " data_type dataType," +
            " column_comment columnComment," +
            " column_key columnKey," +
            " extra " +
            "from information_schema.columns " +
            "where table_name = #{tableName} and table_schema = (select database()) order by ordinal_position")
    List<Map<String,String>> getColumns(@Param("tableName") String tableName);
}
