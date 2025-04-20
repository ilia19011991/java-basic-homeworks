package ru.otus.java.basic.homeworks.homework12;

public class Plate {
    private int maxAmount;
    private int currentAmount;

    public Plate(int maxAmount) {
        this.maxAmount = maxAmount;
        this.currentAmount = maxAmount;
    }

    public void addFood(int amount) {
        if ((currentAmount + amount) > maxAmount) {
            currentAmount = maxAmount;
        }
        else {
            currentAmount += amount;
        }
    }

    public boolean consume(int amount) {
        if (currentAmount >= amount) {
            currentAmount -= amount;
            return true;
        } else {
            return false;
        }
    }
}
