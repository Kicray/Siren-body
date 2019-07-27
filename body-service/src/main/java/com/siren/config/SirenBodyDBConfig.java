package com.siren.config;

import com.siren.properties.database.DBProperty;
import com.siren.property.SirenBodyDBProperty;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/27
 */
@Component
@Configuration
@MapperScan(basePackages = {"com.siren.**.mapper"},sqlSessionTemplateRef = "bodySqlSessionTemplate")
public class SirenBodyDBConfig extends SirenDBConfig {
    private static final long serialVersionUID = -949340535708845012L;

    @Resource
    private SirenBodyDBProperty property;

    @Primary
    @Bean(name = "bodyDataSource",initMethod="init", destroyMethod="close")
    protected DataSource dataSource() {
        return super.dataSource(property);
    }

    @Primary
    @Bean(name = "bodySqlSessionFactory")
    protected SqlSessionFactory sqlSessionFactory(@Qualifier("bodyDataSource") DataSource dataSource)
            throws Exception {
        return super.sqlSessionFactory(dataSource, property.getMapperLocations());
    }

    @Primary
    @Bean(name = "bodySqlSessionTemplate")
    protected SqlSessionTemplate sqlSessionTemplate(@Qualifier("bodySqlSessionFactory")SqlSessionFactory sqlSessionFactory) {
        return super.sqlSessionTemplate(sqlSessionFactory);
    }
}
