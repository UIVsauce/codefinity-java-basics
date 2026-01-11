package com.example;

public class Main {
    public static String buildProductList(String[][] products) {
        // 5
        StringBuilder productList = new StringBuilder();
        // 6
        productList.append("Product List:\n");

        // 8
        for (String[] product : products) {
            // 9
            String name = product[0];
            // 10
            String price = product[1];
            // 11
            productList.append(name)
                       .append(" - $")
                       .append(price)
                       .append("\n");
        }

        // 14
        return productList.toString();
    }

    public static void main(String[] args) {
        String[][] products = {
            {"Laptop", "999.99"},
            {"Phone",  "499.49"},
            {"Tablet", "299.99"}
        };

        String result = buildProductList(products);
        System.out.println(result);
    }
}