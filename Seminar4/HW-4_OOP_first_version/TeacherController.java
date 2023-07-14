public class TeacherController<T extends Teacher> implements iUserController<T> {

    private iUserService<T> userService;

    public TeacherController(iUserService<T> userService) {
        this.userService = userService;
    }

    @Override
    public void addUser(T user) {
        userService.addUser(user);
    }

    @Override
    public T getUser(int index) {
        return userService.getUser(index);
    }

    @Override
    public List<T> getAllUsers() {
        return userService.getAllUsers();
    }

    @Override
    public void sortUsers(UserComparator<T> comparator) {
        userService.sortUsers(comparator);
    }
}

/*
 * Здесь мы создаем класс `TeacherController`, который принимает объект типа `iUserService<T>`, 
 * который также является обобщенным. В конструкторе мы инициализируем поле `userService` этим объектом.
В методах `addUser`, `getUser` и `getAllUsers` мы вызываем соответствующие методы из `userService`.
Метод `sortUsers` принимает объект класса `UserComparator`, который реализует сравнение объектов класса `Teacher`, 
и передает его в метод `sortUsers` интерфейса `iUserService`. Он сортирует список учителей с помощью метода `Collections.sort`.
Обратите внимание, что параметр типа `T` определяется в классе, который использует `TeacherController`.
 */