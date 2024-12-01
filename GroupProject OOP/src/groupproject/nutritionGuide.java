/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupproject;


/**
 *
 * @author tenhe
 */
import java.util.ArrayList;

public class nutritionGuide {
    public ArrayList<String> foodItems = new ArrayList<>();
    private ArrayList<Double> nutritionalValues = new ArrayList<>();

    public void addFoodItems(String food, double nutritionalValue) {
        foodItems.add(food);
        nutritionalValues.add(nutritionalValue);
    }

    public double getNutritionalInfo(String food) {
        int index = foodItems.indexOf(food);
        if (index != -1) {
            return nutritionalValues.get(index);
        }
        return 0.0;
    }
}
