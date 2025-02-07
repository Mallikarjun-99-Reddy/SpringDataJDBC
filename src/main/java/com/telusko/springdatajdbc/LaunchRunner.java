package com.telusko.springdatajdbc;

import com.telusko.springdatajdbc.dao.Employee;
import com.telusko.springdatajdbc.dao.SpringDataJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LaunchRunner implements CommandLineRunner
{
    @Autowired
    SpringDataJDBC jdbc;

    public void run(String... args)
    {
       int rows = jdbc.input(new Employee(104, "Sumanth", "Vijayawada"));
        System.out.println("No of rows affected: " + rows);
    }
}
