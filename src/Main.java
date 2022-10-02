public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1!!!");
        int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для IOS поссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание 2
        System.out.println("Задание 2!!!");
        int clientOS1 = 1;
        int clientDeviceYear = 2015;
        if (clientOS1 == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для IOS поссылке.");
        } else if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS поссылке.");
        }
        if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание 3
        System.out.println("Задание 3!!!");
        int year = 2021;
        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        //Задание 4
        System.out.println("Задание 4!!!");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20){
            deliveryDays++;
        }
        if (deliveryDistance > 60){
            deliveryDays++;
        }
        System.out.println("Дней для доставки потребуется " + deliveryDays);

        //Задание 5
        System.out.println("Задание 5!!!");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон осень.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }


    }
}