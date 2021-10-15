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
        ArrayList<Employee> actual = nm.getEmployees();
        ArrayList<Employee> expected = new ArrayList<>();

        expected.add(new Employee("Mai","Ling", "55900"));
        expected.add(new Employee("Jim","Johnson", "56500"));
        expected.add(new Employee("Aaron","Jones", "46000"));
        expected.add(new Employee("Chris","Jones", "34500"));
        expected.add(new Employee("Geoffrey","Swift", "14200"));
        expected.add(new Employee("Fong","Xiong", "65000"));
        expected.add(new Employee("Sabrina","Zarnecki", "51500"));

        assertEquals(actual, expected);
    }

}