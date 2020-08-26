public class NotCompleteOrder implements Strategy{

    @Override
    public Order construct(Builder builder) {
        builder.newOrder();
        builder.attachNotCompleteObs();
        builder.addBurger();

        return builder.getOrder();
    }
}
