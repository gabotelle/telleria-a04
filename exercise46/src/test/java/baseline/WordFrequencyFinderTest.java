package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyFinderTest {

    @Test
    void readFile() {
        WordFrequencyFinder wff = new WordFrequencyFinder();
        try {
            wff.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assertEquals(3, wff.getWords().size());
    }

    @Test
    void printFrequency() {
        WordFrequencyFinder wff = new WordFrequencyFinder();
        try {
            wff.readFile();
            wff.printFrequency();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assertEquals(0, wff.getWords().size());
    }
}