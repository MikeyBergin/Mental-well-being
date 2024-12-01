/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package groupproject;

/**
 *
 * @author tenhe
 */

public class GoodHealth {

    public static void main(String[] args) {
        // Create and display the health GUI
        healthGUI mygui = new healthGUI();

        // Create instances of the components
        healthyLifestyle healthyLifeStyle = new healthyLifestyle();
        nutritionGuide nutritionGuide = new nutritionGuide();
        healthyQuiz healthyQuiz = new healthyQuiz();
        healthyTips healthyTips = new healthyTips();

        // Add data to demonstrate functionality
        nutritionGuide.addFoodItems("Apple", 52.0);
        nutritionGuide.addFoodItems("Banana", 96.0);

        healthyQuiz.addQuestion("What is the recommended daily water intake?");
        healthyQuiz.addQuestion("What vitamin is abundant in citrus fruits?");

        healthyTips.addHealthTips("Drink 8 glasses of water daily.");
        healthyTips.addHealthTips("Exercise regularly for at least 30 minutes a day.");

        // Example method calls
        System.out.println("Nutrition Guide: " + nutritionGuide.foodItems);
        System.out.println("Healthy Tips: " + healthyTips.fetchHealthTips());

        System.out.println("Starting the quiz...");
        int score = healthyQuiz.startQuiz();
        System.out.println("Quiz Completed! Your Score: " + score);

        // Display the GUI
        mygui.setVisible(true);
    }
}

