public class NotGlutenFreeBuilder extends Builder {

    @Override
    void addBurger() {
        order.setGlutenFree(false);
        order.makeBurger();

    }
}
