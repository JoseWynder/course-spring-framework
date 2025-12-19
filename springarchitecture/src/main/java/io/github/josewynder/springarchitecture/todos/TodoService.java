package io.github.josewynder.springarchitecture.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public TodoEntity save(TodoEntity newTodo) {
        return todoRepository.save(newTodo);
    }
}
