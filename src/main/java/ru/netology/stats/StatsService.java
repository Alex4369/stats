package ru.netology.stats;

public class StatsService {
    public int sumSale(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSale(int[] sales) {
        return sumSale(sales) / sales.length;
    }

    public int MonthNumberMaxSale(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;

        }
        return maxMonth + 1;
    }

    public int MonthNumberMinSale(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int minAverageSale(int[] sales) {
        int month = 0;
        int avg = sumSale(sales) / sales.length;
        for (int sale : sales) {
            if (sale < avg) {
                month ++;
            }

        }
        return month;
    }
    public int maxAverageSale(int[] sales) {
        int month = 0;
        int avg = sumSale(sales) / sales.length;
        for (int sale : sales) {
            if (sale > avg) {
                month ++;
            }

        }
        return month;
    }
}