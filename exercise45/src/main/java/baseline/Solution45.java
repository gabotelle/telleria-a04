package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution45 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        WordFinder wf = new WordFinder();

        try {
            System.out.print("Name of output file: ");
            wf.replaceUtilizeWithUse(input.nextLine());
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
