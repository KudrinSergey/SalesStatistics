import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int totalSales = service.sumSales(sales);
        double averageSales = service.averageSales(sales);
        int maxSalesMonth = service.maxSales(sales);
        int minSalesMonth = service.minSales(sales);
        int monthsBelowAverage = service.countMonthsBelowAverage(sales);
        int monthsAboveAverage = service.countMonthsAboveAverage(sales);

        System.out.println("Общие продажи: " + totalSales);
        System.out.println("Средние продажи: " + averageSales);
        System.out.println("Месяц с максимальными продажами: " + maxSalesMonth);
        System.out.println("Месяц с минимальными продажами: " + minSalesMonth);
        System.out.println("Количество месяцев с продажами ниже среднего: " + monthsBelowAverage);
        System.out.println("Количество месяцев с продажами выше среднего: " + monthsAboveAverage);
    }
}

