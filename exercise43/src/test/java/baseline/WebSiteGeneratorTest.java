package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebSiteGeneratorTest {

    @Test
    void generateHTML() {
        WebSiteGenerator w1 = new WebSiteGenerator();
        w1.setSiteName("awesomeco");
        w1.setAuthor("Max Power");
        w1.generateWebSite();
        String actual = w1.generateHTML();
        String expected = "./data/website/awesomeco/index.html";

        assertEquals(expected, actual);
    }

    @Test
    void generateJSFolder() {
        WebSiteGenerator w2 = new WebSiteGenerator();
        w2.setSiteName("awesomeco");
        w2.generateWebSite();
        String actual = w2.generateJSFolder();
        String expected = "./data/website/awesomeco/js";

        assertEquals(expected, actual);
    }

    @Test
    void generateCSSFolder() {
        WebSiteGenerator w3 = new WebSiteGenerator();
        w3.setSiteName("awesomeco");
        w3.generateWebSite();
        String actual = w3.generateCSSFolder();
        String expected = "./data/website/awesomeco/css";

        assertEquals(expected, actual);
    }

    @Test
    void generateWebSite() {
        WebSiteGenerator w4 = new WebSiteGenerator();
        w4.setSiteName("awesomeco");

        String actual = w4.generateWebSite();
        String expected = "./data/website/awesomeco";

        assertEquals(expected, actual);
    }
}