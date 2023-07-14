import java.util.Collections;
import java.util.List;

public class TeacherService implements iUserService<Teacher> {

  @Override
  public void createUser(Teacher teacher) {
    System.out.println("Creating teacher: " + teacher.toString());
  }

  @Override
  public List<Teacher> getUsers() {
    List<Teacher> teachers = List.of(
      new Teacher("John", "Doe", 35),
      new Teacher("Jane", "Doe", 40),
      new Teacher("Bob", "Smith", 30)
    );
    Collections.sort(teachers, new UserComparator());
    return teachers;
  }
}