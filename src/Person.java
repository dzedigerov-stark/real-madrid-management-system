public abstract class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter для name
    public String getName() {
        return name;
    }

    // Setter для name
    public void setName(String name) {
        this.name = name;
    }

    // Getter для age
    public int getAge() {
        return age;
    }

    // Setter для age
    public void setAge(int age) {
        this.age = age;
    }

    // Абстрактный метод
    public abstract void displayInfo();
}
