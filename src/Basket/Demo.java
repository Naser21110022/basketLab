
package Basket;


public class Demo {
    public static void main(String[] args) {
        Basket<Double, Double> b = new Basket<>();
        b.add(2.3);
        b.add(2.7);
        System.out.print(b.toString());
        b.add(8.0);
        System.out.print(b.toString());
    }
}
