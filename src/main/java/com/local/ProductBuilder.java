package com.local;

public interface ProductBuilder {

    ProductBuilder nombre(String nombre);

    ProductBuilder serial(String serial);

    ProductBuilder nroLote(String nroLote);

    ProductBuilder fechaVencimiento(String fechaVencimiento);

    ProductBuilder categoria(Categoria categoria);

    Product buildProduct();

}
