import java.util.Observable;
import java.util.Observer;

public class NotCompleteObserver implements Observer{
    private Order concreteSubject;
    private boolean readyBurger;

    public NotCompleteObserver(){
        this.readyBurger = false;
    }
    public void setSubject(Order concreteSubject) {
        this.concreteSubject = concreteSubject;
    }
    @Override
    public void update(Observable o, Object arg) {
        if (concreteSubject.isReadyBurger()!= this.readyBurger) {
            System.out.println("The burger is ready");
            this.readyBurger = concreteSubject.isReadyBurger();
        }

    }
}
