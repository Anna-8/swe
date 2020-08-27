import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class OrderTest {
    Order order;
    @BeforeEach
    void setUp() {
        order = new Order();
    }

    @Test
    void makeDrinkTest(){

        assertEquals(order.isReadyDrink(),false);
        assertEquals(order.getCost(),0);
        order.makeDrink();
        assertEquals(order.isReadyDrink(), true);
        assertEquals(order.getCost(), 2);
    }

    @Test
    void makeChipsTest(){
        assertEquals(order.isReadyChips(),false);
        assertEquals(order.getCost(),0);
        order.makeChips();
        assertEquals(order.isReadyChips(), true);
       assertEquals(order.getCost(), 1.5);
    }

    @Test
    void makeBurgerTest(){
        assertEquals(order.isReadyBurger(),false);
        assertEquals(order.getCost(),0);
        order.makeBurger();
        assertEquals(order.isReadyBurger(), true);
        assertEquals(order.getCost(), 2.5);
    }

}


