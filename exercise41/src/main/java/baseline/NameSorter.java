package baseline;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class NameSorter {
    private ArrayList<String> names;

    public void readFile() throws FileNotFoundException {
        FileInputStream fileInput = new FileInputStream("exercise41_input.txt");
        Scanner sc = new Scanner(fileInput);
        while(sc.hasNextLine()){
            names.add(sc.nextLine());
        }
        sc.close();
    }

    public void printSortedNames() throws FileNotFoundException {
        FileOutputStream fileOutput = new FileOutputStream("exercise41_output.txt");
        PrintWriter pw = new PrintWriter(fileOutput);
        pw.printf("Total of %d names", names.size());
        for (String name: names) {
            pw.printf("%s%n", name);
        }
        pw.close();
    }
}