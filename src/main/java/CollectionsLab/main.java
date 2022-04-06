/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
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

    public static void printItems(Collection<String> theCollection) {
        for (String items : theCollection) {
            System.out.println(items);
        }
    }

    public static void printIterator(Collection<String> theCollection) {
        Iterator<String> theIter;
        theIter = theCollection.iterator();

        while (theIter.hasNext()) {
            System.out.println(theIter.next());
        }
    }

    public static void removeIterator(Collection<String> theCollection, String target) {
        Iterator<String> theIter;
        theIter = theCollection.iterator();
        while(theIter.hasNext()){
            String current = theIter.next();
            if(current.equals(target)){
                theIter.remove();
            }
        }
        System.out.println("Item not found");

    }

    public static void main(String[] args) {

        try {
            File theFile = new File("C:\\Users\\soblab\\Documents\\NetBeansProjects\\CSC311GenericsLab\\input");
            Scanner theScan = new Scanner(theFile);
            Collection<String> myCollection = new ArrayList<>();
            //Added all items in file into the ArrayList
            while (theScan.hasNext()) {
                myCollection.add(theScan.nextLine());
            }
            //print items individually
            printItems(myCollection);
            //print items with iterator
            System.out.println("");
            printIterator(myCollection);
            //print items sequentially
            System.out.println("");
            System.out.println(myCollection);
            //remove via iterator method
            System.out.println("\nRemoving Asad");
            removeIterator(myCollection , "Asad");
            printIterator(myCollection);
            System.out.println("\nRemoving Mateo");
            removeIterator(myCollection , "Mateo");
            printIterator(myCollection);
            System.out.println("\nRemoving Gabriela");
            removeIterator(myCollection , "Gabriela");
            printIterator(myCollection);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
