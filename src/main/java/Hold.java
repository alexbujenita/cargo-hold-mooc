
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alex.bujenita
 */
public class Hold {

    private final int maxHoldWeight;
    private int currentWeight;
    private final ArrayList<Suitcase> suitcases;

    public Hold(int maxHoldWeight) {
        this.maxHoldWeight = maxHoldWeight;
        this.currentWeight = 0;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int suitcaseWeight = suitcase.totalWeight();
        if (this.currentWeight + suitcaseWeight <= this.maxHoldWeight) {
            this.suitcases.add(suitcase);
            this.currentWeight += suitcaseWeight;
        }
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        return "" + this.suitcases.size() + " suitcases (" + this.currentWeight + " kg)";
    }

}
