// Imports the joda date/time library.
import org.joda.time.DateTime;
// Imports the joda date/time format library.
import org.joda.time.format.DateTimeFormat;
// Imports the joda date/time formatter library.
import org.joda.time.format.DateTimeFormatter;
// Imports the java util ArrayList library.
import java.util.ArrayList;

// Public method of type class named Main.
public class Main

{

    // Public static method of type void named Main with a String array named args as it's parameter.
    public static void main (String [] args)

    {

        //
        ArrayList <Students> students = new ArrayList <Students> (1000);
        //
        ArrayList <Modules> modules = new ArrayList <Modules> (100);
        //
        ArrayList <Course> courses = new ArrayList <Course> (10);

        String student1Name = "Craig Walsh";
        int student1Age = 28;
        DateTime student1DOB = new DateTime (1992, 1, 7, 13, 49);
        int student1ID = 16101258;

        String student2Name = "Keanu Reeves";
        int student2Age = 48;
        DateTime student2DOB = new DateTime (1972, 2, 4, 12, 33);
        int student2ID = 18302846;

        String student3Name = "Dolly Parton";
        int student3Age = 56;
        DateTime student3DOB = new DateTime (1966, 6, 9, 2, 0);
        int student3ID = 16101258;

        String module1Name = "Software Engineering III";
        int module1ID = 2020417;

        String module2Name = "Machine Learning";
        int module2ID = 20204101;

        String module3Name = "Information Retrieval";
        int module3ID = 20204100;

        String course1Name = "Computer Science & information Technology";
        DateTime course1StartDate = new DateTime (2021, 6, 8, 9, 0);
        DateTime course1EndDate = new DateTime (2025, 6, 9, 6, 30);

        String course2Name = "Software Development";
        DateTime course2StartDate = new DateTime (2021, 6, 8, 9, 0);
        DateTime course2EndDate = new DateTime (2025, 6, 9, 6, 30);

        String course3Name = "Computer Engineering";
        DateTime course3StartDate = new DateTime (2021, 6, 8, 9, 0);
        DateTime course3EndDate = new DateTime (2025, 6, 9, 6, 30);

        students.add (new Students (student1Name, student1Age, student1DOB, student1ID));
        students.add (new Students (student2Name, student2Age, student2DOB, student2ID));
        students.add (new Students (student3Name, student3Age, student3DOB, student3ID));

        modules.add (new Modules (module1Name, module1ID));
        modules.add (new Modules (module2Name, module2ID));
        modules.add (new Modules (module3Name, module3ID));

        courses.add (new Course (course1Name, course1StartDate, course1EndDate));
        courses.add (new Course (course2Name, course2StartDate, course2EndDate));
        courses.add (new Course (course3Name, course3StartDate, course3EndDate));

        students.get (0).setStudentModules (modules.get (0));
        students.get (0).setStudentModules (modules.get (1));

        students.get (0).setStudentCourses (courses.get (0));
        students.get (2).setStudentCourses (courses.get (1));

        modules.get (0).setStudentList (students.get (0));
        modules.get (0).setStudentList (students.get (2));

        modules.get (0).setCourseList (courses.get (1));
        modules.get (0).setCourseList (courses.get (2));

        courses.get (0).setModuleList (modules.get (0));
        courses.get (0).setModuleList (modules.get (1));

        courses.get (0).setStudentList (students.get (0));
        courses.get (1).setStudentList (students.get (1));
        courses.get (2).setStudentList (students.get (2));

        DateTimeFormatter formatDateTime = DateTimeFormat.forPattern ("dd-MM-yy");

        System.out.println ("\n----------Student Details----------\n");

        for (Students student : students)

        {

            System.out.println ("Name : " + student.getStudentName () + "\n" +
                    "Age : " + student.getStudentAge () + "\n" +
                    "DOB : " + formatDateTime.print (student.getStudentDOB ()) + "\n" +
                    "ID : " + student.getStudentID () + "\n" +
                    "Username : " + student.getStudentUsername () + "\n");

            for (Course course : student.getStudentCourses())

            {

                System.out.println ("Current Course : " + course.getCourseName () + "\n" +
                        "Start Date : " + formatDateTime.print (course.getStartDate ()) + " \n" +
                        "End Date : " + formatDateTime.print (course.getEndDate ()) + "\n");

                for (Modules module : student.getStudentModules())

                {

                    System.out.println ("Course Module : " + module.getModuleName () + "\n" +
                            "ID : " + module.getModuleID () + "\n");

                }

            }

        }

        System.out.println ("----------End of Student Details----------");

        System.out.println ("\n----------Module Details----------\n");

        for (Modules module : modules)

        {

            System.out.println ("Name : " + module.getModuleName () + "\n" +
                    "ID : " + module.getModuleID () + "\n");

            for (Students student : module.getStudentList())

            {

                System.out.println ("Module Student : " + student.getStudentName () + "\n" +
                        "Age : " + student.getStudentAge () + "\n" +
                        "DOB : " + formatDateTime.print (student.getStudentDOB ()) + "\n" +
                        "ID : " + student.getStudentID () + "\n" +
                        "Username : " + student.getStudentUsername () + "\n");

                for (Course course : module.getCourseList())

                {

                    System.out.println ("Module Course : " + course.getCourseName () + "\n" +
                            "Start Date : " + formatDateTime.print (course.getStartDate ()) + " \n" +
                            "End Date : " + formatDateTime.print (course.getEndDate ()) + "\n");

                }

            }

        }

        System.out.println ("----------End of Module Details----------");

        System.out.println ("\n----------Course Details----------\n");

        for (Course course :courses)

        {

            System.out.println ("Name : " + course.getCourseName () + "\n" +
                    "Start Date : " + formatDateTime.print (course.getStartDate ()) + " \n" +
                    "End Date : " + formatDateTime.print (course.getEndDate ()) + "\n");

            for (Modules module : course.getModuleList())

            {

                System.out.println ("Course Module : " + module.getModuleName () + "\n" +
                        "ID : " + module.getModuleID () + "\n");

                for (Students student : course.getStudentList())

                {

                    System.out.println ("Course Student : " + student.getStudentName () + "\n" +
                            "Age : " + student.getStudentAge () + "\n" +
                            "DOB : " + formatDateTime.print (student.getStudentDOB ()) + "\n" +
                            "ID : " + student.getStudentID () + "\n" +
                            "Username : " + student.getStudentUsername () + "\n");

                }

            }

        }

        System.out.println ("----------End of Course Details----------");

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