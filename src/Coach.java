public class Coach extends Person {

    private int experience;

    public Coach(String name, int age, int experience) {

        super(name, age);

        this.experience = experience;
    }

    @Override
    public void displayInfo() {

        System.out.println(
                "Coach: " + getName() +
                        " | Age: " + getAge() +
                        " | Experience: " + experience
        );
    }
}
