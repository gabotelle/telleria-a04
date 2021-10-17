package baseline;

import com.google.gson.*;


import java.io.*;
import java.util.Scanner;


public class ProductSearch {
    private final Scanner input = new Scanner(System.in);
    private JsonArray products;


    //Read the json file
    //save into <products>
    public void readFile(){
            try {
                JsonObject json = (JsonObject)JsonParser.parseReader(new FileReader("./data/exercise44_input.json"));

                products =  (JsonArray)json.get("products");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }


    //Prompt user for name of product
    //save into <productName>
    public String getUserInput(){
        System.out.print("What is the product name? ");
        return input.nextLine();
    }

    //if <productName> inside <products>
    //  Print product info
    //else
    //    Prompt again
    public void searchProduct(){
        readFile();
        while(true){
            String searchProduct = getUserInput();
            if(isInside(searchProduct)){
                return;
            }
        }
    }
    public boolean isInside(String searchProduct){
        for (JsonElement product: products){
            if(product.getAsJsonObject().get("name").getAsString().equals(searchProduct)){
                Product p = new Product(product.getAsJsonObject().get("name").getAsString(),
                        product.getAsJsonObject().get("price").getAsDouble(),
                        product.getAsJsonObject().get("quantity").getAsInt());
                p.printProduct();
                return true;
            }
        }
        System.out.println("Sorry, that product was not found in our inventory.");
        return false;
    }
    public JsonArray getProducts() {
        return products;
    }
}
