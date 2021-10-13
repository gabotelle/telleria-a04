package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

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
    }

    @Test
    void printSortedNames() {
    }
}