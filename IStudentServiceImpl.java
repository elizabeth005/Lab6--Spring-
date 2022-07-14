package spring.gl.SD_CRUD.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import spring.gl.SD_CRUD.entity.Student;
import spring.gl.SD_CRUD.repository.IStudentRepository;

@Service
@RequiredArgsConstructor
public class IStudentServiceImpl implements IStudentService {
	@Autowired
	private IStudentRepository studentRegistratonRepository;

	@Transactional
	public Student createStudent(Student student) {
		Student saveStudent = studentRegistratonRepository.save(student);
		return saveStudent;
	}

	public List<Student> getAllStudent() {
		return studentRegistratonRepository.findAll();
	}

	public Student getStudentById(Long studentIdL) {

		return studentRegistratonRepository.findById(studentIdL)
				.orElseThrow(() -> new IllegalArgumentException("No student found."));
	}

	@Transactional
	public void deleteStudent(Long studentIdL) {
		studentRegistratonRepository.deleteById(studentIdL);
	}

	@Transactional
	public Student updateStudent(Student student, long studentId) {
		return studentRegistratonRepository.save(student);
	}

}