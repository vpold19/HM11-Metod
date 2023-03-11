import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        checkTheLeapYear(2333);
        checkOs(1, 2023);
        System.out.println(printOfInfoDelivery(50));
    }

    public static void checkTheLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }

    public static void checkOs(int clientSystem, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osResult = "Установите %sверсию для %s по ссылке.";
        if (clientSystem != 0 && clientSystem != 1) {
            System.out.println("Для вашего устройства нет обновлений");
            return;
        }
        if (clientSystem == 0) {
            if (currentYear > deviceYear) {
                System.out.printf(osResult, "облегченную ", "IOS");
            } else {
                System.out.printf(osResult, "", "IOS");
            }
        }
        if (clientSystem == 1) {
            if (currentYear > deviceYear) {
                System.out.printf(osResult, "облегченную ", "Android");
            } else {
                System.out.printf(osResult, "", "Android");
            }
        }
        System.out.println();
    }

    public static int printOfInfoDelivery(int delivery) {
        int days = 1;
        if (delivery > 20) {
            days++;
        }
        if (delivery > 60) {
            days++;
        }
        if (delivery > 100) {
            return -1;
        } else {
            return days;
        }
    }
}

