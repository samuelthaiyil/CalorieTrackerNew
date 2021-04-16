package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import sample.Food;
import sample.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class MealViewerController implements Initializable {

    public Controller controller;
    public Pane pPane = new Pane();
    public ScrollPane scrollPane = new ScrollPane();
    public Button btnAddFood = new Button("Add Food");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Label dailyTotals = new Label("Daily Totals");
        dailyTotals.relocate(50, 20);
        dailyTotals.setStyle("-fx-font-size: 20px;");

        Label totalFood = new Label("Total Foods: " + (Controller.breakfast.getTotalFoods()
                + Controller.lunch.getTotalFoods()
                + Controller.dinner.getTotalFoods()
                + Controller.snack.getTotalFoods()));
        totalFood.relocate(50, 50);

        Label totalProtein = new Label("Total Protein: " + (Controller.breakfast.getTotalProtein()
                + Controller.lunch.getTotalProtein()
                + Controller.dinner.getTotalProtein()
                + Controller.snack.getTotalProtein()) +"g");
        totalProtein.relocate(50, 70);

        Label totalCarbs = new Label("Total Carbohydrates: " + (Controller.breakfast.getTotalCals()
                + Controller.lunch.getTotalCarbs()
                + Controller.dinner.getTotalCarbs()
                + Controller.snack.getTotalCarbs())+"g");
        totalCarbs.relocate(50, 90);

        Label totalCals = new Label("Total Calories: " + (Controller.breakfast.getTotalCals()
                + Controller.lunch.getTotalCals()
                + Controller.dinner.getTotalCals()
                + Controller.snack.getTotalCals()));
        totalCals.relocate(50, 110);

        Line seperator = new Line();
        seperator.setStartX(50);
        seperator.setStartY(150);
        seperator.setEndX(750);
        seperator.setEndY(150);

        pPane.getChildren().addAll(totalFood, totalCals, totalCarbs, totalProtein, dailyTotals, seperator);

        int count = 170;
        if(!Controller.breakfast.getFood().isEmpty()) {
            Label breakfast = new Label("Meal: Breakfast");
            breakfast.relocate(50, count + 20);
            breakfast.setStyle("-fx-font-size: 20px;");
            pPane.getChildren().add(breakfast);
        }
        for (Food e :
                Controller.breakfast.getFood()) {
            Button edit = new Button("Edit");
            edit.relocate(730, 55 + count);

            Label foodName = new Label(e.getFoodName());
            foodName.setStyle("-fx-font-size: 17px;");
            foodName.relocate(50, 55 + count);

            Label protein = new Label("Protein: " + e.getProtein()+"g");
            protein.relocate(50, 80 + count);

            Label carbs = new Label("Carbohydrates: " + e.getCarbs()+"g");
            carbs.relocate(50, 100 + count);

            Label cals = new Label("Calories: " + e.getCalories());
            cals.relocate(50, 120 + count);

            Label amt = new Label("Amount: " + e.getAmount());
            amt.relocate(50, 140 + count);

            Line sep = new Line();
            sep.setStartX(50);
            sep.setStartY(160 + count);
            sep.setEndX(750);
            sep.setEndY(160 + count);


            pPane.getChildren().addAll(foodName, protein, carbs, cals, amt, sep, edit);
            count += 160;

            int finalCount = count;
            edit.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    createEditMenu(e, foodName, protein, carbs, cals, amt, edit, finalCount);
                 }
            });
        }

        int count2 = Controller.breakfast.getFood().size() + count;
        if(!Controller.lunch.getFood().isEmpty()) {
            Label lunch = new Label("Meal: Lunch");
            lunch.relocate(50, count2 + 20);

            lunch.setStyle("-fx-font-size: 20px;");
            pPane.getChildren().add(lunch);
        }
        for (Food e :
                Controller.lunch.getFood()) {
            Button edit = new Button("Edit");
            edit.relocate(730, 55 + count2);

            Label foodName = new Label(e.getFoodName());
            foodName.setStyle("-fx-font-size: 17px;");
            foodName.relocate(50, 55 + count2);

            Label protein = new Label("Protein: " + e.getProtein()+"g");
            protein.relocate(50, 80 + count2);

            Label carbs = new Label("Carbohydrates: " + e.getCarbs()+"g");
            carbs.relocate(50, 100 + count2);

            Label cals = new Label("Calories: " + e.getCalories());
            cals.relocate(50, 120 + count2);

            Label amt = new Label("Amount: " + e.getAmount());
            amt.relocate(50, 140 + count2);

            Line sep = new Line();
            sep.setStartX(50);
            sep.setStartY(160 + count2);
            sep.setEndX(750);
            sep.setEndY(160 + count2);

            pPane.getChildren().addAll(foodName, protein, carbs, cals, amt, sep, edit);
            count2 += 160;

            int finalCount = count2;
            edit.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    createEditMenu(e, foodName, protein, carbs, cals, amt, edit, finalCount);
                }
            });
        }
        int count3 = Controller.lunch.getFood().size() + count2;
        if(!Controller.dinner.getFood().isEmpty()) {
        Label dinner = new Label("Meal: Dinner");
        dinner.relocate(50, count3 + 20);

        dinner.setStyle("-fx-font-size: 20px;");
        pPane.getChildren().add(dinner);
        }

        for (Food e :
                Controller.dinner.getFood()) {
            Button edit = new Button("Edit");
            edit.relocate(730, 55 + count3);

            Label foodName = new Label(e.getFoodName());
            foodName.setStyle("-fx-font-size: 17px;");
            foodName.relocate(50, 55 + count3);

            Label protein = new Label("Protein: " + e.getProtein()+"g");
            protein.relocate(50, 80 + count3);

            Label carbs = new Label("Carbohydrates: " + e.getCarbs()+"g");
            carbs.relocate(50, 100 + count3);

            Label cals = new Label("Calories: " + e.getCalories());
            cals.relocate(50, 120 + count3);

            Label amt = new Label("Amount: " + e.getAmount());
            amt.relocate(50, 140 + count3);

            Line sep = new Line();
            sep.setStartX(50);
            sep.setStartY(160 + count3);
            sep.setEndX(750);
            sep.setEndY(160 + count3);

            pPane.getChildren().addAll(foodName, protein, carbs, cals, amt, sep, edit);
            count3 += 160;

            int finalCount = count3;
            edit.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    createEditMenu(e, foodName, protein, carbs, cals, amt, edit, finalCount);
                }
            });
        }
        int count4 = Controller.dinner.getFood().size() + count3;
        if(!Controller.snack.getFood().isEmpty()) {
            Label snack = new Label("Meal: Snack");
            snack.relocate(50, count4 + 20);
            snack.setStyle("-fx-font-size: 20px;");
            pPane.getChildren().add(snack);
        }
        for (Food e :
                Controller.snack.getFood()) {
            Button edit = new Button("Edit");
            edit.relocate(730, 55 + count4);

            Label foodName = new Label(e.getFoodName());
            foodName.setStyle("-fx-font-size: 17px;");
            foodName.relocate(50, 55 + count4);

            Label protein = new Label("Protein: " + e.getProtein()+"g");
            protein.relocate(50, 80 + count4);

            Label carbs = new Label("Carbohydrates: " + e.getCarbs()+"g");
            carbs.relocate(50, 100 + count4);

            Label cals = new Label("Calories: " + e.getCalories());
            cals.relocate(50, 120 + count4);

            Label amt = new Label("Amount: " + e.getAmount());
            amt.relocate(50, 140 + count4);

            Line sep = new Line();
            sep.setStartX(50);
            sep.setStartY(160 + count4);
            sep.setEndX(750);
            sep.setEndY(160 + count4);

            pPane.getChildren().addAll(foodName, protein, carbs, cals, amt, sep, edit);
            count4 += 160;

            int finalCount = count4;
            edit.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    createEditMenu(e, foodName, protein, carbs, cals, amt, edit, finalCount);
                }
            });
        }
        btnAddFood.setMinHeight(27);
        btnAddFood.setMinWidth(56);
        btnAddFood.relocate(690, 45);
        pPane.getChildren().add(btnAddFood);
        pPane.setStyle("-fx-background-color: white;");
        scrollPane.setStyle("-fx-background-color: white;");
        scrollPane.setContent(pPane);
        scrollPane.setPannable(true);

        btnAddFood.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Parent root;
                try {
                    root = FXMLLoader.load(getClass().getResource("../models/sample.fxml"));
                    Scene s = new Scene(root, 800, 600);
                    s.getStylesheets().add("styles.css");
                    Main.primaryStage.setScene(s);
                    Main.primaryStage.show();
                } catch (Exception e) {
                    throw new NullPointerException("addfood does not exist");
                }
            }
        });
    }

    public void createEditMenu(Food e, Label foodName, Label protein, Label carbs, Label cals, Label amt, Button edit, int count)
    {
        pPane.getChildren().remove(foodName);
        pPane.getChildren().remove(protein);
        pPane.getChildren().remove(carbs);
        pPane.getChildren().remove(cals);
        pPane.getChildren().remove(amt);
        pPane.getChildren().remove(edit);

        TextField tbFoodName = new TextField();
        TextField tbProtein = new TextField();
        TextField tbCals = new TextField();
        TextField tbCarbs = new TextField();
        TextField tbAmt = new TextField();
        Button save = new Button("Save");
        save.relocate(730, count - 110);

        tbFoodName.relocate(50, count - 110);
        tbProtein.relocate(50, count - 90);
        tbCarbs.relocate(50, count - 70);
        tbCals.relocate(50, count - 50);
        tbAmt.relocate(50, count - 30);

        tbFoodName.setText(e.getFoodName());
        tbProtein.setText(String.valueOf(e.getProtein()));
        tbCarbs.setText(String.valueOf(e.getCarbs()));
        tbCals.setText(String.valueOf(e.getCalories()));
        tbAmt.setText(String.valueOf(e.getAmount()));

        //set sizes for created textboxes
        tbFoodName.setPrefHeight(12);
        tbFoodName.setPrefWidth(100);
        tbProtein.setPrefHeight(12);
        tbProtein.setPrefWidth(100);
        tbCarbs.setPrefHeight(12);
        tbCarbs.setPrefWidth(100);
        tbCals.setPrefHeight(12);
        tbCals.setPrefWidth(100);
        tbAmt.setPrefHeight(12);
        tbAmt.setPrefWidth(100);

        // add to pane
        pPane.getChildren().addAll(tbFoodName, tbProtein, tbCarbs, tbCals, tbAmt, save);

        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                pPane.getChildren().remove(tbAmt);
                pPane.getChildren().remove(tbCals);
                pPane.getChildren().remove(tbCarbs);
                pPane.getChildren().remove(tbFoodName);
                pPane.getChildren().remove(tbProtein);
                pPane.getChildren().remove(save);

                e.setFoodName(tbFoodName.getText());
                e.setProtein(Double.parseDouble(tbProtein.getText()));
                e.setCalories(Double.parseDouble(tbCals.getText()));
                e.setAmount(Integer.parseInt(tbAmt.getText()));
                e.setCarbs(Double.parseDouble(tbCarbs.getText()));

                foodName.setText(e.getFoodName());
                protein.setText("Protein: " + String.valueOf(e.getProtein()) + "g");
                carbs.setText("Carbohydrates: " + String.valueOf(e.getCarbs()) + "g");
                cals.setText("Calories: " +String.valueOf(e.getCalories()));
                amt.setText("Amount: " +String.valueOf(e.getAmount()));

                pPane.getChildren().addAll(foodName, protein, cals, carbs, amt, edit);

            }
        });
    }
}
