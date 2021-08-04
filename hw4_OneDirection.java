/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author mruna
 */
public class hw4_OneDirection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String songName = "The Story of my Life";

        String bandName = "One Direction";

        String[] bandMembers = {
            "Harry", "Styles",
            "Niall", "Horan",
            "Liam", "Paine",
            "Louis", "Tomlinson",
            "Zayn", "Malik"};

        String[] firstNames = new String[bandMembers.length / 2];
        String[] lastNames = new String[bandMembers.length / 2];

        for (int i = 0; i < bandMembers.length; i++) {
            if (i % 2 == 0) {
                firstNames[i / 2] = bandMembers[i];
            } else {
                lastNames[i / 2] = bandMembers[i];
            }
        }

        Map<String, String> OneDirection = new HashMap<>();

        for (int i = 0; i < firstNames.length; i++) {
            OneDirection.put(firstNames[i], lastNames[i]);
        }

        System.out.println("Song: " + songName + " by " + bandName);
        System.out.println("Band Members: " + OneDirection);

        ArrayList<String> awardName = new ArrayList();
        ArrayList<String> awardYear = new ArrayList();

        awardName.add("Nickelodeon Kid's Choice Award: Favourite Song");
        awardName.add("Teen Choice Award: Best Group Single");
        awardName.add("Teen Choice Award: Best Breakup Song");

        awardYear.add("2014");
        awardYear.add("2014");
        awardYear.add("2014");


        String[][] totalAwards = new String[awardName.size()][awardYear.size()+1];

        totalAwards[0][0] = awardName.get(0);
        totalAwards[1][0] = awardName.get(1);
        totalAwards[2][0] = awardName.get(2);
        totalAwards[0][1] = awardYear.get(0);
        totalAwards[1][1] = awardYear.get(1);
        totalAwards[2][1] = awardYear.get(2);
                
        
        System.out.println("Total number of awards: " + awardName.size());
        for (int i = 0; i < awardName.size(); i++) {
            for (int j = 0; j < awardYear.size(); j++) {
                System.out.println("  - " + totalAwards[i][j]);
                //System.out.println(awardName.size());
            }

        }

    }

}
