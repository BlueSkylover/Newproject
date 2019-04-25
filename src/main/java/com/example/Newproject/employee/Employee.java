package com.example.Newproject.employee;

public class Employee {
    int id;
    String name;
    int age;
    String gender;
    public Employee(){
        //无参构造
    }
    public Employee(int id, String name, int age, String gender) {
        //带参构造
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }


    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
}
