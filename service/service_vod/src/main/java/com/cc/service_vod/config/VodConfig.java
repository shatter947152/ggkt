package com.cc.service_vod.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.cc.service_vod.mapper")
public class VodConfig {
}
