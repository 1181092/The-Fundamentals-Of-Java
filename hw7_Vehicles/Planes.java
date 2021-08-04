package pkg_hw7;

/**
 *
 * @author https://www.linkedin.com/in/margmelo/
 */
public class Planes extends Vehicle {

    private boolean isFlying;

    public Planes() {
        isFlying = false;
    }

    public Planes(String make, String model, int year, double weight) {
        super(make, model, year, weight);
    }

    public void flying() {
        if (needsMaintenance == false) {
            isFlying = true;
        }
    }

    public void landing() {
        isFlying = false;
        tripsSinceMaintenance += 1;
        if (tripsSinceMaintenance == 100) {
            needsMaintenance = true;
        }
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void repais() {
        tripsSinceMaintenance = 0;
        needsMaintenance = false;
    }

    @Override
    public void Print() {
        System.out.println("\nPLANE: ");
        super.Print();
        if (needsMaintenance == true) {
            System.out.println("The plane can't fly until it's repaired");
        }
    }
}
