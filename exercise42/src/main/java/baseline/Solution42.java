package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Telleria
 */

import java.io.FileNotFoundException;

public class Solution42 {

    public static void main(String[] args) {
        NameSorter nm = new NameSorter();
        try {
            nm.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        nm.printEmployees();
    }
}
