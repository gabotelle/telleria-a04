package baseline;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyFinder {
    private final HashMap<String, Integer> words= new HashMap<>();

    public HashMap<String, Integer> getWords(){
        return words;
    }

    //    Read the file
    //        if <input> is not in <words>
    //            add <input> to words with value 1
    //        else
    //            add 1 to the value of <input> in <words>
    public void readFile() throws FileNotFoundException {
        FileInputStream fileInput = new FileInputStream("./data/exercise46_input.txt");
        Scanner sc = new Scanner(fileInput);
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(" ");
            for (String word: line) {
                if(words.containsKey(word)){
                    int frequency = words.get(word) + 1;
                    words.replace(word, frequency);
                }
                else{
                    words.put(word, 1);
                }
            }
        }
        sc.close();
    }

    //    Print frequency
    //        until <words> is empty
    //            find most frequent
    //                print "<word>"
    //            remove <word>
    public void printFrequency() {
        while(!words.isEmpty()){
            Map.Entry<String, Integer> mostFrequent = null;
            for (Map.Entry<String, Integer> word : words.entrySet())
            {
                if (mostFrequent == null || word.getValue().compareTo(mostFrequent.getValue()) > 0)
                {
                    mostFrequent = word;
                }
            }
            printWord(mostFrequent);
            words.remove(mostFrequent.getKey());
        }
    }

//    print "<word>"
//        for <word> value
//           print "*"
    private void printWord(Map.Entry<String, Integer> word) {
        System.out.printf("%s ", word.getKey());
        for(int i = 0; i < word.getValue(); i++){
            System.out.print("*");
        }
        System.out.println();

    }
}
