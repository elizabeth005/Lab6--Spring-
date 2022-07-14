package spring.gl.SD_CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.gl.SD_CRUD.entity.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

}