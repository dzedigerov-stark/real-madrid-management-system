public class Player extends Person {

    private int number;
    private String position;
    private double salary;

    public Player(String name, int age, int number,
                  String position, double salary) {

        super(name, age);

        this.number = number;
        this.position = position;
        this.salary = salary;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void displayInfo() {

        System.out.println(
                "Player: " + getName() +
                        " | Age: " + getAge() +
                        " | Number: " + number +
                        " | Position: " + position +
                        " | Salary: " + salary
        );
    }
}
