import java.util.Observable;

public class Order extends Observable {
    private float cost;
    private boolean readyChips;
    private boolean readyBurger;
    private boolean readyDrink;
    private boolean glutenFree;
    public float getCost() {
        return cost;
    }
    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }
    public boolean isReadyDrink() {
        return readyDrink;
    }
    public boolean isReadyBurger() {
        return readyBurger;
    }
    public boolean isReadyChips() {
        return readyChips;
    }
    public boolean isGlutenFree() {
        return glutenFree;
    }

    public Order() {
        this.readyChips = false;
        this.readyBurger = false;
        this.readyDrink = false;
        this.cost = 0;
    }

    public void makeDrink() {
        this.readyDrink = true;
        this.cost += 2;
        setChanged();
        notifyObservers();
    }
    public void makeBurger() {
        this.readyBurger = true;
        this.cost += 2.5;
        setChanged();
        notifyObservers();
    }
    public void makeChips() {
        this.readyChips = true;
        this.cost += 1.5;
        setChanged();
        notifyObservers();
    }
}
