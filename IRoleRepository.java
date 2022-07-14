package spring.gl.SD_CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.gl.SD_CRUD.entity.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {

}