package shoppingcart;

public class shoppingcart {
    public static void main(String[] args) {
        double[] prices = { 1500, 2500, 100, 5000, 3000 };

        double total = 0;
        for (double price : prices) {
            total = total + price;
        }
        double discount;
        if (total >= 10000) {
            discount = total * 0.20;
        } else if (total >= 5000) {
            discount = total * 0.05;
        } else {
            discount = 0;
        }
        double finalTotal = total - discount;

        System.out.println("Total: N" + total);
        System.out.println("Discount: N" + discount);
        System.out.println("Final Bill: N" + finalTotal);
    }
}
