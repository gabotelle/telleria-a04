package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.io.FileNotFoundException;

public class Solution41 {
    public static void main(String[] args) {
        NameSorter nm = new NameSorter();
        try {
            nm.readFile();
        }
        catch(FileNotFoundException e){
            System.out.println("Input file not found");
        }
        try {
            nm.printSortedNames();
        }
        catch(FileNotFoundException e){
            System.out.println("Output file not found");
        }
    }
}
