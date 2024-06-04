package ObjectsAndClasses.OrderByAge;

public class Person {
    private String name;
    private String ID;
    private int age;


    public Person(String name, String id, int age) {
        this.name = name;
        ID = id;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }
}
