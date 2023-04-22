package ru.netology.services;

public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {              // идет в отпуск
                count++;                           // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
                System.out.println("Месяц " + month + ". Денег " + money + " Буду отдыхать. Потратил -" + expenses + " затем ещё -" + money);
            } else {
                money = money + income - expenses;
                System.out.println("Месяц " + month + ". Денег " + money + " Придётся работать. Заработал +" + income + " потратил -" + expenses);

            }
        }
        return count;
    }
}
//    public int calculate(int income, int expenses, int threshold) {
//        int count = 1; // счётчик месяцев отдыха
//        int money = 0; // количество денег на счету
//        for (int month = 1; month < 12; month++) {
//            if (money >= threshold) { // можем ли отдыхать?
//                count++; // увеличиваем счётчик месяцев отдыха
//                money = (money - expenses) /3;
//            } else {
//                money = money + income - expenses;
//            }
//        }
//        return count;
//    }
//    }

