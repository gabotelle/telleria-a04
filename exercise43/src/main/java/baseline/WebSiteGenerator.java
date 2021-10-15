package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WebSiteGenerator {

    private final Scanner input = new Scanner(System.in);
    private String siteName;
    private String author;
    private String path;
    private boolean jsFolder;
    private boolean cssFolder;

    public boolean getJSFolder(){
        return jsFolder;
    }

    public boolean getCSSFolder(){
        return cssFolder;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setJSFolder(boolean jsFolder) {
        this.jsFolder = jsFolder;
    }

    public void setCssFolder(boolean cssFolder) {
        this.cssFolder = cssFolder;
    }

    //Prompt "Site Name:"
    //    save into <siteName>
    //Prompt "Author:"
    //    save into <author>
    //Prompt "Do you want a folder for JavaScript?"
    //    save into <JSFolder>
    //Prompt "Do you want a folder for CSS?"
    //    save into <CSSFolder>
    public void readInput() {
        System.out.print("Site Name: ");
        siteName = input.nextLine();
        System.out.print("Author: ");
        author = input.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        jsFolder = input.nextLine().equalsIgnoreCase("y");
        System.out.print("Do you want a folder for CSS? ");
        cssFolder = input.nextLine().equalsIgnoreCase("y");
    }

    //Create website
    public String generateWebSite() {
        path = "./data/website/" + siteName;
        File newFolder = new File(path);
        if (newFolder.mkdirs()) {
            created(path);
        }
        return path;
    }

    //    create index.html
    //        Set title <siteName>
    //        Set meta author <author>
    public String generateHTML() {
        String htmlPath = path + "/index.html";
        String websiteTitleAndAuthor = "<!DOCTYPE html>\n<html>\n<head><title> " + siteName + " </title>\n<meta name=\"author\" content=\"" + author + "\">\n</head>\n</html>";
        File html = new File(htmlPath);
        try {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(html))) {
                writer.write(websiteTitleAndAuthor);
            }
            created(htmlPath);
            return htmlPath;
        } catch (IOException e) {
            return "HTML not created";
        }
    }

    // if JsFolder is true
    //    Create JavaScript folder
    public String generateJSFolder() {
        String jsPath = path + "/js";
        File newFolder = new File(jsPath);
        if (newFolder.mkdirs()) {
            created(jsPath);
            return jsPath;
        }
        return jsPath;
    }

    // if CSSFolder is true
    //     Create CSS folder
    public String generateCSSFolder() {
        String cssPath = path + "/css";
        File newFolder = new File(cssPath);
        if (newFolder.mkdirs()) {
            created(cssPath);
        }
        return cssPath;
    }

    private void created(String filePath){
        System.out.println("Created " + filePath);
    }
}
