

package sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MealTest {
    private Meal meal;

    MealTest() {
    }

    @BeforeEach
    void setUp() {
        this.meal = new Meal();
    }

    @Test
    void getTotalCals() {
        Assertions.assertEquals(100.0D, this.meal.getTotalCals());
    }

    @Test
    void getTotalCarbs() {
        Assertions.assertEquals(100.0D, this.meal.getTotalCarbs());
    }

    @Test
    void getTotalProtein() {
        Assertions.assertEquals(100.0D, this.meal.getTotalProtein());
    }

    @Test
    void getTotalFoods() {
        Assertions.assertEquals(1, this.meal.getTotalFoods());
    }
}
