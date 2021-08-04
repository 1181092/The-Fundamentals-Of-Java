/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2_wonderwall;

/**
 *
 * @author mruna
 */
public class Hw2_Wonderwall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String song = "Wonderwall";
        String artist = "Oasis";
        int released = 1995;
        String genre = "Rock, Alternative/Indie";
        float duration = 4.18f;
        int age = 2021 - 1995;
        String sAward1 = "MTV Europe Music Award for Best Song";
        int iAward1 = 1996;
        String sAward2 = "Brit Award for Best British Videoclip";
        int iAward2 = 1996;
        String sAward3 = "NME Award for Best Single";
        int iAward3 = 1996;

        System.out.println("My favourite song is " + song.toUpperCase() + " by " + artist + ".");
        System.out.println("It was released in " + released + ", " + age + " years ago.");
        System.out.println("");
        System.out.println("Characteristics: ");
        System.out.println("  > Genre: " + genre);
        System.out.println("  > Duration: " + duration + " minutes");
        System.out.println("  > Awards: ");
        System.out.println("    - " + sAward1 + ", " + iAward1);
        System.out.println("    - " + sAward2 + ", " + iAward2);
        System.out.println("    - " + sAward3 + ", " + iAward3);

    }

}
