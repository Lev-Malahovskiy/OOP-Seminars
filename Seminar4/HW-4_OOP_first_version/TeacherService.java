/*import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TeacherService implements iUserService {
    private List teacherList = new ArrayList();
    private UserComparator userComparator = new UserComparator();

    /* Методы, выполняющие добавление и получение пользователей
     */
   /* @Override
    public void addUser(Teacher teacher) {
    teacherList.add(teacher);
    }
    @Override
    public List getUsers() {
    Collections.sort(teacherList, userComparator);
    return teacherList;
    }
/* 
 * Метод getUsers() также использует обобщенный класс UserComparator для сортировки списка учителей.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherService implements iUserService<Teacher> {

    private List<Teacher> teachers;

    public TeacherService() {
        teachers = new ArrayList<>();
    }

    /* Методы, выполняющие добавление и получение пользователей
    * Метод getUsers() также использует обобщенный класс UserComparator длясортировки списка учителей.
    */


    @Override
    public void addUser(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public Teacher getUser(int index) {
        return teachers.get(index);
    }

    @Override
    public List<Teacher> getAllUsers() {
        return teachers;
    }

    @Override
    public void sortUsers(UserComparator<Teacher> comparator) {
        Collections.sort(teachers, comparator);
    }
}

/*
 * Класс `TeacherService` реализует обобщенный интерфейс `iUserService<Teacher>`. 
 * В нем есть методы `addUser`, `getUser` и `getAllUsers` для добавления, получения и получения списка учителей соответственно.

Метод `sortUsers` принимает как аргумент объект класса `UserComparator`, 
который реализует сравнение объектов класса `Teacher`, и сортирует список учителей с помощью метода `Collections.sort`.
 */