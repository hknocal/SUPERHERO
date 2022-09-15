package org.example;

public class SuperHero {
    private String realName;
    private String heroName;
    private String heroPower;
    private double heroStrength;
    private int creationYear;
    private boolean isHuman;

    // Constructor

    public SuperHero(String realName, String heroName, String heroPower, double heroStrength, int creationYear, boolean isHuman) {
        this.realName = realName;
        this.heroName = heroName;
        this.heroPower = heroPower;
        this.heroStrength = heroStrength;
        this.creationYear = creationYear;
        this.isHuman = isHuman;
    }

    // Getters

    public String getRealName () {
        return realName;
    }
    public String getHeroName () {
        return heroName;
    }

    public String getHeroPower() {
        return heroPower;
    }

    public double getHeroStrength () {
        return heroStrength;
    }

    public int getCreationYear () {
        return creationYear;
    }

    public boolean getIsHuman() {
        return isHuman;
    }

    // Setters

    public void setRealName (String realName) {
        this.realName = realName;
    }
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setHeroPower(String heroPower) {
        this.heroPower = heroPower;
    }

    public void setHeroStrength(double heroStrength) {
        this.heroStrength = heroStrength;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public void setIsHuman(boolean ifHuman) {
        this.isHuman = isHuman;
    }

    public String toString() {
        return "Name: " + realName + "\n" + "Hero name: " + heroName + "\n" + "Special power: " + heroPower + "\n" + "Hero strength level: " + heroStrength + "\n" + "Creation year: " +  creationYear + "\n" + "Is the SuperHero a human: " + isHuman + "\n";
    }
}