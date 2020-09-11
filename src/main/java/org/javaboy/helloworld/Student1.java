package org.javaboy.helloworld;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Component
public class Student1 {
    @NotNull(message = "{student1.id.notnull}",groups = ValidationGroup1.class)
    private Integer id;
    @NotNull(message = "{student1.name.notnull}",groups = {ValidationGroup1.class, ValidationGroup2.class})
    @Size(min = 2,max = 10,message = "{student1.name.length}",groups = {ValidationGroup1.class, ValidationGroup2.class})
    private String name;
    @Email(message = "{student1.email.error}",groups = {ValidationGroup1.class, ValidationGroup2.class})
    private String email;
    @Max(value = 150,message = "{student1.age.error}",groups = {ValidationGroup2.class})
    private Integer age;

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
