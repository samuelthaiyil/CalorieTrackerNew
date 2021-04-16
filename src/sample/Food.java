package sample;

public class Food {
    //instances
    private String foodName;
    private int amount;
    private double calories;
    private double protein;
    private double carbs;

    //constructor
    public Food(String foodName, int amount, double calories, double protein, double carbs) {
        this.foodName = foodName;
        this.amount = amount;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
    }

    //getters and setters
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCalories() {
        return calories * amount;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getProtein() {
        return protein * amount;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbs() {
        return carbs * amount;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }
}
