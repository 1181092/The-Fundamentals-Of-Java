
import java.util.*;

/**
 *
 * @author https://www.linkedin.com/in/margmelo/
 */
public final class Elevator {

    /**
     * List of all the floors of the building
     */
    private static int[] floors = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    /**
     * Floor where the elavator is
     */
    private int from;

    /**
     * Floor where the elevator is going
     */
    private int to;

    /**
     * Elevtor Constructor
     *
     * @param floor The current floor where the passenger is
     *
     * Then calls the Method callElevator
     */
    public Elevator(int floor) {
        this.from = floor;
        callElevator();
    }

    /**
     * This method allows the elevator to be called
     */
    public void callElevator() {
        if (from != floors[11] && from != floors[0]) {
            /**
             * If the user is neither the penthouse or the basement it asks him
             * if he wants to go up ou down
             */
            System.out.println("UP or DOWN?");
            Scanner input = new Scanner(System.in);
            String upOrDown = input.next();
            /**
             * Transformes whatever input the user gives into a uppercase so
             * that there are no errors
             */
            upOrDown = upOrDown.toUpperCase();

            /**
             * The user input (button click) will determine the options the user
             * has
             */
            switch (upOrDown) {
                /**
                 * UP BUTTON The user will be able to choose any floor above him
                 */
                case "UP":
                    up();
                    break;
                /**
                 * DOWN BUTTON The user will be able to choose any floor under
                 * him
                 */
                case "DOWN":
                    down();
                    break;
                /**
                 * DEFAULT SETTING in a real life elevator with real buttons the
                 * user would not have any other option than the ones given, but
                 * as an input the user can choose anything, even if it is
                 * invalid. This prevents the program from crashing and allows
                 * the user to choose again,
                 */
                default:
                    System.out.println("Invalid input, type UP or DOWN");
                    upOrDown = input.next();
                    upOrDown.toUpperCase();
                    callElevator();
                    break;
            }

        } /**
         * If the user is on the penthouse, there will appear every floor button
         * options under his
         */
        else if (from == floors[11]) {
            down();
        } /**
         * If the user is on the basement, there will appear every floor button
         * options above his
         */
        else {
            up();
        }
    }

    /**
     * Moves the elevator up
     */
    public void up() {
        int floor = 10 - from;
        int[] floorButtons = new int[floor];
        // loop stores floor numbers in floorButtons array
        for (int i = 0; i < floor; i++) {
            floorButtons[i] = ++from;
        }
        System.out.println("Pick a floor number destination. ");
        //loop allows user to pick which floor to go to
        for (int i = 0; i < floor; i++) {
            System.out.print(floorButtons[i] + ", ");
        }
        System.out.println("");
        openDoor();
    }

    /**
     * Moves the elevator down
     */
    public void down() {
        int floor = from + 1;
        int[] floorButtons = new int[floor];
        // loop stores floor numbers in floorButtons array
        for (int i = 0; i < floor; i++) {
            floorButtons[i] = --from;
        }

        System.out.println("Pick floor number destination.");
        //loop allows user to pick which floor to go to
        for (int i = 0; i < floor; i++) {
            System.out.print(floorButtons[i] + ", ");
        }
        System.out.println("");
        openDoor();
    }

    /**
     * Opens door and prints the destination floor
     */
    public void openDoor() {
        System.out.println("Door Openned");
        Scanner input = new Scanner(System.in);
        to = input.nextInt();
        closeDoor();
    }

    /**
     * closes door
     */
    public void closeDoor() {
        System.out.println("Door Closed");
    }

    public void emergency() {

    }

    public void reset() {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input floor #");
        int floorNumber = input.nextInt();
        System.out.println("floor #" + floorNumber);
        Elevator a = new Elevator(floorNumber);
    }

}
