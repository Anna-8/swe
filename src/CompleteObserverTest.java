import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompleteObserverTest {
    @Test
    public void testObserver(){
        Order order = new Order();
        CompleteObserver observer = new CompleteObserver();
        order.addObserver(observer);
        observer.setSubject(order);
        order.makeDrink();
        assertEquals(observer.isReadyDrink(), order.isReadyDrink());

    }

}




