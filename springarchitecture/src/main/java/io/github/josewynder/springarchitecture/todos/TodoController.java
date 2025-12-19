package io.github.josewynder.springarchitecture.todos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public TodoEntity save(@RequestBody TodoEntity newTodo) {
        return this.todoService.save(newTodo);
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
