package org.example;

import java.util.Scanner;

public class UserInterface {
    Scanner sc = new Scanner(System.in);
    int userChoice;
    Database data = new Database();

    public void startUI() {

        // User interface
        do {
            System.out.println("""
                    Welcome to SuperHeroesDB!
                    1. Create SuperHero
                    2. Access the SuperHeroDB
                    3. Search for SuperHero
                    4. Edit SuperHero
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
            } else if (userChoice == 4) {
                System.out.println("Enter the SuperHero number you would like to edit:");
                int number = sc.nextInt();
                sc.nextLine();

                SuperHero editSuperHero = data.searchResult.get(number -1);
                System.out.println("Edit SuperHero" + editSuperHero);
                System.out.println("Press ENTER to edit your SuperHero" +
                        "Press ENTER again to cancel edit");
                System.out.println("Real name" + editSuperHero.getRealName());
                String newReal = sc.nextLine();
                if (!newReal.isEmpty())
                    editSuperHero.setRealName(newReal);

                System.out.println("SuperHero name" + editSuperHero.getHeroName());
                String newName = sc.nextLine();
                if (!newName.isEmpty())
                    editSuperHero.setHeroName(newName);

                System.out.println("Special power" + editSuperHero.getHeroPower());
                String newPower = sc.nextLine();
                if (!newPower.isEmpty())
                    editSuperHero.setHeroPower(newPower);

                System.out.println("Strength level" + editSuperHero.getHeroStrength());
                String newStrength = sc.nextLine();
                if (!newStrength.isEmpty())
                    editSuperHero.setHeroStrength(Double.parseDouble(newStrength));

                System.out.println("Creation year" + editSuperHero.getCreationYear());
                String newCreationYear = sc.nextLine();
                if (!newCreationYear.isEmpty())
                    editSuperHero.setCreationYear(Integer.parseInt(newCreationYear));

                System.out.println("Human or not" + editSuperHero.getIsHuman());
                String newHuman = sc.nextLine();
                if (!newHuman.isEmpty())
                    editSuperHero.setIsHuman(Boolean.logicalOr(true, false));
            }

        } while (userChoice != 9);

        }

    public int readUserChoice() {
        while (!sc.hasNextInt()) {
            String failInput = sc.next();
            System.out.println(failInput + " is not a valid number. Try again.");
        }
        return sc.nextInt();
    }
}