class GlutenFreeBuilder extends Builder{

    @Override
    void addBurger() {
        order.setGlutenFree(true);
        order.makeBurger();

    }
}







