package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String,Student> students = new HashMap<>();
        Student pax = new Student("paxtonc77");
        pax.addGrade(93);
        pax.addGrade(86);
        pax.addGrade(92);
        Student katy = new Student("gisele82");
        katy.addGrade(77);
        katy.addGrade(99);
        katy.addGrade(90);
        Student david = new Student("dbc-hou");
        david.addGrade(92);
        david.addGrade(100);
        david.addGrade(80);
        students.put("paxtonc77",pax);
        students.put("gisele82",katy);
        students.put("dbc-hou",david);
        System.out.println(david.getGradeAverage());
    }
}
