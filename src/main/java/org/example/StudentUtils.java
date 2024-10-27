package org.example;

import java.util.Arrays;
import java.util.List;

//Stream API не используется
public class StudentUtils {
    public static void print(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
               print(student);
            }
        }
    }

    public static void print(Student student) {
            System.out.println("Имя: " + student.getName());
            System.out.println("Группа: " + student.getGroup());
            System.out.println("Курс: " + student.getCourse());
            for (String discipline : student.getDisciplines()) {
                System.out.println("Дисциплина " + discipline + " Оценки " + Arrays.toString(student.getEvaluation(discipline)));
            }
            System.out.println();
    }

    public static void removeWhereAvgEvaluationsLessThree(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            for (String discipline : student.getDisciplines()) {
                Integer[] studentEvaluations = student.getEvaluation(discipline);
                double avgEvaluations = 0;
                for (Integer evaluation : studentEvaluations) {
                    avgEvaluations += evaluation;
                }
                avgEvaluations /= studentEvaluations.length;
                if (avgEvaluations <= 3) {
                    students.remove(i);
                }
            }
        }
    }
    public static void transferToNextCourse(List<Student> students) {
        for (Student student : students) {
            student.setCourse(student.getCourse() + 1);
        }
    }
}
