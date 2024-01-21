import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        1.
        Есть два списка одинаковой длины с числами. Написать функцию, которая
        вернет список с элементами True или False, где значение на i-том месте зависит от того,
        равны ли элементы двух списков под номером i.
        Например, {1, 2, 3, 4} и {5, 2, 3, 8} вернет {False, True, True, False}
         */

        List<Integer> list1 = List.of(1,5,5,7,8);
        List<Integer> list2 = List.of(1,7,8,4,8);

        System.out.println(NumberComparisons.numberComparisons(list1,list2));

        System.out.println("-".repeat(100));

        /*
        2.
        Дан List<Person>. Ваша задача, написать метод, который удаляет из листа всех Person:
        заданного возраста
        возраста, который больше максимально допустимого и меньше минимально допустимого
        (например, заданы границы  от 4 до 8, то все чей возраст меньше 4 и больше 8 удаляются из списка)

        с именами, не содержащими заданную подстроку, без учета регистра. Например, если задана подстрока “ол”
        в списке должны остаться “Оля”, “Коля”, “Николай” а, например, “Сергей” должен быть удален.
        Подсказка: вы можете использовать метод removeIf, просто реализуя разные Predicate<Person>
         */

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 25));
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob", 18));
        persons.add(new Person("Sergey", 40));
        persons.add(new Person("Nikolay", 22));

        System.out.println(persons);

        //ManipulationsInListOfPersons.removeByAge(persons,25);

        //ManipulationsInListOfPersons.removeByAgeRange(persons,20,30);

        ManipulationsInListOfPersons.removeBySymbolsInName(persons, "ol");
    }
}