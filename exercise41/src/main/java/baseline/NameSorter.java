package baseline;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameSorter {
    private ArrayList<String> names = new ArrayList<>();

    public ArrayList<String> getNames(){
        return names;
    }

//Read in the text file
//    Save the name into <names>
    public void readFile() throws FileNotFoundException {
        FileInputStream fileInput = new FileInputStream("./data/exercise41_input.txt");
        Scanner sc = new Scanner(fileInput);
        while(sc.hasNextLine()){
            names.add(sc.nextLine());
        }
        sc.close();
    }

//Sort names
//Print "Total of <countNames> names"
//Print "--------------------------"
//for each name
//    Print <names[i]>
    public void printSortedNames() throws FileNotFoundException {
        Collections.sort(names);
        FileOutputStream fileOutput = new FileOutputStream("./data/exercise41_output.txt");
        PrintWriter pw = new PrintWriter(fileOutput);
        pw.printf("Total of %d names%n----------------------%n", names.size());
        for (String name: names) {
            pw.printf("%s%n", name);
        }
        pw.close();
    }
}