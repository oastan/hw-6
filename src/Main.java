import javax.sound.midi.Soundbank;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Задача 2");
        int clientDeviceYear = 2013;
        if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установить версию приложения для Андроид по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Андроид по ссылке");
        } if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        }
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        boolean oneDay = (deliveryDistance < 20);
        if (oneDay) {
            System.out.println("Потребуется 1 день");
        } else {
            boolean twoDays = (deliveryDistance > 20) && (deliveryDistance < 60);
            if (twoDays) {
                System.out.println("Потребуется 2 дня");
            } else {
                boolean threedays = (deliveryDistance > 60) && (deliveryDistance < 100);
                if (threedays) {
                    System.out.println("Потребуется 3 дня");
                } else {
                    System.out.println("Доставка не предусмотрена");
                }

            }
        }
        System.out.println("Задача 3");
        int year = 1800;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является весокостным");
        } else {
            System.out.println(year + " год не является весокостным");
        }
        System.out.println("Задача 5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Ферваль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Авгус");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
        }
              int seasonsOfYear = 12;
        switch (seasonsOfYear) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не сушествует");
        }















        }}






























