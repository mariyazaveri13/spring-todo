package com.example.todo.todos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo(1, "mariya", "Learn stuff online", LocalDate.now().plusDays(34), false));
		todos.add(new Todo(2, "mariya", "Learn stuff offline", LocalDate.now().plusDays(23), false));
		todos.add(new Todo(3, "mariya", "Learn something", LocalDate.now().plusDays(45), false));
		todos.add(new Todo(4, "burhanuddin", "Learn cooking", LocalDate.now().plusDays(3), false));
	}
	
	public List<Todo> findByUsername(String username) {
		return todos;
	}
	
}
