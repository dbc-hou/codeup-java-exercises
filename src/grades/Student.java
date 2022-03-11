package grades;

import java.util.ArrayList;

public class Student {
    private static String name = "Steve";
    private static ArrayList<Integer> grades;

    public static void main(String[] args) {
        Student s = new Student(name);
        s.addGrade(87);
        s.addGrade(96);
        s.addGrade(73);
        s.addGrade(82);
        System.out.println(name + "'s average as of now: " + s.getGradeAverage());
    }
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        int totalGrades = 0;
        for (int g : grades) {
            totalGrades += g;
        }
        return (double) totalGrades / (double) grades.size();
    }
}
