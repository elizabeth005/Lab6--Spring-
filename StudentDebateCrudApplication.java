package spring.gl.SD_CRUD;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentDebateCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentDebateCrudApplication.class, args);
		System.out.println("hello spring boot");

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}