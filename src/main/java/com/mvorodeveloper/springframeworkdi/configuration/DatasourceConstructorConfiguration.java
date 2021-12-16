package com.mvorodeveloper.springframeworkdi.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("mdev")
public class DatasourceConstructorConfiguration {

    private String username;
    private String password;

    @Value("${mdev.jdbc.url}")
    private String jdbcUrl;

    public DatasourceConstructorConfiguration(String username, String password, String jdbcUrl) {
        this.username = username;
        this.password = password;
        this.jdbcUrl = jdbcUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }
}
