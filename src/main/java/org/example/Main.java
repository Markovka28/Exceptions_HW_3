package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = NameInput.getNameInput(scanner);
        String dateOfBirth = DateOfBirthInput.getDateOfBirthInput(scanner);
        String phoneNumber = PhoneNumberInput.getPhoneNumberInput(scanner);
        char gender = GenderInput.getGenderInput(scanner);

        Person person = new Person(fullName, dateOfBirth, phoneNumber, gender);

        System.out.println("Данные пользователя:");
        System.out.println(person);
    }
}
