package ru.mirea.task12.task1;

public class Student {
    private Integer ID;
    private String name;
    private int age;
    private int crs;

    public Student(String name, int age, int crs, Integer ID) {
        setName(name);
        setCrs(crs);
        setAge(age);
        setID(ID);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCrs(int crs) {
        this.crs = crs;
    }

    public int getCrs() {
        return crs;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "{" +
                ", ID ='" + ID + '\'' +
                "name='" + name + '\'' +
                ", course=" + crs +
                ", age='" + age + '\'' +
                '}';
    }
}
