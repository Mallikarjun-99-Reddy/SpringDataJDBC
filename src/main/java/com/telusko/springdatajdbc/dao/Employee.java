package com.telusko.springdatajdbc.dao;

public class Employee
{
    private int id;
    private String name;
    private String city;

    public Employee()
    {
        System.out.println("Employee Constructor");
    }
    public Employee(int id, String name, String city)
    {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setCity(String city)
    {
        this.city = city;
    }

    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getCity()
    {
        return city;
    }

    public String toString()
    {
        return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
    }
}
