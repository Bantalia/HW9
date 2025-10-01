//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Задача 1
        System.out.println("Task 1");
        int firstFriday = 5;
        for (int day = firstFriday; day <= 31; day = day + 7) {
            System.out.println("«Сегодня пятница, " + day + "е число. Необходимо подготовить отчет");
        }
//Задача2.1
        System.out.println("Task 2.1");
        int distance = 500;
        do {
            System.out.println("Держитесь! Осталось " + (42195 - distance) + " метров");
            distance += 500;
        } while (distance < 42195);
//Задача2.2
        System.out.println("Task 2.2 for");
        distance = 0;
        int marathon = 42195;
        for (; distance < marathon; distance += 500) {
            int finishIn = marathon - distance;
            System.out.println("Держитесь! Осталось " + finishIn + " метров");
        }
//Задача 3.1
        System.out.println("Task 3.1");
        int sumBudget = 1000;
        int day = 0;
        int daysWhile = 0;
        while (sumBudget > 0) {
            day++;
            if (day % 5 == 0) {
                continue;
            }
            sumBudget -= 100;
            if (sumBudget < 0) break;
            {
                daysWhile++;
            }
            System.out.println(" " + day + " день/дня Вы можете оставить автомобиль.");
        }
//Задача 3.2 for
        System.out.println("Task 3.1 for");
        int sumBudgetFor = 1000;
        int dayFor = 0;
        int daysWhileFor = 0;
        for (int currentDay = 1; ; currentDay++) {
            if (currentDay % 5 == 0) {
                continue;
            }
            sumBudgetFor -= 100;
            if (sumBudgetFor < 0) break;
            {
                dayFor++;
            }
            System.out.println(" " + dayFor + " день/дня Вы можете оставить автомобиль.");

        }
        //Задача 4
        System.out.println("Task 4");
        int month = 0;
        double total = 0;
        while (true) {
            month++;
            total = total + 15_000;
            if (month % 6 == 0) {
                total = total * 1.07;
                System.out.println(total + " Накоплено за " + month);
            }
            if (total >= 12_000_000) {
                System.out.println(total + "Достигнута цель " + month);
                break;
            }
        }
        //Задача 5
        System.out.println("Task 5 ");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            charge = charge + 2;
            if (minute % 10 == 0) {

                System.out.println(" Случился перегрев " + overheats);
                overheats++;
                minute += 2;
                continue;
            }

                System.out.println("Заряд" + charge + "%");

            if (overheats == 3) {
                break;
            }
        }

            System.out.println(" Зарядка прекращена. Текущий заряд " + charge + " % ");



    }

}
