public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача №1");
        int deposite = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000){
            total = total + deposite;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() {
        System.out.println(" ");
        System.out.println("Задача №2");
        int number = 1;
        while (number <= 10){
            System.out.print(number + " ");
            number = number + 1;
        }
        System.out.println(" ");
        for (;number > 1;){
            number = number - 1;
            System.out.print(number + " ");
        }
    }
    public static void task3() {
        System.out.println(" ");
        System.out.println("Задача №3");
        int population = 12_000_000;
        int birth = (population/1000) * 17;
        int death = (population/1000) * 8;
        int year = 0;
        while (year < 10){
            population = population + birth - death;
            year = year +1;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
    public static void task4() {
        System.out.println(" ");
        System.out.println("Задача №4");
        int deposite = 15000;
        int month = 0;
        while (deposite < 12_000_000){
            deposite = deposite + (deposite/100 * 7);
            month = month + 1;
            System.out.println("Месяц " + month + ". Сумма накоплений " + deposite);
        }
    }
    public static void task5() {
        System.out.println(" ");
        System.out.println("Задача №5");
        int deposite = 15000;
        int month = 0;
        while (deposite < 12_000_000){
            deposite = deposite + (deposite/100 * 7);
            month = month + 1;
            if (month %6 ==0) {
                System.out.println("Месяц " + month + ". Сумма накоплений " + deposite);
            }
        }
    }

    public static void task6() {
        System.out.println(" ");
        System.out.println("Задача №6");
        int deposite = 15000;
        int month = 0;
        while (month < 12*9) {
            deposite = deposite + (deposite / 100 * 7);
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ". Сумма накоплений " + deposite);
            }
        }
    }
    public static void task7() {
        System.out.println(" ");
        System.out.println("Задача №7");
        int friday = 3;
        int day = 0;
        while (day < 31) {
            day = day + 1;
            if (day % 7 == friday) {
                System.out.println("Сегодня пятница " + day + "-ое число. Необходимо подготовить отчет.");
            }
        }
    }

    public static void task8() {
        System.out.println(" ");
        System.out.println("Задача №8");
        int yearBefore = 2023 - 200;
        int yearAfter = 2023 + 100;
        while (yearBefore < yearAfter){
            yearBefore = yearBefore + 1;
            if (yearBefore % 79 == 0){
                System.out.println(yearBefore);
            }
        }
    }
}