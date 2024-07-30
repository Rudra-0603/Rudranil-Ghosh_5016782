// ProxyPatternTest.java
public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test_10mb.jpg");
        Image image2 = new ProxyImage("test_20mb.jpg");

        // Image will be loaded from remote server
        image1.display();
        System.out.println("");

        // Image will not be loaded from remote server, cached version will be used
        image1.display();
        System.out.println("");

        // Image will be loaded from remote server
        image2.display();
        System.out.println("");

        // Image will not be loaded from remote server, cached version will be used
        image2.display();
    }
}
