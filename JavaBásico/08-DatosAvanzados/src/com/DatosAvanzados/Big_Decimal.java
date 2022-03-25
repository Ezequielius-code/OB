package com.DatosAvanzados;

import java.math.BigDecimal;

public class Big_Decimal {

    public static void main(String[] args) {
        System.out.println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f);

        //Aquello que requiera una gran precisión no se hace ni con float, ni con decimal.
        //Para ello se utilizará la clase BigDecimal

        BigDecimal firstValue = new BigDecimal(0.1f);
        BigDecimal secondValue = new BigDecimal(4);
        firstValue.multiply(secondValue);
        firstValue.add(secondValue);
        System.out.println(firstValue.toString());

        BigDecimal thirdValue = new BigDecimal(3.14);
        BigDecimal fourthValue = new BigDecimal(3.15);
        BigDecimal result = thirdValue.add(fourthValue);

        System.out.println(result.toString());
    }
}
