import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main

{

    public static void main (String [] args)

    {

        ArrayList <Students> students = new ArrayList <Students> (1000);
        ArrayList <Modules> modules = new ArrayList <Modules> (100);
        ArrayList <Course> courses = new ArrayList <Course> (10);

        // Students student1;
        // Modules module1;
        // Course course1;

        String studentName = "Craig Walsh";
        int studentAge = 28;
        DateTime studentDOB = new DateTime(1992, 1, 7, 13, 49);
        int studentID = 16101258;
        String studentCourse = "Computer Science & Information Technology";
        String studentModule = "Software Engineering III";

        String courseName = "Computer Science & information Technology";
        String courseModules = "Software Engineering III";
        String courseStudents = "Craig Walsh";
        DateTime courseStartDate = new DateTime(2021, 6, 8, 9, 0);
        DateTime courseEndDate = new DateTime(2025, 6, 9, 6, 30);

        String moduleName = "Software Engineering III";
        int moduleID = 417;
        String moduleCourse = "Computer Science & Information Technology";
        String moduleStudents = "Craig Walsh";

        students.add (new Students (studentName, studentAge, studentDOB, studentID, studentCourse, studentModule));
        modules.add (new Modules (moduleName, moduleID, moduleStudents, moduleCourse));
        courses.add (new Course (courseName, courseModules, courseStudents, courseStartDate, courseEndDate));

        DateTimeFormatter format = DateTimeFormat.forPattern ("dd-MM-yy");
        SimpleDateFormat dt1 = new SimpleDateFormat ("dd-MM-yy");

        for (int i = 0; i < students.size(); i++)

        {

            JOptionPane.showMessageDialog(null, students.get(i).getStudentName() + "\n" + students.get(i).getStudentAge() + "\n"
                    + students.get(i).getStudentDOB() + "\n" + students.get(i).getStudentID() + "\n" + students.get(i).getStudentUsername() + "\n"
                    + students.get(i).getStudentCourses() + "\n" + students.get(i).getStudentModules());

            // System.out.println (students.get(i).getStudentName());

//            System.out.println(students.get(i).getStudentName() + "\n" + students.get(i).getStudentAge() + "\n"
//                    + students.get(i).getStudentDOB() + "\n" + students.get(i).getStudentID() + "\n" + students.get(i).getStudentUsername() + "\n"
//                    + students.get(i).getStudentCourses() + "\n" + students.get(i).getStudentModules());

        }

    }

}

//        ArrayList <String> firstNames = new ArrayList <String> (10);
//        firstNames.add("Craig");
//        firstNames.add("Bruce");
//        firstNames.add("Nathan");
//        firstNames.add("Patrick");
//        firstNames.add("Michael");
//        firstNames.add("Teresa");
//        firstNames.add("Megan");
//        firstNames.add("Chloe");
//        firstNames.add("Aoife");
//        firstNames.add("Ciara");
//
//        ArrayList <String> lastNames = new ArrayList <String> (10);
//        lastNames.add("Walsh");
//        lastNames.add("Willis");
//        lastNames.add("Ryder");
//        lastNames.add("Dorrian");
//        lastNames.add("Conneely");
//        lastNames.add("King");
//        lastNames.add("Fox");
//        lastNames.add("Leary");
//        lastNames.add("Budgen");
//        lastNames.add("Flaherty");
//
//        int randomLowerBound = 1;
//        int randomUpperBoundName = 10;
//        int randomUpperBoundID = 999999;
//
//    testModules.add("CT561 Systems Modelling & Simulation");
//    testModules.add("CT436 Advanced Professional Skills");
//    testModules.add("CT4100 Information Retrieval");
//    testModules.add("CT417 Software Engineering III");
//    testModules.add("CT4101 Machine Learning");
//    testModules.add("CT437 Computer Security & Forensic Computing");
//    testModules.add("CS402 Cryptography");
//    testModules.add("CT421 Artificial Intelligence");
//    testModules.add("CT420 Real Time Systems");
//    testModules.add("CT414 Distributed Systems & Co-Operative Computing");
//
//    testStudents.add("Craig Walsh");
//    testStudents.add("Nathan Ryder");
//    testStudents.add("David Clifford");
//    testStudents.add("Matthias Nickles");
//    testStudents.add("Alan Turing");
//    testStudents.add("Isaac Asimov");
//    testStudents.add("Christopher Nolan");
//    testStudents.add("Orlando Bloom");
//    testStudents.add("Jaroslaw Janas");
//    testStudents.add("David Schwimmer");
//
//        for (int i = 0; i < 5; i++)
//
//        {
//
//             System.out.println (firstNames.get (random));
//
//             ThreadLocalRandom.current ().nextInt (1, 9 + 1);
//
//             students.add (new Students ((firstNames.(ThreadLocalRandom.current ().nextInt (1, 9 + 1))concat)));
//
//        }
//
//    }
//
//    private static int getRandomNumberInRange (int min, int max)
//
//    {
//
//        if (min >= max)
//
//        {
//
//            throw new IllegalArgumentException ("Max must be greater than Min.");
//
//        }
//
//        Random r = new Random ();
//
//        return r.nextInt ((max - min) + 1) + min;
//
//    }
//
//}