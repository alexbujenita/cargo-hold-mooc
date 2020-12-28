
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
public class Suitcase {

    private final ArrayList<Item> items;
    private final int maxWeigth;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeigth = maxWeight;
    }

    public void addItem(Item item) {
        if (this.getTotalWeight() + item.getWeight() <= this.maxWeigth) {
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        return Collections.max(this.items, Comparator.comparingInt(Item::getWeight));
    }

    @Override
    public String toString() {
        int listSize = this.items.size();
        if (listSize == 0) {
            return "no items (0 kg)";
        }
        String itemsOrItem = listSize == 1 ? "item" : "items";
        return "" + this.items.size() + " " + itemsOrItem + " (" + this.getTotalWeight() + " kg)";
    }

    private int getTotalWeight() {
        if (items.isEmpty()) {
            return 0;
        }
        int weightSum = items.stream().mapToInt(item -> item.getWeight()).sum();
        return weightSum;
    }

    // BELOW FOR TEST
    public int totalWeight() {
        return this.getTotalWeight();
    }
}
