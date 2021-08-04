package pkg_hw7;

/**
 *
 * @author https://www.linkedin.com/in/margmelo/
 */
public class Main {

    public static void main(String[] args) {

        Cars a = new Cars("Opel", "Corsa", 1990, 870);
        //We set this car for 56 trips
        for (int i = 0; i < 56; i++) {
            a.drive();
            a.stop();
        }

        Cars b = new Cars("Wolkswagen", "Golf", 2010, 1239);
        //We set this car to 105 trips
        for (int i = 0; i < 105; i++) {
            b.drive();
            b.stop();
        }

        Cars c = new Cars("Renault", "Megane", 2020, 1392);
        // We set this car to 108 trips
        for (int i = 0; i < 108; i++) {
            c.drive();
            c.stop();
        }
        c.repair();

        Planes d = new Planes("Boeing", "747", 2009, 183500);
        // We set this plane to 23 flights
        for (int i = 0; i < 23; i++) {
            d.flying();
            d.landing();
        }

        Planes e = new Planes("Airbus", "A300", 2002, 171700);
        //we fly 103 times. We check plane2 if it can fly
        //if it is not then it is in repair
        for (int i = 0; i < 103; i++) {
            e.flying();
            if (!e.isFlying()) {
                
                break;
            }
            e.landing();
        }

        Vehicle[] list = new Vehicle[5];
        list[0] = a;
        list[1] = b;
        list[2] = c;
        list[3] = d;
        list[4] = e;

        for (int i =0; i< list.length; i++) {
            list[i].Print();
        }

    }

}
