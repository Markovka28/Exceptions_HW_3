package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NameInput {
    public static String getNameInput(Scanner scanner) {
        String fullName = "";
        boolean validName = false;
        while (!validName) {
            try {
                System.out.println("Введите Фамилию Имя Отчество:");
                String[] nameParts = scanner.nextLine().split(" ");
                if (nameParts.length != 3) {
                    throw new InputMismatchException("Некорректный формат Фамилии Имени Отчества. Введите Фамилию Имя Отчество через пробел.");
                }
                if (!nameParts[0].matches("[a-zA-Z]+") || !nameParts[1].matches("[a-zA-Z]+") || !nameParts[2].matches("[a-zA-Z]+")) {
                    throw new InputMismatchException("Фамилия, Имя и Отчество должны содержать только текстовые данные.");
                }
                fullName = nameParts[0] + " " + nameParts[1] + " " + nameParts[2];
                validName = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        return fullName;
    }
}

