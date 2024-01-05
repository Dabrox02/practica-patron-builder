package com.local;

public class Main {
    public static void main(String[] args) {

        ProductBuilder productBuilder = new ProductConcreteBuilder();
        Product product = productBuilder.nombre("speedmax").nroLote("LR400004271284").fechaVencimiento("24-07-2024")
                .serial("7702090039214").categoria(Categoria.COMIDA).buildProduct();
        System.out.println(product.getCategoria().getDescripcion());
    }
}