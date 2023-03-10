import java.time.LocalDate;

public class Main {

        public static void main (String[]args){
            checkTheLeapYear(2333);
            checkOs(0,2021);
            printOfInfoDelivery(20);
        }

        public static void checkTheLeapYear (int year) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println( year + " - високосный год");
            } else {
                System.out.println(year + " - невисокосный год");
            }
        }
        public static void checkOs (int clientSystem,int deviceYear) {
            int currentYear = LocalDate.now().getYear();
            String osResult = "Установите %sверсию для %s по ссылке.";
            if (clientSystem==0) {
                if (currentYear>deviceYear) {
                    System.out.printf(osResult,"облегченную ","IOS");
                } else {
                    System.out.printf(osResult,"","IOS");
                }
            }
            if (clientSystem==1){
                if( currentYear>deviceYear){
                    System.out.printf(osResult,"облегченную ","Android");
                } else {
                    System.out.printf(osResult,"","Android");
                }
            }
            if (clientSystem!=0 && clientSystem !=1){
                System.out.println("Для вашего устройства нет обновлений");
            }
            System.out.println();
        }

    public static int printOfInfoDelivery(int delivery) {
        if (delivery < 20) {
            System.out.println("Доставка занимает сутки");
        } else if (delivery >= 20 && delivery < 60) {
            System.out.println("Доставка занимает двое суток");
        } else if (delivery >= 60 && delivery < 100) {
            System.out.println("Доставка занимает трое суток");
        }
        if (delivery >= 100) {
            System.out.println("Доставки нет, сами идите за ней");
        }
        return 0;
    }
    }
