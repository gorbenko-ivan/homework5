public class Main {
    public static void main(String[] args) {

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientOS1 = 1;
        int clientDeviceYear = 2015;
        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке».");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }

        int year = 2021;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");

        }

        int deliveryDistance = 100;
        if (deliveryDistance <= 20) {
            System.out.println(" Потребуеться 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println(" Потребуеться 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println(" Потребуеться 3 дня ");
        } else {
            System.out.println(" Доставки нет");
        }

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("принадлежит к сезону Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("принадлежит к сезону Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("принадлежит к сезону Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("принадлежит к сезону Осень");
                break;
            default:
                System.out.println("Программа не выполняется");
        }
    }

}
