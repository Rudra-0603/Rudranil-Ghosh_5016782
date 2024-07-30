// ObserverPatternTest.java
public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp = new WebApp("WebApp");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp);

        stockMarket.setStock("AAPL", 150.00);
        System.out.println("");

        stockMarket.deregisterObserver(mobileApp2);
        stockMarket.setStock("GOOG", 2800.00);
    }
}
