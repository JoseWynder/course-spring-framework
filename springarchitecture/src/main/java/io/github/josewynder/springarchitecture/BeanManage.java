package io.github.josewynder.springarchitecture;

import io.github.josewynder.springarchitecture.todos.TodoEntity;
import io.github.josewynder.springarchitecture.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

// Singleton
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
//@Scope(WebApplicationContext.SCOPE_APPLICATION)
//@Scope("request")
//@Scope("session")
//@Scope("application")
public class BeanManage {

    @Autowired
    private TodoValidator todoValidator;

    @Autowired
    public BeanManage(TodoValidator todoValidator) {
        this.todoValidator = todoValidator;
    }

    public void use() {
        var todo = new TodoEntity();
        todoValidator.validate(todo);
    }

    @Autowired
    public void setTodoValidate(TodoValidator todoValidator) {
        this.todoValidator = todoValidator;
    }

}
