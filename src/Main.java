import java.time.LocalDate;

public class Main {
    public static void leapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

    }

    public static void osUpdate(int clientOs, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка ввода");
        }

    }
    public static byte deliveryTime (int deliveryDistance) {
        byte deliveryTime = 0;
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
        }
        return deliveryTime;
    }
    public static void main(String[] args) {
        // Задание №1
        System.out.println("Задание №1");
        int year = 2018;
        leapYear(year);

        // Задание №2
        System.out.println("\nЗадание №2");
        osUpdate(0, 2015);

        // Задание №3
        System.out.println("\nЗадание №3");
        byte deliveryTime = deliveryTime(90);
        System.out.println("На доставку потребуется дней: " + deliveryTime);
    }
}