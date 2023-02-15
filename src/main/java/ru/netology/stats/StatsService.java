package ru.netology.stats;

public class StatsService {

    public int allSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int average = 0;
        int sum = allSales(sales);
        for (int i = 0; i < sales.length; i++) {
            average = sum / sales.length;
        }
        return average;
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth;
    }

    public int minSaleMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth;
    }

    public int calcMonthMoreAverage(int[] sales) {
        int average = averageSales(sales);
        // int sum = 0;
        int monthMoreAverage = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale > average) {
                month = month + 1;
            }

            monthMoreAverage = month;
        }

        return monthMoreAverage;
    }

    public int calcMonthLessAverage(int [] sales) {
        int average = averageSales(sales);
        int monthLessAverage = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale < average) {
                month = month + 1;
            }
            monthLessAverage = month;
        }
        return monthLessAverage;
    }


}
