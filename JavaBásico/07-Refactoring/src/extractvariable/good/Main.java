package extractvariable.good;

public class Main {

    void printProductPrice(Order order) {
        //Calcular precio final

        //1. Precio de los productos
        Double grossPrice = order.getPrice() * order.getQuantity();

        //2. Descuento
        Double offerPrice = order.getPrice() * order.getOffer();

        //3. Calcular precio con descuento incluido
        Double totalPrice = grossPrice - offerPrice;

        //4. Sumar precio envío
        Double shippingPrice = 0.0;
        if (totalPrice < 50) {
            shippingPrice = 2.99;
        }

        //5. Precio final
        Double finalPrice = totalPrice + shippingPrice;

        System.out.println(finalPrice);
    }
}
