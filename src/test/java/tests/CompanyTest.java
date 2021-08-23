package tests;

import priceboard.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class CompanyTest{

    Company company;
    Product prod;

    public CompanyTest(){
        company = new Company("IHOP");
        prod = new Product("pancakes", 1234, 7.99);
        company.createProduct("pancakes", 1234, 7.99);
    }

    @Test
    public void TestCreateProduct(){
        assertEquals(prod.toString(), company.getItem().toString());
    }

    @Test
    public void TestGetCompanyName(){
        assertEquals("IHOP", company.getCompanyName());
    }

    @Test
    public void TestGetItem(){
        assertEquals(prod.toString(), company.getItem().toString());
    }
}