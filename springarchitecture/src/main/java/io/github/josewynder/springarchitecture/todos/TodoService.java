package io.github.josewynder.springarchitecture.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoRepository todoRepository;
    private final TodoValidator todoValidator;
    private final MailSender mailSender;

    public TodoService(TodoRepository todoRepository, TodoValidator todoValidator, MailSender mailSender) {
        this.todoRepository = todoRepository;
        this.todoValidator = todoValidator;
        this.mailSender = mailSender;
    }

    public TodoEntity save(TodoEntity newTodo) {
        todoValidator.validate(newTodo);
        return todoRepository.save(newTodo);
    }

    public void updateStatus(TodoEntity todo) {
        todoRepository.save(todo);
        mailSender.send(
                "Todo with the description: \"" + todo.getDescription()
                + "\" has been updated to" + todo.getCompleted());
    }

    public TodoEntity findById(Integer id) {
        return todoRepository.findById(id).orElse(null);
    }
}
