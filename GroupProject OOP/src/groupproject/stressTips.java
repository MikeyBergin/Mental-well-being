/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupproject;

import java.util.ArrayList;

public class stressTips {
    private ArrayList<String> tips;

    public stressTips() {
        tips = new ArrayList<>();
        
        tips.add("Take deep breaths and count to 10.");
        tips.add("Go for a short walk to clear your mind.");
        tips.add("Practice mindfulness for 5 minutes every day.");
        tips.add("Take breaks throughout the day to relax and reset.");
    }
    
    // Method to add a new stress tip
    public void addTip(String tip) {
        tips.add(tip);
        System.out.println("Added new tip: " + tip);
    }

    // Method to fetch all stress tips
    public ArrayList<String> fetchTips() {
        return tips;
    }
}

