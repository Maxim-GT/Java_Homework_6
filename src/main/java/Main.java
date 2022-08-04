import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        long[] income = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();

        System.out.println("Сумма всех продаж: " + service.sumOfSales(income));

        System.out.println("Средняя сумма продаж в месяц: " + service.averageSales(income));

        System.out.println("Номер месяца, в котором был пик продаж: " + service.maxSales(income));

        System.out.println("Номер месяца, в котором был минимум продаж: " + service.minSales(income));

        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + service.lessThanAverage(income));

        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + service.moreThanAverage(income));
    }
}
