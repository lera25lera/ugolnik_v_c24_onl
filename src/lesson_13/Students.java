package lesson_13;

import java.util.ArrayList;

public class Students {
    private String name;
    private String group;
    private int course;
    private ArrayList<Integer> grades;

    public Students(String name, String group, int course, ArrayList<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
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

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public int removeOrUpdate(){
        double average = 0.0;
        for (int grade : this.getGrades()
             ) {
            average += grade;
        }
        average = average / grades.size();
        if (average < 3.0) {
            return 1;
        } else {
            course++;
            return 2;
        }
    }

}
