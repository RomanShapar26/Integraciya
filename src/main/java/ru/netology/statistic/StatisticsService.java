package ru.netology.statistic;

public class StatisticsService {
    public long findMax(long[] incomes) {
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income);
        return current_max;
    }


    public long findMin(long[] incomes) {
        long currentMin = incomes[0];
        for (long income : incomes) {
            if (currentMin > income) {
                currentMin = income;
            }
        }
        return currentMin;
    }

    public long summ(long[] incomes) {
        long summ = 0;
        for (long income : incomes) {
            summ += income;
        }
        return summ;
    }

    public long average(long[] incomes) {
        long average = 0;
        for (long income : incomes) {
            if (income >= average) {
                average++;
            }
        }
        return average;
    }
}
