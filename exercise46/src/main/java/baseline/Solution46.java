package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.io.FileNotFoundException;

public class Solution46 {
    public static void main(String[] args) {
        WordFrequencyFinder wff = new WordFrequencyFinder();
        try {
            wff.readFile();
            wff.printFrequency();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
