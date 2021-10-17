package baseline;

import com.google.gson.JsonElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductSearchTest {

    @Test
    void readFile() {
        ProductSearch ps = new ProductSearch();
        ps.readFile();

        String expected = "Thing";
        JsonElement products = ps.getProducts().get(1);
        String actual = products.getAsJsonObject().get("name").getAsString();

        assertEquals(expected, actual);
    }

    @Test
    void isInside() {
        ProductSearch ps = new ProductSearch();
        ps.readFile();

        boolean actual = ps.isInside("Thing");

        assertTrue(actual);
    }
    @Test
    void isNotInside() {
        ProductSearch ps = new ProductSearch();
        ps.readFile();

        boolean actual = ps.isInside("Car");

        assertFalse(actual);
    }
}