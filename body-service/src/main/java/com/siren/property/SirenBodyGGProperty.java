package com.siren.property;

import com.siren.properties.generator.GlobalGeneratorProperty;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/8/12
 */
@Data
@Component
//@ConfigurationProperties(prefix = "siren.generator.globalgenerator")
public class SirenBodyGGProperty extends GlobalGeneratorProperty {
    private static final long serialVersionUID = -3311371203756709805L;
}
