public abstract class Builder {
    protected Order order;
    public void newOrder() {
        order = new Order();
    }

    abstract void addBurger();
    void addChips() {
        order.makeChips();
    }
    void addDrink() {
        order.makeDrink();
    }

    public Order getOrder() {
        return order;
    }

    public void attachCompleteObs() {
        CompleteObserver completeObserver = new CompleteObserver();
        order.addObserver(completeObserver);
        completeObserver.setSubject(order);
    }

    public void attachNotCompleteObs() {
        NotCompleteObserver notCompleteObserver = new NotCompleteObserver();
        order.addObserver(notCompleteObserver);
        notCompleteObserver.setSubject(order);
    }

}



