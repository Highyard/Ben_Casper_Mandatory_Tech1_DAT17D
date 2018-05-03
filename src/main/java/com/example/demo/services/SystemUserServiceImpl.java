package com.example.demo.services;


import com.example.demo.domains.SystemUser;

public interface SystemUserServiceImpl {

    SystemUser getUser(String username, String password);


}
