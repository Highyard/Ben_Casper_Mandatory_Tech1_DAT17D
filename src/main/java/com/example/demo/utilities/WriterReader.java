package com.example.demo.utilities;

import com.example.demo.domains.Child;

import java.io.*;
import java.util.ArrayList;

public class WriterReader {

    public static final String filepath = "/Users/Josef/Desktop/Tom mappe projekt/BørnehaveProjekt1/src/main/resources/templates/backup.txt";


    public boolean writeObjectTooFile (ArrayList<Child> children){

        try {

            //create the writer
            FileOutputStream fileOut = new FileOutputStream(filepath);

            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(children);
            System.out.println("object blev gemt");
            objectOut.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public ArrayList<Child> readObjectFromFile (String filepath){

        try {


            FileInputStream filein = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(filein);

            ArrayList<Child> arrayList = (ArrayList<Child>) objectIn.readObject();

            System.out.println("Objektet er indlæst korrekt fra filen" + arrayList);

            objectIn.close();

            return arrayList;




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;

    }




}


