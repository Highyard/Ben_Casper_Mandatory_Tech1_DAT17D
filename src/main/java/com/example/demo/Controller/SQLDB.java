package com.example.demo.Controller;

import ch.qos.logback.core.db.DriverManagerConnectionSource;
import com.example.demo.domains.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


@Configuration
public class SQLDB extends WebMvcConfigurerAdapter {



//    @Bean(name = "dataSource")
//    public DriverManagerDataSource dataSource()  {
//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        driverManagerDataSource.setUrl("jdbc:mysql://localhost/userdbprojekt?useSSL=false");
//        driverManagerDataSource.setUsername("root");
//        driverManagerDataSource.setPassword("TherootestpassworD1");
//        return driverManagerDataSource;
//    }


}
