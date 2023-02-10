package org.campus02.stoff;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {



    /**
     * create a coffeemachine and verify the initial values
     */
    @Test
    void testConstructor() {
        CoffeeMachine cm = new CoffeeMachine(200, 300);
        assertEquals(200, cm.getMaxWaterLevel());
        assertEquals(300, cm.getMaxCoffeeBeansLevel());
        assertEquals(0, cm.getCurrentWaterLevel());
        assertEquals(0, cm.getCurrentCoffeeBeansLevel());
    }

    /**
     * verify currentValues
     */
    @Test
    void fill() {
        CoffeeMachine cm = new CoffeeMachine(200, 300);
        cm.fill();
        assertEquals(200, cm.getCurrentWaterLevel());
        assertEquals(300, cm.getCurrentCoffeeBeansLevel());
    }

    /**
     * Verify current values
     */
    @Test
    void clean() {
        CoffeeMachine cm = new CoffeeMachine(200, 300);
        cm.fill();
        cm.clean();
        assertEquals(0, cm.getCurrentWaterLevel());
        assertEquals(0, cm.getCurrentCoffeeBeansLevel());
    }

    /**
     * test result if one or more levels are lower than minimum level
     */
    @Test
    void checkMinimumLevelBeforeFill() {
    }

    /**
     * check current values beyond limits
     */
    @Test
    void checkMinimumLevelAfterFill() {
    }

    /**
     * Verify return message,
     * currentWaterLevel and currentCoffeeBeansLevel
     * (don't forget to fill the machine)
     */
    @Test
    void brewSuccessAmericano() {
    }

    /**
     * order a coffee type "melange"
     * Verify return message
     * (don't forget to fill the machine)
     */
    @Test
    void brewMelange() {

    }

    /**
     * brew 3 times espresso doppo
     * used coffeemachine should only have a maxWaterLevel of 250
     * (don't forget to fill the machine)
     */
    void brew3EspressoDoppoWithMaxWaterLevel250() {

    }
}