package collection;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", 'M', 22, 5, 4.3);
        Student st2 = new Student("Sofia", 'F', 19, 2, 3.6);
        Student st3 = new Student("Gleb", 'M', 18, 1, 3.3);
        Student st4 = new Student("Joshua", 'M', 20, 2, 4.0);
        Student st5 = new Student("Anna", 'F', 21, 4, 4.3);

        ArrayList<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        System.out.println(list);

        Student st6 = new Student("Anna", 'F', 21, 4, 4.3);
        list.add(st6);

        list.remove(st6);
        System.out.println(list);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}