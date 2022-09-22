package org.example;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Database {
    private ArrayList<SuperHero> superHeroDB = new ArrayList<>();
    ArrayList<SuperHero> searchResult = new ArrayList<>();

        public void addHero(String realName, String heroName, String heroPower, double heroStrength, int creationYear, boolean isHuman) {
            SuperHero data = new SuperHero(realName, heroName, heroPower, heroStrength, creationYear, isHuman);
            superHeroDB.add(data);
        }

        public void printDB() {
            for (SuperHero hero : superHeroDB) {
                System.out.println(hero);
            }
        }

        public ArrayList<SuperHero> getAllSuperHeroes() {
            return superHeroDB;
        }

        public SuperHero findHero(String name) {
            for (SuperHero hero : superHeroDB) {
                if(hero.getHeroName().equals(name)) {
                    return hero;
                }
                if(hero.getRealName().equals(name)) {
                    return hero;
                }
            }
            return null;
        }

        public void editSuperHero() {
            for (int i = 0; i < searchResult.size(); i++) {
                System.out.println(i++ + ":" + searchResult.get(i));
            }
        }
    }
