package baseline;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordFinder {
    private final ArrayList<String> wordList = new ArrayList<>();

    public List<String> getWordList(){
        return wordList;
    }

    //Read file into <wordList>
    private void readFile()throws FileNotFoundException {
        FileInputStream inputFile = new FileInputStream("./data/exercise45_input.txt");
        Scanner sc = new Scanner(inputFile);
        while(sc.hasNextLine()){
            wordList.add(sc.nextLine());
        }
        sc.close();
    }

    //for every line
    //  replace every instance of "utilize" with "use"
    //Write file with <wordList>
    public void replaceUtilizeWithUse(String output) throws FileNotFoundException {
        readFile();
        FileOutputStream fileOutput = new FileOutputStream("./data/" + output);
        PrintWriter pw = new PrintWriter(fileOutput);
        for (String correctLine : wordList) {
                correctLine = correctLine.replace("utilize", "use");
            pw.println(correctLine);
        }
        pw.close();
    }
}
