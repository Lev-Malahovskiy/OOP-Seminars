import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Teacher {
    private String name; 
    private int experience; 
    public Teacher(String name, int experience) { 
        this.name = name; 
        this.experience = experience; 
    } 
        /*
         * Класс Teacher содержит два поля: имя учителя и опыт работы. 
         * Конструкторкласса принимает два параметра и инициализирует соответствующие поля. 
         * Дляудобства отображения объекта класса Teacher переопределен метод toString().
         */

    public String getName() { 
        return name; 
    } 
    public int getExperience() { 
        return experience; } 

        @Override  
        public String toString() {
            return "Teacher{" + 
            "name='" + name + ''' + 
            ", experience=" + experience +
             '}'; 

        }
             
             public interface iUserService<T> { 
                void add(T user);
                 void remove(T user); 
                 List<T> getUsers();}
    
}
