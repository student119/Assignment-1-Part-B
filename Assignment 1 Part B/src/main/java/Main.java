import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main

{

    public static void main (String [] args)

    {

        ArrayList <Students> students = new ArrayList <Students> (1000);
        ArrayList <Modules> modules = new ArrayList <Modules> (100);
        ArrayList <Course> courses = new ArrayList <Course> (10);

        String studentName = "Craig Walsh";
        int studentAge = 28;
        DateTime studentDOB = new DateTime (1992, 1, 7, 13, 49);
        int studentID = 16101258;

        String moduleName = "Software Engineering III";
        int moduleID = 417;

        String courseName = "Computer Science & information Technology";
        DateTime courseStartDate = new DateTime (2021, 6, 8, 9, 0);
        DateTime courseEndDate = new DateTime (2025, 6, 9, 6, 30);

        students.add (new Students (studentName, studentAge, studentDOB, studentID));
        modules.add (new Modules (moduleName, moduleID));
        courses.add (new Course (courseName, courseStartDate, courseEndDate));

        students.get (0).setStudentModules (modules.get (0));
        students.get (0).setStudentCourses (courses.get (0));

        modules.get (0).setStudentList (students.get (0));
        modules.get (0).setCourseList (courses.get (0));

        courses.get (0).setModuleList (modules.get (0));
        courses.get (0).setStudentList (students.get (0));

        DateTimeFormatter formatDateTime = DateTimeFormat.forPattern ("dd-MM-yy");

        for (Students student : students)

        {

            System.out.println ("Name : " + student.getStudentName () + "\n" +
                    "Age : " + student.getStudentAge () + "\n" +
                    "DOB : " + formatDateTime.print (student.getStudentDOB ()) + "\n" +
                    "ID : " + student.getStudentID () + "\n" +
                    "Username : " + student.getStudentUsername () + "\n");

            for (Course course : student.getStudentCourses())

            {

                System.out.println ("Name : " + course.getCourseName () + "\n" +
                        "Module List : " + course.getModuleList () + "\n" +
                        "Student List : " + course.getStudentList () + "\n" +
                        "Start Date : " + formatDateTime.print (course.getStartDate ()) + " \n" +
                        "End Date : " + formatDateTime.print (course.getEndDate ()));

                for (Modules module : student.getStudentModules())

                {

                    System.out.println ("Name : " + module.getModuleName () + "\n" +
                            "ID : " + module.getModuleID () + "\n" +
                            "Student List : " + module.getStudentList () + "\n" +
                            "Course List : " + module.getCourseList());

                }

            }

        }

        for (Modules module : modules)

        {

            //

            for (Students student : module.getStudentList())

            {

                //

                for (Course course : module.getCourseList())

                {

                    //

                }

            }

        }

        for (Course course :courses)

        {

            //

            for (Modules module : course.getModuleList())

            {

                //

                for (Students student : course.getStudentList())

                {

                    //

                }

            }

        }

    }

}

//for (int i = 0; i < students.size (); i++)
//
//        {
//
//        for (int j = 0; j < students.get (i).getStudentCourses ().size (); j++)
//
//        {
//
//        students.get (i).getStudentCourses ().getCourseName ();
//
//        }
//
//        JOptionPane.showMessageDialog (null,
//        "Name : " + students.get (i).getStudentName () + "\n" +
//        "Age : " + students.get (i).getStudentAge () + "\n" +
//        "DOB : " + formatDateTime.print (students.get (i).getStudentDOB ()) + "\n" +
//        "ID : " + students.get (i).getStudentID () + "\n" +
//        "Username : " + students.get (i).getStudentUsername () + "\n"); // +
//        // "Courses : " + students.get (i).getStudentCourses () + "\n"); +
//        // "Modules : " + students.get (i).getStudentModules ());
//
//        JOptionPane.showMessageDialog (null,
//        "Name : " + modules.get (i).getModuleName () + "\n" +
//        "ID : " + modules.get (i).getModuleID () + "\n"); // +
//        // "Student List : " + modules.get (i).getStudentList () + "\n" +
//        // "Course List : " + modules.get (i).getCourseList());
//
//        JOptionPane.showMessageDialog (null,
//        "Name : " + courses.get (i).getCourseName () + "\n" +
//        // "Module List : " + courses.get (i).getModuleList () + "\n" +
//        // "Student List : " + courses.get (i).getStudentList () + "\n" +
//        "Start Date : " + formatDateTime.print (courses.get (i).getStartDate ()) + " \n" +
//        "End Date : " + formatDateTime.print (courses.get (i).getEndDate ()));
//
//        }
//
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