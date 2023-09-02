package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String userInput = "Степанов Степан Степанович 123456789";
            String[] inputValues = userInput.split("\\s+");
            if (inputValues.length > 4) {
                throw new IllegalArgumentException("Количество данных больше 4");
            }
            else if (inputValues.length < 4)
                throw new IllegalArgumentException("Количество данных меньше 4");

            String lastName = inputValues[0];
            String firstName = inputValues[1];
            String middleName = inputValues[2];
            long phoneNumber = Long.parseLong(inputValues[3]);
            UserInputData userData = new UserInputData(lastName, firstName, middleName, phoneNumber);
            FileWriter fileWriter = new FileWriter(lastName + ".txt", true);
            fileWriter.write(userData.toString() + System.lineSeparator());
            fileWriter.close();
            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Некорректный формат номера телефона.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}