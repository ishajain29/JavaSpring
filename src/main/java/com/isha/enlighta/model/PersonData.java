package com.isha.enlighta.model;

public class PersonData {

    private int id;
    private String fullName;
    private String dateOfBirth;
    private String planetOfResidence;
    private String gender;
    private String localAddress;
    private int annualIncome;

    public PersonData() {  }


    public PersonData(int id, String fullName, String dateOfBirth, String planetOfResidence, String gender, String localAddress, int annualIncome) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.planetOfResidence = planetOfResidence;
        this.gender = gender;
        this.localAddress = localAddress;
        this.annualIncome = annualIncome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlanetOfResidence() {
        return planetOfResidence;
    }

    public void setPlanetOfResidence(String planetOfResidence) {
        this.planetOfResidence = planetOfResidence;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public int getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(int annualIncome) {
        this.annualIncome = annualIncome;
    }
}
