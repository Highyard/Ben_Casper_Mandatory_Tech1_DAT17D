package com.example.demo.services;

import com.example.demo.domains.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.ArrayList;

@Service
public class SystemUserService implements SystemUserServiceImpl {

    public JdbcTemplate jdbc;

    @Autowired
    private DataSource datasource;


    @Override
    public SystemUser getUser(String username, String password) {




        SystemUser user = instantiateObject();
        SystemUser user2 = instantiateObject2();

        if (user2.getUserName().equalsIgnoreCase(username) && user2.getPassword().equalsIgnoreCase(password)){
            System.out.println("succes");
            return user2;
        }


        return null;
    }


    SystemUser instantiateObject() {
        return new SystemUser( "user", "test", "user");
    }

    SystemUser instantiateObject2() {
        return new SystemUser( "admin", "123", "admin");
    }


//     public ArrayList<SystemUser> fillList() {
//        ArrayList<SystemUser> users = new ArrayList<>();
//        SqlRowSet rs = jdbc.queryForRowSet("SELECT * FROM loginuser");
//
//        while (rs.next()){
//            users.add(new SystemUser(rs.getString("Username"), rs.getString("Password"), rs.getString("role")));
//        }
//
//
//        return users;
//    }



}
