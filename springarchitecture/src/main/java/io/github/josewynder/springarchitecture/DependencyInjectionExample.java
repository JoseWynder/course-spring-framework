package io.github.josewynder.springarchitecture;

import io.github.josewynder.springarchitecture.todos.*;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DependencyInjectionExample {
    public static void main(String[] args) throws SQLException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("url");
        dataSource.setUsername("user");
        dataSource.setPassword("password");

        Connection connection = dataSource.getConnection();

        EntityManager entityManager = null;

        TodoRepository todoRepository = null; // new SimpleJpaRepository<TodoEntity, Integer>();
        TodoValidator todoValidator = new TodoValidator(todoRepository);
        MailSender mailSender = new MailSender();

        TodoService todoService = new TodoService(todoRepository, todoValidator, mailSender);

//        BeanManage beanManage = new BeanManage(null);
//        beanManage.setTodoValidate(todoValidator);
//        if(condition == true) {
//            beanManage.setTodoValidate();
//        }
    }
}
