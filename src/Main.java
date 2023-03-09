public class Main {
    public static void toBeLeapYear(int year) {
        System.out.println(year + " год — високосный год");
    }
    public static void notToBeLeapYear(int year){
        System.out.println(year + " год — невисокосный год ");
    }

        public static void main (String[]args){
            task1();
            task2();
            task3();
        }

        public static void task1 () {
            System.out.println("Задача 1");
            int year = 2021;
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                toBeLeapYear(year);
            } else {
                notToBeLeapYear(year);
            }
        }
        public static void task2 () {
            System.out.println("Задача 2");
        }
        public static void task3 () {
            System.out.println("Задача 3");
        }

}