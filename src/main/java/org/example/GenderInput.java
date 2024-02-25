package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GenderInput {
    public static char getGenderInput(Scanner scanner) {
        String gender = "";
        boolean validGender = false;
        while (!validGender) {
            try {
                System.out.println("Введите пол (M - мужской, W - женский):");
                String genderInput = scanner.nextLine().toUpperCase();
                if (!genderInput.equals("M") && !genderInput.equals("W")) {
                    throw new InputMismatchException("Некорректный формат пола. Введите M для мужского или W для женского строго как это запрашивается программой.");
                }
                gender = genderInput;
                validGender = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        return gender.charAt(0);
    }
}
