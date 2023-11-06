public class Main {
    public static void main(String[] args) {
        {

            //Задача 1
            int clientOS = 1;
            if (clientOS == 1) {
                System.out.println("Вы пользуетесь Android. Установите версию приложения для Android по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Вы пользуетесь iOS.Установите версию приложения для iOS по ссылке");
            }

            //задача 2
            int ClientOS = 1;
            int clientDeviceYear = 2020;
            if (ClientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите обычное преложения Android ");
            } else if (ClientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (ClientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите обычное преложения iOS ");
            } else if (ClientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }


                // задача 3

                int year = 2021;
                if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                    System.out.println(year + " год високосный");
                } else {
                    System.out.println(year + " год не високосный");
                }



        }

            // задача 4
            int deliveryDistanse = 95;
            int day = 1;
            if (deliveryDistanse < 20) {
                System.out.println("Потребуется дней " + day);
            } else if (deliveryDistanse >= 20 && deliveryDistanse < 60) {
                System.out.println("Потребуется дней " + (day + 1));
            } else if (deliveryDistanse >= 60 && deliveryDistanse <= 100) {
                System.out.println("Потребуется дней " + (day + 2));
            } else {
                System.out.println("Доставки нет");
            }

            //задача 5
        int monthNumber = 13;
            switch (monthNumber){
                case 12:
                case 1:
                case 2:
                    System.out.println("зима");
                case 3:
                case 4:
                case 5:
                    System.out.println("весна");
                case 6:
                case 7:
                case 8:
                    System.out.println("лето");
                case 9:
                case 10:
                case 11:
                    System.out.println("осень");
                    break;
                default:
                    System.out.println("такого месяца нет");

            }


        }
    }


