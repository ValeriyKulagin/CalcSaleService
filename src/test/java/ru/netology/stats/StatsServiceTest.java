package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void shouldCalcAllSales() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.allSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void ShouldCalcAverage() {

        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldCalcBestMonth() {

        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 7;
        int actual = service.maxSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCalcBadMonth() {

        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.minSaleMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCalcMonthsMoreAverage() {

        StatsService serve = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = serve.calcMonthMoreAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCalcMonthsLessAverage() {

        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calcMonthLessAverage(sales);

        Assertions.assertEquals(expected, actual);
    }


}
