import java.util.Observable;
import java.util.Observer;

public class CompleteObserver implements Observer {
    private Order concreteSubject;
    private boolean readyChips;
    private boolean readyBurger;

    public void setReadyChips(boolean readyChips) {
        this.readyChips = readyChips;
    }
    public boolean isReadyChips() {
        return readyChips;
    }
    public boolean isReadyBurger() {
        return readyBurger;
    }
    public boolean isReadyDrink() {
        return readyDrink;
    }
    private boolean readyDrink;

    public CompleteObserver(){
        this.readyChips = false;
        this.readyBurger = false;
        this.readyDrink = false;

    }
    public void setSubject(Order concreteSubject) {
        this.concreteSubject = concreteSubject;
    }


    @Override
    public void update(Observable o, Object arg) {
        if (concreteSubject.isReadyBurger()!= this.readyBurger) {
            this.readyBurger = concreteSubject.isReadyBurger();
            System.out.print("\nThe burger is ready");

        }
        if (concreteSubject.isReadyChips()!= this.readyChips){
            this.readyChips = concreteSubject.isReadyChips();
            System.out.println("\nThe chips are ready");
        }
        if (concreteSubject.isReadyDrink()!= this.readyDrink){
            this.readyDrink = concreteSubject.isReadyDrink();
            System.out.println("\nThe drink is ready");
        }
    }
}



