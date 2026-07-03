package ObserverPatternExample;

public class ObserverTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        stockMarket.register(mobile);
        stockMarket.register(web);

        System.out.println("First Update:");
        stockMarket.setStock("TCS", 3850.50);

        System.out.println();

        System.out.println("Second Update:");
        stockMarket.setStock("Infosys", 1625.75);
    }
}
