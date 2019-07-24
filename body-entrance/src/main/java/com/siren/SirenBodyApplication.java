package com.siren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author: Aqr
 * @Desc:
 * @Date: 2019/7/24
 */
@SpringBootApplication
@EnableCaching
@EnableAsync
public class SirenBodyApplication {
    public static void main(String[] args) {
        SpringApplication.run(SirenBodyApplication.class, args);
    }
}
