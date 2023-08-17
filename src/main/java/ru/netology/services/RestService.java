// ru/netology/services/RestService.java
package ru.netology.services;

public class RestService {
    public int calculate(int income, int expenses, int threshold) {
        int restMonths = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                restMonths++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses - (expenses * 3); // учитываем траты на отдых
            } else {
                money = money + income - expenses; // доходы заработаны, траты списаны
            }
        }
        return restMonths;
    }
}
