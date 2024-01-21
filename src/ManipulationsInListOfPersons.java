import java.util.List;

public class ManipulationsInListOfPersons {
    public static void removeByAge(List<Person> persons, int age){
        persons.removeIf(person -> person.getAge() == age);
        System.out.println(persons);
    }
    public static void removeByAgeRange(List<Person> persons, int minAge, int maxAge){
        persons.removeIf(person -> person.getAge() < minAge || person.getAge() > maxAge);
        System.out.println(persons);
    }
    public static void removeBySymbolsInName(List<Person> persons, String substring){
        for (Person person : persons) {
            if (person.getName().toLowerCase().contains(substring.toLowerCase())){
                System.out.println(person);
            }
        }
    }
}
