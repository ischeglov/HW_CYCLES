package ru.netology.services;

public class RestTimeService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money < threshold) {
                money = money + income - expenses;
            } else {
                money = (money - expenses) / 3;
                count++;
            }
        }
        return count;
    }
}
