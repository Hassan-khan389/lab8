package com.example.lab05;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProductTest {

    @Test
    public void checkProductNames(){

        Product aProduct = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the name of the product", "DELL MONITOR", aProduct.getProductName());

    }

    @Test
    public void checkProductId(){

        Product aProduct = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the id of the product", "1", aProduct.getId());

    }

    @Test
    public void checkProductPrice(){

        Product aProduct = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the price of the product", "180", aProduct.getPrice());

    }
}
