package sample;

import java.util.ArrayList;

public class Meal{
    public ArrayList<Food> food;

    public Meal() {
        food = new ArrayList<>();
    }

    public void addFood(Food f){
        food.add(f);
    }
    public ArrayList<Food> getFood()
    {
        return food;
    }

    public double getTotalCals()
    {
        double sum = 0;
        for (Food f:
                food) {
            sum += f.getCalories();
        }
        return sum;
    }

    public double getTotalCarbs()
    {
        double sum = 0;
        for (Food f:
                food) {
            sum += f.getCarbs();
        }
        return sum;

    }

    public double getTotalProtein()
    {
        double sum = 0;
        for (Food f:
                food) {
            sum += f.getProtein();
        }
        return sum;

    }
    public int getTotalFoods()
    {
        return food.size();
    }
}
