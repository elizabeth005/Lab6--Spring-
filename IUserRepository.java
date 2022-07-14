package com.pring.gl.SD_CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.gl.SD_CRUD.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

}
