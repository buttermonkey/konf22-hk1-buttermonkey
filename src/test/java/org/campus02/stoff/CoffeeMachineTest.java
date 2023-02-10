package org.campus02.stoff;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {

    CoffeeMachine coffeeMachine;

    @BeforeEach
    void setup() {
        coffeeMachine = new CoffeeMachine(200, 300);
    }

    /**
     * create a coffeemachine and verify the initial values
     */
    @Test
    void testConstructor() {
        assertEquals(200, coffeeMachine.getMaxWaterLevel());
        assertEquals(300, coffeeMachine.getMaxCoffeeBeansLevel());
        assertEquals(0, coffeeMachine.getCurrentWaterLevel());
        assertEquals(0, coffeeMachine.getCurrentCoffeeBeansLevel());
    }

    /**
     * verify currentValues
     */
    @Test
    void fill() {
        coffeeMachine.fill();
        assertEquals(200, coffeeMachine.getCurrentWaterLevel());
        assertEquals(300, coffeeMachine.getCurrentCoffeeBeansLevel());
    }

    /**
     * Verify current values
     */
    @Test
    void clean() {
        coffeeMachine.fill();
        coffeeMachine.clean();
        assertEquals(0, coffeeMachine.getCurrentWaterLevel());
        assertEquals(0, coffeeMachine.getCurrentCoffeeBeansLevel());
    }

    /**
     * test result if one or more levels are lower than minimum level
     */
    @Test
    void checkMinimumLevelBeforeFill() {
        assertFalse(coffeeMachine.checkMinimumLevel());
    }

    /**
     * check current values beyond limits
     */
    @Test
    void checkMinimumLevelAfterFill() {
        coffeeMachine.fill();
        assertTrue(coffeeMachine.checkMinimumLevel());
    }

    /**
     * Verify return message,
     * currentWaterLevel and currentCoffeeBeansLevel
     * (don't forget to fill the machine)
     */
    @Test
    void brewSuccessAmericano() {
        coffeeMachine.fill();
        assertEquals("americano brewed", coffeeMachine.brew("americano"));
        assertEquals(100, coffeeMachine.getCurrentWaterLevel());
        assertEquals(270, coffeeMachine.getCurrentCoffeeBeansLevel());
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