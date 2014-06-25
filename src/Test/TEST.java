/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 *
 * @author Mark
 */
public class TEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FeedList file =new FeedList("res/curated.txt");
        URL x;
//        String xStr;
//        xStr = file.getNextUrlStr();
//        System.out.println("x = "+xStr);
        x = file.getNextUrl();
        System.out.println("y = "+x);
    }
    
}

class FeedList {
    
    public BufferedReader bufferReader;
    
    public FeedList(String filePath) throws FileNotFoundException {
//        String test = "res/curated.txt";
        FileReader inputFile = new FileReader(filePath);
//        FileReader inputFile = new FileReader(test);
        this.bufferReader =  new BufferedReader(inputFile);
//            while ((line = bufferReader.readLine()) != null) {
//                System.out.println("line = " + line);                
//            }
    }
    
    //выдовать по одной урл

    public String getNextUrlStr() throws IOException {
        String urlStr;
        urlStr = bufferReader.readLine();
//        String line = null;
//            while ((line = bufferReader.readLine()) != null) {
//                System.out.println("line = " + line);                
//            }
        return urlStr;
    }
    
    public URL getNextUrl() throws IOException{
        URL url;
//        url = new URL(getNextUrlStr());
        url = new URL (bufferReader.readLine());
        return url;
    }
}
