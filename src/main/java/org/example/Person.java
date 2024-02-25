package org.example;

public class Person {
    private String fullName;

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    private String dateOfBirth;
    private String phoneNumber;
    private char gender;

    public Person(String fullName, String dateOfBirth, String phoneNumber, char gender) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "(" +
                "ФИО: " + fullName +
                ", Дата рождения: " + dateOfBirth +
                ", номер телефона: " + phoneNumber +
                ", Пол:" + gender +
                ')';
    }
}
