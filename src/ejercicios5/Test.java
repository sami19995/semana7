/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios5;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author turupawn
 */
public class Test {
    
    static void deleteIfExists(String filename)
    {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
        } 
    }
        
    public static void main(String[] args) {
       
        deleteIfExists("test1.txt");
        deleteIfExists("test2.txt");
        deleteIfExists("test3.txt");
        deleteIfExists("test4.txt");
        deleteIfExists("test5.txt");
        deleteIfExists("test6.txt");
        deleteIfExists("test7.txt");
        deleteIfExists("test8.txt");
        deleteIfExists("test9.txt");
        deleteIfExists("test10.txt");
        
        Exercises.writeInt("test1.txt", 10);
        Exercises.writeInt("test2.txt", 20);
        Exercises.writeString("test3.txt", "A");
        Exercises.writeString("test4.txt", "B");
        
        try{
            PrintWriter pw = new PrintWriter("test5.txt");
            pw.write("54.2");
            pw.flush();

            PrintWriter pw2 = new PrintWriter("test6.txt");
            pw2.write("15.56");
            pw2.flush();
        }catch(Exception e)
        {

        }
        
        try{
            PrintWriter pw = new PrintWriter("test7.txt");
            pw.write("32 43 1 564 32 1 32 2 432");
            pw.flush();
        }catch(Exception e)
        {

        }
        
        try
        {
            PrintWriter pw = new PrintWriter("test8.txt");
            pw.write("3 5 2 8 7");
            pw.close();

            PrintWriter pw2 = new PrintWriter("test9.txt");
            pw2.write("10 15 20");
            pw2.close();

            PrintWriter pw3 = new PrintWriter("test10.txt");
            pw3.write("22 20 31 11");
            pw3.close();
        }catch(Exception e)
        {

        }
        
        System.out.print("readInt:\t");
        if (Exercises.readInt("test1.txt") == 10 && Exercises.readInt("test2.txt") == 20) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
        System.out.print("readString:\t");
        if (Exercises.readString("test3.txt").equals("A") && Exercises.readString("test4.txt").equals("B")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
        System.out.print("readDouble:\t");
        if (Exercises.readDouble("test5.txt")==54.2 && Exercises.readDouble("test6.txt")==15.56) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
        System.out.print("count:\t\t");
        if (Exercises.count("test7.txt","1")==2
                && Exercises.count("test7.txt","432")==1
                && Exercises.count("test7.txt","32")==3
                && Exercises.count("test7.txt","33")==0
                ) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
        System.out.print("getAverage:\t");
        if (Exercises.getAverage("test8.txt")==5
                && Exercises.getAverage("test9.txt")==15
                && Exercises.getAverage("test10.txt")==21
                ) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
