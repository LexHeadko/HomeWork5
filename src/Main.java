public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        //task3();
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
        int yearOfRelease = 2013;
        byte clientOS = 1; // 0 - iOS, 1 - AndroidOS
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Ошибка определения ОС");
        }
        if (clientOS == 0 && yearOfRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && yearOfRelease < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
}