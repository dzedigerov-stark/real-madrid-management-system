import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Club realMadrid =
                new Club("Real Madrid", 1000000);

        while (true) {

            System.out.println("\n==============================");
            System.out.println(" REAL MADRID CLUB MANAGEMENT ");
            System.out.println("==============================");

            System.out.println("1. Add player");
            System.out.println("2. Show players");
            System.out.println("3. Remove player");
            System.out.println("4. Show budget");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");

            int choice;

            try {

                choice = scanner.nextInt();

            } catch (Exception e) {

                System.out.println("Please enter a number.");

                scanner.nextLine();

                continue;

            }

            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter player name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();

                    System.out.print("Enter number: ");
                    int number = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter position: ");
                    String position = scanner.nextLine();

                    System.out.print("Enter salary: ");
                    double salary = scanner.nextDouble();

                    Player player =
                            new Player(name, age,
                                    number, position, salary);

                    try {

                        realMadrid.addPlayer(player);

                    } catch (TransferException e) {

                        System.out.println(e.getMessage());

                    } finally {

                        System.out.println("Transfer operation finished.");
                    }

                    break;

                case 2:

                    realMadrid.showPlayers();

                    break;

                case 3:

                    System.out.print("Enter player name to remove: ");

                    String removeName =
                            scanner.nextLine();

                    realMadrid.removePlayer(removeName);

                    break;

                case 4:

                    realMadrid.showBudget();

                    break;

                case 5:

                    System.out.println("Program ended.");

                    return;

                    System.out.println("Program ended.");

                    return;

                default:

                    System.out.println("Invalid option.");

            }
        }
    }
}