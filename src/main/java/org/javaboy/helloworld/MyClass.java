package org.javaboy.helloworld;

import java.util.List;
import java.util.Map;

public class MyClass {
    private Integer id;
    private List<Student> students;
    private Map<String, Object> info;

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", students=" + students +
                ", info=" + info +
                '}';
    }

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
