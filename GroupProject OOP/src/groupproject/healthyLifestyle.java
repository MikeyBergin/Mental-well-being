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

public class healthyLifestyle {
    private ArrayList<String> healthyQuiz = new ArrayList<>();
    private ArrayList<String> nutritionTips = new ArrayList<>();
    private ArrayList<String> lifestyleTips = new ArrayList<>();

    public void startQuiz() {
        System.out.println("Starting quiz...");
    }

    public ArrayList<String> showNutritionGuide() {
        return nutritionTips;
    }

    public ArrayList<String> displayHealthyTips() {
        ArrayList<String> allTips = new ArrayList<>(nutritionTips);
        allTips.addAll(lifestyleTips);
        return allTips;
    }
}
