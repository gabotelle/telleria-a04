package baseline;

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
