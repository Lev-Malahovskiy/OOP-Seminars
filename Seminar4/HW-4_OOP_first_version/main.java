import java.util.ArrayList;

import java.util.Collections;

import java.util.Iterator;

import java.util.List;

public static void main (String[] args) {

    TeacherService teacherService = new TeacherService();{
    // Добавление учителей в список 
    teacherService.add(new Teacher("Иван Иванов", 10)); 
    teacherService.add(new Teacher("Петр Петров", 5)); 
    teacherService.add(new Teacher("Александр Сидоров", 20)); 
    
    // Вывод списка учителей по опыту работы 
    teacherService.printTeachersByExperience();}
}

/*import java.util.ArrayList;

import java.util.Collections;

import java.util.Iterator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        iUserService<Teacher> userService = new TeacherService();
        TeacherController<Teacher> teacherController = new TeacherController<>(userService);
        // Далее можно использовать методы из iUserController
    }
}
