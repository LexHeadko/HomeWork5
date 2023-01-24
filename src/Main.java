public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        //task4();
        //task5();
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
        } else if (clientOS == 1 && yearOfRelease >2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
    }
    //public static void task4() {
      //  System.out.println("Задача 4");
    //int deliveryDistance = 95;
    //if (deliveryDistance > 100) {
    //    System.out.println("Доставки нет!");
    }
