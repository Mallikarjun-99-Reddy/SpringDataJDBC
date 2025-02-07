package com.telusko.springdatajdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringDataJDBC
{
    @Autowired
    JdbcTemplate jdbc;

    static final String SQL_QUERY = "INSERT INTO implementersinfo(id, name, city) values(?, ?, ?)";

    public int input(Employee emp)
    {
        // along with query we can pass details to add. details came from user input while creating obj
        int rowsAffected =  jdbc.update(SQL_QUERY, emp.getId(), emp.getName(), emp.getCity());
        return rowsAffected;
    }




}
