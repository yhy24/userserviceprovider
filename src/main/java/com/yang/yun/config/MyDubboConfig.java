package com.yang.yun.config;

import com.alibaba.dubbo.config.ApplicationConfig;

/**
 * @Author: yhy
 * @Date: 2018/8/30 17:01
 * @Version 1.0
 */
public class MyDubboConfig {

    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("userserviceprovider");
        return applicationConfig;
    }
}
