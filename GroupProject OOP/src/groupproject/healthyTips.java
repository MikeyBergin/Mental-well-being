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

public class healthyTips {
    private ArrayList<String> tips = new ArrayList<>();

    public ArrayList<String> fetchHealthTips() {
        return tips;
    }

    public void addHealthTips(String description) {
        tips.add(description);
    }
}
