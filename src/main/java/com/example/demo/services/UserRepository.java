package com.example.demo.services;

        import com.example.demo.domains.UserDB;
        import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDB,String> {

}
