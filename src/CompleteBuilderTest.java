import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompleteBuilderTest {

    Builder builder = new GlutenFreeBuilder();
    Director director = new Director(builder, new CompleteOrder());
    Order order = director.construct();
    @Test
    void constructTest(){
        assertEquals(order.isReadyBurger(),true);
        assertEquals(order.isReadyChips(),true);
        assertEquals(order.isReadyDrink(),true);
        assertEquals(order.getCost(), 6);
        assertEquals(order.isGlutenFree(), true);
    }

}


