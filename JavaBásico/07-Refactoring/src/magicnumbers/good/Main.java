package magicnumbers.good;

public class Main {

    private static final double FREE_SHIPPING_PRICE = 100;
    private static final double SHIPPING_PRICE = 4.99;
    private static final double FREE_SHIPPING = 0;
    private static final double DISCOUNT = 0.1;

    public static void main(String[] args) {
        double price = 129.99;

        double discountPrice = calculateDiscount(price);
        double shippingPrice = calculateShipping(price);
    }

    private static double calculateShipping(double price) {
        return price < FREE_SHIPPING_PRICE ? SHIPPING_PRICE : FREE_SHIPPING;
    }

    private static double calculateDiscount(double price) {
        return price * DISCOUNT;
    }
}