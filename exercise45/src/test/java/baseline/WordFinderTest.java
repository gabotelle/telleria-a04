package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {

    @Test
    void replaceUtilizeWithUse() {
        WordFinder wf = new WordFinder();

        try {
            wf.replaceUtilizeWithUse("exercise45_output.txt");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

        assertFalse(wf.getWordList().contains("utilize") && wf.getWordList().size() > 0);
    }

}