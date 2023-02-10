package org.campus02;

public class CoffeeMachine {

    private final int maxWaterLevel;
    private final int maxCoffeeBeansLevel;
    private int currentWaterLevel;
    private int currentCoffeeBeansLevel;

    public CoffeeMachine(int maxWaterLevel, int maxCoffeeBeansLevel) {
        this.maxWaterLevel = maxWaterLevel;
        this.maxCoffeeBeansLevel = maxCoffeeBeansLevel;
        this.currentWaterLevel = 0;
        this.currentCoffeeBeansLevel = 0;
    }

    public int getMaxWaterLevel() {
        return maxWaterLevel;
    }

    public int getMaxCoffeeBeansLevel() {
        return maxCoffeeBeansLevel;
    }

    public int getCurrentWaterLevel() {
        return currentWaterLevel;
    }

    public int getCurrentCoffeeBeansLevel() {
        return currentCoffeeBeansLevel;
    }

    /**
     * Empties current water {@link CoffeeMachine#currentWaterLevel}
     * and coffee beans {@link CoffeeMachine#currentCoffeeBeansLevel}
     * both values are set to 0
     */
    public void clean() {
        currentWaterLevel = 0;
        currentCoffeeBeansLevel = 0;
    }

    /**
     * fills water and beans to the max level of each attribute
     * currentWaterLevel to maxWaterLevel
     * currentCoffeeBeansLevel to maxCoffeeBeansLevel
     *
     */
    public void fill() {
        currentWaterLevel = maxWaterLevel;
        currentCoffeeBeansLevel = maxCoffeeBeansLevel;
    }

    /**
     * if currentWaterLevel < 100 mililiters
     * or currentCoffeeBeansLevel < 50 gram
     * => checkLevel return false
     *
     * @return false in case of too low level, either water or coffe beans
     */
    public boolean checkMinimumLevel() {
        if (currentWaterLevel < 100 || currentCoffeeBeansLevel < 50) {
            return false;
        }
        return true;
    }

    /**
     * coffee will be prepared based on desired type (coffee)
     *
     * @param coffee desired type of coffee
     * @return message
     */
    public String brew(String coffee) {
        if (!checkMinimumLevel()) {
            return "Please fill coffeemachine";
        }

        switch(coffee) {
            case "espresso":
                currentWaterLevel -= 50;
                currentCoffeeBeansLevel -= 20;
                break;
            case "americano":
                currentWaterLevel -= 100;
                currentCoffeeBeansLevel -= 30;
                break;
            case "espresso doppo":
                currentWaterLevel -= 100;
                currentCoffeeBeansLevel -= 50;
                break;
            default:
                return "Coffee not offered";
        }
        return coffee + " brewed";
    }
}
