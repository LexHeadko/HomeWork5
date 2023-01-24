public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        //task6();
        //task7();
        //task8();
        //task9();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 5; // 0 - iOS, 1 - AndroidOS
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int yearOfRelease = 2052;
        byte clientOS = 0; // 0 - iOS, 1 - AndroidOS
        if (clientOS == 0 && yearOfRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && yearOfRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && yearOfRelease > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && yearOfRelease > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            ;
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 25;
        if (deliveryDistance <= 100) {
            int days = 1;
            if (deliveryDistance > 20) {
                days++;
            }
            if (deliveryDistance > 60) {
                days++;
            }
            System.out.println("Доставка займет " + days + " дн.");
        } else {
            System.out.println("Доставки нет!");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сейчас зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень!");
                break;
            default:
                System.out.println("Такого месяца не существует!!!");
        }
    }
}