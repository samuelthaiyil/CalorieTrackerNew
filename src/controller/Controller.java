package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import sample.Food;
import sample.Main;
import sample.Meal;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Button btnSubmit;
    public Button btnViewMeals;
    public ChoiceBox cbMeal;
    public TextField tbProtein;
    public TextField tbCarbs;
    public TextField tbCals;
    public TextField tbFoodName;
    public TextField tbAmt;
    public static Meal breakfast = new Meal();
    public static Meal lunch = new Meal();
    public static Meal dinner = new Meal();
    public static Meal snack = new Meal();
    public Pane pPane;
    public MealViewerController mvc = new MealViewerController();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //add meal selections to choicebox
        cbMeal.getItems().add("Breakfast");
        cbMeal.getItems().add("Lunch");
        cbMeal.getItems().add("Dinner");
        cbMeal.getItems().add("Snack");

        //add placeholder foods to meals
        breakfast.addFood(new Food("Eggs", 2, 45, 13, 1.1));
        breakfast.addFood(new Food("Bacon", 3, 43, 3, 1.4));
        breakfast.addFood(new Food("Toast", 1, 75, 13, 13));
        lunch.addFood(new Food("Mediterranean Orzo Salad", 6, 51, 1.5, 5.5));
        dinner.addFood(new Food("Cajun Shrimp & Grits", 6, 76, 5, 7));
        snack.addFood(new Food("Dipps Caramel Granola Bar", 1, 150, 9, 3.3));


        //on button submit action create a new food instance based on user input and add it to the selected meal from choicebox
        btnSubmit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                    Food food = new Food(tbFoodName.getText(),
                            Integer.parseInt(tbAmt.getText()),
                            Double.parseDouble(tbCals.getText()),
                            Double.parseDouble(tbProtein.getText()), Double.parseDouble(tbCarbs.getText()));
                    if (cbMeal.getValue() == "Breakfast") {
                        breakfast.addFood(food);
                    }
                    if (cbMeal.getValue() == "Lunch") {
                        lunch.addFood(food);
                    }
                    if (cbMeal.getValue() == "Dinner") {
                        dinner.addFood(food);
                    }
                    if (cbMeal.getValue() == "Snack") {
                        snack.addFood(food);
                    }
                    tbAmt.clear();
                    tbCals.clear();
                    tbCarbs.clear();
                    tbFoodName.clear();
                    tbProtein.clear();
            }
        });

        //goto meal viewer
        btnViewMeals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Parent root;
                try {
                    root = FXMLLoader.load(getClass().getResource("../models/mealViewer.fxml"));
                    Scene s = new Scene(root, 800, 600);
                    s.getStylesheets().add("styles2.css");
                    Main.primaryStage.setScene(s);
                    Main.primaryStage.show();
                } catch (Exception e) {
                    throw new NullPointerException("mealViewer does not exist");
                }
            }
        });
    }
}

