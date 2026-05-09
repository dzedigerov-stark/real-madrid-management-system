import java.util.ArrayList;

public class Club {

    private String clubName;
    private double budget;

    private ArrayList<Player> players;

    public Club(String clubName, double budget) {

        this.clubName = clubName;
        this.budget = budget;

        players = new ArrayList<>();
    }

    // Добавление игрока
    public void addPlayer(Player player)
            throws TransferException {

        if (budget < player.getSalary()) {

            throw new TransferException(
                    "Not enough budget for transfer."
            );
        }

        players.add(player);

        budget -= player.getSalary();

        System.out.println(player.getName()
                + " added to the club.");
    }

        players.add(player);

        System.out.println(player.getName()
                + " added to the club.");
    }

    // Показать игроков
    public void showPlayers() {

        if (players.isEmpty()) {

            System.out.println("No players in club.");
        }

        else {

            for (Player player : players) {

                player.displayInfo();
            }
        }
    }

    // Удаление игрока
    public void removePlayer(String name) {

        boolean found = false;

        for (Player player : players) {

            if (player.getName().equalsIgnoreCase(name)) {

                players.remove(player);

                System.out.println(name
                        + " removed from club.");

                found = true;

                break;
            }
        }

        if (!found) {

            System.out.println("Player not found.");
            public void showBudget() {

                System.out.println(
                        "Current budget: " + budget
                );
            }
        }
    }
}

