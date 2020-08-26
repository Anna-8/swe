public class Director {
    private Builder builder;
    private Strategy strategy;

    public Director(Builder builder, Strategy strategy){
        this.builder= builder;
        this.strategy = strategy;

    }
    public  Order construct(){
            return strategy.construct(builder);
        }
}



