package pkg_hw7;

/**
 *
 * @author https://www.linkedin.com/in/margmelo/
 */
public abstract class Vehicle {

    protected String make;
    protected String model;
    protected int year;
    protected double weight;
    protected boolean needsMaintenance;
    protected int tripsSinceMaintenance;

    public Vehicle() {
        needsMaintenance = false;
        tripsSinceMaintenance = 0;
    }

    public Vehicle(String make, String model, int year, double weight) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.weight = weight;
    }

    

    public void Print(){
        System.out.println("  - Make: "+ make);
        System.out.println("  - Model: " + model);
        System.out.println("  - Year: "+ year);
        System.out.println("  - Weight: "+ weight +" kg");
        System.out.println("  - Trips since last maintenance: "+ tripsSinceMaintenance);
        System.out.println("  - Needs Maintenance? "+ needsMaintenance);
    }

}
