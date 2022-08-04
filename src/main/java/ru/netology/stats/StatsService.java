package ru.netology.stats;

public class StatsService {
    public static int sumOfSales(long[] income) { //1
        int sum = 0;
        for (long price : income) {
            sum += price;
        }
        return sum;
    }

    public int averageSales(long[] income) { //2
        int sum = 0;
        int counter = 0;
        for (long price : income) {
            sum += price;
            counter++;
        }
        return (sum / counter);
    }

    public int maxSales(long[] income) { //3
        int maxMonth = 0;
        int month = 0;
        for (long sale : income) {
            if (sale >= income[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSales(long[] income) { //4
        int minMonth = 0;
        int month = 0;
        for (long sale : income) {
            if (sale <= income[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lessThanAverage(long[] income) { //5
        int counter = 0;
        int averageSale = averageSales(income);
        for (long months : income) {
            if (months < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int moreThanAverage(long[] income) { //6
        int counter = 0;
        int averageSale = averageSales(income);
        for (long months : income) {
            if (months > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
