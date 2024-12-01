/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupproject;
import java.util.ArrayList;

public class mentalWellBeing{
    private ArrayList<String> moodLog;
    private ArrayList<String> stressTipList;
    private String weeklySummary;

    public mentalWellBeing() {
        moodLog = new ArrayList<>();
        stressTipList = new ArrayList<>();
        weeklySummary = "";
        // Sample stress tips
        stressTipList.add("Take deep breaths and count to 10.");
        stressTipList.add("Go for a short walk to clear your mind.");
    }

    // Log a new mood entry
    public void logMood(String mood) {
        moodLog.add(mood + " - " + java.time.LocalDateTime.now());
        System.out.println("Mood logged: " + mood);
    }

    // View stress tips
    public void viewStressTips() {
        System.out.println("Stress Management Tips:");
        for (String tip : stressTipList) {
            System.out.println("- " + tip);
        }
    }

    // Generate a weekly summary
    public String createWeeklySummary() {
        StringBuilder summary = new StringBuilder("Weekly Mood Summary:\n");
        for (String mood : moodLog) {
            summary.append(mood).append("\n");
        }
        weeklySummary = summary.toString();
        return weeklySummary;
    }
}



