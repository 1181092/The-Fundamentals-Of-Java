package pkg_FizzBuzz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mruna
 */
public class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("FizzBuzz");
            } else if ((i % 3) == 0) {

                System.out.println("Fizz");
            } else if ((i % 5) == 0) {
                System.out.println("Buzz");
            } else if (isPrime(i) == true) {
                System.out.println("Prime");
            } else {
                System.out.println(i);
            }
        }

    }

    public static boolean isPrime(int i) {
        if (i == 1) {
            return false;
        }
        for (int j = 2; j < i; j++) {
            if ((i % j) == 0) {
                return false;
            }
        }
        return true;
    }

}
