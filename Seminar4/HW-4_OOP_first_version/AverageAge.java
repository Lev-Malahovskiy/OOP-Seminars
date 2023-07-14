/*public class AverageAge {
    private List userList;
    public AverageAge(List userList) {
    this.userList = userList;
    }
    public double getAverageAge() {
    double ageSum = 0;
    for (T user : userList) {
    ageSum += user.getAge();
    }
    return ageSum / userList.size();
    }
    }
    /*
     * Класс принимает список пользователей обобщенного типа T, 
     * которыйрасширяет класс User. Метод getAverageAge() вычисляет сумму возрастов пользователей и делит ее на количество пользователей, 
     * возвращая средний возраст.
     */ 

     public class AverageAge<T extends HasAge> {

        private List<T> objects;
    
        public AverageAge(List<T> objects) {
            this.objects = objects;
        }
    
        public double calculateAverageAge() {
            int totalAge = 0;
            for (T object : objects) {
                totalAge += object.getAge();
            }
            return (double) totalAge / objects.size();
        }
    
        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("John", 20));
            students.add(new Student("Sarah", 19));
    
            List<Teacher> teachers = new ArrayList<>();
            teachers.add(new Teacher("Peter", 35));
            teachers.add(new Teacher("Mary", 42));
    
            List<Worker> workers = new ArrayList<>();
            workers.add(new Worker("Jack", 25));
            workers.add(new Worker("William", 31));
    
            AverageAge<Student> studentAverageAge = new AverageAge<>(students);
            AverageAge<Teacher> teacherAverageAge = new AverageAge<>(teachers);
            AverageAge<Worker> workerAverageAge = new AverageAge<>(workers);
    
            System.out.println("Average student age: " + studentAverageAge.calculateAverageAge());
            System.out.println("Average teacher age: " + teacherAverageAge.calculateAverageAge());
            System.out.println("Average worker age: " + workerAverageAge.calculateAverageAge());
        }
    }

    /*
     * Здесь мы создаем класс `AverageAge`, который принимает список объектов типа `T`, 
     * который должен реализовать интерфейс `HasAge` с методом `getAge`. В конструкторе мы инициализируем поле `objects`.
Метод `calculateAverageAge` вычисляет средний возраст, перебирая список объектов и суммируя их возрасты. 
Результат возвращается в виде типа `double`.
В методе `main` мы создаем три списка объектов - студентов, 
учителей и работников, и передаем каждый список в соответствующий объект типа `AverageAge`. Затем мы выводим результаты на консоль.
     */