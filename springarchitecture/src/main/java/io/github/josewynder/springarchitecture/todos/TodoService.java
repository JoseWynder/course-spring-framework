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

    public void updateStatus(TodoEntity todo) {
        todoRepository.save(todo);
    }

    public TodoEntity findById(Integer id) {
        return todoRepository.findById(id).orElse(null);
    }
}
