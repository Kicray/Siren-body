package com.siren.service.sys.generator;

/**
 * 代码生成器
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/8/12
 */
public interface SysGeneratorService {
    /**
     * 根据表名生成代码
     * @param tables
     * @return
     */
    byte[] generatorCode(String[] tables);
}
