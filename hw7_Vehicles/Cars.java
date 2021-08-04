package pkg_hw7;

/**
 *
 * @author https://www.linkedin.com/in/margmelo/
 */
public class Cars extends Vehicle {

    private boolean isDriving;

    public Cars(String make, String model, int year, double weight) {
        super(make, model, year, weight);
    }

    public void drive() {
        isDriving = true;
    }

    public void stop() {
        isDriving = false;
        tripsSinceMaintenance += 1;
        if (tripsSinceMaintenance == 100) {
            needsMaintenance = true;
        }
    }

    public void repair() {
        tripsSinceMaintenance = 0;
        needsMaintenance = false;
    }

    public boolean isDriving() {
        return isDriving;
    }

    @Override
    public void Print() {
        System.out.println("\nCAR: ");
        super.Print();
    }
}
