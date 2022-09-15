package com.canbe.generator;

import com.baomidou.mybatisplus.generator.config.DataSourceConfig;

public interface MybatisPlusGenerator {

    String URL = "jdbc:mysql://127.0.0.1:3306/canbe_blog?characterEncoding=UTF-8&useUnicode=true&useSSL=false&tinyInt1isBit=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Shanghai";
    String USER_NAME = "root";
    String PASSWORD = "root";
    /**
     * 数据源配置
     */
     DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder(URL, USER_NAME, PASSWORD);
}
