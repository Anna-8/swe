public class CompleteOrder implements Strategy{
    @Override
    public Order construct(Builder builder) {
        builder.newOrder();
        builder.attachCompleteObs();
        builder.addBurger();
        builder.addChips();
        builder.addDrink();
        return builder.getOrder();
    }
}





