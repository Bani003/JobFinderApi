package com.example.JobFinderApi.Repository;

import com.example.JobFinderApi.Pojo.Entity.User;
import com.example.JobFinderApi.Pojo.Entity.Work;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findUserById(Integer id);
}
