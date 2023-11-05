/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;

interface Sports {
    int getNumberOfGoals();
    String dispTeam();
}

class Hockey implements Sports {
    private String team1;
    private String team2;
    private int goalsTeam1;
    private int goalsTeam2;

    public Hockey(String team1, String team2, int goalsTeam1, int goalsTeam2) {
        this.team1 = team1;
        this.team2 = team2;
        this.goalsTeam1 = goalsTeam1;
        this.goalsTeam2 = goalsTeam2;
    }

    @Override
    public int getNumberOfGoals() {
        return goalsTeam1 + goalsTeam2;
    }

    @Override
    public String dispTeam() {
        if (goalsTeam1 > goalsTeam2) {
            return team1 + " wins!";
        } else if (goalsTeam2 > goalsTeam1) {
            return team2 + " wins!";
        } else {
            return "It's a draw!";
        }
    }
}

class Football implements Sports {
    private String team1;
    private String team2;
    private int goalsTeam1;
    private int goalsTeam2;

    public Football(String team1, String team2, int goalsTeam1, int goalsTeam2) {
        this.team1 = team1;
        this.team2 = team2;
        this.goalsTeam1 = goalsTeam1;
        this.goalsTeam2 = goalsTeam2;
    }

    @Override
    public int getNumberOfGoals() {
        return goalsTeam1 + goalsTeam2;
    }

    @Override
    public String dispTeam() {
        if (goalsTeam1 > goalsTeam2) {
            return team1 + " wins!";
        } else if (goalsTeam2 > goalsTeam1) {
            return team2 + " wins!";
        } else {
            return "It's a draw!";
        }
    }
}

public class SportsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the team name for Hockey (Team 1): ");
        String hockeyTeam1 = scanner.nextLine();
        System.out.print("Enter the team name for Hockey (Team 2): ");
        String hockeyTeam2 = scanner.nextLine();
        System.out.print("Enter the number of goals for Team 1 in Hockey: ");
        int hockeyGoalsTeam1 = scanner.nextInt();
        System.out.print("Enter the number of goals for Team 2 in Hockey: ");
        int hockeyGoalsTeam2 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the team name for Football (Team 1): ");
        String footballTeam1 = scanner.nextLine();
        System.out.print("Enter the team name for Football (Team 2): ");
        String footballTeam2 = scanner.nextLine();
        System.out.print("Enter the number of goals for Team 1 in Football: ");
        int footballGoalsTeam1 = scanner.nextInt();
        System.out.print("Enter the number of goals for Team 2 in Football: ");
        int footballGoalsTeam2 = scanner.nextInt();

        Hockey hockeyGame = new Hockey(hockeyTeam1, hockeyTeam2, hockeyGoalsTeam1, hockeyGoalsTeam2);
        Football footballGame = new Football(footballTeam1, footballTeam2, footballGoalsTeam1, footballGoalsTeam2);

        System.out.println("\nHockey Game: " + hockeyGame.dispTeam());
        System.out.println("Total Goals in Hockey: " + hockeyGame.getNumberOfGoals());

        System.out.println("\nFootball Game: " + footballGame.dispTeam());
        System.out.println("Total Goals in Football: " + footballGame.getNumberOfGoals());

        scanner.close();
    }
}

