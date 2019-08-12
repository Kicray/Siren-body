package com.siren.service.sys.generator.impl;

import com.siren.mapper.SysGeneratorMapper;
import com.siren.service.sys.generator.SysGeneratorService;
import com.siren.utils.GenUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/8/12
 */
@Service
public class SysGeneratorSericeImpl implements SysGeneratorService {

    @Resource
    private SysGeneratorMapper sysGeneratorMapper;

    @Override
    public byte[] generatorCode(String[] tables) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ZipOutputStream zip = new ZipOutputStream(outputStream);

        for(String tableName : tables){
            //查询表信息
            Map<String, String> table = sysGeneratorMapper.getTables(tableName);
            //查询列信息
            List<Map<String, String>> columns = sysGeneratorMapper.getColumns(tableName);
            //生成代码
            GenUtils.generatorCode(table, columns, zip);
        }
        IOUtils.closeQuietly(zip);
        return outputStream.toByteArray();
    }
}
