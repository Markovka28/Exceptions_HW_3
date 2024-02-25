package org.example;

public class PersonInfoPrinter {
    public static void printPersonInfo(Person person) {
        System.out.println("Информация о человеке:");
        System.out.println("ФИО: " + person.getFullName());
        System.out.println("Дата рождения: " + person.getDateOfBirth());
        System.out.println("Номер телефона: " + person.getPhoneNumber());
        System.out.println("Пол: " + (person.getGender() == 'M' ? "Мужской" : "Женский"));
    }
}

