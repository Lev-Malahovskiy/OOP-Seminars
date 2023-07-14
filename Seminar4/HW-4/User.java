public interface User<T> {
    String getFirstName();
    String getLastName();
    int getAge();
    T getRole();
  }
  
  public interface iUserService<T extends User> {
    void createUser(T user);
    List<T> getUsers();
  }
  
  public interface iUserController<T extends User> {
    void createUser(T user);
    List<T> getUsers();
  }
  
  public class Student implements User<Student> {
  
    private String firstName;
    private String lastName;
    private int age;
  
    public Student(String firstName, String lastName, int age) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
    }
  
    @Override
    public String getFirstName() {
      return firstName;
    }
  
    @Override
    public String getLastName() {
      return lastName;
    }
  
    @Override
    public int getAge() {
      return age;
    }
  
    @Override
    public Student getRole() {
      return this;
    }
  }
  
  public class Teacher implements User<Teacher> {
  
    private String firstName;
    private String lastName;
    private int age;
  
    public Teacher(String firstName, String lastName, int age) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
    }
  
    @Override
    public String getFirstName() {
      return firstName;
    }
  
    @Override
    public String getLastName() {
      return lastName;
    }
  
    @Override
    public int getAge() {
      return age;
    }
  
    @Override
    public Teacher getRole() {
      return this;
    }
  }
  
  public class Employee implements User<Employee> {
  
    private String firstName;
    private String lastName;
    private int age;
  
    public Employee(String firstName, String lastName, int age) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
    }
  
    @Override
    public String getFirstName() {
      return firstName;
    }
  
    @Override
    public String getLastName() {
      return lastName;
    }
    
    @Override
    public int getAge() {
      return age;
    }
  
    @Override
    public Employee getRole() {
      return this;
    }
  }
  
  public class TeacherService implements iUserService<Teacher> {
  
    @Override
    public void createUser(Teacher user) {
      System.out.println("Creating teacher: " + user.toString());
    }
  
    @Override
    public List<Teacher> getUsers() {
      List<Teacher> teachers = List.of(
        new Teacher("John", "Doe", 35),
        new Teacher("Jane", "Doe", 40),
        new Teacher("Bob", "Smith", 30)
      );
      return teachers;
    }
  }
  
  public class TeacherController<T extends User> implements iUserController<T> {
  
    iUserService<T> userService;
  
    public TeacherController(iUserService<T> userService) {
      this.userService = userService;
    }
  
    @Override
    public void createUser(T user) {
      userService.createUser(user);
    }
  
    @Override
    public List<T> getUsers() {
      return userService.getUsers();
    } 
  }
  
  public class AverageAge<T extends User> {
  
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