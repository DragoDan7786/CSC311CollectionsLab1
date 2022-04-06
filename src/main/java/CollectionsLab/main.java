/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soblab
 */
public class main {

    public static void printItems(List<String> theList) {
        for(String items : theList){
            System.out.println(items);
        }
    }
    
    public static void printIterator(List<String> theList){
        Iterator<String> theIter;
        theIter = theList.iterator();
        
        while(theIter.hasNext()){
            System.out.println(theIter.next());
        }
        
    }
    
    
    public static void main(String[] args) {

        try {
            File theFile = new File("C:\\Users\\soblab\\Documents\\NetBeansProjects\\CSC311GenericsLab\\input");
            Scanner theScan = new Scanner(theFile);
            List<String> myList = new ArrayList<>();
            //Added all items in file into the ArrayList
            while (theScan.hasNext()) {
                myList.add(theScan.nextLine());
            }
            //print items individually
            printItems(myList);
            //print items with iterator
            printIterator(myList);
            //print items sequentially
            System.out.println(myList);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
