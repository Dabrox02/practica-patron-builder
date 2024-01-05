package com.local;

public class ProductConcreteBuilder implements ProductBuilder {

    private Product product = new Product();

    @Override
    public ProductBuilder nombre(String nombre) {
        product.setNombre(nombre);
        return this;
    }

    @Override
    public ProductBuilder serial(String serial) {
        product.setSerial(serial);
        return this;
    }

    @Override
    public ProductBuilder nroLote(String nroLote) {
        product.setNroLote(nroLote);
        return this;
    }

    @Override
    public ProductBuilder fechaVencimiento(String fechaVencimiento) {
        product.setFechaVencimiento(fechaVencimiento);
        return this;
    }

    @Override
    public ProductBuilder categoria(Categoria categoria) {
        product.setCategoria(categoria);
        return this;
    }

    @Override
    public Product buildProduct() {
        return product;
    }

}
