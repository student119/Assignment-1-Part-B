import org.joda.time.DateTime;

public class Main

{

    public static void main (String [] args)

    {

        // ArrayList <Students> students = new ArrayList <Students> (1000);
        // ArrayList <Modules> modules = new ArrayList <Modules> (100);
        // ArrayList <Course> courses = new ArrayList <Course> (10);

        Students student1;
        Modules module1;
        Course course1;

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

        student1 = new Students (studentName, studentAge, studentDOB, studentID, studentCourse, studentModule);
        module1 = new Modules (moduleName, moduleID, moduleStudents, moduleCourse);
        course1 = new Course (courseName, courseModules, courseStudents, courseStartDate, courseEndDate);

        System.out.println (student1);
        System.out.println (module1);
        System.out.println (course1);

    }

}

//    List<Course> courses = new ArrayList<Course>();
//
//    Module module1 = new Module("Module 1", "CT1");
//    Module module2 = new Module("Module 2", "CT2");
//
//    Student student = new Student("Nathan", 20, new Date(2020, Calendar.FEBRUARY, 10));
//        student.setId("17731961");
//
//                Student student2 = new Student("Student2", 21, new Date(2020, Calendar.FEBRUARY, 11));
//                student2.setId("12543345");
//
//                Student student3 = new Student("Student3", 22, new Date(2020, Calendar.FEBRUARY, 12));
//                student3.setId("125657544");
//
//
//                module1.addStudent(student);
//                module1.addStudent(student2);
//
//                module2.addStudent(student);
//                module2.addStudent(student3);
//
//                DateTime start = new DateTime(2020, 5, 1, 12, 0);
//                DateTime end = new DateTime(2020, 12, 1, 12, 0);
//                Course course1 = new Course("Course 1", start, end);
//
//                course1.addModule(module1);
//                course1.addModule(module2);
//                courses.add(course1);

//    DateTimeFormatter format = DateTimeFormat.forPattern("dd-MM-yy");
//    SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yy");
//
//        for (Course course : courses) {
//                System.out.println("------------------------------------");
//                System.out.println("Course name: " + course.getName() + " from " + format.print(course.getStartDate()) + " to " + format.print(course.getEndDate()));
//
//                for (Module module : course.getModules()) {
//        System.out.println("Module: " + module.getId() + "-" + module.getName());
//        System.out.println("  Students enrolled:");
//
//        for (Student students : module.getStudents()) {
//        System.out.println("    " + students.getName() + " - "  + students.getUsername() + " - " + students.getId() + " - " + dt1.format(students.getDateOfBirth()));
//        }
//        }
//        System.out.println("------------------------------------");
//        }

//loop over courses and use course.getModules() to get module information after which I can use module.getStudents()

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