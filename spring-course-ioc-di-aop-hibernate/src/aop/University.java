package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/* ---------------- 2. Аспектно Ориентированное Программирование (AOP) ----------- */
@Component
public class University {

    List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Dmitriy Radionov", 4, 7.5);
        Student st2 = new Student("Mikhail Ivanov", 2, 8.3);
        Student st3 = new Student("Elena Sidorova", 1, 9.1);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    // 1.1
//    public List<Student> getStudents() {
//        System.out.println("Information from method getStudents():");
//        System.out.println(students);
//        return students;
//    }
    // 1.2
    public List<Student> getStudents() {
        System.out.println("Begin method getStudents()");
//        System.out.println(students.get(3)); // java.lang.IndexOutOfBoundsException
        System.out.println("Information from method getStudents():");
        System.out.println(students);
        return students;
    }
}
