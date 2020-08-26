import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotCompleteBuilderTest {

    Builder builder = new NotGlutenFreeBuilder();
    Director director = new Director(builder, new NotCompleteOrder());
    Order order = director.construct();
    @Test
    void constructTest(){
        assertEquals(order.isReadyBurger(),true);
        assertEquals(order.getCost(), 2.5);
        assertEquals(order.isGlutenFree(), false);
    }

}



