public class UserComparator<T extends User> implements Comparator<T> {

    private String sortByFieldName;

    public UserComparator(String sortByFieldName) {
        this.sortByFieldName = sortByFieldName;
    }

    @Override
    public int compare(T o1, T o2) {
        try {
            Field field = o1.getClass().getDeclaredField(sortByFieldName);
            field.setAccessible(true);
            Comparable field1Comparable = (Comparable) field.get(o1);
            Comparable field2Comparable = (Comparable) field.get(o2);
            return field1Comparable.compareTo(field2Comparable);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

/*Здесь `UserComparator` реализует обобщенный интерфейс `Comparator<T>`, 
где `T` - любой тип, который наследуется от `User`. 
В конструкторе мы передаем имя поля, по которому нужно сортировать объекты.

В методе `compare` мы получаем поле объектов `o1` и `o2`,
 далее с помощью `Comparable` мы может сравнить их значения и вернуть результат. */