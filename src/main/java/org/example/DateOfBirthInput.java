package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateOfBirthInput {
    public static String getDateOfBirthInput(Scanner scanner) {
        String dateOfBirth = "";
        boolean validDate = false;
        while (!validDate) {
            try {
                System.out.println("Введите дату рождения в формате dd.MM.yyyy:");
                String dateOfBirthStr = scanner.nextLine();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                dateFormat.setLenient(false);
                dateFormat.parse(dateOfBirthStr);
                dateOfBirth = dateOfBirthStr;
                validDate = true;
            } catch (ParseException e) {
                System.out.println("Ошибка: Некорректный формат даты. Введите дату строго формате dd.MM.yyyy.");
            }
        }
        return dateOfBirth;
    }
}