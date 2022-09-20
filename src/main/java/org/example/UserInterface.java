package org.example;

import java.util.Scanner;

public class UserInterface {
    Scanner sc = new Scanner(System.in);
    int userChoice;

    public void startUI() {

        // User interface
        Database data = new Database();
        do {
            System.out.println("""
                    Welcome to SuperHeroesDB!
                    1. Create SuperHero
                    2. Access the SuperHeroDB
                    3. Search for SuperHero
                    9. Terminate
                    """);

            userChoice = readUserChoice();
            sc.nextLine();

            if (userChoice == 1) {
                System.out.println("Enter the real name of your SuperHero");
                String realName = sc.nextLine();
                System.out.println("Enter the known name of your SuperHero");
                String heroName = sc.nextLine();
                System.out.println("Enter the special power of your SuperHero");
                String heroPower = sc.nextLine();
                System.out.println("Enter the strength of your SuperHero");
                double heroStrength = sc.nextDouble();
                System.out.println("Enter the creation year of your SuperHero");
                int creationYear = sc.nextInt();
                System.out.println("Is your SuperHero a human? Anser with 'YES'or 'NO'");
                String isHumanString = sc.next();
                boolean isHuman = false;

                if (isHumanString.equalsIgnoreCase("YES")) {
                    isHuman = true;

                    data.addHero(realName, heroName, heroPower, heroStrength, creationYear, isHuman);
                }

            } else if (userChoice == 2) { // print db
                data.printDB();
            } else if (userChoice == 3) { // search function here
                System.out.println("Enter valid search parameter (only name or the known name of the SuperHero)");
                String name = sc.next();
                SuperHero s = data.findHero(name);
                if (s == null)
                    System.out.println("No SuperHero was found based on your search parameter.");
                if (s != null)
                    System.out.println(s);
            }

        } while (userChoice != 9);
    }

    public int readUserChoice () {
        while (!sc.hasNextInt()) {
            String text = sc.next();
            System.out.println(text + " is not a valid number. Try again.");
        }
        return sc.nextInt();
    }
}