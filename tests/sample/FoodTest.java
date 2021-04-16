//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FoodTest {
    private Food food;

    FoodTest() {
    }

    @BeforeEach
    void setUp() {
        this.food = new Food("testfood", 1, 100.0D, 100.0D, 100.0D);
    }

    @Test
    void getFoodName() {
        Assertions.assertEquals("testfood", this.food.getFoodName());
    }

    @Test
    void setFoodName() {
        this.food.setFoodName("testfood");
        Assertions.assertEquals("testfood", this.food.getFoodName());
    }

    @Test
    void getAmount() {
        Assertions.assertEquals(1, this.food.getAmount());
    }

    @Test
    void setAmount() {
        this.food.setAmount(1);
        Assertions.assertEquals(1, this.food.getAmount());
    }

    @Test
    void getCalories() {
        Assertions.assertEquals(100.0D, this.food.getCalories());
    }

    @Test
    void setCalories() {
        this.food.setCalories(100.0D);
        Assertions.assertEquals(100.0D, this.food.getCalories());
    }

    @Test
    void getProtein() {
        Assertions.assertEquals(100.0D, this.food.getProtein());
    }

    @Test
    void setProtein() {
        this.food.setProtein(100.0D);
        Assertions.assertEquals(100.0D, this.food.getProtein());
    }

    @Test
    void getCarbs() {
        Assertions.assertEquals(100.0D, this.food.getCarbs());
    }

    @Test
    void setCarbs() {
        this.food.setCarbs(100.0D);
        Assertions.assertEquals(100.0D, this.food.getCarbs());
    }
}
