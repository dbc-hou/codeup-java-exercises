package grades;

import util.Input;

import java.util.HashMap;
import java.util.Set;

//Create a new HashMap object


public class GradesApplication {
    private static HashMap<String, Student> students = new HashMap<>();

    public static void main(String[] args) {
        //Create some student objects to add to the HashMap
        addStudentsAndGrades();
        System.out.println(students.get("dbc-hou").getName());
        //List students by username and ask user to choose one
        System.out.println("Here are the GitHub usernames of our students:");
        //This needs to be a loop that runs through the usernames in the HashMap!!
        Set<String> userNames = students.keySet();
//        for (String u : userNames) {
//            System.out.print("|" + u + "|\t");
//        }
//        System.out.println();
        System.out.print(students);
        System.out.println("Which student would you like to see more information on?");
        System.out.print("> ");
        Input i = new Input();
        String userChoice = i.getString();
//        System.out.println(userChoice);
        if (students.containsKey(userChoice)) {
//            Student s = new Student(userChoice);
            System.out.println("Name: " + students.get(userChoice).getName() + " - GitHub Username = " + userChoice + "\nCurrent Average: " + students.get(userChoice).getGradeAverage());
        }
    }

    public static void addStudentsAndGrades() {
        //Add student objects to the students HashMap & print out a test student with grade average
        Student pax = new Student("Pax");
        pax.addGrade(93);
        pax.addGrade(86);
        pax.addGrade(92);
        students.put("paxtonc77",pax);
        Student katy = new Student("Katy");
        katy.addGrade(77);
        katy.addGrade(99);
        katy.addGrade(90);
        students.put("gisele82",katy);
        Student david = new Student("David");
        david.addGrade(92);
        david.addGrade(100);
        david.addGrade(80);
        students.put("dbc-hou",david);
        Student andrea = new Student("Andrea");
        andrea.addGrade(97);
        andrea.addGrade(85);
        andrea.addGrade(89);
        students.put("aalbright",andrea);
        Student jeremy = new Student("Jeremy");
        jeremy.addGrade(77);
        jeremy.addGrade(93);
        jeremy.addGrade(88);
        students.put("jlovelace",jeremy);
    }
}
