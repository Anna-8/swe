public class main {
    public static void main(String[] args){
        Builder builder = new GlutenFreeBuilder();
        Director director = new Director(builder, new CompleteOrder());
        Order order = director.construct();
        System.out.print("\nCost:"+order.getCost());

        Director director2 = new Director(builder, new NotCompleteOrder());
        Order order2 = director2.construct();
        System.out.print("\nCost:"+ order2.getCost());

    }
}
