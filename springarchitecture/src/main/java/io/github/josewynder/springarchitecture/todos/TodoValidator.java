package io.github.josewynder.springarchitecture.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private final TodoRepository todoRepository;

    public TodoValidator(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void validate(TodoEntity todo) {
        if(thereIsTodoWithThatDescription(todo.getDescription())) {
            throw new IllegalArgumentException("There is already a TODO with that description");
        }
    }

    private boolean thereIsTodoWithThatDescription(String description) {
        return todoRepository.existsByDescription(description);
    }
}
