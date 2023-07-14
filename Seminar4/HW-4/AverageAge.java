import java.util.List;

public class AverageAge<T extends User> 
{

  private List<T> users;

  public AverageAge(List<T> users) {
    this.users = users;
  }

  public double getAverageAge() {
    double sum = 0;
    for (T user : users) {
      sum += user.getAge();
    }
    return sum / users.size();
  }
}

// Использование класса AverageAge:
List<Student> students = List.of(
  new Student("Alice", "Smith", 20),
  new Student("Bob", "Johnson", 22),
  new Student("Charlie", "Brown", 19)
);

AverageAge<Student> studentAge = new AverageAge<>(students);
System.out.println("Average student age: " + studentAge.getAverageAge());

List<Teacher> teachers = List.of(
  new Teacher("John", "Doe", 35),
  new Teacher("Jane", "Doe", 40),
  new Teacher("Bob", "Smith", 30)
);

AverageAge<Teacher> teacherAge = new AverageAge<>(teachers);
System.out.println("Average teacher age: " + teacherAge.getAverageAge());

List<Employee> employees = List.of(
  new Employee("Tom", "Jones", 25),
  new Employee("Samantha", "Davis", 28),
  new Employee("David", "Williams", 30)
);

AverageAge<Employee> employeeAge = new AverageAge<>(employees);
System.out.println("Average employee age: " + employeeAge.getAverageAge());
    
}
