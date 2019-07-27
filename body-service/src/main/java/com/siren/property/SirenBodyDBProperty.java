package com.siren.property;

import com.siren.properties.database.DBProperty;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/26
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.datasource.druid.body")
public class SirenBodyDBProperty extends DBProperty {
    private static final long serialVersionUID = 211980915092092866L;
}
