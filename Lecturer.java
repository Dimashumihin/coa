import java.util.*;

class Course {
  
  private static int count = 0;
  private int id;
  private final String name;
  private ArrayList<Student> students = new ArrayList<>();
  private Lecturer lecturer;
  
  public Course(String name) {
    id = ++count;
    this.name = name;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }
  
  public void addStudent(Student student) {
    students.add(student);
  }
  
  public ArrayList<Student> getStudents() {
    return this.students;
  }

  public void assignLecturer(Lecturer lecturer) {
    this.lecturer = lecturer;
  }

  public Lecturer getLecturer() {
    return this.lecturer;
  }
  
}
