/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupproject;

import java.util.ArrayList;

public class moodTracker {
    private ArrayList<String> moodEntries;

    public moodTracker() {
        moodEntries = new ArrayList<>();
    }

    public void addMoodEntry(String mood) {
        moodEntries.add(mood + " - " + java.time.LocalDateTime.now());
        System.out.println("Mood entry added: " + mood);
    }

    public void editMoodEntry(int index, String newMood) {
        if (index >= 0 && index < moodEntries.size()) {
            moodEntries.set(index, newMood + " - " + java.time.LocalDateTime.now());
            System.out.println("Mood entry updated at index " + index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public ArrayList<String> getMoodEntries() {
        return moodEntries;
    }
}
