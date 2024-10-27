package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Алиса", "Группа A", 1, new HashMap<>() {{
            put("Математика", new ArrayList<>(Arrays.asList(2, 5, 4)));
            put("Физика", new ArrayList<>(Arrays.asList(3, 4)));
        }}));

        students.add(new Student("Боб", "Группа B", 2, new HashMap<>() {{
            put("Математика", new ArrayList<>(Arrays.asList(4, 3)));
            put("Информатика", new ArrayList<>(Arrays.asList(5, 2)));
        }}));

        students.add(new Student("Чарли", "Группа A", 2, new HashMap<>() {{
            put("Физика", new ArrayList<>(Arrays.asList(4, 5)));
            put("Математика", new ArrayList<>(Arrays.asList(5, 4, 4)));
        }}));

        students.add(new Student("Диана", "Группа C", 1, new HashMap<>() {{
            put("Физика", new ArrayList<>(Arrays.asList(4, 5, 4)));
            put("История", new ArrayList<>(Arrays.asList(4, 5)));
        }}));

        students.add(new Student("Евгений", "Группа B", 2, new HashMap<>() {{
            put("Информатика", new ArrayList<>(Arrays.asList(5, 4, 5)));
            put("Математика", new ArrayList<>(Arrays.asList(2, 4)));
        }}));

        students.add(new Student("Фаина", "Группа A", 3, new HashMap<>() {{
            put("История", new ArrayList<>(Arrays.asList(3, 3, 5)));
            put("Физика", new ArrayList<>(Arrays.asList(5, 3)));
        }}));
        System.out.println("Студенты 2 курса");
        StudentUtils.print(students, 2);
        System.out.println("Удаляем всех студентов со средней оценкой хотя бы по одному предмету ниже трех...");
        StudentUtils.removeWhereAvgEvaluationsLessThree(students);
        System.out.println("Студенты 2 курса со средней оценкой выше трех");
        StudentUtils.print(students, 2);
        System.out.println("Переводим всех студентов со средней оценкой выше трех на следующий курс...");
        StudentUtils.transferToNextCourse(students);
        System.out.println("Студенты 3 курса");
        StudentUtils.print(students, 3);
    }
}