# Home_work_Java_OOP-6
## Урок 6. ООП Дизайн и Solid
### Базовое задние:
1) Переписать код в соответствии с Принцип единой ответственности:
```
public class Employee {
частное строковое имя;
частная дата выполнения;
частная базовая зарплата;
public Employee (имя строки, дата выполнения, базовая зарплата) {
this.name = name;
this.dob = dob;
this.baseSalary = Базовая зарплата;
}
общедоступная строка getEmpInfo() {
возвращает "name - " + name + " , dob - " + dob.toString();
}
public int calculateNetSalary() {
int tax = (int) (базовая зарплата * 0.25);//вычислить иным способом
вернуть базовую зарплату - налог;
}
}
```
Подсказка: вынесите метод calculateNetSalary() в отдельный класс

2) Переписать код Вычисление скорости в соответствии с Принцип открытия-закрытия:
```
вычисление скорости общедоступного класса {
общедоступный двойной расчет разрешенной скорости (транспортное средство транспортное средство) {
if (транспортное средство.GetType().equalsIgnoreCase("Автомобиль")) {
return vehicle.getMaxSpeed() * 0.8;
} else if (транспортное средство.GetType().equalsIgnoreCase("Автобус")) {
return vehicle.getMaxSpeed() * 0.6;
}

    return 0.0;
}
}
транспортное средство общего пользования {
максимальная скорость int;
Строковый тип;
общественный транспорт (максимальная скорость int, строковый тип) {
это.maxSpeed = Максимальная скорость;
this.type = тип;
}
public int получает maxSpeed() {
верните это.Максимальная скорость;
}
общедоступная строка GetType() {
верните this.type;
}
}
```
Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), напишите метод calculateAllowedSpeed(). Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP

3) Переписать код в соответствии с Принцип разделения интерфейса:
```
общедоступная форма интерфейса {
двойная область ();
двойной объем();
}
общедоступный класс Circle реализует форму {
частный двойной радиус;
общедоступный круг (двойной радиус) {
this.radius = radius;
}
@Override
общедоступная двойная область () {
возвращает 2 * 3,14 * радиуса;
}
@Override
общедоступный двойной объем() {
создает новое исключение UnsupportedOperationException();
}
}
общедоступный класс Cube реализует форму {
private int edge;
общедоступный Куб (int edge) {
this.edge = ребро;
}
@Переопределить
общедоступную двойную область () {
вернуть 6 * ребро * edge;
}
@Переопределить
общедоступный двойной объем() {
вернуть ребро * edge * edge;
}
}
```
Подсказка: круг не объемная фигура и этому классу не нужен метод volume().

### Задачи со *(подсказок нет!, это же сложные задания)
4) Переписать код в соответствии с Liskov Substitution Principle:
```
public class Rectangle {
private int width;
private int height;
public void setWidth(int width) {
this.width = ширина;
}
public void setHeight(int height) {
это.height = высота;
}
public int area() {
возвращает это.ширина * такая.высота;
}
}
открытый класс Square расширяет прямоугольник {
@Override
общедоступный набор значений voidwidth(int width) {
super.width = ширина;
super.height = ширина;
}
@Override
общедоступный набор значений void (int height) {
super.width = высота;
super.height = высота;
}
}
```
5) Переписать код в соответствии с Dependency Inversion Principle:
```
public class Car {
private PetrolEngine engine;
public Car(PetrolEngine engine) {
this.engine = engine;
}
public void start() {
this.engine.start();
}
}
public class PetrolEngine {
public void start() {
}
}
```
Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.
