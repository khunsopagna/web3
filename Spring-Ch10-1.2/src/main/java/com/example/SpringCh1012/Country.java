package com.example.SpringCh1012;

public class Country {
    private String name;
    private int population;

    public static Country of(String name, int population) {
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;	
    }

    // Getter for population
    public int getPopulation() {
        return population;
    }

    // Setter for population
    public void setPopulation(int population) {
        this.population = population;
    }
}
