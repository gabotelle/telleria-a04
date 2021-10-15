package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Telleria
 */

public class Solution43 {

    public static void main(String[] args) {
        WebSiteGenerator wg = new WebSiteGenerator();
        wg.readInput();
        wg.generateWebSite();
        wg.generateHTML();
        if(wg.getJSFolder()){
            wg.generateJSFolder();
        }
        if(wg.getCSSFolder()){
            wg.generateCSSFolder();
        }
    }
}
