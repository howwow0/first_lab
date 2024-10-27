package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private String group;
    private int course;
    private final HashMap<String, ArrayList<Integer>> evaluationsByDiscipline;

    public Student(String name, String group, int course, HashMap<String, ArrayList<Integer>> evaluationsByDiscipline) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.evaluationsByDiscipline = evaluationsByDiscipline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Integer[] getEvaluation(String discipline) {
        return evaluationsByDiscipline.get(discipline).toArray(Integer[]::new);
    }

    public String[] getDisciplines(){
        return evaluationsByDiscipline.keySet().toArray(String[]::new);
    }

    public void addEvaluation(String discipline, Integer evaluation) {
        if(evaluation>5 || evaluation<2){
            throw new IllegalArgumentException("Оценками могут быть только числа 2,3,4,5");
        }

        if (!evaluationsByDiscipline.containsKey(discipline)) {
            evaluationsByDiscipline.put(discipline, new ArrayList<>());
        }

        evaluationsByDiscipline.get(discipline).add(evaluation);
    }

}
