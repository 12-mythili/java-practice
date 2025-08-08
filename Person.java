import java.util.*;

class Person {
    String name;
    String department;
    int age;

    public Person(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public static void main(String[] args) {

        Map<String, List<Person>> map = new HashMap<>();

        Person m1 = new Person("Mythili", "IT", 19);
        Person m2 = new Person("Mithra", "IT", 20);
        Person m3 = new Person("Vishnu", "ECE", 21);

        List<Person> personList = new ArrayList<>();
        personList.add(m1);
        personList.add(m2);
        personList.add(m3);

        map.put("Student", personList);

        List<Person> list = map.get("Student");
        for (Person p : list) {
            System.out.println("Name: " + p.name);
            System.out.println("Department: " + p.department);
            System.out.println("Age: " + p.age);
            System.out.println();
        }
    }
}
