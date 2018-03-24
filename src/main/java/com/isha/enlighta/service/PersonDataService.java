package com.isha.enlighta.service;

import com.isha.enlighta.model.PersonData;

import java.util.ArrayList;
import java.util.List;

public class PersonDataService {

    private List<PersonData> personData;

    private static PersonDataService instance = null;
    public static PersonDataService getInstance(){
        if(instance == null){
            instance = new PersonDataService();
        }
        return instance;
    }

    public PersonDataService(){
        personData = new ArrayList<PersonData>();
        personData.add(new PersonData(1, "Sam Hills", "2.3.1986", "earth","male","United States",62000));
        personData.add(new PersonData(2, "Jacob Kirk", "2.3.1976", "earth","male","United States",55000));
        personData.add(new PersonData(3, "Sia Ramon", "2.3.1987", "earth","female","United States",78000));
        personData.add(new PersonData(4, "Li Chi", "2.3.1985", "earth","female","United States",84000));
        personData.add(new PersonData(5, "Tim James", "2.3.1996", "earth","male","United States",67000));
        personData.add(new PersonData(6, "Mark Hoddy", "2.3.1956", "earth","male","United States",45000));
        personData.add(new PersonData(7, "Lisa Huggs", "2.3.1990", "jupiter","female","ABC States",76000));
        personData.add(new PersonData(8, "Kia Gates", "2.3.1967", "earth","female","United States",90000));
        personData.add(new PersonData(9, "Harry Potter", "2.3.1989", "jupiter","male","ABC States",35000));
        personData.add(new PersonData(10, "Tom Riddle", "2.3.1993", "earth","male","United States",66000));

    }

    public List<PersonData> fetchPersonData(){
        return personData;
    }

    public int getTotalPersonInGalaxy(){
        return personData.size();
    }

    public int getTotalPersonOnPlanet(String planet){
        int size = 0;
        for(PersonData p: personData){
            if(p.getPlanetOfResidence().equalsIgnoreCase(planet))
                size++;
        }
        return size;
    }

    public float getPerCapitaIncomeInGalaxy(){
        float income = 0;
        for (PersonData p: personData){
            income = income + p.getAnnualIncome();
        }
        return income/personData.size();
    }

    public double getPerCapitaStandardDeviation(){
        double sum = 0.0, standardDeviation = 0.0;

        for(PersonData p : personData) {
            sum += p.getAnnualIncome();
        }

        double mean = sum/personData.size();

        for(PersonData p: personData) {
            standardDeviation += Math.pow(p.getAnnualIncome() - mean, 2);
        }

        return Math.sqrt(standardDeviation/personData.size());
    }

    public float getPerCapitaIncomeOnPlanet(String planet){
        float income = 0;
        for (PersonData p: personData){
            if(p.getPlanetOfResidence().equalsIgnoreCase(planet))
                income = income + p.getAnnualIncome();
        }
        return income/personData.size();
    }

    public PersonData createPersonData(int id, String fullName, String dateOfBirth, String planetOfResidence, String gender, String localAddress, int annualIncome){
        PersonData personData = new PersonData(id,fullName,dateOfBirth,planetOfResidence,gender,localAddress,annualIncome);
        this.personData.add(personData);
        return personData;
    }
}
