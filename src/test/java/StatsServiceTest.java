import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    long[] testIncome = {
            10, 50, 90, 130, 150, 250, 900, 100000, 156000, 8000000, 457340, 45397
    };

    @Test
    public void testSumOfSales() {
        StatsService service = new StatsService();
        int expected = 8760317;
        int actual = service.sumOfSales(testIncome);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSales() {
        StatsService service = new StatsService();
        int expected = 730026;
        int actual = service.averageSales(testIncome);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        int expected = 10;
        int actual = service.maxSales(testIncome);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        int expected = 1;
        int actual = service.minSales(testIncome);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLessThanAverage() {
        StatsService service = new StatsService();
        int expected = 11;
        int actual = service.lessThanAverage(testIncome);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMoreThanAverage() {
        StatsService service = new StatsService();
        int expected = 1;
        int actual = service.moreThanAverage(testIncome);

        Assertions.assertEquals(expected, actual);
    }
}
