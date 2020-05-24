import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

class Main {

  public static void main(String[] args) throws IOException {
    Charset charset = Charset.forName("UTF-8");
    String studentsFileName = "res/students.txt";
    List<String> studentsNames = Files.readAllLines(Paths.get(studentsFileName), charset);
    
    Institution institution = new Institution("Институт", "г. Город");
    
    studentsNames.forEach(name -> institution.addStudent(new Student(name)));
    
    
    institution.addCourse(new Course("Русский"));
    institution.addCourse(new Course("История"));
    institution.addCourse(new Course("Обж"));

    institution.addLecturer(new Lecturer("Русский"));
    institution.addLecturer(new Lecturer("История"));
    institution.addLecturer(new Lecturer("Обж Илья Александрович Малясин"));

    /*
    institution.addStudent(new Student("Людмила Михайлова Люсина"));
    institution.addStudent(new Student("Илья Александрович Малясин"));
    institution.addStudent(new Student("Михаил Древескин Юри"));
    */

    for (int i = 1; i < 4; i++) { 
      new LecturerForCourseAssigner(institution.getLecturer(i), institution.getCourse(i)).assign();
      for (int j = 1; j < 4; j++) { 
        new StudentForCourseAssigner(institution.getStudent(j), institution.getCourse(i)).assign();
      }
    }

    Student s = institution.getStudent(1);
    System.out.println();
    System.out.println(s.getName() + " изучает предметы:");
    s.getCourses().forEach(c -> System.out.println(c.getName()));

    System.out.println("\nпредмет " + institution.getCourse(1).getName() + " изучают:\n");
    institution.getCourse(1).getStudents().forEach(st -> System.out.println(st.getName()));
    
    System.out.println("\nпредмет " + institution.getCourse(3).getName() + " ведёт:");
    System.out.println(institution.getCourse(3).getLecturer().getName());
    
    institution.getCourse(3).assignLecturer(institution.getLecturer(3));
    
  }
}
