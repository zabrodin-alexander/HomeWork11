

public class Main {
    public static void main(String[] args) {

        int year = 2023;
        checkYear(year);

        int os = 1;
        int clientDeviceYear = 1999;
        installSystem(clientDeviceYear, os);

        int deliveryDistance = 20;
        deliverCard(deliveryDistance);
    }

    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void installSystem(int clientDeviceYear, int os) {
        if (clientDeviceYear <= 2014 && os == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2014 && os == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            if (os == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (os == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void deliverCard(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день для доставки. ");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня для доставки. ");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня для доставки. ");
        } else {
            System.out.println("Доставки нет.");
        }
    }
}