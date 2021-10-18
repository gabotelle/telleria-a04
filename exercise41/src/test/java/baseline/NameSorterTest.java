package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

    @Test
    void readFile() {
        NameSorter nm = new NameSorter();
        try {
            nm.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> actual = (ArrayList<String>)nm.getNames();
        ArrayList<String> expected = new ArrayList<>();

        expected.add("Ling, Mai");
        expected.add("Johnson, Jim");
        expected.add("Zarnecki, Sabrina");
        expected.add("Jones, Chris");
        expected.add("Jones, Aaron");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");

        assertEquals(actual, expected);

    }

    @Test
    void printSortedNames() {
        NameSorter nm = new NameSorter();
        try {
            nm.readFile();
            nm.printSortedNames();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> actual = (ArrayList<String>) nm.getNames();
        ArrayList<String> expected = new ArrayList<>();

        expected.add("Johnson, Jim");
        expected.add("Jones, Aaron");
        expected.add("Jones, Chris");
        expected.add("Ling, Mai");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");
        expected.add("Zarnecki, Sabrina");

        assertEquals(actual, expected);
    }
}