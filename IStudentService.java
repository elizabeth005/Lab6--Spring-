package spring.gl.SD_CRUD.service;

import java.util.List;

import spring.gl.SD_CRUD.entity.Student;

public interface IStudentService {

	public Student createStudent(Student student);

	public List<Student> getAllStudent();

	public Student getStudentById(Long studentIdL);

	public void deleteStudent(Long studentIdL);

	public Student updateStudent(Student student, long studentId);
}