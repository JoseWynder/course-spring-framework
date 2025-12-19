package io.github.josewynder.springarchitecture.todos;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public TodoEntity save(@RequestBody TodoEntity newTodo) {
        try {
            return this.todoService.save(newTodo);
        } catch (IllegalArgumentException e) {
            var messageError = e.getMessage();
            throw new ResponseStatusException(HttpStatus.CONFLICT, messageError);
        }
    }

    @PutMapping("/{id}")
    public void updateStatus(
            @PathVariable Integer id, @RequestBody TodoEntity todo) {
        todo.setId(id);
        todoService.updateStatus(todo);
    }

    @GetMapping("/{id}")
    public TodoEntity findTodoById(@PathVariable Integer id) {
        return todoService.findById(id);
    }
}
