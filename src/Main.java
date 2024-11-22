public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int aim = 2_459_000;
        int total = 0;
        int savings = 15000;
        int month = 0;
        while (total < aim) {
            total += savings;
            total += total/100;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int people = 12_000_000;
        int birthPer1000 = 17;
        int deathPer1000 = 8;
        for (int year = 1; year <= 10; year++) {
            people += people * 17/1000 - people * 8/1000;
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }
        System.out.println("задача 4");
        aim = 12_000_000;
        int deposit = 15000;
        month = 0;
        while (deposit < aim) {
            deposit += deposit * 7/100;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println("задача 5");
        aim = 12_000_000;
        deposit = 15000;
        month = 0;
        while (deposit < aim) {
            deposit += deposit * 7 / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
        System.out.println("задача 6");
        deposit = 15000;
        month = 0;
        while (month < 108) {
            deposit += deposit * 7 / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
        System.out.println("Задача 7");
        int firstFriday = 1;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("Задача 8");
        int nowYear = 2024;
        int firstYear = nowYear - 200;
        int lastYear = nowYear + 100;
        int period = 79;
        int cometFlight = 0;
        for (int year = cometFlight; year < lastYear; year += period) {
            if (year > firstYear) {
                System.out.println(year);
            }
        }
    }
}