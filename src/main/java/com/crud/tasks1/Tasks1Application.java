package com.crud.tasks1;

import com.crud.tasks1.domain.TaskDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tasks1Application {

	public static void main(String[] args) {


	/*TaskDto taskDto = new TaskDto(
			(long)1,
			"Test title",
			"I want to be a coder"
	);
	Long id = taskDto.getId();
	String title = taskDto.getTitle();
	String content = taskDto.getContent();
	System.out.println(id +  " " + title + " " + content);*/
		SpringApplication.run(Tasks1Application.class, args);
	}
}
