package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    NormalProduct normalProduct = new NormalProduct("apple",0,30,10,1);
    AgedBrie agedBrie = new AgedBrie("Aged Brie",0,50,30,1);
    Sulfuras sulfuras = new Sulfuras("sulfuras",0,20,30);
    BackstagePass backstagePass = new BackstagePass("pass",0,50,20);


    @Test
    @DisplayName("First day of normal product")
    public void TestNormalProduct() {
        assertEquals(30,normalProduct.getQuality());
    }

    @Test
    @DisplayName("After one day")
    public void TestAfterOneDay() {
        normalProduct.afterOneDay();
        assertEquals(29,normalProduct.getQuality());
    }

    @Test
    @DisplayName("After sellIn")
    public void AfterSellIn() {
        int days = 15;
        while (days > 0){
            days--;
            normalProduct.afterOneDay();

        }
        assertEquals(9,normalProduct.getQuality());
    }

    @Test
    @DisplayName("Quality cannot be negative")
    public void QualityNegativeTest() {
        int days = 100;
        while (days > 0){
            days--;
            normalProduct.afterOneDay();

        }
        assertTrue(normalProduct.getQuality() >= 0);
    }

    @Test
    @DisplayName("Age Brie quality keep increase")
    public void testAgeBrie(){
        int currentQuality = agedBrie.getQuality();
        int days = 100;
        while (days > 0){
            days--;
            agedBrie.afterOneDay();

        }
        assertTrue(agedBrie.getQuality() >= currentQuality);
    }

    @Test
    @DisplayName("pass will be zero when after show")
    public void testZeroPass(){
        int days = 100;
        while (days > 0){
            days--;
            backstagePass.afterOneDay();

        }
        assertTrue(backstagePass.getQuality() == 0);
    }
}
