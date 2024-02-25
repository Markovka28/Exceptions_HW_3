package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumberInput {
    public static String getPhoneNumberInput(Scanner scanner) {
        String phoneNumber = "";
        boolean validPhone = false;
        while (!validPhone) {
            try {
                System.out.println("Введите номер телефона в формате +7 (***) *** ** **:");
                String phonePattern = "\\+7 \\(\\d{3}\\) \\d{3} \\d{2} \\d{2}";
                phoneNumber = scanner.nextLine();
                if (!phoneNumber.matches(phonePattern)) {
                    throw new InputMismatchException("Некорректный формат номера телефона. Введите номер в формате +7 (***) *** ** ** с пробелами исключительно числовыми символами");
                }
                validPhone = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        return phoneNumber;
    }
}