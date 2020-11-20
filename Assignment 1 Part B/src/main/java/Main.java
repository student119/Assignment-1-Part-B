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

        // Declares an ArrayList of type Students named students and sets it's initial capacity to 1000.
        ArrayList <Students> students = new ArrayList <Students> (1000);
        // Declares an ArrayList of type Modules named modules and sets it's initial capacity to 100.
        ArrayList <Modules> modules = new ArrayList <Modules> (100);
        // Declares an ArrayList of type Course named courses and sets it initial capacity to 10.
        ArrayList <Course> courses = new ArrayList <Course> (10);

        // Declares a String named student1Name and sets it equal to Craig Walsh.
        String student1Name = "Craig Walsh";
        // Declares an integer named student1Age and sets it equal to 28.
        int student1Age = 28;
        // Declares a DateTime named student1DOB and sets it equal to (1992, 1, 7, 13, 49).
        DateTime student1DOB = new DateTime (1992, 1, 7, 13, 49);
        // Declares an integer named student1ID and sets it equal to 16101258.
        int student1ID = 16101258;

        // Declares a String named student2Name and sets it equal to Keanu Reeves.
        String student2Name = "Keanu Reeves";
        // Declares an integer named student2Age and sets it equal to 48.
        int student2Age = 48;
        // Declares a DateTime named student2DOB and sets it equal to (1972, 2, 4, 12, 33).
        DateTime student2DOB = new DateTime (1972, 2, 4, 12, 33);
        // Declares an integer named student2ID and sets it equal to 18302846.
        int student2ID = 18302846;

        // Declares a String named student3Name and sets it equal to Dolly Parton.
        String student3Name = "Dolly Parton";
        // Declares an integer named student3Age and sets it equal to 56.
        int student3Age = 56;
        // Declares a DateTime named student3DOB and sets it equal to (1966, 6, 9, 2, 0).
        DateTime student3DOB = new DateTime (1966, 6, 9, 2, 0);
        // Declares an integer named student1ID and sets it equal to 55937261.
        int student3ID = 55937261;

        // Declares a String named module1Name and sets it equal to Software Engineering III.
        String module1Name = "Software Engineering III";
        // Declares an integer named module1ID and sets it equal to 2020417.
        int module1ID = 2020417;

        // Declares a String named module2Name and sets it equal to Machine Learning.
        String module2Name = "Machine Learning";
        // Declares an integer named module1ID and sets it equal to 20204101.
        int module2ID = 20204101;

        // Declares a String named module3Name and sets it equal to Information Retrieval.
        String module3Name = "Information Retrieval";
        // Declares an integer named module3ID and sets it equal to 20204100.
        int module3ID = 20204100;

        // Declares a String named course1Name and sets it equal to Computer Science & Information Technology.
        String course1Name = "Computer Science & information Technology";
        // Declares a DateTime named course1StartDate and sets it equal to (2021, 6, 8, 9, 0).
        DateTime course1StartDate = new DateTime (2021, 6, 8, 9, 0);
        // Declares a DateTime named course1EndDate and sets it equal to (2025, 6, 9, 6, 30).
        DateTime course1EndDate = new DateTime (2025, 6, 9, 6, 30);

        // Declares a String named course2Name and sets it equal to Software Development.
        String course2Name = "Software Development";
        // Declares a DateTime named course2StartDate and sets it equal to (2021, 6, 8, 9, 0).
        DateTime course2StartDate = new DateTime (2021, 6, 8, 9, 0);
        // Declares a DateTime named course2EndDate and sets it equal to (2025, 6, 9, 6, 30).
        DateTime course2EndDate = new DateTime (2025, 6, 9, 6, 30);

        // Declares a String named course3Name and sets it equal to Computer Forensics.
        String course3Name = "Computer Forensics";
        // Declares a DateTime named course3StartDate and sets it equal to (2021, 6, 8, 9, 0).
        DateTime course3StartDate = new DateTime (2021, 6, 8, 9, 0);
        // Declares a DateTime named course3EndDate and sets it equal to (2025, 6, 9, 6, 30).
        DateTime course3EndDate = new DateTime (2025, 6, 9, 6, 30);

        // A new Students object is added to students.
        students.add (new Students (student1Name, student1Age, student1DOB, student1ID));
        // A new Students object is added to students.
        students.add (new Students (student2Name, student2Age, student2DOB, student2ID));
        // A new Students object is added to students.
        students.add (new Students (student3Name, student3Age, student3DOB, student3ID));

        // A new Modules object is added to modules.
        modules.add (new Modules (module1Name, module1ID));
        // A new Modules object is added to modules.
        modules.add (new Modules (module2Name, module2ID));
        // A new Modules object is added to modules.
        modules.add (new Modules (module3Name, module3ID));

        // A new Course object is added to courses.
        courses.add (new Course (course1Name, course1StartDate, course1EndDate));
        // A new Course object is added to courses.
        courses.add (new Course (course2Name, course2StartDate, course2EndDate));
        // A new Course object is added to courses.
        courses.add (new Course (course3Name, course3StartDate, course3EndDate));

        // The first student object is assigned to the third course object.
        students.get (0).setStudentCourses (courses.get (2));
        // The second student object is assigned to the first course object.
        students.get (1).setStudentCourses (courses.get (0));
        // The third student object is assigned to the second course object.
        students.get (2).setStudentCourses (courses.get (1));

        // The first student object is assigned to the second module object.
        students.get (0).setStudentModules (modules.get (1));
        // The first student object is assigned to the third module object.
        students.get (0).setStudentModules (modules.get (2));
        // The second student object is assigned to the first module object.
        students.get (1).setStudentModules (modules.get (0));
        // The second student object is assigned to the third module object.
        students.get (1).setStudentModules (modules.get (2));
        // The third student object is assigned to the first module object.
        students.get (2).setStudentModules (modules.get (0));
        // The third student object is assigned to the second module object.
        students.get (2).setStudentModules (modules.get (1));

        // The first module object is assigned to the second course object.
        modules.get (0).setCourseList (courses.get (1));
        // The first module object is assigned to the third course object.
        modules.get (0).setCourseList (courses.get (2));
        // The second module object is assigned to the first course object.
        modules.get (1).setCourseList (courses.get (0));
        // The second module object is assigned to the third course object.
        modules.get (1).setCourseList (courses.get (2));
        // The third module object is assigned to the first course object.
        modules.get (2).setCourseList (courses.get (0));
        // The third module object is assigned to the second course object.
        modules.get (2).setCourseList (courses.get (1));

        // The first module object is assigned to the second student object.
        modules.get (0).setStudentList (students.get (1));
        // The first module object is assigned to the third student object.
        modules.get (0).setStudentList (students.get (2));
        // The second module object is assigned to the first student object.
        modules.get (1).setStudentList (students.get (0));
        // The second module object is assigned to the third student object.
        modules.get (1).setStudentList (students.get (2));
        // The third module object is assigned to the first student object.
        modules.get (2).setStudentList (students.get (0));
        // The third module object is assigned to the second student object.
        modules.get (2).setStudentList (students.get (1));

        // The first course object is assigned to the second module object.
        courses.get (0).setModuleList (modules.get (1));
        // The first course object is assigned to the third module object.
        courses.get (0).setModuleList (modules.get (2));
        // The second course object is assigned to the first module object.
        courses.get (1).setModuleList (modules.get (0));
        // The second course object is assigned to the third module object.
        courses.get (1).setModuleList (modules.get (2));
        // The third course object is assigned to the first module object.
        courses.get (2).setModuleList (modules.get (0));
        // The third module object is assigned to the second module object.
        courses.get (2).setModuleList (modules.get (1));

        // The first course object is assigned to the second student object.
        courses.get (0).setStudentList (students.get (1));
        // The first course object is assigned to the third student object.
        courses.get (0).setStudentList (students.get (2));
        // The second course object is assigned to the first student object.
        courses.get (1).setStudentList (students.get (0));
        // The second course object is assigned to the third student object.
        courses.get (1).setStudentList (students.get (2));
        // The third course object is assigned to the first student object.
        courses.get (2).setStudentList (students.get (0));
        // The third course object is assigned to the second student object.
        courses.get (2).setStudentList (students.get (1));

        // Delcares a DateTimeFormatter named formatDateTime and sets is's pattern to dd-MM-yy.
        DateTimeFormatter formatDateTime = DateTimeFormat.forPattern ("dd-MM-yy");

        // Prinys out the below line to the console.
        System.out.println ("\n----------Student Details----------\n");

        // Start of for loop which will loop through all of the Students objects in students.
        for (Students student : students)

        {

            // Prints out student details to the console.
            System.out.println ("Name : " + student.getStudentName () + "\n" +
                    "Age : " + student.getStudentAge () + "\n" +
                    "DOB : " + formatDateTime.print (student.getStudentDOB ()) + "\n" +
                    "ID : " + student.getStudentID () + "\n" +
                    "Username : " + student.getStudentUsername () + "\n");

            // Start of for loop which will loop through all of the courses attached to the student of the current loop.
            for (Course course : student.getStudentCourses())

            {

                // Prints out course details to the console.
                System.out.println ("Current Course : " + course.getCourseName () + "\n" +
                        "Start Date : " + formatDateTime.print (course.getStartDate ()) + " \n" +
                        "End Date : " + formatDateTime.print (course.getEndDate ()) + "\n");

                // Start of for loop which will loop through all of the modules attached to the student of the current loop.
                for (Modules module : student.getStudentModules())

                {

                    // Prinst out module details to the console.
                    System.out.println ("Course Module : " + module.getModuleName () + "\n" +
                            "ID : " + module.getModuleID () + "\n");

                }

            }

        }

        // Prints the below line to the console.
        System.out.println ("----------End of Student Details----------");

        // Prints out the below line to the console.
        System.out.println ("\n----------Module Details----------\n");

        // Start of for loop which will loop through all of the Modules objects in modules.
        for (Modules module : modules)

        {

            // Prints out module details to the console.
            System.out.println ("Name : " + module.getModuleName () + "\n" +
                    "ID : " + module.getModuleID () + "\n");

            // Start of for loop which will loop through all of the students attached to the module of the current loop.
            for (Students student : module.getStudentList())

            {

                // Prints out student details to the console.
                System.out.println ("Module Student : " + student.getStudentName () + "\n" +
                        "Age : " + student.getStudentAge () + "\n" +
                        "DOB : " + formatDateTime.print (student.getStudentDOB ()) + "\n" +
                        "ID : " + student.getStudentID () + "\n" +
                        "Username : " + student.getStudentUsername () + "\n");

                // Start of for loop which will loop through all of the courses attached to the current module.
                for (Course course : module.getCourseList())

                {

                    // Prints out course details to the console.
                    System.out.println ("Module Course : " + course.getCourseName () + "\n" +
                            "Start Date : " + formatDateTime.print (course.getStartDate ()) + " \n" +
                            "End Date : " + formatDateTime.print (course.getEndDate ()) + "\n");

                }

            }

        }

        // Prints out the below line to the console.
        System.out.println ("----------End of Module Details----------");

        // Prints out the below line to the console.
        System.out.println ("\n----------Course Details----------\n");

        // Start of for loop which will loop through all of the Course objects in courses.
        for (Course course :courses)

        {

            // Prints out course details to the console.
            System.out.println ("Name : " + course.getCourseName () + "\n" +
                    "Start Date : " + formatDateTime.print (course.getStartDate ()) + " \n" +
                    "End Date : " + formatDateTime.print (course.getEndDate ()) + "\n");

            // Start of for loop which will loop through all of the modules attached to the current course.
            for (Modules module : course.getModuleList())

            {

                // Prints out module details to the console.
                System.out.println ("Course Module : " + module.getModuleName () + "\n" +
                        "ID : " + module.getModuleID () + "\n");

                // Start of for loop which will loop through all of the students attahced to the current course.
                for (Students student : course.getStudentList())

                {

                    // Prints out student details to the console.
                    System.out.println ("Course Student : " + student.getStudentName () + "\n" +
                            "Age : " + student.getStudentAge () + "\n" +
                            "DOB : " + formatDateTime.print (student.getStudentDOB ()) + "\n" +
                            "ID : " + student.getStudentID () + "\n" +
                            "Username : " + student.getStudentUsername () + "\n");

                }

            }

        }

        // Prints out the below line to the console.
        System.out.println ("----------End of Course Details----------");

    }

}